package E_Store;

public class Product {

    private int productId;
    private String productName;
    private double productPrice;
    private String productDesc;
    private ProductCategory productCategory;
    private boolean isAdmin;


    public Product(int productId, String productName, double productPrice, String productDesc, ProductCategory productCategory, boolean isAdmin) {
        if(productPrice < 0){
            throw new IllegalArgumentException("Product price cannot be negative");
        }
        if (productId < 0 ){
            throw new IllegalArgumentException("Product id cannot be negative");
        }
        if (productName == null || productName.isEmpty()){
            throw new IllegalArgumentException("Product name cannot be null or empty");
        }
//        if (productDesc == null || productDesc.isEmpty()){
//            throw new IllegalArgumentException("Product description cannot be null or empty");
//        }

//        if(!isAdmin){
//            throw new IllegalArgumentException("Access denied: Only admin can modify product description");
//        }
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
//    public boolean isAdmin() {
//        return isAdmin;
//    }
    public void setProductCategory(ProductCategory category) {
        if(isAdmin) {
            this.productCategory = category;
        }else {
            throw new IllegalArgumentException("Access denied: Only admin can modify product categories");
        }
    }
    public void setProductDescription(String description) {
        if(isAdmin) {
            this.productDesc = description;
        } else {
            throw new IllegalArgumentException("Access denied: Only admin can modify product categories");
        }
    }
//    public void setProduct(String product){
//        this.productName = product;
//    }
    public void setProductPrice(double price){
        if(isAdmin) {
            if (price > 0) {
                this.productPrice = price;
            } else {
                throw new IllegalArgumentException("Prices cannot be negative");
            }
        } else {
            throw new IllegalArgumentException("Access denied: Only admin can modify product prices");
        }
    }

    public void setProductName(String name){
        if(isAdmin) {
            this.productName = name;
        } else {
            throw new IllegalArgumentException("Access denied: Only admin can modify product name");

        }
    }

    public void setProductDesc(String productDesc) {
        if(isAdmin) {
            this.productDesc = productDesc;
        } else {
            throw new IllegalArgumentException("Access denied: Only admin can modify product description");
        }
    }
//    public void setProductId(int productId) {
//        this.productId = productId;
//    }
    public double calculateDiscountedPrice(double discountPercentage) {
        if (discountPercentage > 100.0) {
            throw new IllegalArgumentException("discountPercentage cannot be greater than 100");
        } else if (discountPercentage < 0.0) {
            throw new IllegalArgumentException("discountPercentage cannot be lesser than 0");
        } else {
            return productPrice * (1 - discountPercentage / 100);
        }
    }

//    public boolean isAvailable() {
//        return true;
//    }

}
