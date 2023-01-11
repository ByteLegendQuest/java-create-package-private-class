package com.github.blindpirate.extensions;

public class BreakYou {
    public static Object tellMe() {
        return new CaptureSystemOutputExtension();
    }
}
