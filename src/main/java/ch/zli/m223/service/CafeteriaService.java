package ch.zli.m223.service;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import ch.zli.m223.model.Cafeteria;



@ApplicationScoped
public class CafeteriaService {

  @Inject
  EntityManager entityManager;

  public Cafeteria createCafeteria(Cafeteria cafeteria) {
    return null;
  }
  
}
