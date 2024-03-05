package interview.solid;

public class Main {

    public static void main(String[] args) {

        Car ford = new Ford();
        Dealer dealer = new Dealer(ford);
        dealer.getPrice();
    }
}
