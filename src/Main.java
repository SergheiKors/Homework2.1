// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int value = 800; //стоимость билета
        int pricemile = 20; //количество рублей за каждую бонусную милю
        int quantitymile = value / pricemile; // количество бонусных миль
        System.out.println(quantitymile);
    }
}