import javax.swing.JFrame;
import javax.swing.JLable;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
public class lab12 implements MouseListener,MouseMotionListener {
    public lab12(){
        JFrame fr = new JFrame();
        fr.setSize(700,700);
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    @override
    public void mouseClicked(MouseEvent e){
        x.setText("mouse pressed");
    }
    @override
    public void mousePresed()
    public static void main(String args[]){
        new lab12();
        
    }
    
}
