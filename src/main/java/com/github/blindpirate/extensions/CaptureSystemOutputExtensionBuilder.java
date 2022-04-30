package com.github.blindpirate.extensions;

public class CaptureSystemOutputExtensionBuilder {

    public static CaptureSystemOutputExtensionBuilder builder() {
        return new CaptureSystemOutputExtensionBuilder();
    }

    public CaptureSystemOutputExtension build() {
        return new CaptureSystemOutputExtension();
    }

}
