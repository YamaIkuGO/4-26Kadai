package snakecamel;

import static org.junit.Assert.*;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;
public class SnakeCamelUtilTest {

	

	@Test
	public void cat_dogTest() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected ="CatDog";
		String actual = scu.snakeToCamelcase("cat_dog");
		assertThat(actual,is(expected));
	}
	
	@Test
	public void cat_dog_fishTest() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected ="CatDogFish";
		String actual = scu.snakeToCamelcase("cat_dog_fish");
		assertThat(actual,is(expected));
	}
	
	@Test
	public void CatDogTest() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected ="cat_dog";
		String actual = scu.camelToSnakecase("CatDog");
		assertThat(actual,is(expected));
	}
	
}
