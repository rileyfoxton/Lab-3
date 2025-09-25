import java.util.ArrayList;
import java.util.ArrayList.*;


public class AddressBook {
    ArrayList<BuddyInfo> book;
    public AddressBook(){

        book = new ArrayList<BuddyInfo>();
    }

    public void addBuddy(BuddyInfo buddy){
        if(buddy != null) {
            book.add(buddy);
        }
    }

    public void removeBuddy(BuddyInfo buddy){
        book.remove(buddy);
    }


    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Keyser","Soze","666");
        AddressBook ab = new AddressBook();
        ab.addBuddy(buddy);
        ab.removeBuddy(buddy);
        //https://github.com/rileyfoxton/Lab-3
        //GITHUB CHANGE
    }
}

