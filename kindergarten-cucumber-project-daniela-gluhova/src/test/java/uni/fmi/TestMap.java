package uni.fmi;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class TestMap {
	@Test
	public void testMap() {
		final Map<String, String> testInstance = new HashMap<String, String>();
		testInstance.put("key1", "value1");
		String value1 = testInstance.put("key1", "value2");
		System.out.println(value1);
		String value2 = testInstance.put("key1", "value3");
		System.out.println(value2);
		
		System.out.println(testInstance.get("key1"));
		
		assertEquals("value3", testInstance.get("key1"));
		assertEquals(value1, "value1");
		assertEquals(value2, "value2");
		assertEquals(1, testInstance.size()); 
	}
}
