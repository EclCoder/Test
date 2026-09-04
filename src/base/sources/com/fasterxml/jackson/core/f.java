package com.fasterxml.jackson.core;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected int f16192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected int f16193b;

    protected f() {
    }

    public final int a() {
        int i10 = this.f16193b;
        if (i10 < 0) {
            return 0;
        }
        return i10;
    }

    public abstract String b();

    public final int c() {
        return this.f16193b + 1;
    }

    public final boolean d() {
        return this.f16192a == 1;
    }

    public final boolean e() {
        return this.f16192a == 2;
    }

    public final boolean f() {
        return this.f16192a == 0;
    }

    public String g() {
        int i10 = this.f16192a;
        if (i10 == 0) {
            return "root";
        }
        if (i10 != 1) {
            return i10 != 2 ? "?" : "Object";
        }
        return "Array";
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        int i10 = this.f16192a;
        if (i10 == 0) {
            sb2.append("/");
        } else if (i10 != 1) {
            sb2.append('{');
            String strB = b();
            if (strB != null) {
                sb2.append('\"');
                com.fasterxml.jackson.core.io.a.b(sb2, strB);
                sb2.append('\"');
            } else {
                sb2.append('?');
            }
            sb2.append('}');
        } else {
            sb2.append('[');
            sb2.append(a());
            sb2.append(']');
        }
        return sb2.toString();
    }
}
