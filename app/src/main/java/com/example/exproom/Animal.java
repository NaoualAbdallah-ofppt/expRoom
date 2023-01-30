package com.example.exproom;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
//@Entity(tableName = "Animal_Table")
@Entity
 public class Animal {
    @NonNull //obligatoire avec primary key
    @PrimaryKey
    public String code;
    @ColumnInfo(name = "nom")
    public String nom;
    @ColumnInfo(name = "photo")
    public byte[] photo;
    @Override
    public String toString() {
        return "Animal{" +
                "code='" + code + '\'' +
                ", nom='" + nom + '\'' +
                '}';
    }


    public Animal(String code,String nom, byte[] photo) {
        this.code=code;
        this.nom = nom;
        this.photo = photo;
    }
}
