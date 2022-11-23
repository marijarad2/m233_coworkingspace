package ch.zli.m223.controller;

import javax.annotation.security.RolesAllowed;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.openapi.annotations.tags.Tag;

import ch.zli.m223.model.Raum;
import ch.zli.m223.service.RaumService;

/* 
 * @Marija Radovanovics
 * @version 23.11.2022
*/


@Path("/raum")
@Tag(name = "Raum", description = "Die Räume")
public class RaumController {

  @Inject
  RaumService raumService; 

  @GET
  @Path("")
  @Consumes(MediaType.APPLICATION_JSON)
  @Produces(MediaType.APPLICATION_JSON)
  @RolesAllowed({"admin", "mitglied"})
  public Raum findRaum(Raum raum) {
    return RaumService.createRaum(raum); 
  }
  
  
}
