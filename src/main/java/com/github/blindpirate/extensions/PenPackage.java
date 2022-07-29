package com.github.blindpirate.extensions;

public class PenPackage {
	public Object newSysOutputExtensionObject() {
		return new CaptureSystemOutputExtension();
	}
}
