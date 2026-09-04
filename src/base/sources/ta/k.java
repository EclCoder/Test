package ta;

import com.google.android.exoplayer2.v0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import nb.z;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class k extends a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final int f53250o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final long f53251p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final g f53252q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f53253r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private volatile boolean f53254s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f53255t;

    public k(nb.j jVar, com.google.android.exoplayer2.upstream.a aVar, v0 v0Var, int i10, Object obj, long j10, long j11, long j12, long j13, long j14, int i11, long j15, g gVar) {
        super(jVar, aVar, v0Var, i10, obj, j10, j11, j12, j13, j14);
        this.f53250o = i11;
        this.f53251p = j15;
        this.f53252q = gVar;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.e
    public final void cancelLoad() {
        this.f53254s = true;
    }

    @Override // ta.n
    public long e() {
        return this.f53262j + ((long) this.f53250o);
    }

    @Override // ta.n
    public boolean f() {
        return this.f53255t;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.e
    public final void load() {
        if (this.f53253r == 0) {
            c cVarH = h();
            cVarH.b(this.f53251p);
            g gVar = this.f53252q;
            g.b bVarJ = j(cVarH);
            long j10 = this.f53184k;
            long j11 = C.TIME_UNSET;
            long j12 = j10 == C.TIME_UNSET ? -9223372036854775807L : j10 - this.f53251p;
            long j13 = this.f53185l;
            if (j13 != C.TIME_UNSET) {
                j11 = j13 - this.f53251p;
            }
            gVar.d(bVarJ, j12, j11);
        }
        try {
            com.google.android.exoplayer2.upstream.a aVarE = this.f53212b.e(this.f53253r);
            z zVar = this.f53219i;
            u9.e eVar = new u9.e(zVar, aVarE.f18785g, zVar.h(aVarE));
            do {
                try {
                    if (this.f53254s) {
                        break;
                    }
                } catch (Throwable th2) {
                    this.f53253r = eVar.getPosition() - this.f53212b.f18785g;
                    throw th2;
                }
            } while (this.f53252q.a(eVar));
            this.f53253r = eVar.getPosition() - this.f53212b.f18785g;
            nb.l.a(this.f53219i);
            this.f53255t = !this.f53254s;
        } catch (Throwable th3) {
            nb.l.a(this.f53219i);
            throw th3;
        }
    }

    protected g.b j(c cVar) {
        return cVar;
    }
}
