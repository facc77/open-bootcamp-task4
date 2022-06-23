package com.company;

public class Main {
    public static void main(String[] args){

        int numeroIf= -1;

        if (numeroIf>0){
            System.out.println("numeroIf es positivo");
        } else if (numeroIf == 0) {
            System.out.println("numeroIf es 0");
        } else{
            System.out.println("numeroIf es negativo");
        }

        int numeroWhile= 0;

        while (numeroWhile<3){
            numeroWhile++;
            System.out.println(numeroWhile);
        }

        do{
            numeroWhile++;
            System.out.println(numeroWhile);
        }while (numeroWhile < 0);

        int numeroFor=0;

        for (;numeroFor <=3;numeroFor++){
            System.out.println(numeroFor);
        }

        String estacion= "Verano";

        switch (estacion){
            case "Primavera":
            case "Otoño":
            case "Verano":
            case "Invierno":
                System.out.println("La estación actual es "+ estacion);
                break;
            default:
                System.out.println("El valor ingresado no es una estación");

        }


    }

}

