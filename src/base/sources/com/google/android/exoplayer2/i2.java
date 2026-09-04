package com.google.android.exoplayer2;

import android.os.Bundle;
import com.google.android.exoplayer2.i2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class i2 implements g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i2 f17044b = new i2(com.google.common.collect.c0.C());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f17045c = ob.r0.y0(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g.a f17046d = new g.a() { // from class: o9.p0
        @Override // com.google.android.exoplayer2.g.a
        public final com.google.android.exoplayer2.g a(Bundle bundle) {
            return i2.a(bundle);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.common.collect.c0 f17047a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a implements g {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final String f17048f = ob.r0.y0(0);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final String f17049g = ob.r0.y0(1);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final String f17050h = ob.r0.y0(3);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final String f17051i = ob.r0.y0(4);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final g.a f17052j = new g.a() { // from class: o9.q0
            @Override // com.google.android.exoplayer2.g.a
            public final com.google.android.exoplayer2.g a(Bundle bundle) {
                return i2.a.a(bundle);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f17053a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ra.v f17054b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f17055c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int[] f17056d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean[] f17057e;

        public a(ra.v vVar, boolean z10, int[] iArr, boolean[] zArr) {
            int i10 = vVar.f51248a;
            this.f17053a = i10;
            boolean z11 = false;
            ob.a.a(i10 == iArr.length && i10 == zArr.length);
            this.f17054b = vVar;
            if (z10 && i10 > 1) {
                z11 = true;
            }
            this.f17055c = z11;
            this.f17056d = (int[]) iArr.clone();
            this.f17057e = (boolean[]) zArr.clone();
        }

        public static /* synthetic */ a a(Bundle bundle) {
            ra.v vVar = (ra.v) ra.v.f51247h.a((Bundle) ob.a.e(bundle.getBundle(f17048f)));
            return new a(vVar, bundle.getBoolean(f17051i, false), (int[]) sc.j.a(bundle.getIntArray(f17049g), new int[vVar.f51248a]), (boolean[]) sc.j.a(bundle.getBooleanArray(f17050h), new boolean[vVar.f51248a]));
        }

        public ra.v b() {
            return this.f17054b;
        }

        public v0 c(int i10) {
            return this.f17054b.c(i10);
        }

        public int d() {
            return this.f17054b.f51250c;
        }

        public boolean e() {
            return this.f17055c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f17055c == aVar.f17055c && this.f17054b.equals(aVar.f17054b) && Arrays.equals(this.f17056d, aVar.f17056d) && Arrays.equals(this.f17057e, aVar.f17057e)) {
                    return true;
                }
            }
            return false;
        }

        public boolean f() {
            return com.google.common.primitives.a.b(this.f17057e, true);
        }

        public boolean g(boolean z10) {
            for (int i10 = 0; i10 < this.f17056d.length; i10++) {
                if (j(i10, z10)) {
                    return true;
                }
            }
            return false;
        }

        public boolean h(int i10) {
            return this.f17057e[i10];
        }

        public int hashCode() {
            return (((((this.f17054b.hashCode() * 31) + (this.f17055c ? 1 : 0)) * 31) + Arrays.hashCode(this.f17056d)) * 31) + Arrays.hashCode(this.f17057e);
        }

        public boolean i(int i10) {
            return j(i10, false);
        }

        public boolean j(int i10, boolean z10) {
            int i11 = this.f17056d[i10];
            if (i11 != 4) {
                return z10 && i11 == 3;
            }
            return true;
        }

        @Override // com.google.android.exoplayer2.g
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putBundle(f17048f, this.f17054b.toBundle());
            bundle.putIntArray(f17049g, this.f17056d);
            bundle.putBooleanArray(f17050h, this.f17057e);
            bundle.putBoolean(f17051i, this.f17055c);
            return bundle;
        }
    }

    public i2(List list) {
        this.f17047a = com.google.common.collect.c0.x(list);
    }

    public static /* synthetic */ i2 a(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f17045c);
        return new i2(parcelableArrayList == null ? com.google.common.collect.c0.C() : ob.c.d(a.f17052j, parcelableArrayList));
    }

    public com.google.common.collect.c0 b() {
        return this.f17047a;
    }

    public boolean c() {
        return this.f17047a.isEmpty();
    }

    public boolean d(int i10) {
        for (int i11 = 0; i11 < this.f17047a.size(); i11++) {
            a aVar = (a) this.f17047a.get(i11);
            if (aVar.f() && aVar.d() == i10) {
                return true;
            }
        }
        return false;
    }

    public boolean e(int i10) {
        return f(i10, false);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i2.class != obj.getClass()) {
            return false;
        }
        return this.f17047a.equals(((i2) obj).f17047a);
    }

    public boolean f(int i10, boolean z10) {
        for (int i11 = 0; i11 < this.f17047a.size(); i11++) {
            if (((a) this.f17047a.get(i11)).d() == i10 && ((a) this.f17047a.get(i11)).g(z10)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f17047a.hashCode();
    }

    @Override // com.google.android.exoplayer2.g
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(f17045c, ob.c.i(this.f17047a));
        return bundle;
    }
}
