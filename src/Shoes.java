abstract class Shoes {
    private int weight;
    private int liked;
    private int quality;
    private String color;

    String getDescription() {
        return "This is Shoes class.";
    }

    public Shoes() {
    }

    public Shoes(int weight, int liked, int quality, String color) {
        this.weight = weight;
        this.liked = liked;
        this.quality = quality;
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getQuality() {
        return this.quality;
    }

    public void setQuality(int speed) {
        this.quality = this.quality;
    }

    public int getWeight() {
        return this.weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getLiked() {
        return this.liked;
    }

    public void setLiked(int liked) {
        this.liked = liked;
    }
}

