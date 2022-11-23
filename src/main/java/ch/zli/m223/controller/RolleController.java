package ch.zli.m223.controller;

import java.util.List;

import javax.annotation.security.RolesAllowed;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.openapi.annotations.tags.Tag;

import ch.zli.m223.model.Rolle;
import ch.zli.m223.service.RolleService;

/* 
 * @Marija Radovanovics
 * @version 23.11.2022
*/

@Path("/rolle")
@Tag(name = "Rolle", description = "Hier sind die Rollen")
public class RolleController {
  
 
  @Inject
  RolleService rolleService;

  @GET
  @RolesAllowed({"admin"})
  @Produces(MediaType.APPLICATION_JSON)   
  public List<Rolle> getRolle() {
      return rolleService.findAll();
  }

  @Path("id")
  @GET
  @RolesAllowed({"admin"})
  @Produces(MediaType.APPLICATION_JSON)
  public Rolle getOneRolle(@PathParam("id") Long id) {
      return rolleService.findById(id);
  }

  @POST
  @RolesAllowed({"admin"})
  @Produces(MediaType.APPLICATION_JSON)
  @Consumes(MediaType.APPLICATION_JSON)
  public Rolle create(Rolle rolle) {
      return rolleService.createRolle(rolle);
  }
}

