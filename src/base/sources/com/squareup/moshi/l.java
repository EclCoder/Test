package com.squareup.moshi;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
final class l extends o {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String[] f35499m = new String[128];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final xn.f f35500j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f35501k = ":";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f35502l;

    static {
        for (int i10 = 0; i10 <= 31; i10++) {
            f35499m[i10] = String.format("\\u%04x", Integer.valueOf(i10));
        }
        String[] strArr = f35499m;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    l(xn.f fVar) {
        if (fVar == null) {
            throw new NullPointerException("sink == null");
        }
        this.f35500j = fVar;
        m0(6);
    }

    private void Y0() {
        int iG0 = g0();
        if (iG0 == 5) {
            this.f35500j.writeByte(44);
        } else if (iG0 != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        b1();
        p0(4);
    }

    private void Z0() {
        int iG0 = g0();
        int i10 = 2;
        if (iG0 == 1) {
            b1();
        } else if (iG0 == 2) {
            this.f35500j.writeByte(44);
            b1();
        } else if (iG0 == 4) {
            this.f35500j.N(this.f35501k);
            i10 = 5;
        } else {
            if (iG0 == 9) {
                throw new IllegalStateException("Sink from valueSink() was not closed");
            }
            i10 = 7;
            if (iG0 != 6) {
                if (iG0 != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (!this.f35515f) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
        }
        p0(i10);
    }

    private o a1(int i10, int i11, char c10) {
        int iG0 = g0();
        if (iG0 != i11 && iG0 != i10) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f35502l != null) {
            throw new IllegalStateException("Dangling name: " + this.f35502l);
        }
        int i12 = this.f35510a;
        int i13 = this.f35518i;
        if (i12 == (~i13)) {
            this.f35518i = ~i13;
            return this;
        }
        int i14 = i12 - 1;
        this.f35510a = i14;
        this.f35512c[i14] = null;
        int[] iArr = this.f35513d;
        int i15 = i12 - 2;
        iArr[i15] = iArr[i15] + 1;
        if (iG0 == i11) {
            b1();
        }
        this.f35500j.writeByte(c10);
        return this;
    }

    private void b1() {
        if (this.f35514e == null) {
            return;
        }
        this.f35500j.writeByte(10);
        int i10 = this.f35510a;
        for (int i11 = 1; i11 < i10; i11++) {
            this.f35500j.N(this.f35514e);
        }
    }

    private o c1(int i10, int i11, char c10) {
        int i12 = this.f35510a;
        int i13 = this.f35518i;
        if (i12 == i13) {
            int[] iArr = this.f35511b;
            if (iArr[i12 - 1] == i10 || iArr[i12 - 1] == i11) {
                this.f35518i = ~i13;
                return this;
            }
        }
        Z0();
        k();
        m0(i10);
        this.f35513d[this.f35510a - 1] = 0;
        this.f35500j.writeByte(c10);
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002b  */
    static void d1(xn.f fVar, String str) {
        String str2;
        String[] strArr = f35499m;
        fVar.writeByte(34);
        int length = str.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            char cCharAt = str.charAt(i11);
            if (cCharAt < 128) {
                str2 = strArr[cCharAt];
                if (str2 != null) {
                    if (i10 < i11) {
                        fVar.Q(str, i10, i11);
                    }
                    fVar.N(str2);
                    i10 = i11 + 1;
                }
            } else {
                if (cCharAt == 8232) {
                    str2 = "\\u2028";
                } else if (cCharAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i10 < i11) {
                    fVar.Q(str, i10, i11);
                }
                fVar.N(str2);
                i10 = i11 + 1;
            }
        }
        if (i10 < length) {
            fVar.Q(str, i10, length);
        }
        fVar.writeByte(34);
    }

    private void e1() {
        if (this.f35502l != null) {
            Y0();
            d1(this.f35500j, this.f35502l);
            this.f35502l = null;
        }
    }

    @Override // com.squareup.moshi.o
    public void F0(String str) {
        super.F0(str);
        this.f35501k = !str.isEmpty() ? ": " : ":";
    }

    @Override // com.squareup.moshi.o
    public o T0(double d10) {
        if (!this.f35515f && (Double.isNaN(d10) || Double.isInfinite(d10))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d10);
        }
        if (this.f35517h) {
            this.f35517h = false;
            return t(Double.toString(d10));
        }
        e1();
        Z0();
        this.f35500j.N(Double.toString(d10));
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
        e1();
        Z0();
        this.f35500j.N(Long.toString(j10));
        int[] iArr = this.f35513d;
        int i10 = this.f35510a - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    @Override // com.squareup.moshi.o
    public o V0(Number number) {
        if (number == null) {
            return c0();
        }
        String string = number.toString();
        if (!this.f35515f && (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN"))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
        }
        if (this.f35517h) {
            this.f35517h = false;
            return t(string);
        }
        e1();
        Z0();
        this.f35500j.N(string);
        int[] iArr = this.f35513d;
        int i10 = this.f35510a - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    @Override // com.squareup.moshi.o
    public o W0(String str) {
        if (str == null) {
            return c0();
        }
        if (this.f35517h) {
            this.f35517h = false;
            return t(str);
        }
        e1();
        Z0();
        d1(this.f35500j, str);
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
        e1();
        Z0();
        this.f35500j.N(z10 ? "true" : "false");
        int[] iArr = this.f35513d;
        int i10 = this.f35510a - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    @Override // com.squareup.moshi.o
    public o c0() {
        if (this.f35517h) {
            throw new IllegalStateException("null cannot be used as a map key in JSON at path " + w());
        }
        if (this.f35502l != null) {
            if (!this.f35516g) {
                this.f35502l = null;
                return this;
            }
            e1();
        }
        Z0();
        this.f35500j.N("null");
        int[] iArr = this.f35513d;
        int i10 = this.f35510a - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f35500j.close();
        int i10 = this.f35510a;
        if (i10 > 1 || (i10 == 1 && this.f35511b[i10 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f35510a = 0;
    }

    @Override // com.squareup.moshi.o
    public o d() {
        if (!this.f35517h) {
            e1();
            return c1(1, 2, '[');
        }
        throw new IllegalStateException("Array cannot be used as a map key in JSON at path " + w());
    }

    @Override // java.io.Flushable
    public void flush() {
        if (this.f35510a == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f35500j.flush();
    }

    @Override // com.squareup.moshi.o
    public o h() {
        if (!this.f35517h) {
            e1();
            return c1(3, 5, '{');
        }
        throw new IllegalStateException("Object cannot be used as a map key in JSON at path " + w());
    }

    @Override // com.squareup.moshi.o
    public o l() {
        return a1(1, 2, ']');
    }

    @Override // com.squareup.moshi.o
    public o m() {
        this.f35517h = false;
        return a1(3, 5, '}');
    }

    @Override // com.squareup.moshi.o
    public o t(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (this.f35510a == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        int iG0 = g0();
        if ((iG0 != 3 && iG0 != 5) || this.f35502l != null || this.f35517h) {
            throw new IllegalStateException("Nesting problem.");
        }
        this.f35502l = str;
        this.f35512c[this.f35510a - 1] = str;
        return this;
    }
}
