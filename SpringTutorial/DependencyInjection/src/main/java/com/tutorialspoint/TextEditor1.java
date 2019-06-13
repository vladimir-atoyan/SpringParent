package com.tutorialspoint;

public class TextEditor1 {
    private SpellChecker1 spellChecker;

    // a setter method to inject the dependency.
    public void setSpellChecker(SpellChecker1 spellChecker) {
        System.out.println("Inside setSpellChecker1.");
        this.spellChecker = spellChecker;
    }

    // a getter method to return spellChecker
    public SpellChecker1 getSpellChecker() {
        return spellChecker;
    }

    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}