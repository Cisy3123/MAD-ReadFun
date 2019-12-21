package com.yuyuereading.Presenter.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.willy.ratingbar.ScaleRatingBar;
import com.yuyuereading.Model.bean.BookInfo;
import com.yuyuereading.Presenter.activity.WantReadActivity;
import com.yuyuereading.R;

import java.util.List;

public class RecommendAdapter extends RecyclerView.Adapter<RecommendAdapter.ViewHolder> {

    private Context mContext;

    private List<BookInfo> mBookInfoList;


    public RecommendAdapter(List<BookInfo> bookInfoList) {
        mBookInfoList = bookInfoList;
    }

    public void setData(List<BookInfo> bookInfoList){
       mBookInfoList.addAll(bookInfoList);
        notifyDataSetChanged();
    }

    @Override
    public RecommendAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view;
        if (mContext == null) {
            mContext = parent.getContext();
        }
        view = LayoutInflater.from(mContext).inflate(R.layout.book_list_item, parent, false);
        return new ViewHolder(view);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(RecommendAdapter.ViewHolder holder, int position) {
        final BookInfo bookInfo = mBookInfoList.get(position);
        holder.bookName.setText(bookInfo.getBook_name());
        Glide.with(mContext)
                .load(bookInfo.getBook_image())
                .into(holder.bookImage);
        holder.publicDate.setText(bookInfo.getBook_publish_date());
        holder.authorName.setText(bookInfo.getBook_author());
        holder.publicer.setText(bookInfo.getBook_publisher());
        holder.simpleRatingBar.setRating(Float.parseFloat(bookInfo.getBook_rating())/2);
        holder.rating.setText(bookInfo.getBook_rating());
        holder.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, WantReadActivity.class);
                Bundle bundle = new Bundle();
                bundle.putSerializable("bookInfo", bookInfo);
                intent.putExtras(bundle);
                mContext.startActivity(intent);
            }
        });

    }

    class ViewHolder extends RecyclerView.ViewHolder{

        CardView cardView;
        Button button;
        View mItemView;
        ImageView bookImage;
        ScaleRatingBar simpleRatingBar;
        TextView bookName,publicDate,rating,authorName,publicer;

        ViewHolder(View itemView) {
            super(itemView);
            mItemView = itemView;
            cardView = (CardView) itemView;
            bookImage = itemView.findViewById(R.id.book_image);
            bookName = itemView.findViewById(R.id.book_name);
            publicDate = itemView.findViewById(R.id.public_date);
            rating = itemView.findViewById(R.id.rating);
            authorName = itemView.findViewById(R.id.author_name);
            publicer = itemView.findViewById(R.id.public_name);
            simpleRatingBar = itemView.findViewById(R.id.simpleRatingBar);
            button=itemView.findViewById(R.id.button_add);

        }
    }

    @Override
    public int getItemCount() {
        return mBookInfoList.size();
    }

}
