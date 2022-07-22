package com.abdallah.seena.network;

import static com.abdallah.seena.utils.Constant.BOOKS_API;

import com.abdallah.seena.model.home.BooksModel;

import io.reactivex.Single;
import retrofit2.http.GET;

public interface NetworkInterface {


    @GET(BOOKS_API)
    Single<BooksModel> getBooks();


}
