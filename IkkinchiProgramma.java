import java.util.Scanner;

public class IkkinchiProgramma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        input.close();
        System.out.printf("Kiritilgan malumot %s", age);
    }
}
