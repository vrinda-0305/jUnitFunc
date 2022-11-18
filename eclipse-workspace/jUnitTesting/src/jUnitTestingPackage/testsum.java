package jUnitTestingPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testsum {

	@Test
	void test() {
		jUnitFunc junit=new jUnitFunc();
		int res=junit.sum(36, 12);
		assertEquals(48,res);
	}

}
