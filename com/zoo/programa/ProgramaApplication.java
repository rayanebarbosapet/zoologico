package com.zoo.programa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class ProgramaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProgramaApplication.class, args);

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter zoo name: ");
        String zooName = sc.nextLine();

        System.out.print("Enter employee name: ");
        String employeeName = sc.nextLine();

        System.out.print("Enter animal name: ");
        String animalName = sc.nextLine();

        System.out.print("Enter sector name: ");
        String sectorName = sc.nextLine();

        System.out.print("Enter enclosure name: ");
        String enclosureName = sc.nextLine();

       
        Zoologico z1 = new Zoologico(zooName, "Some Razao Social", 123456789, "Zoo Address");

       
        Funcionario funcionario = new Funcionario();
        funcionario.setNome(employeeName);

       
        Animal animal = new Animal();
        animal.setNome(animalName);

      
        Setor setor = new Setor(sectorName);

       
        Recinto recinto = new Recinto(enclosureName, animalName);

        
        System.out.println("Zoo Name: " + z1.getNome());
        System.out.println("Employee Name: " + funcionario.getNome());
       
	}
}