package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int estadoInicio = 0;
        int estadoActual = estadoInicio;
        String entrada;

        Scanner scanner = new Scanner(System.in);
        do{
            System.out.print("usuario@DESKTOP-718752J MINGW64 ~\n$ ");
            entrada = scanner.nextLine();
            verificacion(entrada,estadoActual);
        }while(!entrada.toLowerCase().equals("exit"));

    }

    public static void verificacion(String entrada,int estado){
        int [] estadoFinal = {3,4,7,8,14,18,25,29,31,35};
        boolean fin = false;
        int contador = 0;
        boolean aceptado=false;

        while (fin == false){
            if(contador >= entrada.length()){
                fin = true;
                break;
            }
            if(entrada.charAt(contador)==' ' && estado==0){
                contador++;
                continue;
            }
            if(estado==0){
                if(entrada.toLowerCase().charAt(contador)=='g')
                    estado=1;
                else
                    estado=-1;
                contador++;
                continue;
            }
            if(estado==1){
                if(entrada.toLowerCase().charAt(contador)=='i')
                    estado=2;
                else
                    estado=-1;
                contador++;
                continue;
            }
            if(estado==2){
                if(entrada.toLowerCase().charAt(contador)=='t')
                    estado=3;
                else
                    estado=-1;
                contador++;
                continue;
            }
            if(estado==3){
                if(entrada.toLowerCase().charAt(contador)==' ')
                    estado=4;
                else
                    estado=-1;
                contador++;
                continue;
            }
            if(estado==4){
                if(entrada.toLowerCase().charAt(contador)=='a')
                    estado=5;
                else  if(entrada.toLowerCase().charAt(contador)=='c')
                    estado=9;
                else if(entrada.toLowerCase().charAt(contador)=='p')
                    estado=26;
                else if(entrada.toLowerCase().charAt(contador)=='i')
                    estado=32;
                else if(entrada.toLowerCase().charAt(contador)==' ')
                    estado=4;
                else
                    estado=-1;
                contador++;
                continue;
            }
            if(estado==5){
                if(entrada.toLowerCase().charAt(contador)=='d')
                    estado=6;
                else
                    estado=-1;
                contador++;
                continue;
            }
            if(estado==6){
                if(entrada.toLowerCase().charAt(contador)=='d')
                    estado=7;
                else
                    estado=-1;
                contador++;
                continue;
            }
            if(estado==7){
                if(entrada.toLowerCase().charAt(contador)==' ')
                    estado=8;
                else
                    estado=-1;
                contador++;
                continue;
            }
            if(estado==8){
                if(entrada.toLowerCase().charAt(contador)==' ')
                    estado=8;
                else
                    estado=-1;
                contador++;
                continue;
            }
            if(estado==9){
                if(entrada.toLowerCase().charAt(contador)=='o')
                    estado=10;
                else if(entrada.toLowerCase().charAt(contador)=='l')
                    estado=15;
                else if(entrada.toLowerCase().charAt(contador)=='h')
                    estado=19;
                else
                    estado=-1;
                contador++;
                continue;
            }
            if(estado==10){
                if(entrada.toLowerCase().charAt(contador)=='m')
                    estado=11;
                else
                    estado=-1;
                contador++;
                continue;
            }
            if(estado==11){
                if(entrada.toLowerCase().charAt(contador)=='m')
                    estado=12;
                else
                    estado=-1;
                contador++;
                continue;
            }
            if(estado==12){
                if(entrada.toLowerCase().charAt(contador)=='i')
                    estado=13;
                else
                    estado=-1;
                contador++;
                continue;
            }
            if(estado==13){
                if(entrada.toLowerCase().charAt(contador)=='t')
                    estado=14;
                else
                    estado=-1;
                contador++;
                continue;
            }
            if(estado==14){
                if(entrada.toLowerCase().charAt(contador)==' ')
                    estado=8;
                else
                    estado=-1;
                contador++;
                continue;
            }
            if(estado==15){
                if(entrada.toLowerCase().charAt(contador)=='o')
                    estado=16;
                else
                    estado=-1;
                contador++;
                continue;
            }
            if(estado==16){
                if(entrada.toLowerCase().charAt(contador)=='n')
                    estado=17;
                else
                    estado=-1;
                contador++;
                continue;
            }
            if(estado==17){
                if(entrada.toLowerCase().charAt(contador)=='e')
                    estado=18;
                else
                    estado=-1;
                contador++;
                continue;
            }
            if(estado==18){
                if(entrada.toLowerCase().charAt(contador)==' ')
                    estado=8;
                else
                    estado=-1;
                contador++;
                continue;
            }
            if(estado==19){
                if(entrada.toLowerCase().charAt(contador)=='e')
                    estado=20;
                else
                    estado=-1;
                contador++;
                continue;
            }
            if(estado==20){
                if(entrada.toLowerCase().charAt(contador)=='c')
                    estado=21;
                else
                    estado=-1;
                contador++;
                continue;
            }
            if(estado==21){
                if(entrada.toLowerCase().charAt(contador)=='k')
                    estado=22;
                else
                    estado=-1;
                contador++;
                continue;
            }
            if(estado==22){
                if(entrada.toLowerCase().charAt(contador)=='o')
                    estado=23;
                else
                    estado=-1;
                contador++;
                continue;
            }
            if(estado==23){
                if(entrada.toLowerCase().charAt(contador)=='u')
                    estado=24;
                else
                    estado=-1;
                contador++;
                continue;
            }
            if(estado==24){
                if(entrada.toLowerCase().charAt(contador)=='t')
                    estado=25;
                else
                    estado=-1;
                contador++;
                continue;
            }
            if(estado==25){
                if(entrada.toLowerCase().charAt(contador)==' ')
                    estado=8;
                else
                    estado=-1;
                contador++;
                continue;
            }
            if(estado==26){
                if(entrada.toLowerCase().charAt(contador)=='u')
                    estado=27;
                else
                    estado=-1;
                contador++;
                continue;
            }
            if(estado==27){
                if(entrada.toLowerCase().charAt(contador)=='s')
                    estado=28;
                else if(entrada.toLowerCase().charAt(contador)=='l')
                    estado=30;
                else
                    estado=-1;
                contador++;
                continue;
            }
            if(estado==28) {
                if (entrada.toLowerCase().charAt(contador) == 'h')
                    estado = 29;
                else
                    estado=-1;
                contador++;
                continue;
            }
            if(estado==29) {
                if (entrada.toLowerCase().charAt(contador) == ' ')
                    estado = 8;
                else
                    estado=-1;
                contador++;
                continue;
            }
            if(estado==30) {
                if (entrada.toLowerCase().charAt(contador) == 'l')
                    estado = 31;
                else
                    estado=-1;
                contador++;
                continue;
            }
            if(estado==31) {
                if (entrada.toLowerCase().charAt(contador) == ' ')
                    estado = 8;
                else
                    estado=-1;
                contador++;
                continue;
            }
            if(estado==32) {
                if (entrada.toLowerCase().charAt(contador) == 'n')
                    estado = 33;
                else
                    estado=-1;
                contador++;
                continue;
            }
            if(estado==33) {
                if (entrada.toLowerCase().charAt(contador) == 'i')
                    estado = 34;
                else
                    estado=-1;
                contador++;
                continue;
            }
            if(estado==34) {
                if (entrada.toLowerCase().charAt(contador) == 't')
                    estado = 35;
                else
                    estado=-1;
                contador++;
                continue;
            }
            if(estado==35) {
                if (entrada.toLowerCase().charAt(contador) == ' ')
                    estado = 8;
                else
                    estado=-1;
                contador++;
                continue;
            }
            else {
                estado=-35;
                contador++;
                continue;
            }

        }
        for (int i = 0; i <estadoFinal.length ; i++) {
            if(estado == estadoFinal[i])
                aceptado=true;
        }
        if(estado==estadoFinal[0] || estado==estadoFinal[1]){
            System.out.println("\t~Comandos de Git~\ngit\ninit\nadd\ncommit\npush\npull\nclone\ncheckout\n");
        }
        else if(aceptado==true){
            System.out.println("Comando Aceptado");
        }else{
            System.out.println("Comando desconocido");
        }
    }

}
