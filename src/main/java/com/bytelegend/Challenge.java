package com.bytelegend;

import com.github.blindpirate.extensions.CaptureSystemOutputExtension;
import com.github.blindpirate.extensions.extensions;

public class Challenge {
    public static void main(String[] args) {
@@ -17,6 +16,6 @@ public static void main(String[] args) {
     * class. Good luck!
     */
    public static Object createCaptureSystemOutputExtension() {
        return new CaptureSystemOutputExtension();
        return extensions.getCapture();
    }
}