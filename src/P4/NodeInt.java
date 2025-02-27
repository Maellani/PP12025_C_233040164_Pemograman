package P4;

public class NodeInt {
	private int data;
	private NodeInt next;
	
	/** Inisialisasi atribut node */
	public NodeInt(int data) {
		this.data = data;
	}
	
	/** Setter & Getter */
	public void setData(int data) {
	    this.data = data;
	}
	
	public int getData() {
	    return data;
	}

	public void setNext(NodeInt next) {
	    this.next = next;
	}

	public NodeInt getNext() {
	    return next;
	}

}

