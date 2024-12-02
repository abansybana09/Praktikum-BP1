import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class well extends JPanel implements ActionListener {
    private Timer timer;
    private int x = 0;
    private int y = 0;
    private int velX = 2;
    private int velY = 2;

    public well () {
        timer = new Timer(10, this);
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.fillOval(x, y, 50, 50);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (x + velX < 0 || x + velX > getWidth() - 50) {
            velX = -velX;
        }
        if (y + velY < 0 || y + velY > getHeight() - 50) {
            velY = -velY;
        }
        x += velX;
        y += velY;
        repaint();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Animation");
        well animation = new well();
        frame.add(animation);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
