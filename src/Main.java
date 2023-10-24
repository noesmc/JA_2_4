import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] channels = {"1 - BT", "2 - ONT", "3 - BT5", "4 - NTV",
                "5 - TNT", "6 - Victory", "7 - MTV", "8 - Nickelodeon", "9 - Disney"};
        for (String channel : channels) {
            System.out.println(channel);
        }
        System.out.println("0  - Exit");

        Scanner scanner = new Scanner(System.in);
        int x;
        boolean exit = false;

        while (!exit) {
            try {
                System.out.print("Enter the channel number: ");
                x = Integer.parseInt(scanner.next());
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
                    System.out.println("Wrong input!");
                }
            }
        }
    }
}