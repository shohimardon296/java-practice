import java.util.Scanner;

public class BirinchiProgramma {
    public static void main(String[] args) {
        String login_db = "otabekbutcher@gmail.com";
        String password_db = "12345Password";

        Scanner input = new Scanner(System.in);

        // Loop
        for(int i = 0; i < 10; i++){
            System.out.println("Iltimos loginingizni kiriting!");
            String login = input.nextLine();
            // && AND ikki shart ham qoniqsa ichidegi kod bajariladi
            // || OR yoki birinchi shart yoki ikkinchi shart bajarilsa ichidegi kod bajariladi
            if(login_db.equals(login)) {
                System.out.println("Iltimos parolingizni kiriting!");
                String password = input.nextLine();
                if (password_db.equals(password)) {
                    System.out.println("Tabriklaymiz siz platfasdormamizga to'g'ri kirdingiz");
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
        input.close();

    }

}
