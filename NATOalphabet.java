import java.util.Scanner;
public class NATOalphabet {
    public static void main(String[] args) {

        System.out.println("Write your name(Please use English characters):");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        String isim = name.toUpperCase();
        for(int i = 0; i < isim.length(); i++){
            switch (isim.charAt(i)){
                case ' ':
                    System.out.println();
                    break;
                case 'A':
                    System.out.println("A is Alpha");
                    break;
                case 'B':
                    System.out.println("B is Bravo");
                    break;
                case 'C':
                    System.out.println("C is Charlie");
                    break;
                case 'D':
                    System.out.println("D is Delta");
                    break;
                case 'E':
                    System.out.println("E is Echo");
                    break;
                case 'F':
                    System.out.println("F is Foxtrot");
                    break;
                case 'G':
                    System.out.println("G is Golf");
                    break;
                case 'H':
                    System.out.println("H is Hotel");
                    break;
                case 'I':
                    System.out.println("I is India");
                    break;
                case 'İ':
                    System.out.println("I is India");
                    break;
                case 'J':
                    System.out.println("J is Juliett");
                    break;
                case 'K':
                    System.out.println("K is Kilo");
                    break;
                case 'L':
                    System.out.println("L is Lima");
                    break;
                case 'M':
                    System.out.println("M is Mike");
                    break;
                case 'N':
                    System.out.println("N is November");
                    break;
                case 'O':
                    System.out.println("O is Oscar");
                    break;
                case 'P':
                    System.out.println("P is Papa");
                    break;
                case 'Q':
                    System.out.println("Q is Quebec");
                    break;
                case 'R':
                    System.out.println("R is Romeo");
                    break;
                case 'S':
                    System.out.println("S is Sierra");
                    break;
                case 'T':
                    System.out.println("T is Tango");
                    break;
                case 'U':
                    System.out.println("U is Uniform");
                    break;
                case 'V':
                    System.out.println("V is Victor");
                    break;
                case 'W':
                    System.out.println("W is Whiskey");
                    break;
                case 'X':
                    System.out.println("X is X-ray");
                    break;
                case 'Y':
                    System.out.println("Y is Yankee");
                    break;
                case 'Z':
                    System.out.println("Z is Zulu");
                    break;
                default:
                    System.out.println(isim.charAt(i)+ " is not in NATO alphabet.");
                    break;
            }
        }
    }
}
