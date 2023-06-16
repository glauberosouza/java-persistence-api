package br.com.glauber;

import br.com.glauber.model.User;
import javax.persistence.Persistence;

public class UpdateUser {
    public static void main(String[] args) {
        var entityManagerFactory = Persistence
                .createEntityManagerFactory("jpa-exercises");
        var entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        var user = entityManager.find(User.class, 1L);
        entityManager.detach(user);
        user.setName("Goku");
        user.setEmail("goku@gmail.com");
        entityManager.merge(user);
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();
    }
}