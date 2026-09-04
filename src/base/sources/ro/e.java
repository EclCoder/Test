package ro;

import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f51425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j f51426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f51427c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f51428d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f51429e;

    public e(String str, int i10, j jVar) {
        ip.a.h(str, "Scheme name");
        ip.a.a(i10 > 0 && i10 <= 65535, "Port is invalid");
        ip.a.h(jVar, "Socket factory");
        this.f51425a = str.toLowerCase(Locale.ENGLISH);
        this.f51427c = i10;
        if (jVar instanceof f) {
            this.f51428d = true;
            this.f51426b = jVar;
        } else if (jVar instanceof b) {
            this.f51428d = true;
            this.f51426b = new g((b) jVar);
        } else {
            this.f51428d = false;
            this.f51426b = jVar;
        }
    }

    public final int a() {
        return this.f51427c;
    }

    public final String b() {
        return this.f51425a;
    }

    public final boolean c() {
        return this.f51428d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (this.f51425a.equals(eVar.f51425a) && this.f51427c == eVar.f51427c && this.f51428d == eVar.f51428d) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ip.f.e(ip.f.d(ip.f.c(17, this.f51427c), this.f51425a), this.f51428d);
    }

    public final String toString() {
        if (this.f51429e == null) {
            this.f51429e = this.f51425a + ':' + Integer.toString(this.f51427c);
        }
        return this.f51429e;
    }

    public e(String str, l lVar, int i10) {
        ip.a.h(str, "Scheme name");
        ip.a.h(lVar, "Socket factory");
        ip.a.a(i10 > 0 && i10 <= 65535, "Port is invalid");
        this.f51425a = str.toLowerCase(Locale.ENGLISH);
        if (lVar instanceof c) {
            this.f51426b = new h((c) lVar);
            this.f51428d = true;
        } else {
            this.f51426b = new k(lVar);
            this.f51428d = false;
        }
        this.f51427c = i10;
    }
}
