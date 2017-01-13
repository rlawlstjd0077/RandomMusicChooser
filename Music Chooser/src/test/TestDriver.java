package test;

import java.io.IOException;

/**
 * Created by GSD on 2017-01-12.
 */
public class TestDriver {
    public static void main(String args[]) throws IOException {
        String path = TestDriver.class.getResource("").getPath();
        Chooser chooser = new Chooser();
        chooser.doScan();
        System.out.println("let's hear " + chooser.chooseMusic() + "!");
    }
}
