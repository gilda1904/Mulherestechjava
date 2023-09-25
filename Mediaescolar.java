/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mediaescolar;

import java.util.Scanner;

/**
 *
 * @author 16128972023.1
 */
public class Mediaescolar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner sc = new Scanner (System.in);
Double n1,n2,n3,n4,media;

        System.out.println("digite nota do 1° bimestre"); 
       n1= sc.nextDouble();
        
        System.out.println("digite nota do 2° bimestre");
    n2 = sc.nextDouble();
    
        System.out.println("digite a nota 3° bimestre");
    n3 = sc.nextDouble();
    
        System.out.println("digite a nota do 4° bimestre");
    n4 = sc.nextDouble();
    
    media = (n1+n2+n3+n4)/4;
    
    if(media>=6){
            System.out.println("Aluno aprovado - media = "+media);
    }   
            else if(media>=3){
                   
                    System.out.println("Aluno recuperação - média = "+media);
                    }
    
    
    else{ 
            System.out.println("aluno reprovado - media ="+media);
}
}
}
