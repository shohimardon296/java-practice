public class TortinchiProgramma {
    public static void main(String[] args) {
        System.out.println("To'rtinchi programma");
        String books[] = { "Tarix", "Adabiyot", "Matematika", "Biologiya" }; // Massiv, array
        int i = 0;
        while (i < books.length) {
            System.out.println("Kitobning raqami " + i + " kitobning nomi " + books[i]);
            i++;
        }
        int j = 0; // Counter, xisoblagich
        String booksv2[][] = {
                { "Tarix", "Agelina Jolie" }, // 0 chi indeks da Kitob nomi, 1 chi index da Muallif
                { "Kruzo", "Ahmad Yassaviy" },
                { "Kruzo 2", "Ahmad Yassaviy 2" }
        }; // Two dimensional array, ikki qatlamlik massiv
        System.out.println("____________________________________________");
        System.out.println("| Raqam | Kitobning nomi | Muallifi |");
        while (j < booksv2.length) {
            System.out.println("____________________________________________");
            System.out.println("| " + j + "     | " + booksv2[j][0] + " | " + booksv2[j][1] + " |");
            j++;
        }
        /*
         * 
         * Foydalanuvchilar kutubxonadan kitob olish imkoniyatiga ega bo'lishsin
         * - Kitoblar ro'yxati
         * - Muayyan bo'lgan kitob haqidagi malumotlar
         * - Sotib olish imkoniyati
         * !!!Muhim, while, switch case ishlatib bajarilsin bu vazifa!!!
         * 
         * 
         * Biror bir variantni tanlang
         * 1: Kitoblar ro'yxati
         * _______________________________________
         * | Kitob raqami | Kitob nomi | Muallifi |
         * ----------------------------------------
         * | 1 | Sherlok holms | Jemmy K. |
         * ...
         * 
         * 2: Dasturdan chiqish
         */
        System.out.println("Dasturdan chiqdingiz.");

    }
}
