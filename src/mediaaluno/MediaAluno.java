/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediaaluno;

/**
 *
 * @author naomi
 */
import java.util.Scanner;
public class MediaAluno {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       double nota1,nota2,media,nota3,novamedia;
       
       System.out.print ("Digite as duas notas que compõem a média \n");
       System.out.print("Nota 1: ");
       nota1 = entrada.nextDouble();
       
       System.out.print("Nota 2: ");
       nota2 = entrada.nextDouble();
       
       media = (nota1+nota2)/2;
       
       if (media>=7)
       {
        System.out.print("O(A) aluno(a) foi aprovado(a) \n Média: " + media +"\n");
       }
       else
       {
        if (media<7)
        {
          System.out.print("Média: " + media + "\nDigite a nota do exame: ");
          nota3 = entrada.nextDouble();
        
          novamedia = (media+nota3)/2;
          if (novamedia>=5)
          {
           System.out.print(" O(A) aluno(a) foi aprovado(a) em exame \nNova média: " +novamedia +"\n");
          } 
          else
           {
             System.out.print("O(A) aluno(a) foi reprovado(a) \n Nova Média: "+novamedia+"\n");
           }
        }
       }
       
               
    }
    
}
