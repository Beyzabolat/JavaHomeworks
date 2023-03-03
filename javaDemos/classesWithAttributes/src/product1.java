public class product1{
public static void main(String[] args) {
    Product product =new Product();
    product.name="laptop";
    product.id=1;
    product.description="monster laptop";
    product.stockAmount=3;
    product.price=5000;
    productManager productManager=new productManager();
    productManager.Add(product);
    System.out.println(product.name);
} 
    
}
