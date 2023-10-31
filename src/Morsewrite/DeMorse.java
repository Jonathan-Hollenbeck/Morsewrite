package Morsewrite;

public class DeMorse {
    
    private GUI myGUI = GUI.getInstance();
    private PopUp myPopUp;
    
    public DeMorse()
    {
        deMorse();
    }
    
    private void deMorse()
    {
        String text = myGUI.getTextArea().getText();
        if(text.length()>700)
        {
            myGUI.getTextArea().setText("SORRY YOUR TEXT IS TOO LONG (700 letters are maximum you have "+text.length()+")");
        }
        else
        {
            String demorsedText = new String();
            String[] textArray = new String[text.length()];
            for(int i = 0;i<text.length();i++)
            {
                textArray[i] = String.valueOf(text.charAt(i));
                demorsedText = demorsedText+check(textArray,i);
            }
            myGUI.getTextArea().setText(demorsedText);
            myPopUp = new PopUp(demorsedText);
        }
    }
    
    private String check(String[] pTextArray, int current)
    {
        if(pTextArray[current].equals("|"))
        {
            return " ";
        }
        if(pTextArray[current].equals(" ")||current==pTextArray.length-1)
        {
            int k=0;
            for(int t=current;t>=0;k++,t--)
            {
                if(t==0||pTextArray[t-1].equals(" "))
                {
                    String ptext = "";
                    for(int r=k;r>=0;r--){
                        ptext = ptext+pTextArray[current-r];
                    }
                    if(current==pTextArray.length-1)
                    {
                        ptext+=" ";
                    }
                    if(ptext.equals(".- "))
                    {
                        return "a";
                    }
                    if(ptext.equals("-... "))
                    {
                        return "b";
                    }
                    if(ptext.equals("-.-. "))
                    {
                        return "c";
                    }
                    if(ptext.equals("-.. "))
                    {
                        return "d";
                    }
                    if(ptext.equals(". "))
                    {
                        return "e";
                    }
                    if(ptext.equals("..-. "))
                    {
                        return "f";
                    }
                    if(ptext.equals("--. "))
                    {
                        return "g";
                    }
                    if(ptext.equals(".... "))
                    {
                        return "h";
                    }
                    if(ptext.equals(".. "))
                    {
                        return "i";
                    }
                    if(ptext.equals(".--- "))
                    {
                        return "j";
                    }
                    if(ptext.equals("-.- "))
                    {
                        return "k";
                    }
                    if(ptext.equals(".-.. "))
                    {
                        return "l";
                    }
                    if(ptext.equals("-- "))
                    {
                        return "m";
                    }
                    if(ptext.equals("-. "))
                    {
                        return "n";
                    }
                    if(ptext.equals("--- "))
                    {
                        return "o";
                    }
                    if(ptext.equals(".--. "))
                    {
                        return "p";
                    }
                    if(ptext.equals("--.- "))
                    {
                        return "q";
                    }
                    if(ptext.equals(".-. "))
                    {
                        return "r";
                    }
                    if(ptext.equals("... "))
                    {
                        return "s";
                    }
                    if(ptext.equals("- "))
                    {
                        return "t";
                    }
                    if(ptext.equals("..- "))
                    {
                        return "u";
                    }
                    if(ptext.equals("...- "))
                    {
                        return "v";
                    }
                    if(ptext.equals(".-- "))
                    {
                        return "w";
                    }
                    if(ptext.equals("-..- "))
                    {
                        return "x";
                    }
                    if(ptext.equals("-.-- "))
                    {
                        return "y";
                    }
                    if(ptext.equals("--.. "))
                    {
                        return "z";
                    }
                }
            }
        }
        return "";
    }
    
}
