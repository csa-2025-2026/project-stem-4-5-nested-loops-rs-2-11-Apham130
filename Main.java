import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // Make sure to test your methods here
    printNums();
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

  public static void printNums()
  {
    // code solution here
    for (int i = 10; i > 0; i--) {
      for (int j = i; j > 0; j--) {
        System.out.print(i + " ");
      }
      System.out.println();
    }
  }

  public static void uprightNumberTriangle(int N)
  {
    // code solution here
  }

  public static void starTree()
  {
    // code solution here
  }

  public static void multTable()
  {
    // code solution here
  }
}
