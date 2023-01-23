public class Application {
    private String name;
    private Clouds Clouds;
    private double price;

    public void setName(String name) {
        this.name = name;
    }

    public void setCloud(Clouds clouds) {
        this.Clouds = clouds;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Website{" +
                "name='" + name + '\'' +
                ", Cms=" + Clouds +
                ", price=" + price +
                '}';
    }
}
