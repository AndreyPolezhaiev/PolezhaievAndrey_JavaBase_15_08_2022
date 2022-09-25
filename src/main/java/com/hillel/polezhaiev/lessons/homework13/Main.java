package com.hillel.polezhaiev.lessons.homework13;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Andrey", "Polezhaiev", 8, 4, 2004,
                "polez@gmail.com", "09876543211", 66, "120/80", 8760);

        User user2 = new User("Artem", "Orlov", 5, 8, 2003,
                "artem@gmail.com", "0983456735", 75, "140/100", 10000);

        User user3 = new User("Nikita", "Yavnikov", 21, 7, 2005,
                "nikita@gmail.com", "0662345678", 63, "130/90", 5690);


        user1.printAccountInfo();
        System.out.println();
        user2.printAccountInfo();
        System.out.println();
        user3.printAccountInfo();
        System.out.println();

        System.out.println("Changed");

        user2.weight = 65;
        user2.getEmail("art2684@gmail.com");
        user3.getPhone("0977887654");
        user3.getYear(2002);
        user3.getEmail("Nik37667@gmail.com");

        user2.printAccountInfo();
        System.out.println();
        user3.printAccountInfo();
        System.out.println();

    }
}
