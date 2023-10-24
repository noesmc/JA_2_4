import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        String[] channel =
//                { "Exit", "BT", "ONT", "BT5", "NTV",
//                        "TNT", "Victory", "MTV", "Nickelodeon", "Disney"
//                };
////        int amount = channel.length;
////        System.out.println("Program is: ");
////
//////        for (int i = 1; i < amount; i++) {
//////            System.out.println(i + " - " + channel[i]);
//////            if (i == amount - 1) {
//////                System.out.println("0 - Exit");
//////            }
//////        }

        String[] channels = {"1 - BT", "2 - ONT", "3 - BT5", "4 - NTV",
                "5 - TNT", "6 - Victory", "7 - MTV", "8 - Nickelodeon", "9 - Disney"};
        for (String channel : channels) {
            System.out.println(channel);
        }
        System.out.println("0  - Exit");

        Scanner scanner = new Scanner(System.in);
        int x = 0;
        boolean exit = false;

        while (!exit) {
            try {
                System.out.print("Enter the channel number: ");
                x = scanner.nextInt();

                if (x == 0) {
                    System.out.println("You enter \"Exit\"");
                    exit = true;
                } else {
                    System.out.println(channels[x - 1]);
                }
            } catch (Exception e) {
                if (e instanceof ArrayIndexOutOfBoundsException) {
                    System.out.println("Channel is unavailable!");
                }   else {
                    System.out.print("Wrong input!");
                }
            }
        }
    }
}