
import java.util.ArrayList;
import java.util.Random;

public class CrosovkiFactory {
    public Crosovki createCrosovki(ShoesNames shoesName) {
        Random random = new Random();
        if (shoesName == null) {
            return null;
        } else if (shoesName == ShoesNames.NIKE) {
            return new Nike(random.nextInt(1000), random.nextInt(100), random.nextInt(100),
                    random.nextInt(10000), random.nextInt(20000), getRandomColor(), getRandomModelName());

        } else if (shoesName == ShoesNames.ADIDAS) {
            return new Adidas(random.nextInt(1000), random.nextInt(30), random.nextInt(500),
                    random.nextInt(10000), random.nextInt(5000), getRandomColor(), random.nextInt(5));
        }
        return null;
    }

    static String getRandomColor() {
        ArrayList<String> listOfColors = new ArrayList();
        listOfColors.add("red");
        listOfColors.add("green");
        listOfColors.add("blue");
        return (String)listOfColors.get((new Random()).nextInt(3));
    }

    static String getRandomModelName() {
        ArrayList<String> listOfNames = new ArrayList();
        listOfNames.add("Force");
        listOfNames.add("AirMax");
        listOfNames.add("CR7");
        return (String)listOfNames.get((new Random()).nextInt(3));
    }
}