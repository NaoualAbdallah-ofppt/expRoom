package com.example.exproom;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.VH> {
    Context c;
    AnimalsDatabase db;
    List<Animal> lst;
    public CustomAdapter(Context c) {
        this.c = c;
        db = Room.databaseBuilder(c,
                        AnimalsDatabase.class, "AnimalsDb")
                .allowMainThreadQueries()
                .build();
        lst = db.animalDao().getAll();
    }

    @NonNull
    @Override
    public VH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View V=LayoutInflater.from(c).inflate(R.layout.layout_item,parent  ,false);


        return new VH (V);
    }

    @Override
    public void onBindViewHolder(@NonNull VH holder, int position) {


        Animal A =lst.get(position);
        holder.txtCode.setText(A.code);
        holder.txtNom.setText(A.nom);

       Bitmap bmp = BitmapFactory.decodeByteArray(A.photo,0,A.photo.length);
        holder.img.setImageBitmap(bmp);
    }

    @Override
    public int getItemCount() {

        return lst.size();
    }

    public class VH extends  RecyclerView.ViewHolder {
        private TextView txtNom;
        private TextView txtCode;
        private ImageView img;
        public VH(@NonNull View itemView) {
            super(itemView);
            txtCode=(TextView) itemView.findViewById(R.id.txtCode);
            txtNom=(TextView) itemView.findViewById(R.id.txtNom);
            img=(ImageView) itemView.findViewById(R.id.img);

        }

    }
}
