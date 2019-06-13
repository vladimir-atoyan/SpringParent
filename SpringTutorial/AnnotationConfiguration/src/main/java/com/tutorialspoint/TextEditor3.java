package com.tutorialspoint;

import javax.annotation.Resource;

public class TextEditor3 {
    private SpellChecker3 spellChecker;

    /**
     * You can use @Resource annotation on fields or setter methods and it works the same as in Java EE 5.
     * The @Resource annotation takes a 'name' attribute which will be interpreted as the bean name to be injected.
     * You can say, it follows by-name autowiring semantics as demonstrated in the following example.
     *
     * @param spellChecker
     */
    @Resource(name = "spellChecker3")
    public void setSpellChecker( SpellChecker3 spellChecker ){
        this.spellChecker = spellChecker;
    }
    public SpellChecker3 getSpellChecker(){
        return spellChecker;
    }
    public void spellCheck(){
        spellChecker.checkSpelling();
    }
}