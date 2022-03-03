import java.util.LinkedList;

public class SoalLinkedlist {
    public static void main(String[] args) {
        System.out.println("------Tugas 2 SDA------");
        System.out.println("Nama : ARIQ ABDURRAHMAN HAKIM");
        System.out.println("NIM : 2111522006");
        System.out.println("----------------\n");

        System.out.println("Membuat Linkedlist");

        LinkedList<String> saya = new LinkedList<String>();
        saya.add("A");
        saya.add("R");
        saya.add("I");
        saya.add("Q");
        saya.add("");
        saya.add("A");
        saya.add("B");
        saya.add("D");
        saya.add("U");
        saya.add("R");
        saya.add("R");
        saya.add("A");
        saya.add("H");
        saya.add("M");
        saya.add("A");
        saya.add("N");
        saya.add("");
        saya.add("H");
        saya.add("A");
        saya.add("K");
        saya.add("I");
        saya.add("M");

        System.out.println(saya);
        System.out.println("size = "+saya.size());

        //Add LinkedList
        saya.addFirst("P");
        saya.addLast("S");
        System.out.println("\nOutput setelah ditambah (awal&akhir) = "+saya);
        System.out.println("Size = "+saya.size());

        saya.add("K");
        saya.add("Y");
        System.out.println("Output setelah ditambah = "+saya);
        System.out.println("Size = "+saya.size());

        //set linkedlist 
        saya.set(1,"H" );
        saya.set(4,"K" );
        saya.set(9,"O" );
        saya.set(22,"E" );

        System.out.println("\nOutput setelah disisip = "+saya);
        System.out.println("size = "+saya.size());

        //remove linkedlist
        saya.removeFirst();
        saya.removeLast();
        System.out.println("\nOutput setelah dihapus (awal&akhir) = "+saya);
        System.out.println("size = "+saya.size());

        saya.remove(0);
        saya.remove(6);
        saya.remove(8);
        saya.remove(7);
        saya.remove(11);
        System.out.println("Output setelah dihapus = "+saya);
        System.out.println("Size = "+saya.size());

        //pop and push
        saya.pop();
        System.out.println("\nOutput setelah di-POP = "+saya);
        System.out.println("Size = "+saya.size());

        saya.push("K");
        saya.push("P");
        System.out.println("\nOutput setelah di-PUSH = "+saya);
        System.out.println("Size = "+saya.size());
        

    }
    
}