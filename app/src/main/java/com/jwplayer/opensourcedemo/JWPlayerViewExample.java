package com.jwplayer.opensourcedemo;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.longtailvideo.jwplayer.JWPlayerView;
import com.longtailvideo.jwplayer.cast.CastManager;
import com.longtailvideo.jwplayer.configuration.PlayerConfig;
import com.longtailvideo.jwplayer.events.FullscreenEvent;
import com.longtailvideo.jwplayer.events.listeners.VideoPlayerEvents;
import com.longtailvideo.jwplayer.media.ads.AdBreak;
import com.longtailvideo.jwplayer.media.ads.AdSource;
import com.longtailvideo.jwplayer.media.ads.Advertising;
import com.longtailvideo.jwplayer.media.ads.ImaAdvertising;
import com.longtailvideo.jwplayer.media.playlists.PlaylistItem;

import java.util.ArrayList;
import java.util.List;

public class JWPlayerViewExample extends AppCompatActivity
        implements VideoPlayerEvents.OnFullscreenListener {

    /**
     * Reference to the {@link JWPlayerView}
     */
    private JWPlayerView mPlayerView;

    /**
     * An instance of our event handling class
     */
    private JWEventHandler mEventHandler;

    /**
     * Reference to the {@link CastManager}
     */
    private CastManager mCastManager;

    /**
     * Stored instance of CoordinatorLayout
     * http://developer.android.com/reference/android/support/design/widget/CoordinatorLayout.html
     */
    private CoordinatorLayout mCoordinatorLayout;
    String videoId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jwplayerview);

         videoId = getIntent().getStringExtra("VIDEO_ID");
        String jsonId = getIntent().getStringExtra("JSON_ID");

        mPlayerView = findViewById(R.id.jwplayer);
        TextView outputTextView = findViewById(R.id.output);

        mCoordinatorLayout = findViewById(R.id.activity_jwplayerview);

        // Handle hiding/showing of ActionBar
        mPlayerView.addOnFullscreenListener(this);

        // Keep the screen on during playback
        new KeepScreenOnHandler(mPlayerView, getWindow());

        // Instantiate the JW Player event handler class
        mEventHandler = new JWEventHandler(mPlayerView, outputTextView);

        //playMP4();
        playVPAID();
        //playVAST();
        //playIMA();
        // Get a reference to the CastManager
        mCastManager = CastManager.getInstance();
    }

    private void playMP4() {
        // Load a media source
        PlaylistItem pi = new PlaylistItem.Builder()
                .file("https://storage.googleapis.com/exoplayer-test-media-1/gen-3/screens/dash-vod-single-segment/video-avc-baseline-480.mp4")
                .title("BipBop")
                .description("A video player testing video.")
                .build();

        mPlayerView.load(pi);
    }

    private void playVPAID() {
        // Create video
        PlaylistItem video = new PlaylistItem("https://storage.googleapis.com/exoplayer-test-media-1/gen-3/screens/dash-vod-single-segment/video-avc-baseline-480.mp4");
        // Set the ad break offset
        AdBreak adBreak = new AdBreak("pre", AdSource.VAST, "https://blog.vtap.me/blog/demo/vpaid/vastvpaid_sample.php?vid="+videoId);
        List<AdBreak> adSchedule = new ArrayList<AdBreak>();
        adSchedule.add(adBreak);
        // Set the ad schedule to your video
        video.setAdSchedule(adSchedule);
        // Create a playlist
        List<PlaylistItem> playlist = new ArrayList<PlaylistItem>();
        playlist.add(video);
        // Create your player config
        PlayerConfig playerConfig = new PlayerConfig.Builder()
                .playlist(playlist)
                .build();
        // Setup your player with the config
        mPlayerView.setup(playerConfig);
    }

    private void playIMA(){
        // Create your ad schedule
        List<AdBreak> adSchedule = new ArrayList<>();

       // AdBreak adBreak = new AdBreak("pre", AdSource.IMA, "https://pubads.g.doubleclick.net/gampad/ads?sz=640x480&iu=/124319096/external/single_ad_samples&ciu_szs=300x250&impl=s&gdfp_req=1&env=vp&output=vast&unviewed_position_start=1&cust_params=deployment%3Ddevsite%26sample_ct%3Dlinear&correlator=");
        AdBreak adBreak = new AdBreak("pre", AdSource.IMA, "https://googleads.g.doubleclick.net/pagead/ads?client=ca-video-pub-8834194653550774&slotname=CM_TheHindu_Video_Preroll&ad_type=video&description_url=https%3A%2F%2Fwww.thehindu.com%2F&max_ad_duration=30000&videoad_start_delay=0&vpmute=0&vpa=0");
      //  AdBreak adBreak = new AdBreak("pre", AdSource.IMA, "https://blog.vtap.me/blog/demo/vpaid/vastvpaid_sample.php?vid="+videoId);

        adSchedule.add(adBreak);

      // Set your ad schedule to your advertising object
        ImaAdvertising imaAdvertising = new ImaAdvertising(adSchedule);

       // Create a playlist, you'll need this to build your player config
        List<PlaylistItem> playlist = new ArrayList<>();

        PlaylistItem video = new PlaylistItem("http://playertest.longtailvideo.com/adaptive/bipbop/gear4/prog_index.m3u8");
        PlaylistItem video2 = new PlaylistItem("http://playertest.longtailvideo.com/jwpromo/jwpromo.m3u8");

        playlist.add(video);
        playlist.add(video2);

      // Create your player config
        PlayerConfig playerConfig = new PlayerConfig.Builder()
                .playlist(playlist)
                .advertising(imaAdvertising)
                .build();

      // Setup your player with the config
        mPlayerView.setup(playerConfig);
    }

    private void playVAST() {
        // Construct a new AdBreak containing the Ad tag
// This AdBreak will play a midroll at 10%
        AdBreak adBreak = new AdBreak("10%", AdSource.VAST, "https://blog.vtap.me/blog/demo/vpaid/vastvpaid_sample.php?vid="+videoId);

// Add the AdBreak to a List
        List<AdBreak> adSchedule = new ArrayList<>();
        adSchedule.add(adBreak);

// Build a PlaylistItem and assign adSchedule
        PlaylistItem video = new PlaylistItem.Builder()
                .file("https://storage.googleapis.com/exoplayer-test-media-1/gen-3/screens/dash-vod-single-segment/video-avc-baseline-480.mp4")
                .adSchedule(adSchedule)
                .build();

       // Add the PlaylistItem to a List
        List<PlaylistItem> playlist = new ArrayList<>();
        playlist.add(video);

       // Create an empty list for the Advertising object
        List<AdBreak> emptyList = new ArrayList<>();
        // Construct the Advertising Object
        Advertising advertising = new Advertising(AdSource.VAST, emptyList);

      // Set the skip offset in seconds
        advertising.setSkipOffset(60);

       // Build the PlayerConfig
        PlayerConfig playerConfig = new PlayerConfig.Builder()
                .playlist(playlist)
                .advertising(advertising)
                .build();

        // Setup the player
        mPlayerView.setup(playerConfig);

    }

    @Override
    protected void onStart() {
        super.onStart();
        mPlayerView.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
        mPlayerView.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        mPlayerView.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
        mPlayerView.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mPlayerView.onDestroy();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        // Set fullscreen when the device is rotated to landscape
        mPlayerView.setFullscreen(newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE,
                true);
        super.onConfigurationChanged(newConfig);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        // Exit fullscreen when the user pressed the Back button
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            if (mPlayerView.getFullscreen()) {
                mPlayerView.setFullscreen(false, true);
                return false;
            }
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override
    public void onFullscreen(FullscreenEvent fullscreenEvent) {
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            if (fullscreenEvent.getFullscreen()) {
                actionBar.hide();
            } else {
                actionBar.show();
            }
        }

        // When going to Fullscreen we want to set fitsSystemWindows="false"
        mCoordinatorLayout.setFitsSystemWindows(!fullscreenEvent.getFullscreen());
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_jwplayerview, menu);
        // Register the MediaRouterButton on the JW Player SDK
        mCastManager.addMediaRouterButton(menu, R.id.media_route_menu_item);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.switch_to_fragment:
                Intent i = new Intent(this, JWPlayerFragmentExample.class);
                startActivity(i);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
