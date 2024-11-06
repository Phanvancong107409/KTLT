package buoi3;
public class Cong107409 
{
   public static String gioiTinh(boolean gt){
    return gt? "nam":"nữ";
       }   
    public static void main(String[] args) 
  {
    String maSV = "107409", hoVaTen = "Phan Văn Công", ngaySinh = "10/04/2006", 
      lop = "IT24A", khoa = "Công Nghệ Thông Tin", diaChi = "Quảng Nam";
           int tuoi = 18;
    boolean gt = false;

    System.out.println("-----THÔNG TIN SINH VIÊN-----");
    System.out.println("Mã Sinh Viên: "+maSV);
    System.out.println("Họ Và Tên: "+hoVaTen);
    System.out.println("Ngày Sinh: "+ngaySinh);
    System.out.println("Tuổi: "+tuoi);
    System.out.println("Giới Tính: "+gioiTinh);
    System.out.println("Lop: "+lop);
    System.out.println("Khoa: "+khoa);
    System.out.println("-----HẾT-----");
  }
}
