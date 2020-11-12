package lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class Sweeper extends JFrame {
    private Game game;
    private JPanel panel;
    private JLabel label;
    private final int cols = 9;
    private final int rows = 9;
    private final int bombs = 10;
    private final int image_size = 50;

    public static void main(String[] args) {
        new Sweeper();
    }

    private Sweeper() {
        game = new Game(cols, rows, bombs);
        game.start();
        setImages();
        initLabel();
        initPanel();
        initFrame();
    }


    private void initLabel() {
        label = new JLabel("Добро");
        add(label, BorderLayout.SOUTH);

    }

    private void initPanel() {
        panel = new JPanel() {

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponents(g);
                for (Coord coord : Ranges.getAllCoords()) {
                    g.drawImage((Image) game.getBox(coord).image,
                            coord.x * image_size,
                            coord.y * image_size,
                            this);
                }
            }
        };

        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                int x = e.getX() / image_size;
                int y = e.getY() / image_size;
                Coord coord = new Coord(x, y);
                if (e.getButton() == MouseEvent.BUTTON1)
                    game.pressLeftButton(coord);
                if (e.getButton() == MouseEvent.BUTTON3)
                    game.pressRightButton(coord);
                if (e.getButton() == MouseEvent.BUTTON2)
                    game.start();
                label.setText(getMessage());
                panel.repaint();
            }
        });

        panel.setPreferredSize(new Dimension
                (Ranges.getSize().x * image_size,
                        Ranges.getSize().y * image_size));
        add(panel);
    }

    private String getMessage() {
        switch (game.getState()) {
            case played:
                return "Вы в игре";
            case bombed:
                return "ТЫ ПРОИГРАЛ!!!";
            case winner:
                return "УРА!!! ТЫ Выиграл";
            default:
                return ("Добро пожаловать");
        }
    }

    private void initFrame() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("САПЁР");
        setResizable(false);
        setIconImage(getImage("icon"));
        setVisible(true);
        pack();
        setLocationRelativeTo(null);
    }

    private void setImages() {
        for (Box box : Box.values())
            box.image = getImage(box.name());
    }

    private Image getImage(String name) {
        String filename = name.toLowerCase() + ".png";
        ImageIcon icon = new ImageIcon(getClass().getResource(filename));
        return icon.getImage();
    }
}
