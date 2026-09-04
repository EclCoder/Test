package kotlin.jvm.internal;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class a implements n, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final Object f43574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Class f43575b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f43576c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f43577d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f43578e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f43579f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f43580g;

    public a(int i10, Object obj, Class cls, String str, String str2, int i11) {
        this.f43574a = obj;
        this.f43575b = cls;
        this.f43576c = str;
        this.f43577d = str2;
        this.f43578e = (i11 & 1) == 1;
        this.f43579f = i10;
        this.f43580g = i11 >> 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f43578e == aVar.f43578e && this.f43579f == aVar.f43579f && this.f43580g == aVar.f43580g && s.c(this.f43574a, aVar.f43574a) && s.c(this.f43575b, aVar.f43575b) && this.f43576c.equals(aVar.f43576c) && this.f43577d.equals(aVar.f43577d);
    }

    @Override // kotlin.jvm.internal.n
    public int getArity() {
        return this.f43579f;
    }

    public int hashCode() {
        Object obj = this.f43574a;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Class cls = this.f43575b;
        return ((((((((((iHashCode + (cls != null ? cls.hashCode() : 0)) * 31) + this.f43576c.hashCode()) * 31) + this.f43577d.hashCode()) * 31) + (this.f43578e ? 1231 : 1237)) * 31) + this.f43579f) * 31) + this.f43580g;
    }

    public String toString() {
        return l0.i(this);
    }
}
