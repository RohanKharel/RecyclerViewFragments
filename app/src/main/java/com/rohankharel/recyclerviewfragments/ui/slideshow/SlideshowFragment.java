package com.rohankharel.recyclerviewfragments.ui.slideshow;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.rohankharel.recyclerviewfragments.R;
import com.rohankharel.recyclerviewfragments.adapter.DetailsAdapter;
import com.rohankharel.recyclerviewfragments.model.Details;

import java.util.ArrayList;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class SlideshowFragment extends Fragment {
    private CircleImageView imgProfile;
    private RecyclerView recyclerView;
    private SlideshowViewModel slideshowViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        slideshowViewModel =
                ViewModelProviders.of(this).get(SlideshowViewModel.class);
        View root = inflater.inflate(R.layout.fragment_slideshow, container, false);
        imgProfile = root.findViewById(R.id.imgProfile);
        recyclerView = root.findViewById(R.id.recyclerView);
        List<Details> DetailsList = new ArrayList<>();
        DetailsList.add(new Details("Rohit","9867894345", R.drawable.rohit));
        DetailsList.add(new Details("Virat","9867543488", R.drawable.virat));
        DetailsList.add(new Details("Makram","9876543249", R.drawable.makram));
        DetailsList.add(new Details("Williamson","9889765430", R.drawable.williamson));

        DetailsAdapter DetailsAdapter = new DetailsAdapter(getActivity(), DetailsList);
        recyclerView.setAdapter(DetailsAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        return root;
    }
}