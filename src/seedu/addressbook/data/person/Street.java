package seedu.addressbook.data.person;

/**
 * Represents a Person's Street name in his/her address.
 */
public class Street {
    private final String street;

    public Street(String street) {
        this.street = street;
    }

    /**
     * Retrieves the street number of a block.
     */
    public String getStreet() {
        return this.street;
    }
}
