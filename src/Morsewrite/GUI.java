package Morsewrite;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class GUI {
    
    private static GUI instance;
    
    private JFrame gui;
    
    private JLabel morsecode;
    
    private JButton exit,morse,demorse,play;
    
    private JTextArea text;
    
    private GUI()
    {
        createGUI();
        createButtons();
        createTextField();
        createMorseLabel();
        gui.setVisible(true);
        Hello myHello = new Hello();
    }
    
    private void createGUI()
    {
        gui = new JFrame();
        gui.setSize(900,600);
        gui.setLayout(null);
        gui.setResizable(false);
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setLocationRelativeTo(null);
    }
    
    private void createButtons()
    {
        morse = new JButton("MORSE (dont try with to long textes)");
        morse.setBounds(0,400,300,200);
        morse.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                Morse myMorse = new Morse();
            }
        });
        
        demorse = new JButton("DEMORSE (dont try with to long textes)");
        demorse.setBounds(300,400,300,200);
        demorse.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                DeMorse myDeMorse = new DeMorse();
            }
        });
        
        play = new JButton("PLAY >>>");
        play.setBounds(0,340,300,50);
        play.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                Sound myS = new Sound();
            }
        });
        
        exit = new JButton("EXIT");
        exit.setBounds(600,400,300,200);
        exit.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                System.exit(0);
            }
        });
        
        gui.add(exit);
        gui.add(morse);
        gui.add(play);
        gui.add(demorse);
    }
    
    private void createTextField()
    {
        text = new JTextArea("enter text here");
        text.setBounds(10,10,440,340);
        text.setLineWrap(true);
        
        gui.add(text);
    }
    
    private void createMorseLabel()
    {
        morsecode = new JLabel();
        morsecode.setBounds(450,0,450,400);
        morsecode.setLayout(null);
        morsecode.setHorizontalAlignment(JLabel.LEFT);
        morsecode.setVerticalAlignment(JLabel.TOP);
        morsecode.setText("<html><head><h1>MORSE CODE</h1></head><body><table>"
                + "<tr><th>LETTER</th><th>MORSE CODE</th><th>LETTER</th><th>MORSE CODE</th><th>space</th><th>  |  </th></tr>"
                + "<tr><th>A</th><th>. -</th><th>N</th><th>- .</th></tr>"
                + "<tr><th>B</th><th>- . . .</th><th>O</th><th>- - -</th><th>long signal</th><th>-</th></tr>"
                + "<tr><th>C</th><th>- . - .</th><th>P</th><th>. - - .</th><th>short signal</th><th>.</th></tr>"
                + "<tr><th>D</th><th>- . .</th><th>Q</th><th>- - . -</th></tr>"
                + "<tr><th>E</th><th>.</th><th>R</th><th>. - .</th></tr>"
                + "<tr><th>F</th><th>. . - .</th><th>S</th><th>. . .</th></tr>"
                + "<tr><th>G</th><th>- - .</th><th>T</th><th>-</th></tr>"
                + "<tr><th>H</th><th>. . . .</th><th>U</th><th>. . -</th></tr>"
                + "<tr><th>I</th><th>. .</th><th>V</th><th>. . . -</th></tr>"
                + "<tr><th>J</th><th>. - - -</th><th>W</th><th>. - -</th></tr>"
                + "<tr><th>K</th><th>- . -</th><th>X</th><th>- . . -</th></tr>"
                + "<tr><th>L</th><th>. - . .</th><th>Y</th><th>- . - -</th></tr>"
                + "<tr><th>M</th><th>- -</th><th>Z</th><th>- - . .</th></tr>"
                + "</table></body></html>");
        
        gui.add(morsecode);
    }
    
    public JTextArea getTextArea()
    {
        return text;
    }
    
    public static GUI getInstance()
    {
        return instance;
    }
    
    public static void main(String[]args)
    {
        instance = new GUI();
    }
    
}
