import java.util.Scanner;

public class IkkinchiProgramma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Iltimos ismingizni kiriting");
        String first_name = input.nextLine();
        System.out.println("Iltimos familiyangizni kiriting");
        String last_name = input.nextLine();
        System.out.println("Iltimos yoshingizni kiriting");
        int age = input.nextInt();
        input.nextLine();
        System.out.println("Iltimos jinsingizni kiriting");
        String sex = input.nextLine();
        System.out.println("Iltimos email kiriting");
        String email = input.nextLine();
        System.out.println("Iltimos parol kiriting");
        String password = input.nextLine();
        input.close();
        System.out.printf("Kiritilgan malumot %s,\t%s,\t%s,\t%s,\t%s,\t%s\n", first_name, last_name, age, sex, email, password);
        System.out.println("Foydalanuvchilar bizning programmamizga o'z login va parollari bilan kirish imkoniyatiga ega bo'lishsin");
    }
}
