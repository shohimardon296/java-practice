import java.util.Scanner;

public class uchinchidars {

    public static void main(String[] args) {
        String first_name_db = "Shohimardon";
        String last_name_db = "Murtazoqulov";
        String email_db = "Shohimardon296@gmail.com";
        Scanner input = new Scanner(System.in);

        /*
         * i++ POSTINCREMENT
         * ++i PREINCREMENT
         * int x = 5;
         * int a = 7;
         * System.out.printf("Bizning raqam A= %s\n", a);
         * int b = ++a;
         * System.out.printf("Bizning raqam %s, \t%s, %s\n", a, b, x);
         */

        for (int i = 0; i < 10; i++) {
            System.out.println("Iltimos ismingizni kiriting");
            String first_name = input.nextLine();
            if (!first_name_db.equals(first_name)) { // Boolean TRUE yoki FALSE tog'ri yoki notog'ri.
                System.out.println("Iltimos familyangizni kiriting");
                String last_name = input.nextLine();
                if (!last_name_db.equals(last_name)) {
                    System.out.println("Iltimos jinsingizni kiriting, M = erkak, F = ayol");
                    String sex = input.nextLine();
                    if (sex.equals("M") || sex.equals("F")) {
                        System.out.println("Iltimos yoshingizni kiriting");
                        int age = input.nextInt();
                        input.nextLine();
                        System.out.println("Iltimos emailingizni kiriting");
                        String email = input.nextLine();
                        if (!email_db.equals(email)) {
                            System.out.println("Iltimos password kiriting");
                            String password = input.nextLine();
                            System.out.printf("Kiritilgan malumot %s,\t%s,\t%s,\t%s, \t%s,\t%s,\t%s\n",
                                    first_name, last_name, age, sex,
                                    email, email, password);
                            System.out.println(
                                    "Foydalanuvchilar bizning programmamizga o'z login va parollari bilan kirish imkoniyatiga ega bo'lishsin");
                            input.close();
                            break;
                        } else {
                            System.out.println("Siz mavjud bo'lgan email kiritdingiz! Iltimos boshqa email kiriting!");
                            continue;
                        }
                    } else {
                        System.out.println("Siz mavjud bo'lmagan jins kiritdingiz! Iltimos M yoki F ni kiriting!");
                        continue;
                    }
                } else {
                    System.out.println("Siz birxil familiya kiritdingiz! Iltimos boshqa familiyani yozing!");
                    continue;
                }
            } else {
                if (i == 9) {
                    System.out.println("Siz hamma urunishlaringizni ishlatib bo'ldingiz!");
                    break;
                }
                System.out.println("Siz birxil isim kiritdingiz! Iltimos boshqa isimni yozing!");
                continue;
            }
        }
    }

}
