// Class Node: satu elemen (buku) dalam Single Linked List
public class Node {
    String kodeBuku;
    String judul;
    String penulis;
    Node next; // penunjuk ke node berikutnya

    // Constructor: mengisi data buku, next awalnya kosong
    public Node(String kodeBuku, String judul, String penulis) {
        this.kodeBuku = kodeBuku;
        this.judul = judul;
        this.penulis = penulis;
        this.next = null;
    }
}
