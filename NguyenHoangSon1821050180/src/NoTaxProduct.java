import java.util.Scanner;
public class NoTaxProduct extends Product {
    protected String name;
    protected int price, tax;
    public void getTax(){
        tax = 0;

    }
    void setProduct(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten: ");
        name = sc.nextLine();
        System.out.println("Nhap don gia: ");
        price = sc.nextInt();
    }
    void getproduct(){
        System.out.println("Ho va ten: "+name+"\nDon gia:"+price+"\nThue: "+price+"\nTong: "+(price + tax));
    }
}