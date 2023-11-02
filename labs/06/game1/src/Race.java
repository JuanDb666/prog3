
import javax.swing.JLabel;


public class Race extends Thread{
    private JLabel eti;
    private slot p;
    
    public Race (JLabel eti, slot p){
        this.eti=eti;
        this.p=p;
    }
    
    public void run(){
        int c1=0,c2=0, c3=0, c4=0, c5=0;
        while (true){
            try{
                sleep((int)(Math.random()*1000));
                c1=p.getlbl1().getLocation().x;
                c2=p.getlbl2().getLocation().x;
                c3=p.getlbl3().getLocation().x; 
                c4=p.getlbl4().getLocation().x; 
                c5=p.getlbl4().getLocation().x;
            }catch (Exception e)
        }
    }
}
