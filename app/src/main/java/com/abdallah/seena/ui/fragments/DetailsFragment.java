package com.abdallah.seena.ui.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.abdallah.seena.databinding.FragmentDetailsBinding;
import com.abdallah.seena.model.home.Book;
import com.bumptech.glide.Glide;


public class DetailsFragment extends Fragment {

    FragmentDetailsBinding binding;

    public DetailsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentDetailsBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        DetailsFragmentArgs args = DetailsFragmentArgs.fromBundle(getArguments());
        @NonNull Book book = args.getBook();
        binding.titleTxt.setText(book.getTitle());
        binding.publishedByTxt.setText(book.getPublisher());
        binding.summeryTxt.setText(book.getDescription());
        binding.dateTxt.setText(args.getPublishedDate());
        Glide.with(requireContext())
                .load(book.getBookImage())
                .into(binding.img);

    }
}