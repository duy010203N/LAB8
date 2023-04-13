
package lab8;

import java.util.Scanner;

public class sanpham {
String tensp ;
    double donGia, giamgia;
public void nhap(){
Scanner sc = new Scanner(System.in);
System.out.println("Nhập tên sp: ");
tensp=sc.nextLine();
System.out.println("Nhập đơn giá: ");
donGia=sc.nextDouble();
System.out.println("Nhập giảm giá: ");
giamgia= sc.nextDouble();
}
public void xuat(){
System.out.println("thông tin sản phẩm: "+getTensp()+"-"+getDonGia()+"-"+getGiamgia()+"-"+getThueNhapKhau());
}
public void sanpham(String sp, double donGia, double giamgia){
    this.tensp=sp;
    this.donGia=donGia;
    this.giamgia=giamgia;
}
public String getTensp(){
    return tensp;
}
public void setTensp(String tensp){
    this.tensp=tensp;
}
public double getDonGia(){
    return donGia;
}
public void setDonGia(double donGia){
    this.donGia=donGia;
}
public double getGiamgia(){
    return giamgia;
}
public void setgiamgia(double giamgia){
    this.giamgia=giamgia;
}
private double getThueNhapKhau(){
    return getDonGia()*(10/100);
}
public void sanpham(){
    
}
}
    class sp1 extends sanpham {
@Override
public void nhap(){
Scanner sc = new Scanner(System.in);
System.out.println("Nhập tên sp: ");
tensp=sc.nextLine();
System.out.println("Nhập đơn giá: ");
donGia=sc.nextDouble();
System.out.println("Nhập giảm giá: ");
giamgia= sc.nextDouble();
}
}
   class sp2 extends sanpham {
    @Override
public void nhap(){
Scanner sc = new Scanner(System.in);
System.out.println("Nhập tên sp: ");
tensp=sc.nextLine();
System.out.println("Nhập đơn giá: ");
donGia=sc.nextDouble();
System.out.println("Nhập giảm giá: ");
giamgia= sc.nextDouble();
}
}

   class main{
    public static void main(String[] args) {        
        sp1 sp1=new sp1();
        sp2 sp2=new sp2();
        sp1.nhap();
        sp1.xuat();
        sp2.nhap();
        sp2.xuat();
    
    }
    
}

