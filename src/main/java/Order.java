public class Order  {

    private String product ;
    private int quantity ;
    private int orderDate ;
    private Customer customer;
    private Product Product;





    public Order( int quantity, int orderDate) {
        this.product = product;
        this.quantity = quantity;
        this.orderDate = orderDate;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getOrderDate() {
        return orderDate;
    }

    public Order(Product Product)
    {
        this.Product = Product;
    }


    public void setOrderDate(int orderDate) {
        this.orderDate = orderDate;
    }
}
