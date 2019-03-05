// public class Main {
//
//     public static void main(String[] args) {
//         System.out.println("Hello World!");
//     }
// }

public class Main {
  public static void main(String[] args){
    int count = 0;
    while (count < 101)
    {
      if (count%15 == 0)
      {
        System.out.println("FizzBuzz");
      }
      else if (count%3 == 0)
      {
        System.out.println("Fizz");
      }
      else if (count%5 == 0)
      {
        System.out.println("Buzz");
      }
      else
      {
        System.out.println(count);
      }
      count++;
    }
  }
}
