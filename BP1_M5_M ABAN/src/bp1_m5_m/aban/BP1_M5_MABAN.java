/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bp1_m5_m.aban;

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

/**
 *
 * @author Suci Indah Lestari
 */
public class BP1_M5_MABAN extends JPanel {
    
    public static final int L = 400, T = 400;
    List<Mobil> mobil1;
    public BP1_M5_MABAN() {
        setBackground (new Color(0, 0, 0));
        setLayout(null);
        mobil1 = new ArrayList();
        mobil1.add(new Mobil(100, 200));
        Timer timer = new Timer (50, new ActionListener ()
        {
            public void actionPerformed(ActionEvent e)
            {
                for (Mobil mobil : mobil1)
                {
                    mobil.Bergerak();
                    repaint();
                }
            }
        });
        timer.start();
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Mobil mobil : mobil1)
        {
            mobil.GambarMobil(g);
        }   
    }
    
    @Override
    public Dimension getPreferredSize(){
        return new Dimension(L, T);
    }
    
    public class Mobil {
        private static final int INCREMENT = 5 ;
        int x, y;
        public Mobil(int x, int y){
            this.x = x;
            this.y = y;
        }
        public void GambarMobil (Graphics g){
            g.setColor(Color.BLUE);
            g.fillRect(x + 5, y - 20, 60, 35);
            g.setColor(Color.yellow);
            g.fillRect(x, y, 110, 30);
            g.setColor(Color.red);
            g.fillOval(x + 15, y + 20, 20, 20);
            g.fillOval(x + 60, y + 20, 20, 20);
        }
        public void Bergerak(){
            if (x == L)
            { x  = 1;}
            else {
                { x += INCREMENT; }
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SwingUtilities.invokeLater(new Runnable(){
        public void run() {
            JFrame frame = new JFrame();
            frame.getContentPane().add(new BP1_M5_MABAN ());
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setTitle("ANIMASI MOBIL BERGERAK");
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        }
    });
    }
    
}
