package Morsewrite;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

public class PopUp extends JFrame {
    
    private JLabel textBack;
    
    private JButton exit;
    
    private JFrame popup = this;
    
    public PopUp(String ptext)
    {
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(550, 350);
        this.setResizable(false);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        
        textBack = new JLabel();
        textBack.setBounds(25,25,450,300);
        textBack.setHorizontalAlignment(JLabel.LEFT);
        textBack.setVerticalAlignment(JLabel.TOP);
        textBack.setText("<html><head><h4>your (de)morsed text/code: </h4></head><body><h1>"+ptext+"</h1></body></html>");
        
        exit = new JButton("BACK");
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
