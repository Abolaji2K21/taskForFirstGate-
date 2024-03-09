package E_Store;

public class Product {

    private final int productId;
    private String productName;
    private double productPrice;
    private String productDesc;
    private ProductCategory productCategory;
    private boolean isAdmin;


    public Product(int productId, String productName, double productPrice, String productDesc, ProductCategory productCategory, boolean isAdmin) {
        if(productPrice < 0){
            throw new IllegalArgumentException("Product price cannot be negative");
        }
        if(!isAdmin){
            throw new IllegalArgumentException("Access denied: Only admin can modify product description");
        }
        this.productId = productId;
        this.productCategory = productCategory;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productDesc = productDesc;
        this.isAdmin = isAdmin;
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
    public boolean isAdmin() {
        return isAdmin;
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
        if(isAdmin) {
            this.productPrice = price;
        } else {
            throw new IllegalArgumentException("Access denied: Only admin can modify product description");

        }
    }






}
