package com.google.android.exoplayer2;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class e implements x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final h2.d f16885a = new h2.d();

    protected e() {
    }

    private int M() {
        int repeatMode = getRepeatMode();
        if (repeatMode == 1) {
            return 0;
        }
        return repeatMode;
    }

    private void N(int i10) {
        O(l(), C.TIME_UNSET, i10, true);
    }

    private void P(long j10, int i10) {
        O(l(), j10, i10, false);
    }

    private void Q(int i10, int i11) {
        O(i10, C.TIME_UNSET, i11, false);
    }

    private void R(int i10) {
        int iK = K();
        if (iK == -1) {
            return;
        }
        if (iK == l()) {
            N(i10);
        } else {
            Q(iK, i10);
        }
    }

    private void S(long j10, int i10) {
        long currentPosition = getCurrentPosition() + j10;
        long duration = getDuration();
        if (duration != C.TIME_UNSET) {
            currentPosition = Math.min(currentPosition, duration);
        }
        P(Math.max(currentPosition, 0L), i10);
    }

    private void T(int i10) {
        int iL = L();
        if (iL == -1) {
            return;
        }
        if (iL == l()) {
            N(i10);
        } else {
            Q(iL, i10);
        }
    }

    @Override // com.google.android.exoplayer2.x1
    public final void A(y0 y0Var) {
        U(com.google.common.collect.c0.D(y0Var));
    }

    @Override // com.google.android.exoplayer2.x1
    public final long C() {
        h2 currentTimeline = getCurrentTimeline();
        return currentTimeline.u() ? C.TIME_UNSET : currentTimeline.r(l(), this.f16885a).f();
    }

    @Override // com.google.android.exoplayer2.x1
    public final void G() {
        S(D(), 12);
    }

    @Override // com.google.android.exoplayer2.x1
    public final void H() {
        S(-J(), 11);
    }

    public final int K() {
        h2 currentTimeline = getCurrentTimeline();
        if (currentTimeline.u()) {
            return -1;
        }
        return currentTimeline.i(l(), M(), getShuffleModeEnabled());
    }

    public final int L() {
        h2 currentTimeline = getCurrentTimeline();
        if (currentTimeline.u()) {
            return -1;
        }
        return currentTimeline.p(l(), M(), getShuffleModeEnabled());
    }

    public abstract void O(int i10, long j10, int i11, boolean z10);

    public final void U(List list) {
        p(list, true);
    }

    @Override // com.google.android.exoplayer2.x1
    public final boolean f() {
        return K() != -1;
    }

    @Override // com.google.android.exoplayer2.x1
    public final boolean g() {
        h2 currentTimeline = getCurrentTimeline();
        return !currentTimeline.u() && currentTimeline.r(l(), this.f16885a).f17026i;
    }

    @Override // com.google.android.exoplayer2.x1
    public final boolean isPlaying() {
        return getPlaybackState() == 3 && getPlayWhenReady() && h() == 0;
    }

    @Override // com.google.android.exoplayer2.x1
    public final boolean j() {
        return L() != -1;
    }

    @Override // com.google.android.exoplayer2.x1
    public final boolean k() {
        h2 currentTimeline = getCurrentTimeline();
        return !currentTimeline.u() && currentTimeline.r(l(), this.f16885a).f17025h;
    }

    @Override // com.google.android.exoplayer2.x1
    public final boolean m() {
        h2 currentTimeline = getCurrentTimeline();
        return !currentTimeline.u() && currentTimeline.r(l(), this.f16885a).h();
    }

    @Override // com.google.android.exoplayer2.x1
    public final void pause() {
        setPlayWhenReady(false);
    }

    @Override // com.google.android.exoplayer2.x1
    public final void play() {
        setPlayWhenReady(true);
    }

    @Override // com.google.android.exoplayer2.x1
    public final void r() {
        if (getCurrentTimeline().u() || isPlayingAd()) {
            return;
        }
        boolean zJ = j();
        if (m() && !k()) {
            if (zJ) {
                T(7);
            }
        } else if (!zJ || getCurrentPosition() > B()) {
            P(0L, 7);
        } else {
            T(7);
        }
    }

    @Override // com.google.android.exoplayer2.x1
    public final void seekTo(long j10) {
        P(j10, 5);
    }

    @Override // com.google.android.exoplayer2.x1
    public final void seekToDefaultPosition() {
        Q(l(), 4);
    }

    @Override // com.google.android.exoplayer2.x1
    public final boolean t(int i10) {
        return z().c(i10);
    }

    @Override // com.google.android.exoplayer2.x1
    public final void y() {
        if (getCurrentTimeline().u() || isPlayingAd()) {
            return;
        }
        if (f()) {
            R(9);
        } else if (m() && g()) {
            Q(l(), 9);
        }
    }

    @Override // com.google.android.exoplayer2.x1
    public final void seekTo(int i10, long j10) {
        O(i10, j10, 10, false);
    }
}
