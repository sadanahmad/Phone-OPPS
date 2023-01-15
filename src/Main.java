public class Main {
    public static void main(String[] args) {

        Landline l1 = new Landline("456");
        Landline l2 = new Landline("456");

        l1.callNumber("456");
        l2.receiveCall("123i");
        System.out.println(l2.answerCall());
    }
}