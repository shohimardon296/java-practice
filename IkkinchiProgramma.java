import java.util.Scanner;

public class IkkinchiProgramma {
    public static void main(String[] args) {
        String first_name_db = "Shohimardon";
        String last_name_db = "Murtazoqulov";
        
        Scanner input = new Scanner(System.in);

        System.out.println("Iltimos ismingizni kiriting");
        String first_name = input.nextLine();
        if { ("Siz ismingizni to'g'ri kiritdingiz");}

        else {("shu isimlik foydalanuvchi mavjud");
    }
        String last_name = input.nextLine();
        System.out.println("Iltimos yoshingizni kiriting");
        int age = input.nextInt();
        if(age == 12) {
            System.out.println("Siz 12 raqamini kiritdingiz");
        }
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
