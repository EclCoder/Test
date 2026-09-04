package ta;

import com.google.android.exoplayer2.v0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a extends n {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f53184k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f53185l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private c f53186m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int[] f53187n;

    public a(nb.j jVar, com.google.android.exoplayer2.upstream.a aVar, v0 v0Var, int i10, Object obj, long j10, long j11, long j12, long j13, long j14) {
        super(jVar, aVar, v0Var, i10, obj, j10, j11, j14);
        this.f53184k = j12;
        this.f53185l = j13;
    }

    public final int g(int i10) {
        return ((int[]) ob.a.i(this.f53187n))[i10];
    }

    protected final c h() {
        return (c) ob.a.i(this.f53186m);
    }

    public void i(c cVar) {
        this.f53186m = cVar;
        this.f53187n = cVar.a();
    }
}
