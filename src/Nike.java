public class Nike extends Crosovki {
    private String modelName;

    @Override
    public String getDescription() {
        return "This is Nike. My model is " + modelName + ". Quality is " + this.getQuality() +
                ". People liked " + this.getLiked() + ". Weight is " + this.getWeight() + "gr.";
    }

    public Nike(int weight, int liked, int quality, int size, int gender, String color, String modelName) {
        super(weight, liked, quality, size, gender, color);
        this.modelName = modelName;
    }
}