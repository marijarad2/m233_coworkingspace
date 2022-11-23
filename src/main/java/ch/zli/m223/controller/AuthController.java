package ch.zli.m223.controller;

import javax.annotation.security.PermitAll;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

import ch.zli.m223.model.Benutzer;
import ch.zli.m223.service.AuthService;
import ch.zli.m223.service.BenutzerService;


//Auth

@Path("/auth")
@Tag(name = "Auth", description = "Handling of Auth")
public class AuthController {
  @Inject
  AuthService authService;

  @Inject
    BenutzerService benutzerService;



   //Login 
    @Path("/login")
    @POST
    @PermitAll
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public String login(@QueryParam("email")String email, @QueryParam("password") String password) {
        return authService.findBenutzer(email, password);
    }

    //Register

    @Path("/register")
    @POST
    @PermitAll
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Benutzer create(Benutzer benutzer) {
        return benutzerService.createBenutzer(benutzer);
    }
}

