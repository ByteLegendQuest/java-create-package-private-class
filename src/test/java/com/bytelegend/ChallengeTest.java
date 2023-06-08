package com.bytelegend;

import com.github.blindpirate.extensions.Challenge;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ChallengeTest {
    @Test
    public void bypassPackagePrivate() {
        Assertions.assertEquals(
                "com.github.blindpirate.extensions.CaptureSystemOutputExtension",
                Challenge.createCaptureSystemOutputExtension().getClass().getName());
        Assertions.assertTrue(
                org.junit.jupiter.api.extension.BeforeEachCallback.class.isAssignableFrom(
                        Challenge.createCaptureSystemOutputExtension().getClass()));
    }
}
