import java.util.HashSet;
import java.util.Scanner;

public class App56 {
  public static void main (String[] agr ) {
      String name;
      HashSet<String> hashSetString = new HashSet<>();
      Scanner scanner = new Scanner(System.in);

      hashSetString.add("wilson");
      hashSetString.add("Nike");
      hashSetString.add("volvo");
      hashSetString.add("Kia");
      hashSetString.add("Lenovo");
      hashSetString.add("lenovo");

      System.out.print("các phần tử trong hashSetString :");
      System.out.print(hashSetString);
      System.out.print("nhập phần tử cần xóa :") ;
      name = scanner.nextLine();
      
      if (hashSetString.contains(name)) {
          hashSetString.remove(name);
          System.out.print("xóa thành công !");
          System.out.print("các phần tử tồ tại trong hashSetString:");
          System.out.print(hashSetString);
      } else{
          System.out.print("xóa thành công !");
         scanner.close();
      }
  }
}           
      
      


