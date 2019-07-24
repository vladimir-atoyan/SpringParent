package com.tutorialspoint;

/**
 * The bank configuration name as it was defined at build time.
 *
 * @author <a href="mailto:doocatteam@energizeglobal.com">Doocat Team</a>
 */
public enum BankName {
    UNKNOWN(""),
    DEMO("demo"),
    IBT("ibt"),
    CBT("cbt"),
    HUMO("ibt");

    private final String name;

    BankName(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static BankName fromString(final String name) {
        for (BankName bank : BankName.values()) {
            if (bank.getName().equalsIgnoreCase(name)) {
                return bank;
            }
        }
        return UNKNOWN;
    }
}
