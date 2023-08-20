import java.lang.String;

public class MyMain {
    public static void main(String[] args) {
        byte byteNumber = 1;
        short shortNumber = 2;
        int number = 3;
        float floadNumber = 1.4f;
        double doubleNumber = 3.0d;
        char character = 'D';
        long longNumber = 12324;
        boolean booleanType = false;

        int newDouble = (int) doubleNumber;

        String str = new String("Hello");

        System.out.println("Salom dunyo");
        System.out.printf("Bu bizning byte turimiz = %s \n", byteNumber);
        System.out.printf("Bu bizning integer turimiz = %s \n", number);
        System.out.printf("Bu bizning shortNumber turimiz = %s \n", shortNumber);
        System.out.printf("Bu bizning floatNumber turimiz = %s \n", floadNumber);
        System.out.printf("Bu bizning double turimiz = %s \n", doubleNumber);
        System.out.printf("Bu bizning character turimiz = %s \n", character);
        System.out.printf("Bu bizning longNumber turimiz = %s \n", longNumber);
        System.out.printf("Bu bizning booleanType turimiz = %s \n", booleanType);
        System.out.printf("Bu bizning String turimiz = %s \n", str);
        
        System.out.printf("Bu bizning String turimiz = %s \n", newDouble);

        System.out.println("______________________________________________\n");

        System.out.printf("Qo'shish, ayirish, ko'paytirish, bo'lish, qoldiq olish = %s,\t %s,\t %s,\t %s,\t %s \n", number += 1, number -= 1, number *= 2, number /= 3, number %= 2);
        System.out.printf("Bizning raqamimiz %s \n", number);

        int number2 = 3;
        int number3 = 4;
        System.out.printf("Bizning qiymatlarimiz tengligini tekshirish == %s \n", number2 == number3);
        System.out.printf("Bizning qiymatlarimiz tengligini tekshirish != %s \n", number2 != number3);
        System.out.printf("Bizning qiymatlarimiz tengligini tekshirish <= %s \n", number2 <= number3);
        System.out.printf("Bizning qiymatlarimiz tengligini tekshirish >= %s \n", number2 >= number3);
        System.out.printf("Bizning qiymatlarimiz tengligini tekshirish < %s \n", number2 < number3);
        System.out.printf("Bizning qiymatlarimiz tengligini tekshirish > %s \n", number2 > number3);
     }
}
