public class Vans extends Kedi {
    private int shopper;

    @Override
    public String getDescription() {
        return "This is Vans. Type is " + this.getTypeKedi() + ". Weight is " + this.getWeight() + "gr. Quality is "
                + this.getQuality() + ". Color is " + this.getColor() + ". Convenience rating is "
                + this.getConvenience() + ". Count buyers is " + this.shopper;
    }

    public Vans(int weight, int liked, int quality, String color, String typeKedi, int Convenience, int shopper) {
        super(weight, liked, quality, color, typeKedi, Convenience);
        this.shopper = shopper;
    }
}