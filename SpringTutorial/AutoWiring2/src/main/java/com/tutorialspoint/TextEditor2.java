package com.tutorialspoint;

public class TextEditor2 {
    private SpellChecker2 spellChecker;
    private String name;

    public TextEditor2(SpellChecker2 spellChecker, String name) {
        this.spellChecker = spellChecker;
        this.name = name;
    }

    public SpellChecker2 getSpellChecker() {
        return spellChecker;
    }

    public String getName() {
        return name;
    }

    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}