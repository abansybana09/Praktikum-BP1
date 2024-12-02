/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Applet.java to edit this template
 */

import java.applet.Applet;
import java.awt.*;

/**
 *
 * @author Suci Indah Lestari
 */
public class Applet_M2_P1 extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        // TODO start asynchronous download of heavy resources
    }
    
    public void paint(Graphics g){
        Font f = new Font("Comic Sans MS", Font.BOLD, 20);
        g.setFont(f);
        g.setColor(Color.red);
        int xPusat = this.getSize().width/2;
        int yPusat = this.getSize().height/2;
        String s = "Ayo Belajar Java Applet!!";
        FontMetrics fm = this.getFontMetrics(f);
        int posisiX = xPusat - (fm.stringWidth(s)/2);
        g.drawString("Ayooo Belajar Java Applet", posisiX, yPusat);
    }

    // TODO overwrite start(), stop() and destroy() methods
}
