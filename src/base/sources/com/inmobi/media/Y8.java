package com.inmobi.media;

import android.view.ViewTreeObserver;
import com.inmobi.ads.InMobiAudio;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Y8 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InMobiAudio f26070a;

    public Y8(InMobiAudio inMobiAudio) {
        this.f26070a = inMobiAudio;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        try {
            InMobiAudio inMobiAudio = this.f26070a;
            inMobiAudio.f24368f = J3.b(inMobiAudio.getMeasuredWidth() / N5.b());
            InMobiAudio inMobiAudio2 = this.f26070a;
            inMobiAudio2.f24369g = J3.b(inMobiAudio2.getMeasuredHeight() / N5.b());
            if (InMobiAudio.access$hasValidSize(this.f26070a)) {
                this.f26070a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        } catch (Exception e10) {
            Sb.a((byte) 1, "InMobiAudio", "InMobiAudio$1.onGlobalLayout() handler threw unexpected error");
            e10.getMessage();
        }
    }
}
