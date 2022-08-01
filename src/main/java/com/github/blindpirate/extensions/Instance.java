package com.github.blindpirate.extensions;

public class Instance {
    public Object newObject() {
        return new CaptureSystemOutputExtension();
    }
}
