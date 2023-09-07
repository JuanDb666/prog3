
package com.mycompany.matriz;

import java.util.Scanner;

public class Matriz {

    public static int menu (){
        Scanner a = new Scanner(System.in);
        System.out.println("\t\tCalculadora de Matrices\n1. Matrices\n2. Operaciones\n3. Salir");
        return a.nextInt();
        
    }
    public static int menu1 (){
        Scanner a = new Scanner(System.in);
        System.out.println("\t\tMatrices\n1. Matrice A\n2. Matriz B\n3. Matriz C\n4. Escalar\n5. Regresar");
        return a.nextInt();
        
    }
    public static int menu2 (){
        Scanner a = new Scanner(System.in);
        System.out.println("\t\tOperaciones\n1. Matrices\n2. Operaciones\n3. Salir");
        return a.nextInt();
        
    }
    public static double[][] matriz(int i, int j){
        Scanner a = new Scanner(System.in);
        double[][] matriz = new double[i][j];
        for(int x=0;x<i;x++){
            for(int y=0;y<j;y++){
                System.out.println("Posisicon a"+(x+1)+(y+1)+" : ");
                matriz[x][y]=a.nextDouble();
            }
        }
        return matriz;
    }
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int i, j, opc, opc1, opc2;
        double[][] matrizA, matrizB, matrizC;
        do{
            opc=menu();
            switch(opc){
                case 1: do{
                    opc1=menu1();
                    switch(opc1){
                        case 1: System.out.println("\nIngrese la cantidad de filas: ");
                            i=a.nextInt();
                            System.out.println("\nIngrese la cantidad de columnas: ");
                            j=a.nextInt();
                            matrizA=matriz(i,j);
                            break;          
                        case 2:System.out.println("\nIngrese la cantidad de filas: ");
                            i=a.nextInt();
                            System.out.println("\nIngrese la cantidad de columnas: ");
                            j=a.nextInt();
                            matrizB=matriz(i,j);
                            break;
                        case 3:System.out.println("\nIngrese la cantidad de filas: ");
                            i=a.nextInt();
                            System.out.println("\nIngrese la cantidad de columnas: ");
                            j=a.nextInt();
                            matrizC=matriz(i,j);
                            break;
                        case 4:                            
                                
                    }
                    
                }while(opc1!=5);
            }
        }while(opc!=3);
    }
}
