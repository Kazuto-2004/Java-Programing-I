package Phone;

public class Main {
    public static void main(String[] args) {

        PhoneBook pb = new PhoneBook();
        pb.insertPhone("A", "099990099");
        pb.insertPhone("B", "033003333");
        pb.insertPhone("C", "066687666");
        pb.removePhone("D");
        for (String pl : pb.PhoneList) {
            System.out.println(pl);
        }
    }
}
