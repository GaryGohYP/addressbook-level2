package seedu.addressbook.data.person;


public class Contact {

    /** Whether or not a particular contact was declared as private */
    private boolean isPrivate;


    public Contact(boolean isPrivate) {
        this.isPrivate = isPrivate;
    }

    /** Retrieves whether or not a particular contact is private */
    public boolean isPrivate() {
        return isPrivate;
    }

}

