import java.util.HashMap;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      /*  checkCount("Bogahagoda");
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
        System.out.println(checkChar);*/

    // check reverse functionality of given set of integers

        /*Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number");
        int num = sc.nextInt();
        int rev = 0;

        while(num != 0){
            rev = rev * 10 + num % 10;
            num = num / 10;
        }
        System.out.println(rev);*/



        // adding string buffer method for revers string function

        String str = "abcdefgh";
        String rev = "";

        StringBuffer sb = new StringBuffer(str);
        System.out.println(sb.reverse());
    }
}