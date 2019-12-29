package com.example.group.petsogramapp.ui.mating;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.group.petsogramapp.R;

public class MatingCustomAdapter extends BaseAdapter {

    android.content.Context Context;
    int homePosts[];
    LayoutInflater Inflater;
    ImageView likeButton;
    TextView Likes;
    TextView  Comments;
    Button viewProfileAdoptionButton;

    public MatingCustomAdapter(android.content.Context applicationContext, int[] homePosts) {
        this.Context = applicationContext;
        this.homePosts = homePosts;
        Inflater = (LayoutInflater.from(applicationContext));
    }
    @Override
    public int getCount() {
        return homePosts.length;
    }
    @Override
    public Object getItem(int i) {
        return null;
    }
    @Override
    public long getItemId(int i) {
        return 0;
    }
    @Override
    public View getView(int i, View myHomeView, ViewGroup viewGroup) {
        myHomeView = Inflater.inflate(R.layout.mating_rows, null);
        ImageView postImage = (ImageView) myHomeView.findViewById(R.id.postMatingImage);
        viewProfileAdoptionButton= (Button) myHomeView.findViewById(R.id.viewProfileMatingButton);
        postImage.setImageResource(homePosts[i]);




        return myHomeView;
    }
}

