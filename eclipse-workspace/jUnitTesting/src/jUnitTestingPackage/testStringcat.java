package jUnitTestingPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testStringcat {

	@Test
	void test() {
		jUnitFunc junitstring=new jUnitFunc();
		String res=junitstring.concatStrings("Jaipur","-pink city");
		assertEquals("Jaipur-pink city",res);
	}

}
