
package umlmodeling;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Actor extends JPanel{
    public JLabel lbl;
    public JTextField txt;
    public int id;
    public Actor(){
        super();        
        this.setLayout(null);
        lbl=new JLabel();
        txt=new JTextField();
        add(lbl);
        lbl.setIcon(new javax.swing.ImageIcon("E:\\Java\\Minor project\\UMLModeling\\UMLModeling\\images\\actor.GIF"));
        lbl.setBounds(0,0,63,126);
        lbl.setVisible(true);
        txt.setBounds(0,127,63,20);
        txt.setVisible(true);      
        txt.setBorder(null);
        txt.setFont(new Font("Arial",0,14));
        txt.setHorizontalAlignment(JTextField.CENTER);        
        add(txt);
        this.addMouseMotionListener(new MouseMotionListener() {

            public void mouseDragged(MouseEvent e) {
                setLocation(e.getXOnScreen()-getWidth()/2 , e.getYOnScreen()-getHeight()/22-70);              
            }

            public void mouseMoved(MouseEvent e) {
                
            }     
        });
    }
}
