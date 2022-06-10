
import java.util.ArrayList;
import java.util.Random;

public class  KediFactory {
    public Kedi createKedi(ShoesNames shoesName) {
        Random random = new Random();
        if (shoesName == null) {
            return null;
        } else if (shoesName == ShoesNames.VANS) {
            return new Vans(random.nextInt(1000), random.nextInt(100), random.nextInt(100), getRandomColor(),
                    getRandomTypeKedi(), random.nextInt(30000), random.nextInt(10000)
            );
        } else if (shoesName == ShoesNames.CONVERS) {
            return new Convers(random.nextInt(1000), random.nextInt(100), random.nextInt(100), getRandomColor(),
                    "Sneakers", random.nextInt(30000), random.nextInt(3));
        }
        return null;
    }

    static String getRandomColor() {
        ArrayList<String> listOfColors = new ArrayList<String>();
        listOfColors.add("red");
        listOfColors.add("green");
        listOfColors.add("blue");
        return listOfColors.get(new Random().nextInt(3));
    }

    static String getRandomTypeKedi() {
        ArrayList<String> listOfTypes = new ArrayList();
        listOfTypes.add("Sport");
        listOfTypes.add("Daily");
        return (String)listOfTypes.get((new Random()).nextInt(2));
    }
}