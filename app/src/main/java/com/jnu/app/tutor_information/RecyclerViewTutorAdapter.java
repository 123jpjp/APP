package com.jnu.app.tutor_information;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.jnu.app.R;
import com.jnu.app.data.Tutor;

import java.util.ArrayList;

public class RecyclerViewTutorAdapter extends RecyclerView.Adapter<RecyclerViewTutorAdapter.ViewHolder> {
    private final ArrayList<Tutor> localDataSet;

    public RecyclerViewTutorAdapter(ArrayList<Tutor> dataSet) {
        localDataSet = dataSet;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.tutor_info_item, viewGroup, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int position) {
        viewHolder.getTutorName().setText(localDataSet.get(position).getName());
        viewHolder.getTutorLevel().setText(localDataSet.get(position).getLevel());
        viewHolder.getTutorCategory().setText(localDataSet.get(position).getCategory());
        viewHolder.getTutorDirection().setText(localDataSet.get(position).getDirection());
    }

    @Override
    public int getItemCount() {
        return localDataSet.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView tutorName;
        private final TextView tutorLevel;
        private final TextView tutorCategory;
        private final TextView tutorDirection;

        public TextView getTutorName() {
            return tutorName;
        }

        public TextView getTutorLevel() {
            return tutorLevel;
        }

        public TextView getTutorCategory() {
            return tutorCategory;
        }

        public TextView getTutorDirection() {
            return tutorDirection;
        }

        public ViewHolder(View tutorItemview) {
            super(tutorItemview);

            tutorName = tutorItemview.findViewById(R.id.tutor_name);
            tutorLevel = tutorItemview.findViewById(R.id.tutor_level);
            tutorCategory = tutorItemview.findViewById(R.id.tutor_category);
            tutorDirection = tutorItemview.findViewById(R.id.research_direction);
        }
    }
}
