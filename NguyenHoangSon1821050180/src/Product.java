import java.util.Scanner;

public class Product {
    protected String name;
    protected int price, tax;
    public void getTax(){
        tax = (price*10)/100;

    }
    void setProduct(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten: ");
        name = sc.nextLine();
        System.out.println("Nhap don gia: ");
        price = sc.nextInt();
    }
    void  getProduct(){
        System.out.println("Ho va ten: "+name+"\nDon gia:"+price+"\nthue: "+tax+"\nTong: "+(price + tax));
    }
}
