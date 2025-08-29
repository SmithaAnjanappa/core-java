package com.xworkz.languageapp;

import com.xworkz.languageapp.kannada.Kannada;
import com.xworkz.languageapp.language.Language;

public class LanguageRunner {
    public static void main(String[] args) {
        Language language=new Kannada();
        language.whenToSpeakLanguage();
    }
}
