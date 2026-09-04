package androidx.media3.exoplayer;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public interface g2 {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface a {
        void a(f2 f2Var);
    }

    static int d(int i10) {
        return i10 & 384;
    }

    static int e(int i10, int i11, int i12, int i13, int i14) {
        return v(i10, i11, i12, i13, i14, 0);
    }

    static int f(int i10) {
        return i10 & 32;
    }

    static int g(int i10) {
        return i10 & 24;
    }

    static int h(int i10) {
        return o(i10, 0, 0, 0);
    }

    static int j(int i10) {
        return i10 & 64;
    }

    static int m(int i10) {
        return i10 & 7;
    }

    static boolean n(int i10, boolean z10) {
        int iM = m(i10);
        if (iM != 4) {
            return z10 && iM == 3;
        }
        return true;
    }

    static int o(int i10, int i11, int i12, int i13) {
        return v(i10, i11, i12, 0, 128, i13);
    }

    static int r(int i10) {
        return i10 & 3584;
    }

    static int v(int i10, int i11, int i12, int i13, int i14, int i15) {
        return i10 | i11 | i12 | i13 | i14 | i15;
    }

    int a(t1.o oVar);

    void c();

    String getName();

    int getTrackType();

    int supportsMixedMimeTypeAdaptation();

    void y(a aVar);
}
