

package umlmodeling;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.*;
import javax.swing.*;

public class ModelClass extends JPanel{
    public Vector Variables=new Vector();
    public Vector Methods=new Vector();
    public Vector TextBoxes=new Vector();
    public String ClassName="";
    JTextField txtClassName;
    public int id=0;
    
    public void activate(){
        this.setBackground(Color.BLUE);
    }
    public void deActivate(){
        this.setBackground(Color.DARK_GRAY);
    }
    public ModelClass(String _cname){    
        super();
        this.setLayout(null);
        this.setBackground(Color.DARK_GRAY);
        this.setBorder(BorderFactory.createEtchedBorder());
        this.ClassName=_cname;
        Variables=new Vector();
        Methods=new Vector();
        TextBoxes=new Vector();
        this.addMouseMotionListener(new MouseMotionListener() {

            public void mouseDragged(MouseEvent e) {
                setLocation(e.getXOnScreen()-getWidth()/2 , e.getYOnScreen()-getHeight()/22-70);              
            }

            public void mouseMoved(MouseEvent e) {
                
            }     
        });
    }
    
    
    public void initialize(){
        JButton cmdAdd=new JButton();
        int top=20;
        this.removeAll();
        TextBoxes.clear();
        txtClassName=new JTextField();
        this.add(txtClassName);
        txtClassName.setText(ClassName);
        txtClassName.setBounds(0,20,this.getWidth()-20,20);
        txtClassName.setBackground(Color.YELLOW);
        txtClassName.setVisible(true);              
        for(int i=0;i<Variables.size();i++){
            top+=20;
            JTextField txt=new JTextField();
            this.add(txt);
            txt.setText(Variables.get(i).toString());
            txt.setBounds(0,top,this.getWidth(),20);
            txt.setVisible(true);              
            if(this.getHeight()<top+20){
                this.setBounds(this.getX(),this.getY(),this.getWidth(),this.getHeight()+20);                
            }
            TextBoxes.add(txt);
        }
        this.add(cmdAdd);
        cmdAdd.setText("+");
        cmdAdd.setBounds(this.getWidth() - 20,20,20,20);
        cmdAdd.setVisible(true);       
        cmdAdd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addVariable("");
            }
        });
    }
    
    public void updateVariables(){
        for(int i=0;i<TextBoxes.size();i++){
            JTextField txt=(JTextField)TextBoxes.get(i);
            Variables.set(i, txt.getText());
        }
        ClassName=txtClassName.getText();
    }
    
    public void addVariable(String vname){       
        updateVariables();
        Variables.add(vname);
        initialize();
    }
    
}
