package com.abdallah.seena.adapters;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.abdallah.seena.R;
import com.abdallah.seena.databinding.ItemHomeBinding;
import com.abdallah.seena.model.home.Book;
import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.HomeAdapterHolder> {

    private final List<Book> books = new ArrayList<>();

    public void setBookClick(BookClick bookClick) {
        this.bookClick = bookClick;
    }


    private BookClick bookClick;


    public void addBooks(List<Book> modelList) {
        books.addAll(modelList);
        notifyDataSetChanged();
    }


    @NonNull
    @Override
    public HomeAdapterHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new HomeAdapterHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_home, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull HomeAdapterHolder holder, int position) {
        Book book = books.get(position);

        holder.itemView.setOnClickListener(v -> bookClick.onBookClick(book));
        holder.binding.tvTitle.setText(book.getTitle());
        holder.binding.tvAuthor.setText(book.getAuthor());
        holder.binding.tvPublisher.setText(book.getPublisher());
        Glide.with(holder.itemView).load(book.getBookImage()).into(holder.binding.imgBook);


    }

    @Override
    public int getItemCount() {
        return books.size();
    }

    public void clearData() {
        books.clear();
        notifyDataSetChanged();
    }

    static class HomeAdapterHolder extends RecyclerView.ViewHolder {
        private final ItemHomeBinding binding;

        public HomeAdapterHolder(@NonNull View itemView) {
            super(itemView);
            binding = ItemHomeBinding.bind(itemView);
        }
    }

    public interface BookClick {
        void onBookClick(Book books);
    }
}
