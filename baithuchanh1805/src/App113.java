import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Iterator;
import java.util.Scanner;

public class App113 {
  public static void main(String[] args) {
    String fruitName;
    int n;
    Scanner scan = new Scanner(System.in);
 
    HashSet<String> hashSetFruits = new HashSet<String>();
     
    System.out.println("Nhap vao so phan tu cua hashSetFruits: ");
    n = Integer.parseInt(scan.nextLine());  
         
    System.out.println("Nhap vao ten cac loai trai cay: ");
    for (int i = 0; i < n; i++) {
        System.out.print("Nhap ten loai trai cay thu " + i + ": ");
        fruitName = scan.nextLine();
        hashSetFruits.add(fruitName);
    }
 
    System.out.println("So phan tu cua hashSetFruits = " + hashSetFruits.size());
      
    System.out.println("Nhap ten loai trai cay can tim: ");
    String fruitSearch = scan.nextLine();
    if (hashSetFruits.contains(fruitSearch)) {
        System.out.println("Co trai cay " + fruitSearch + " trong hashSetFruits!");
    } else {
        System.out.println("Khong tim thay " + fruitSearch);
    }
         
    System.out.println("Nhap vao ten loai trai cay can xoa: ");
    String fruitDelete = scan.nextLine();
 
    if (hashSetFruits.contains(fruitDelete)) {
        hashSetFruits.remove(fruitSearch);
        System.out.println("Xoa thanh cong!");
        System.out.println("Cac phan tu con lai trong hashSetFruits: " + hashSetFruits);
    } else {
        System.out.println("Xoa khong thanh cong!");
    }
         
    List<String> listFruits = new ArrayList<>();
    listFruits.add("Dau");
    listFruits.add("Thanh Long");
    listFruits.add("Xoai");
    listFruits.add("Sau Rieng");
 
    hashSetFruits.addAll(listFruits);
    System.out.println("Cac phan tu co trong hashSetFruits sau khi them: ");
    Iterator<String> iterator = hashSetFruits.iterator();
    while (iterator.hasNext()) {
        System.out.print(iterator.next() + "\t");
    }

    hashSetFruits.removeAll(listFruits);
    System.out.println("\nCac phan tu co trong hashSetFruits sau khi xoa: " + hashSetFruits);
    scan.close();
}
}