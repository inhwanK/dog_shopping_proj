package dog_shopping_proj.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dog_shopping_proj.dao.DogDao;
import dog_shopping_proj.dto.Dog;

public class DogDaoImpl implements DogDao {
	private static DogDaoImpl instance = new DogDaoImpl();
	private Connection con;

	public void setCon(Connection con) {
		this.con = con;
	}

	public static DogDaoImpl getInstance() {
		return instance;
	}

	@Override
	public List<Dog> selectDogList() {
		String sql = "SELECT id, kind, price, image, country, height, weight, content, readcount\r\n" + "FROM dog;";
		try (PreparedStatement pstmt = con.prepareStatement(sql); ResultSet rs = pstmt.executeQuery()) {
			if (rs.next()) {
				List<Dog> list = new ArrayList<>();
				do {
					list.add(getDog(rs));
				} while (rs.next());
				return list;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	private Dog getDog(ResultSet rs) {
		Dog dog = new Dog();

		try {
			dog.setId(rs.getInt("id"));
		} catch (SQLException e) {
		}

		try {
			dog.setKind(rs.getString("kind"));
		} catch (SQLException e) {
		}

		try {
			dog.setPrice(rs.getInt("price"));
		} catch (SQLException e) {
		}

		try {
			dog.setImage(rs.getString("image"));
		} catch (SQLException e) {
		}

		try {
			dog.setCountry(rs.getString("country"));
		} catch (SQLException e) {
		}

		try {
			dog.setHeight(rs.getInt("height"));
		} catch (SQLException e) {
		}

		try {
			dog.setWeight(rs.getInt("weight"));
		} catch (SQLException e) {
		}

		try {
			dog.setContent(rs.getString("content"));
		} catch (SQLException e) {
		}

		try {
			dog.setReadcount(rs.getInt("readcount"));
		} catch (SQLException e) {
		}

		return dog;
	}

	@Override
	public Dog selectDog(int id) {
		String sql = "SELECT id, kind, price, image, country, height, weight, content, readcount\r\n"
				+ "FROM dog\r\n" + "WHERE id=?;";
		try (PreparedStatement pstmt = con.prepareStatement(sql)) {
			pstmt.setInt(1, id);
			try (ResultSet rs = pstmt.executeQuery()) {
				if (rs.next()) {
					return getDog(rs);
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int insertDog(Dog dog) {
		String sql = "insert into dog(kind,price,image,country,height,weight,content,readcount) \r\n"
				+ "values( ?, ?, ?, ?, ?, ?, ?, ?);";
		try (PreparedStatement pstmt = con.prepareStatement(sql);) {
			pstmt.setString(1, dog.getKind());
			pstmt.setInt(2, dog.getPrice());
			pstmt.setString(3, dog.getImage());
			pstmt.setString(4, dog.getCountry());
			pstmt.setInt(5, dog.getHeight());
			pstmt.setInt(6, dog.getWeight());
			pstmt.setString(7, dog.getContent());
			pstmt.setInt(8, dog.getReadcount());
			
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int updateReadCount(int id) {
		String sql = "update dog set readcount = readcount +1 where id = ?;";
		try (PreparedStatement pstmt = con.prepareStatement(sql);) {
			pstmt.setInt(1, id);
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

}
