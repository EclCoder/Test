package i5;

import com.inmobi.media.core.config.models.CrashConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f41038s = androidx.work.l.f("WorkSpec");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final p.a f41039t = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f41040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public androidx.work.u f41041b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f41042c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f41043d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public androidx.work.e f41044e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public androidx.work.e f41045f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f41046g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f41047h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f41048i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public androidx.work.c f41049j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f41050k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public androidx.work.a f41051l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f41052m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f41053n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f41054o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f41055p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f41056q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public androidx.work.p f41057r;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements p.a {
        a() {
        }

        @Override // p.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List apply(List list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            Iterator it = list.iterator();
            if (!it.hasNext()) {
                return arrayList;
            }
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f41058a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public androidx.work.u f41059b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f41059b != bVar.f41059b) {
                return false;
            }
            return this.f41058a.equals(bVar.f41058a);
        }

        public int hashCode() {
            return (this.f41058a.hashCode() * 31) + this.f41059b.hashCode();
        }
    }

    public p(String str, String str2) {
        this.f41041b = androidx.work.u.ENQUEUED;
        androidx.work.e eVar = androidx.work.e.f7833c;
        this.f41044e = eVar;
        this.f41045f = eVar;
        this.f41049j = androidx.work.c.f7812i;
        this.f41051l = androidx.work.a.EXPONENTIAL;
        this.f41052m = CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL;
        this.f41055p = -1L;
        this.f41057r = androidx.work.p.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        this.f41040a = str;
        this.f41042c = str2;
    }

    public long a() {
        if (c()) {
            return this.f41053n + Math.min(18000000L, this.f41051l == androidx.work.a.LINEAR ? this.f41052m * ((long) this.f41050k) : (long) Math.scalb(this.f41052m, this.f41050k - 1));
        }
        if (!d()) {
            long jCurrentTimeMillis = this.f41053n;
            if (jCurrentTimeMillis == 0) {
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            return jCurrentTimeMillis + this.f41046g;
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        long j10 = this.f41053n;
        long j11 = j10 == 0 ? jCurrentTimeMillis2 + this.f41046g : j10;
        long j12 = this.f41048i;
        long j13 = this.f41047h;
        if (j12 != j13) {
            return j11 + j13 + (j10 == 0 ? j12 * (-1) : 0L);
        }
        return j11 + (j10 != 0 ? j13 : 0L);
    }

    public boolean b() {
        return !androidx.work.c.f7812i.equals(this.f41049j);
    }

    public boolean c() {
        return this.f41041b == androidx.work.u.ENQUEUED && this.f41050k > 0;
    }

    public boolean d() {
        return this.f41047h != 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p.class == obj.getClass()) {
            p pVar = (p) obj;
            if (this.f41046g != pVar.f41046g || this.f41047h != pVar.f41047h || this.f41048i != pVar.f41048i || this.f41050k != pVar.f41050k || this.f41052m != pVar.f41052m || this.f41053n != pVar.f41053n || this.f41054o != pVar.f41054o || this.f41055p != pVar.f41055p || this.f41056q != pVar.f41056q || !this.f41040a.equals(pVar.f41040a) || this.f41041b != pVar.f41041b || !this.f41042c.equals(pVar.f41042c)) {
                return false;
            }
            String str = this.f41043d;
            if (str == null ? pVar.f41043d != null : !str.equals(pVar.f41043d)) {
                return false;
            }
            if (this.f41044e.equals(pVar.f41044e) && this.f41045f.equals(pVar.f41045f) && this.f41049j.equals(pVar.f41049j) && this.f41051l == pVar.f41051l && this.f41057r == pVar.f41057r) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = ((((this.f41040a.hashCode() * 31) + this.f41041b.hashCode()) * 31) + this.f41042c.hashCode()) * 31;
        String str = this.f41043d;
        int iHashCode2 = (((((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.f41044e.hashCode()) * 31) + this.f41045f.hashCode()) * 31;
        long j10 = this.f41046g;
        int i10 = (iHashCode2 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f41047h;
        int i11 = (i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        long j12 = this.f41048i;
        int iHashCode3 = (((((((i11 + ((int) (j12 ^ (j12 >>> 32)))) * 31) + this.f41049j.hashCode()) * 31) + this.f41050k) * 31) + this.f41051l.hashCode()) * 31;
        long j13 = this.f41052m;
        int i12 = (iHashCode3 + ((int) (j13 ^ (j13 >>> 32)))) * 31;
        long j14 = this.f41053n;
        int i13 = (i12 + ((int) (j14 ^ (j14 >>> 32)))) * 31;
        long j15 = this.f41054o;
        int i14 = (i13 + ((int) (j15 ^ (j15 >>> 32)))) * 31;
        long j16 = this.f41055p;
        return ((((i14 + ((int) (j16 ^ (j16 >>> 32)))) * 31) + (this.f41056q ? 1 : 0)) * 31) + this.f41057r.hashCode();
    }

    public String toString() {
        return "{WorkSpec: " + this.f41040a + "}";
    }

    public p(p pVar) {
        this.f41041b = androidx.work.u.ENQUEUED;
        androidx.work.e eVar = androidx.work.e.f7833c;
        this.f41044e = eVar;
        this.f41045f = eVar;
        this.f41049j = androidx.work.c.f7812i;
        this.f41051l = androidx.work.a.EXPONENTIAL;
        this.f41052m = CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL;
        this.f41055p = -1L;
        this.f41057r = androidx.work.p.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        this.f41040a = pVar.f41040a;
        this.f41042c = pVar.f41042c;
        this.f41041b = pVar.f41041b;
        this.f41043d = pVar.f41043d;
        this.f41044e = new androidx.work.e(pVar.f41044e);
        this.f41045f = new androidx.work.e(pVar.f41045f);
        this.f41046g = pVar.f41046g;
        this.f41047h = pVar.f41047h;
        this.f41048i = pVar.f41048i;
        this.f41049j = new androidx.work.c(pVar.f41049j);
        this.f41050k = pVar.f41050k;
        this.f41051l = pVar.f41051l;
        this.f41052m = pVar.f41052m;
        this.f41053n = pVar.f41053n;
        this.f41054o = pVar.f41054o;
        this.f41055p = pVar.f41055p;
        this.f41056q = pVar.f41056q;
        this.f41057r = pVar.f41057r;
    }
}
