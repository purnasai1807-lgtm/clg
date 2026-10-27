import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class labno12 implements MouseListener, MouseMotionListener{
    JLabel x;
    public labno12(){
        JFrame fr = new JFrame();
        fr.setSize(699,699);
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        x =new JLabel();
        fr.add(x);
        fr.addMouseListener(this);
        fr.addMouseMotionListener(this);
        fr.setLayout(new FlowLayout());
    }
    @Override 
    public void mouseClicked(MouseEvent e){
        x.setText("Mouse Clicked");
    }
    public void mousePressed(MouseEvent e){
        x.setText("Mouse Pressed");  
    }
    public void mouseReleased(MouseEvent e){
        x.setText("Mouse Released");
    }
    public void mouseEntered(MouseEvent e){
        x.setText("Mouse Entered");
    }
    public void mouseExited(MouseEvent e){
        x.setText("Mouse Exited");
    }
    public void mouseDragged(MouseEvent e){
        x.setText("Mouse Dragged");
    }
    public void mouseMoved(MouseEvent e){
        x.setText("Mouse Moved");
    }
    public static void main(String[] args){
            new labno12(); 
    }
}