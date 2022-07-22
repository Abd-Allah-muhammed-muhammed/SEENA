package com.abdallah.seena.ui.fragments;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.abdallah.seena.R;
import com.abdallah.seena.adapters.HomeAdapter;
import com.abdallah.seena.databinding.FragmentHomeBinding;
import com.abdallah.seena.model.home.Book;
import com.abdallah.seena.viewModel.HomeViewModel;

public class HomeFragment extends Fragment implements HomeAdapter.BookClick {

    private HomeViewModel mViewModel;
    private HomeAdapter adapter;

    public static HomeFragment newInstance() {
        return new HomeFragment();
    }

    FragmentHomeBinding binding ;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        binding = FragmentHomeBinding.inflate(inflater);
        return binding.getRoot();
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(HomeViewModel.class);
        setUpBooks();
        getBooks();
    }

    private void getBooks() {

        mViewModel.getBooks().observe(getViewLifecycleOwner(), response -> {

            if (response.getThrowable()==null){
                if (response.getStatus().equals("OK")){
                    adapter.addBooks(response.getResults().getBooks());
                }
            }


        });

    }



    private void setUpBooks( ) {
        adapter = new HomeAdapter();
        LinearLayoutManager layoutManager = new LinearLayoutManager(requireContext());
        adapter.setBookClick(this);
        binding.rvBooks.setLayoutManager(layoutManager);
        binding.rvBooks.setAdapter(adapter);

    }

    @Override
    public void onBookClick(Book books) {

    }
}