package com.demo.types;

import org.junit.platform.runner.JUnitPlatform;

public @interface RunWith {

	Class<JUnitPlatform> value();

}
