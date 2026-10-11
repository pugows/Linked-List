// Class LinkedList: mengelola kumpulan Node (Single Linked List)
public class LinkedList {
    private Node head; // node pertama dalam daftar

    // Menghitung jumlah buku dalam daftar
    public int hitungBuku() {
        int total = 0;
        Node bantu = head;
        while (bantu != null) {
            total++;
            bantu = bantu.next;
        }
        return total;
    }

    // 1. Tambah Buku (Push): data baru dimasukkan di akhir daftar
    public void tambahBuku(String kodeBuku, String judul, String penulis) {
        Node baru = new Node(kodeBuku, judul, penulis);

        if (head == null) {
            // Jika daftar kosong, node baru menjadi head
            head = baru;
        } else {
            // Telusuri sampai node terakhir, lalu sambungkan node baru
            Node bantu = head;
            while (bantu.next != null) {
                bantu = bantu.next;
            }
            bantu.next = baru;
        }
        System.out.println("Data berhasil ditambahkan!");
    }

    // 2. Hapus Buku (Pop): menghapus data buku terakhir
    public void hapusBuku() {
        if (head == null) {
            System.out.println("Tidak ada data untuk dihapus.");
            return;
        }

        if (head.next == null) {
            // Hanya ada satu node, kosongkan daftar
            System.out.println("Buku dihapus: " + head.kodeBuku + " - " + head.judul);
            head = null;
        } else {
            // Berhenti di node sebelum node terakhir
            Node bantu = head;
            while (bantu.next.next != null) {
                bantu = bantu.next;
            }
            System.out.println("Buku dihapus: " + bantu.next.kodeBuku + " - " + bantu.next.judul);
            bantu.next = null; // putuskan node terakhir
        }
    }

    // 3. Cari Buku berdasarkan kodeBuku
    public void cariBuku(String kodeBuku) {
        Node bantu = head;
        while (bantu != null) {
            if (bantu.kodeBuku.equalsIgnoreCase(kodeBuku)) {
                System.out.println("Buku ditemukan:");
                System.out.println("Kode: " + bantu.kodeBuku
                        + " | Judul: " + bantu.judul
                        + " | Penulis: " + bantu.penulis);
                return;
            }
            bantu = bantu.next;
        }
        System.out.println("Buku tidak ditemukan.");
    }

    // 4. Tampilkan Semua Buku sesuai urutan input, lalu total buku
    public void tampilkanBuku() {
        System.out.println("Daftar Buku:");
        if (head == null) {
            System.out.println("(Belum ada data buku)");
        }

        Node bantu = head;
        while (bantu != null) {
            System.out.println("Kode: " + bantu.kodeBuku
                    + " | Judul: " + bantu.judul
                    + " | Penulis: " + bantu.penulis);
            bantu = bantu.next;
        }
        System.out.println("Total Buku: " + hitungBuku());
    }
}
