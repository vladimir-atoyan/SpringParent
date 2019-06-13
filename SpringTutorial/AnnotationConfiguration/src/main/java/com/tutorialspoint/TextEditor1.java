package com.tutorialspoint;

import org.springframework.beans.factory.annotation.Autowired;

public class TextEditor1 {
    @Autowired
    private SpellChecker1 spellChecker;

    public TextEditor1() {
        System.out.println("Inside TextEditor1 constructor." );
    }
    public SpellChecker1 getSpellChecker( ){
        return spellChecker;
    }
    public void spellCheck(){
        spellChecker.checkSpelling();
    }
}