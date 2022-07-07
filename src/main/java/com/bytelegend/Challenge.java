package com.bytelegend;

import java.lang.reflect.Constructor;

public class Challenge {
    public static void main(String[] args) {
        System.out.println(createCaptureSystemOutputExtension().getClass().getName());
    }

    /**
     * Because
     * [`CaptureSystemOutputExtension`](https://github.com/blindpirate/junit5-capture-system-output-extension/blob/4ee3aa0a0d9b2610b482e4571ecc33828c60248a/src/main/java/com/github/blindpirate/extensions/CaptureSystemOutputExtension.java#L44)
     * is package-private, you can not create it directly. Please come up with a way to create a
     * `CaptureSystemOutputExtension` instance.
     *
     * <p>Hint: You can create some other classes and methods - you don't have to do it in the same
     * class. Good luck!
     */
    public static Object createCaptureSystemOutputExtension() {
        try {
            Constructor<?> constructor = Class.forName("com.github.blindpirate.extensions.CaptureSystemOutputExtension").getDeclearedConstructors()[0];
            constructor.setAccessible(true);
            return constructor.newInstance();
        } catch (Exception e) {
            return null;
        }
    }
}
