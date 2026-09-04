package com.google.android.exoplayer2;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public interface c2 {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface a {
        void a(b2 b2Var);
    }

    static int d(int i10) {
        return i10 & 384;
    }

    static int e(int i10, int i11, int i12, int i13, int i14) {
        return i10 | i11 | i12 | i13 | i14;
    }

    static int f(int i10) {
        return i10 & 32;
    }

    static int g(int i10) {
        return i10 & 24;
    }

    static int h(int i10) {
        return p(i10, 0, 0);
    }

    static int j(int i10) {
        return i10 & 64;
    }

    static int m(int i10) {
        return i10 & 7;
    }

    static int p(int i10, int i11, int i12) {
        return e(i10, i11, i12, 0, 128);
    }

    int a(v0 v0Var);

    void c();

    String getName();

    int getTrackType();

    void q(a aVar);

    int supportsMixedMimeTypeAdaptation();
}
