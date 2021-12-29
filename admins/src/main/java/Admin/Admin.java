package Admin;

public class Admin{
    static String name1, name2, name3, name4;

    public static void adminsnames() {
        name1 = "Sandra";
        name2 = "Maria";
        name3 = "Joseph";
        name4 = "Gopika";
        System.out.println();
        System.out.println("-----------------------------------------------------------");
        System.out.println("                   Administrators                          ");
        System.out.println("-----------------------------------------------------------");
        System.out.println("Administrator :" + name1);
        System.out.println("Manager :" + name2);
        System.out.println("HR :" + name3);
        System.out.println("Finance Manager :" + name4);
    }

    public void transactions() {
        System.out.println("Today's Transactions");

    }
}
