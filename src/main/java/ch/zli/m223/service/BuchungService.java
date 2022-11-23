package ch.zli.m223.service;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import ch.zli.m223.model.Buchung;


@ApplicationScoped
public class BuchungService {

  @Inject
  EntityManager entityManager;

  public List<Buchung> findAll() {
    var query = entityManager.createQuery("FROM Buchung", Buchung.class);
    return query.getResultList();
}

  public Buchung createBuchung(Buchung buchung) {
    entityManager.persist(buchung);
    return buchung;
  }

  @Transactional
  public Buchung getBuchung(Buchung buchung) {
    return null;
  }

  @Transactional
  public void delete(Long id) {
    Buchung entity = entityManager.find(Buchung.class, id);
    entityManager.remove(entity);
  }

  @Transactional
  public Buchung updateBuchung(Buchung buchung) {
    return null;
  }
  
}
