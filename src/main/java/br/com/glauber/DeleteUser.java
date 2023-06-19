package br.com.glauber;

import br.com.glauber.model.User;

import javax.persistence.Persistence;

public class DeleteUser {
    public static void main(String[] args) {
        var entityManagerFactory = Persistence
                .createEntityManagerFactory("jpa-exercises");
        var entityManager = entityManagerFactory.createEntityManager();

        var user = entityManager.find(User.class, 5L);
        if (user == null){
            System.out.println("Usuário não encontrado!");
        }
        entityManager.getTransaction().begin();
        entityManager.remove(user);
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();
    }
}