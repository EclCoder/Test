package t1;

import android.view.Surface;
import androidx.media3.common.PlaybackException;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public interface x {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f53033b = new a().e();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final String f53034c = w1.c0.s0(0);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final n f53035a;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static final int[] f53036b = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 31, 20, 21, 22, 23, 24, 25, 33, 26, 34, 35, 27, 28, 29, 30, 32};

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final n.b f53037a = new n.b();

            public a a(int i10) {
                this.f53037a.a(i10);
                return this;
            }

            public a b(b bVar) {
                this.f53037a.b(bVar.f53035a);
                return this;
            }

            public a c(int... iArr) {
                this.f53037a.c(iArr);
                return this;
            }

            public a d(int i10, boolean z10) {
                this.f53037a.d(i10, z10);
                return this;
            }

            public b e() {
                return new b(this.f53037a.e());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                return this.f53035a.equals(((b) obj).f53035a);
            }
            return false;
        }

        public int hashCode() {
            return this.f53035a.hashCode();
        }

        private b(n nVar) {
            this.f53035a = nVar;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final n f53038a;

        public c(n nVar) {
            this.f53038a = nVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                return this.f53038a.equals(((c) obj).f53038a);
            }
            return false;
        }

        public int hashCode() {
            return this.f53038a.hashCode();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface d {
        default void onCues(List list) {
        }

        void onPlayerError(PlaybackException playbackException);

        default void onPositionDiscontinuity(int i10) {
        }

        default void onCues(v1.b bVar) {
        }

        default void onPositionDiscontinuity(e eVar, e eVar2, int i10) {
        }

        default void onRenderedFirstFrame() {
        }

        default void onAudioAttributesChanged(t1.b bVar) {
        }

        default void onAudioSessionIdChanged(int i10) {
        }

        default void onAvailableCommandsChanged(b bVar) {
        }

        default void onDeviceInfoChanged(j jVar) {
        }

        default void onIsLoadingChanged(boolean z10) {
        }

        default void onIsPlayingChanged(boolean z10) {
        }

        default void onLoadingChanged(boolean z10) {
        }

        default void onMaxSeekToPreviousPositionChanged(long j10) {
        }

        default void onMediaMetadataChanged(t tVar) {
        }

        default void onMetadata(u uVar) {
        }

        default void onPlaybackParametersChanged(w wVar) {
        }

        default void onPlaybackStateChanged(int i10) {
        }

        default void onPlaybackSuppressionReasonChanged(int i10) {
        }

        default void onPlayerErrorChanged(PlaybackException playbackException) {
        }

        default void onPlaylistMetadataChanged(t tVar) {
        }

        default void onRepeatModeChanged(int i10) {
        }

        default void onSeekBackIncrementChanged(long j10) {
        }

        default void onSeekForwardIncrementChanged(long j10) {
        }

        default void onShuffleModeEnabledChanged(boolean z10) {
        }

        default void onSkipSilenceEnabledChanged(boolean z10) {
        }

        default void onTrackSelectionParametersChanged(c0 c0Var) {
        }

        default void onTracksChanged(d0 d0Var) {
        }

        default void onVideoSizeChanged(g0 g0Var) {
        }

        default void onVolumeChanged(float f10) {
        }

        default void onDeviceVolumeChanged(int i10, boolean z10) {
        }

        default void onEvents(x xVar, c cVar) {
        }

        default void onMediaItemTransition(r rVar, int i10) {
        }

        default void onPlayWhenReadyChanged(boolean z10, int i10) {
        }

        default void onPlayerStateChanged(boolean z10, int i10) {
        }

        default void onSurfaceSizeChanged(int i10, int i11) {
        }

        default void onTimelineChanged(a0 a0Var, int i10) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class e {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        static final String f53039k = w1.c0.s0(0);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final String f53040l = w1.c0.s0(1);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        static final String f53041m = w1.c0.s0(2);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final String f53042n = w1.c0.s0(3);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        static final String f53043o = w1.c0.s0(4);

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private static final String f53044p = w1.c0.s0(5);

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private static final String f53045q = w1.c0.s0(6);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f53046a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f53047b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f53048c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final r f53049d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Object f53050e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f53051f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final long f53052g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final long f53053h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f53054i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f53055j;

        public e(Object obj, int i10, r rVar, Object obj2, int i11, long j10, long j11, int i12, int i13) {
            this.f53046a = obj;
            this.f53047b = i10;
            this.f53048c = i10;
            this.f53049d = rVar;
            this.f53050e = obj2;
            this.f53051f = i11;
            this.f53052g = j10;
            this.f53053h = j11;
            this.f53054i = i12;
            this.f53055j = i13;
        }

        public boolean a(e eVar) {
            return this.f53048c == eVar.f53048c && this.f53051f == eVar.f53051f && this.f53052g == eVar.f53052g && this.f53053h == eVar.f53053h && this.f53054i == eVar.f53054i && this.f53055j == eVar.f53055j && sc.l.a(this.f53049d, eVar.f53049d);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && e.class == obj.getClass()) {
                e eVar = (e) obj;
                if (a(eVar) && sc.l.a(this.f53046a, eVar.f53046a) && sc.l.a(this.f53050e, eVar.f53050e)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return sc.l.b(this.f53046a, Integer.valueOf(this.f53048c), this.f53049d, this.f53050e, Integer.valueOf(this.f53051f), Long.valueOf(this.f53052g), Long.valueOf(this.f53053h), Integer.valueOf(this.f53054i), Integer.valueOf(this.f53055j));
        }
    }

    void a();

    void b();

    long c();

    void clearVideoSurface();

    PlaybackException d();

    d0 e();

    boolean f();

    boolean g();

    int getBufferedPercentage();

    long getBufferedPosition();

    long getContentPosition();

    int getCurrentAdGroupIndex();

    int getCurrentAdIndexInAdGroup();

    int getCurrentPeriodIndex();

    long getCurrentPosition();

    a0 getCurrentTimeline();

    long getDuration();

    boolean getPlayWhenReady();

    int getPlaybackState();

    int getRepeatMode();

    boolean getShuffleModeEnabled();

    int h();

    g0 i();

    boolean isPlaying();

    boolean isPlayingAd();

    boolean j();

    boolean k();

    int l();

    boolean m();

    void n(d dVar);

    void o(int i10, int i11);

    void pause();

    void play();

    void q(d dVar);

    void seekTo(long j10);

    void setPlayWhenReady(boolean z10);

    void setVideoSurface(Surface surface);

    void setVolume(float f10);

    void stop();
}
