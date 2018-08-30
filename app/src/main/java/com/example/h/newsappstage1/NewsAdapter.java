package com.example.h.newsappstage1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class NewsAdapter extends ArrayAdapter<News> {

    public NewsAdapter(Context context, List<News> news) {
        super(context, 0, news);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        News currentNews = getItem(position);

        TextView newsTile = listItemView.findViewById(R.id.title);
        newsTile.setText(currentNews.getmNewsTitle());

        TextView newsAuthor = listItemView.findViewById(R.id.author);
        newsAuthor.setText(currentNews.getmAuthorName());

        TextView newsSection = listItemView.findViewById(R.id.section);
        newsSection.setText(currentNews.getmNewsSection());

        TextView newsDate = listItemView.findViewById(R.id.date);
        newsDate.setText(currentNews.getmNewsDate());

        return listItemView;
    }
}