package com.squareup.moshi;

import java.io.Closeable;
import java.io.Flushable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class o implements Closeable, Flushable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    String f35514e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f35515f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    boolean f35516g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    boolean f35517h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f35510a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int[] f35511b = new int[32];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String[] f35512c = new String[32];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int[] f35513d = new int[32];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    int f35518i = -1;

    o() {
    }

    public static o d0(xn.f fVar) {
        return new l(fVar);
    }

    public void F0(String str) {
        if (str.isEmpty()) {
            str = null;
        }
        this.f35514e = str;
    }

    public final void K0(boolean z10) {
        this.f35515f = z10;
    }

    public final void N0(boolean z10) {
        this.f35516g = z10;
    }

    public abstract o T0(double d10);

    public abstract o U0(long j10);

    public abstract o V0(Number number);

    public abstract o W0(String str);

    public abstract o X0(boolean z10);

    public abstract o c0();

    public abstract o d();

    final int g0() {
        int i10 = this.f35510a;
        if (i10 != 0) {
            return this.f35511b[i10 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public abstract o h();

    public final void i0() {
        int iG0 = g0();
        if (iG0 != 5 && iG0 != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        this.f35517h = true;
    }

    final boolean k() {
        int i10 = this.f35510a;
        int[] iArr = this.f35511b;
        if (i10 != iArr.length) {
            return false;
        }
        if (i10 == 256) {
            throw new JsonDataException("Nesting too deep at " + w() + ": circular reference?");
        }
        this.f35511b = Arrays.copyOf(iArr, iArr.length * 2);
        String[] strArr = this.f35512c;
        this.f35512c = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        int[] iArr2 = this.f35513d;
        this.f35513d = Arrays.copyOf(iArr2, iArr2.length * 2);
        if (!(this instanceof n)) {
            return true;
        }
        n nVar = (n) this;
        Object[] objArr = nVar.f35508j;
        nVar.f35508j = Arrays.copyOf(objArr, objArr.length * 2);
        return true;
    }

    public abstract o l();

    public abstract o m();

    final void m0(int i10) {
        int[] iArr = this.f35511b;
        int i11 = this.f35510a;
        this.f35510a = i11 + 1;
        iArr[i11] = i10;
    }

    final void p0(int i10) {
        this.f35511b[this.f35510a - 1] = i10;
    }

    public final String q() {
        String str = this.f35514e;
        return str != null ? str : "";
    }

    public final boolean r() {
        return this.f35516g;
    }

    public final boolean s() {
        return this.f35515f;
    }

    public abstract o t(String str);

    public final String w() {
        return j.a(this.f35510a, this.f35511b, this.f35512c, this.f35513d);
    }
}
