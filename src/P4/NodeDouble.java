package P4;

public class NodeDouble {
	private double data;
	private NodeDouble next;
	
	/** Inisialisasi atribut node */
	public NodeDouble(double data) {
		this.data = data;
	}
	
	/** Setter & Getter */
	public void setData(double data) {
	    this.data = data;
	}
	
	public double getData() {
	    return data;
	}

	public void setNext(NodeDouble next) {
	    this.next = next;
	}

	public NodeDouble getNext() {
	    return next;
	}

}

