package br.senai.jandira.sp.Model;

import java.util.Scanner;

public class Animal {
    String nome, especie, sexo;
    int idade, idAnimal;
    Scanner scanner = new Scanner(System.in);
    public Animal (String especie){
        this.especie = especie;
    }

    public void CadastrarAnimal(){
        System.out.println("-------------- - CADASTRAR ANIMAL- ---------------");
        System.out.println("Informe o Nome do Animal: ");
        nome = scanner.nextLine();
        System.out.println("Informe o ID do Animal: ");
        idAnimal = scanner.nextInt();
        System.out.println("Qual a Idade do Animal?: ");
        idade = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Informe o Sexo do Animal:");
        sexo = scanner.nextLine();
        System.out.println("----------- - CADASTRO FINALIZADO - --------------");
        System.out.println("--------------------------------------------------");
    }
}
