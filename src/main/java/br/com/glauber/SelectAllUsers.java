package br.com.glauber;

import br.com.glauber.model.User;

import javax.persistence.Persistence;

public class SelectAllUsers {
    public static void main(String[] args) {
        var entityManagerFactory =
                Persistence.createEntityManagerFactory("jpa-exercises");
        var entityManager = entityManagerFactory.createEntityManager();

        var jpql = "SELECT u FROM User u";
        var query = entityManager.createQuery(jpql, User.class);
        query.setMaxResults(5);
        var resultList = query.getResultList();

        if (resultList.isEmpty()){
            System.out.println("Poxa infelizmente não conseguimos retornar algum resultado");
        }

        resultList.forEach(System.out::println);
        entityManager.close();
        entityManagerFactory.close();
    }
}
