package com.facebook.ads.internal.api;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public interface AdComponentView {
    void addView(View view);

    void addView(View view, int i10);

    void addView(View view, int i10, int i11);

    void addView(View view, int i10, ViewGroup.LayoutParams layoutParams);

    void addView(View view, ViewGroup.LayoutParams layoutParams);

    void onWindowFocusChanged(boolean z10);

    void setLayoutParams(ViewGroup.LayoutParams layoutParams);
}
