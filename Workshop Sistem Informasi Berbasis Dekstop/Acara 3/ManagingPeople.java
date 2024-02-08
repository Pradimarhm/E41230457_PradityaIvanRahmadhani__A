import java.util.Scanner;

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class ManagingPeople {
    public static void main(String[] args) {
        Person p1 = new Person("Arial", 37);
        Person p2 = new Person("Joseph", 15);

        if (p1.getAge() == p2.getAge()) {
            System.out.println(p1.getName() + " is the same age as " + p2.getName());
        } else {
            System.out.println(p1.getName() + " is NOT the same age as " + p2.getName());
        }
//        
//        String nama1;
//        String nama2;
//        int age1;
//        int age2;
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("      Manusia pertama");
//        System.out.print("Masukkan nama: ");
//        nama1 = sc.nextLine();
//        
//        if (nama1.length() > 0) {
//            System.out.print("Masukkan umur: ");
//            age1 = sc.nextInt();
//            
//            if (age1 > 0) {
//                sc.nextLine(); // Consume the newline character left by nextInt()
//
//                System.out.println("--------------------------------------");
//                System.out.println("      Manusia kedua");
//                System.out.print("Masukkan nama: ");
//                nama2 = sc.nextLine();
//
//                if (nama2.length() > 0) {
//                    System.out.print("Masukkan umur: ");
//                    age2 = sc.nextInt();
//
//                    if (age2 > 0) {
//                        System.out.println("--------------------------------------");
//
//                        Person p1 = new Person(nama1, age1);
//                        Person p2 = new Person(nama2, age2);
//
//                        if (p1.getAge() == p2.getAge()) {
//                            System.out.println(p1.getName() + " is the same age as " + p2.getName());
//                        } else {
//                            System.out.println(p1.getName() + " is NOT the same age as " + p2.getName());
//                        }
//                    } else {
//                        System.out.println("Umur Kosong");
//                    }
//                } else {
//                    System.out.println("Nama Kedua Kosong");
//                }
//            } else {
//                System.out.println("Umur Pertama Kosong");
//            }
//        } else {
//            System.out.println("Nama Pertama Kosong");
//        }
    }
}
