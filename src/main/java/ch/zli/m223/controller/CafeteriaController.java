package ch.zli.m223.controller;

import javax.annotation.security.RolesAllowed;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.eclipse.microprofile.openapi.annotations.tags.Tag;

import ch.zli.m223.model.Cafeteria;
import ch.zli.m223.service.CafeteriaService;

/* 
 * @Marija Radovanovics
 * @version 23.11.2022
*/

@Path("/cafeteria")
@Tag(name = "Cafeteria", description = "Die Cafeteria")
public class CafeteriaController {

  
  @Inject
  CafeteriaService cafeteriaService; 

  @GET
  @Path("")
  @Consumes(MediaType.APPLICATION_JSON)
  @Produces(MediaType.APPLICATION_JSON)
  @RolesAllowed({"mitglied"})
  public Cafeteria findCafeteria(Cafeteria cafeteria) {
    return cafeteriaService.createCafeteria(cafeteria); 
  }
  
}
