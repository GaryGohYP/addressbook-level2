package seedu.addressbook.data.person;

/**
 * Represents a Person's block number in his/her address.
 */
public class Block {
    private final String block;

    public Block(String block) {
        this.block = block;
    }

    /**
     * Retrieves the block number of a block.
     */
    public String getBlock() {
        return this.block;
    }
}
