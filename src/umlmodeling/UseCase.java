
package umlmodeling;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class UseCase extends JPanel{
    public JLabel lbl;
    public JTextField txt;
    public int id;
    public UseCase(){
        super();        
        this.setLayout(null);
        lbl=new JLabel();
        txt=new JTextField();
        
        lbl.setIcon(new javax.swing.ImageIcon("E:\\Java\\Minor project\\UMLModeling\\UMLModeling\\images\\UseCase.GIF"));
        lbl.setBounds(0,0,276,72);
        lbl.setVisible(true);
        txt.setBounds(15,25,245,20);
        txt.setVisible(true);      
        txt.setBorder(null);
        //txt.setFont(new Font("Arial",0,10));
        txt.setHorizontalAlignment(JTextField.CENTER);        
        add(txt);
        add(lbl);
        this.addMouseMotionListener(new MouseMotionListener() {

            public void mouseDragged(MouseEvent e) {
                setLocation(e.getXOnScreen()-getWidth()/2 , e.getYOnScreen()-getHeight()/22-70);             
                //repaint();
            }

            public void mouseMoved(MouseEvent e) {
                
            }     
        });
    }
}
