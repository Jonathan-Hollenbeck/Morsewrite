package Morsewrite;

public class Morse {
    
    private GUI myGUI = GUI.getInstance();
    private PopUp myPopUp;
    
    public Morse()
    {
        morse();
    }
    
    private void morse()
    {
        String text = myGUI.getTextArea().getText();
        if(text.length()>2000)
        {
            myGUI.getTextArea().setText("SORRY YOUR TEXT IS TOO LONG (2000 letters are maximum you have "+text.length()+")");
        }
        else
        {
            String morsedText = new String();
            String[] textArray = new String[text.length()];
            for(int i = 0;i<text.length();i++)
            {
                textArray[i] = String.valueOf(text.charAt(i));
                morsedText = morsedText+check(textArray,i);
                if(i!=textArray.length-1)
                {
                    morsedText+=" ";
                }
            }
            myGUI.getTextArea().setText(morsedText);
            myPopUp = new PopUp(morsedText);
        }
    }
    
    private String check(String[] pTextArray, int current)
    {
        if(pTextArray[current].equals(" "))
        {
            return " | ";
        }
        if(pTextArray[current].equals("A")||pTextArray[current].equals("a"))
        {
            return ".-";
        }
        if(pTextArray[current].equals("B")||pTextArray[current].equals("b"))
        {
            return "-...";
        }
        if(pTextArray[current].equals("C")||pTextArray[current].equals("c"))
        {
            return "-.-.";
        }
        if(pTextArray[current].equals("D")||pTextArray[current].equals("d"))
        {
            return "-..";
        }
        if(pTextArray[current].equals("E")||pTextArray[current].equals("e"))
        {
            return ".";
        }
        if(pTextArray[current].equals("F")||pTextArray[current].equals("f"))
        {
            return "..-.";
        }
        if(pTextArray[current].equals("G")||pTextArray[current].equals("g"))
        {
            return "--.";
        }
        if(pTextArray[current].equals("H")||pTextArray[current].equals("h"))
        {
            return "....";
        }
        if(pTextArray[current].equals("I")||pTextArray[current].equals("i"))
        {
            return "..";
        }
        if(pTextArray[current].equals("J")||pTextArray[current].equals("j"))
        {
            return ".---";
        }
        if(pTextArray[current].equals("K")||pTextArray[current].equals("k"))
        {
            return "-.-";
        }
        if(pTextArray[current].equals("L")||pTextArray[current].equals("l"))
        {
            return ".-..";
        }
        if(pTextArray[current].equals("M")||pTextArray[current].equals("m"))
        {
            return "--";
        }
        if(pTextArray[current].equals("N")||pTextArray[current].equals("n"))
        {
            return "-.";
        }
        if(pTextArray[current].equals("O")||pTextArray[current].equals("o"))
        {
            return "---";
        }
        if(pTextArray[current].equals("P")||pTextArray[current].equals("p"))
        {
            return ".--.";
        }
        if(pTextArray[current].equals("Q")||pTextArray[current].equals("q"))
        {
            return "--.-";
        }
        if(pTextArray[current].equals("R")||pTextArray[current].equals("r"))
        {
            return ".-.";
        }
        if(pTextArray[current].equals("S")||pTextArray[current].equals("s"))
        {
            return "...";
        }
        if(pTextArray[current].equals("T")||pTextArray[current].equals("t"))
        {
            return "-";
        }
        if(pTextArray[current].equals("U")||pTextArray[current].equals("u"))
        {
            return "..-";
        }
        if(pTextArray[current].equals("V")||pTextArray[current].equals("v"))
        {
            return "...-";
        }
        if(pTextArray[current].equals("W")||pTextArray[current].equals("w"))
        {
            return ".--";
        }
        if(pTextArray[current].equals("X")||pTextArray[current].equals("x"))
        {
            return "-..-";
        }
        if(pTextArray[current].equals("Y")||pTextArray[current].equals("y"))
        {
            return "-.--";
        }
        if(pTextArray[current].equals("Z")||pTextArray[current].equals("z"))
        {
            return "--..";
        }
        return "";
    }
    
}
