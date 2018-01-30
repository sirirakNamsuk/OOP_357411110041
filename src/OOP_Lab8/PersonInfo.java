package OOP_Lab8;

public class PersonInfo {
    public static void main(String[] args) {
        Student student = new Student("357411110041",
                "Girl Saiyai",
                "Male",
                22,
                "357411110041",
                "IS: Management Technology");
        System.out.println(student.toString());
        System.out.println(student.getName());

        Employee employee = new Employee("35741",
                "Rak",
                "Male",
                22,
                "35899",
                "ธุรการ",
                "35000");
        System.out.println(employee.toString());
        System.out.println(employee.getName());

    }//main
}//class
