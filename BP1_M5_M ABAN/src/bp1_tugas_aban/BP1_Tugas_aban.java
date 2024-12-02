/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Suci Indah Lestari
 */
package bp1_tugas_aban;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

public class BP1_Tugas_aban extends JPanel {

    public static final int L = 400, T = 400;
    List<Bola> bolaList;

    public BP1_Tugas_aban () {
        setBackground(new Color(0, 0, 0));
        setLayout(null);
        bolaList = new ArrayList<>();
        bolaList.add(new Bola(100, 200, 5, 5, Color.RED));
        bolaList.add(new Bola(200, 100, -3, 4, Color.GREEN));
        bolaList.add(new Bola(150, 150, 6, -2, Color.BLUE));

        Timer timer = new Timer(50, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                for (Bola bola : bolaList) {
                    bola.bergerak();
                    repaint();
                }
            }
        });
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Bola bola : bolaList) {
            bola.gambarBola(g);
        }
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(L, T);
    }

    public class Bola {
        private static final int DIAMETER = 30;
        int x, y, dx, dy;
        Color color;

        public Bola(int x, int y, int dx, int dy, Color color) {
            this.x = x;
            this.y = y;
            this.dx = dx;
            this.dy = dy;
            this.color = color;
        }

        public void gambarBola(Graphics g) {
            g.setColor(color);
            g.fillOval(x, y, DIAMETER, DIAMETER);
        }

        public void bergerak() {
            x += dx;
            y += dy;

            // Pantulan pada tepi
            if (x <= 0 || x + DIAMETER >= L) {
                dx = -dx;
            }
            if (y <= 0 || y + DIAMETER >= T) {
                dy = -dy;
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame();
                frame.getContentPane().add(new BP1_Tugas_aban());
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setTitle("ANIMASI BOLA BERWARNA-WARNI");
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }
}

