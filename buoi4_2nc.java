import java.util.Scanner;

public class buoi4_2nc {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

  System.out.print("Nhập giá trị n: ");
    int n = sc.nextlnt();

    System.out.print("CÁc số từ 1 đến " + n + "là: ");

    for (int i = 1; i <= n; i++) {
      System.out.print(i + " ");
    }

    sc.close();
  }
}

    
