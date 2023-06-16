package br.com.glauber;

import br.com.glauber.model.User;

import javax.persistence.Persistence;

public class SelectUser {
    public static void main(String[] args) {
        var entityManagerFactory =
                Persistence.createEntityManagerFactory("jpa-exercises");
        var entityManager = entityManagerFactory.createEntityManager();
        var user = entityManager.find(User.class, 2L);

        if (user == null){
            System.out.println("Usuário não encontrado!");
        }else {
            System.out.println(user);
        }

        entityManager.close();
        entityManagerFactory.close();
    }
}