package ch.zli.m223.service;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import ch.zli.m223.model.Raum;


@ApplicationScoped
public class RaumService {

  @Inject
  EntityManager entityManager;

  public static Raum createRaum(Raum raum) {
    return null;
  }
  
}
