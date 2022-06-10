abstract class Kedi extends Shoes {
    private String typeKedi;
    private int Convenience;


    public String getDescription() {
        return "This is Vans Shoes class.";
    }

    public Kedi(int weight, int liked, int quality, String color, String typeKedi, int convenience) {
        super(weight, liked, quality, color);
        this.typeKedi = typeKedi;
        this.Convenience = convenience;

    }

    public String getTypeKedi() {
        return this.typeKedi;
    }

    public void setTypeKedi(String typeKedi) {
        this.typeKedi = typeKedi;
    }

    public int getConvenience() {
        return this.Convenience;
    }


    public void setConvenience(int convenience) {
        this.Convenience = convenience;
    }


}
