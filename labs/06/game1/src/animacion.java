import java.awt.Dimension;
import java.util.Timer;
import javax.swing.*;
import java.awt.*;
import java.util.TimerTask;


public class animacion  extends javax.swing.JLabel {   
    private Timer tiempo ;
    private TimerTask task;
    private int speed = 60;
    private int frame=1;
    boolean run = false;
    private int im;
    
    //se crea el objeto y se redimensiona al tamaño del contenedor
    public animacion(Dimension d){        
        this.setSize(d);
    }  
    //coloca una imagen en el objeto jlabel
    public void setimage(int n){ 
        int b = ((int)(Math.random()*16)+1);
        //int b = 9;  //comprobar el mensaje de ganar
        this.setIcon(new javax.swing.ImageIcon(getClass().getResource( "/traga/figura" + b + ".png"))); 
        setim(b);
    }
    //coloca la velocidad en la variable 
    public void setvelocidad(int v){
        this.speed= v;        
    }
  //para la animacion  
  public void startAnimation() {    
           run=true;
           tiempo = new Timer();
           task = new TimerTask() {               
               public void run() {
   
                   frame++;                   
                   if (frame<=16){
                 
                       
                        setimage(frame);
                   }
                   else{frame=1;}
               }
           };
           //se inicia la animacion
           System.out.println("Se inicia la animacion");                                             
           tiempo.schedule(task,0,speed); 
    }
    //detiene la animacion
     public void stopAnimation() {        
        tiempo.cancel();
        task.cancel();
        run=false;
        System.out.println("La animacion fue detenida");                                             
    }

    public void setim(int a) {
        this.im = a;
    }
     

    
    public int getIm() {
        
        return im;
    }
     

}


