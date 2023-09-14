
public class Main {

    public static void main(String[] args) {
        int opcion, tam;
        do {
            Sal.menu();
            opcion=Ent.captura();
            switch (opcion) {
                case 1:{
                 tam=100; double l[]=new double[4]; l=llamador.comparacion(tam, l); Sal.enunciado(tam); Sal.imprimir(l);break;
                /*tam=100; double m[] = new double[tam]; m = Llenado.ramdom(tam, m);  m = Orden.burbuja1(tam, m);m=Llenado.ramdom(tam, m); m=Orden.insercion(m); Mostrar.imprimir(m); break;*/
                }
                case 2: {
                    tam=500;double l[]=new double [4]; l= llamador.comparacion(tam, l); Sal.enunciado(tam);Sal.imprimir(l);break;
                 /*tam=100; double m[] = new double[tam]; m=Llenado.ramdom(tam, m); m=Orden.insercion(m); Mostrar.imprimir(m); break;*/
                }
                case 3:{
                    tam=1000; double l[]=new double[4];l=llamador.comparacion(tam, l);Sal.enunciado(tam);Sal.imprimir(l);break;
                }
                case 4:{
                    tam=5000; double l[]=new double[4];l=llamador.comparacion(tam, l);Sal.enunciado(tam);Sal.imprimir(l);break;
                }
                case 5:{
                    tam=10000;double l[]=new double[4];l=llamador.comparacion(tam, l);Sal.enunciado(tam);Sal.imprimir(l);break;
                }
                
            }
        } while (opcion != 6);

    }

}
