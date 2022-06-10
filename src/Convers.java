public class Convers extends Kedi {
    private int autographs;

    @Override
    public String getDescription() {
        return "This is Convers. " +"Weight is " + this.getWeight() + "gr. Quality is "
                + this.getQuality() + ". Color is " + this.getColor() + ". Convenience rating is "
                + this.getConvenience() + ". Count of stars autographs is " + this.autographs+".";
    }

    public Convers(int weight, int liked, int quality, String color, String typeKedi, int Convenience, int shopper) {
        super(weight, liked, quality, color, typeKedi, Convenience);
        this.autographs = autographs;
    }
}