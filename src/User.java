import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
// implements Comparable <User> to compare String name to sort the list
public class User implements Comparable <User> {

    // variables
    private String name;
    ArrayList<String> list = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    // empty constructor
    public User() {

    }

    // compareTo() method to compare the current name and the new name if is the same
    public int compareTo(User st) {
        return this.name.compareTo(st.name);
    }

    // method with while loop and for loop with scanner to add username.
    public void nameList() {
            for (int i = 0; i < 5; i++) {
                System.out.println("Add username:");
                list.add(scanner.nextLine());
            }

        // original list
            System.out.println("Original list:");
            System.out.println(list);
        System.out.println("Please change the first user to hans");
        list.set(0, scanner.nextLine());

        // sort the user list
        Collections.sort(list);
        System.out.println("Sorted list: ");
        System.out.println(list);

        // remove the selected user from the list
        System.out.println("Select a user to remove from the list");
        list.remove(scanner.nextInt());

        // sort the new list after the selected user is removed from the list
        System.out.println("New Sorted list, after it remove a user:");
        System.out.println(list);

        // new sorted list after it replace first user from the list
        System.out.println("Please replace the first user to poul");
        scanner.nextLine(); // scanner bug
        list.set(0, scanner.nextLine());

        // new sorted list after it replace the first user with poul
        System.out.println("New Sorted list, after it replace the first user with poul:");
        Collections.sort(list);
        System.out.println(list);
    }
}
