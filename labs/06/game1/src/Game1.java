
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
                if(c1 < p.getlbl_end().getLocation().x - 200 && c2 < p.getlbl_end().getLocation().x - 200 && c3 < p.getlbl_end().getLocation().x - 200 && c4 < p.getlbl_end().getLocation().x - 200 && c5 < p.getlbl_end().getLocation().x - 200){
                    eti.setLocation(eti.getLocation().x + 20, eti.getLocation().y);
                    p.repaint();
                }else{
                    break;
                }
            }catch (InterruptedException e){
                System.out.println(e);
            }
            if(eti.getLocation().x >= p.getlbl_end().getLocation().x - 200){
                if(c1>c2 && c1>c3 && c1>c4 && c1>c5){
                    JOptionPane.showMessageDialog(null, "Gano el primer auto");
                }else if(c2>c1 && c2>c3 && c2>c4 && c2>c5){
                    JOptionPane.showMessageDialog(null, "Gano el segundo auto");
                }else if(c3>c1 && c3>c2 && c3>c4 && c3>c5){
                    JOptionPane.showMessageDialog(null, "Gano el tercero auto");
                }else if(c4>c1 && c4>c2 && c4>c3 && c4>c5){
                    JOptionPane.showMessageDialog(null, "Gano el cuarto auto");
                }else if(c5>c1 && c5>c2 && c5>c3 && c5>c4){
                    JOptionPane.showMessageDialog(null, "Gano el quinto auto");
                }else if(p.getlbl1().getLocation().x==p.getlbl2().getLocation().x && c1>c3 && c1>c4 && c1>c5){
                    JOptionPane.showMessageDialog(null, "Empate entre auto 1 y auto 2");
                }else if(c1>c2 && p.getlbl1().getLocation().x==p.getlbl3().getLocation().x && c1>c4 && c1>c5){
                    JOptionPane.showMessageDialog(null, "Empate entre auto 1 y auto 3");
                }else if(c1>c2 && c1>c3 && p.getlbl1().getLocation().x==p.getlbl4().getLocation().x && c1>c5){
                    JOptionPane.showMessageDialog(null, "Empate entre auto 1 y auto 4");
                }else if(c1>c2 && c1>c3 && c1>c4 && p.getlbl1().getLocation().x==p.getlbl5().getLocation().x){
                    JOptionPane.showMessageDialog(null, "Empate entre auto 1 y auto 5");
                }else if(c1<c2 && p.getlbl2().getLocation().x==p.getlbl3().getLocation().x && c2>c4 && c2>c5){
                    JOptionPane.showMessageDialog(null, "Empate entre auto 2 y auto 3");
                }else if(c1<c2 && c2>c3 && p.getlbl2().getLocation().x==p.getlbl4().getLocation().x && c2>c5){
                    JOptionPane.showMessageDialog(null, "Empate entre auto 2 y auto 4");
                }else if(c1<c2 && c2>c3 && c2>c4 && p.getlbl2().getLocation().x==p.getlbl5().getLocation().x){
                    JOptionPane.showMessageDialog(null, "Empate entre auto 2 y auto 5");
                }else if(c3>c1 && c3>c2 && p.getlbl3().getLocation().x==p.getlbl4().getLocation().x && c3>c5){
                    JOptionPane.showMessageDialog(null, "Empate entre auto 3 y auto 4");
                }else if(c3>c1 && c3>c2 && c3>c4 && p.getlbl3().getLocation().x==p.getlbl5().getLocation().x){
                    JOptionPane.showMessageDialog(null, "Empate entre auto 3 y auto 5");
                }else if(c4>c1 && c4>c2 && c4>c3 && p.getlbl4().getLocation().x==p.getlbl5().getLocation().x){
                    JOptionPane.showMessageDialog(null, "Empate entre auto 4 y auto 5");
                }        
                else{
                     JOptionPane.showMessageDialog(null, "Empate");
                }  
            }
        }
    }
}
