/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class BP1_M2_POSTES1_Aban_AppleatMouse extends Applet implements MouseMotionListener {

    public void init() {
        addMouseMotionListener(this);
        setBackground(Color.blue);
    }

    public void mouseDragged(MouseEvent me) {
        Graphics g = getGraphics();
        g.setColor(Color.white);
        g.fillOval(me.getX(), me.getY(), 10, 10);
    }

    public void mouseMoved(MouseEvent me) {
    }
}
