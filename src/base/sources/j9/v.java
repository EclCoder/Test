package j9;

import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f42185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k9.d f42186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final x f42187c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final l9.a f42188d;

    v(Executor executor, k9.d dVar, x xVar, l9.a aVar) {
        this.f42185a = executor;
        this.f42186b = dVar;
        this.f42187c = xVar;
        this.f42188d = aVar;
    }

    public static /* synthetic */ Object a(v vVar) {
        Iterator it = vVar.f42186b.G().iterator();
        while (it.hasNext()) {
            vVar.f42187c.a((c9.p) it.next(), 1);
        }
        return null;
    }

    public void c() {
        this.f42185a.execute(new Runnable() { // from class: j9.t
            @Override // java.lang.Runnable
            public final void run() {
                v vVar = this.f42183a;
                vVar.f42188d.a(new l9.a.InterfaceC0670a() { // from class: j9.u
                    @Override // l9.a.InterfaceC0670a
                    public final Object execute() {
                        return v.a(vVar);
                    }
                });
            }
        });
    }
}
