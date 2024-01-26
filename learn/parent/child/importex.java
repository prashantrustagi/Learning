package learn.parent.child;

import java.util.Random;


import static learn.parent.InsideParent.*;

public class importex {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Random random_num = new Random();
        System.out.println(random_num.nextInt(200));
        System.out.println(NAME);
    }
}
