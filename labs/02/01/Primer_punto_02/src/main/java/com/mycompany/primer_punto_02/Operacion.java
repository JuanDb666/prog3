
package com.mycompany.primer_punto_02;

public class Operacion {
    public static double[][] suma(int a, double [][]matrizA, double [][] matrizB, double [][] matrizC) {
           for(int x=0; x<a; x++){
               for(int y=0;y<a;y++){
                   matrizC[x][y]= matrizA[x][y]+matrizB[x][y];
               }
           }
            return matrizC;
          }
}
