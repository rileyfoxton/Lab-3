//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        BuddyInfo homer = new BuddyInfo("Homer", "33 Springfeild", "888-888-8888");
        AddressBook book = new AddressBook();
        book.addBuddy(homer);
        System.out.printf("Hello "+homer.getBuddyName());
    }
}