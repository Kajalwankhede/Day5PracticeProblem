package day5;
import java.util.Scanner;
public class Vowelconsonant {
    int Checkalphabate() {
        System.out.println("Enter the alphabet : ");
        Scanner sc = new Scanner(System.in);
        char character = sc.next().charAt(0);
        switch (character) {
            case 'a':
                System.out.println("Alphabet = a is, a vowel");
                break;
            case 'e':
                System.out.println("Alphabet = e is, a vowel");
                break;
            case 'i':
                System.out.println("Alphabet = i is, a vowel");
                break;
            case 'o':
                System.out.println("Alphabet = o is, a vowel");
                break;
            case 'u':
                System.out.println("Alphabet = u is, a vowel");
                break;
            default:
                System.out.println("Alphabet = " + character + " is, a consonant");
                break;
        }
        return 0;
    }
    public static void main(String[] args)
        {
         Vowelconsonant V=new Vowelconsonant();
         V.Checkalphabate();

        }
}