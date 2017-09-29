/**
 * Created by jc428741 on 29/09/17.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;

public class JBookQuote extends JFrame implements ActionListener
{
    JButton showAuthor = new JButton("Show Author");


    public JBookQuote(){
        super("book quote");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        showAuthor.addActionListener(this);
        add (new JLabel("'haHaa look at me i'm Frodo the hobbit guy'"));
        add (showAuthor);
    }
    public static void main(String[] arguments)
    {
        JFrame cframe = new JBookQuote();
        cframe.setSize(350,150);
        cframe.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e){

    }
}