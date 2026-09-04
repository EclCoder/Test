package com.inmobi.media;

import android.transition.TransitionManager;
import android.widget.RelativeLayout;
import com.inmobi.media.videoPlayer.model.VideoViewPosition;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Q7 extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ R7 f25541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ VideoViewPosition f25542b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q7(kl.f fVar, R7 r10, VideoViewPosition videoViewPosition) {
        super(2, fVar);
        this.f25541a = r10;
        this.f25542b = videoViewPosition;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new Q7(fVar, this.f25541a, this.f25542b);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return new Q7((kl.f) obj2, this.f25541a, this.f25542b).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ll.b.f();
        fl.s.b(obj);
        TransitionManager.beginDelayedTransition(this.f25541a.f25601n);
        this.f25541a.f25592e.setVideoViewPosition(this.f25542b);
        int iB = (int) (N5.b() * this.f25542b.getWidth());
        int iB2 = (int) (N5.b() * this.f25542b.getHeight());
        G1 g10 = this.f25541a.f25601n;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iB, iB2);
        if (this.f25541a.f25592e.getVideoViewPosition() != null) {
            layoutParams.setMargins((int) (N5.b() * this.f25542b.getX()), (int) (N5.b() * this.f25542b.getY()), 0, 0);
        }
        g10.setLayoutParams(layoutParams);
        if (this.f25541a.f25596i > 0 && this.f25541a.f25597j > 0) {
            R7 r10 = this.f25541a;
            G1 g11 = r10.f25601n;
            int i10 = r10.f25596i;
            int i11 = this.f25541a.f25597j;
            g11.getClass();
            if (i10 > 0 && i11 > 0) {
                g11.f24828a = i10 / i11;
                g11.requestLayout();
            }
        }
        this.f25541a.f25601n.requestLayout();
        return fl.g0.f38750a;
    }
}
