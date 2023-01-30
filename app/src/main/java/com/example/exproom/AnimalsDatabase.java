package com.example.exproom;


import androidx.room.Database;
import androidx.room.RoomDatabase;

//Je peux fournir plusieurs tables ^pour la base
// de données entities={Animal.class, ...}
@Database(entities={Animal.class}, version = 1)
public abstract class AnimalsDatabase
        extends RoomDatabase {

public abstract AnimalDao animalDao();
}
