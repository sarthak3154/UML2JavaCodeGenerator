/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.security.Key;
import javax.crypto.*;
import javax.swing.JOptionPane;
public class NewClass {
    public static void main(String args[]){
        try{
            KeyGenerator kg = KeyGenerator.getInstance("DES");
            Key key = kg.generateKey();            
            Cipher cipher=Cipher.getInstance("DES");
            cipher.init(Cipher.ENCRYPT_MODE, key);
            byte[] data="Hello".getBytes();
            byte[] result=cipher.doFinal(data);
            System.out.println(result);
            
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        
    }
}
