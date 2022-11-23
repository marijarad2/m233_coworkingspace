package ch.zli.m223.controller;

import javax.annotation.security.RolesAllowed;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.openapi.annotations.tags.Tag;

import ch.zli.m223.model.Benutzer;
import ch.zli.m223.service.BenutzerService;

/* 
 * @Marija Radovanovics
 * @version 23.11.2022
*/

@Path("/benutzer")
@Tag(name = "Benutzer", description = "Die Benutzer")
public class BenutzerController {

  @Inject
  BenutzerService benutzerService; 
  
  @GET
  @Path("id")
  @Consumes(MediaType.APPLICATION_JSON)
  @Produces(MediaType.APPLICATION_JSON)
  @RolesAllowed({"admin"})
  public Benutzer findBenutzer(@PathParam("id") Long id) {
    return benutzerService.getBenutzer(id); 
  }

  @POST
  @Path("id")
  @Consumes(MediaType.APPLICATION_JSON)
  @Produces(MediaType.APPLICATION_JSON)
  @RolesAllowed({"admin"})
  public Benutzer createBenutzer(Benutzer benutzer) {
    return benutzerService.createBenutzer(benutzer); 
  }

  @PUT
  @Path("id")
  @Consumes(MediaType.APPLICATION_JSON)
  @Produces(MediaType.APPLICATION_JSON)
  @RolesAllowed({"admin"})
  public Benutzer UpdateBenutzer(Benutzer benutzer) {
    return benutzerService.UpdateBenutzer(benutzer); 
  }

  @DELETE
  @Path("id")
  @Consumes(MediaType.APPLICATION_JSON)
  @Produces(MediaType.APPLICATION_JSON)
  @RolesAllowed({"admin"})
  public void DeleteBenutzer(@PathParam("id") Long id) {
    benutzerService.delete(id);
  }
  
}
