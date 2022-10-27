package activity_2;

import java.util.Scanner;

public class TripPlanner {
    public static void main(String [] args){
        // Part 1: Greeting
        // greeting();

        // Part 2: Travel Time and Budget
        // travelTimeBudget();

        // Part 3: Time difference
        //timeDifference();

        // Part 4: Country Area
         countryArea();
    }

    public static void greeting(){
        Scanner input = new Scanner(System.in);
        String greet = "Welcome to Vacation Planner!\n" +
                "What is your name: ";
        System.out.println(greet);
        String userName = input.nextLine();

        String NamePlace = "Nice to meet you " + userName + ", where are you traveling to? ";
        String location = input.nextLine();
        System.out.println(NamePlace);

        String goodLuck = "Great! " + location + " sounds like a great trip\n" +
                "***********";
        System.out.println(goodLuck);
    }

    private static void travelTimeBudget(){
        Scanner input = new Scanner(System.in);
        String TimeSpent = "\"How many days are you going to spend traveling?";
        System.out.println(TimeSpent);
        int time = input.nextInt();

        int hours = time * 24;
        int minutes = hours * 60;
        int seconds = minutes * 60;

        String MoneySpent = "How much money, in USD, are you planning to spend on your trip: ";
        System.out.println(MoneySpent);
        double money = input.nextDouble();
        double x = (money / time) * 100;
        int ans = (int) x;
        double moneyPerDay = ((double) ans) / 100 ;


        String CurrencySymbol = "What is the three letter currency symbol for your travel destination? ";
        System.out.println(CurrencySymbol);
        String currency = input.next();

        String Conversion = "How many EUR are there in 1 USD? ";
        System.out.println(Conversion);
        double CurrencyInUSD = input.nextDouble();
        double inCurrency = money * CurrencyInUSD;

        System.out.println();

        double b = ((money * CurrencyInUSD) / time) * 100;
        int a = (int) b;
        double inCurrPerDay = (double) a / 100;

        System.out.println("If you are traveling for " + time + " days that is same as " + hours + " hours or " + minutes + " minutes or " + seconds + " seconds.");
        System.out.println("If you are going to spend $" + (int) money + " USD that means per day you can spend up to $" + moneyPerDay + " USD");
        System.out.println("Your total budget in " + currency + " is " + inCurrency + " " + currency + ", which per day is " + inCurrPerDay + " " + currency);
        System.out.println("***********");
    }

    public static void timeDifference(){
        Scanner input = new Scanner(System.in);

        String timeDiff = "What is the time difference, in hours, between your home and your destination? ";
        System.out.println(timeDiff);
        int diffInTime = input.nextInt();

        String convertTime = "That means that when it is midnight at home it will be " + diffInTime + ":00 in your travel destination and when it's noon at home it will be " + (12 + diffInTime) +":00\n" +
                "***********";
        System.out.println(convertTime);

    }

    public static void countryArea(){
        Scanner input = new Scanner(System.in);

        String areaInKm = "What is square area of your destination country in km2?";
        System.out.println(areaInKm);

        double kmInMile = 0.38610215854245;

        int areaKm = input.nextInt();

        double areaMiles = areaKm * kmInMile;

        int q = (int)(areaMiles * 100);
        double ans = (double) q/100;
        System.out.println("In miles2 that is " + ans + "\n" +
                "***********");
    }
}


