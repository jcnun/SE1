package org.hbrs.se1.ws21.uebung1.view;

import org.hbrs.se1.ws21.uebung1.control.*;

public class Software {

    public static Translator createTranslator(){
        return new GermanTranslator();
    }
}
