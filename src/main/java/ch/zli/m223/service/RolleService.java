package ch.zli.m223.service;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import ch.zli.m223.model.Rolle;

@ApplicationScoped
public class RolleService {

  @Inject
  EntityManager entityManager;
  
  public List<Rolle> findAll() {
    var query = entityManager.createQuery("FROM Role", Rolle.class);
    System.out.println(query.getResultList());
    return query.getResultList();
}

public Rolle findById(Long id){
    var rolle = entityManager.find(Rolle.class, id);
    return rolle;
}

@Transactional
public Rolle createRole(Rolle rolle) {
    entityManager.persist(rolle);
    return rolle;
}

public Rolle createRolle(Rolle rolle) {
  return null;
}
}