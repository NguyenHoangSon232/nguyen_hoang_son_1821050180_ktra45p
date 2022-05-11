public class Main {
    public static void main(String[]args) {
        Product A = new Product();
        A.setProduct();
        A.getTax();
        A.getProduct();
        NoTaxProduct B = new NoTaxProduct();
        B.setProduct();
        B.getProduct();
        B.getTax();
    }
}