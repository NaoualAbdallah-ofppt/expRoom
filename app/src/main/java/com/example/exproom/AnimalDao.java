package com.example.exproom;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

@Dao
public interface AnimalDao {
        @Query("SELECT * FROM Animal")
        List<Animal> getAll();
        @Query("SELECT * FROM Animal WHERE code = (:code) LIMIT 1")
        Animal getAnimalByCode(String code);
        @Query("SELECT * FROM Animal WHERE nom LIKE :nom")
        List<Animal> getAnimalsByName(String nom);
        @Insert
        void insertAll(Animal... lstanimals);
      /*  @Insert
        void insert (Animal A);

       */
        @Delete
        void delete(Animal animal);
        @Update
        public void updateUsers(Animal... animals);

        /*
        @Query("SELECT * FROM book " +
       "INNER JOIN loan ON loan.book_id = book.id " +
       "INNER JOIN user ON user.id = loan.user_id " +
       "WHERE user.name LIKE :userName")
public List<Book> findBooksBorrowedByNameSync(String userName);
         */

        /*
        @Query(
    "SELECT * FROM user" +
    "JOIN book ON user.id = book.user_id"
)
public Map<User, List<Book>> loadUserAndBookNames();
         */

        /*
        @Query(
    "SELECT * FROM user" +
    "JOIN book ON user.id = book.user_id" +
    "GROUP BY user.name having COUNT(book.id) >= 3"
)
public Map<User, List<Book>> loadUserAndBookNames();
         */
        /*
        @MapInfo(keyColumn = "userName", valueColumn = "bookName")
@Query(
    "SELECT user.name AS username, book.name AS bookname FROM user" +
    "JOIN book ON user.id = book.user_id"
)
public Map<String, List<String>> loadUserAndBookNames();
         */
}
