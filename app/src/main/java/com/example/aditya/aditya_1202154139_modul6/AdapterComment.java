package com.example.aditya.aditya_1202154139_modul6;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by adity on 4/1/2018.
 */

public class AdapterComment extends  RecyclerView.Adapter<AdapterComment.CommentHolder>{
    Context con;
    List<DBComment> list;
    //Constructor adapter
    public AdapterComment(Context con, List<DBComment> list) {
        this.con = con;
        this.list = list;
    }

    //Return ViewHolder dari Recyclerview
    @Override
    public CommentHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new CommentHolder(LayoutInflater.from(con).inflate(R.layout.rec_comment, parent, false));
    }

    //Mengikat nilai dari list dengan view
    @Override
    public void onBindViewHolder(CommentHolder holder, int position) {
        DBComment cur = list.get(position);
        holder.yangkomen.setText(cur.getYangkomen());
        holder.komennya.setText(cur.getKomennya());
    }

    //Mendapatkan jumlah item pada recyclerview
    @Override
    public int getItemCount() {
        return list.size();
    }

    //Subclass sebagai viewholder
    class CommentHolder extends RecyclerView.ViewHolder{
        TextView yangkomen, komennya;
        public CommentHolder(View itemView) {
            super(itemView);
            yangkomen = itemView.findViewById(R.id.yangkomen);
            komennya = itemView.findViewById(R.id.komennya);
        }
    }
}
