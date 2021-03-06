package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

/**
 * Represents a Person's address in the address book.
 * Guarantees: immutable; is valid as declared in {@link #isValidAddress(String)}
 */
public class Address extends Contact  implements Printable {

    public static final String EXAMPLE = "123, some street";
    public static final String MESSAGE_ADDRESS_CONSTRAINTS = "Person addresses must contain block, street, unit," +
            " postal code, separated by commas";
    public static final String ADDRESS_VALIDATION_REGEX = ".+";

    private final String value;
    private final Block block;
    private final Street street;
    private final Unit unit;
    private final PostalCode postalCode;

    /**
     * Validates given address.
     *
     * @throws IllegalValueException if given address string is invalid.
     */
    public Address(String address, boolean isPrivate) throws IllegalValueException {
        super(isPrivate);
        String trimmedAddress = address.trim();
        String[] addressComponents = trimmedAddress.split(", ");

        if (!isValidAddress(trimmedAddress, addressComponents)) {
            throw new IllegalValueException(MESSAGE_ADDRESS_CONSTRAINTS);
        }
        this.block = new Block(addressComponents[0]);
        this.street = new Street(addressComponents[1]);
        this.unit = new Unit(addressComponents[2]);
        this.postalCode = new PostalCode(addressComponents[3]);
        this.value = this.block.getBlock() + ", " + this.street.getStreet() + ", " + this.unit.getUnit() + ", "
                + this.postalCode.getPostalCode();
    }

    /**
     * Returns true if a given string is a valid person address.
     */
    public static boolean isValidAddress(String test, String[] addressComponents) {
        return test.matches(ADDRESS_VALIDATION_REGEX) && addressComponents.length == 4;
    }

    /**
     * Retrieves the string representation of the address.
     */
    public String getValue() {
        return this.value;
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public String getPrintableString() {
        return "Address: " + value;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Address // instanceof handles nulls
                && this.value.equals(((Address) other).value)); // state check
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

}
