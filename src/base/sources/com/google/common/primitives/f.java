package com.google.common.primitives;

import java.io.Serializable;
import java.util.Arrays;
import sc.p;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class f implements Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final f f21919d = new f(new int[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f21920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final transient int f21921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f21922c;

    private f(int[] iArr) {
        this(iArr, 0, iArr.length);
    }

    public static f a(int[] iArr) {
        return iArr.length == 0 ? f21919d : new f(Arrays.copyOf(iArr, iArr.length));
    }

    private boolean g() {
        return this.f21921b > 0 || this.f21922c < this.f21920a.length;
    }

    public static f i() {
        return f21919d;
    }

    public int b(int i10) {
        p.m(i10, h());
        return this.f21920a[this.f21921b + i10];
    }

    public boolean d() {
        return this.f21922c == this.f21921b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (h() != fVar.h()) {
            return false;
        }
        for (int i10 = 0; i10 < h(); i10++) {
            if (b(i10) != fVar.b(i10)) {
                return false;
            }
        }
        return true;
    }

    public int h() {
        return this.f21922c - this.f21921b;
    }

    public int hashCode() {
        int i10 = 1;
        for (int i11 = this.f21921b; i11 < this.f21922c; i11++) {
            i10 = (i10 * 31) + g.i(this.f21920a[i11]);
        }
        return i10;
    }

    public int[] j() {
        return Arrays.copyOfRange(this.f21920a, this.f21921b, this.f21922c);
    }

    public f k() {
        return g() ? new f(j()) : this;
    }

    Object readResolve() {
        return d() ? f21919d : this;
    }

    public String toString() {
        if (d()) {
            return "[]";
        }
        StringBuilder sb2 = new StringBuilder(h() * 5);
        sb2.append('[');
        sb2.append(this.f21920a[this.f21921b]);
        int i10 = this.f21921b;
        while (true) {
            i10++;
            if (i10 >= this.f21922c) {
                sb2.append(']');
                return sb2.toString();
            }
            sb2.append(", ");
            sb2.append(this.f21920a[i10]);
        }
    }

    Object writeReplace() {
        return k();
    }

    private f(int[] iArr, int i10, int i11) {
        this.f21920a = iArr;
        this.f21921b = i10;
        this.f21922c = i11;
    }
}
