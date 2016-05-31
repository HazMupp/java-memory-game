import java.util.*;

public class Player    {

    String name;

    Scanner nameScanner = new Scanner(System.in);

    public Player(){

    }

    public void setName() {
        System.out.println("Whats your name darling? ");
        name = nameScanner.next();

    }

    public String getName() {
        return name;

    }

}
