
import java.util.Arrays;
import java.util.Comparator;

public class SearchTest {
    public static void main(String[] args) {
        Product[] products = {
            new Product(1, "Laptop", "Electronics"),
            new Product(2, "Phone", "Electronics"),
            new Product(3, "Shoes", "Fashion"),
            new Product(4, "Watch", "Accessories"),
            new Product(5, "Book", "Stationery")
        };

        // Linear Search
        Product result1 = ProductSearch.linearSearch(products, "Watch");
        System.out.println("Linear Search Result: " + result1);

        // Sort array before Binary Search
        Arrays.sort(products, Comparator.comparing(p -> p.productName));

        // Binary Search
        Product result2 = ProductSearch.binarySearch(products, "Watch");
        System.out.println("Binary Search Result: " + result2);
    }
}
