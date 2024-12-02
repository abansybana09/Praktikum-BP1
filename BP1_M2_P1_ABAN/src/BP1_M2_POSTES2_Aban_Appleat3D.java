/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.applet.Applet;
import java.awt.*;

/**
 *
 * @author Suci Indah Lestari
 */
public class BP1_M2_POSTES2_Aban_Appleat3D extends Applet {

    @Override
    public void paint(Graphics g) {
        // Menggambar kubus sederhana
        g.drawRect(50, 50, 100, 100); // depan
        g.drawRect(80, 80, 100, 100); // belakang

        // Menghubungkan titik-titik antara dua kotak untuk membuat efek 3D
        g.drawLine(50, 50, 80, 80);
        g.drawLine(150, 50, 180, 80);
        g.drawLine(50, 150, 80, 180);
        g.drawLine(150, 150, 180, 180);
    }
}
