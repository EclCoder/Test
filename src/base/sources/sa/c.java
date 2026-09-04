package sa;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.exoplayer2.g;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.Arrays;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class c implements g {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c f51554g = new c(null, new a[0], 0, C.TIME_UNSET, 0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final a f51555h = new a(0).k(0);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f51556i = r0.y0(1);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f51557j = r0.y0(2);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f51558k = r0.y0(3);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f51559l = r0.y0(4);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final g.a f51560m = new g.a() { // from class: sa.a
        @Override // com.google.android.exoplayer2.g.a
        public final g a(Bundle bundle) {
            return c.b(bundle);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f51561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f51562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f51563c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f51564d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f51565e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final a[] f51566f;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a implements g {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final String f51567i = r0.y0(0);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final String f51568j = r0.y0(1);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final String f51569k = r0.y0(2);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final String f51570l = r0.y0(3);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final String f51571m = r0.y0(4);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final String f51572n = r0.y0(5);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final String f51573o = r0.y0(6);

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private static final String f51574p = r0.y0(7);

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final g.a f51575q = new g.a() { // from class: sa.b
            @Override // com.google.android.exoplayer2.g.a
            public final g a(Bundle bundle) {
                return c.a.e(bundle);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f51576a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f51577b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f51578c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Uri[] f51579d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int[] f51580e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final long[] f51581f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final long f51582g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f51583h;

        public a(long j10) {
            this(j10, -1, -1, new int[0], new Uri[0], new long[0], 0L, false);
        }

        private static long[] c(long[] jArr, int i10) {
            int length = jArr.length;
            int iMax = Math.max(i10, length);
            long[] jArrCopyOf = Arrays.copyOf(jArr, iMax);
            Arrays.fill(jArrCopyOf, length, iMax, C.TIME_UNSET);
            return jArrCopyOf;
        }

        private static int[] d(int[] iArr, int i10) {
            int length = iArr.length;
            int iMax = Math.max(i10, length);
            int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
            Arrays.fill(iArrCopyOf, length, iMax, 0);
            return iArrCopyOf;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static a e(Bundle bundle) {
            long j10 = bundle.getLong(f51567i);
            int i10 = bundle.getInt(f51568j);
            int i11 = bundle.getInt(f51574p);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(f51569k);
            int[] intArray = bundle.getIntArray(f51570l);
            long[] longArray = bundle.getLongArray(f51571m);
            long j11 = bundle.getLong(f51572n);
            boolean z10 = bundle.getBoolean(f51573o);
            int[] iArr = intArray;
            if (iArr == null) {
                iArr = new int[0];
            }
            Uri[] uriArr = parcelableArrayList == null ? new Uri[0] : (Uri[]) parcelableArrayList.toArray(new Uri[0]);
            if (longArray == null) {
                longArray = new long[0];
            }
            return new a(j10, i10, i11, iArr, uriArr, longArray, j11, z10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean i() {
            return this.f51583h && this.f51576a == Long.MIN_VALUE && this.f51577b == -1;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f51576a == aVar.f51576a && this.f51577b == aVar.f51577b && this.f51578c == aVar.f51578c && Arrays.equals(this.f51579d, aVar.f51579d) && Arrays.equals(this.f51580e, aVar.f51580e) && Arrays.equals(this.f51581f, aVar.f51581f) && this.f51582g == aVar.f51582g && this.f51583h == aVar.f51583h) {
                    return true;
                }
            }
            return false;
        }

        public int f() {
            return g(-1);
        }

        public int g(int i10) {
            int i11;
            int i12 = i10 + 1;
            while (true) {
                int[] iArr = this.f51580e;
                if (i12 >= iArr.length || this.f51583h || (i11 = iArr[i12]) == 0 || i11 == 1) {
                    break;
                }
                i12++;
            }
            return i12;
        }

        public boolean h() {
            if (this.f51577b == -1) {
                return true;
            }
            for (int i10 = 0; i10 < this.f51577b; i10++) {
                int i11 = this.f51580e[i10];
                if (i11 == 0 || i11 == 1) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int i10 = ((this.f51577b * 31) + this.f51578c) * 31;
            long j10 = this.f51576a;
            int iHashCode = (((((((i10 + ((int) (j10 ^ (j10 >>> 32)))) * 31) + Arrays.hashCode(this.f51579d)) * 31) + Arrays.hashCode(this.f51580e)) * 31) + Arrays.hashCode(this.f51581f)) * 31;
            long j11 = this.f51582g;
            return ((iHashCode + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f51583h ? 1 : 0);
        }

        public boolean j() {
            return this.f51577b == -1 || f() < this.f51577b;
        }

        public a k(int i10) {
            int[] iArrD = d(this.f51580e, i10);
            long[] jArrC = c(this.f51581f, i10);
            return new a(this.f51576a, i10, this.f51578c, iArrD, (Uri[]) Arrays.copyOf(this.f51579d, i10), jArrC, this.f51582g, this.f51583h);
        }

        @Override // com.google.android.exoplayer2.g
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putLong(f51567i, this.f51576a);
            bundle.putInt(f51568j, this.f51577b);
            bundle.putInt(f51574p, this.f51578c);
            bundle.putParcelableArrayList(f51569k, new ArrayList<>(Arrays.asList(this.f51579d)));
            bundle.putIntArray(f51570l, this.f51580e);
            bundle.putLongArray(f51571m, this.f51581f);
            bundle.putLong(f51572n, this.f51582g);
            bundle.putBoolean(f51573o, this.f51583h);
            return bundle;
        }

        private a(long j10, int i10, int i11, int[] iArr, Uri[] uriArr, long[] jArr, long j11, boolean z10) {
            ob.a.a(iArr.length == uriArr.length);
            this.f51576a = j10;
            this.f51577b = i10;
            this.f51578c = i11;
            this.f51580e = iArr;
            this.f51579d = uriArr;
            this.f51581f = jArr;
            this.f51582g = j11;
            this.f51583h = z10;
        }
    }

    private c(Object obj, a[] aVarArr, long j10, long j11, int i10) {
        this.f51561a = obj;
        this.f51563c = j10;
        this.f51564d = j11;
        this.f51562b = aVarArr.length + i10;
        this.f51566f = aVarArr;
        this.f51565e = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static c b(Bundle bundle) {
        a[] aVarArr;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f51556i);
        if (parcelableArrayList == null) {
            aVarArr = new a[0];
        } else {
            a[] aVarArr2 = new a[parcelableArrayList.size()];
            for (int i10 = 0; i10 < parcelableArrayList.size(); i10++) {
                aVarArr2[i10] = (a) a.f51575q.a((Bundle) parcelableArrayList.get(i10));
            }
            aVarArr = aVarArr2;
        }
        String str = f51557j;
        c cVar = f51554g;
        return new c(null, aVarArr, bundle.getLong(str, cVar.f51563c), bundle.getLong(f51558k, cVar.f51564d), bundle.getInt(f51559l, cVar.f51565e));
    }

    private boolean g(long j10, long j11, int i10) {
        if (j10 == Long.MIN_VALUE) {
            return false;
        }
        a aVarC = c(i10);
        long j12 = aVarC.f51576a;
        if (j12 == Long.MIN_VALUE) {
            return j11 == C.TIME_UNSET || (aVarC.f51583h && aVarC.f51577b == -1) || j10 < j11;
        }
        return j10 < j12;
    }

    public a c(int i10) {
        int i11 = this.f51565e;
        return i10 < i11 ? f51555h : this.f51566f[i10 - i11];
    }

    public int d(long j10, long j11) {
        if (j10 != Long.MIN_VALUE && (j11 == C.TIME_UNSET || j10 < j11)) {
            int i10 = this.f51565e;
            while (i10 < this.f51562b && ((c(i10).f51576a != Long.MIN_VALUE && c(i10).f51576a <= j10) || !c(i10).j())) {
                i10++;
            }
            if (i10 < this.f51562b) {
                return i10;
            }
        }
        return -1;
    }

    public int e(long j10, long j11) {
        int i10 = this.f51562b - 1;
        int i11 = i10 - (f(i10) ? 1 : 0);
        while (i11 >= 0) {
            long j12 = j10;
            long j13 = j11;
            if (!g(j12, j13, i11)) {
                break;
            }
            i11--;
            j10 = j12;
            j11 = j13;
        }
        if (i11 < 0 || !c(i11).h()) {
            return -1;
        }
        return i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (r0.c(this.f51561a, cVar.f51561a) && this.f51562b == cVar.f51562b && this.f51563c == cVar.f51563c && this.f51564d == cVar.f51564d && this.f51565e == cVar.f51565e && Arrays.equals(this.f51566f, cVar.f51566f)) {
                return true;
            }
        }
        return false;
    }

    public boolean f(int i10) {
        return i10 == this.f51562b - 1 && c(i10).i();
    }

    public int hashCode() {
        int i10 = this.f51562b * 31;
        Object obj = this.f51561a;
        return ((((((((i10 + (obj == null ? 0 : obj.hashCode())) * 31) + ((int) this.f51563c)) * 31) + ((int) this.f51564d)) * 31) + this.f51565e) * 31) + Arrays.hashCode(this.f51566f);
    }

    @Override // com.google.android.exoplayer2.g
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        for (a aVar : this.f51566f) {
            arrayList.add(aVar.toBundle());
        }
        if (!arrayList.isEmpty()) {
            bundle.putParcelableArrayList(f51556i, arrayList);
        }
        long j10 = this.f51563c;
        c cVar = f51554g;
        if (j10 != cVar.f51563c) {
            bundle.putLong(f51557j, j10);
        }
        long j11 = this.f51564d;
        if (j11 != cVar.f51564d) {
            bundle.putLong(f51558k, j11);
        }
        int i10 = this.f51565e;
        if (i10 != cVar.f51565e) {
            bundle.putInt(f51559l, i10);
        }
        return bundle;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("AdPlaybackState(adsId=");
        sb2.append(this.f51561a);
        sb2.append(", adResumePositionUs=");
        sb2.append(this.f51563c);
        sb2.append(", adGroups=[");
        for (int i10 = 0; i10 < this.f51566f.length; i10++) {
            sb2.append("adGroup(timeUs=");
            sb2.append(this.f51566f[i10].f51576a);
            sb2.append(", ads=[");
            for (int i11 = 0; i11 < this.f51566f[i10].f51580e.length; i11++) {
                sb2.append("ad(state=");
                int i12 = this.f51566f[i10].f51580e[i11];
                if (i12 == 0) {
                    sb2.append('_');
                } else if (i12 == 1) {
                    sb2.append('R');
                } else if (i12 == 2) {
                    sb2.append('S');
                } else if (i12 == 3) {
                    sb2.append('P');
                } else if (i12 != 4) {
                    sb2.append('?');
                } else {
                    sb2.append('!');
                }
                sb2.append(", durationUs=");
                sb2.append(this.f51566f[i10].f51581f[i11]);
                sb2.append(')');
                if (i11 < this.f51566f[i10].f51580e.length - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append("])");
            if (i10 < this.f51566f.length - 1) {
                sb2.append(", ");
            }
        }
        sb2.append("])");
        return sb2.toString();
    }
}
