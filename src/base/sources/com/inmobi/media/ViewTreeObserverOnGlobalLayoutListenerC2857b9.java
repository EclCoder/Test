package com.inmobi.media;

import android.view.ViewTreeObserver;
import com.inmobi.ads.InMobiBanner;

/* JADX INFO: renamed from: com.inmobi.media.b9, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC2857b9 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InMobiBanner f26251a;

    public ViewTreeObserverOnGlobalLayoutListenerC2857b9(InMobiBanner inMobiBanner) {
        this.f26251a = inMobiBanner;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        C3348u9 c3348u9;
        try {
            InMobiBanner inMobiBanner = this.f26251a;
            inMobiBanner.f24378i = J3.b(inMobiBanner.getMeasuredWidth() / N5.b());
            InMobiBanner inMobiBanner2 = this.f26251a;
            inMobiBanner2.f24379j = J3.b(inMobiBanner2.getMeasuredHeight() / N5.b());
            if (InMobiBanner.access$hasValidSize(this.f26251a)) {
                this.f26251a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        } catch (Exception e10) {
            C2927e2 mAdManager = this.f26251a.getMAdManager();
            if (mAdManager == null || (c3348u9 = mAdManager.f25851f) == null) {
                return;
            }
            String strAccess$getTAG$cp = InMobiBanner.access$getTAG$cp();
            kotlin.jvm.internal.s.g(strAccess$getTAG$cp, "access$getTAG$cp(...)");
            c3348u9.a(strAccess$getTAG$cp, "InMobiBanner$1.onGlobalLayout() handler threw unexpected error: ", e10);
        }
    }
}
