package P4;

public class StrukturListTestTugas2AB {
    public static void main(String[] args) {     
        // Uji Coba a. 2.1 3.4 4.5
        System.out.print("A: ");
        StrukturListDouble listA = new StrukturListDouble();
        listA.addHead(2.1);
        listA.addTail(3.4);
        listA.addTail(4.5);
        listA.displayElement(); // Output: 2.1 -> 3.4 -> 4.5 

        // Uji Coba b. 3.4 2.1 1.1 4.5 5.5
        System.out.print("B: ");
        StrukturListDouble listB = new StrukturListDouble();
        listB.addTail(3.4);
        listB.addHead(2.1);
        listB.addHead(1.1);
        listB.addTail(4.5);
        listB.addTail(5.5);
        listB.displayElement(); // Output: 3.4 -> 2.1 -> 1.1 -> 4.5 -> 5.5 
        
    }
}

