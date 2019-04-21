package com.example.gungmayun.the_avengers;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class GridActivity extends RecyclerView.Adapter<GridActivity.GridViewHolder> {

    private static final String TAG = "GridActivity";
    private ArrayList<String> mImageNames = new ArrayList<>();
    private ArrayList<String> mImages = new ArrayList<>();
    private ArrayList<String> mnameRemarks = new ArrayList<>();
    private ArrayList<String> mActors = new ArrayList<>();
    private ArrayList<String> mdescription = new ArrayList<>();
    private Context mContext;

    public GridActivity(Context context, ArrayList<String> imageNames, ArrayList<String> images, ArrayList<String> remark, ArrayList<String> actors, ArrayList<String> description) {
        this.mImageNames = imageNames;
        this.mImages = images;
        this.mnameRemarks = remark;
        this.mActors = actors;
        this.mdescription = description;
        this.mContext = context;
    }

    @NonNull
    @Override
    public GridViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_grid_avengers, viewGroup, false);
        return new GridViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GridViewHolder gridViewHolder, final int position) {
        Glide.with(mContext)
                .asBitmap()
                .load(mImages.get(position))
                .into(gridViewHolder.image);
        gridViewHolder.image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: clicked on: " + mImageNames.get(position));
                Toast.makeText(mContext, "Kamu memilih "+mImageNames.get(position), Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(mContext, AvengersDetail.class);
                intent.putExtra("image_url", mImages.get(position));
                intent.putExtra("image_name", mImageNames.get(position));
                intent.putExtra("name_remarks", mnameRemarks.get(position));
                intent.putExtra("name_actors", mActors.get(position));
                intent.putExtra("image_description", mdescription.get(position));
                mContext.startActivity(intent);

            }
        });
    }

    @Override
    public int getItemCount()  {
        return mImageNames.size();
    }

    @Override
    public int getItemViewType(int position){
        return position;
    }

    public class GridViewHolder extends RecyclerView.ViewHolder {
        ImageView image;
        public GridViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.image);
        }
    }
}
