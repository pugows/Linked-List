import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedList daftar = new LinkedList(); // objek Linked List
        int pilihan = 0;

        do {
            // Tampilan menu utama
            System.out.println("\n===== SISTEM DATA BUKU =====");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Hapus Buku");
            System.out.println("3. Cari Buku");
            System.out.println("4. Lihat Semua Buku");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");

            // Baca sebagai teks lalu ubah ke angka, agar input huruf tidak membuat error
            try {
                pilihan = Integer.parseInt(input.nextLine().trim());
            } catch (NumberFormatException e) {
                pilihan = 0;
            }
            System.out.println();

            switch (pilihan) {
                case 1:
                    // Validasi: kodeBuku maksimal 5 karakter
                    String kode;
                    do {
                        System.out.print("Masukkan Kode Buku: ");
                        kode = input.nextLine().trim();
                        if (kode.isEmpty() || kode.length() > 5) {
                            System.out.println("Kode buku maksimal 5 karakter. Silakan ulangi.");
                        }
                    } while (kode.isEmpty() || kode.length() > 5);

                    System.out.print("Masukkan Judul: ");
                    String judul = input.nextLine();
                    System.out.print("Masukkan Penulis: ");
                    String penulis = input.nextLine();

                    daftar.tambahBuku(kode, judul, penulis);
                    break;

                case 2:
                    daftar.hapusBuku();
                    break;

                case 3:
                    System.out.print("Masukkan Kode Buku: ");
                    String cari = input.nextLine().trim();
                    daftar.cariBuku(cari);
                    break;

                case 4:
                    daftar.tampilkanBuku();
                    break;

                case 5:
                    System.out.println("Terima kasih. Program selesai.");
                    break;

                default:
                    System.out.println("Menu tidak valid. Pilih angka 1 sampai 5.");
            }
        } while (pilihan != 5);

        input.close();
    }
}
