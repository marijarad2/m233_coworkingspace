package ch.zli.m223.service;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.eclipse.microprofile.jwt.JsonWebToken;



import ch.zli.m223.model.Benutzer;
import io.smallrye.jwt.build.Jwt;



@ApplicationScoped
public class AuthService {
    @Inject
    EntityManager entityManager;

    @Inject
    BenutzerService benutzerService;

    @Inject
    JsonWebToken jwt; 


    @Transactional
    public String findBenutzer(String email, String password) {
        List<Benutzer> benutzers = benutzerService.findAll();
        String jwt = "";
        for (Benutzer benutzer : benutzers) {
            if (benutzer.getEmail().equals(email) && benutzer.getPassword().equals(password)) {
                String token = Jwt.issuer("https://example.com/issuer")
                        .upn(benutzer.getEmail())
                        .groups(benutzer.getRolle().getTitel())
                        .expiresIn(Integer.MAX_VALUE)
                        .sign();
                return jwt = token;
            }
        }
        throw new IllegalArgumentException("Email oder Passwort ist falsch!");
    }
}

