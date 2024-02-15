/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package probarcr;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author cespi
 */
public class Threadmovimiento extends Thread{
    private JLabel p;

    public Threadmovimiento(JLabel p) {
        this.p = p;
    }
    
    @Override
    public void run(){
        while(true){
            p.setLocation(p.getX()-10, p.getY()-10);
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                Logger.getLogger(Threadmovimiento.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
