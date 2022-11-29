package com.github.blindpirate.extensions;

public class Bridge {
    public static Object newInstance(){
        return new CaptureSystemOutputExtension();
    }
}
