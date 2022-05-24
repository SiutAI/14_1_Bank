public class Bank {
    private int money = 10000;

    public Bank() {
        /*
        Thread client1 = new Client();
        Thread client2 = new Client();
        Thread client3 = new Client();

        client1.start();
        client2.start();
        client3.start();

         */

        new Client(this).start();
        new Client(this).start();
        new Client(this).start();

    }

    int getMoney() {
        return money;
    }

    void take(int money) {
        this.money -= money;
    }

    void repay(int money) {
        this.money += money;
    }
}
