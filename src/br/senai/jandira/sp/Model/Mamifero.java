package br.senai.jandira.sp.Model;

import java.util.ArrayList;
import java.util.List;

public class Mamifero extends Animal {

    List<Mamifero> ListMamifero = new ArrayList<>();

    public Mamifero() {
        super("mamífero");
    }

    public void adicionarMamifero(Mamifero mamifero) {

    }

    public void ListarMamifero() {
        for (Mamifero mamifero : ListMamifero) {
            System.out.println("-----------------------------");
            System.out.println("id: " + mamifero.idAnimal);
            System.out.println("nome " + mamifero.idade);
            System.out.println("idade: " + mamifero.idade);
            System.out.println("----------------------------");
        }
    }
}
