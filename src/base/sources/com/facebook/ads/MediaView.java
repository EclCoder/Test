package com.facebook.ads;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.ads.internal.api.AdNativeComponentView;
import com.facebook.ads.internal.api.AdViewConstructorParams;
import com.facebook.ads.internal.api.MediaViewApi;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class MediaView extends AdNativeComponentView {
    private AdViewConstructorParams mConstructorParams;
    private MediaViewApi mMediaViewApi;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MediaView.this.removeAllViews();
            ((AdNativeComponentView) MediaView.this).mAdComponentViewApi = null;
            MediaView mediaView = MediaView.this;
            mediaView.mMediaViewApi = DynamicLoaderFactory.makeLoader(mediaView.mConstructorParams.getContext()).createMediaViewApi();
            MediaView mediaView2 = MediaView.this;
            mediaView2.attachAdComponentViewApi(mediaView2.mMediaViewApi);
            MediaView.this.mMediaViewApi.initialize(MediaView.this.mConstructorParams, MediaView.this);
        }
    }

    public MediaView(Context context) {
        super(context);
        initializeSelf(new AdViewConstructorParams(context));
    }

    private void initializeSelf(AdViewConstructorParams adViewConstructorParams) {
        this.mConstructorParams = adViewConstructorParams;
        MediaViewApi mediaViewApiCreateMediaViewApi = DynamicLoaderFactory.makeLoader(adViewConstructorParams.getContext()).createMediaViewApi();
        this.mMediaViewApi = mediaViewApiCreateMediaViewApi;
        attachAdComponentViewApi(mediaViewApiCreateMediaViewApi);
        this.mMediaViewApi.initialize(adViewConstructorParams, this);
    }

    public void destroy() {
        this.mMediaViewApi.destroy();
    }

    @Override // com.facebook.ads.internal.api.AdNativeComponentView
    public View getAdContentsView() {
        return this.mMediaViewApi.getAdContentsView();
    }

    public int getMediaHeight() {
        return this.mMediaViewApi.getMediaHeight();
    }

    public MediaViewApi getMediaViewApi() {
        return this.mMediaViewApi;
    }

    public int getMediaWidth() {
        return this.mMediaViewApi.getMediaWidth();
    }

    public int getVideoDuration() {
        return this.mMediaViewApi.getVideoDuration();
    }

    public boolean isVideoContent() {
        return this.mMediaViewApi.isVideoContent();
    }

    public void repair(Throwable th2) {
        post(new a());
    }

    public void setListener(MediaViewListener mediaViewListener) {
        this.mMediaViewApi.setListener(mediaViewListener);
    }

    public void setVideoRenderer(MediaViewVideoRenderer mediaViewVideoRenderer) {
        this.mMediaViewApi.setVideoRenderer(mediaViewVideoRenderer);
    }

    public MediaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initializeSelf(new AdViewConstructorParams(context, attributeSet));
    }

    public MediaView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        initializeSelf(new AdViewConstructorParams(context, attributeSet, i10));
    }

    public MediaView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        initializeSelf(new AdViewConstructorParams(context, attributeSet, i10, i11));
    }
}
