package by.itstep.pomaleikojavalessons.lessons23;

public class Main {
    public static void main(String[] args) {

//        ColorType type1 = ColorType.PINK;
//
//        Flower flower = new Flower(10, ColorType.BLUE);
//        flower.setColor(ColorType.GREEN);

        ColorType[] types = ColorType.values();

        for (int i = 0; i < types.length; i++) {
            System.out.println(types[i] + " - " + types[i].ordinal());
        }

//        System.out.println(flower);
//        System.out.println(flower.toString());

    }
}
