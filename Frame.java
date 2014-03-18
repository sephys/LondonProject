package london;
import java.awt.*;
import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Joke
 * Représente la fenêtre principale du jeu
 */
public class Frame extends JFrame{
    
    
    public Frame() {
        this.setTitle("London");
        this.setSize(1000,1000);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        this.setVisible(true);
    }
    
    public void start(){
        this.setContentPane(new Plateau());
    }
    
    public void setting(){
        JPanel p=new JPanel(new BorderLayout());
        
        JTextField jt=new JTextField("Nombre de joueurs : ");
        JComboBox jc=new JComboBox();
        jc.addItem("2 joueurs");
        jc.addItem("3 joueurs");
        jc.addItem("4 joueurs");
        p.add(jt);
        p.add(jc);
        this.add(p,BorderLayout.SOUTH);
    }
            
    
    
}
