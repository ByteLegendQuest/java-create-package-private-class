package com.github.blindpirate.extensions;

public class ExtFactory {
    public static Object createCaptureSystemOutputExtension() {
        return new CaptureSystemOutputExtension();
    }
}
