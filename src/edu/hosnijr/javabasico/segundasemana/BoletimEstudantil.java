package edu.hosnijr.javabasico.segundasemana;

public class BoletimEstudantil {

    public static void main(String[] args) {
        int mediaFinal = 7;
        if(mediaFinal<6)	
            System.out.println("REPROVADO"); 
        else if (mediaFinal==6)
            System.out.println("PROVA DE RECUPERACAO"); 
        else
            System.out.println("APROVADO"); 		
    }
}
