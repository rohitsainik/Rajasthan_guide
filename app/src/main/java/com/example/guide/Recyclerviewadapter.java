package com.example.guide;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Recyclerviewadapter extends RecyclerView.Adapter<Recyclerviewadapter.myviewholder> {

private Context mcontext;
private List<city> mdata;

    public Recyclerviewadapter(Context mcontext, List<city> mdata) {
        this.mcontext = mcontext;
        this.mdata = mdata;
    }

    @Override
    public myviewholder onCreateViewHolder(ViewGroup parent, int viewType) {

View view;
        LayoutInflater minflater = LayoutInflater.from(mcontext);
        view=minflater.inflate(R.layout.cardview_item_city,parent,false);
return new myviewholder(view);
    }

    @Override
    public void onBindViewHolder(myviewholder holder, final int position) {
        holder.tv_city_name.setText(mdata.get(position).getName());
     holder.city_thumbnail.setImageResource(mdata.get(position).getThumbnail());
     holder.cardView.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             Intent intent=new Intent(mcontext,city_activity.class);
             intent.putExtra("city name",mdata.get(position).getName());
             intent.putExtra("thumbnail",mdata.get(position).getThumbnail());
             mcontext.startActivity(intent);

         }
     });


    }

    @Override
    public int getItemCount() {
        return mdata.size();
    }

    public static class myviewholder extends RecyclerView.ViewHolder{

        TextView tv_city_name;
        ImageView city_thumbnail;
        CardView cardView;

        public myviewholder(View itemView) {
            super(itemView);
            tv_city_name = (TextView) itemView.findViewById(R.id.city_title_id);
            city_thumbnail=(ImageView)itemView.findViewById(R.id.city_img_id);
         cardView=(CardView) itemView.findViewById(R.id.cardview);

        }
    }
}
