import java.util.*;

public class WesternZodiacExpression {
    public static void main(String[] args) {                
        Scanner in = new Scanner(System.in);      
        System.out.print("Please enter a month number (1-12): ");
        int month = in.nextInt();
        System.out.print("Please enter a day number in that month (1-31): ");
        int day = in.nextInt();
        String sign = switch (month) {
            case 1 -> {
                if (day < 20) {
                    yield "Capricorn";
                } else {
                    yield "Aquarius";
                }
            }
            case 2 -> {
                if (day < 20) {
                    yield "Aquarius";
                } else {
                    yield "Pisces";
                }
            }
            case 3 -> {
                if (day < 20) {
                    yield "Pisces";
                } else {
                    yield "Aries";
                }
            }
            case 4 -> {
                if (day < 20) {
                    yield "Aries";
                } else {
                    yield "Taurus";
                }
            }
            case 5 -> {
                if (day < 21) {
                    yield "Taurus";
                } else {
                    yield "Gemini";
                }
            }
            case 6 -> {
                if (day < 21) {
                    yield "Gemini";
                } else {
                    yield "Cancer";
                }
            }
            case 7 -> {
                if (day < 23) {
                    yield "Cancer";
                } else {
                    yield "Leo";
                }
            }
            case 8 -> {
                if (day < 23) {
                    yield "Leo";
                } else {
                    yield "Virgo";
                }
            }
            case 9 -> {
                if (day < 23) {
                    yield "Virgo";
                } else {
                    yield "Libra";
                }
            }
            case 10 -> {
                if (day < 23) {
                    yield "Libra";
                } else {
                    yield "Scorpio";
                }
            }
            case 11 -> {
                if (day < 22) {
                    yield "Scorpio";
                } else {
                    yield "Sagittarius";
                }
            }
            case 12 -> {
                if (day < 20) {
                    yield "Sagittarius";
                } else {
                    yield "Capricorn";
                }
            }
            default -> "Unknown";                
        };   
        System.out.println("The zodiac sign is: " + sign);
    }
}