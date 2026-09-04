package ld;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f44363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final kd.i f44364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f44365c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a f44366d = new a(false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a f44367e = new a(true);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final k f44368f = new k(128);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicMarkableReference f44369g = new AtomicMarkableReference(null, false);

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final AtomicMarkableReference f44370a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AtomicReference f44371b = new AtomicReference(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f44372c;

        public a(boolean z10) {
            this.f44372c = z10;
            this.f44370a = new AtomicMarkableReference(new e(64, z10 ? 8192 : UserVerificationMethods.USER_VERIFY_ALL), false);
        }

        public static /* synthetic */ void a(a aVar) throws Throwable {
            aVar.f44371b.set(null);
            aVar.d();
        }

        private void c() {
            Runnable runnable = new Runnable() { // from class: ld.n
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    o.a.a(this.f44362a);
                }
            };
            if (androidx.lifecycle.b.a(this.f44371b, null, runnable)) {
                o.this.f44364b.f43180b.e(runnable);
            }
        }

        private void d() throws Throwable {
            Map mapA;
            synchronized (this) {
                try {
                    if (this.f44370a.isMarked()) {
                        mapA = ((e) this.f44370a.getReference()).a();
                        AtomicMarkableReference atomicMarkableReference = this.f44370a;
                        atomicMarkableReference.set((e) atomicMarkableReference.getReference(), false);
                    } else {
                        mapA = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (mapA != null) {
                o.this.f44363a.r(o.this.f44365c, mapA, this.f44372c);
            }
        }

        public Map b() {
            return ((e) this.f44370a.getReference()).a();
        }

        public boolean e(String str, String str2) {
            synchronized (this) {
                try {
                    if (!((e) this.f44370a.getReference()).d(str, str2)) {
                        return false;
                    }
                    AtomicMarkableReference atomicMarkableReference = this.f44370a;
                    atomicMarkableReference.set((e) atomicMarkableReference.getReference(), true);
                    c();
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public o(String str, pd.j jVar, kd.i iVar) {
        this.f44365c = str;
        this.f44363a = new g(jVar);
        this.f44364b = iVar;
    }

    public static /* synthetic */ void b(o oVar, String str, Map map, List list) throws Throwable {
        if (oVar.i() != null) {
            oVar.f44363a.t(str, oVar.i());
        }
        if (!map.isEmpty()) {
            oVar.f44363a.q(str, map);
        }
        if (list.isEmpty()) {
            return;
        }
        oVar.f44363a.s(str, list);
    }

    public static o j(String str, pd.j jVar, kd.i iVar) {
        g gVar = new g(jVar);
        o oVar = new o(str, jVar, iVar);
        ((e) oVar.f44366d.f44370a.getReference()).e(gVar.i(str, false));
        ((e) oVar.f44367e.f44370a.getReference()).e(gVar.i(str, true));
        oVar.f44369g.set(gVar.k(str), false);
        oVar.f44368f.c(gVar.j(str));
        return oVar;
    }

    public static String k(String str, pd.j jVar) {
        return new g(jVar).k(str);
    }

    public Map f(Map map) {
        if (map.isEmpty()) {
            return this.f44366d.b();
        }
        HashMap map2 = new HashMap(this.f44366d.b());
        int i10 = 0;
        for (Map.Entry entry : map.entrySet()) {
            String strC = e.c((String) entry.getKey(), UserVerificationMethods.USER_VERIFY_ALL);
            if (map2.size() < 64 || map2.containsKey(strC)) {
                map2.put(strC, e.c((String) entry.getValue(), UserVerificationMethods.USER_VERIFY_ALL));
            } else {
                i10++;
            }
        }
        if (i10 > 0) {
            gd.g.f().k("Ignored " + i10 + " keys when adding event specific keys. Maximum allowable: " + UserVerificationMethods.USER_VERIFY_ALL);
        }
        return Collections.unmodifiableMap(map2);
    }

    public Map g() {
        return this.f44367e.b();
    }

    public List h() {
        return this.f44368f.a();
    }

    public String i() {
        return (String) this.f44369g.getReference();
    }

    public boolean l(String str, String str2) {
        return this.f44366d.e(str, str2);
    }

    public boolean m(String str, String str2) {
        return this.f44367e.e(str, str2);
    }

    public void n(final String str) {
        synchronized (this.f44365c) {
            this.f44365c = str;
            final Map mapB = this.f44366d.b();
            final List listB = this.f44368f.b();
            this.f44364b.f43180b.e(new Runnable() { // from class: ld.l
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    o.b(this.f44356a, str, mapB, listB);
                }
            });
        }
    }

    public boolean o(List list) {
        synchronized (this.f44368f) {
            try {
                if (!this.f44368f.c(list)) {
                    return false;
                }
                final List listB = this.f44368f.b();
                this.f44364b.f43180b.e(new Runnable() { // from class: ld.m
                    @Override // java.lang.Runnable
                    public final void run() throws Throwable {
                        o oVar = this.f44360a;
                        oVar.f44363a.s(oVar.f44365c, listB);
                    }
                });
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
