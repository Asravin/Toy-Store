public class Toy{
   private int ID;
   private String product;
   private int price;

   public Toy(int ID, String product, int price) {
      this.ID = ID;
      this.product = product;
      this.price = price;

   }

   public int getID() {
      return ID;
   }

   public String getProduct() {
      return product;
   }

   public int getPrice() {
      return price;
   }

   public void setID(int ID) {
      this.ID = ID;
   }

   public void setProduct(String product) {
      this.product = product;
   }

   public void setPrice(int price) {
      this.price = price;
   }

   public String toString() {
      return "Toy [ID = " + ID + ", Игрушка = " + product + ", Цена = " + price + "\n" + "]";
   }
}
