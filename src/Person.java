/**
 * The type Person.
 */
public class Person {
    private final String firstname;
    private final String lastname;
    private final int age;

    /**
     * Instantiates a new Person.
     *
     * @param firstname the firstname
     * @param lastname  the lastname
     * @param age       the age
     */
    public Person(String firstname, String lastname, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

    /**
     * Gets firstname.
     *
     * @return the firstname
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * Gets lastname.
     *
     * @return the lastname
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * Gets age.
     *
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     *
     * @return the object params
     */
    @Override
    public String toString() {
        return getFirstname() + " " + getLastname() + " " + getAge();
    }
}
