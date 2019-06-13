package com.tutorialspoint;

public class TextEditor1 {
    private SpellChecker1 spellChecker;
    private String name;

    public void setSpellChecker(SpellChecker1 spellChecker) {
        this.spellChecker = spellChecker;
    }

    public SpellChecker1 getSpellChecker() {
        return spellChecker;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}