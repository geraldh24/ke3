public class Main {

    public static void main(String[] args) {

        // Membuat objek akun
        BankAccount akun1 = new BankAccount("123456789", "Katerina");

        // Cek saldo awal
        System.out.println("Pemilik Akun : " + akun1.getOwnerName());
        System.out.println("Saldo Awal   : " + akun1.getBalance());

        System.out.println("\n--- Deposit Positif ---");
        akun1.deposit(500.0);

        System.out.println("\n--- Deposit Negatif ---");
        akun1.deposit(-100.0);

        System.out.println("\n--- Tarik Melebihi Saldo ---");
        akun1.withdraw(1000.0);

        System.out.println("\n--- Tarik Normal ---");
        akun1.withdraw(200.0);

        // Cek saldo akhir
        System.out.println("\nSaldo Akhir  : " + akun1.getBalance());
    }
}
