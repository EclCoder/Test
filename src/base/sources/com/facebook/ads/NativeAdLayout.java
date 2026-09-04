package com.facebook.ads;

import android.content.Context;
import android.util.AttributeSet;
import com.facebook.ads.internal.api.AdComponentFrameLayout;
import com.facebook.ads.internal.api.NativeAdLayoutApi;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class NativeAdLayout extends AdComponentFrameLayout {
    private NativeAdLayoutApi mNativeAdLayoutApi;

    public NativeAdLayout(Context context) {
        super(context);
        initializeSelf(context);
    }

    private void initializeSelf(Context context) {
        NativeAdLayoutApi nativeAdLayoutApiCreateNativeAdLayoutApi = DynamicLoaderFactory.makeLoader(context).createNativeAdLayoutApi();
        this.mNativeAdLayoutApi = nativeAdLayoutApiCreateNativeAdLayoutApi;
        attachAdComponentViewApi(nativeAdLayoutApiCreateNativeAdLayoutApi);
        this.mNativeAdLayoutApi.initialize(this);
    }

    public NativeAdLayoutApi getNativeAdLayoutApi() {
        return this.mNativeAdLayoutApi;
    }

    public void setMaxWidth(int i10) {
        this.mNativeAdLayoutApi.setMaxWidth(i10);
    }

    public void setMinWidth(int i10) {
        this.mNativeAdLayoutApi.setMinWidth(i10);
    }

    public NativeAdLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initializeSelf(context);
    }

    public NativeAdLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        initializeSelf(context);
    }

    public NativeAdLayout(Context context, NativeAdLayoutApi nativeAdLayoutApi) {
        super(context);
        this.mNativeAdLayoutApi = nativeAdLayoutApi;
        attachAdComponentViewApi(nativeAdLayoutApi);
        this.mNativeAdLayoutApi.initialize(this);
    }
}
