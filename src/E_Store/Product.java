package E_Store;

public class Product {

    private final int productId;
    private String productName;
    private double productPrice;
    private String productDesc;
    private ProductCategory productCategory;


    public Product(int productId, String productName, double productPrice, String productDesc, ProductCategory productCategory){
        if(productPrice < 0){
            throw new IllegalArgumentException("Product price cannot be negative");
        }
        this.productId = productId;
        this.productCategory = productCategory;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productDesc = productDesc;
    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(ProductCategory category) {
        this.productCategory = category;
    }

    public void setProductDescription(String description) {
        this.productDesc = description;
    }
    public void setProduct(String product){
        this.productName = product;
    }
    public void setProductPrice(double price){
        this.productPrice = price;
    }



}
