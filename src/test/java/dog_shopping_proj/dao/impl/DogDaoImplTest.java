package dog_shopping_proj.dao.impl;

import java.sql.Connection;
import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import dog_shopping_proj.JdbcUtil;
import dog_shopping_proj.dto.Dog;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DogDaoImplTest {
	private static Connection con = JdbcUtil.getConnection();
	private static DogDaoImpl dao = DogDaoImpl.getInstance();
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		dao.setCon(con);
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("What!!");
	}

	@Test
	public void test04SelectDogList() {
		System.out.println("testSelectDogList()");
		List<Dog> res = dao.selectDogList();
		Assert.assertNotNull(res);
	}

	@Test
	public void test02SelectDog() {
		System.out.println("testSelectDog()");
		Dog res = dao.selectDog(5);
		Assert.assertNotNull(res);
	}

	@Test
	public void test01InsertDog() {
		System.out.println("testInsertDog()");
		Dog dog = new Dog("리트리버",5000,"리트리버데스.jpg","안방",1,20,"온순함",0);
		int res = dao.insertDog(dog);
		Assert.assertEquals(1, res);
	}

	@Test
	public void test03UpdateReadCount() {
		System.out.println("test03UpdateReadCount()");
		int res = dao.updateReadCount(5);
		Assert.assertEquals(1, res);
	}

}
