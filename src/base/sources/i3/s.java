package i3;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f40958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f40959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f40960c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f40961d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f40962e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t1.o f40963f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f40964g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long[] f40965h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long[] f40966i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f40967j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final t[] f40968k;

    public s(int i10, int i11, long j10, long j11, long j12, t1.o oVar, int i12, t[] tVarArr, int i13, long[] jArr, long[] jArr2) {
        this.f40958a = i10;
        this.f40959b = i11;
        this.f40960c = j10;
        this.f40961d = j11;
        this.f40962e = j12;
        this.f40963f = oVar;
        this.f40964g = i12;
        this.f40968k = tVarArr;
        this.f40967j = i13;
        this.f40965h = jArr;
        this.f40966i = jArr2;
    }

    public t a(int i10) {
        t[] tVarArr = this.f40968k;
        if (tVarArr == null) {
            return null;
        }
        return tVarArr[i10];
    }
}
