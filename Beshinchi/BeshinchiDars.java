package Beshinchi;

import java.util.Scanner;

public class BeshinchiDars {
    public static void book_list(String books[][]) {
        int d = 0;
        System.out.println("__________________________________________");
        System.out.println("| Raqam \t| Kitobning nomi | Muallifi | ");
        while (d < books.length) { // Iteratsiya
            System.out.println("____________________________________________");
            System.out.println(
                    "| " + d + " | " + books[d][0] + " | " + books[d][1] + " | " + books[d][2]
                            + " |");
            d++;
        }
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static double divide(double a, double b) {
        return a / b;
    }

    public static float multiply(float a, float b) {
        return a * b;
    }

    public static boolean isNegative(int a) {
        return a < 0;
    }

    public static void login(Scanner input) {
        String login_db = "shohimardon296@gmail.com";
        String password_db = "12345Password";

        for (int i = 0; i < 10; i++) {
            System.out.println("Iltimos loginingizni kiriting!");
            String login = input.nextLine();
            if (login_db.equals(login)) {
                System.out.println("Iltimos parolingizni kiriting!");
                String password = input.nextLine();
                if (password_db.equals(password)) {
                    System.out.println("Tabriklaymiz siz platfasdormamizga kirdingiz");
                } else {
                    System.out.println("Siz parolingizni noto'g'ri kiritdingiz!");
                    continue;
                }
                break;
            } else {
                System.out.println("Siz login noto'g'ri kiritdingiz!");
                continue;
            }
        }
    }

    public static void register(Scanner input) {

        String first_name_db = "Shohimardon";
        String last_name_db = "Murtazoqulov";
        String email_db = "shohimardon296@gmail.com";

        for (int i = 0; i < 10; i++) {
            System.out.println("Iltimos ismingizni kiriting");
            String first_name = input.nextLine();
            if (!first_name_db.equals(first_name)) {
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
                            System.out.printf("Kiritilgan malumot %s,\t%s,\t%s,\t%s, \t%s,\t%s\n",
                                    first_name, last_name, age, sex,
                                    email, password);
                            System.out.println(
                                    "Foydalanuvchilar bizning programmamizga o'z login va parollari bilan kirish imkoniyatiga ega bo'lishsin");
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

    public static void order_book(Scanner input) {
        int x = 0;
        String choosed_book[] = {};

        while (x < 10) {
            System.out.println(
                    "Iltimos biror bir vairantni tanlang!\nA: Kitoblar ro'yxatini ko'rsat\nB: Dasturdan chiqish");
            String choice = input.nextLine();
            switch (choice) {
                case "A": {
                    System.out.println("Kitoblar ro'yxati");
                    String books[][] = {
                            { "TARIX", "Abdulla Qodiriy", "12000 so'm" },
                            { "FIZIKA", "Nyuton", "20000 so'm" },
                            { "MATEMATIKA", "AL-Farg'oniy", "25000 so'm" } };
                    int d = 0;

                    System.out.println("__________________________________________");
                    System.out.println("| Raqam \t| Kitobning nomi | Muallifi | ");
                    while (d < books.length) {
                        System.out.println("____________________________________________");
                        System.out.println(
                                "| " + d + " | " + books[d][0] + " | " + books[d][1] + " | " + books[d][2]
                                        + " |");
                        d++;

                    }
                    System.out.println("\nIltimos biror bir kitobni raqamini sotib olish uchun tanlang!");
                    int book = input.nextInt();
                    choosed_book = books[book];
                    x = 10;
                    break;
                }
                case "B": {
                    System.out.println("\nSiz dasturdan chiqdingiz");
                    x = 10;
                    break;
                }
                default: {
                    System.out.println("\nSiz mavjud bo'lmagan variantni tanladingiz");
                    break;
                }
            }
            x++;
        }
        System.out.printf("Siz tanlagan kitob nomi %s, muallifi %s, narxi %s\n", choosed_book[0], choosed_book[1],
                choosed_book[2]);
    }

    public static void display_variants() {
        System.out.println("Iltimos biror variantni tanlang");
        System.out.println("A: Login qilish");
        System.out.println("B: Ro'yxatdan o'tish");
        System.out.println("C: Kitob sotib olish");
        System.out.println("X: Dasturdan chiqish");
    }
}
