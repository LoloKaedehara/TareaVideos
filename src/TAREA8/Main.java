package TAREA8;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        BOX<String> miBOX= new BOX<>(new String[10]);

        miBOX.add(0, " HELLOO");
        miBOX.add(1, " SEE YOU");
        miBOX.add(2, " COME");
        System.out.println(miBOX);


        System.out.println("....WAITING");

        BOXGENERICLESS BOXSi = new BOXGENERICLESS(new Object[10]);
        BOXSi.add(0,"HELLOO");
        BOXSi.add(1, "SEE YOU");
        BOXSi.add(2,"COME");
        System.out.println(BOXSi);


        String temp= miBOX.get(0);
        String temp2=(String) BOXSi.get(0);


        System.out.println(".........WAITING");
        BOX<FOOD> BOXFOOD = new BOX<>(new FOOD[10]);
        BOXFOOD.add(0, new FOOD("Gelly", true));
        System.out.println(BOXFOOD.get(0));
        System.out.println("...... :)");

        ArrayList<FOOD> feeding = new ArrayList<>();

        feeding.add(0, new FOOD("Pineapple", false));
        feeding.add(1, new FOOD("Pineapple", false));
        feeding.add(2, new FOOD("Pineapple", false));
        feeding.add(3, new FOOD("Pineapple", false));
        feeding.add(4, new FOOD("Pineapple", false));
        feeding.add(5, new FOOD("Pineapple", false));
        System.out.println(feeding.size());
        System.out.println(feeding.get(5));

        ArrayList<FOOD>food2 = new ArrayList<>();
        food2.add(new FOOD("Pineapple",false));
        food2.add(new FOOD("Gelly",true));
        food2.add(new FOOD("Soda",true));
        food2.add(new FOOD("Apple",false));
        food2.add(new FOOD("Befsteak",false));

        System.out.println(food2.get(3));
        food2.set(3, new FOOD("Watermelon",false));
        food2.add(3, new FOOD("Grape",false));

        for (FOOD food:food2) {
            System.out.println(food);
        }



    }


}
