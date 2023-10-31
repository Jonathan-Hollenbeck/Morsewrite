package Morsewrite;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Hello extends JFrame {
    
    private JLabel textBack;
    
    private JButton exit;
    
    private JFrame popup = this;
    
    public Hello()
    {
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(550, 350);
        this.setResizable(false);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        
        textBack = new JLabel();
        textBack.setBounds(25,25,450,300);
        textBack.setHorizontalAlignment(JLabel.CENTER);
        textBack.setVerticalAlignment(JLabel.TOP);
        textBack.setText("<html><head><h1>Hello</h1></head><body><h2>This programm is NOT finished!<br>if you use special charakters they WONT appear in the MORSE CODE</h2></body></html>");
        
        exit = new JButton("OK");
        exit.setBounds(225,250,100,50);
        exit.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                popup.dispose();
            }
        });
        
        this.add(textBack);
        this.add(exit);
        
        this.setVisible(true);
    }
    
}
