package test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;



import org.junit.Test;

public class JunitAssertionsTest {
	JunitAssertions obj = new JunitAssertions();
	


	@Test
	public void equals() {


	assertEquals(obj.str1, obj.str2);
	}
	@Test 
	public void TrueFalse() {



	assertTrue (obj.val1 <obj. val2);


	assertFalse(obj.val1 > obj.val2);
	}
	
	@Test
	public void NULL() {



	assertNotNull(obj.str1);



	assertNull(obj.str3);
	}
	
	@Test
	public void SAME() {


	assertSame(obj.str4,obj.str5);



	assertNotSame(obj.str1,obj.str3);
	}
	
	@Test
	public void array() {



	assertArrayEquals(obj.ER, obj.AR);
	}

	}

