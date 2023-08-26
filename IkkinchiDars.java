import java.util.Scanner;

public class IkkinchiDars {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int y = 10;
        if (x >= y) {
            System.out.println("X kotta yoki teng Y dan" + ANSI_YELLOW
            );
        } else {
            System.out.println("Tepadatig shartlar qoniqtirilmadi!" + ANSI_YELLOW);
        }
        System.out.println("Iltimos biror narsa kiriting");
        String kiritilganMalumot = input.nextLine();
        input.close();

        System.out.printf("Siz \"%s\" so'zini kiritdingiz!", kiritilganMalumot);

        System.out.println("" + ANSI_RESET);
    }
}