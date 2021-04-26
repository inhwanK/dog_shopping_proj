package dog_shopping_proj.dao;

import java.util.List;

import dog_shopping_proj.dto.Dog;

public interface DogDao {
	List<Dog> selectDogList();
	
	Dog selectDog(int id);
	
	int insertDog(Dog dog);
	
	int updateReadCount(int id);
}
