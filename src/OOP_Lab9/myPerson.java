package OOP_Lab9;

public class myPerson {
    public static void main(String[] args) {
        Address address=new Address("141","Thungsong","80110");
        //jab
        Job job=new Job("sales",25000);
        //person
        Person Person=new Person("12345","Rak",address,job);
        System.out.print(Person.toString());

    }
}