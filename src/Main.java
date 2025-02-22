import java.util.HashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        checkCount("Bogahagoda");
    }
    public static void checkCount (String typeName){
        HashMap<Character, Integer> checkChar = new HashMap<Character, Integer>();
        char[] map = typeName.toCharArray();
        for(Character c: map){
            if(checkChar.containsKey(c)){
                checkChar.put(c, checkChar.get(c)+1);
            }
            else {
                checkChar.put(c,1);
            }
        }
        System.out.println(checkChar);
    }
}