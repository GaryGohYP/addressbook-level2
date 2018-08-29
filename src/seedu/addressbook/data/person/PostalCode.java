package seedu.addressbook.data.person;

/**
 * Represents a Person's postal code in his/her address.
 */
public class PostalCode {
    private final String postalCode;

    public PostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    /**
     * Retrieves the postal code of a block.
     */
    public String getPostalCode() {
        return this.postalCode;
    }
}
