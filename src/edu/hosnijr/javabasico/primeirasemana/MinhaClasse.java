package edu.hosnijr.javabasico.primeirasemana;

public class MinhaClasse {

    public static void main (String [] args) {

        String primeiroNome = "Jorge Hosni";
        String segundoNome = "Junior";

        System.out.println("Olá turma, sejam bem-vindos");

        String nomeCompleto = nomeCompleto (primeiroNome,segundoNome);
        
        System.out.println(nomeCompleto);

    }

    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
    }

}