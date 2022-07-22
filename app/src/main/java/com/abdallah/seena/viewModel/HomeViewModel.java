package com.abdallah.seena.viewModel;

import android.util.Log;

import androidx.lifecycle.ViewModel;

import com.abdallah.seena.model.home.BooksModel;
 import com.abdallah.seena.network.RetrofitClass;
import com.abdallah.seena.network.SingleLiveEvent;

import java.util.List;

import io.reactivex.SingleObserver;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class HomeViewModel extends ViewModel {



 public SingleLiveEvent<BooksModel>  getBooks() {

     SingleLiveEvent<BooksModel> booksSingle = new SingleLiveEvent<>();

     RetrofitClass.getNetworkInstance().getBooks().subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
          .subscribe(new SingleObserver<BooksModel>() {
           @Override
           public void onSubscribe(Disposable d) {

           }

           @Override
           public void onSuccess(BooksModel booksModelBaseResponse) {
             booksSingle.setValue(booksModelBaseResponse);
           }

           @Override
           public void onError(Throwable e) {
            }
          });

  return booksSingle;
 }

    private   final String TAG = "HomeViewModel";
}