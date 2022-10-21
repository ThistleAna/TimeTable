import java.util.Scanner; // import Scanner class

public class TimeTables {
    public static void main(String[] args) {
        //this program will display times table of the number up to 12
        Scanner reader = new Scanner(System.in);
        System.out.print("What times table would you like");
        int timesTable = reader.nextInt();

        for (int i = 1; i < 13; i++) //display until 12 x timeTable
        {
            System.out.println (timesTable + "x" + i);
        }

    }
}
