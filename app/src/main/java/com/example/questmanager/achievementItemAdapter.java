package com.example.questmanager;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class achievementItemAdapter extends ArrayAdapter<Achievement> {

    public achievementItemAdapter(Activity context, ArrayList<Achievement> achievements){
        super(context, 0, achievements);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View achievementView = convertView;
        if(achievementView == null){
            achievementView = LayoutInflater.from(getContext()).inflate(R.layout.achievement_list_item, parent, false);
        }

        Achievement achievement = getItem(position);
        TextView achievementText = achievementView.findViewById(R.id.achievementItem);
        String fullDescription = achievement.getAchTitle()+" - "+achievement.getDescription();
        achievementText.setText(fullDescription);
        //checkmark would be an image that's next to achievementItem in layout
        return achievementView;
    }
}