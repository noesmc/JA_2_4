import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] channel =
                { "Exit", "BT", "ONT", "BT5", "NTV",
                        "TNT", "Victory", "MTV", "Nickelodeon", "Disney"
                };
        Scanner scanner = new Scanner(System.in);
        int x;
        while (true) {
            try {
                System.out.print("Enter the channel number: ");
                x = scanner.nextInt();
                System.out.println("Entered channel is: " + channel[x]);
                if (x == 0) {
                    System.out.println("You finally enter " + channel[x]);
                    break;
                }
            }
            catch (ArrayIndexOutOfBoundsException e ) {
                {
                    System.out.println("Channel is unavailable!");
                }
            }
        }
    }
}