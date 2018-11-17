package com.example.okanserdaroglu.profilescreenapp.views;
import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.okanserdaroglu.profilescreenapp.R;
import com.example.okanserdaroglu.profilescreenapp.databinding.PostRowItemBinding;
import com.example.okanserdaroglu.profilescreenapp.models.Post;

import java.util.List;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.PostViewHolder> {

    private List<Post>postList;
    private LayoutInflater layoutInflater;
    private PostAdapterListener listener;

    public PostAdapter(List<Post>postList,PostAdapterListener listener){
        this.postList = postList;
        this.listener = listener;
    }

    @NonNull
    @Override
    public PostViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        if (layoutInflater == null){
            layoutInflater = LayoutInflater.from(viewGroup.getContext());

        }
        PostRowItemBinding postRowItemBinding =
                DataBindingUtil.inflate(layoutInflater, R.layout.post_row_item,viewGroup,false);

        return new PostViewHolder(postRowItemBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull PostViewHolder postViewHolder,final int i) {
        postViewHolder.postRowItemBinding.setPost(postList.get(i));
        postViewHolder.postRowItemBinding.thumbnail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (listener != null){
                    listener.onPostClicked(postList.get(i));
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return postList.size();
    }

    public class PostViewHolder extends RecyclerView.ViewHolder {

        private final PostRowItemBinding postRowItemBinding;

        public PostViewHolder(PostRowItemBinding postRowItemBinding) {
            super(postRowItemBinding.getRoot());
            this.postRowItemBinding = postRowItemBinding;
        }

    }

    public interface PostAdapterListener {
        void onPostClicked (Post post);
    }


}
