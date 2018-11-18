package com.example.okanserdaroglu.profilescreenapp.views;
import android.content.res.Resources;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.TypedValue;
import android.widget.Toast;

import com.example.okanserdaroglu.profilescreenapp.R;
import com.example.okanserdaroglu.profilescreenapp.databinding.ActivityMainBinding;
import com.example.okanserdaroglu.profilescreenapp.models.Post;
import com.example.okanserdaroglu.profilescreenapp.models.User;
import com.example.okanserdaroglu.profilescreenapp.utils.GridSpacingItemDecoration;
import com.example.okanserdaroglu.profilescreenapp.utils.ProfileClickHandlers;

import java.util.ArrayList;

/** https://www.androidhive.info/android-databinding-in-recyclerview-profile-screen/ */

public class MainActivity extends AppCompatActivity implements PostAdapter.PostAdapterListener {

    private ActivityMainBinding activityMainBinding;
    private User user;
    private RecyclerView recyclerViewPosts;
    private PostAdapter postAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);

        Toolbar toolbar = activityMainBinding.toolbar;
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(R.string.toolbar_profile);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        renderProfile();
        initRecyclerView();

    }

    private void renderProfile() {
        user = new User();
        user.setName("Bakdag");
        user.setEmail("bakdag@gmail.com");
        user.setProfileImage("https://api.androidhive.info/images/nature/david.jpg");
        user.setAbout("Vizyon : ");

        // ObservableField doesn't have setter method, instead will
        // be called using set() method
        user.numberOfPosts.set(3400L);
        user.numberOfFollowers.set(3050890L);
        user.numberOfFollowing.set(150L);

        activityMainBinding.setUser(user);
        activityMainBinding.content.setHandlers(new ProfileClickHandlers());
    }

    private void initRecyclerView() {
        recyclerViewPosts = activityMainBinding.content.recyclerView;
        recyclerViewPosts.setLayoutManager(new GridLayoutManager(this, 3));
        recyclerViewPosts.addItemDecoration(new GridSpacingItemDecoration(3, dpToPx(4), true));
        recyclerViewPosts.setItemAnimator(new DefaultItemAnimator());
        recyclerViewPosts.setNestedScrollingEnabled(false);
        postAdapter = new PostAdapter(getPosts(), this);
        recyclerViewPosts.setAdapter(postAdapter);
    }

    private ArrayList<Post> getPosts() {
        ArrayList<Post> posts = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            Post post = new Post();
            post.setImageUrl("https://api.androidhive.info/images/nature/" + i + ".jpg");

            posts.add(post);
        }

        return posts;
    }

    private int dpToPx(int dp) {
        Resources r = getResources();
        return Math.round(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, r.getDisplayMetrics()));
    }

    @Override
    public void onPostClicked(Post post) {
        Toast.makeText(this,"post item clicked",Toast.LENGTH_LONG).show();
    }
}
