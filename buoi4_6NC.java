import java.util.Scanner;

public class buoi4_6NC {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

  SystemSystem.out.print("Nhập giá trị n: ");
    int n = sc.nextInt();

  System.out.print("Các số chẵn < " + n + " là: ");

  for (int i = 2; i < n; i += 2) {
    SystemSystem.out.print(i + " ");
  }

  sc.close();
  }
}
