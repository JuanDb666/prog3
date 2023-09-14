
public class App {

    public static void main(String[] args) {

      
        Operacion op = new Operacion();
        int tam;
        int opcion, opcion2;
        int fila1, fila2;
        int col1, col2;
        int num;
        do {
            System.out.println("Elja Una Opcion: \n1.Suma de Matrices \n2.Prodcuto Punto \n3.Matriz por un escalar \n4.Matriz Traspuesta \n5.Salir");
            opcion = Entrada_sal.cap();
            switch (opcion) {
                case 1: {
                    Entrada_sal.imprimir("Ingrese el numero de filas de la matriz");
                    tam = Entrada_sal.cap();
                    int matrizA[][] = new int[tam][tam];
                    int matrizB[][] = new int[tam][tam];
                    int matrizC[][] = new int[tam][tam];
                    int matrizD[][] = new int[tam][tam];
                    Entrada_sal.imprimir("Ingrese los numeros para la matriz A:");
                    matrizA = Entrada_sal.matriz_cuadrada();
                    Entrada_sal.imprimir("=====================================================");
                    Entrada_sal.imprimir("Ingrese los numeros para la matriz B:");
                    matrizB = Entrada_sal.matriz_cuadrada();
                    matrizC = op.suma(tam, matrizA, matrizB, matrizD);
                    Entrada_sal.escritura(tam, tam, matrizC);
                    break;
                }
                case 2: {
                    Entrada_sal.imprimir("Ingrese el numero de filas de la primera Matriz");
                    fila1 = Entrada_sal.cap();
                    Entrada_sal.imprimir("Ingrese el numero de columnas de la primera Matriz");
                    col1 = Entrada_sal.cap();
                    Entrada_sal.imprimir("Ingrese el numero de filas de la segunda Matriz");
                    fila2 = Entrada_sal.cap();
                    Entrada_sal.imprimir("Ingrese el numero de columnas de la segunda Matriz");
                    col2 = Entrada_sal.cap();
                    int matrizA[][] = new int[fila1][col1];
                    int matrizB[][] = new int[fila2][col2];
                    int matrizC[][] = new int[fila1][col2];
                    if (col1 == fila2) {
                        Entrada_sal.imprimir("Ingrese los numeros para la matriz A:");
                        matrizA = Entrada_sal.matriz_dim(fila1, col1);
                        Entrada_sal.imprimir("Ingrese los numeros para la matriz B:");
                        matrizB = Entrada_sal.matriz_dim(fila2, col2);
                        matrizC = op.producto(fila1, col1, fila2, col2, matrizA, matrizB);
                        Entrada_sal.escritura(fila1, col2, matrizC);
                    } else {
                        Entrada_sal.imprimir("Las dimensiones ingresadas no cumplen los criterios del producto punto");
                    }
                    break;
                }
                case 3: {
                    Entrada_sal.imprimir("Elija un tamaño de matriz \n1.2X2 \n2.3X3 \n3.4X4 ");
                    opcion2 = Entrada_sal.cap();
                    switch (opcion2) {
                        case 1: {
                            tam = 2;
                            int matrizA[][] = new int[tam][tam];
                            int matrizB[][] = new int[tam][tam];
                            matrizA = Entrada_sal.matriz_dim(tam, tam);
                            Entrada_sal.imprimir("Ingrese un numero por el que multiplicar la matriz");
                            num = Entrada_sal.cap();
                            matrizB = Operacion.escalar(tam, num, matrizA);
                            Entrada_sal.escritura(tam, tam, matrizB);
                            break;
                        }
                        case 2: {
                            tam = 3;
                            int matrizA[][] = new int[tam][tam];
                            int matrizB[][] = new int[tam][tam];
                            matrizA = Entrada_sal.matriz_dim(tam, tam);
                            Entrada_sal.imprimir("Ingrese un numero por el que multiplicar la matriz");
                            num = Entrada_sal.cap();
                            matrizB = Operacion.escalar(tam, num, matrizA);
                            Entrada_sal.escritura(tam, tam, matrizB);
                            break;
                        }
                        case 3: {
                            tam = 4;
                            int matrizA[][] = new int[tam][tam];
                            int matrizB[][] = new int[tam][tam];
                            matrizA = Entrada_sal.matriz_dim(tam, tam);
                            Entrada_sal.imprimir("Ingrese un numero por el que multiplicar la matriz");
                            num = Entrada_sal.cap();
                            matrizB = Operacion.escalar(tam, num, matrizA);
                            Entrada_sal.escritura(tam, tam, matrizB);
                            break;
                        }
                    }
                    break;
                }
                case 4: {
                    Entrada_sal.imprimir("Ingrese el numero de filas");
                    fila1 = Entrada_sal.cap();
                    Entrada_sal.imprimir("Ingrese el numero de columnas");
                    col1 = Entrada_sal.cap();
                    int matrizA[][] = new int[fila1][col1];
                    int matrizB[][] = new int[col1][fila1];
                    Entrada_sal.matriz_dim(fila1, col1);
                    matrizB = Operacion.traspuesta(fila1, col1, matrizA);
                    Entrada_sal.escritura(fila1, col1, matrizB);
                    break;
                }
            }
        } while (opcion != 5);
    }
}
