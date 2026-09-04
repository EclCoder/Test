package com.squareup.moshi;

import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import xn.f0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class i implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f35469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int[] f35470b = new int[32];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String[] f35471c = new String[32];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int[] f35472d = new int[32];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    boolean f35473e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f35474f;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final String[] f35475a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final f0 f35476b;

        private a(String[] strArr, f0 f0Var) {
            this.f35475a = strArr;
            this.f35476b = f0Var;
        }

        public static a a(String... strArr) {
            try {
                xn.h[] hVarArr = new xn.h[strArr.length];
                xn.e eVar = new xn.e();
                for (int i10 = 0; i10 < strArr.length; i10++) {
                    l.d1(eVar, strArr[i10]);
                    eVar.readByte();
                    hVarArr[i10] = eVar.B0();
                }
                return new a((String[]) strArr.clone(), f0.r(hVarArr));
            } catch (IOException e10) {
                throw new AssertionError(e10);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public enum b {
        BEGIN_ARRAY,
        END_ARRAY,
        BEGIN_OBJECT,
        END_OBJECT,
        NAME,
        STRING,
        NUMBER,
        BOOLEAN,
        NULL,
        END_DOCUMENT
    }

    i() {
    }

    public static i m0(xn.g gVar) {
        return new k(gVar);
    }

    public abstract void F0();

    final void K0(int i10) {
        int i11 = this.f35469a;
        int[] iArr = this.f35470b;
        if (i11 == iArr.length) {
            if (i11 == 256) {
                throw new JsonDataException("Nesting too deep at " + w());
            }
            this.f35470b = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f35471c;
            this.f35471c = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f35472d;
            this.f35472d = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f35470b;
        int i12 = this.f35469a;
        this.f35469a = i12 + 1;
        iArr3[i12] = i10;
    }

    public abstract int N0(a aVar);

    public abstract int T0(a aVar);

    public final void U0(boolean z10) {
        this.f35474f = z10;
    }

    public final void V0(boolean z10) {
        this.f35473e = z10;
    }

    public abstract void W0();

    public abstract void X0();

    final JsonEncodingException Y0(String str) throws JsonEncodingException {
        throw new JsonEncodingException(str + " at path " + w());
    }

    final JsonDataException Z0(Object obj, Object obj2) {
        if (obj == null) {
            return new JsonDataException("Expected " + obj2 + " but was null at path " + w());
        }
        return new JsonDataException("Expected " + obj2 + " but was " + obj + ", a " + obj.getClass().getName() + ", at path " + w());
    }

    public abstract int c0();

    public abstract void d();

    public abstract long d0();

    public abstract Object g0();

    public abstract void h();

    public abstract String i0();

    public abstract void k();

    public abstract void l();

    public final boolean m() {
        return this.f35474f;
    }

    public abstract b p0();

    public abstract boolean q();

    public final boolean r() {
        return this.f35473e;
    }

    public abstract boolean s();

    public abstract double t();

    public final String w() {
        return j.a(this.f35469a, this.f35470b, this.f35471c, this.f35472d);
    }
}
