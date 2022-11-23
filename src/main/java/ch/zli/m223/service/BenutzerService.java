package ch.zli.m223.service;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import javax.ws.rs.PathParam;

import ch.zli.m223.model.Benutzer;
import io.quarkus.security.User;

@ApplicationScoped
public class BenutzerService {

  @Inject
  EntityManager entityManager;

  public List<Benutzer> findAll() {
    var query = entityManager.createQuery("FROM Benutzer", Benutzer.class);
        return query.getResultList();
  }

  public Benutzer UpdateBenutzer(Benutzer benutzer) {
    return entityManager.merge(benutzer);
  }

  public Benutzer createBenutzer(Benutzer benutzer) {
    entityManager.persist(benutzer);
    return benutzer;
  }

  public Benutzer getBenutzer(Long id) {
    return entityManager.find(Benutzer.class, id);
}

  @Transactional
  public void delete(Long id) {
    var benutzer = entityManager.find(Benutzer.class, id);
    entityManager.remove(benutzer);
  }

}

  

