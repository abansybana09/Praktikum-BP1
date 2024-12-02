/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.applet.Applet;
import java.awt.*;

public class BP1_M2_Tugas2_Aban_AppleteAnimasi extends Applet implements Runnable {
    int x = 0; // Posisi awal lingkaran
    int y = 50; // Posisi vertikal lingkaran
    Thread animasiThread;

    public void init() {
        setBackground(Color.green);
        animasiThread = new Thread(this);
        animasiThread.start();
    }

    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.fillOval(x, y, 100, 100); // Gambar lingkaran
    }

    public void run() {
        while (true) {
            x += 20; // Gerakkan lingkaran ke kanan
            if (x > getWidth()) {
                x = 0; // Kembali ke awal ketika mencapai batas kanan
            }
            repaint();
            try {
                Thread.sleep(10); // Kecepatan animasi
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
