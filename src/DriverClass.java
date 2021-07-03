public class DriverClass {
    public static void main(String[] args) throws Exception {
        //ShoppingBag shoppingBag0 = new ShoppingBag(-5); //Test Exception
        ShoppingBag shoppingBag1 = new ShoppingBag(4);
        System.out.println("Apple added? " + shoppingBag1.add("Apple"));
        System.out.println("Banana added? " + shoppingBag1.add("Banana"));
        System.out.println("Peach added? " + shoppingBag1.add("Peach"));
        System.out.println("Meat added? " + shoppingBag1.add("Meat"));
        System.out.println("Rice added? " + shoppingBag1.add("Rice"));
        System.out.println("Removing the following top item from the shopping bag: " + shoppingBag1.getNext());
        System.out.println("Removing the following top item from the shopping bag: " + shoppingBag1.getNext());
        //ClientService clientService0 = new ClientService(0);//Test Exception
        ClientService clientService1 = new ClientService(3);
        System.out.println("Queued client? " + clientService1.add("Client 1"));
        System.out.println("Queued client? " + clientService1.add("Client 2"));
        System.out.println("Queued client? " + clientService1.add("Client 3"));
        System.out.println("Queued client? " + clientService1.add("Client 4"));
        System.out.println("Done with client: " + clientService1.getNext());
        System.out.println("Done with client: " + clientService1.getNext());
        System.out.println("Done with client: " + clientService1.getNext());
        System.out.println("Done with client: " + clientService1.getNext());
        Student student1 = new Student("Student 1",3.8);
        Student student2 = new Student("Student 2",3.5);
        Student student3 = new Student("Student 3",4);
        Student student4 = new Student("Student 4",4.9);
        Student student5 = new Student("Student 5",2);
        DeansList deansList1 = new DeansList();
        System.out.println("Student added to Deans List? " + deansList1.add(student1));
        System.out.println("Student added to Deans List? " + deansList1.add(student2));
        System.out.println("Student added to Deans List? " + deansList1.add(student3));
        System.out.println("Student added to Deans List? " + deansList1.add(student4));
        System.out.println("Student added to Deans List? " + deansList1.add(student5));
        System.out.println("Highest GPA on the list " + deansList1.getNext());
        System.out.println("Highest GPA on the list " + deansList1.getNext());
        System.out.println("Highest GPA on the list " + deansList1.getNext());
        System.out.println("Highest GPA on the list " + deansList1.getNext());

    }
}
