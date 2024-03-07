package Opgave1;

public class Customer {

    private String firstName;
    private String lastName;
    private String userName;
    private int id;
    private static int counter = 1;

    public Customer(String firstName, String lastName, String userName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.id = counter++;

    }

    public String getFirstName() {

        return this.firstName;
    }

    public String getLastName() {

        return this.lastName;
    }

    public String getUserName() {

        return this.userName;
    }

    public int getId(){
        return this.id;
    }


    @Override
    public String toString() {
        return getFirstName() + " " + getLastName() + ": " + getUserName() + "\n" + getId(); //Printer firstName lastName: userName
    }
// 1.a / 1.b / 1.c / 1.d / 1.e / 1.f

}

