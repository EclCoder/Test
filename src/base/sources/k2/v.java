package k2;

import androidx.media3.exoplayer.f2;
import androidx.media3.exoplayer.g2;
import t1.a0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f42964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private l2.d f42965b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface a {
        void a(f2 f2Var);

        void onTrackSelectionsInvalidated();
    }

    protected final l2.d b() {
        return (l2.d) w1.a.i(this.f42965b);
    }

    public abstract g2.a c();

    public void d(a aVar, l2.d dVar) {
        this.f42964a = aVar;
        this.f42965b = dVar;
    }

    protected final void e() {
        a aVar = this.f42964a;
        if (aVar != null) {
            aVar.onTrackSelectionsInvalidated();
        }
    }

    protected final void f(f2 f2Var) {
        a aVar = this.f42964a;
        if (aVar != null) {
            aVar.a(f2Var);
        }
    }

    public abstract boolean g();

    public abstract void h(Object obj);

    public void i() {
        this.f42964a = null;
        this.f42965b = null;
    }

    public abstract w j(g2[] g2VarArr, i2.v vVar, androidx.media3.exoplayer.source.r.b bVar, a0 a0Var);

    public abstract void k(t1.b bVar);
}
