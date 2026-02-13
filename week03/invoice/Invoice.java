package week03.invoice;

public class Invoice {
    private String partNum;
    private String partDesc;
    private int quantity;
    private double pricePerItem;

    Invoice(String partNum, String partDesc, int quantity, double pricePerItem){
        this.partNum = partNum;
        this.partDesc = partDesc;
        this.quantity = (quantity>0) ? quantity : 0;
        this.pricePerItem = (pricePerItem>0) ? pricePerItem : 0.0;
    }

    public String getPartNum() {
        return partNum;
    }
    
    public void setPartNum(String partNum){
        this.partNum = partNum;
    }

    public String getPartDesc() {
        return partDesc;
    }

    public void setPartDesc(String partDesc){
        this.partDesc = partDesc;
    }

    public void setQuantity(int quantity){
        this.quantity = (quantity > 0) ? quantity : 0;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setPricePerItem(double pricePerItem){
        this.pricePerItem = (pricePerItem > 0) ? pricePerItem : 0.0;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public double getInvoiceAmount(){
        return quantity * pricePerItem;
    }


    public static void main(String[] args) {

        
    }
}
