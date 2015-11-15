//package com.appmite.alarmplayground.media;
//
//import android.media.MediaCodec;
//
//import com.google.android.exoplayer.ExoPlaybackException;
//import com.google.android.exoplayer.ExoPlayer;
//import com.google.android.exoplayer.FrameworkSampleSource;
//import com.google.android.exoplayer.MediaCodecAudioTrackRenderer;
//import com.google.android.exoplayer.MediaCodecTrackRenderer;
//import com.google.android.exoplayer.MediaCodecVideoTrackRenderer;
//import com.google.android.exoplayer.SampleSource;
//import com.google.android.exoplayer.audio.AudioTrack;
//import com.google.android.exoplayer.util.PlayerControl;
//
//
//public class Player implements ExoPlayer.Listener, MediaCodecAudioTrackRenderer.EventListener {
//
//    public static final int RENDERER_COUNT = 4;
//
//    private final ExoPlayer player;
//    private MediaCodecVideoTrackRenderer videoRenderer;
//    private MediaCodecAudioTrackRenderer audioRenderer;
//
//    public Player() {
//        //this.rendererBuilder = rendererBuilder;
//        player = ExoPlayer.Factory.newInstance(RENDERER_COUNT, 1000, 5000);
//        player.addListener(this);
//        //playerControl = new PlayerControl(player);
//        //mainHandler = new Handler();
//        //listeners = new CopyOnWriteArrayList<>();
//        //lastReportedPlaybackState = STATE_IDLE;
//        //rendererBuildingState = RENDERER_BUILDING_STATE_IDLE;
//        // Disable text initially.
//        //player.setSelectedTrack(TYPE_TEXT, TRACK_DISABLED);
//    }
//
//    public void prepare() {
//        //if (rendererBuildingState == RENDERER_BUILDING_STATE_BUILT) {
//            player.stop();
//        //}
//        //rendererBuilder.cancel();
//        //videoFormat = null;
//        //videoRenderer = null;
//        //rendererBuildingState = RENDERER_BUILDING_STATE_BUILDING;
//        //maybeReportPlayerState();
//        //rendererBuilder.buildRenderers(this);
//        buildRenderers();
//        player.prepare(videoRenderer, audioRenderer);
//        player.sendMessage(videoRenderer, MediaCodecVideoTrackRenderer.MSG_SET_SURFACE, surface);
//        player.setPlayWhenReady(true);
//    }
//
//
//    public void buildRenderers() {
//        //DefaultSampleSource sampleSource=new DefaultSampleSource(new FrameworkSampleExtractor(context,uri,null),2);
//        SampleSource sampleSource = new FrameworkSampleSource();
//        videoRenderer = new MediaCodecVideoTrackRenderer(sampleSource, MediaCodec.VIDEO_SCALING_MODE_SCALE_TO_FIT);
//        audioRenderer = new MediaCodecAudioTrackRenderer(sampleSource);
//
//        //TrackRenderer[] renderers=new TrackRenderer[TvMediaPlayer.RENDERER_COUNT];
//        //renderers[TvMediaPlayer.TYPE_VIDEO]=videoRenderer;
//        //renderers[TvMediaPlayer.TYPE_AUDIO]=audioRenderer;
//        //callback.onRenderers(null, null, renderers);
//    }
//
//    /**
//     * A listener for core events.
//     */
//    public interface Listener {
//        void onStateChanged(boolean playWhenReady, int playbackState);
//        void onError(Exception e);
//        void onVideoSizeChanged(int width, int height, int unappliedRotationDegrees,
//                                float pixelWidthHeightRatio);
//    }
//
//
//
//
//    @Override
//    public void onPlayerStateChanged(boolean playWhenReady, int playbackState) {
//
//    }
//
//    @Override
//    public void onPlayWhenReadyCommitted() {
//
//    }
//
//    @Override
//    public void onPlayerError(ExoPlaybackException error) {
//
//    }
//
//
//    /*
//    * MediaAudioTrackRenderer
//    * */
//    @Override
//    public void onAudioTrackInitializationError(AudioTrack.InitializationException e) {
//
//    }
//
//    @Override
//    public void onAudioTrackWriteError(AudioTrack.WriteException e) {
//
//    }
//
//    @Override
//    public void onDecoderInitializationError(MediaCodecTrackRenderer.DecoderInitializationException e) {
//
//    }
//
//    @Override
//    public void onCryptoError(MediaCodec.CryptoException e) {
//
//    }
//
//    @Override
//    public void onDecoderInitialized(String decoderName, long elapsedRealtimeMs, long initializationDurationMs) {
//
//    }
//}
