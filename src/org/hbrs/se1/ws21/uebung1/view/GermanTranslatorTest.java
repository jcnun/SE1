package org.hbrs.se1.ws21.uebung1.view;

import org.hbrs.se1.ws21.uebung1.control.GermanTranslator;

public class GermanTranslatorTest {
    public static void main(String[] args){
        GermanTranslator g = new GermanTranslator();
        System.out.println(g.translateNumber(8));
        System.out.println(g.translateNumber(35));
        System.out.println(g.translateNumber(-8));
        System.out.println(g.translateNumber(0));
    }


}


