import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Admin admin = new Admin();
        Mahasiswa mahasiswa = new Mahasiswa();

        System.out.println("=== Sistem Login ===");
        System.out.println("1. Login sebagai Admin");
        System.out.println("2. Login sebagai Mahasiswa");
        System.out.print("Pilih (1/2): ");
        String pilihan = scanner.nextLine();

        switch (pilihan) {
            case "1":
                System.out.print("Username: ");
                String username = scanner.nextLine();
                System.out.print("Password: ");
                String password = scanner.nextLine();
                if (admin.login(username, password)) {
                    System.out.println("Login Admin berhasil!");
                } else {
                    System.out.println("Username atau password salah.");
                }
                break;
            case "2":
                System.out.print("Nama: ");
                String nama = scanner.nextLine();
                System.out.print("NIM: ");
                String nim = scanner.nextLine();
                if (mahasiswa.login(nama, nim)) {
                    mahasiswa.displayInfo();
                } else {
                    System.out.println("Nama atau NIM salah.");
                }
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }

        scanner.close();
    }
}
