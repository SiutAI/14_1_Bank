public class Bank {
    private int money = 10000;
    private Object lock = new Object();

    int getMoney() {
        return money;
    }

    void take(int money) {
        synchronized (lock) {
            this.money -= money;
        }
    }

    void repay(int money) {
        synchronized (lock) {
            this.money += money;
        }
    }

    public Bank() {
        new Client(this, "Client1").start();
        new Client(this, "Client2").start();
        new Client(this, "Client3").start();
    }
}
