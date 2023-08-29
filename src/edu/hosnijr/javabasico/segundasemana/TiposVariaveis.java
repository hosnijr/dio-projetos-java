public class TiposVariaveis {
    // TiposEVariaveis.java

    short numeroCurto = 1;
    int numeroNormal = numeroCurto;
    short numeroCurto2 = numeroNormal; //seria a conversao de um numero de int 4 bytes  para um numero de short 2 bytes.
    
    short numeroCurto2 = (short) numeroNormal; //Usar o recurso de casting para informar que realmente essa é a ação desejada. Converte de um tipo mais abrangente para um mais especifico.
    

}