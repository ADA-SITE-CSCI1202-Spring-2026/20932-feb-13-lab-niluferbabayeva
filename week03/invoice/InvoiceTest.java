package week03.invoice;

public class InvoiceTest {
    public static void main(String[] args) {

        // Test 1: Normal values
        Invoice invoice = new Invoice( "TUF15","ASUS TUF Gaming F15", 2, 999.99);

        System.out.println("Part Number: " + invoice.getPartNum());
        System.out.println("Part Description: " + invoice.getPartDesc());
        System.out.println("Quantity: " + invoice.getQuantity());
        System.out.println("Price per Item: " + invoice.getPricePerItem());
        System.out.println("Invoice Amount: " + invoice.getInvoiceAmount());
        System.out.println();

        // Test 1: Negative quantity and price
        Invoice invoice2 = new Invoice ("TUF15", "ASUS TUF Gaming F15", -5, -999.99);

        System.out.println("Part Number: " + invoice2.getPartNum());
        System.out.println("Part Description: " + invoice2.getPartDesc());       
        System.out.println("Quantity: " + invoice2.getQuantity());
        System.out.println("Price per Item: " + invoice2.getPricePerItem());
        System.out.println("Invoice Amount: " + invoice2.getInvoiceAmount());
        System.out.println();
    }
}
