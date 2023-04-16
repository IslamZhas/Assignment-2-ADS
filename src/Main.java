public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> arrayList = new MyArrayList<>();
        arrayList.add(2);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(5);
        arrayList.add(5);
        arrayList.add(8);
        arrayList.printList();
        System.out.println("\n" + arrayList.getSize());
        System.out.println("\n" + arrayList.get(2));
        arrayList.remove(3);
        arrayList.printList();
        if(arrayList.contains(3)) System.out.println("It contains");
        else System.out.println("Not contain" + "\n");
        System.out.println(arrayList.indexOf(5) + "\n");
        arrayList.printList();
        System.out.println("\n" + arrayList.lastIndexOf(5));


/*
        System.out.println("\n" + "---------------------------------------");

        MyLinkedList<Integer> linkedList = new MyLinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(6);
        linkedList.printList();
        linkedList.remove(3);
        System.out.println("\n");
        linkedList.printList();

 */
    }


}