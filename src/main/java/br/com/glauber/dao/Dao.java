package br.com.glauber.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class Dao<T> {

    private Class<T> classz;
    private static EntityManagerFactory entityManagerFactory;
    private final EntityManager entityManager;

    static {
        try {
            entityManagerFactory = Persistence
                    .createEntityManagerFactory("jpa-exercises");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public Dao() {
        this(null);
    }

    public Dao(Class<T> classz) {
        this.classz = classz;
        entityManager = entityManagerFactory.createEntityManager();
    }

    public Dao<T> save(T entity) {
        openTransaction().entityManager.persist(entity);
        return commitTransaction();
    }

    public List<T> getAll(int qtdRegistros, int offSet) {
        var jpql = "SELECT e FROM " + classz.getName() + " e";
        var query = entityManager.createQuery(jpql, classz);
        query.setMaxResults(qtdRegistros).setFirstResult(offSet);
        return query.getResultList();
    }

    public Dao<T> openTransaction() {
        entityManager.getTransaction().begin();
        return this;
    }

    public Dao<T> commitTransaction() {
        entityManager.getTransaction().commit();
        return this;
    }

    public void close() {
        entityManager.close();
    }
}