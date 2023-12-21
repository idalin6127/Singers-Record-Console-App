package exercise1;


public class SingersDriver1 {
    public static void main(String[] args) {
        // Create a Singers object using the no argument constructor
        Singers singer1 = new Singers();

        // Display the default values of the instance variables
        System.out.println("Default values of singer1:");
        System.out.println("ID: " + singer1.getId());
        System.out.println("Name: " + singer1.getName());
        System.out.println("Address: " + singer1.getAddress());
        System.out.println("Date of Birth: " + singer1.getDateOfBirth());
        System.out.println("Number of Albums: " + singer1.getNumberOfAlbumsPublished());

        // Set the values of each instance variable of singer1 using individual setters
        singer1.setId(111);
        System.out.println("Id set to: " + singer1.getId());

        singer1.setName("Ida");
        System.out.println("Name set to: " + singer1.getName());

        singer1.setAddress("199 Victoria Park");
        System.out.println("Address set to: " + singer1.getAddress());

        singer1.setDateOfBirth("September, 2000");
        System.out.println("Date of Birth set to: " + singer1.getDateOfBirth());

        singer1.setNumberOfAlbumsPublished(10);
        System.out.println("Number of Albums set to: " + singer1.getNumberOfAlbumsPublished());

        // Create singer2 object using the 5-argument constructor
        Singers singer2 = new Singers(112, "Ling Lin", "399 Progress Ave", "August, 1995", 20);

        // Display values of singer2 using the overridden toString() method
        System.out.println("Singer2: " + singer2.toString());
    }
}

