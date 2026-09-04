package com.google.android.exoplayer2;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Pair;
import com.google.android.exoplayer2.h2;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class h2 implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h2 f16987a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f16988b = ob.r0.y0(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f16989c = ob.r0.y0(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f16990d = ob.r0.y0(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final g.a f16991e = new g.a() { // from class: o9.m0
        @Override // com.google.android.exoplayer2.g.a
        public final com.google.android.exoplayer2.g a(Bundle bundle) {
            return h2.b(bundle);
        }
    };

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends h2 {
        a() {
        }

        @Override // com.google.android.exoplayer2.h2
        public int f(Object obj) {
            return -1;
        }

        @Override // com.google.android.exoplayer2.h2
        public b k(int i10, b bVar, boolean z10) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.google.android.exoplayer2.h2
        public int m() {
            return 0;
        }

        @Override // com.google.android.exoplayer2.h2
        public Object q(int i10) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.google.android.exoplayer2.h2
        public d s(int i10, d dVar, long j10) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.google.android.exoplayer2.h2
        public int t() {
            return 0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b implements g {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final String f16992h = ob.r0.y0(0);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final String f16993i = ob.r0.y0(1);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final String f16994j = ob.r0.y0(2);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final String f16995k = ob.r0.y0(3);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final String f16996l = ob.r0.y0(4);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final g.a f16997m = new g.a() { // from class: o9.n0
            @Override // com.google.android.exoplayer2.g.a
            public final com.google.android.exoplayer2.g a(Bundle bundle) {
                return h2.b.c(bundle);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f16998a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f16999b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f17000c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f17001d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f17002e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f17003f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private sa.c f17004g = sa.c.f51554g;

        /* JADX INFO: Access modifiers changed from: private */
        public static b c(Bundle bundle) {
            int i10 = bundle.getInt(f16992h, 0);
            long j10 = bundle.getLong(f16993i, C.TIME_UNSET);
            long j11 = bundle.getLong(f16994j, 0L);
            boolean z10 = bundle.getBoolean(f16995k, false);
            Bundle bundle2 = bundle.getBundle(f16996l);
            sa.c cVar = bundle2 != null ? (sa.c) sa.c.f51560m.a(bundle2) : sa.c.f51554g;
            b bVar = new b();
            bVar.w(null, null, i10, j10, j11, cVar, z10);
            return bVar;
        }

        public int d(int i10) {
            return this.f17004g.c(i10).f51577b;
        }

        public long e(int i10, int i11) {
            sa.c.a aVarC = this.f17004g.c(i10);
            return aVarC.f51577b != -1 ? aVarC.f51581f[i11] : C.TIME_UNSET;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && b.class.equals(obj.getClass())) {
                b bVar = (b) obj;
                if (ob.r0.c(this.f16998a, bVar.f16998a) && ob.r0.c(this.f16999b, bVar.f16999b) && this.f17000c == bVar.f17000c && this.f17001d == bVar.f17001d && this.f17002e == bVar.f17002e && this.f17003f == bVar.f17003f && ob.r0.c(this.f17004g, bVar.f17004g)) {
                    return true;
                }
            }
            return false;
        }

        public int f() {
            return this.f17004g.f51562b;
        }

        public int g(long j10) {
            return this.f17004g.d(j10, this.f17001d);
        }

        public int h(long j10) {
            return this.f17004g.e(j10, this.f17001d);
        }

        public int hashCode() {
            Object obj = this.f16998a;
            int iHashCode = (Sdk$SDKError.b.AD_RESPONSE_TIMED_OUT_VALUE + (obj == null ? 0 : obj.hashCode())) * 31;
            Object obj2 = this.f16999b;
            int iHashCode2 = (((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.f17000c) * 31;
            long j10 = this.f17001d;
            int i10 = (iHashCode2 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
            long j11 = this.f17002e;
            return ((((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f17003f ? 1 : 0)) * 31) + this.f17004g.hashCode();
        }

        public long i(int i10) {
            return this.f17004g.c(i10).f51576a;
        }

        public long j() {
            return this.f17004g.f51563c;
        }

        public int k(int i10, int i11) {
            sa.c.a aVarC = this.f17004g.c(i10);
            if (aVarC.f51577b != -1) {
                return aVarC.f51580e[i11];
            }
            return 0;
        }

        public long l(int i10) {
            return this.f17004g.c(i10).f51582g;
        }

        public long m() {
            return this.f17001d;
        }

        public int n(int i10) {
            return this.f17004g.c(i10).f();
        }

        public int o(int i10, int i11) {
            return this.f17004g.c(i10).g(i11);
        }

        public long p() {
            return ob.r0.i1(this.f17002e);
        }

        public long q() {
            return this.f17002e;
        }

        public int r() {
            return this.f17004g.f51565e;
        }

        public boolean s(int i10) {
            return !this.f17004g.c(i10).h();
        }

        public boolean t(int i10) {
            return i10 == f() - 1 && this.f17004g.f(i10);
        }

        @Override // com.google.android.exoplayer2.g
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            int i10 = this.f17000c;
            if (i10 != 0) {
                bundle.putInt(f16992h, i10);
            }
            long j10 = this.f17001d;
            if (j10 != C.TIME_UNSET) {
                bundle.putLong(f16993i, j10);
            }
            long j11 = this.f17002e;
            if (j11 != 0) {
                bundle.putLong(f16994j, j11);
            }
            boolean z10 = this.f17003f;
            if (z10) {
                bundle.putBoolean(f16995k, z10);
            }
            if (!this.f17004g.equals(sa.c.f51554g)) {
                bundle.putBundle(f16996l, this.f17004g.toBundle());
            }
            return bundle;
        }

        public boolean u(int i10) {
            return this.f17004g.c(i10).f51583h;
        }

        public b v(Object obj, Object obj2, int i10, long j10, long j11) {
            return w(obj, obj2, i10, j10, j11, sa.c.f51554g, false);
        }

        public b w(Object obj, Object obj2, int i10, long j10, long j11, sa.c cVar, boolean z10) {
            this.f16998a = obj;
            this.f16999b = obj2;
            this.f17000c = i10;
            this.f17001d = j10;
            this.f17002e = j11;
            this.f17004g = cVar;
            this.f17003f = z10;
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class c extends h2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final com.google.common.collect.c0 f17005f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final com.google.common.collect.c0 f17006g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final int[] f17007h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final int[] f17008i;

        public c(com.google.common.collect.c0 c0Var, com.google.common.collect.c0 c0Var2, int[] iArr) {
            ob.a.a(c0Var.size() == iArr.length);
            this.f17005f = c0Var;
            this.f17006g = c0Var2;
            this.f17007h = iArr;
            this.f17008i = new int[iArr.length];
            for (int i10 = 0; i10 < iArr.length; i10++) {
                this.f17008i[iArr[i10]] = i10;
            }
        }

        @Override // com.google.android.exoplayer2.h2
        public int e(boolean z10) {
            if (u()) {
                return -1;
            }
            if (z10) {
                return this.f17007h[0];
            }
            return 0;
        }

        @Override // com.google.android.exoplayer2.h2
        public int f(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.android.exoplayer2.h2
        public int g(boolean z10) {
            if (u()) {
                return -1;
            }
            return z10 ? this.f17007h[t() - 1] : t() - 1;
        }

        @Override // com.google.android.exoplayer2.h2
        public int i(int i10, int i11, boolean z10) {
            if (i11 == 1) {
                return i10;
            }
            if (i10 != g(z10)) {
                return z10 ? this.f17007h[this.f17008i[i10] + 1] : i10 + 1;
            }
            if (i11 == 2) {
                return e(z10);
            }
            return -1;
        }

        @Override // com.google.android.exoplayer2.h2
        public b k(int i10, b bVar, boolean z10) {
            b bVar2 = (b) this.f17006g.get(i10);
            bVar.w(bVar2.f16998a, bVar2.f16999b, bVar2.f17000c, bVar2.f17001d, bVar2.f17002e, bVar2.f17004g, bVar2.f17003f);
            return bVar;
        }

        @Override // com.google.android.exoplayer2.h2
        public int m() {
            return this.f17006g.size();
        }

        @Override // com.google.android.exoplayer2.h2
        public int p(int i10, int i11, boolean z10) {
            if (i11 == 1) {
                return i10;
            }
            if (i10 != e(z10)) {
                return z10 ? this.f17007h[this.f17008i[i10] - 1] : i10 - 1;
            }
            if (i11 == 2) {
                return g(z10);
            }
            return -1;
        }

        @Override // com.google.android.exoplayer2.h2
        public Object q(int i10) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.android.exoplayer2.h2
        public d s(int i10, d dVar, long j10) {
            d dVar2 = (d) this.f17005f.get(i10);
            dVar.i(dVar2.f17018a, dVar2.f17020c, dVar2.f17021d, dVar2.f17022e, dVar2.f17023f, dVar2.f17024g, dVar2.f17025h, dVar2.f17026i, dVar2.f17028k, dVar2.f17030m, dVar2.f17031n, dVar2.f17032o, dVar2.f17033p, dVar2.f17034q);
            dVar.f17029l = dVar2.f17029l;
            return dVar;
        }

        @Override // com.google.android.exoplayer2.h2
        public int t() {
            return this.f17005f.size();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class d implements g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f17019b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f17021d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f17022e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f17023f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f17024g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f17025h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f17026i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f17027j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public y0.g f17028k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f17029l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public long f17030m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public long f17031n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f17032o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f17033p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public long f17034q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final Object f17009r = new Object();

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private static final Object f17010s = new Object();

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private static final y0 f17011t = new y0.c().d("com.google.android.exoplayer2.Timeline").g(Uri.EMPTY).a();

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private static final String f17012u = ob.r0.y0(1);

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private static final String f17013v = ob.r0.y0(2);

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private static final String f17014w = ob.r0.y0(3);

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private static final String f17015x = ob.r0.y0(4);

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private static final String f17016y = ob.r0.y0(5);

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private static final String f17017z = ob.r0.y0(6);
        private static final String A = ob.r0.y0(7);
        private static final String B = ob.r0.y0(8);
        private static final String C = ob.r0.y0(9);
        private static final String D = ob.r0.y0(10);
        private static final String E = ob.r0.y0(11);
        private static final String F = ob.r0.y0(12);
        private static final String G = ob.r0.y0(13);
        public static final g.a H = new g.a() { // from class: o9.o0
            @Override // com.google.android.exoplayer2.g.a
            public final com.google.android.exoplayer2.g a(Bundle bundle) {
                return h2.d.b(bundle);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f17018a = f17009r;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public y0 f17020c = f17011t;

        /* JADX INFO: Access modifiers changed from: private */
        public static d b(Bundle bundle) {
            Bundle bundle2 = bundle.getBundle(f17012u);
            y0 y0Var = bundle2 != null ? (y0) y0.f18980p.a(bundle2) : y0.f18973i;
            long j10 = bundle.getLong(f17013v, C.TIME_UNSET);
            long j11 = bundle.getLong(f17014w, C.TIME_UNSET);
            long j12 = bundle.getLong(f17015x, C.TIME_UNSET);
            boolean z10 = bundle.getBoolean(f17016y, false);
            boolean z11 = bundle.getBoolean(f17017z, false);
            Bundle bundle3 = bundle.getBundle(A);
            y0.g gVar = bundle3 != null ? (y0.g) y0.g.f19060l.a(bundle3) : null;
            boolean z12 = bundle.getBoolean(B, false);
            long j13 = bundle.getLong(C, 0L);
            long j14 = bundle.getLong(D, C.TIME_UNSET);
            int i10 = bundle.getInt(E, 0);
            int i11 = bundle.getInt(F, 0);
            long j15 = bundle.getLong(G, 0L);
            d dVar = new d();
            dVar.i(f17010s, y0Var, null, j10, j11, j12, z10, z11, gVar, j13, j14, i10, i11, j15);
            dVar.f17029l = z12;
            return dVar;
        }

        public long c() {
            return ob.r0.e0(this.f17024g);
        }

        public long d() {
            return ob.r0.i1(this.f17030m);
        }

        public long e() {
            return this.f17030m;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && d.class.equals(obj.getClass())) {
                d dVar = (d) obj;
                if (ob.r0.c(this.f17018a, dVar.f17018a) && ob.r0.c(this.f17020c, dVar.f17020c) && ob.r0.c(this.f17021d, dVar.f17021d) && ob.r0.c(this.f17028k, dVar.f17028k) && this.f17022e == dVar.f17022e && this.f17023f == dVar.f17023f && this.f17024g == dVar.f17024g && this.f17025h == dVar.f17025h && this.f17026i == dVar.f17026i && this.f17029l == dVar.f17029l && this.f17030m == dVar.f17030m && this.f17031n == dVar.f17031n && this.f17032o == dVar.f17032o && this.f17033p == dVar.f17033p && this.f17034q == dVar.f17034q) {
                    return true;
                }
            }
            return false;
        }

        public long f() {
            return ob.r0.i1(this.f17031n);
        }

        public long g() {
            return this.f17034q;
        }

        public boolean h() {
            ob.a.g(this.f17027j == (this.f17028k != null));
            return this.f17028k != null;
        }

        public int hashCode() {
            int iHashCode = (((Sdk$SDKError.b.AD_RESPONSE_TIMED_OUT_VALUE + this.f17018a.hashCode()) * 31) + this.f17020c.hashCode()) * 31;
            Object obj = this.f17021d;
            int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
            y0.g gVar = this.f17028k;
            int iHashCode3 = (iHashCode2 + (gVar != null ? gVar.hashCode() : 0)) * 31;
            long j10 = this.f17022e;
            int i10 = (iHashCode3 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
            long j11 = this.f17023f;
            int i11 = (i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
            long j12 = this.f17024g;
            int i12 = (((((((i11 + ((int) (j12 ^ (j12 >>> 32)))) * 31) + (this.f17025h ? 1 : 0)) * 31) + (this.f17026i ? 1 : 0)) * 31) + (this.f17029l ? 1 : 0)) * 31;
            long j13 = this.f17030m;
            int i13 = (i12 + ((int) (j13 ^ (j13 >>> 32)))) * 31;
            long j14 = this.f17031n;
            int i14 = (((((i13 + ((int) (j14 ^ (j14 >>> 32)))) * 31) + this.f17032o) * 31) + this.f17033p) * 31;
            long j15 = this.f17034q;
            return i14 + ((int) (j15 ^ (j15 >>> 32)));
        }

        public d i(Object obj, y0 y0Var, Object obj2, long j10, long j11, long j12, boolean z10, boolean z11, y0.g gVar, long j13, long j14, int i10, int i11, long j15) {
            y0.h hVar;
            this.f17018a = obj;
            this.f17020c = y0Var != null ? y0Var : f17011t;
            this.f17019b = (y0Var == null || (hVar = y0Var.f18982b) == null) ? null : hVar.f19087i;
            this.f17021d = obj2;
            this.f17022e = j10;
            this.f17023f = j11;
            this.f17024g = j12;
            this.f17025h = z10;
            this.f17026i = z11;
            this.f17027j = gVar != null;
            this.f17028k = gVar;
            this.f17030m = j13;
            this.f17031n = j14;
            this.f17032o = i10;
            this.f17033p = i11;
            this.f17034q = j15;
            this.f17029l = false;
            return this;
        }

        @Override // com.google.android.exoplayer2.g
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            if (!y0.f18973i.equals(this.f17020c)) {
                bundle.putBundle(f17012u, this.f17020c.toBundle());
            }
            long j10 = this.f17022e;
            if (j10 != C.TIME_UNSET) {
                bundle.putLong(f17013v, j10);
            }
            long j11 = this.f17023f;
            if (j11 != C.TIME_UNSET) {
                bundle.putLong(f17014w, j11);
            }
            long j12 = this.f17024g;
            if (j12 != C.TIME_UNSET) {
                bundle.putLong(f17015x, j12);
            }
            boolean z10 = this.f17025h;
            if (z10) {
                bundle.putBoolean(f17016y, z10);
            }
            boolean z11 = this.f17026i;
            if (z11) {
                bundle.putBoolean(f17017z, z11);
            }
            y0.g gVar = this.f17028k;
            if (gVar != null) {
                bundle.putBundle(A, gVar.toBundle());
            }
            boolean z12 = this.f17029l;
            if (z12) {
                bundle.putBoolean(B, z12);
            }
            long j13 = this.f17030m;
            if (j13 != 0) {
                bundle.putLong(C, j13);
            }
            long j14 = this.f17031n;
            if (j14 != C.TIME_UNSET) {
                bundle.putLong(D, j14);
            }
            int i10 = this.f17032o;
            if (i10 != 0) {
                bundle.putInt(E, i10);
            }
            int i11 = this.f17033p;
            if (i11 != 0) {
                bundle.putInt(F, i11);
            }
            long j15 = this.f17034q;
            if (j15 != 0) {
                bundle.putLong(G, j15);
            }
            return bundle;
        }
    }

    protected h2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static h2 b(Bundle bundle) {
        com.google.common.collect.c0 c0VarC = c(d.H, ob.b.a(bundle, f16988b));
        com.google.common.collect.c0 c0VarC2 = c(b.f16997m, ob.b.a(bundle, f16989c));
        int[] intArray = bundle.getIntArray(f16990d);
        if (intArray == null) {
            intArray = d(c0VarC.size());
        }
        return new c(c0VarC, c0VarC2, intArray);
    }

    private static com.google.common.collect.c0 c(g.a aVar, IBinder iBinder) {
        if (iBinder == null) {
            return com.google.common.collect.c0.C();
        }
        com.google.common.collect.c0.a aVar2 = new com.google.common.collect.c0.a();
        com.google.common.collect.c0 c0VarA = o9.a.a(iBinder);
        for (int i10 = 0; i10 < c0VarA.size(); i10++) {
            aVar2.a(aVar.a((Bundle) c0VarA.get(i10)));
        }
        return aVar2.m();
    }

    private static int[] d(int i10) {
        int[] iArr = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            iArr[i11] = i11;
        }
        return iArr;
    }

    public int e(boolean z10) {
        return u() ? -1 : 0;
    }

    public boolean equals(Object obj) {
        int iG;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h2)) {
            return false;
        }
        h2 h2Var = (h2) obj;
        if (h2Var.t() != t() || h2Var.m() != m()) {
            return false;
        }
        d dVar = new d();
        b bVar = new b();
        d dVar2 = new d();
        b bVar2 = new b();
        for (int i10 = 0; i10 < t(); i10++) {
            if (!r(i10, dVar).equals(h2Var.r(i10, dVar2))) {
                return false;
            }
        }
        for (int i11 = 0; i11 < m(); i11++) {
            if (!k(i11, bVar, true).equals(h2Var.k(i11, bVar2, true))) {
                return false;
            }
        }
        int iE = e(true);
        if (iE != h2Var.e(true) || (iG = g(true)) != h2Var.g(true)) {
            return false;
        }
        while (iE != iG) {
            int i12 = i(iE, 0, true);
            if (i12 != h2Var.i(iE, 0, true)) {
                return false;
            }
            iE = i12;
        }
        return true;
    }

    public abstract int f(Object obj);

    public int g(boolean z10) {
        if (u()) {
            return -1;
        }
        return t() - 1;
    }

    public final int h(int i10, b bVar, d dVar, int i11, boolean z10) {
        int i12 = j(i10, bVar).f17000c;
        if (r(i12, dVar).f17033p != i10) {
            return i10 + 1;
        }
        int i13 = i(i12, i11, z10);
        if (i13 == -1) {
            return -1;
        }
        return r(i13, dVar).f17032o;
    }

    public int hashCode() {
        d dVar = new d();
        b bVar = new b();
        int iT = Sdk$SDKError.b.AD_RESPONSE_TIMED_OUT_VALUE + t();
        for (int i10 = 0; i10 < t(); i10++) {
            iT = (iT * 31) + r(i10, dVar).hashCode();
        }
        int iM = (iT * 31) + m();
        for (int i11 = 0; i11 < m(); i11++) {
            iM = (iM * 31) + k(i11, bVar, true).hashCode();
        }
        int iE = e(true);
        while (iE != -1) {
            iM = (iM * 31) + iE;
            iE = i(iE, 0, true);
        }
        return iM;
    }

    public int i(int i10, int i11, boolean z10) {
        if (i11 == 0) {
            if (i10 == g(z10)) {
                return -1;
            }
            return i10 + 1;
        }
        if (i11 == 1) {
            return i10;
        }
        if (i11 == 2) {
            return i10 == g(z10) ? e(z10) : i10 + 1;
        }
        throw new IllegalStateException();
    }

    public final b j(int i10, b bVar) {
        return k(i10, bVar, false);
    }

    public abstract b k(int i10, b bVar, boolean z10);

    public b l(Object obj, b bVar) {
        return k(f(obj), bVar, true);
    }

    public abstract int m();

    public final Pair n(d dVar, b bVar, int i10, long j10) {
        return (Pair) ob.a.e(o(dVar, bVar, i10, j10, 0L));
    }

    public final Pair o(d dVar, b bVar, int i10, long j10, long j11) {
        ob.a.c(i10, 0, t());
        s(i10, dVar, j11);
        if (j10 == C.TIME_UNSET) {
            j10 = dVar.e();
            if (j10 == C.TIME_UNSET) {
                return null;
            }
        }
        int i11 = dVar.f17032o;
        j(i11, bVar);
        while (i11 < dVar.f17033p && bVar.f17002e != j10) {
            int i12 = i11 + 1;
            if (j(i12, bVar).f17002e > j10) {
                break;
            }
            i11 = i12;
        }
        k(i11, bVar, true);
        long jMin = j10 - bVar.f17002e;
        long j12 = bVar.f17001d;
        if (j12 != C.TIME_UNSET) {
            jMin = Math.min(jMin, j12 - 1);
        }
        return Pair.create(ob.a.e(bVar.f16999b), Long.valueOf(Math.max(0L, jMin)));
    }

    public int p(int i10, int i11, boolean z10) {
        if (i11 == 0) {
            if (i10 == e(z10)) {
                return -1;
            }
            return i10 - 1;
        }
        if (i11 == 1) {
            return i10;
        }
        if (i11 == 2) {
            return i10 == e(z10) ? g(z10) : i10 - 1;
        }
        throw new IllegalStateException();
    }

    public abstract Object q(int i10);

    public final d r(int i10, d dVar) {
        return s(i10, dVar, 0L);
    }

    public abstract d s(int i10, d dVar, long j10);

    public abstract int t();

    @Override // com.google.android.exoplayer2.g
    public final Bundle toBundle() {
        ArrayList arrayList = new ArrayList();
        int iT = t();
        d dVar = new d();
        for (int i10 = 0; i10 < iT; i10++) {
            arrayList.add(s(i10, dVar, 0L).toBundle());
        }
        ArrayList arrayList2 = new ArrayList();
        int iM = m();
        b bVar = new b();
        for (int i11 = 0; i11 < iM; i11++) {
            arrayList2.add(k(i11, bVar, false).toBundle());
        }
        int[] iArr = new int[iT];
        if (iT > 0) {
            iArr[0] = e(true);
        }
        for (int i12 = 1; i12 < iT; i12++) {
            iArr[i12] = i(iArr[i12 - 1], 0, true);
        }
        Bundle bundle = new Bundle();
        ob.b.c(bundle, f16988b, new o9.a(arrayList));
        ob.b.c(bundle, f16989c, new o9.a(arrayList2));
        bundle.putIntArray(f16990d, iArr);
        return bundle;
    }

    public final boolean u() {
        return t() == 0;
    }

    public final boolean v(int i10, b bVar, d dVar, int i11, boolean z10) {
        return h(i10, bVar, dVar, i11, z10) == -1;
    }
}
