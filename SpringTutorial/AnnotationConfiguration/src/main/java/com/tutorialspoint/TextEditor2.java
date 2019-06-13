package com.tutorialspoint;

import org.springframework.beans.factory.annotation.Autowired;

public class TextEditor2 {
    private SpellChecker2 spellChecker;

    @Autowired
    public TextEditor2(SpellChecker2 spellChecker) {
        System.out.println("Inside TextEditor2 constructor.");
        this.spellChecker = spellChecker;
    }

    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}