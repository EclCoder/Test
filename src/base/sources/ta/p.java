package ta;

import com.google.android.exoplayer2.v0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import u9.b0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class p extends a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final int f53264o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final v0 f53265p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f53266q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f53267r;

    public p(nb.j jVar, com.google.android.exoplayer2.upstream.a aVar, v0 v0Var, int i10, Object obj, long j10, long j11, long j12, int i11, v0 v0Var2) {
        super(jVar, aVar, v0Var, i10, obj, j10, j11, C.TIME_UNSET, C.TIME_UNSET, j12);
        this.f53264o = i11;
        this.f53265p = v0Var2;
    }

    @Override // ta.n
    public boolean f() {
        return this.f53267r;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.e
    public void load() {
        c cVarH = h();
        cVarH.b(0L);
        b0 b0VarTrack = cVarH.track(0, this.f53264o);
        b0VarTrack.e(this.f53265p);
        try {
            long jH = this.f53219i.h(this.f53212b.e(this.f53266q));
            if (jH != -1) {
                jH += this.f53266q;
            }
            u9.e eVar = new u9.e(this.f53219i, this.f53266q, jH);
            for (int iA = 0; iA != -1; iA = b0VarTrack.a(eVar, Integer.MAX_VALUE, true)) {
                this.f53266q += (long) iA;
            }
            b0VarTrack.f(this.f53217g, 1, (int) this.f53266q, 0, null);
            nb.l.a(this.f53219i);
            this.f53267r = true;
        } catch (Throwable th2) {
            nb.l.a(this.f53219i);
            throw th2;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.e
    public void cancelLoad() {
    }
}
