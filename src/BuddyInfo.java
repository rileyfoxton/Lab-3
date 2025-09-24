public class BuddyInfo {

    private String name;
    private String address;
    private String phoneNumber;

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    public BuddyInfo(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
    public BuddyInfo(){
        this("Jules", "34 Inglewood", "866-787-7476");
    }
    public String getBuddyName(){
        return name;
    }


}
