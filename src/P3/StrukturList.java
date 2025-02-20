package P3;

public class StrukturList {
	    private Node HEAD; // Head dari linked list

	    public StrukturList() {
	        this.HEAD = null; // Inisialisasi linked list kosong
	    }

	    /** Fungsi untuk mengecek apakah list kosong */
	    public boolean isEmpty() {
	        return HEAD == null;
	    }

	    /** Fungsi untuk menambahkan elemen di akhir list */
	    public void addTail(int data) {
	        Node posNode = null, curNode = null; // Pointer sementara
	        Node newNode = new Node(data); // Buat node baru

	        if (isEmpty()) {
	            HEAD = newNode; // Jika kosong, HEAD langsung diisi newNode
	        } else {
	            curNode = HEAD; // Mulai dari HEAD
	            while (curNode != null) { // Iterasi sampai node terakhir
	                posNode = curNode;
	                curNode = curNode.getNext();
	            }
	            posNode.setNext(newNode); // Set node terakhir menunjuk ke newNode
	        }
	    }
    
	    /** Fungsi untuk menampilkan list */
	    public void displayList() {
	        Node temp = HEAD;
	        while (temp != null) {
	            System.out.print(temp.getData() + "  ");
	            temp = temp.getNext();
	        }
	        System.out.println("null");
	    }
	    
	    /** Fungsi untuk menampilkan addHead*/
	    public void addHead(int data) {
	        Node newNode = new Node(data); // Buat node baru dengan data

	        if (isEmpty()) { // Jika list kosong
	            HEAD = newNode; // Jadikan newNode sebagai HEAD
	        } else {
	            newNode.setNext (HEAD); // Hubungkan newNode ke HEAD lama
	            HEAD = newNode; // Perbarui HEAD ke newNode
	        }
	    }
	    
	    public void displayElement() {
	        Node curNode = HEAD; // Mulai dari HEAD
	        while (curNode != null) { // Iterasi selama node tidak null
	            System.out.print(curNode.getData() + " -> ");
	            curNode = curNode.getNext(); // Pindah ke node berikutnya
	        }
	        System.out.println("null"); // Akhiran tampilan
	    }

}