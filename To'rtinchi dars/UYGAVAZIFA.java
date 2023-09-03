import java.util.Scanner;

public class UYGAVAZIFA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("UYGAVAZIFA");
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
                    // double double_number[][] = { { 23, 45 }, { 45, 67, 56, 67, 78 } };
                    // for (int i = 0; i < double_number.length; i++) {
                    // for (int l = 0; l < double_number[i].length; l++) {
                    // System.out
                    // .println("Number " + double_number[i][l] + " birinchi massiv element raqami "
                    // + i
                    // + " ikkinchi massiv element raqami " + l);
                    // }
                    // }
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
        input.close();
        System.out.println("SHAPALOQLAR BO'LSIN )))");
    }
}
