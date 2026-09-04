package ta;

import com.google.android.exoplayer2.v0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import nb.z;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class m extends f {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final g f53258j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private g.b f53259k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f53260l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private volatile boolean f53261m;

    public m(nb.j jVar, com.google.android.exoplayer2.upstream.a aVar, v0 v0Var, int i10, Object obj, g gVar) {
        super(jVar, aVar, 2, v0Var, i10, obj, C.TIME_UNSET, C.TIME_UNSET);
        this.f53258j = gVar;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.e
    public void cancelLoad() {
        this.f53261m = true;
    }

    public void e(g.b bVar) {
        this.f53259k = bVar;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.e
    public void load() {
        if (this.f53260l == 0) {
            this.f53258j.d(this.f53259k, C.TIME_UNSET, C.TIME_UNSET);
        }
        try {
            com.google.android.exoplayer2.upstream.a aVarE = this.f53212b.e(this.f53260l);
            z zVar = this.f53219i;
            u9.e eVar = new u9.e(zVar, aVarE.f18785g, zVar.h(aVarE));
            while (!this.f53261m && this.f53258j.a(eVar)) {
                try {
                } catch (Throwable th2) {
                    this.f53260l = eVar.getPosition() - this.f53212b.f18785g;
                    throw th2;
                }
            }
            this.f53260l = eVar.getPosition() - this.f53212b.f18785g;
            nb.l.a(this.f53219i);
        } catch (Throwable th3) {
            nb.l.a(this.f53219i);
            throw th3;
        }
    }
}
