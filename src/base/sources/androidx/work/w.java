package androidx.work;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private UUID f8012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private i5.p f8013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Set f8014c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static abstract class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        i5.p f8017c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Class f8019e;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f8015a = false;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Set f8018d = new HashSet();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        UUID f8016b = UUID.randomUUID();

        a(Class cls) {
            this.f8019e = cls;
            this.f8017c = new i5.p(this.f8016b.toString(), cls.getName());
            a(cls.getName());
        }

        public final a a(String str) {
            this.f8018d.add(str);
            return d();
        }

        public final w b() {
            w wVarC = c();
            c cVar = this.f8017c.f41049j;
            boolean z10 = cVar.e() || cVar.f() || cVar.g() || cVar.h();
            if (this.f8017c.f41056q && z10) {
                throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
            }
            this.f8016b = UUID.randomUUID();
            i5.p pVar = new i5.p(this.f8017c);
            this.f8017c = pVar;
            pVar.f41040a = this.f8016b.toString();
            return wVarC;
        }

        abstract w c();

        abstract a d();

        public final a e(c cVar) {
            this.f8017c.f41049j = cVar;
            return d();
        }

        public final a f(e eVar) {
            this.f8017c.f41044e = eVar;
            return d();
        }
    }

    protected w(UUID uuid, i5.p pVar, Set set) {
        this.f8012a = uuid;
        this.f8013b = pVar;
        this.f8014c = set;
    }

    public String a() {
        return this.f8012a.toString();
    }

    public Set b() {
        return this.f8014c;
    }

    public i5.p c() {
        return this.f8013b;
    }
}
