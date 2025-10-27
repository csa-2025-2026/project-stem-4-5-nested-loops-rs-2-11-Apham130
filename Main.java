import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // Make sure to test your methods here
    // printNTimes("hello", 5);
    // printNums(10, 1);
    // uprightNumberTriangle(5);
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter an int: ");
    int input = sc.nextInt();
    starTree(input);

  }

  public static void printNTimes(String word, int N)
  {
    // code solution here
    for (int i = 0; i < word.length(); i++) {
      String let = word.substring(i,i+1);
      for (int j = 0; j < N; j++) {
        System.out.print(let + " ");
      }
      System.out.println();
    }
  }

  public static void printNums(int S, int E)
  {
    // code solution here
    for (int i = S; i >= E; i--) {
      for (int j = i; j > 0; j--) {
        System.out.print(i + " ");
      }
      System.out.println();
    }
  }

  public static void uprightNumberTriangle(int N)
  {
    for (int i = 1; i <= N; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(j + " ");
      }
      System.out.println();
    }
  }

  public static void starTree(int N)
  {
    int j = 0;
    int y = N;
    for (int x = 0; x < N; x++) {
      for (int k = 0; k < j; k++) {
          System.out.print(" ");
        }
      for (int i = y; i > 0; i--) { 
        System.out.print("* ");
      }
      System.out.println();
      j++;
      y--;
    }
  }

  public static void multTable()
  {
    int j = 1;
    for (int i = 1; i <= 10; i++) {
      
      
      j++
    }
  }
}
