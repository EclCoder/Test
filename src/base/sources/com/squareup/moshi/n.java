package com.squareup.moshi;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
final class n extends o {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    Object[] f35508j = new Object[32];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f35509k;

    n() {
        m0(6);
    }

    private n Y0(Object obj) {
        String str;
        Object objPut;
        int iG0 = g0();
        int i10 = this.f35510a;
        if (i10 == 1) {
            if (iG0 != 6) {
                throw new IllegalStateException("JSON must have only one top-level value.");
            }
            this.f35511b[i10 - 1] = 7;
            this.f35508j[i10 - 1] = obj;
            return this;
        }
        if (iG0 != 3 || (str = this.f35509k) == null) {
            if (iG0 == 1) {
                ((List) this.f35508j[i10 - 1]).add(obj);
                return this;
            }
            if (iG0 == 9) {
                throw new IllegalStateException("Sink from valueSink() was not closed");
            }
            throw new IllegalStateException("Nesting problem.");
        }
        if ((obj == null && !this.f35516g) || (objPut = ((Map) this.f35508j[i10 - 1]).put(str, obj)) == null) {
            this.f35509k = null;
            return this;
        }
        throw new IllegalArgumentException("Map key '" + this.f35509k + "' has multiple values at path " + w() + ": " + objPut + " and " + obj);
    }

    @Override // com.squareup.moshi.o
    public o T0(double d10) {
        if (!this.f35515f && (Double.isNaN(d10) || d10 == Double.NEGATIVE_INFINITY || d10 == Double.POSITIVE_INFINITY)) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d10);
        }
        if (this.f35517h) {
            this.f35517h = false;
            return t(Double.toString(d10));
        }
        Y0(Double.valueOf(d10));
        int[] iArr = this.f35513d;
        int i10 = this.f35510a - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    @Override // com.squareup.moshi.o
    public o U0(long j10) {
        if (this.f35517h) {
            this.f35517h = false;
            return t(Long.toString(j10));
        }
        Y0(Long.valueOf(j10));
        int[] iArr = this.f35513d;
        int i10 = this.f35510a - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    @Override // com.squareup.moshi.o
    public o V0(Number number) {
        if ((number instanceof Byte) || (number instanceof Short) || (number instanceof Integer) || (number instanceof Long)) {
            return U0(number.longValue());
        }
        if ((number instanceof Float) || (number instanceof Double)) {
            return T0(number.doubleValue());
        }
        if (number == null) {
            return c0();
        }
        BigDecimal bigDecimal = number instanceof BigDecimal ? (BigDecimal) number : new BigDecimal(number.toString());
        if (this.f35517h) {
            this.f35517h = false;
            return t(bigDecimal.toString());
        }
        Y0(bigDecimal);
        int[] iArr = this.f35513d;
        int i10 = this.f35510a - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    @Override // com.squareup.moshi.o
    public o W0(String str) {
        if (this.f35517h) {
            this.f35517h = false;
            return t(str);
        }
        Y0(str);
        int[] iArr = this.f35513d;
        int i10 = this.f35510a - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    @Override // com.squareup.moshi.o
    public o X0(boolean z10) {
        if (this.f35517h) {
            throw new IllegalStateException("Boolean cannot be used as a map key in JSON at path " + w());
        }
        Y0(Boolean.valueOf(z10));
        int[] iArr = this.f35513d;
        int i10 = this.f35510a - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    public Object Z0() {
        int i10 = this.f35510a;
        if (i10 > 1 || (i10 == 1 && this.f35511b[i10 - 1] != 7)) {
            throw new IllegalStateException("Incomplete document");
        }
        return this.f35508j[0];
    }

    @Override // com.squareup.moshi.o
    public o c0() {
        if (this.f35517h) {
            throw new IllegalStateException("null cannot be used as a map key in JSON at path " + w());
        }
        Y0(null);
        int[] iArr = this.f35513d;
        int i10 = this.f35510a - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        int i10 = this.f35510a;
        if (i10 > 1 || (i10 == 1 && this.f35511b[i10 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f35510a = 0;
    }

    @Override // com.squareup.moshi.o
    public o d() {
        if (this.f35517h) {
            throw new IllegalStateException("Array cannot be used as a map key in JSON at path " + w());
        }
        int i10 = this.f35510a;
        int i11 = this.f35518i;
        if (i10 == i11 && this.f35511b[i10 - 1] == 1) {
            this.f35518i = ~i11;
            return this;
        }
        k();
        ArrayList arrayList = new ArrayList();
        Y0(arrayList);
        Object[] objArr = this.f35508j;
        int i12 = this.f35510a;
        objArr[i12] = arrayList;
        this.f35513d[i12] = 0;
        m0(1);
        return this;
    }

    @Override // java.io.Flushable
    public void flush() {
        if (this.f35510a == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
    }

    @Override // com.squareup.moshi.o
    public o h() {
        if (this.f35517h) {
            throw new IllegalStateException("Object cannot be used as a map key in JSON at path " + w());
        }
        int i10 = this.f35510a;
        int i11 = this.f35518i;
        if (i10 == i11 && this.f35511b[i10 - 1] == 3) {
            this.f35518i = ~i11;
            return this;
        }
        k();
        p pVar = new p();
        Y0(pVar);
        this.f35508j[this.f35510a] = pVar;
        m0(3);
        return this;
    }

    @Override // com.squareup.moshi.o
    public o l() {
        if (g0() != 1) {
            throw new IllegalStateException("Nesting problem.");
        }
        int i10 = this.f35510a;
        int i11 = this.f35518i;
        if (i10 == (~i11)) {
            this.f35518i = ~i11;
            return this;
        }
        int i12 = i10 - 1;
        this.f35510a = i12;
        this.f35508j[i12] = null;
        int[] iArr = this.f35513d;
        int i13 = i10 - 2;
        iArr[i13] = iArr[i13] + 1;
        return this;
    }

    @Override // com.squareup.moshi.o
    public o m() {
        if (g0() != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f35509k != null) {
            throw new IllegalStateException("Dangling name: " + this.f35509k);
        }
        int i10 = this.f35510a;
        int i11 = this.f35518i;
        if (i10 == (~i11)) {
            this.f35518i = ~i11;
            return this;
        }
        this.f35517h = false;
        int i12 = i10 - 1;
        this.f35510a = i12;
        this.f35508j[i12] = null;
        this.f35512c[i12] = null;
        int[] iArr = this.f35513d;
        int i13 = i10 - 2;
        iArr[i13] = iArr[i13] + 1;
        return this;
    }

    @Override // com.squareup.moshi.o
    public o t(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (this.f35510a == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        if (g0() != 3 || this.f35509k != null || this.f35517h) {
            throw new IllegalStateException("Nesting problem.");
        }
        this.f35509k = str;
        this.f35512c[this.f35510a - 1] = str;
        return this;
    }
}
