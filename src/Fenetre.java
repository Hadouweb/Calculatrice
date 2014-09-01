import javax.swing.*;
import java.awt.*;

public class Fenetre extends JFrame{
    private Panneau pan = new Panneau();

    public Fenetre(){
        this.setTitle("Animation");
        this.setSize(300, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setContentPane(pan);

        JPanel b1 = new JPanel();

        JPanel b2 = new JPanel();
        b2.setLayout(new GridLayout(4, 3, 5, 5));
        b2.add(new JButton("1"));
        b2.add(new JButton("2"));
        b2.add(new JButton("3"));
        b2.add(new JButton("4"));
        b2.add(new JButton("5"));
        b2.add(new JButton("6"));
        b2.add(new JButton("7"));
        b2.add(new JButton("8"));
        b2.add(new JButton("9"));
        b2.add(new JButton("0"));
        b2.add(new JButton("."));
        b2.add(new JButton("="));

        JPanel b3 = new JPanel();
        b3.setLayout(new BoxLayout(b3, BoxLayout.PAGE_AXIS));
        b3.add(new JButton("C"));
        b3.add(Box.createRigidArea(new Dimension(0, 10)));
        b3.add(new JButton("+"));
        b3.add(Box.createRigidArea(new Dimension(5, 10)));
        b3.add(new JButton("-"));
        b3.add(Box.createRigidArea(new Dimension(5, 10)));
        b3.add(new JButton("*"));
        b3.add(Box.createRigidArea(new Dimension(0, 10)));
        b3.add(new JButton("/"));

        JPanel content = new JPanel();
        content.setLayout(new BorderLayout());
        content.add(b1, BorderLayout.NORTH);
        content.add(b2, BorderLayout.WEST);
        content.add(b3, BorderLayout.EAST);

        this.getContentPane().add(content);
        this.setVisible(true);

    }

}