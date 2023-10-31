/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Morsewrite;

import java.io.File;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;

/**
 *
 * @author Jonny
 */
public class Sound {
    
    private GUI myGUI = GUI.getInstance();
    
    public Sound()
    {
        lookText();
    }
    
    private void lookText()
    {
        String text = myGUI.getTextArea().getText();
        String[] textArray = new String[text.length()];
        for(int i = 0;i<text.length();i++)
        {
            textArray[i] = String.valueOf(text.charAt(i));
            if(textArray[i].equals("-"))
            {
                playsound("dah");
            }
            if(textArray[i].equals("."))
            {
                playsound("dit");
            }
            if(textArray[i].equals(" "))
            {
                playsound("empty");
            }
        }
    }
    
    private void playsound(String filename)
    {
        try{
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("Sounds/"+filename+".wav"));
            AudioFormat af     = audioInputStream.getFormat();
            int size      = (int) (af.getFrameSize() * audioInputStream.getFrameLength());
            byte[] audio       = new byte[size];
            DataLine.Info info      = new DataLine.Info(Clip.class, af, size);
            audioInputStream.read(audio, 0, size);
           
            Clip clip = (Clip) AudioSystem.getLine(info);
            clip.open(af, audio, 0, size);
            clip.start();
            while(clip.getMicrosecondLength() != clip.getMicrosecondPosition()){}
        }catch(Exception e){ e.printStackTrace(); }
    }
    
}
