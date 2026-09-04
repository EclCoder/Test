package t1;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class d implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final a0.c f52650a = new a0.c();

    protected d() {
    }

    private int u() {
        int repeatMode = getRepeatMode();
        if (repeatMode == 1) {
            return 0;
        }
        return repeatMode;
    }

    private void w(long j10, int i10) {
        v(l(), j10, i10, false);
    }

    @Override // t1.x
    public final void b() {
        o(0, Integer.MAX_VALUE);
    }

    @Override // t1.x
    public final boolean f() {
        return s() != -1;
    }

    @Override // t1.x
    public final boolean g() {
        a0 currentTimeline = getCurrentTimeline();
        return !currentTimeline.q() && currentTimeline.n(l(), this.f52650a).f52544i;
    }

    @Override // t1.x
    public final int getBufferedPercentage() {
        long bufferedPosition = getBufferedPosition();
        long duration = getDuration();
        if (bufferedPosition == C.TIME_UNSET || duration == C.TIME_UNSET) {
            return 0;
        }
        if (duration == 0) {
            return 100;
        }
        return w1.c0.o((int) ((bufferedPosition * 100) / duration), 0, 100);
    }

    @Override // t1.x
    public final boolean isPlaying() {
        return getPlaybackState() == 3 && getPlayWhenReady() && h() == 0;
    }

    @Override // t1.x
    public final boolean j() {
        return t() != -1;
    }

    @Override // t1.x
    public final boolean k() {
        a0 currentTimeline = getCurrentTimeline();
        return !currentTimeline.q() && currentTimeline.n(l(), this.f52650a).f52543h;
    }

    @Override // t1.x
    public final boolean m() {
        a0 currentTimeline = getCurrentTimeline();
        return !currentTimeline.q() && currentTimeline.n(l(), this.f52650a).f();
    }

    @Override // t1.x
    public final void pause() {
        setPlayWhenReady(false);
    }

    @Override // t1.x
    public final void play() {
        setPlayWhenReady(true);
    }

    public final long r() {
        a0 currentTimeline = getCurrentTimeline();
        return currentTimeline.q() ? C.TIME_UNSET : currentTimeline.n(l(), this.f52650a).d();
    }

    public final int s() {
        a0 currentTimeline = getCurrentTimeline();
        if (currentTimeline.q()) {
            return -1;
        }
        return currentTimeline.e(l(), u(), getShuffleModeEnabled());
    }

    @Override // t1.x
    public final void seekTo(long j10) {
        w(j10, 5);
    }

    public final int t() {
        a0 currentTimeline = getCurrentTimeline();
        if (currentTimeline.q()) {
            return -1;
        }
        return currentTimeline.l(l(), u(), getShuffleModeEnabled());
    }

    public abstract void v(int i10, long j10, int i11, boolean z10);
}
