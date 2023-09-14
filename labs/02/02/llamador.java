
public class llamador {
    static Metodo hj=new Metodo();
    static double tiempo[]=new double[4];
    static double inicio,fin,total;
    
    public static double[] comparacion(int a, double vector[]){
        double lj[]=new double[a];
        vector=Ent.ramdom(a, lj); tiempo[0]=Metodo.burbuja1(a, vector);
        vector=Ent.ramdom(a, lj); tiempo[1]=Metodo.insercion(vector);
        vector=Ent.ramdom(a, lj); tiempo[2]=Metodo.seleccion(vector);
        vector=Ent.ramdom(a, lj); vector=Metodo.mergesort(vector); tiempo[3]=hj.tot;
        return tiempo;
    }
}
