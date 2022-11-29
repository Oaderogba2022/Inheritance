package ie.atu;

public class PersonApp {
    public static void main(String[] args) {
        Person richard = new Person(" Richard"," Galway","  12345");
        System.out.println(richard.toString());
        Customer john = new Customer(" Richard"," Galway"," 12345","8985",true);
        System.out.println(john.toString());


        Customer Henry = new Customer();
        Henry.setName("Henry");
        Henry.setAddress("Galway");
        Henry.setNumber("123456");
        Henry.setCustomerNumber("4682638");
        Henry.setMailingList(true);

        System.out.println(Henry.toString());
    }

}
