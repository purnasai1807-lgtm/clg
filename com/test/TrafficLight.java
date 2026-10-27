import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
public class TrafficLight extends JFrame implements ActionListener {
    JLabel l;
    JRadioButton r, y, g;
    TrafficLight() {
        setTitle("Traffic Light");
        setSize(400, 250);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        l = new JLabel("");
        l.setFont(new Font("Arial", Font.BOLD, 25));
        add(l);
        r = new JRadioButton("Red");
        y = new JRadioButton("Yellow");
        g = new JRadioButton("Green");
        ButtonGroup bg = new ButtonGroup();
        bg.add(r);
        bg.add(y);
        bg.add(g);
        add(r);
        add(y);
        add(g);
        r.addActionListener(this);
        y.addActionListener(this);
        g.addActionListener(this);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        if (r.isSelected()) {
            l.setText("STOP");
            l.setForeground(Color.RED);
        }
        if (y.isSelected()) {
            l.setText("READY");
            l.setForeground(Color.YELLOW);
        }
        if (g.isSelected()) {
            l.setText("GO");
            l.setForeground(Color.GREEN);
        }
    }
    public static void main(String[] args) {
        new TrafficLight();
    }
}