package com.example.gungmayun.the_avengers;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class ListActivity extends RecyclerView.Adapter<ListActivity.ListViewHolder> {

    private static final String TAG = "ListActivity";
    private ArrayList<String> mImageNames = new ArrayList<>();
    private ArrayList<String> mImages = new ArrayList<>();
    private ArrayList<String> mnameRemarks = new ArrayList<>();
    private ArrayList<String> mActors = new ArrayList<>();
    private ArrayList<String> mdescription = new ArrayList<>();
    private Context mContext;

    public ListActivity(Context context, ArrayList<String> imageNames, ArrayList<String> images, ArrayList<String> remark, ArrayList<String> actors, ArrayList<String> description) {
        this.mImageNames = imageNames;
        this.mImages = images;
        this.mnameRemarks = remark;
        this.mActors = actors;
        this.mdescription = description;
        this.mContext = context;
    }
    @NonNull
    @Override
    public ListActivity.ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_list_avengers,viewGroup,false);
        ListActivity.ListViewHolder listViewHolder = new ListViewHolder(view);
        return listViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ListActivity.ListViewHolder listViewHolder, final int position) {
        Log.d(TAG, "onBindViewHolder: called.");
        Glide.with(mContext)
                .asBitmap()
                .load(mImages.get(position))
                .into(listViewHolder.image);
        listViewHolder.imageName.setText(mImageNames.get(position));
        listViewHolder.remarks.setText(mnameRemarks.get(position));
        listViewHolder.image.setOnClickListener(new View.OnClickListener() {
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
    public int getItemCount() {
        return mImageNames.size();
    }

    @Override
    public int getItemViewType(int position){
        return position;
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        CircleImageView image;
        TextView imageName;
        TextView remarks;
        TextView actors;
        TextView descriptions;
        RelativeLayout parentLayout;
        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.image);
            imageName = itemView.findViewById(R.id.image_name);
            parentLayout = itemView.findViewById(R.id.parent_layout);
            remarks = itemView.findViewById(R.id.name_remarks);
            actors = itemView.findViewById(R.id.actor);
            descriptions = itemView.findViewById(R.id.image_description);
        }
    }
}
