package frc6829.common.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import frc6829.common.SquaredInputTransform;

class SquaredInputTransformTests {

	@ParameterizedTest
	@CsvSource({"1, 1", ".25, .5", "-.25, -.5"})
	void TransformReturnsExpectedValues(double expectedValue, double inputValue) {
		SquaredInputTransform squaredInputTransform = new SquaredInputTransform();
		assertEquals(expectedValue, squaredInputTransform.Transform(inputValue));
	}

}
