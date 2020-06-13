package ge.btu.edu.giorgi.gordiashvili.currency;

public class Currency {
    private String title;
    private float buy;
    private float sell;

    public Currency() {
    }

    public Currency(String title, float buy, float sell) {
        this.title = title;
        this.buy = buy;
        this.sell = sell;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getBuy() {
        return buy;
    }

    public void setBuy(float buy) {
        this.buy = buy;
    }

    public float getSell() {
        return sell;
    }

    public void setSell(float sell) {
        this.sell = sell;
    }

    @Override
    public String toString() {
        return "Currency{" +
                "title='" + title + '\'' +
                ", buy=" + buy +
                ", sell=" + sell +
                '}';
    }
}
