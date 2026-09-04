package d9;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class c extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f36463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m9.a f36464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final m9.a f36465c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f36466d;

    c(Context context, m9.a aVar, m9.a aVar2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.f36463a = context;
        if (aVar == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.f36464b = aVar;
        if (aVar2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.f36465c = aVar2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f36466d = str;
    }

    @Override // d9.h
    public Context b() {
        return this.f36463a;
    }

    @Override // d9.h
    public String c() {
        return this.f36466d;
    }

    @Override // d9.h
    public m9.a d() {
        return this.f36465c;
    }

    @Override // d9.h
    public m9.a e() {
        return this.f36464b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (this.f36463a.equals(hVar.b()) && this.f36464b.equals(hVar.e()) && this.f36465c.equals(hVar.d()) && this.f36466d.equals(hVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.f36463a.hashCode() ^ 1000003) * 1000003) ^ this.f36464b.hashCode()) * 1000003) ^ this.f36465c.hashCode()) * 1000003) ^ this.f36466d.hashCode();
    }

    public String toString() {
        return "CreationContext{applicationContext=" + this.f36463a + ", wallClock=" + this.f36464b + ", monotonicClock=" + this.f36465c + ", backendName=" + this.f36466d + "}";
    }
}
