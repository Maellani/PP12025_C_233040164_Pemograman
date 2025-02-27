package P4;

public class StrukturListDouble {
	    private NodeDouble HEAD; // Head dari linked list

	    public StrukturListDouble() {
	        this.HEAD = null; // Inisialisasi linked list kosong
	    }

	    /** Fungsi untuk mengecek apakah list kosong */
	    public boolean isEmpty() {
	        return HEAD == null;
	    }

	    /** Fungsi untuk menambahkan elemen di akhir list */
	    public void addTail(double data) {
	        NodeDouble posNode = null, curNode = null; // Pointer sementara
	        NodeDouble newNode = new NodeDouble(data); // Buat node baru

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
	        NodeDouble temp = HEAD;
	        while (temp != null) {
	            System.out.print(temp.getData() + "  ");
	            temp = temp.getNext();
	        }
	        System.out.println("null");
	    }
	    
	    /** Fungsi untuk menampilkan addHead*/
	    public void addHead(double data) {
	        NodeDouble newNode = new NodeDouble(data); // Buat node baru dengan data

	        if (isEmpty()) { // Jika list kosong
	            HEAD = newNode; // Jadikan newNode sebagai HEAD
	        } else {
	            newNode.setNext (HEAD); // Hubungkan newNode ke HEAD lama
	            HEAD = newNode; // Perbarui HEAD ke newNode
	        }
	    }
	    
	    /** Fungsi untuk menambahkan elemen di posisi tertentu (middle) */
	    public void addMid(double data, int position) {
	        NodeDouble newNode = new NodeDouble(data);

	        if (HEAD == null) { // Jika list kosong
	            HEAD = newNode;
	        } else if (position == 1) { // Jika posisi di awal
	            newNode.setNext(HEAD);
	            HEAD = newNode;
	        } else {
	            NodeDouble curNode = HEAD;
	            NodeDouble posNode = null;
	            int i = 1;

	            while (curNode != null && i < position) { // Iterasi sampai posisi yang diinginkan
	                posNode = curNode;
	                curNode = curNode.getNext();
	                i++;
	            }

	            if (posNode != null) { // Jika posisi valid, sisipkan node
	                posNode.setNext(newNode);
	                newNode.setNext(curNode);
	            }
	        }
	    }

	    
	    public void displayElement() {
	        NodeDouble curNode = HEAD; // Mulai dari HEAD
	        while (curNode != null) { // Iterasi selama node tidak null
	            System.out.print(curNode.getData() + "  ");
	            curNode = curNode.getNext(); // Pindah ke node berikutnya
	        }
	        System.out.println(" "); // Akhiran tampilan
	    }

}