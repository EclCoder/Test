package com.inmobi.media;

import androidx.media3.common.PlaybackException;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class J7 implements t1.x.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ R7 f25051a;

    public J7(R7 r10) {
        this.f25051a = r10;
    }

    @Override // t1.x.d
    public /* bridge */ /* synthetic */ void onAudioAttributesChanged(t1.b bVar) {
        super.onAudioAttributesChanged(bVar);
    }

    @Override // t1.x.d
    public /* bridge */ /* synthetic */ void onAudioSessionIdChanged(int i10) {
        super.onAudioSessionIdChanged(i10);
    }

    @Override // t1.x.d
    public /* bridge */ /* synthetic */ void onAvailableCommandsChanged(t1.x.b bVar) {
        super.onAvailableCommandsChanged(bVar);
    }

    @Override // t1.x.d
    @Deprecated
    public /* bridge */ /* synthetic */ void onCues(List list) {
        super.onCues(list);
    }

    @Override // t1.x.d
    public /* bridge */ /* synthetic */ void onDeviceInfoChanged(t1.j jVar) {
        super.onDeviceInfoChanged(jVar);
    }

    @Override // t1.x.d
    public /* bridge */ /* synthetic */ void onDeviceVolumeChanged(int i10, boolean z10) {
        super.onDeviceVolumeChanged(i10, z10);
    }

    @Override // t1.x.d
    public /* bridge */ /* synthetic */ void onEvents(t1.x xVar, t1.x.c cVar) {
        super.onEvents(xVar, cVar);
    }

    @Override // t1.x.d
    public final void onIsLoadingChanged(boolean z10) {
        super.onIsLoadingChanged(z10);
        if (z10) {
            this.f25051a.f25602o.setVisibility(0);
        } else {
            this.f25051a.f25602o.setVisibility(8);
        }
        if (this.f25051a.f25603p.getPlaybackState() == 3 && this.f25051a.f25603p.getBufferedPercentage() == 100) {
            this.f25051a.a(C2830a8.f26173a);
        }
    }

    @Override // t1.x.d
    public /* bridge */ /* synthetic */ void onIsPlayingChanged(boolean z10) {
        super.onIsPlayingChanged(z10);
    }

    @Override // t1.x.d
    @Deprecated
    public /* bridge */ /* synthetic */ void onLoadingChanged(boolean z10) {
        super.onLoadingChanged(z10);
    }

    @Override // t1.x.d
    public /* bridge */ /* synthetic */ void onMaxSeekToPreviousPositionChanged(long j10) {
        super.onMaxSeekToPreviousPositionChanged(j10);
    }

    @Override // t1.x.d
    public /* bridge */ /* synthetic */ void onMediaItemTransition(t1.r rVar, int i10) {
        super.onMediaItemTransition(rVar, i10);
    }

    @Override // t1.x.d
    public /* bridge */ /* synthetic */ void onMediaMetadataChanged(t1.t tVar) {
        super.onMediaMetadataChanged(tVar);
    }

    @Override // t1.x.d
    public /* bridge */ /* synthetic */ void onMetadata(t1.u uVar) {
        super.onMetadata(uVar);
    }

    @Override // t1.x.d
    public /* bridge */ /* synthetic */ void onPlayWhenReadyChanged(boolean z10, int i10) {
        super.onPlayWhenReadyChanged(z10, i10);
    }

    @Override // t1.x.d
    public /* bridge */ /* synthetic */ void onPlaybackParametersChanged(t1.w wVar) {
        super.onPlaybackParametersChanged(wVar);
    }

    @Override // t1.x.d
    public final void onPlaybackStateChanged(int i10) {
        super.onPlaybackStateChanged(i10);
        if (i10 == 4) {
            InterfaceC3322t9 interfaceC3322t9 = this.f25051a.f25589b;
            if (interfaceC3322t9 != null) {
                ((C3348u9) interfaceC3322t9).b("HtmlMediaPlayer", "Playback ended");
            }
            C3448y6 c3448y6 = this.f25051a.f25611x;
            if (c3448y6.f27917g != 2) {
                c3448y6.f27917g = 2;
                em.k.d(c3448y6.f27912b, em.c1.c().X0(), null, new C3345u6(c3448y6, c3448y6.f27911a.getDuration(), null), 2, null);
            }
        }
    }

    @Override // t1.x.d
    public /* bridge */ /* synthetic */ void onPlaybackSuppressionReasonChanged(int i10) {
        super.onPlaybackSuppressionReasonChanged(i10);
    }

    @Override // t1.x.d
    public final void onPlayerError(PlaybackException error) {
        kotlin.jvm.internal.s.h(error, "error");
        InterfaceC3322t9 interfaceC3322t9 = this.f25051a.f25589b;
        if (interfaceC3322t9 != null) {
            ((C3348u9) interfaceC3322t9).a("HtmlMediaPlayer", "Playback error: " + error.d(), error);
        }
        this.f25051a.f25599l.set(Bg.STATE_ERROR);
        R7 r10 = this.f25051a;
        int i10 = error.f4619a;
        String strD = error.d();
        kotlin.jvm.internal.s.g(strD, "getErrorCodeName(...)");
        r10.a(new C3140m8(strD));
        this.f25051a.f();
    }

    @Override // t1.x.d
    public /* bridge */ /* synthetic */ void onPlayerErrorChanged(PlaybackException playbackException) {
        super.onPlayerErrorChanged(playbackException);
    }

    @Override // t1.x.d
    @Deprecated
    public /* bridge */ /* synthetic */ void onPlayerStateChanged(boolean z10, int i10) {
        super.onPlayerStateChanged(z10, i10);
    }

    @Override // t1.x.d
    public /* bridge */ /* synthetic */ void onPlaylistMetadataChanged(t1.t tVar) {
        super.onPlaylistMetadataChanged(tVar);
    }

    @Override // t1.x.d
    @Deprecated
    public /* bridge */ /* synthetic */ void onPositionDiscontinuity(int i10) {
        super.onPositionDiscontinuity(i10);
    }

    @Override // t1.x.d
    public /* bridge */ /* synthetic */ void onRenderedFirstFrame() {
        super.onRenderedFirstFrame();
    }

    @Override // t1.x.d
    public /* bridge */ /* synthetic */ void onRepeatModeChanged(int i10) {
        super.onRepeatModeChanged(i10);
    }

    @Override // t1.x.d
    public /* bridge */ /* synthetic */ void onSeekBackIncrementChanged(long j10) {
        super.onSeekBackIncrementChanged(j10);
    }

    @Override // t1.x.d
    public /* bridge */ /* synthetic */ void onSeekForwardIncrementChanged(long j10) {
        super.onSeekForwardIncrementChanged(j10);
    }

    @Override // t1.x.d
    public /* bridge */ /* synthetic */ void onShuffleModeEnabledChanged(boolean z10) {
        super.onShuffleModeEnabledChanged(z10);
    }

    @Override // t1.x.d
    public /* bridge */ /* synthetic */ void onSkipSilenceEnabledChanged(boolean z10) {
        super.onSkipSilenceEnabledChanged(z10);
    }

    @Override // t1.x.d
    public /* bridge */ /* synthetic */ void onSurfaceSizeChanged(int i10, int i11) {
        super.onSurfaceSizeChanged(i10, i11);
    }

    @Override // t1.x.d
    public /* bridge */ /* synthetic */ void onTimelineChanged(t1.a0 a0Var, int i10) {
        super.onTimelineChanged(a0Var, i10);
    }

    @Override // t1.x.d
    public /* bridge */ /* synthetic */ void onTrackSelectionParametersChanged(t1.c0 c0Var) {
        super.onTrackSelectionParametersChanged(c0Var);
    }

    @Override // t1.x.d
    public final void onTracksChanged(t1.d0 tracks) {
        Object obj;
        kotlin.jvm.internal.s.h(tracks, "tracks");
        com.google.common.collect.c0 c0VarA = tracks.a();
        kotlin.jvm.internal.s.g(c0VarA, "getGroups(...)");
        int size = c0VarA.size();
        int i10 = 0;
        do {
            if (i10 >= size) {
                obj = null;
                break;
            } else {
                obj = c0VarA.get(i10);
                i10++;
            }
        } while (((t1.d0.a) obj).c() != 2);
        t1.d0.a aVar = (t1.d0.a) obj;
        if (aVar != null) {
            R7 r10 = this.f25051a;
            int i11 = aVar.a().f52572a;
            for (int i12 = 0; i12 < i11; i12++) {
                t1.o oVarA = aVar.a().a(i12);
                kotlin.jvm.internal.s.g(oVarA, "getFormat(...)");
                InterfaceC3322t9 interfaceC3322t9 = r10.f25589b;
                if (interfaceC3322t9 != null) {
                    ((C3348u9) interfaceC3322t9).b("HtmlMediaPlayer", "Metadata loaded: " + oVarA.f52763t + "x" + oVarA.f52764u + ", " + oVarA.f52757n);
                }
                r10.a(C3114l8.f26930a);
            }
        }
    }

    @Override // t1.x.d
    public final void onVideoSizeChanged(t1.g0 videoSize) {
        kotlin.jvm.internal.s.h(videoSize, "videoSize");
        InterfaceC3322t9 interfaceC3322t9 = this.f25051a.f25589b;
        if (interfaceC3322t9 != null) {
            ((C3348u9) interfaceC3322t9).b("HtmlMediaPlayer", "onVideoSizeChanged: width=" + videoSize.f52694a + ", height=" + videoSize.f52695b + ", ratio=" + videoSize.f52697d);
        }
        this.f25051a.f25596i = (int) (videoSize.f52694a * videoSize.f52697d);
        this.f25051a.f25597j = videoSize.f52695b;
        R7 r10 = this.f25051a;
        G1 g10 = r10.f25601n;
        int i10 = r10.f25596i;
        int i11 = this.f25051a.f25597j;
        g10.getClass();
        if (i10 > 0 && i11 > 0) {
            g10.f24828a = i10 / i11;
            g10.requestLayout();
        }
        this.f25051a.f25613z.f27446d.a(videoSize.f52694a, videoSize.f52695b);
    }

    @Override // t1.x.d
    public final void onVolumeChanged(float f10) {
        super.onVolumeChanged(f10);
        if (f10 == 0.0f || f10 == 1.0f) {
            return;
        }
        R7 r10 = this.f25051a;
        boolean z10 = r10.f25612y.f25931e;
        r10.a(new C3182no());
    }

    @Override // t1.x.d
    public /* bridge */ /* synthetic */ void onCues(v1.b bVar) {
        super.onCues(bVar);
    }

    @Override // t1.x.d
    public /* bridge */ /* synthetic */ void onPositionDiscontinuity(t1.x.e eVar, t1.x.e eVar2, int i10) {
        super.onPositionDiscontinuity(eVar, eVar2, i10);
    }
}
