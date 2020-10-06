/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web.app.craigstroberg.twentytwenty.july.july07;

/**
 *
 * @author craigstroberg
 */
public class StringToolsNS {

    private String str;

    StringToolsNS(String s) {
        str = s;
    }

    public String getString() {
        return str;
    }

    public void setString(String nS) {
        str = nS;
    }
    
    public int countWords() {
        String temp = " " + str;
        int numWords = 0;
        char prev, curr;
        for (int loop = 1; loop < temp.length(); loop++) {
            prev = temp.charAt(loop - 1);
            curr = temp.charAt(loop);
            if (Character.isLetter(prev) == false && 
                    (Character.isLetter(curr) == true || Character.isDigit(curr) == true)) {
                numWords++; //numWords = numWords + 1;
            }//if
        }//for
        return numWords;
    }//countWords

    public void firstCaps() {
        String temp = " " + str; // Avoided a null pointer because there was an added space and it helps with the loop
        temp = temp.toLowerCase(); // HELLO -> hello  
        String newStr = "";
        char prev, curr;
        
        for (int loop = 1; loop < temp.length(); loop++) {
            prev = temp.charAt(loop - 1);
            curr = temp.charAt(loop);

            if (Character.isLetter(prev) == false && Character.isLetter(curr)) {
                newStr = newStr + Character.toUpperCase(curr);
            }//if
            else {
                newStr = newStr + curr;
            }//else
        }//for
        str = newStr;
    } //firstCaps

    public void removeVowels() {
        String temp = " " + str;
        String newStr = "";
        char prev, curr;
        final String VOWELS = "aeiouAEIOU";

        for (int i = 1; i <= temp.length() - 1; i++) {
            prev = temp.charAt(i - 1);
            curr = temp.charAt(i);

            if (Character.isLetter(prev) == false && VOWELS.indexOf(curr) >= 0 
                    || VOWELS.indexOf(curr) == -1) {
                newStr = newStr + curr;
            }//if
        }//for
        str = newStr;
    }

    private String encodeWord(String w) {
        final String VOWELS = "aeiouAEIOU";

        if (VOWELS.indexOf(w.charAt(0)) == -1) {
            w = w.substring(1) + w.charAt(0);
        }

        w = w + "ay";
        return w;
    }

    public void pigLatin() {
        String singleWord, temp = " " + str + " "; // Create single word and temp with a space on both ends
        int begin = 0; // Set the number of laps jane has run to 0
        String pigStr = " "; // String to store what we want to pigify
        char prev, curr; // create two place holders for the perv and current char in the string
        //start the array at 1 because jane is handed the space (zero character)  and beth holds the first character
        for (int loop = 1; loop <= temp.length() - 1; loop++) {
            prev = temp.charAt(loop - 1);
            curr = temp.charAt(loop);
            // check if the prev is not a letter and that the current is 
            boolean prevIsACharacter = Character.isLetter(prev) ;
            boolean currentIsACharacter = Character.isLetter(curr);
            if (prevIsACharacter == false && currentIsACharacter == true) {
                begin = loop; // set where we want to start chopping from
            }            
            // inverse the above 
            // check if the prev is a letter and that the current is not
            if (prevIsACharacter == true && currentIsACharacter == false) {
                //we want to then chop the word 
                singleWord = temp.substring(begin, loop);//chop from the beginning to where we are in the loop
                pigStr = pigStr + encodeWord(singleWord) + " ";// add ay
            }//endif
        }//endfor
        str = pigStr;
    }//end PigLatin

    @Override
    public String toString() {
        return "The string is " + str;
    }//toString
}//StringToolsNS
