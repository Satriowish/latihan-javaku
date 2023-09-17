public class OperatorAritmatika {
    public static void main(String[] args) {
        // operasi aritmatika
        int variabel1 = 10;
        int variabel2 = 5;

        int hasil;

        // penjumlahan

        hasil = variabel1 + variabel2;
        System.out.printf("%d + %d = %d \n", variabel1, variabel2, hasil);

        // pengurangan

        hasil = variabel1 - variabel2;
        System.out.printf("%d - %d = %d \n", variabel1, variabel2, hasil);

        // perkalian

        hasil = variabel1 * variabel2;
        System.out.printf("%d x %d = %d \n", variabel1, variabel2, hasil);

        // pembagian

        hasil = variabel1 / variabel2;
        System.out.printf("%d / %d = %d \n", variabel1, variabel2, hasil);

        // float digunakan jika hasil adalah bilangan desimal atau koma
        float a = 7;
        float b = 2;
        float hasilfloat = a / b;
        System.out.println((a + " / " + b + " = " + hasilfloat));

        // modulus

        hasil = variabel1 % variabel2;
        System.out.printf("%d %% %d = %d \n", variabel1, variabel2, hasil);

    }
}