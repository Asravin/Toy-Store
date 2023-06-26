public class Product {
    public int productID;
    public int resultContest;
    public String producText;

    public Product(int productID, int resultContest, String producText){
        this.productID = productID;
        this.resultContest = resultContest;
        this.producText = producText;
    }

    public int getProductID() {
        return productID;
    }

    public int getResultContest() {
        return resultContest;
    }

    public String getProducText() {
        return producText;
    }

    public void setResultContest(int resultContest) {
        this.resultContest = resultContest;
    }

    public String writeText() {
        return String.format("ID: %d, Text: %s", productID, producText);
    }
}
