package at.mayer.spblue.tech.animals;

public class Person {
    public Person(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    private String firstname;
    private String lastname;

    public void printName(){
        System.out.println(this.firstname + this.lastname);
    }
}
