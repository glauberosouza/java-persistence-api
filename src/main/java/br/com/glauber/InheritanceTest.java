package br.com.glauber;

import br.com.glauber.dao.Dao;
import br.com.glauber.model.Machine;
import br.com.glauber.model.Sentinel;

import java.util.UUID;

public class InheritanceTest {
    public static void main(String[] args) {
        var repository = new Dao<>(Machine.class);
        var machine = new Machine("A21", UUID.randomUUID().toString());
        var sentinel = new Sentinel("Octo 700", UUID.randomUUID().toString(), true);
        repository.save(machine).save(sentinel).close();
    }
}
