
package com.abdallah.seena.model.home;

 import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

 public class BooksModel {


     // to handle the exceptions
     private Throwable throwable;


     public Throwable getThrowable() {
         return throwable;
     }

     public void setThrowable(Throwable throwable) {
         this.throwable = throwable;
     }

     @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("copyright")
    @Expose
    private String copyright;
    @SerializedName("num_results")
    @Expose
    private Integer numResults;
    @SerializedName("last_modified")
    @Expose
    private String lastModified;
    @SerializedName("results")
    @Expose
    private Results results;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    public Integer getNumResults() {
        return numResults;
    }

    public void setNumResults(Integer numResults) {
        this.numResults = numResults;
    }

    public String getLastModified() {
        return lastModified;
    }

    public void setLastModified(String lastModified) {
        this.lastModified = lastModified;
    }

    public Results getResults() {
        return results;
    }

    public void setResults(Results results) {
        this.results = results;
    }

}
