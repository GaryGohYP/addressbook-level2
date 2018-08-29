package seedu.addressbook.data.person;

/**
 * Represents a Person's unit number in his/her address.
 */
public class Unit {
    private final String unit;

    public Unit(String unit) {
        this.unit = unit;
    }

    /**
     * Retrieves the unit number of a block.
     */
    public String getUnit() {
        return this.unit;
    }
}
