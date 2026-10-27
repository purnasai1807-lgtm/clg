import java.awt.Color;
import java.awt.Component;
import java.awt.GridBagLayout;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class lab4 extends  MouseAdapter{
    JLabel x;
    public lab4(){
        JFrame fr = new JFrame();
        fr.setSize(699,699);
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        x =new JLabel();
        fr.add(x);
        fr.setLayout(new GridBagLayout());
        x.setAlignmentX(Component.CENTER_ALIGNMENT);
        x.setAlignmentY(Component.CENTER_ALIGNMENT);
        Font f = new Font("Verdana",Font.BOLD,20);
        x.setFont(f);
        x.setForeground(Color.GRAY);
        fr.addMouseListener(this);
        fr.addMouseMotionListener(this);
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
            new lab4(); 
    }
}