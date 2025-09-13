import java.util.ArrayList;
import java.util.ArrayList.*;

public class AddressBook {
    ArrayList<BuddyInfo> book;
    public AddressBook(){

        book = new ArrayList<BuddyInfo>();
        System.out.println("THIS IS YOUR ADDRESSBOOK");
    }

    public void addBuddy(BuddyInfo buddy){
        book.add(buddy);
    }

    public void removeBuddy(BuddyInfo buddy){
        book.remove(buddy);
    }
}
