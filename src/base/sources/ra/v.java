package ra;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.exoplayer2.v0;
import com.google.common.collect.c0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.Arrays;
import ob.r0;
import ob.y;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class v implements com.google.android.exoplayer2.g {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f51245f = r0.y0(0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f51246g = r0.y0(1);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final com.google.android.exoplayer2.g.a f51247h = new com.google.android.exoplayer2.g.a() { // from class: ra.u
        @Override // com.google.android.exoplayer2.g.a
        public final com.google.android.exoplayer2.g a(Bundle bundle) {
            return v.a(bundle);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f51248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f51249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f51250c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final v0[] f51251d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f51252e;

    public v(v0... v0VarArr) {
        this("", v0VarArr);
    }

    public static /* synthetic */ v a(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f51245f);
        return new v(bundle.getString(f51246g, ""), (v0[]) (parcelableArrayList == null ? c0.C() : ob.c.d(v0.f18856p0, parcelableArrayList)).toArray(new v0[0]));
    }

    private static void e(String str, String str2, String str3, int i10) {
        ob.u.d("TrackGroup", "", new IllegalStateException("Different " + str + " combined in one TrackGroup: '" + str2 + "' (track 0) and '" + str3 + "' (track " + i10 + ")"));
    }

    private static String f(String str) {
        return (str == null || str.equals(C.LANGUAGE_UNDETERMINED)) ? "" : str;
    }

    private static int g(int i10) {
        return i10 | 16384;
    }

    private void h() {
        String strF = f(this.f51251d[0].f18859c);
        int iG = g(this.f51251d[0].f18861e);
        int i10 = 1;
        while (true) {
            v0[] v0VarArr = this.f51251d;
            if (i10 >= v0VarArr.length) {
                return;
            }
            if (!strF.equals(f(v0VarArr[i10].f18859c))) {
                v0[] v0VarArr2 = this.f51251d;
                e("languages", v0VarArr2[0].f18859c, v0VarArr2[i10].f18859c, i10);
                return;
            } else {
                if (iG != g(this.f51251d[i10].f18861e)) {
                    e("role flags", Integer.toBinaryString(this.f51251d[0].f18861e), Integer.toBinaryString(this.f51251d[i10].f18861e), i10);
                    return;
                }
                i10++;
            }
        }
    }

    public v b(String str) {
        return new v(str, this.f51251d);
    }

    public v0 c(int i10) {
        return this.f51251d[i10];
    }

    public int d(v0 v0Var) {
        int i10 = 0;
        while (true) {
            v0[] v0VarArr = this.f51251d;
            if (i10 >= v0VarArr.length) {
                return -1;
            }
            if (v0Var == v0VarArr[i10]) {
                return i10;
            }
            i10++;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && v.class == obj.getClass()) {
            v vVar = (v) obj;
            if (this.f51249b.equals(vVar.f51249b) && Arrays.equals(this.f51251d, vVar.f51251d)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        if (this.f51252e == 0) {
            this.f51252e = ((527 + this.f51249b.hashCode()) * 31) + Arrays.hashCode(this.f51251d);
        }
        return this.f51252e;
    }

    @Override // com.google.android.exoplayer2.g
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(this.f51251d.length);
        for (v0 v0Var : this.f51251d) {
            arrayList.add(v0Var.i(true));
        }
        bundle.putParcelableArrayList(f51245f, arrayList);
        bundle.putString(f51246g, this.f51249b);
        return bundle;
    }

    public v(String str, v0... v0VarArr) {
        ob.a.a(v0VarArr.length > 0);
        this.f51249b = str;
        this.f51251d = v0VarArr;
        this.f51248a = v0VarArr.length;
        int iK = y.k(v0VarArr[0].f18868l);
        this.f51250c = iK == -1 ? y.k(v0VarArr[0].f18867k) : iK;
        h();
    }
}
