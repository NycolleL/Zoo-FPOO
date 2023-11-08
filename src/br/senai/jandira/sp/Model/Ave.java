package br.senai.jandira.sp.Model;

import java.util.ArrayList;
import java.util.List;

public class Ave extends Animal {

    List<Ave> ListAve = new ArrayList<>();
    public Ave(){
        super("ave");
    }

    public void adicionarAve(Ave ave){

    }
    public void ListarAve(){
        for (Ave ave : ListAve){
            System.out.println("-----------------------------");
            System.out.println("id: " + ave.idAnimal);
            System.out.println("nome " + ave.idade);
            System.out.println("idade: " + ave.idade);
            System.out.println("----------------------------");
        }
    }


}
