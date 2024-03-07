package Opgave1;
import Opgave1.Customer;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        ArrayList<Customer> customers = new ArrayList<Customer>();


        Customer c1 = new Customer("Rikke", "Mariussen", "RikkeM98");
        Customer c2 = new Customer("Keven", "Lund", "KevenL97");
        Customer c3 = new Customer("Pia", "Walther", "PiaW69");
        Customer c4 = new Customer("Henrik", "Zimmermann", "HenrikZ64");

        customers.add(c1);
        customers.add(c2);
        customers.add(c3);
        customers.add(c4);

        printCustomers(customers);

    }
        static void printCustomers(ArrayList<Customer> customers) {

        for(Customer number:customers) {
            System.out.println(number);


        }

    }

}