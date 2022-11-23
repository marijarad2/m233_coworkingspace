package ch.zli.m223.controller;

import javax.annotation.security.RolesAllowed;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import org.eclipse.microprofile.openapi.annotations.tags.Tag;

import ch.zli.m223.model.Buchung;
import ch.zli.m223.service.BuchungService;

/* 
 * @Marija Radovanovic
 * @version 23.11.2022
*/

@Path("/buchung")
@Tag(name = "Buchung", description = "Buchung des Raumes")
public class BuchungController {

  @Inject
  BuchungService buchungService; 

  @POST
  @Path("")
  @Consumes(MediaType.APPLICATION_JSON)
  @Produces(MediaType.APPLICATION_JSON)
  @RolesAllowed({"admin", "mitglied"})
  public Buchung createBuchung(Buchung buchung) {
    return buchungService.createBuchung(buchung); 
  }

  @GET
  @Path("id")
  @Consumes(MediaType.APPLICATION_JSON)
  @Produces(MediaType.APPLICATION_JSON)
  @RolesAllowed({"admin", "mitglied"})
  public Buchung findBuchung(Buchung buchung) {
    return buchungService.getBuchung(buchung); 
  }

  @DELETE
  @Path("id")
  @Consumes(MediaType.APPLICATION_JSON)
  @Produces(MediaType.APPLICATION_JSON)
  @RolesAllowed({"admin", "mitglied"})
  public void  deleteBuchung(@PathParam("id") Long id ) {
    buchungService.delete(id); 
  }

  @PUT
  @Path("id")
  @Consumes(MediaType.APPLICATION_JSON)
  @Produces(MediaType.APPLICATION_JSON)
  @RolesAllowed({"admin", "mitglied"})
  public Buchung updateBuchung(Buchung buchung) {
    return buchungService.updateBuchung(buchung); 
  }
}
