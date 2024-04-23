package com.jnu.app.major_information;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.jnu.app.R;
import com.jnu.app.data.Major;

import java.util.ArrayList;

public class RecyclerViewMajorAdapter extends RecyclerView.Adapter<RecyclerViewMajorAdapter.ViewHolder> {
    private final ArrayList<Major> localDataSet;

    public RecyclerViewMajorAdapter(ArrayList<Major> dataSet) {
        localDataSet = dataSet;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.major_info_item, viewGroup, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewMajorAdapter.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return localDataSet.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(View majorItemView) {
            super(majorItemView);
        }
    }
}
