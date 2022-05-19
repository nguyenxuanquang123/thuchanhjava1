import java.util.LinkedList;
import java.util.Scanner;

public class App111 {
  public static void main(String[] args){
      int n;  
      int node;   
      Scanner scan = new Scanner(System.in);
           
      LinkedList<Integer> linkedList = new LinkedList<>();
             
      System.out.println("Nhap vao so phan tu cua danh sach: ");
      n = scan.nextInt();
           
      System.out.println("Nhap gia tri cua cac phan tu trong danh sach: ");
      for (int i = 0; i < n; i++) {
        System.out.print("Nhap gia tri thu " + i +": ");
        node = scan.nextInt();
        linkedList.add(node);
      }
      double sumLinkedList = 0, count =0;
      for (int i=0; i<linkedList.size();i++){
          count++;
          sumLinkedList += linkedList.get(i);
      }
      Double average = sumLinkedList/count;
      System.out.println("Trung binh cong cac phan tu trong linkedList: " + average);
      scan.close();
  }
}