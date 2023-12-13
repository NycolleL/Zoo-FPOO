package br.senai.jandira.sp.Model;

import java.util.ArrayList;
import java.util.List;

public class Felino extends Animal {

    List<Mamifero> ListFelino = new ArrayList<>();

    public Felino() {
        super("felino");
    }

    public void adicionarFelino(Felino felino) {

    }

    public void ListarFelino() {
        for (Felino felino : ListFelino) {
            System.out.println("-----------------------------");
            System.out.println("id: " + felino.idAnimal);
            System.out.println("nome " + felino.idade);
            System.out.println("idade: " + felino.idade);
            System.out.println("----------------------------");
        }
    }
}