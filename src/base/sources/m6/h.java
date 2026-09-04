package m6;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f45278a = new LinkedHashMap(100, 0.75f, true);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f45279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f45280c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f45281d;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Object f45282a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f45283b;

        a(Object obj, int i10) {
            this.f45282a = obj;
            this.f45283b = i10;
        }
    }

    public h(long j10) {
        this.f45279b = j10;
        this.f45280c = j10;
    }

    private void g() {
        n(this.f45280c);
    }

    public void b() {
        n(0L);
    }

    public synchronized void c(float f10) {
        try {
            if (f10 < 0.0f) {
                throw new IllegalArgumentException("Multiplier must be >= 0");
            }
            this.f45280c = Math.round(this.f45279b * f10);
            g();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized Object h(Object obj) {
        a aVar;
        aVar = (a) this.f45278a.get(obj);
        return aVar != null ? aVar.f45282a : null;
    }

    public synchronized long i() {
        return this.f45280c;
    }

    protected int j(Object obj) {
        return 1;
    }

    public synchronized Object l(Object obj, Object obj2) {
        int iJ = j(obj2);
        long j10 = iJ;
        if (j10 >= this.f45280c) {
            k(obj, obj2);
            return null;
        }
        if (obj2 != null) {
            this.f45281d += j10;
        }
        a aVar = (a) this.f45278a.put(obj, obj2 == null ? null : new a(obj2, iJ));
        if (aVar != null) {
            this.f45281d -= (long) aVar.f45283b;
            if (!aVar.f45282a.equals(obj2)) {
                k(obj, aVar.f45282a);
            }
        }
        g();
        return aVar != null ? aVar.f45282a : null;
    }

    public synchronized Object m(Object obj) {
        a aVar = (a) this.f45278a.remove(obj);
        if (aVar == null) {
            return null;
        }
        this.f45281d -= (long) aVar.f45283b;
        return aVar.f45282a;
    }

    protected synchronized void n(long j10) {
        while (this.f45281d > j10) {
            Iterator it = this.f45278a.entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            a aVar = (a) entry.getValue();
            this.f45281d -= (long) aVar.f45283b;
            Object key = entry.getKey();
            it.remove();
            k(key, aVar.f45282a);
        }
    }

    protected void k(Object obj, Object obj2) {
    }
}
