import java.util.Random;
 public class Main
 {
public static void main(String args[])
 
 {
        String alphabet= "abcdefghijklmnopqrstuvwxyz";
        String s = "TestData";
        Random random = new Random();
        int randomLen = 1+random.nextInt(9);
        for (int i = 0; i < randomLen; i++) 
        {
            char c = alphabet.charAt(random.nextInt(26));
            int integer = random.nextInt(12);
            s+=c;
            s= s+integer;
        
        }
		System.out.println(s);
		System.out.println("New Branch, branch 1 is added");
        
    }
}