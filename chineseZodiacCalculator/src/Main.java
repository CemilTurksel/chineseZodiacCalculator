import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int birthYear, remainder;
        String horoscope = "";

        System.out.println("Please enter your birth year: ");
        birthYear =  scanner.nextInt();
        remainder= birthYear % 12;

        switch (remainder) {
            case 0 -> horoscope = "Monkey";
            case 1 -> horoscope = "Rooster";
            case 2 -> horoscope = "Dog";
            case 3 -> horoscope = "Pig";
            case 4 -> horoscope = "Mouse";
            case 5 -> horoscope = "Ox";
            case 6 -> horoscope = "Tiger";
            case 7 -> horoscope = "Rabbit";
            case 8 -> horoscope = "Dragon";
            case 9 -> horoscope = "Snake";
            case 10 -> horoscope = "Horse";
            case 11 -> horoscope = "Sheep";
        }
        System.out.println("Chinese zodiac : " + horoscope);
    }
}
