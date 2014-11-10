package test;

import static org.junit.Assert.assertEquals;

import java.io.FileNotFoundException;

import org.junit.Test;
import org.mockito.Mockito;

public class JUnitTest {

	@Test
	public void testMain() {
		
		assertEquals(Main.string(),"hej");
	}
	@Test
	public void testFile() throws FileNotFoundException {
		
		file fil = Mockito.mock(file.class);
		fil.setString("hej");
		fil.getString();
		Mockito.verify(fil.getString());
	}

}
