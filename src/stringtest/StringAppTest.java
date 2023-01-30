package stringtest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import stringdemo.StringApp;

@SuppressWarnings("unused")
class StringAppTest {

	@ParameterizedTest
	@ValueSource(strings= {"Apple","Banana","Mango"})
	void testGetLength(String src) {
	  StringApp obj=new StringApp();
	    int expected=src.length();
	    int actual=obj.getLength(src);
	    Assertions.assertEquals(expected, actual);
		
	}

}
