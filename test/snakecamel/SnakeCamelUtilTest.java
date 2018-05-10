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
		//String expected ="cat_dog_fish";
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
	
	
	
	
	
	
	
	
	
	//capitalize()
	@Test
	public void capitalizeで空文字が空文字() {
		SnakeCamelUtil sc = new SnakeCamelUtil();
		String expected = " ";
		String actual = sc.capitalize(" ");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void capitalizeでaがA() {
		SnakeCamelUtil sc = new SnakeCamelUtil();
		String expected = "A";
		String actual = sc.capitalize("a");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void capitalizeでxyzがXyz() {
		SnakeCamelUtil sc = new SnakeCamelUtil();
		String expected = "Xyz";
		String actual=sc.capitalize("xyz");
		assertThat(actual, is(expected));
	}
	
	//uncapitalize()
	@Test
	public void uncapitalizeで空文字が空文字() {
		SnakeCamelUtil sc = new SnakeCamelUtil();
		String expected = " ";
		String actual = sc.uncapitalize(" ");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void uncapitalizeでAがa() {
		SnakeCamelUtil sc=new SnakeCamelUtil();
		String expected="a";
		String actual=sc.uncapitalize("A");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void uncapitalizeでXyzでがxyz() {
		SnakeCamelUtil sc = new SnakeCamelUtil();
		String expected = "xyz";
		String actual=sc.uncapitalize("Xyz");
		assertThat(actual, is(expected));
	}
	
	//snakeToCamelCase()
	@Test
	public void snakeToCamelcaseでabcがAbc() {
		SnakeCamelUtil sc = new SnakeCamelUtil();
		String expected = "Abc";
		String actual = sc.snakeToCamelcase("abc");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void snakeToCamelcaseでabc_defがAbcDef() {
		SnakeCamelUtil sc = new SnakeCamelUtil();
		String expected="AbcDef";
		String actual=sc.snakeToCamelcase("abc_def");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void snakeToCamelcaseでabc_def_ghがAbcDefGh() {
		SnakeCamelUtil sc = new SnakeCamelUtil();
		String expected = "AbcDefGh";
		String actual = sc.snakeToCamelcase("abc_def_gh");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void snakeToCamelcaseでabc__def__ghがAbcDefGh() {/////////
		SnakeCamelUtil sc = new SnakeCamelUtil();
		String expected = "AbcDefGh";
		String actual=sc.snakeToCamelcase("abc__def__gh");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void snakeToCamelcaseで_abc_def__がAbcDef() {////
		SnakeCamelUtil sc = new SnakeCamelUtil();
		String expected = "AbcDef";
		String actual = sc.snakeToCamelcase("_abc_def__");
		assertThat(actual, is(expected));
	}
	
	//camelToSnakeCase()
	@Test
	public void camelToSnakecaseでAbcがabc() {
		SnakeCamelUtil sc = new SnakeCamelUtil();
		String expected = "abc";
		String actual = sc.camelToSnakecase("Abc");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void camelToSnakecaseでAbcDefがabc_def() {
		SnakeCamelUtil sc = new SnakeCamelUtil();
		String expected = "abc_def";
		String actual = sc.camelToSnakecase("AbcDef");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void camelToSnakecaseでAbcDefGhがabc_def_gf() {
		SnakeCamelUtil sc = new SnakeCamelUtil();
		String expected = "abc_def_gh";
		String actual = sc.camelToSnakecase("AbcDefGh");
		assertThat(actual, is(expected));
	}
	
	
}
