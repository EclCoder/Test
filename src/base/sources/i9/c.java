package i9;

import a9.j;
import c9.p;
import c9.u;
import d9.m;
import j9.x;
import java.util.concurrent.Executor;
import java.util.logging.Logger;
import qd.qPi.SVWsZyNSAChGIA;
import wc.XtO.NpmRNZ;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class c implements e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Logger f41231f = Logger.getLogger(u.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x f41232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f41233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d9.e f41234c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final k9.d f41235d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final l9.a f41236e;

    public c(Executor executor, d9.e eVar, x xVar, k9.d dVar, l9.a aVar) {
        this.f41233b = executor;
        this.f41234c = eVar;
        this.f41232a = xVar;
        this.f41235d = dVar;
        this.f41236e = aVar;
    }

    public static /* synthetic */ Object b(c cVar, p pVar, c9.i iVar) {
        cVar.f41235d.M0(pVar, iVar);
        cVar.f41232a.a(pVar, 1);
        return null;
    }

    @Override // i9.e
    public void a(final p pVar, final c9.i iVar, final j jVar) {
        this.f41233b.execute(new Runnable() { // from class: i9.a
            @Override // java.lang.Runnable
            public final void run() {
                c.c(this.f41224a, pVar, jVar, iVar);
            }
        });
    }

    public static /* synthetic */ void c(final c cVar, final p pVar, j jVar, c9.i iVar) {
        cVar.getClass();
        try {
            m mVar = cVar.f41234c.get(pVar.b());
            if (mVar == null) {
                String str = String.format(SVWsZyNSAChGIA.PZYhXqWtLWh, pVar.b());
                f41231f.warning(str);
                jVar.a(new IllegalArgumentException(str));
            } else {
                final c9.i iVarB = mVar.b(iVar);
                cVar.f41236e.a(new l9.a.InterfaceC0670a() { // from class: i9.b
                    @Override // l9.a.InterfaceC0670a
                    public final Object execute() {
                        return c.b(this.f41228a, pVar, iVarB);
                    }
                });
                jVar.a(null);
            }
        } catch (Exception e10) {
            f41231f.warning(NpmRNZ.LLbzDm + e10.getMessage());
            jVar.a(e10);
        }
    }
}
