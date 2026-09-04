package j9;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f42165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d9.e f42166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final k9.d f42167c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final x f42168d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Executor f42169e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final l9.a f42170f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final m9.a f42171g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final m9.a f42172h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final k9.c f42173i;

    public r(Context context, d9.e eVar, k9.d dVar, x xVar, Executor executor, l9.a aVar, m9.a aVar2, m9.a aVar3, k9.c cVar) {
        this.f42165a = context;
        this.f42166b = eVar;
        this.f42167c = dVar;
        this.f42168d = xVar;
        this.f42169e = executor;
        this.f42170f = aVar;
        this.f42171g = aVar2;
        this.f42172h = aVar3;
        this.f42173i = cVar;
    }

    public static /* synthetic */ Object b(r rVar, Iterable iterable, c9.p pVar, long j10) {
        rVar.f42167c.Y(iterable);
        rVar.f42167c.F(pVar, rVar.f42171g.a() + j10);
        return null;
    }

    public static /* synthetic */ Object c(r rVar) {
        rVar.f42173i.d();
        return null;
    }

    public static /* synthetic */ Object e(r rVar, Iterable iterable) {
        rVar.f42167c.z(iterable);
        return null;
    }

    public static /* synthetic */ Object f(r rVar, c9.p pVar, int i10) {
        rVar.f42168d.a(pVar, i10 + 1);
        return null;
    }

    public static /* synthetic */ Object g(r rVar, c9.p pVar, long j10) {
        rVar.f42167c.F(pVar, rVar.f42171g.a() + j10);
        return null;
    }

    public static /* synthetic */ Object h(r rVar, Map map) {
        rVar.getClass();
        for (Map.Entry entry : map.entrySet()) {
            rVar.f42173i.i(((Integer) entry.getValue()).intValue(), f9.c.b.INVALID_PAYLOD, (String) entry.getKey());
        }
        return null;
    }

    public static /* synthetic */ void i(final r rVar, final c9.p pVar, final int i10, Runnable runnable) {
        rVar.getClass();
        try {
            l9.a aVar = rVar.f42170f;
            final k9.d dVar = rVar.f42167c;
            Objects.requireNonNull(dVar);
            aVar.a(new l9.a.InterfaceC0670a() { // from class: j9.i
                @Override // l9.a.InterfaceC0670a
                public final Object execute() {
                    return Integer.valueOf(dVar.y());
                }
            });
            if (rVar.k()) {
                rVar.l(pVar, i10);
            } else {
                rVar.f42170f.a(new l9.a.InterfaceC0670a() { // from class: j9.j
                    @Override // l9.a.InterfaceC0670a
                    public final Object execute() {
                        return r.f(this.f42146a, pVar, i10);
                    }
                });
            }
        } catch (SynchronizationException unused) {
            rVar.f42168d.a(pVar, i10 + 1);
        } finally {
            runnable.run();
        }
    }

    public c9.i j(d9.m mVar) {
        l9.a aVar = this.f42170f;
        final k9.c cVar = this.f42173i;
        Objects.requireNonNull(cVar);
        return mVar.b(c9.i.a().i(this.f42171g.a()).o(this.f42172h.a()).n("GDT_CLIENT_METRICS").h(new c9.h(a9.b.b("proto"), ((f9.a) aVar.a(new l9.a.InterfaceC0670a() { // from class: j9.h
            @Override // l9.a.InterfaceC0670a
            public final Object execute() {
                return cVar.h();
            }
        })).f())).d());
    }

    boolean k() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f42165a.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public d9.g l(final c9.p pVar, int i10) {
        d9.g gVarA;
        d9.m mVar = this.f42166b.get(pVar.b());
        d9.g gVarE = d9.g.e(0L);
        final long j10 = 0;
        while (((Boolean) this.f42170f.a(new l9.a.InterfaceC0670a() { // from class: j9.k
            @Override // l9.a.InterfaceC0670a
            public final Object execute() {
                return Boolean.valueOf(this.f42149a.f42167c.r0(pVar));
            }
        })).booleanValue()) {
            final Iterable iterable = (Iterable) this.f42170f.a(new l9.a.InterfaceC0670a() { // from class: j9.l
                @Override // l9.a.InterfaceC0670a
                public final Object execute() {
                    return this.f42151a.f42167c.T(pVar);
                }
            });
            if (!iterable.iterator().hasNext()) {
                return gVarE;
            }
            if (mVar == null) {
                g9.a.b("Uploader", "Unknown backend for %s, deleting event batch for it...", pVar);
                gVarA = d9.g.a();
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((k9.k) it.next()).b());
                }
                if (pVar.e()) {
                    arrayList.add(j(mVar));
                }
                gVarA = mVar.a(d9.f.a().b(arrayList).c(pVar.c()).a());
            }
            gVarE = gVarA;
            if (gVarE.c() == d9.g.a.TRANSIENT_ERROR) {
                final c9.p pVar2 = pVar;
                this.f42170f.a(new l9.a.InterfaceC0670a() { // from class: j9.m
                    @Override // l9.a.InterfaceC0670a
                    public final Object execute() {
                        return r.b(this.f42153a, iterable, pVar2, j10);
                    }
                });
                this.f42168d.b(pVar2, i10 + 1, true);
                return gVarE;
            }
            c9.p pVar3 = pVar;
            this.f42170f.a(new l9.a.InterfaceC0670a() { // from class: j9.n
                @Override // l9.a.InterfaceC0670a
                public final Object execute() {
                    return r.e(this.f42157a, iterable);
                }
            });
            if (gVarE.c() == d9.g.a.OK) {
                long jMax = Math.max(j10, gVarE.b());
                if (pVar3.e()) {
                    this.f42170f.a(new l9.a.InterfaceC0670a() { // from class: j9.o
                        @Override // l9.a.InterfaceC0670a
                        public final Object execute() {
                            return r.c(this.f42159a);
                        }
                    });
                }
                j10 = jMax;
            } else if (gVarE.c() == d9.g.a.INVALID_PAYLOAD) {
                final HashMap map = new HashMap();
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    String strN = ((k9.k) it2.next()).b().n();
                    if (map.containsKey(strN)) {
                        map.put(strN, Integer.valueOf(((Integer) map.get(strN)).intValue() + 1));
                    } else {
                        map.put(strN, 1);
                    }
                }
                this.f42170f.a(new l9.a.InterfaceC0670a() { // from class: j9.p
                    @Override // l9.a.InterfaceC0670a
                    public final Object execute() {
                        return r.h(this.f42160a, map);
                    }
                });
            }
            pVar = pVar3;
        }
        final c9.p pVar4 = pVar;
        this.f42170f.a(new l9.a.InterfaceC0670a() { // from class: j9.q
            @Override // l9.a.InterfaceC0670a
            public final Object execute() {
                return r.g(this.f42162a, pVar4, j10);
            }
        });
        return gVarE;
    }

    public void m(final c9.p pVar, final int i10, final Runnable runnable) {
        this.f42169e.execute(new Runnable() { // from class: j9.g
            @Override // java.lang.Runnable
            public final void run() {
                r.i(this.f42140a, pVar, i10, runnable);
            }
        });
    }
}
