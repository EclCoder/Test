package androidx.media3.exoplayer;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public interface f2 extends d2.b {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface a {
        void a();

        void b();
    }

    void A(h2 h2Var, t1.o[] oVarArr, i2.q qVar, long j10, boolean z10, boolean z11, long j11, long j12, androidx.media3.exoplayer.source.r.b bVar);

    void disable();

    g2 getCapabilities();

    j1 getMediaClock();

    String getName();

    int getState();

    i2.q getStream();

    int getTrackType();

    boolean hasReadStreamToEnd();

    boolean isCurrentStreamFinal();

    boolean isEnded();

    boolean isReady();

    long l();

    void maybeThrowStreamError();

    void p(t1.a0 a0Var);

    void release();

    void render(long j10, long j11);

    void reset();

    void resetPosition(long j10);

    void setCurrentStreamFinal();

    void start();

    void stop();

    void t(int i10, c2.x1 x1Var, w1.d dVar);

    default long w(long j10, long j11) {
        return 10000L;
    }

    void x(t1.o[] oVarArr, i2.q qVar, long j10, long j11, androidx.media3.exoplayer.source.r.b bVar);

    default void b() {
    }

    default void k(float f10, float f11) {
    }
}
