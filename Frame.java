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
        
        JLabel jt=new JLabel("Nombre de joueurs : ");
        JButton jb=new JButton("Jouer");
        JComboBox jc=new JComboBox();
        jc.addItem("2 joueurs");
        jc.addItem("3 joueurs");
        jc.addItem("4 joueurs");
        p.add(jt,BorderLayout.WEST);
        p.add(jc,BorderLayout.CENTER);
        p.add(jb,BorderLayout.EAST);
        this.add(p,BorderLayout.SOUTH);
        
        this.setVisible(true);
    }
            
    
    
}
