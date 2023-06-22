package br.com.glauber;

import br.com.glauber.dao.Dao;
import br.com.glauber.model.Captain;
import br.com.glauber.model.ZionCode;

import java.util.UUID;

public class TesteOneToOne {
    public static void main(String[] args) {
        var zionCode = new ZionCode(UUID.randomUUID().toString());
        var captain = new Captain("Akira", zionCode);
        var objectDao = new Dao<>(Captain.class);
        objectDao.save(captain).close();
        Captain captainId = objectDao.getById(1L);
        System.out.println(captainId);
    }
}