package lb;

import com.google.android.exoplayer2.b2;
import com.google.android.exoplayer2.c2;
import com.google.android.exoplayer2.h2;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f44104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private nb.d f44105b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface a {
        void a(b2 b2Var);

        void onTrackSelectionsInvalidated();
    }

    protected final nb.d b() {
        return (nb.d) ob.a.i(this.f44105b);
    }

    public abstract y c();

    public abstract c2.a d();

    public void e(a aVar, nb.d dVar) {
        this.f44104a = aVar;
        this.f44105b = dVar;
    }

    protected final void f() {
        a aVar = this.f44104a;
        if (aVar != null) {
            aVar.onTrackSelectionsInvalidated();
        }
    }

    protected final void g(b2 b2Var) {
        a aVar = this.f44104a;
        if (aVar != null) {
            aVar.a(b2Var);
        }
    }

    public abstract boolean h();

    public abstract void i(Object obj);

    public void j() {
        this.f44104a = null;
        this.f44105b = null;
    }

    public abstract b0 k(c2[] c2VarArr, ra.x xVar, com.google.android.exoplayer2.source.p.b bVar, h2 h2Var);

    public abstract void l(com.google.android.exoplayer2.audio.a aVar);

    public abstract void m(y yVar);
}
