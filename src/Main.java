
public class Main {

    public static void main(String[] args) {
        //Первая Фабрика
      CrosovkiFactory crosovkiFactory = new CrosovkiFactory();
        Crosovki nike = crosovkiFactory.createCrosovki(ShoesNames.NIKE);
        Crosovki adidas = crosovkiFactory.createCrosovki(ShoesNames.ADIDAS);
        System.out.println(nike.getDescription());
        System.out.println(adidas.getDescription());

        //Вторая Фабрика
        KediFactory kediFactory = new KediFactory();
        Kedi vans = kediFactory.createKedi(ShoesNames.VANS);
        Kedi convers = kediFactory.createKedi(ShoesNames.CONVERS);
        System.out.println(vans.getDescription());
        System.out.println(convers.getDescription());
    }

}