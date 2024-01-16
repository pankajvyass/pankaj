import java.util.*;

class String2 {

    public static boolean equal(String name, String name2) {

        if (name.length() != name2.length()) {
            System.out.println("length of both the string is not same");

            // System.out.println("true");
        }

        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) != name2.charAt(i)) {
               // System.out.println("Strings are equal and same");
                 System.out.println("strings are different ");
                return false;

            } else {
                System.out.println("Strings are equal and same");
              //  System.out.println("strings are different ");
                return true;
            }
        }
        return equal(name, name2);

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = new String();
        name = input.nextLine();
        String name2 = new String();
        name2 = input.nextLine();
        System.out.println(equal(name, name2));
        // using string method equalsIgnareCase()
        System.out.println(name.equalsIgnoreCase(name2));
        // System.out.println(name.toString());
    }
}
