import java.util.Scanner;

public class BirinchiProgramma {
    public static void main(String[] args) {
        String login_db = "otabekbutcher@gmail.com";
        String password_db = "12345Password";

        Scanner input = new Scanner(System.in);

        System.out.println("Iltimos loginingizni kiriting!");
        String login = input.nextLine();
        System.out.println("Iltimos parolingizni kiriting!");
        String password = input.nextLine();

        input.close();

        if(login_db.equals(login) && password_db.equals(password)) {
            System.out.println("Tabriklaymiz siz platformamizga muvaffaqiyatli kirdingiz");
        } else {
            System.out.println("Siz login yoki parolingizni noto'g'ri kiritdingiz!");
        }
    }

}
