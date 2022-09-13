public class Main {
    public static void main(String[] args) {

        String name = "Ana";
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.length());

        String newName = "Lucas";
        String otherName = "lucas";
        System.out.println(name.equals(newName));
        System.out.println(newName.equalsIgnoreCase(otherName));

    }
}