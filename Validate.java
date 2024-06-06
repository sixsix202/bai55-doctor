
public class Validate {
    public static String regexID = "^DOC\\s\\d$";
    public static String regexName = "[a-zA-Z ]{2,}";
    public static String regexAvil = "^[0-9]{1,2}$";
    
    public static boolean checkInput(String s, String regex){
        return s.matches(regex);
    }
}
