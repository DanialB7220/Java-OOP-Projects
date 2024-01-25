import java.util.Scanner;
public class palindome {
    public static void main(String[] args) {
    System.out.println("Enter a word and I will tell you if it is Palindrome");
    Scanner in = new Scanner(System.in);
    String word = in.nextLine();
    String rever = new StringBuilder(word).reverse().toString();

    if(word.equals(rever)){
        System.out.println("yes");
        }
    else{
        System.out.println("no");
        }
    }

}
