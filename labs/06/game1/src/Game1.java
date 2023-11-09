
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class Game1 extends Thread {
    private JLabel eti;
    private Race p;
    
public Game1 (JLabel eti, Race p){
        this.eti=eti;
        this.p=p;
    }
    
    @Override
    public void run(){
        int c1=0,c2=0, c3=0, c4=0, c5=0;
        while (true){
            try{
                sleep((int)(Math.random() * 1000));
                c1=p.getlbl1().getLocation().x;
                c2=p.getlbl2().getLocation().x;
                c3=p.getlbl3().getLocation().x; 
                c4=p.getlbl4().getLocation().x; 
                c5=p.getlbl4().getLocation().x;
                if(c1 < p.getlbl_end().getLocation().x - 125 && c2 < p.getlbl_end().getLocation().x - 125 && c3 < p.getlbl_end().getLocation().x - 125 && c4 < p.getlbl_end().getLocation().x - 125 && c5 < p.getlbl_end().getLocation().x - 125){
                    eti.setLocation(eti.getLocation().x + 10, eti.getLocation().y);
                    p.repaint();
                }else{
                    break;
                }
            }catch (InterruptedException e){
                System.out.println(e);
            }
            if(eti.getLocation().x >= p.getlbl_end().getLocation().x - 125){
                if(c1>c2 && c1>c3 && c1>c4 && c1>c5){
                    JOptionPane.showMessageDialog(null, "Gano el primer auto");
                }
            }
        }
    }
}
