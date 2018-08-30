package com.example.h.newsappstage1;

public class News {

    //News Title
    private String mNewsTitle;

    //Author Name
    private String mAuthorName;

    //News Section
    private String mNewsSection;

    //News Date
    private String mNewsDate;

    //News Url
    private String mNewsUrl;

    public News(String newsTitle, String authorName, String newsSection, String newsDate, String newsUrl){
        mNewsTitle = newsTitle;
        mAuthorName = authorName;
        mNewsSection = newsSection;
        mNewsDate = newsDate;
        mNewsUrl = newsUrl;
    }

    public String getmNewsTitle() {
        return mNewsTitle;
    }

    public String getmAuthorName() {
        return mAuthorName;
    }

    public String getmNewsSection() {
        return mNewsSection;
    }

    public String getmNewsDate() {
        return mNewsDate;
    }

    public String getmNewsUrl() {
        return mNewsUrl;
    }
}
