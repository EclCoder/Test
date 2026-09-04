package com.pgl.ssdk;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class o<A, B> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final A f35404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final B f35405b;

    public o(A a10, B b10) {
        this.f35404a = a10;
        this.f35405b = b10;
    }

    public static <A, B> o<A, B> a(A a10, B b10) {
        return new o<>(a10, b10);
    }

    public B b() {
        return this.f35405b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o.class != obj.getClass()) {
            return false;
        }
        o oVar = (o) obj;
        A a10 = this.f35404a;
        if (a10 == null) {
            if (oVar.f35404a != null) {
                return false;
            }
        } else if (!a10.equals(oVar.f35404a)) {
            return false;
        }
        B b10 = this.f35405b;
        if (b10 == null) {
            if (oVar.f35405b != null) {
                return false;
            }
        } else if (!b10.equals(oVar.f35405b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        A a10 = this.f35404a;
        int iHashCode = ((a10 == null ? 0 : a10.hashCode()) + 31) * 31;
        B b10 = this.f35405b;
        return iHashCode + (b10 != null ? b10.hashCode() : 0);
    }

    public A a() {
        return this.f35404a;
    }
}
