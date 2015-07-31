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

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.DefaultValue;


/* This class defines the web API of the individual bookmark resource. It may handle PUT, GET and/or DELETE requests 
   depending on the specific CIM of the service.*/

@Path("/account/{accountId}/bookmark/{bookmarkId}")
public class JavabookmarkController{

    @Context
    private UriInfo oApplicationUri;

	/* This function handles http GET requests  
    and returns any response formatted as stated in the @Produces JAX-RS annotation below.*/
	@Path("/")
	@GET
	@Produces("application/JSON")
    public JavabookmarkModel getbookmark(@HeaderParam("authorization") String authHeader, @PathParam("bookmarkId") int bookmarkId){
        GetbookmarkHandler oGetbookmarkHandler = new GetbookmarkHandler(authHeader, bookmarkId, oApplicationUri);
        return oGetbookmarkHandler.getJavabookmarkModel();
    }

	/* This function handles http PUT requests that are sent with any media type stated in the @Consumes JAX-RS annotation below 
    and returns any response formatted as stated in the @Produces JAX-RS annotation below.*/
	@Path("/")
	@PUT
	@Produces("application/JSON")
	@Consumes("application/JSON")
    public JavabookmarkModel putbookmark(@HeaderParam("authorization") String authHeader, @PathParam("accountId") int accountId, @PathParam("bookmarkId") int bookmarkId,  JavabookmarkModel oJavabookmarkModel){
        PutbookmarkHandler oPutbookmarkHandler = new PutbookmarkHandler(authHeader, accountId, bookmarkId, oJavabookmarkModel, oApplicationUri);
        return oPutbookmarkHandler.putJavabookmarkModel();
    }

    /* This function handles http DELETE requests  
    and returns any response formatted as stated in the @Produces JAX-RS annotation below.*/
	@Path("/")
	@DELETE
	@Produces("application/JSON")
    public JavabookmarkModel deletebookmark(@HeaderParam("authorization") String authHeader, @PathParam("bookmarkId") int bookmarkId){
        DeletebookmarkHandler oDeletebookmarkHandler = new DeletebookmarkHandler(authHeader, bookmarkId, oApplicationUri);
        return oDeletebookmarkHandler.deleteJavabookmarkModel();
    }
}

