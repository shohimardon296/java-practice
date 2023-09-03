package Beshinchi;

import java.util.Scanner;

public class BeshinchiDarsAsosiy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            BeshinchiDars.display_variants();
            String choice = input.nextLine();
            switch (choice) {
                case "A": {
                    BeshinchiDars.login(input);
                    break;
                }
                case "B": {
                    BeshinchiDars.register(input);
                    break;
                }
                case "C": {
                    BeshinchiDars.order_book(input);
                    break;
                }
                case "X": {
                    System.out.println("Siz dasturdan chiqdingiz");
                    i = 10;
                    break;
                }
                default: {
                    System.out.println("Siz mavjud bo'lmagan variantni tanladingiz");
                    break;
                }
            }
        }
        input.close();
    }
}
