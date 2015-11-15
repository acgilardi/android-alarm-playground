package com.appmite.alarmplayground.media;

import com.google.android.exoplayer.*;
import com.google.android.exoplayer.extractor.Extractor;
import com.google.android.exoplayer.extractor.ExtractorSampleSource;
import com.google.android.exoplayer.upstream.Allocation;
import com.google.android.exoplayer.upstream.Allocator;
import com.google.android.exoplayer.upstream.DataSource;
import com.google.android.exoplayer.upstream.DefaultAllocator;
import com.google.android.exoplayer.upstream.DefaultUriDataSource;
import com.google.android.exoplayer.util.Util;

import android.content.Context;
import android.media.MediaCodec;
import android.net.Uri;
import android.view.Surface;

class Player {

    private static final int RENDERER_COUNT = 1;
    private static final int BUFFER_SIZE = 5 * 1024 * 1024;
    private static final int BUFFER_SEGMENT_SIZE = 5 * 1024 * 1024;

    private Context mContext;
    private Extractor mExtractor;
    private Uri mUri;
    private ExoPlayer mExoPlayer;

    public void Player(Context context, Extractor extractor) {
        mContext = context;
        mExtractor = extractor;
    }

    void play(String strUri, Surface surface) {
//        Uri uri = Uri.parse(strUri);
//        final int numRenderers = 2;
//
//        mExoPlayer = ExoPlayer.Factory.newInstance(RENDERER_COUNT);
//        Allocator allocator = new DefaultAllocator(BUFFER_SEGMENT_SIZE);
//        DataSource dataSource = new DefaultUriDataSource(mContext, null, userAgent);

//        Mp3Extractor extractor = new Mp3Extractor();
//        ExtractorSampleSource sampleSource = new ExtractorSampleSource(
//                uri, dataSource, extractor, allocator, BUFFER_SEGMENT_COUNT * BUFFER_SEGMENT_SIZE);
//        MediaCodecAudioTrackRenderer audioRenderer = new MediaCodecAudioTrackRenderer(sampleSource);
//        exoPlayer.prepare(audioRenderer);
//
//        exoPlayer.setPlayWhenReady(true);

        // Build the sample source
        //SampleSource sampleSource =
        //        new FrameworkSampleSource(mContext, uri, /* headers */ null, numRenderers);
        //DataSource dataSource = new DefaultUriDataSource(Util.getUserAgent(mContext, "ExoPlayer"), null);

        // Build the track renderers
        //TrackRenderer videoRenderer = new MediaCodecVideoTrackRenderer(sampleSource, MediaCodec.VIDEO_SCALING_MODE_SCALE_TO_FIT);
        //TrackRenderer audioRenderer = new MediaCodecAudioTrackRenderer(sampleSource);

//        DataSource dataSource = new DefaultUriDataSource(mContext, "ExoPlayer");
//
//
//        ExtractorSampleSource sampleSource = new ExtractorSampleSource(mUri, dataSource, 1, BUFFER_SIZE, mExtractor);
//
//        ExtractorSampleSource sampleSource = new ExtractorSampleSource(mUri, dataSource, mExtractor,
//                BUFFER_SIZE, ExtractorSampleSource.DEFAULT_MIN_LOADABLE_RETRY_COUNT_ON_DEMAND);
//        MediaCodecAudioTrackRenderer audioRenderer = new MediaCodecAudioTrackRenderer(sampleSource,
//                null, true, player.getMainHandler(), player);
//
//        // Build the ExoPlayer and start playback
//        ExoPlayer exoPlayer = ExoPlayer.Factory.newInstance(numRenderers);
//        exoPlayer.prepare(videoRenderer, audioRenderer);
//
//        // Pass the surface to the video renderer.
//        exoPlayer.sendMessage(videoRenderer, MediaCodecVideoTrackRenderer.MSG_SET_SURFACE, surface);
//
//        exoPlayer.setPlayWhenReady(true);
    }

//    void release() {
//        // Don't forget to release when done!
//        exoPlayer.release();
//    }

}