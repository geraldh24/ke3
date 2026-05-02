public class BankAccount {

    // Atribut private
    private String accountNumber;
    private String ownerName;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, String ownerName) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = 0.0;
    }

    // Getter (sesuai aturan)
    public String getOwnerName() {
        return ownerName;
    }

    public double getBalance() {
        return balance;
    }

    // Method deposit
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Gagal: jumlah harus > 0");
        } else {
            balance += amount;
            System.out.println("Deposit berhasil ke akun " + accountNumber);
        }
    }

    // Method withdraw
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Gagal: saldo tidak cukup pada akun " + accountNumber);
        } else {
            balance -= amount;
            System.out.println("Penarikan berhasil dari akun " + accountNumber);
        }
    }
}