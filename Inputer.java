
import java.util.Scanner;

public class Inputer {
    Scanner sc = new Scanner (System.in);
    public String getCode(String mess){
        String s;
        while(true){
            System.out.print(mess);
            s = sc.nextLine().trim();
            if (Validate.checkInput(s, Validate.regexID))
                break;
            else
                System.err.println("Enter again");
        }
        return s;
    }
    public String getName(String mess){
        String s;
        while(true){
            System.out.print(mess);
            s = sc.nextLine().trim();
            if (Validate.checkInput(s, Validate.regexName))
                break;
            else
                System.err.println("Enter again");
        }
        return s;
    }
    public int getIntInput(String mess, int min, int max){
        int input = 0;
        while(true){
            System.out.print(mess);
            try{
                input = Integer.parseInt(sc.nextLine().trim());
                if (input >= min && input <= max)
                    break;
                else
                    System.err.println("Enter again");
            } catch (Exception e){
                System.err.println("Enter again");
            }
        }
        return input;
    }
}
