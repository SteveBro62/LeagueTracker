package Models;

import java.util.List;

public class Test {
    public static void main (String [] args) {

        Champions yuumi = new Champions(
                "Yuumi",
                List.of("UwU Kitten"),
                5
        );
        System.out.println(yuumi.getName());
        System.out.println(yuumi.getClasses());
        System.out.println(yuumi.getDifficulty());

    }
}
