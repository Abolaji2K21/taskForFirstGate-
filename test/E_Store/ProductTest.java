package E_Store;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    @Test
    void testThatBothUserAndAminCanGetProductId() {
        ProductCategory productCategory = ProductCategory.ELECTRONICS;
        Product product = new Product(1, "Laptop", 1000.0, "High-performance laptop", productCategory,false);
        assertEquals(1, product.getProductId());
    }

    @Test
    void testThatBothUserAndAdminCanGetProductPrice() {
        ProductCategory productCategory = ProductCategory.ELECTRONICS;
        Product product = new Product(1, "Laptop", 1000.0, "High-performance laptop", productCategory, false);
        assertEquals(1000.0, product.getProductPrice());
    }

    @Test
    void testThatBothUserAndAdminCanGetProductName() {
        ProductCategory productCategory = ProductCategory.CLOTHING;
        Product product = new Product(1, "Dress", 1000.0, "show me your back ", productCategory, false);
        assertEquals("Dress", product.getProductName());
    }

    @Test
    void testThatBothUserAndAdminCanGetProductDesc() {
        ProductCategory productCategory = ProductCategory.CLOTHING;
        Product product = new Product(1, "Dress", 1000.0, "show me your back ", productCategory, false);
        assertEquals("show me your back ", product.getProductDesc());
    }
    @Test
    void testThatBothUserAndAdminCanGetProductCategory() {
        ProductCategory productCategory = ProductCategory.CLOTHING;
        Product product = new Product(1, "Dress", 1000.0, "show me your back ", productCategory, false);
        assertEquals(productCategory, product.getProductCategory());
    }

    @Test
    void testAdmin() {
        ProductCategory productCategory = ProductCategory.UTENSILS;
        Product product = new Product(1, "Pot", 10.0, "Stainless steel pot", productCategory, true);
        assertTrue(product.isAdmin());
    }

    @Test
    void testThatOnlyAdminCanSetProductName() {
        ProductCategory productCategory = ProductCategory.UTENSILS;
        Product product = new Product(1, "Pot", 10.0, "Stainless steel pot", productCategory, true);
        product.setProductName("Cooking Pot");
        assertEquals("Cooking Pot", product.getProductName());
    }

    @Test
    void testExceptionWhenUserTryToSetProductName() {
        ProductCategory productCategory = ProductCategory.GROCERIE;
        Product product = new Product(1, "Biscuit", 10.0, "Crackers Biscuit", productCategory, false);
        assertThrows(IllegalArgumentException.class, () -> product.setProductName(""));
    }

    @Test
    void testExceptionWhenUserTryToSetProductDesc() {
        ProductCategory productCategory = ProductCategory.GROCERIE;
        Product product = new Product(1, "Biscuit", 10.0, "Crackers Biscuit", productCategory, false);
        assertThrows(IllegalArgumentException.class, () -> product.setProductDesc(""));
    }

    @Test
    void testExceptionWhenUserTryToSetProductCategory() {
        ProductCategory productCategory = ProductCategory.GROCERIE;
        Product product = new Product(1, "Biscuit", 10.0, "Crackers Biscuit", productCategory, false);
        assertThrows(IllegalArgumentException.class, () -> product.setProductCategory(null));
    }

    @Test
    void testExceptionWhenUserTryToSetProductPrice() {
        ProductCategory productCategory = ProductCategory.GROCERIE;
        Product product = new Product(1, "Biscuit", 10.0, "Crackers Biscuit", productCategory, false);
        assertThrows(IllegalArgumentException.class, () -> product.setProductPrice(0.0));
    }

    @Test
    void testThatOnlyAdminCanSetProductPrice() {
        ProductCategory productCategory = ProductCategory.GROCERIE;
        Product product = new Product(1, "Biscuit", 10.0, "Crackers Biscuit", productCategory, true);
        product.setProductPrice(50.0);
        assertEquals(50.0, product.getProductPrice());
    }

    @Test
    void testThatOnlyAdminCanCreateProductDescription(){
        ProductCategory productCategory = ProductCategory.GROCERIE;
        Product product = new Product(1, "Biscuit", 10.0, "Crackers Biscuit", productCategory, true);
        product.setProductDescription("DownYourThroat");
        assertEquals("DownYourThroat", product.getProductDesc());
    }

    @Test
    void testThatOnlyAdminCanCreateProductName(){
        ProductCategory productCategory = ProductCategory.GROCERIE;
        Product product = new Product(1, "Biscuit", 10.0, "Crackers Biscuit", productCategory, true);
        product.setProductName("MouthThing");
        assertEquals("MouthThing", product.getProductName());
    }
    @Test
    void testProductIdValidation() {
        assertThrows(IllegalArgumentException.class, () -> new Product(-1, "Laptop", 1000.0, "High-performance laptop", ProductCategory.ELECTRONICS, false));
    }

    @Test
    void testProductPriceValidation() {
        assertThrows(IllegalArgumentException.class, () -> new Product(1, "Laptop", -1000.0, "High-performance laptop", ProductCategory.ELECTRONICS, false));
    }

    @Test
    void testThatAdminCanNotForgetfullySetPriceToNegative(){
        ProductCategory productCategory = ProductCategory.GROCERIE;
        Product product = new Product(1, "Biscuit", 10.0, "Crackers Biscuit", productCategory, true);
        assertThrows(IllegalArgumentException.class, () -> product.setProductPrice(-50.0));
    }

    @Test
    void testAdminAccessControlForProductCategory() {
        Product product = new Product(1, "Laptop", 1000.0, "High-performance laptop", ProductCategory.ELECTRONICS, true);
        ProductCategory newCategory = ProductCategory.ACCESSORIES;
        product.setProductCategory(newCategory);
        assertEquals(newCategory, product.getProductCategory());
    }

   @Test
    void testProductNameValidationIsNotEmpty() {
        assertThrows(IllegalArgumentException.class, () -> new Product(1, "", 1000.0, "High-performance laptop", ProductCategory.ELECTRONICS, false));
    }

    @Test
    void testProductNameValidationIsNotNull() {
        assertThrows(IllegalArgumentException.class, () -> new Product(1, null, 1000.0, "High-performance laptop", ProductCategory.ELECTRONICS, false));

    }


}
