package com.google.android.exoplayer2;

import android.os.Bundle;
import android.os.Looper;
import android.view.SurfaceView;
import android.view.TextureView;
import com.google.android.exoplayer2.x1;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public interface x1 {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b implements g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f18947b = new a().e();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final String f18948c = ob.r0.y0(0);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final g.a f18949d = new g.a() { // from class: o9.e0
            @Override // com.google.android.exoplayer2.g.a
            public final com.google.android.exoplayer2.g a(Bundle bundle) {
                return x1.b.d(bundle);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ob.o f18950a;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static final int[] f18951b = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 31, 20, 21, 22, 23, 24, 25, 33, 26, 34, 27, 28, 29, 30, 32};

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final ob.o.b f18952a = new ob.o.b();

            public a a(int i10) {
                this.f18952a.a(i10);
                return this;
            }

            public a b(b bVar) {
                this.f18952a.b(bVar.f18950a);
                return this;
            }

            public a c(int... iArr) {
                this.f18952a.c(iArr);
                return this;
            }

            public a d(int i10, boolean z10) {
                this.f18952a.d(i10, z10);
                return this;
            }

            public b e() {
                return new b(this.f18952a.e());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b d(Bundle bundle) {
            ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(f18948c);
            if (integerArrayList == null) {
                return f18947b;
            }
            a aVar = new a();
            for (int i10 = 0; i10 < integerArrayList.size(); i10++) {
                aVar.a(integerArrayList.get(i10).intValue());
            }
            return aVar.e();
        }

        public boolean c(int i10) {
            return this.f18950a.a(i10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                return this.f18950a.equals(((b) obj).f18950a);
            }
            return false;
        }

        public int hashCode() {
            return this.f18950a.hashCode();
        }

        @Override // com.google.android.exoplayer2.g
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int i10 = 0; i10 < this.f18950a.d(); i10++) {
                arrayList.add(Integer.valueOf(this.f18950a.c(i10)));
            }
            bundle.putIntegerArrayList(f18948c, arrayList);
            return bundle;
        }

        private b(ob.o oVar) {
            this.f18950a = oVar;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ob.o f18953a;

        public c(ob.o oVar) {
            this.f18953a = oVar;
        }

        public boolean a(int i10) {
            return this.f18953a.a(i10);
        }

        public boolean b(int... iArr) {
            return this.f18953a.b(iArr);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                return this.f18953a.equals(((c) obj).f18953a);
            }
            return false;
        }

        public int hashCode() {
            return this.f18953a.hashCode();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class e implements g {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final String f18954k = ob.r0.y0(0);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final String f18955l = ob.r0.y0(1);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final String f18956m = ob.r0.y0(2);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final String f18957n = ob.r0.y0(3);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final String f18958o = ob.r0.y0(4);

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private static final String f18959p = ob.r0.y0(5);

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private static final String f18960q = ob.r0.y0(6);

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final g.a f18961r = new g.a() { // from class: o9.f0
            @Override // com.google.android.exoplayer2.g.a
            public final com.google.android.exoplayer2.g a(Bundle bundle) {
                return x1.e.b(bundle);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f18962a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f18963b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f18964c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final y0 f18965d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Object f18966e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f18967f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final long f18968g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final long f18969h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f18970i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f18971j;

        public e(Object obj, int i10, y0 y0Var, Object obj2, int i11, long j10, long j11, int i12, int i13) {
            this.f18962a = obj;
            this.f18963b = i10;
            this.f18964c = i10;
            this.f18965d = y0Var;
            this.f18966e = obj2;
            this.f18967f = i11;
            this.f18968g = j10;
            this.f18969h = j11;
            this.f18970i = i12;
            this.f18971j = i13;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static e b(Bundle bundle) {
            int i10 = bundle.getInt(f18954k, 0);
            Bundle bundle2 = bundle.getBundle(f18955l);
            return new e(null, i10, bundle2 == null ? null : (y0) y0.f18980p.a(bundle2), null, bundle.getInt(f18956m, 0), bundle.getLong(f18957n, 0L), bundle.getLong(f18958o, 0L), bundle.getInt(f18959p, -1), bundle.getInt(f18960q, -1));
        }

        public Bundle c(boolean z10, boolean z11) {
            Bundle bundle = new Bundle();
            bundle.putInt(f18954k, z11 ? this.f18964c : 0);
            y0 y0Var = this.f18965d;
            if (y0Var != null && z10) {
                bundle.putBundle(f18955l, y0Var.toBundle());
            }
            bundle.putInt(f18956m, z11 ? this.f18967f : 0);
            bundle.putLong(f18957n, z10 ? this.f18968g : 0L);
            bundle.putLong(f18958o, z10 ? this.f18969h : 0L);
            bundle.putInt(f18959p, z10 ? this.f18970i : -1);
            bundle.putInt(f18960q, z10 ? this.f18971j : -1);
            return bundle;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && e.class == obj.getClass()) {
                e eVar = (e) obj;
                if (this.f18964c == eVar.f18964c && this.f18967f == eVar.f18967f && this.f18968g == eVar.f18968g && this.f18969h == eVar.f18969h && this.f18970i == eVar.f18970i && this.f18971j == eVar.f18971j && sc.l.a(this.f18962a, eVar.f18962a) && sc.l.a(this.f18966e, eVar.f18966e) && sc.l.a(this.f18965d, eVar.f18965d)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return sc.l.b(this.f18962a, Integer.valueOf(this.f18964c), this.f18965d, this.f18966e, Integer.valueOf(this.f18967f), Long.valueOf(this.f18968g), Long.valueOf(this.f18969h), Integer.valueOf(this.f18970i), Integer.valueOf(this.f18971j));
        }

        @Override // com.google.android.exoplayer2.g
        public Bundle toBundle() {
            return c(true, true);
        }
    }

    void A(y0 y0Var);

    long B();

    long C();

    long D();

    void E(d dVar);

    long F();

    void G();

    void H();

    z0 I();

    long J();

    void a();

    void b(w1 w1Var);

    long c();

    void clearVideoSurfaceView(SurfaceView surfaceView);

    void clearVideoTextureView(TextureView textureView);

    PlaybackException d();

    i2 e();

    boolean f();

    boolean g();

    long getContentPosition();

    int getCurrentAdGroupIndex();

    int getCurrentAdIndexInAdGroup();

    int getCurrentPeriodIndex();

    long getCurrentPosition();

    h2 getCurrentTimeline();

    long getDuration();

    boolean getPlayWhenReady();

    w1 getPlaybackParameters();

    int getPlaybackState();

    int getRepeatMode();

    boolean getShuffleModeEnabled();

    int h();

    pb.z i();

    boolean isPlaying();

    boolean isPlayingAd();

    boolean j();

    boolean k();

    int l();

    boolean m();

    void o(d dVar);

    void p(List list, boolean z10);

    void pause();

    void play();

    void q(lb.y yVar);

    void r();

    void release();

    bb.f s();

    void seekTo(int i10, long j10);

    void seekTo(long j10);

    void seekToDefaultPosition();

    void setPlayWhenReady(boolean z10);

    void setRepeatMode(int i10);

    void setShuffleModeEnabled(boolean z10);

    void setVideoSurfaceView(SurfaceView surfaceView);

    void setVideoTextureView(TextureView textureView);

    void setVolume(float f10);

    void stop();

    boolean t(int i10);

    Looper w();

    lb.y x();

    void y();

    b z();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface d {
        default void onRenderedFirstFrame() {
        }

        default void A(j jVar) {
        }

        default void B(z0 z0Var) {
        }

        default void C(lb.y yVar) {
        }

        default void D(PlaybackException playbackException) {
        }

        default void H(i2 i2Var) {
        }

        default void I(PlaybackException playbackException) {
        }

        default void n(w1 w1Var) {
        }

        default void onCues(List list) {
        }

        default void onIsLoadingChanged(boolean z10) {
        }

        default void onIsPlayingChanged(boolean z10) {
        }

        default void onLoadingChanged(boolean z10) {
        }

        default void onPlaybackStateChanged(int i10) {
        }

        default void onPlaybackSuppressionReasonChanged(int i10) {
        }

        default void onPositionDiscontinuity(int i10) {
        }

        default void onRepeatModeChanged(int i10) {
        }

        default void onShuffleModeEnabledChanged(boolean z10) {
        }

        default void onSkipSilenceEnabledChanged(boolean z10) {
        }

        default void onVolumeChanged(float f10) {
        }

        default void p(ha.a aVar) {
        }

        default void s(bb.f fVar) {
        }

        default void w(pb.z zVar) {
        }

        default void y(b bVar) {
        }

        default void L(x1 x1Var, c cVar) {
        }

        default void P(y0 y0Var, int i10) {
        }

        default void onDeviceVolumeChanged(int i10, boolean z10) {
        }

        default void onPlayWhenReadyChanged(boolean z10, int i10) {
        }

        default void onPlayerStateChanged(boolean z10, int i10) {
        }

        default void onSurfaceSizeChanged(int i10, int i11) {
        }

        default void z(h2 h2Var, int i10) {
        }

        default void x(e eVar, e eVar2, int i10) {
        }
    }
}
