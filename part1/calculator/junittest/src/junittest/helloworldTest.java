//package junittest;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class helloworldTest {
	@Test
	public void test() {
		String result = helloworld.helloworld();
		Assert.assertEquals("Hello World!", result);
	}

}
