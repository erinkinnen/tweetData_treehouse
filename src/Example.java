import java.util.Date;
import com.teamtreehouse.Treet;

public class Example {

    public static void main(String[] args) {
        Treet treet = new Treet(
          "erinkinnen",
          "1st treet",
           new Date(1502153818L)
        );
        System.out.printf("This is a new Treet: %s %n", treet);
    }

}