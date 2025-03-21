import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Admin admin = new Admin("Admin Sistem", "000000", "admin114", "password114");
        Mahasiswa mahasiswa = new Mahasiswa("Muhammad Rifaldin", "202410370110114");

        System.out.println("=== Sistem Login ===");
        System.out.println("1. Login sebagai Admin");
        System.out.println("2. Login sebagai Mahasiswa");
        System.out.print("Pilih opsi (1/2): ");
        int pilihan = scanner.nextInt();
        scanner.nextLine();

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan Username: ");
                String inputUser = scanner.nextLine();
                System.out.print("Masukkan Password: ");
                String inputPass = scanner.nextLine();

                if (admin.login(inputUser, inputPass)) {
                    admin.displayInfo();
                } else {
                    System.out.println("Username atau Password salah!");
                }
                break;

            case 2:
                System.out.print("Masukkan Nama: ");
                String inputNama = scanner.nextLine();
                System.out.print("Masukkan NIM: ");
                String inputNim = scanner.nextLine();

                if (mahasiswa.login(inputNama, inputNim)) {
                    mahasiswa.displayInfo();
                } else {
                    System.out.println("Nama atau NIM salah!");
                }
                break;

            default:
                System.out.println("Pilihan tidak valid.");
        }

        scanner.close();
    }
}
