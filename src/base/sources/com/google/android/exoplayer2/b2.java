package com.google.android.exoplayer2;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public interface b2 extends y1.b {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface a {
        void a();

        void b();
    }

    void disable();

    c2 getCapabilities();

    ob.w getMediaClock();

    String getName();

    int getState();

    ra.s getStream();

    int getTrackType();

    boolean hasReadStreamToEnd();

    void i(int i10, p9.s1 s1Var);

    boolean isCurrentStreamFinal();

    boolean isEnded();

    boolean isReady();

    long l();

    void maybeThrowStreamError();

    void n(v0[] v0VarArr, ra.s sVar, long j10, long j11);

    void o(o9.h0 h0Var, v0[] v0VarArr, ra.s sVar, long j10, boolean z10, boolean z11, long j11, long j12);

    void release();

    void render(long j10, long j11);

    void reset();

    void resetPosition(long j10);

    void setCurrentStreamFinal();

    void start();

    void stop();

    default void k(float f10, float f11) {
    }
}
