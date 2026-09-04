package com.inmobi.media;

import android.content.res.ColorStateList;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class H6 {
    public static final void a(ProgressBar progressBar, Og progressConfig, float f10) {
        kotlin.jvm.internal.s.h(progressBar, "<this>");
        kotlin.jvm.internal.s.h(progressConfig, "progressConfig");
        progressBar.setProgressTintList(ColorStateList.valueOf(D3.a(progressConfig.f25420c)));
        progressBar.setProgressBackgroundTintList(ColorStateList.valueOf(D3.a(progressConfig.f25421d)));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, (int) (progressConfig.f25422e * f10));
        layoutParams.addRule(12);
        progressBar.setLayoutParams(layoutParams);
    }
}
