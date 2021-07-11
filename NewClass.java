
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author muradnabizade
 */
public class NewClass extends NewJFrame {
    public static void Main(String [] args){
        System.out.print("dd");
        NewJFrame obj = new NewJFrame();
        obj.setBounds(0,0,700,700);
        obj.setTitle("NotePad");
        obj.setVisible(true);
        obj.setResizable(false);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}
