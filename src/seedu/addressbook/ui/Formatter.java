package seedu.addressbook.ui;

public class Formatter {


    /** A decorative prefix added to the beginning of lines printed by AddressBook */
    private static final String LINE_PREFIX = "|| ";

    /** A decorative line divider added in between lines */
    private static final String DIVIDER = "===================================================";

    /** Adds decorative prefix to the beginning of given line */
    public static String addLinePrefix(String line) {
        return LINE_PREFIX + line;
    }

    public static String addDivider(int numberOfLines) {
        String dividers = "";
        for (int i = 0; i < numberOfLines - 1; i++) {
            dividers += DIVIDER + "\n";
        }
        if (numberOfLines > 0) {
            dividers += DIVIDER;
        }
        return dividers;
    }


}
