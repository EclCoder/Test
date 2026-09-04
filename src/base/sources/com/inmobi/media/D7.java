package com.inmobi.media;

import android.view.Surface;
import com.inmobi.media.videoPlayer.model.HtmlVideoPlaybackState;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class D7 extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ R7 f24641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3062j8 f24642b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D7(kl.f fVar, R7 r10, C3062j8 c3062j8) {
        super(2, fVar);
        this.f24641a = r10;
        this.f24642b = c3062j8;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new D7(fVar, this.f24641a, this.f24642b);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return new D7((kl.f) obj2, this.f24641a, this.f24642b).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Surface surface;
        ll.b.f();
        fl.s.b(obj);
        this.f24641a.f25599l.set(Bg.STATE_PREPARED);
        this.f24641a.f25603p.seekTo(0L);
        C3295s8 c3295s8 = this.f24641a.f25613z;
        if (!c3295s8.f27449g && (surface = c3295s8.f27447e) != null) {
            c3295s8.f27449g = true;
            c3295s8.f27444b.setVideoSurface(surface);
        }
        R7 r10 = this.f24641a;
        HtmlVideoPlaybackState htmlVideoPlaybackState = new HtmlVideoPlaybackState();
        htmlVideoPlaybackState.setDuration(this.f24642b.f26794b / 1000.0f);
        htmlVideoPlaybackState.setVideoUrl(this.f24642b.f26793a);
        htmlVideoPlaybackState.setLatency(kotlin.coroutines.jvm.internal.b.e(System.currentTimeMillis() - this.f24641a.f25608u));
        htmlVideoPlaybackState.setMuted(this.f24641a.f25612y.f25931e);
        EnumC3166n8[] enumC3166n8Arr = EnumC3166n8.f27041a;
        htmlVideoPlaybackState.setState("ready");
        htmlVideoPlaybackState.setTime(this.f24641a.f25603p.getCurrentPosition() / 1000.0f);
        r10.a(new C3088k8(htmlVideoPlaybackState, this.f24642b.f26795c));
        return fl.g0.f38750a;
    }
}
