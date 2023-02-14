import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ArrowKeyDetector {

    public ArrowKeyDetector() {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setFocusable(true);

        JPanel panel = new JPanel();
        JLabel up = new JLabel();
        JLabel down = new JLabel();
        JLabel left = new JLabel();
        JLabel right = new JLabel();

        panel.add(up);
        panel.add(down);
        panel.add(left);
        panel.add(right);

        up.setText("Up: 0f");
        down.setText("Down: 0");
        left.setText("Left: 0");
        right.setText("Right: 0");

        frame.addKeyListener(new KeyListener() {

            int upCount = 0;
            int downCount = 0;
            int leftCount = 0;
            int rightCount = 0;

            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();
                switch(keyCode) {
                    case KeyEvent.VK_UP:
                        up.setText("Up: " + Integer.toString(++upCount));
                        System.out.println(keyCode);
                        break;
                    case KeyEvent.VK_DOWN:
                        down.setText("Down: " + Integer.toString(++downCount));
                        System.out.println(keyCode);
                        break;
                    case KeyEvent.VK_LEFT:
                        left.setText("Left: " + Integer.toString(++leftCount));
                        System.out.println(keyCode);
                        break;
                    case KeyEvent.VK_RIGHT:
                        right.setText("Right: " + Integer.toString(++rightCount));
                        System.out.println(keyCode);
                        break;
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });

        frame.add(panel);

    }
    public static void main(String[] args) {
        new ArrowKeyDetector();
    }
}
