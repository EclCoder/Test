package ca;

import com.google.android.exoplayer2.v0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f9825c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f9826d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f9827e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final v0 f9828f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f9829g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long[] f9830h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long[] f9831i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f9832j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final p[] f9833k;

    public o(int i10, int i11, long j10, long j11, long j12, v0 v0Var, int i12, p[] pVarArr, int i13, long[] jArr, long[] jArr2) {
        this.f9823a = i10;
        this.f9824b = i11;
        this.f9825c = j10;
        this.f9826d = j11;
        this.f9827e = j12;
        this.f9828f = v0Var;
        this.f9829g = i12;
        this.f9833k = pVarArr;
        this.f9832j = i13;
        this.f9830h = jArr;
        this.f9831i = jArr2;
    }

    public p a(int i10) {
        p[] pVarArr = this.f9833k;
        if (pVarArr == null) {
            return null;
        }
        return pVarArr[i10];
    }
}
