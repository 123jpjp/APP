package com.jnu.app.major_information;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jnu.app.R;
import com.jnu.app.data.Major;

import java.util.ArrayList;

public class MajorInfoFragment extends Fragment {
    ArrayList<Major> majors = new ArrayList<>();
    RecyclerViewMajorAdapter recyclerViewMajorAdapter;

    public MajorInfoFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_major_info, container, false);

        RecyclerView recyclerView = rootView.findViewById(R.id.recyclerview_major);
        recyclerView.setLayoutManager(new LinearLayoutManager(requireActivity()));

        recyclerViewMajorAdapter = new RecyclerViewMajorAdapter(majors);
        recyclerView.setAdapter(recyclerViewMajorAdapter);

        return rootView;
    }
}