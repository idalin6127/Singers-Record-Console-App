package exercise1;

public class Singers {
    // instance variables
    int id;
    String name;
    String address;
    String dateOfBirth;
    int numberOfAlbumsPublished;

    // no-arg constructor
    public Singers() {

    }

    // one argument constructor
    public Singers(int id) {
        this.id = id;
    }

    // 2-arg argument constructor
    public Singers(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // 3-arg argument constructor
    public Singers(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    // 4-arg argument constructor
    public Singers(int id, String name, String address, String dateOfBirth) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
    }

    // 5-arg argument constructor
    public Singers(int id, String name, String address, String dateOfBirth, int numberOfAlbumsPublished) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.numberOfAlbumsPublished = numberOfAlbumsPublished;
    }

    // one of the setters
    public void setId(int id) {
        this.id = id;
    }

    // one of the setters
    public void setName(String name) {
        this.name = name;
    }

    // one of the setters
    public void setAddress(String address) {
        this.address = address;
    }

    // one of the setters
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    // one of the setters
    public void setNumberOfAlbumsPublished(int numberOfAlbumsPublished) {
        this.numberOfAlbumsPublished = numberOfAlbumsPublished;
    }

    // 5 setters
    public void setAll(int id, String name, String address, String dateOfBirth, int numberOfAlbumsPublished) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.numberOfAlbumsPublished = numberOfAlbumsPublished;
    }

    // one of the getters
    public int getId() {
        return id;
    }

    // one of the getters
    public String getName() {
        return name;
    }

    // one of the getters
    public String getAddress() {
        return address;
    }

    // one of the getters
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    // one of the getters
    public int getNumberOfAlbumsPublished() {
        return numberOfAlbumsPublished;
    }

    // override
    @Override
    public String toString() {
        return "Singer [id=" + id + ", name=" + name + ", address=" + address + ", dateOfBirth=" + dateOfBirth
                + ", numberOfAlbumsPublished=" + numberOfAlbumsPublished + "]";
    }
}
