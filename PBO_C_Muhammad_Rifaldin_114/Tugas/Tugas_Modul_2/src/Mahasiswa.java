public class Mahasiswa {
    private String nama = "Muhammad Rifaldin";
    private String nim = "202410370110114";

    public boolean login(String inputNama, String inputNim) {
        return nama.equalsIgnoreCase(inputNama) && nim.equals(inputNim);
    }

    public void displayInfo() {
        System.out.println("Login berhasil!");
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
    }
}
