package com.example.imagesilder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.smarteist.autoimageslider.SliderViewAdapter;

public class slideradapter extends SliderViewAdapter<slideradapter.Holder> {

    int[] images;

    public slideradapter(int[] images){
        this.images=images;
    }

    @Override
    public Holder onCreateViewHolder(ViewGroup parent) {
         View view= LayoutInflater.from(parent.getContext())
                 .inflate(R.layout.slideritem,parent,false);
         return new Holder(view);
    }

    @Override
    public void onBindViewHolder(Holder viewHolder, int position) {

        viewHolder.imageView.setImageResource(images[position]);
    }

    @Override
    public int getCount() {
        return  images.length;
    }


    public class Holder extends SliderViewAdapter.ViewHolder {
        ImageView imageView;

        public Holder(View itemview){
            super(itemview);

            imageView= itemview.findViewById(R.id.imageview);
        }
    }
}
