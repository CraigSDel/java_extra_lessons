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
public class ExtractWords {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String t = "hello how are you today";

        StringToolsNS tS = new StringToolsNS(t);

        tS.pigLatin();

        System.out.println(tS);
    }
}
