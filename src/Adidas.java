public class Adidas extends Crosovki {
    private int velcro;

    @Override
    public String getDescription() {
        return "This is Adidas. My color is " + this.getColor() + ". Count of velcro is " + this.velcro+".";
    }

    public Adidas(int weight, int liked, int quality, int size, int gender, String color, int velcro) {
        super(weight, liked, quality, size, gender, color);
        this.velcro = velcro;
    }
}
