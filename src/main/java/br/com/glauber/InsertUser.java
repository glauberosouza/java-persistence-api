package br.com.glauber;

import br.com.glauber.model.User;

import javax.persistence.Persistence;

public class InsertUser {
    public static void main(String[] args) {
        var entityManagerFactory = Persistence
                .createEntityManagerFactory("jpa-exercises");
        var entityManager = entityManagerFactory.createEntityManager();
        var user = new User("Sergio", "sergio@gmail.com");

        entityManager.getTransaction().begin();
        entityManager.persist(user);
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();
    }
}
