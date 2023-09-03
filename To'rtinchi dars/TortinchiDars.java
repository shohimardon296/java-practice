import java.util.Scanner;

public class TortinchiDars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("To'rtinchi dars. While loop haqida");
        int i = 0;
        while (i < 10) {
            System.out.println("Bizning raqam = " + i);
            i++;
        }
        System.out.println("Iltimos biror bir vairantni tanlang");
        System.out.println("A: A ni B ga qo'shish");
        System.out.println("B: A ni B ga ko'paytirish");
        String choice = input.nextLine();
        switch (choice) {
            case "A": {
                System.out.println("Iltimos A ni qiymatini kiriting");
                int a = input.nextInt();
                System.out.println("Iltimos B ni qiymatini kiriting");
                int b = input.nextInt();
                int result = a + b;
                System.out.println("A qo'shilgan B = " + result);
                break;
            }
            case "a": {
                System.out.println("Iltimos A ni qiymatini kiriting");
                int a = input.nextInt();
                System.out.println("Iltimos B ni qiymatini kiriting");
                int b = input.nextInt();
                int result = a + b;
                System.out.println("A qo'shilgan B = " + result);
                break;
            }
            case "B": {
                System.out.println("Iltimos A ni qiymatini kiriting");
                int a = input.nextInt();
                System.out.println("Iltimos B ni qiymatini kiriting");
                int b = input.nextInt();
                int result = a * b;
                System.out.println("A qo'shilgan B = " + result);
                break;
            }
            case "b": {
                System.out.println("Iltimos A ni qiymatini kiriting");
                int a = input.nextInt();
                System.out.println("Iltimos B ni qiymatini kiriting");
                int b = input.nextInt();
                int result = a * b;
                System.out.println("A qo'shilgan B = " + result);
                break;
            }
            default: {
                System.out.println("Siz noto'gri variant tanladingiz");
                break;
            }
        }
        if (choice == "A") {
            System.out.println("Iltimos A ni qiymatini kiriting");
            int a = input.nextInt();
            System.out.println("Iltimos B ni qiymatini kiriting");
            int b = input.nextInt();
            int result = a + b;
            System.out.println("A qo'shilgan B = " + result);
        } else if (choice == "A") {
            System.out.println("Iltimos A ni qiymatini kiriting");
            int a = input.nextInt();
            System.out.println("Iltimos B ni qiymatini kiriting");
            int b = input.nextInt();
            int result = a + b;
            System.out.println("A qo'shilgan B = " + result);
        } else {
            System.out.println("Siz noto'gri variant tanladingiz");
        }

        input.close();
    }
}
