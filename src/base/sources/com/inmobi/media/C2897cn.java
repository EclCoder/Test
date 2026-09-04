package com.inmobi.media;

import androidx.media3.common.PlaybackException;
import java.util.List;

/* JADX INFO: renamed from: com.inmobi.media.cn, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C2897cn implements t1.x.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ em.q f26376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ L2 f26377b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f26378c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3322t9 f26379d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.exoplayer.o f26380e;

    public C2897cn(em.q qVar, L2 l10, String str, InterfaceC3322t9 interfaceC3322t9, androidx.media3.exoplayer.o oVar) {
        this.f26376a = qVar;
        this.f26377b = l10;
        this.f26378c = str;
        this.f26379d = interfaceC3322t9;
        this.f26380e = oVar;
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
    public /* bridge */ /* synthetic */ void onIsLoadingChanged(boolean z10) {
        super.onIsLoadingChanged(z10);
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
        if (i10 == 3) {
            if (this.f26376a.L()) {
                int iA = this.f26377b.a(this.f26378c);
                InterfaceC3322t9 interfaceC3322t9 = this.f26379d;
                if (interfaceC3322t9 != null) {
                    ((C3348u9) interfaceC3322t9).a("VideoLoaderHelper", "Media loaded successfully from URL with cache progress: " + iA);
                }
                T4.a(this.f26376a, new C3062j8(iA, this.f26380e.getDuration(), this.f26378c));
            }
            this.f26380e.n(this);
        }
    }

    @Override // t1.x.d
    public /* bridge */ /* synthetic */ void onPlaybackSuppressionReasonChanged(int i10) {
        super.onPlaybackSuppressionReasonChanged(i10);
    }

    @Override // t1.x.d
    public final void onPlayerError(PlaybackException error) {
        kotlin.jvm.internal.s.h(error, "error");
        InterfaceC3322t9 interfaceC3322t9 = this.f26379d;
        if (interfaceC3322t9 != null) {
            ((C3348u9) interfaceC3322t9).b("VideoLoaderHelper", "Failed to load URL (" + this.f26378c + "): " + error.getMessage());
        }
        if (this.f26376a.L()) {
            T4.a(this.f26376a, new C2985g8(Rm.NETWORK));
        }
        this.f26380e.n(this);
        this.f26380e.stop();
        this.f26380e.b();
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
    public /* bridge */ /* synthetic */ void onTracksChanged(t1.d0 d0Var) {
        super.onTracksChanged(d0Var);
    }

    @Override // t1.x.d
    public /* bridge */ /* synthetic */ void onVideoSizeChanged(t1.g0 g0Var) {
        super.onVideoSizeChanged(g0Var);
    }

    @Override // t1.x.d
    public /* bridge */ /* synthetic */ void onVolumeChanged(float f10) {
        super.onVolumeChanged(f10);
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
