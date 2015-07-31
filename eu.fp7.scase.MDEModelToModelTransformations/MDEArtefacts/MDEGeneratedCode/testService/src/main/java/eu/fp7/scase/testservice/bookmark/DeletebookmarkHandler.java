/*
 * ARISTOSTLE UNIVERSITY OF THESSALONIKI
 * Copyright (C) 2015
 * Aristotle University of Thessaloniki
 * Department of Electrical & Computer Engineering
 * Division of Electronics & Computer Engineering
 * Intelligent Systems & Software Engineering Lab
 *
 * Project             : testService
 * WorkFile            : 
 * Compiler            : 
 * File Description    : 
 * Document Description: 
* Related Documents	   : 
* Note				   : 
* Programmer		   : RESTful MDE Engine created by Christoforos Zolotas
* Contact			   : christopherzolotas@issel.ee.auth.gr
*/


package eu.fp7.scase.testservice.bookmark;


import javax.ws.rs.core.UriInfo;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;
import com.sun.jersey.core.util.Base64;
import eu.fp7.scase.testservice.account.JavaaccountModel;

import eu.fp7.scase.testservice.utilities.HypermediaLink;
import eu.fp7.scase.testservice.utilities.HibernateController;

/* This class processes DELETE requests for bookmark resources and creates the hypermedia to be returned to the client*/
public class DeletebookmarkHandler{


    private HibernateController oHibernateController;
    private UriInfo oApplicationUri; //Standard datatype that holds information on the URI info of this request
    private JavabookmarkModel oJavabookmarkModel;
	private String authHeader;
	private JavaaccountModel oAuthenticationAccount;

    public DeletebookmarkHandler(String authHeader, int bookmarkId, UriInfo oApplicationUri){
        oJavabookmarkModel = new JavabookmarkModel();
        oJavabookmarkModel.setbookmarkId(bookmarkId);
        this.oHibernateController = HibernateController.getHibernateControllerHandle();
        this.oApplicationUri = oApplicationUri;
		this.authHeader = authHeader;
		this.oAuthenticationAccount = new JavaaccountModel(); 
    }

    public JavabookmarkModel deleteJavabookmarkModel(){

    	//check if there is a non null authentication header
    	if(authHeader == null){
    		throw new WebApplicationException(Response.Status.FORBIDDEN);
    	}
		else{
	    	//decode the auth header
    		decodeAuthorizationHeader();

        	//authenticate the user against the database
        	oAuthenticationAccount = oHibernateController.authenticateUser(oAuthenticationAccount);

			//check if the authentication failed
			if(oAuthenticationAccount == null){
        		throw new WebApplicationException(Response.Status.UNAUTHORIZED);
        	}
		}
        return createHypermedia(oHibernateController.deletebookmark(oJavabookmarkModel));
    }

	/* This function performs the decoding of the authentication header */
    public void decodeAuthorizationHeader()
    {
    	//check if this request has basic authentication
    	if( !authHeader.contains("Basic "))
    	{
    		throw new WebApplicationException(Response.Status.BAD_REQUEST);
    	}
    	
        authHeader = authHeader.substring("Basic ".length());
        String[] decodedHeader;
        decodedHeader = Base64.base64Decode(authHeader).split(":");
        
        if( decodedHeader == null)
        {
        	throw new WebApplicationException(Response.Status.BAD_REQUEST);
        }
        
        oAuthenticationAccount.setusername(decodedHeader[0]);
        oAuthenticationAccount.setpassword(decodedHeader[1]);
    }

    /* This function produces hypermedia links to be sent to the client so as it will be able to forward the application state in a valid way.*/
    public JavabookmarkModel createHypermedia(JavabookmarkModel oJavabookmarkModel){

 	   /* Since both this resource and the related of it are deleted, there are created hypermedia links only towards the resources of which this one is related.*/
    	int iLastSlashIndex = String.format("%s%s", oApplicationUri.getBaseUri(), oApplicationUri.getPath()).lastIndexOf("/");
	    oJavabookmarkModel.getlinklist().add(new HypermediaLink(String.format("%s%s", oApplicationUri.getBaseUri(), oApplicationUri.getPath()).substring(0, iLastSlashIndex), "Create a new bookmark", "POST", "Parent"));
    	oJavabookmarkModel.getlinklist().add(new HypermediaLink(String.format("%s%s", oApplicationUri.getBaseUri(), oApplicationUri.getPath()).substring(0, iLastSlashIndex), "Get all bookmarks of this account", "GET", "Parent"));
    	return oJavabookmarkModel;
	}
}
