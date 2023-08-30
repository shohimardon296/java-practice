
public class UYGAVAZIFA {
    public static void main(String[] args) {
        System.out.println("UYGAVAZIFA");
        String books[] = { "TARIX", "FIZIKA", "MATEMATIKA" };
        int c = 0;
        while (c < books.length) {
            System.out.println("Kitobning raqami " + c + " kitobning nomi " + books[c]);
            c++;
        }
        int d = 0;
        String booksv2[][] = {
                { "   TARIX", " Abdulla Qodiriy " },
                { "  FIZIKA", "      Nyuton    " },
                { "MATEMATIKA", "AL-Farg'oniy" } };

        System.out.println("__________________________________________");
        System.out.println("| Raqam| Kitobning nomi |    Muallifi     | ");
        while (d < booksv2.length) {
            System.out.println("____________________________________________");
            System.out.println("| " + d + "   | " + booksv2[d][0] + "    |  " + booksv2[d][1] + "     |");
            d++;

        }

        System.out.println("Dasturdan chiqdingiz.");

    }
}
