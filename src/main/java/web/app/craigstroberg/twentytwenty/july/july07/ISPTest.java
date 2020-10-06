/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web.app.craigstroberg.twentytwenty.july.july07;

import java.util.Arrays;

/**
 *
 * @author craigstroberg
 */
public class ISPTest {
    
    public static void main(String[] args) {
        //197.189.239.185,65536,Hetzner (Pty) Ltd,01/07/10
        ISP isp = new ISP("197.189.239.255", 65536, "Hetzner (Pty) Ltd", "01/07/10");
        System.out.println(isp.validIP());
    }
    
}
