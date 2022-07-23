
package com.abdallah.seena.model.home;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Book implements Parcelable {

    @SerializedName("rank")
    @Expose
    private Integer rank;
    @SerializedName("rank_last_week")
    @Expose
    private Integer rankLastWeek;
    @SerializedName("weeks_on_list")
    @Expose
    private Integer weeksOnList;
    @SerializedName("asterisk")
    @Expose
    private Integer asterisk;
    @SerializedName("dagger")
    @Expose
    private Integer dagger;
    @SerializedName("primary_isbn10")
    @Expose
    private String primaryIsbn10;
    @SerializedName("primary_isbn13")
    @Expose
    private String primaryIsbn13;
    @SerializedName("publisher")
    @Expose
    private String publisher;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("price")
    @Expose
    private String price;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("author")
    @Expose
    private String author;
    @SerializedName("contributor")
    @Expose
    private String contributor;
    @SerializedName("contributor_note")
    @Expose
    private String contributorNote;
    @SerializedName("book_image")
    @Expose
    private String bookImage;
    @SerializedName("book_image_width")
    @Expose
    private Integer bookImageWidth;
    @SerializedName("book_image_height")
    @Expose
    private Integer bookImageHeight;
    @SerializedName("amazon_product_url")
    @Expose
    private String amazonProductUrl;
    @SerializedName("age_group")
    @Expose
    private String ageGroup;
    @SerializedName("book_review_link")
    @Expose
    private String bookReviewLink;
    @SerializedName("first_chapter_link")
    @Expose
    private String firstChapterLink;
    @SerializedName("sunday_review_link")
    @Expose
    private String sundayReviewLink;
    @SerializedName("article_chapter_link")
    @Expose
    private String articleChapterLink;
    @SerializedName("isbns")
    @Expose
    private List<Isbn> isbns = null;
    @SerializedName("buy_links")
    @Expose
    private List<BuyLink> buyLinks = null;
    @SerializedName("book_uri")
    @Expose
    private String bookUri;

    protected Book(Parcel in) {
        if (in.readByte() == 0) {
            rank = null;
        } else {
            rank = in.readInt();
        }
        if (in.readByte() == 0) {
            rankLastWeek = null;
        } else {
            rankLastWeek = in.readInt();
        }
        if (in.readByte() == 0) {
            weeksOnList = null;
        } else {
            weeksOnList = in.readInt();
        }
        if (in.readByte() == 0) {
            asterisk = null;
        } else {
            asterisk = in.readInt();
        }
        if (in.readByte() == 0) {
            dagger = null;
        } else {
            dagger = in.readInt();
        }
        primaryIsbn10 = in.readString();
        primaryIsbn13 = in.readString();
        publisher = in.readString();
        description = in.readString();
        price = in.readString();
        title = in.readString();
        author = in.readString();
        contributor = in.readString();
        contributorNote = in.readString();
        bookImage = in.readString();
        if (in.readByte() == 0) {
            bookImageWidth = null;
        } else {
            bookImageWidth = in.readInt();
        }
        if (in.readByte() == 0) {
            bookImageHeight = null;
        } else {
            bookImageHeight = in.readInt();
        }
        amazonProductUrl = in.readString();
        ageGroup = in.readString();
        bookReviewLink = in.readString();
        firstChapterLink = in.readString();
        sundayReviewLink = in.readString();
        articleChapterLink = in.readString();
        bookUri = in.readString();
    }

    public static final Creator<Book> CREATOR = new Creator<Book>() {
        @Override
        public Book createFromParcel(Parcel in) {
            return new Book(in);
        }

        @Override
        public Book[] newArray(int size) {
            return new Book[size];
        }
    };

    public Integer  getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public Integer getRankLastWeek() {
        return rankLastWeek;
    }

    public void setRankLastWeek(Integer rankLastWeek) {
        this.rankLastWeek = rankLastWeek;
    }

    public Integer getWeeksOnList() {
        return weeksOnList;
    }

    public void setWeeksOnList(Integer weeksOnList) {
        this.weeksOnList = weeksOnList;
    }

    public Integer getAsterisk() {
        return asterisk;
    }

    public void setAsterisk(Integer asterisk) {
        this.asterisk = asterisk;
    }

    public Integer getDagger() {
        return dagger;
    }

    public void setDagger(Integer dagger) {
        this.dagger = dagger;
    }

    public String getPrimaryIsbn10() {
        return primaryIsbn10;
    }

    public void setPrimaryIsbn10(String primaryIsbn10) {
        this.primaryIsbn10 = primaryIsbn10;
    }

    public String getPrimaryIsbn13() {
        return primaryIsbn13;
    }

    public void setPrimaryIsbn13(String primaryIsbn13) {
        this.primaryIsbn13 = primaryIsbn13;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContributor() {
        return contributor;
    }

    public void setContributor(String contributor) {
        this.contributor = contributor;
    }

    public String getContributorNote() {
        return contributorNote;
    }

    public void setContributorNote(String contributorNote) {
        this.contributorNote = contributorNote;
    }

    public String getBookImage() {
        return bookImage;
    }

    public void setBookImage(String bookImage) {
        this.bookImage = bookImage;
    }

    public Integer getBookImageWidth() {
        return bookImageWidth;
    }

    public void setBookImageWidth(Integer bookImageWidth) {
        this.bookImageWidth = bookImageWidth;
    }

    public Integer getBookImageHeight() {
        return bookImageHeight;
    }

    public void setBookImageHeight(Integer bookImageHeight) {
        this.bookImageHeight = bookImageHeight;
    }

    public String getAmazonProductUrl() {
        return amazonProductUrl;
    }

    public void setAmazonProductUrl(String amazonProductUrl) {
        this.amazonProductUrl = amazonProductUrl;
    }

    public String getAgeGroup() {
        return ageGroup;
    }

    public void setAgeGroup(String ageGroup) {
        this.ageGroup = ageGroup;
    }

    public String getBookReviewLink() {
        return bookReviewLink;
    }

    public void setBookReviewLink(String bookReviewLink) {
        this.bookReviewLink = bookReviewLink;
    }

    public String getFirstChapterLink() {
        return firstChapterLink;
    }

    public void setFirstChapterLink(String firstChapterLink) {
        this.firstChapterLink = firstChapterLink;
    }

    public String getSundayReviewLink() {
        return sundayReviewLink;
    }

    public void setSundayReviewLink(String sundayReviewLink) {
        this.sundayReviewLink = sundayReviewLink;
    }

    public String getArticleChapterLink() {
        return articleChapterLink;
    }

    public void setArticleChapterLink(String articleChapterLink) {
        this.articleChapterLink = articleChapterLink;
    }

    public List<Isbn> getIsbns() {
        return isbns;
    }

    public void setIsbns(List<Isbn> isbns) {
        this.isbns = isbns;
    }

    public List<BuyLink> getBuyLinks() {
        return buyLinks;
    }

    public void setBuyLinks(List<BuyLink> buyLinks) {
        this.buyLinks = buyLinks;
    }

    public String getBookUri() {
        return bookUri;
    }

    public void setBookUri(String bookUri) {
        this.bookUri = bookUri;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        if (rank == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(rank);
        }
        if (rankLastWeek == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(rankLastWeek);
        }
        if (weeksOnList == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(weeksOnList);
        }
        if (asterisk == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(asterisk);
        }
        if (dagger == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(dagger);
        }
        dest.writeString(primaryIsbn10);
        dest.writeString(primaryIsbn13);
        dest.writeString(publisher);
        dest.writeString(description);
        dest.writeString(price);
        dest.writeString(title);
        dest.writeString(author);
        dest.writeString(contributor);
        dest.writeString(contributorNote);
        dest.writeString(bookImage);
        if (bookImageWidth == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(bookImageWidth);
        }
        if (bookImageHeight == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(bookImageHeight);
        }
        dest.writeString(amazonProductUrl);
        dest.writeString(ageGroup);
        dest.writeString(bookReviewLink);
        dest.writeString(firstChapterLink);
        dest.writeString(sundayReviewLink);
        dest.writeString(articleChapterLink);
        dest.writeString(bookUri);
    }
}
