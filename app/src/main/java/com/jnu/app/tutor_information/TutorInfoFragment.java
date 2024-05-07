package com.jnu.app.tutor_information;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.jnu.app.R;
import com.jnu.app.data.Tutor;

import java.util.ArrayList;

public class TutorInfoFragment extends Fragment {
    ArrayList<Tutor> tutors = new ArrayList<>();
    RecyclerViewTutorAdapter recyclerViewTutorAdapter;

    public TutorInfoFragment() {
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
        View rootView =  inflater.inflate(R.layout.fragment_tutor_info, container, false);

        RecyclerView recyclerView = rootView.findViewById(R.id.recyclerview_tutor);
        recyclerView.setLayoutManager(new LinearLayoutManager(requireActivity()));

        tutors.add(new Tutor("黄国全", "博导", "学术", "管理科学与工程"));

        recyclerViewTutorAdapter = new RecyclerViewTutorAdapter(tutors);
        recyclerView.setAdapter(recyclerViewTutorAdapter);
        // a
        return rootView;
    }
}