package lb;

import android.content.Context;
import android.graphics.Point;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.api.reward.BackupConstant;
import com.google.android.exoplayer2.b2;
import com.google.android.exoplayer2.c2;
import com.google.android.exoplayer2.h2;
import com.google.android.exoplayer2.v0;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.google.common.collect.c0;
import com.google.common.collect.w0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.RandomAccess;
import o9.h0;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class m extends t implements c2.a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final w0 f44126k = w0.b(new Comparator() { // from class: lb.d
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return m.u((Integer) obj, (Integer) obj2);
        }
    });

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final w0 f44127l = w0.b(new Comparator() { // from class: lb.e
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return m.t((Integer) obj, (Integer) obj2);
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f44128d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f44129e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final r.b f44130f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f44131g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private d f44132h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private f f44133i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private com.google.android.exoplayer2.audio.a f44134j;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b extends h implements Comparable {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f44135e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final boolean f44136f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final String f44137g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final d f44138h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final boolean f44139i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final int f44140j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final int f44141k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final int f44142l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final boolean f44143m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f44144n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private final int f44145o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private final boolean f44146p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final int f44147q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final int f44148r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private final int f44149s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final int f44150t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private final boolean f44151u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private final boolean f44152v;

        public b(int i10, ra.v vVar, int i11, d dVar, int i12, boolean z10, sc.q qVar) {
            int i13;
            int iG;
            int iG2;
            super(i10, vVar, i11);
            this.f44138h = dVar;
            this.f44137g = m.S(this.f44204d.f18859c);
            this.f44139i = m.O(i12, false);
            int i14 = 0;
            while (true) {
                i13 = Integer.MAX_VALUE;
                if (i14 >= dVar.f44253n.size()) {
                    iG = 0;
                    i14 = Integer.MAX_VALUE;
                    break;
                } else {
                    iG = m.G(this.f44204d, (String) dVar.f44253n.get(i14), false);
                    if (iG > 0) {
                        break;
                    } else {
                        i14++;
                    }
                }
            }
            this.f44141k = i14;
            this.f44140j = iG;
            this.f44142l = m.K(this.f44204d.f18861e, dVar.f44254o);
            v0 v0Var = this.f44204d;
            int i15 = v0Var.f18861e;
            this.f44143m = i15 == 0 || (i15 & 1) != 0;
            this.f44146p = (v0Var.f18860d & 1) != 0;
            int i16 = v0Var.f18881y;
            this.f44147q = i16;
            this.f44148r = v0Var.f18882z;
            int i17 = v0Var.f18864h;
            this.f44149s = i17;
            this.f44136f = (i17 == -1 || i17 <= dVar.f44256q) && (i16 == -1 || i16 <= dVar.f44255p) && qVar.apply(v0Var);
            String[] strArrL0 = r0.l0();
            int i18 = 0;
            while (true) {
                if (i18 >= strArrL0.length) {
                    iG2 = 0;
                    i18 = Integer.MAX_VALUE;
                    break;
                } else {
                    iG2 = m.G(this.f44204d, strArrL0[i18], false);
                    if (iG2 > 0) {
                        break;
                    } else {
                        i18++;
                    }
                }
            }
            this.f44144n = i18;
            this.f44145o = iG2;
            for (int i19 = 0; i19 < dVar.f44257r.size(); i19++) {
                String str = this.f44204d.f18868l;
                if (str != null && str.equals(dVar.f44257r.get(i19))) {
                    i13 = i19;
                    break;
                }
            }
            this.f44150t = i13;
            this.f44151u = c2.d(i12) == 128;
            this.f44152v = c2.j(i12) == 64;
            this.f44135e = f(i12, z10);
        }

        public static int c(List list, List list2) {
            return ((b) Collections.max(list)).compareTo((b) Collections.max(list2));
        }

        public static c0 e(int i10, ra.v vVar, d dVar, int[] iArr, boolean z10, sc.q qVar) {
            c0.a aVarR = c0.r();
            for (int i11 = 0; i11 < vVar.f51248a; i11++) {
                aVarR.a(new b(i10, vVar, i11, dVar, iArr[i11], z10, qVar));
            }
            return aVarR.m();
        }

        private int f(int i10, boolean z10) {
            if (!m.O(i10, this.f44138h.f44172n0)) {
                return 0;
            }
            if (!this.f44136f && !this.f44138h.f44166h0) {
                return 0;
            }
            if (!m.O(i10, false) || !this.f44136f || this.f44204d.f18864h == -1) {
                return 1;
            }
            d dVar = this.f44138h;
            if (dVar.f44263x || dVar.f44262w) {
                return 1;
            }
            return (dVar.f44174p0 || !z10) ? 2 : 1;
        }

        @Override // lb.m.h
        public int a() {
            return this.f44135e;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            w0 w0VarI = (this.f44136f && this.f44139i) ? m.f44126k : m.f44126k.i();
            com.google.common.collect.q qVarF = com.google.common.collect.q.j().g(this.f44139i, bVar.f44139i).f(Integer.valueOf(this.f44141k), Integer.valueOf(bVar.f44141k), w0.d().i()).d(this.f44140j, bVar.f44140j).d(this.f44142l, bVar.f44142l).g(this.f44146p, bVar.f44146p).g(this.f44143m, bVar.f44143m).f(Integer.valueOf(this.f44144n), Integer.valueOf(bVar.f44144n), w0.d().i()).d(this.f44145o, bVar.f44145o).g(this.f44136f, bVar.f44136f).f(Integer.valueOf(this.f44150t), Integer.valueOf(bVar.f44150t), w0.d().i()).f(Integer.valueOf(this.f44149s), Integer.valueOf(bVar.f44149s), this.f44138h.f44262w ? m.f44126k.i() : m.f44127l).g(this.f44151u, bVar.f44151u).g(this.f44152v, bVar.f44152v).f(Integer.valueOf(this.f44147q), Integer.valueOf(bVar.f44147q), w0VarI).f(Integer.valueOf(this.f44148r), Integer.valueOf(bVar.f44148r), w0VarI);
            Integer numValueOf = Integer.valueOf(this.f44149s);
            Integer numValueOf2 = Integer.valueOf(bVar.f44149s);
            if (!r0.c(this.f44137g, bVar.f44137g)) {
                w0VarI = m.f44127l;
            }
            return qVarF.f(numValueOf, numValueOf2, w0VarI).i();
        }

        @Override // lb.m.h
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public boolean b(b bVar) {
            int i10;
            String str;
            int i11;
            d dVar = this.f44138h;
            if (!dVar.f44169k0 && ((i11 = this.f44204d.f18881y) == -1 || i11 != bVar.f44204d.f18881y)) {
                return false;
            }
            if (!dVar.f44167i0 && ((str = this.f44204d.f18868l) == null || !TextUtils.equals(str, bVar.f44204d.f18868l))) {
                return false;
            }
            d dVar2 = this.f44138h;
            if (!dVar2.f44168j0 && ((i10 = this.f44204d.f18882z) == -1 || i10 != bVar.f44204d.f18882z)) {
                return false;
            }
            if (dVar2.f44170l0) {
                return true;
            }
            return this.f44151u == bVar.f44151u && this.f44152v == bVar.f44152v;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class c implements Comparable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f44153a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f44154b;

        public c(v0 v0Var, int i10) {
            this.f44153a = (v0Var.f18860d & 1) != 0;
            this.f44154b = m.O(i10, false);
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            return com.google.common.collect.q.j().g(this.f44154b, cVar.f44154b).g(this.f44153a, cVar.f44153a).i();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class d extends y implements com.google.android.exoplayer2.g {
        private static final String A0;
        private static final String B0;
        private static final String C0;
        private static final String D0;
        private static final String E0;
        private static final String F0;
        private static final String G0;
        private static final String H0;
        private static final String I0;
        private static final String J0;
        private static final String K0;
        private static final String L0;
        private static final String M0;
        public static final com.google.android.exoplayer2.g.a N0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public static final d f44155t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public static final d f44156u0;

        /* JADX INFO: renamed from: v0, reason: collision with root package name */
        private static final String f44157v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        private static final String f44158w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        private static final String f44159x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        private static final String f44160y0;

        /* JADX INFO: renamed from: z0, reason: collision with root package name */
        private static final String f44161z0;

        /* JADX INFO: renamed from: d0, reason: collision with root package name */
        public final boolean f44162d0;

        /* JADX INFO: renamed from: e0, reason: collision with root package name */
        public final boolean f44163e0;

        /* JADX INFO: renamed from: f0, reason: collision with root package name */
        public final boolean f44164f0;

        /* JADX INFO: renamed from: g0, reason: collision with root package name */
        public final boolean f44165g0;

        /* JADX INFO: renamed from: h0, reason: collision with root package name */
        public final boolean f44166h0;

        /* JADX INFO: renamed from: i0, reason: collision with root package name */
        public final boolean f44167i0;

        /* JADX INFO: renamed from: j0, reason: collision with root package name */
        public final boolean f44168j0;

        /* JADX INFO: renamed from: k0, reason: collision with root package name */
        public final boolean f44169k0;

        /* JADX INFO: renamed from: l0, reason: collision with root package name */
        public final boolean f44170l0;

        /* JADX INFO: renamed from: m0, reason: collision with root package name */
        public final boolean f44171m0;

        /* JADX INFO: renamed from: n0, reason: collision with root package name */
        public final boolean f44172n0;

        /* JADX INFO: renamed from: o0, reason: collision with root package name */
        public final boolean f44173o0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final boolean f44174p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final boolean f44175q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        private final SparseArray f44176r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        private final SparseBooleanArray f44177s0;

        static {
            d dVarA = new a().A();
            f44155t0 = dVarA;
            f44156u0 = dVarA;
            f44157v0 = r0.y0(1000);
            f44158w0 = r0.y0(1001);
            f44159x0 = r0.y0(1002);
            f44160y0 = r0.y0(BackupConstant.SCENE_CLOSED_WITHOUT_SHOW);
            f44161z0 = r0.y0(1004);
            A0 = r0.y0(GeofenceStatusCodes.GEOFENCE_REQUEST_TOO_FREQUENT);
            B0 = r0.y0(1006);
            C0 = r0.y0(1007);
            D0 = r0.y0(1008);
            E0 = r0.y0(1009);
            F0 = r0.y0(TTAdConstant.IMAGE_MODE_1010);
            G0 = r0.y0(TTAdConstant.IMAGE_MODE_1011);
            H0 = r0.y0(TTAdConstant.IMAGE_MODE_1012);
            I0 = r0.y0(1013);
            J0 = r0.y0(1014);
            K0 = r0.y0(1015);
            L0 = r0.y0(1016);
            M0 = r0.y0(1017);
            N0 = new com.google.android.exoplayer2.g.a() { // from class: lb.n
                @Override // com.google.android.exoplayer2.g.a
                public final com.google.android.exoplayer2.g a(Bundle bundle) {
                    return new m.d.a(bundle).A();
                }
            };
        }

        private static boolean F(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
            int size = sparseBooleanArray.size();
            if (sparseBooleanArray2.size() != size) {
                return false;
            }
            for (int i10 = 0; i10 < size; i10++) {
                if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i10)) < 0) {
                    return false;
                }
            }
            return true;
        }

        private static boolean G(SparseArray sparseArray, SparseArray sparseArray2) {
            int size = sparseArray.size();
            if (sparseArray2.size() != size) {
                return false;
            }
            for (int i10 = 0; i10 < size; i10++) {
                int iIndexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i10));
                if (iIndexOfKey < 0 || !H((Map) sparseArray.valueAt(i10), (Map) sparseArray2.valueAt(iIndexOfKey))) {
                    return false;
                }
            }
            return true;
        }

        private static boolean H(Map map, Map map2) {
            if (map2.size() != map.size()) {
                return false;
            }
            for (Map.Entry entry : map.entrySet()) {
                ra.x xVar = (ra.x) entry.getKey();
                if (!map2.containsKey(xVar) || !r0.c(entry.getValue(), map2.get(xVar))) {
                    return false;
                }
            }
            return true;
        }

        public static d J(Context context) {
            return new a(context).A();
        }

        private static int[] K(SparseBooleanArray sparseBooleanArray) {
            int[] iArr = new int[sparseBooleanArray.size()];
            for (int i10 = 0; i10 < sparseBooleanArray.size(); i10++) {
                iArr[i10] = sparseBooleanArray.keyAt(i10);
            }
            return iArr;
        }

        private static void O(Bundle bundle, SparseArray sparseArray) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            SparseArray sparseArray2 = new SparseArray();
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                int iKeyAt = sparseArray.keyAt(i10);
                for (Map.Entry entry : ((Map) sparseArray.valueAt(i10)).entrySet()) {
                    e eVar = (e) entry.getValue();
                    if (eVar != null) {
                        sparseArray2.put(arrayList2.size(), eVar);
                    }
                    arrayList2.add((ra.x) entry.getKey());
                    arrayList.add(Integer.valueOf(iKeyAt));
                }
                bundle.putIntArray(F0, com.google.common.primitives.g.n(arrayList));
                bundle.putParcelableArrayList(G0, ob.c.i(arrayList2));
                bundle.putSparseParcelableArray(H0, ob.c.j(sparseArray2));
            }
        }

        @Override // lb.y
        /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
        public a A() {
            return new a();
        }

        public boolean L(int i10) {
            return this.f44177s0.get(i10);
        }

        public e M(int i10, ra.x xVar) {
            Map map = (Map) this.f44176r0.get(i10);
            if (map != null) {
                return (e) map.get(xVar);
            }
            return null;
        }

        public boolean N(int i10, ra.x xVar) {
            Map map = (Map) this.f44176r0.get(i10);
            return map != null && map.containsKey(xVar);
        }

        @Override // lb.y
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && d.class == obj.getClass()) {
                d dVar = (d) obj;
                if (super.equals(dVar) && this.f44162d0 == dVar.f44162d0 && this.f44163e0 == dVar.f44163e0 && this.f44164f0 == dVar.f44164f0 && this.f44165g0 == dVar.f44165g0 && this.f44166h0 == dVar.f44166h0 && this.f44167i0 == dVar.f44167i0 && this.f44168j0 == dVar.f44168j0 && this.f44169k0 == dVar.f44169k0 && this.f44170l0 == dVar.f44170l0 && this.f44171m0 == dVar.f44171m0 && this.f44172n0 == dVar.f44172n0 && this.f44173o0 == dVar.f44173o0 && this.f44174p0 == dVar.f44174p0 && this.f44175q0 == dVar.f44175q0 && F(this.f44177s0, dVar.f44177s0) && G(this.f44176r0, dVar.f44176r0)) {
                    return true;
                }
            }
            return false;
        }

        @Override // lb.y
        public int hashCode() {
            return ((((((((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.f44162d0 ? 1 : 0)) * 31) + (this.f44163e0 ? 1 : 0)) * 31) + (this.f44164f0 ? 1 : 0)) * 31) + (this.f44165g0 ? 1 : 0)) * 31) + (this.f44166h0 ? 1 : 0)) * 31) + (this.f44167i0 ? 1 : 0)) * 31) + (this.f44168j0 ? 1 : 0)) * 31) + (this.f44169k0 ? 1 : 0)) * 31) + (this.f44170l0 ? 1 : 0)) * 31) + (this.f44171m0 ? 1 : 0)) * 31) + (this.f44172n0 ? 1 : 0)) * 31) + (this.f44173o0 ? 1 : 0)) * 31) + (this.f44174p0 ? 1 : 0)) * 31) + (this.f44175q0 ? 1 : 0);
        }

        @Override // lb.y, com.google.android.exoplayer2.g
        public Bundle toBundle() {
            Bundle bundle = super.toBundle();
            bundle.putBoolean(f44157v0, this.f44162d0);
            bundle.putBoolean(f44158w0, this.f44163e0);
            bundle.putBoolean(f44159x0, this.f44164f0);
            bundle.putBoolean(J0, this.f44165g0);
            bundle.putBoolean(f44160y0, this.f44166h0);
            bundle.putBoolean(f44161z0, this.f44167i0);
            bundle.putBoolean(A0, this.f44168j0);
            bundle.putBoolean(B0, this.f44169k0);
            bundle.putBoolean(K0, this.f44170l0);
            bundle.putBoolean(L0, this.f44171m0);
            bundle.putBoolean(C0, this.f44172n0);
            bundle.putBoolean(D0, this.f44173o0);
            bundle.putBoolean(E0, this.f44174p0);
            bundle.putBoolean(M0, this.f44175q0);
            O(bundle, this.f44176r0);
            bundle.putIntArray(I0, K(this.f44177s0));
            return bundle;
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class a extends y.a {
            private boolean A;
            private boolean B;
            private boolean C;
            private boolean D;
            private boolean E;
            private boolean F;
            private boolean G;
            private boolean H;
            private boolean I;
            private boolean J;
            private boolean K;
            private boolean L;
            private boolean M;
            private boolean N;
            private final SparseArray O;
            private final SparseBooleanArray P;

            private static SparseArray e0(SparseArray sparseArray) {
                SparseArray sparseArray2 = new SparseArray();
                for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                    sparseArray2.put(sparseArray.keyAt(i10), new HashMap((Map) sparseArray.valueAt(i10)));
                }
                return sparseArray2;
            }

            private void f0() {
                this.A = true;
                this.B = false;
                this.C = true;
                this.D = false;
                this.E = true;
                this.F = false;
                this.G = false;
                this.H = false;
                this.I = false;
                this.J = true;
                this.K = true;
                this.L = false;
                this.M = true;
                this.N = false;
            }

            private SparseBooleanArray g0(int[] iArr) {
                if (iArr == null) {
                    return new SparseBooleanArray();
                }
                SparseBooleanArray sparseBooleanArray = new SparseBooleanArray(iArr.length);
                for (int i10 : iArr) {
                    sparseBooleanArray.append(i10, true);
                }
                return sparseBooleanArray;
            }

            private void z0(Bundle bundle) {
                int[] intArray = bundle.getIntArray(d.F0);
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(d.G0);
                c0 c0VarC = parcelableArrayList == null ? c0.C() : ob.c.d(ra.x.f51255f, parcelableArrayList);
                SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(d.H0);
                SparseArray sparseArray = sparseParcelableArray == null ? new SparseArray() : ob.c.e(e.f44181h, sparseParcelableArray);
                if (intArray == null || intArray.length != c0VarC.size()) {
                    return;
                }
                for (int i10 = 0; i10 < intArray.length; i10++) {
                    y0(intArray[i10], (ra.x) c0VarC.get(i10), (e) sparseArray.get(i10));
                }
            }

            @Override // lb.y.a
            /* JADX INFO: renamed from: A0, reason: merged with bridge method [inline-methods] */
            public a J(int i10, boolean z10) {
                super.J(i10, z10);
                return this;
            }

            public a B0(boolean z10) {
                this.L = z10;
                return this;
            }

            @Override // lb.y.a
            /* JADX INFO: renamed from: C0, reason: merged with bridge method [inline-methods] */
            public a K(int i10, int i11, boolean z10) {
                super.K(i10, i11, z10);
                return this;
            }

            @Override // lb.y.a
            /* JADX INFO: renamed from: D0, reason: merged with bridge method [inline-methods] */
            public a L(Context context, boolean z10) {
                super.L(context, z10);
                return this;
            }

            @Override // lb.y.a
            /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
            public d A() {
                return new d(this);
            }

            @Override // lb.y.a
            /* JADX INFO: renamed from: d0, reason: merged with bridge method [inline-methods] */
            public a B(int i10) {
                super.B(i10);
                return this;
            }

            protected a h0(y yVar) {
                super.E(yVar);
                return this;
            }

            public a i0(boolean z10) {
                this.H = z10;
                return this;
            }

            public a j0(boolean z10) {
                this.I = z10;
                return this;
            }

            public a k0(boolean z10) {
                this.F = z10;
                return this;
            }

            public a l0(boolean z10) {
                this.G = z10;
                return this;
            }

            public a m0(boolean z10) {
                this.N = z10;
                return this;
            }

            public a n0(boolean z10) {
                this.M = z10;
                return this;
            }

            public a o0(boolean z10) {
                this.D = z10;
                return this;
            }

            public a p0(boolean z10) {
                this.B = z10;
                return this;
            }

            public a q0(boolean z10) {
                this.C = z10;
                return this;
            }

            public a r0(boolean z10) {
                this.J = z10;
                return this;
            }

            public a s0(boolean z10) {
                this.E = z10;
                return this;
            }

            public a t0(boolean z10) {
                this.K = z10;
                return this;
            }

            public a u0(boolean z10) {
                this.A = z10;
                return this;
            }

            @Override // lb.y.a
            /* JADX INFO: renamed from: v0, reason: merged with bridge method [inline-methods] */
            public a F(int i10) {
                super.F(i10);
                return this;
            }

            @Override // lb.y.a
            /* JADX INFO: renamed from: w0, reason: merged with bridge method [inline-methods] */
            public a G(w wVar) {
                super.G(wVar);
                return this;
            }

            @Override // lb.y.a
            /* JADX INFO: renamed from: x0, reason: merged with bridge method [inline-methods] */
            public a H(Context context) {
                super.H(context);
                return this;
            }

            public a y0(int i10, ra.x xVar, e eVar) {
                Map map = (Map) this.O.get(i10);
                if (map == null) {
                    map = new HashMap();
                    this.O.put(i10, map);
                }
                if (map.containsKey(xVar) && r0.c(map.get(xVar), eVar)) {
                    return this;
                }
                map.put(xVar, eVar);
                return this;
            }

            public a() {
                this.O = new SparseArray();
                this.P = new SparseBooleanArray();
                f0();
            }

            public a(Context context) {
                super(context);
                this.O = new SparseArray();
                this.P = new SparseBooleanArray();
                f0();
            }

            private a(d dVar) {
                super(dVar);
                this.A = dVar.f44162d0;
                this.B = dVar.f44163e0;
                this.C = dVar.f44164f0;
                this.D = dVar.f44165g0;
                this.E = dVar.f44166h0;
                this.F = dVar.f44167i0;
                this.G = dVar.f44168j0;
                this.H = dVar.f44169k0;
                this.I = dVar.f44170l0;
                this.J = dVar.f44171m0;
                this.K = dVar.f44172n0;
                this.L = dVar.f44173o0;
                this.M = dVar.f44174p0;
                this.N = dVar.f44175q0;
                this.O = e0(dVar.f44176r0);
                this.P = dVar.f44177s0.clone();
            }

            private a(Bundle bundle) {
                super(bundle);
                f0();
                d dVar = d.f44155t0;
                u0(bundle.getBoolean(d.f44157v0, dVar.f44162d0));
                p0(bundle.getBoolean(d.f44158w0, dVar.f44163e0));
                q0(bundle.getBoolean(d.f44159x0, dVar.f44164f0));
                o0(bundle.getBoolean(d.J0, dVar.f44165g0));
                s0(bundle.getBoolean(d.f44160y0, dVar.f44166h0));
                k0(bundle.getBoolean(d.f44161z0, dVar.f44167i0));
                l0(bundle.getBoolean(d.A0, dVar.f44168j0));
                i0(bundle.getBoolean(d.B0, dVar.f44169k0));
                j0(bundle.getBoolean(d.K0, dVar.f44170l0));
                r0(bundle.getBoolean(d.L0, dVar.f44171m0));
                t0(bundle.getBoolean(d.C0, dVar.f44172n0));
                B0(bundle.getBoolean(d.D0, dVar.f44173o0));
                n0(bundle.getBoolean(d.E0, dVar.f44174p0));
                m0(bundle.getBoolean(d.M0, dVar.f44175q0));
                this.O = new SparseArray();
                z0(bundle);
                this.P = g0(bundle.getIntArray(d.I0));
            }
        }

        private d(a aVar) {
            super(aVar);
            this.f44162d0 = aVar.A;
            this.f44163e0 = aVar.B;
            this.f44164f0 = aVar.C;
            this.f44165g0 = aVar.D;
            this.f44166h0 = aVar.E;
            this.f44167i0 = aVar.F;
            this.f44168j0 = aVar.G;
            this.f44169k0 = aVar.H;
            this.f44170l0 = aVar.I;
            this.f44171m0 = aVar.J;
            this.f44172n0 = aVar.K;
            this.f44173o0 = aVar.L;
            this.f44174p0 = aVar.M;
            this.f44175q0 = aVar.N;
            this.f44176r0 = aVar.O;
            this.f44177s0 = aVar.P;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class e implements com.google.android.exoplayer2.g {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final String f44178e = r0.y0(0);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final String f44179f = r0.y0(1);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final String f44180g = r0.y0(2);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final com.google.android.exoplayer2.g.a f44181h = new com.google.android.exoplayer2.g.a() { // from class: lb.o
            @Override // com.google.android.exoplayer2.g.a
            public final com.google.android.exoplayer2.g a(Bundle bundle) {
                return m.e.a(bundle);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f44182a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f44183b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f44184c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f44185d;

        public e(int i10, int[] iArr, int i11) {
            this.f44182a = i10;
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            this.f44183b = iArrCopyOf;
            this.f44184c = iArr.length;
            this.f44185d = i11;
            Arrays.sort(iArrCopyOf);
        }

        public static /* synthetic */ e a(Bundle bundle) {
            int i10 = bundle.getInt(f44178e, -1);
            int[] intArray = bundle.getIntArray(f44179f);
            int i11 = bundle.getInt(f44180g, -1);
            ob.a.a(i10 >= 0 && i11 >= 0);
            ob.a.e(intArray);
            return new e(i10, intArray, i11);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && e.class == obj.getClass()) {
                e eVar = (e) obj;
                if (this.f44182a == eVar.f44182a && Arrays.equals(this.f44183b, eVar.f44183b) && this.f44185d == eVar.f44185d) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (((this.f44182a * 31) + Arrays.hashCode(this.f44183b)) * 31) + this.f44185d;
        }

        @Override // com.google.android.exoplayer2.g
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putInt(f44178e, this.f44182a);
            bundle.putIntArray(f44179f, this.f44183b);
            bundle.putInt(f44180g, this.f44185d);
            return bundle;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Spatializer f44186a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f44187b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Handler f44188c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Spatializer$OnSpatializerStateChangedListener f44189d;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class a implements Spatializer$OnSpatializerStateChangedListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ m f44190a;

            a(m mVar) {
                this.f44190a = mVar;
            }

            public void onSpatializerAvailableChanged(Spatializer spatializer, boolean z10) {
                this.f44190a.Q();
            }

            public void onSpatializerEnabledChanged(Spatializer spatializer, boolean z10) {
                this.f44190a.Q();
            }
        }

        private f(Spatializer spatializer) {
            this.f44186a = spatializer;
            this.f44187b = spatializer.getImmersiveAudioLevel() != 0;
        }

        public static f g(Context context) {
            AudioManager audioManager = (AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
            if (audioManager == null) {
                return null;
            }
            return new f(audioManager.getSpatializer());
        }

        public boolean a(com.google.android.exoplayer2.audio.a aVar, v0 v0Var) {
            AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(r0.H((MimeTypes.AUDIO_E_AC3_JOC.equals(v0Var.f18868l) && v0Var.f18881y == 16) ? 12 : v0Var.f18881y));
            int i10 = v0Var.f18882z;
            if (i10 != -1) {
                channelMask.setSampleRate(i10);
            }
            return this.f44186a.canBeSpatialized(aVar.b().f16552a, channelMask.build());
        }

        public void b(m mVar, Looper looper) {
            if (this.f44189d == null && this.f44188c == null) {
                this.f44189d = new a(mVar);
                Handler handler = new Handler(looper);
                this.f44188c = handler;
                Spatializer spatializer = this.f44186a;
                Objects.requireNonNull(handler);
                spatializer.addOnSpatializerStateChangedListener(new d2.r(handler), this.f44189d);
            }
        }

        public boolean c() {
            return this.f44186a.isAvailable();
        }

        public boolean d() {
            return this.f44186a.isEnabled();
        }

        public boolean e() {
            return this.f44187b;
        }

        public void f() {
            Spatializer$OnSpatializerStateChangedListener spatializer$OnSpatializerStateChangedListener = this.f44189d;
            if (spatializer$OnSpatializerStateChangedListener == null || this.f44188c == null) {
                return;
            }
            this.f44186a.removeOnSpatializerStateChangedListener(spatializer$OnSpatializerStateChangedListener);
            ((Handler) r0.j(this.f44188c)).removeCallbacksAndMessages(null);
            this.f44188c = null;
            this.f44189d = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class g extends h implements Comparable {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f44192e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final boolean f44193f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final boolean f44194g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final boolean f44195h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final int f44196i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final int f44197j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final int f44198k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final int f44199l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final boolean f44200m;

        public g(int i10, ra.v vVar, int i11, d dVar, int i12, String str) {
            int iG;
            super(i10, vVar, i11);
            int i13 = 0;
            this.f44193f = m.O(i12, false);
            int i14 = this.f44204d.f18860d & (~dVar.f44260u);
            this.f44194g = (i14 & 1) != 0;
            this.f44195h = (i14 & 2) != 0;
            c0 c0VarD = dVar.f44258s.isEmpty() ? c0.D("") : dVar.f44258s;
            int i15 = 0;
            while (true) {
                if (i15 >= c0VarD.size()) {
                    i15 = Integer.MAX_VALUE;
                    iG = 0;
                    break;
                } else {
                    iG = m.G(this.f44204d, (String) c0VarD.get(i15), dVar.f44261v);
                    if (iG > 0) {
                        break;
                    } else {
                        i15++;
                    }
                }
            }
            this.f44196i = i15;
            this.f44197j = iG;
            int iK = m.K(this.f44204d.f18861e, dVar.f44259t);
            this.f44198k = iK;
            this.f44200m = (this.f44204d.f18861e & 1088) != 0;
            int iG2 = m.G(this.f44204d, str, m.S(str) == null);
            this.f44199l = iG2;
            boolean z10 = iG > 0 || (dVar.f44258s.isEmpty() && iK > 0) || this.f44194g || (this.f44195h && iG2 > 0);
            if (m.O(i12, dVar.f44172n0) && z10) {
                i13 = 1;
            }
            this.f44192e = i13;
        }

        public static int c(List list, List list2) {
            return ((g) list.get(0)).compareTo((g) list2.get(0));
        }

        public static c0 e(int i10, ra.v vVar, d dVar, int[] iArr, String str) {
            c0.a aVarR = c0.r();
            for (int i11 = 0; i11 < vVar.f51248a; i11++) {
                aVarR.a(new g(i10, vVar, i11, dVar, iArr[i11], str));
            }
            return aVarR.m();
        }

        @Override // lb.m.h
        public int a() {
            return this.f44192e;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public int compareTo(g gVar) {
            com.google.common.collect.q qVarD = com.google.common.collect.q.j().g(this.f44193f, gVar.f44193f).f(Integer.valueOf(this.f44196i), Integer.valueOf(gVar.f44196i), w0.d().i()).d(this.f44197j, gVar.f44197j).d(this.f44198k, gVar.f44198k).g(this.f44194g, gVar.f44194g).f(Boolean.valueOf(this.f44195h), Boolean.valueOf(gVar.f44195h), this.f44197j == 0 ? w0.d() : w0.d().i()).d(this.f44199l, gVar.f44199l);
            if (this.f44198k == 0) {
                qVarD = qVarD.h(this.f44200m, gVar.f44200m);
            }
            return qVarD.i();
        }

        @Override // lb.m.h
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public boolean b(g gVar) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static abstract class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f44201a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ra.v f44202b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f44203c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final v0 f44204d;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public interface a {
            List a(int i10, ra.v vVar, int[] iArr);
        }

        public h(int i10, ra.v vVar, int i11) {
            this.f44201a = i10;
            this.f44202b = vVar;
            this.f44203c = i11;
            this.f44204d = vVar.c(i11);
        }

        public abstract int a();

        public abstract boolean b(h hVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class i extends h {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f44205e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final d f44206f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final boolean f44207g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final boolean f44208h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final int f44209i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final int f44210j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final int f44211k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final int f44212l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final boolean f44213m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final boolean f44214n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private final int f44215o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private final boolean f44216p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final boolean f44217q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final int f44218r;

        /* JADX WARN: Code duplicated, block: B:31:0x004b  */
        /* JADX WARN: Code duplicated, block: B:51:0x0079  */
        public i(int i10, ra.v vVar, int i11, d dVar, int i12, int i13, boolean z10) {
            boolean z11;
            boolean z12;
            v0 v0Var;
            int i14;
            int i15;
            int i16;
            v0 v0Var2;
            int i17;
            int i18;
            int i19;
            super(i10, vVar, i11);
            this.f44206f = dVar;
            int i20 = dVar.f44164f0 ? 24 : 16;
            this.f44214n = dVar.f44163e0 && (i13 & i20) != 0;
            if (!z10 || (((i17 = (v0Var2 = this.f44204d).f18873q) != -1 && i17 > dVar.f44240a) || ((i18 = v0Var2.f18874r) != -1 && i18 > dVar.f44241b))) {
                z11 = false;
            } else {
                float f10 = v0Var2.f18875s;
                if ((f10 == -1.0f || f10 <= dVar.f44242c) && ((i19 = v0Var2.f18864h) == -1 || i19 <= dVar.f44243d)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            }
            this.f44205e = z11;
            if (!z10 || (((i14 = (v0Var = this.f44204d).f18873q) != -1 && i14 < dVar.f44244e) || ((i15 = v0Var.f18874r) != -1 && i15 < dVar.f44245f))) {
                z12 = false;
            } else {
                float f11 = v0Var.f18875s;
                if ((f11 == -1.0f || f11 >= dVar.f44246g) && ((i16 = v0Var.f18864h) == -1 || i16 >= dVar.f44247h)) {
                    z12 = true;
                } else {
                    z12 = false;
                }
            }
            this.f44207g = z12;
            this.f44208h = m.O(i12, false);
            v0 v0Var3 = this.f44204d;
            this.f44209i = v0Var3.f18864h;
            this.f44210j = v0Var3.f();
            this.f44212l = m.K(this.f44204d.f18861e, dVar.f44252m);
            int i21 = this.f44204d.f18861e;
            this.f44213m = i21 == 0 || (i21 & 1) != 0;
            int i22 = 0;
            while (true) {
                if (i22 >= dVar.f44251l.size()) {
                    i22 = Integer.MAX_VALUE;
                    break;
                }
                String str = this.f44204d.f18868l;
                if (str != null && str.equals(dVar.f44251l.get(i22))) {
                    break;
                } else {
                    i22++;
                }
            }
            this.f44211k = i22;
            this.f44216p = c2.d(i12) == 128;
            this.f44217q = c2.j(i12) == 64;
            this.f44218r = m.L(this.f44204d.f18868l);
            this.f44215o = i(i12, i20);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int e(i iVar, i iVar2) {
            com.google.common.collect.q qVarG = com.google.common.collect.q.j().g(iVar.f44208h, iVar2.f44208h).d(iVar.f44212l, iVar2.f44212l).g(iVar.f44213m, iVar2.f44213m).g(iVar.f44205e, iVar2.f44205e).g(iVar.f44207g, iVar2.f44207g).f(Integer.valueOf(iVar.f44211k), Integer.valueOf(iVar2.f44211k), w0.d().i()).g(iVar.f44216p, iVar2.f44216p).g(iVar.f44217q, iVar2.f44217q);
            if (iVar.f44216p && iVar.f44217q) {
                qVarG = qVarG.d(iVar.f44218r, iVar2.f44218r);
            }
            return qVarG.i();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int f(i iVar, i iVar2) {
            w0 w0VarI = (iVar.f44205e && iVar.f44208h) ? m.f44126k : m.f44126k.i();
            return com.google.common.collect.q.j().f(Integer.valueOf(iVar.f44209i), Integer.valueOf(iVar2.f44209i), iVar.f44206f.f44262w ? m.f44126k.i() : m.f44127l).f(Integer.valueOf(iVar.f44210j), Integer.valueOf(iVar2.f44210j), w0VarI).f(Integer.valueOf(iVar.f44209i), Integer.valueOf(iVar2.f44209i), w0VarI).i();
        }

        public static int g(List list, List list2) {
            return com.google.common.collect.q.j().f((i) Collections.max(list, new Comparator() { // from class: lb.p
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return m.i.e((m.i) obj, (m.i) obj2);
                }
            }), (i) Collections.max(list2, new Comparator() { // from class: lb.p
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return m.i.e((m.i) obj, (m.i) obj2);
                }
            }), new Comparator() { // from class: lb.p
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return m.i.e((m.i) obj, (m.i) obj2);
                }
            }).d(list.size(), list2.size()).f((i) Collections.max(list, new Comparator() { // from class: lb.q
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return m.i.f((m.i) obj, (m.i) obj2);
                }
            }), (i) Collections.max(list2, new Comparator() { // from class: lb.q
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return m.i.f((m.i) obj, (m.i) obj2);
                }
            }), new Comparator() { // from class: lb.q
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return m.i.f((m.i) obj, (m.i) obj2);
                }
            }).i();
        }

        public static c0 h(int i10, ra.v vVar, d dVar, int[] iArr, int i11) {
            int iH = m.H(vVar, dVar.f44248i, dVar.f44249j, dVar.f44250k);
            c0.a aVarR = c0.r();
            for (int i12 = 0; i12 < vVar.f51248a; i12++) {
                int iF = vVar.c(i12).f();
                aVarR.a(new i(i10, vVar, i12, dVar, iArr[i12], i11, iH == Integer.MAX_VALUE || (iF != -1 && iF <= iH)));
            }
            return aVarR.m();
        }

        private int i(int i10, int i11) {
            if ((this.f44204d.f18861e & 16384) != 0 || !m.O(i10, this.f44206f.f44172n0)) {
                return 0;
            }
            if (!this.f44205e && !this.f44206f.f44162d0) {
                return 0;
            }
            if (!m.O(i10, false) || !this.f44207g || !this.f44205e || this.f44204d.f18864h == -1) {
                return 1;
            }
            d dVar = this.f44206f;
            return (dVar.f44263x || dVar.f44262w || (i10 & i11) == 0) ? 1 : 2;
        }

        @Override // lb.m.h
        public int a() {
            return this.f44215o;
        }

        @Override // lb.m.h
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean b(i iVar) {
            if (!this.f44214n && !r0.c(this.f44204d.f18868l, iVar.f44204d.f18868l)) {
                return false;
            }
            if (this.f44206f.f44165g0) {
                return true;
            }
            return this.f44216p == iVar.f44216p && this.f44217q == iVar.f44217q;
        }
    }

    public m(Context context) {
        this(context, new lb.a.b());
    }

    private static void D(t.a aVar, d dVar, r.a[] aVarArr) {
        int iD = aVar.d();
        for (int i10 = 0; i10 < iD; i10++) {
            ra.x xVarF = aVar.f(i10);
            if (dVar.N(i10, xVarF)) {
                e eVarM = dVar.M(i10, xVarF);
                aVarArr[i10] = (eVarM == null || eVarM.f44183b.length == 0) ? null : new r.a(xVarF.b(eVarM.f44182a), eVarM.f44183b, eVarM.f44185d);
            }
        }
    }

    private static void E(t.a aVar, y yVar, r.a[] aVarArr) {
        int iD = aVar.d();
        HashMap map = new HashMap();
        for (int i10 = 0; i10 < iD; i10++) {
            F(aVar.f(i10), yVar, map);
        }
        F(aVar.h(), yVar, map);
        for (int i11 = 0; i11 < iD; i11++) {
            w wVar = (w) map.get(Integer.valueOf(aVar.e(i11)));
            if (wVar != null) {
                aVarArr[i11] = (wVar.f44236b.isEmpty() || aVar.f(i11).c(wVar.f44235a) == -1) ? null : new r.a(wVar.f44235a, com.google.common.primitives.g.n(wVar.f44236b));
            }
        }
    }

    private static void F(ra.x xVar, y yVar, Map map) {
        w wVar;
        for (int i10 = 0; i10 < xVar.f51256a; i10++) {
            w wVar2 = (w) yVar.f44264y.get(xVar.b(i10));
            if (wVar2 != null && ((wVar = (w) map.get(Integer.valueOf(wVar2.b()))) == null || (wVar.f44236b.isEmpty() && !wVar2.f44236b.isEmpty()))) {
                map.put(Integer.valueOf(wVar2.b()), wVar2);
            }
        }
    }

    protected static int G(v0 v0Var, String str, boolean z10) {
        if (!TextUtils.isEmpty(str) && str.equals(v0Var.f18859c)) {
            return 4;
        }
        String strS = S(str);
        String strS2 = S(v0Var.f18859c);
        if (strS2 == null || strS == null) {
            return (z10 && strS2 == null) ? 1 : 0;
        }
        if (strS2.startsWith(strS) || strS.startsWith(strS2)) {
            return 3;
        }
        return r0.Z0(strS2, "-")[0].equals(r0.Z0(strS, "-")[0]) ? 2 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int H(ra.v vVar, int i10, int i11, boolean z10) {
        int i12;
        int i13 = Integer.MAX_VALUE;
        if (i10 != Integer.MAX_VALUE && i11 != Integer.MAX_VALUE) {
            for (int i14 = 0; i14 < vVar.f51248a; i14++) {
                v0 v0VarC = vVar.c(i14);
                int i15 = v0VarC.f18873q;
                if (i15 > 0 && (i12 = v0VarC.f18874r) > 0) {
                    Point pointI = I(z10, i10, i11, i15, i12);
                    int i16 = v0VarC.f18873q;
                    int i17 = v0VarC.f18874r;
                    int i18 = i16 * i17;
                    if (i16 >= ((int) (pointI.x * 0.98f)) && i17 >= ((int) (pointI.y * 0.98f)) && i18 < i13) {
                        i13 = i18;
                    }
                }
            }
        }
        return i13;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x000f  */
    private static Point I(boolean z10, int i10, int i11, int i12, int i13) {
        if (z10) {
            if ((i12 > i13) == (i10 > i11)) {
                i11 = i10;
                i10 = i11;
            }
        } else {
            i11 = i10;
            i10 = i11;
        }
        int i14 = i12 * i10;
        int i15 = i13 * i11;
        return i14 >= i15 ? new Point(i11, r0.l(i15, i12)) : new Point(r0.l(i14, i13), i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int K(int i10, int i11) {
        if (i10 == 0 || i10 != i11) {
            return Integer.bitCount(i10 & i11);
        }
        return Integer.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int L(String str) {
        if (str == null) {
            return 0;
        }
        switch (str) {
            case "video/dolby-vision":
                return 5;
            case "video/av01":
                return 4;
            case "video/hevc":
                return 3;
            case "video/avc":
                return 1;
            case "video/x-vnd.on2.vp9":
                return 2;
            default:
                return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean M(v0 v0Var) {
        boolean z10;
        f fVar;
        f fVar2;
        synchronized (this.f44128d) {
            try {
                if (this.f44132h.f44171m0 && !this.f44131g && v0Var.f18881y > 2 && (!N(v0Var) || (r0.f48425a >= 32 && (fVar2 = this.f44133i) != null && fVar2.e()))) {
                    z10 = r0.f48425a >= 32 && (fVar = this.f44133i) != null && fVar.e() && this.f44133i.c() && this.f44133i.d() && this.f44133i.a(this.f44134j, v0Var);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    private static boolean N(v0 v0Var) {
        String str = v0Var.f18868l;
        if (str == null) {
            return false;
        }
        str.getClass();
        switch (str) {
            case "audio/eac3-joc":
            case "audio/ac3":
            case "audio/ac4":
            case "audio/eac3":
                return true;
            default:
                return false;
        }
    }

    protected static boolean O(int i10, boolean z10) {
        int iM = c2.m(i10);
        if (iM != 4) {
            return z10 && iM == 3;
        }
        return true;
    }

    private static void P(t.a aVar, int[][][] iArr, h0[] h0VarArr, r[] rVarArr) {
        boolean z10;
        boolean z11 = false;
        int i10 = -1;
        int i11 = -1;
        int i12 = 0;
        while (true) {
            if (i12 >= aVar.d()) {
                z10 = true;
                break;
            }
            int iE = aVar.e(i12);
            r rVar = rVarArr[i12];
            if ((iE == 1 || iE == 2) && rVar != null && T(iArr[i12], aVar.f(i12), rVar)) {
                if (iE == 1) {
                    if (i11 != -1) {
                        z10 = false;
                        break;
                    }
                    i11 = i12;
                } else {
                    if (i10 != -1) {
                        z10 = false;
                        break;
                    }
                    i10 = i12;
                }
            }
            i12++;
        }
        if (i11 != -1 && i10 != -1) {
            z11 = true;
        }
        if (z10 && z11) {
            h0 h0Var = new h0(true);
            h0VarArr[i11] = h0Var;
            h0VarArr[i10] = h0Var;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q() {
        boolean z10;
        f fVar;
        synchronized (this.f44128d) {
            try {
                z10 = this.f44132h.f44171m0 && !this.f44131g && r0.f48425a >= 32 && (fVar = this.f44133i) != null && fVar.e();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            f();
        }
    }

    private void R(b2 b2Var) {
        boolean z10;
        synchronized (this.f44128d) {
            z10 = this.f44132h.f44175q0;
        }
        if (z10) {
            g(b2Var);
        }
    }

    protected static String S(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, C.LANGUAGE_UNDETERMINED)) {
            return null;
        }
        return str;
    }

    private static boolean T(int[][] iArr, ra.x xVar, r rVar) {
        if (rVar == null) {
            return false;
        }
        int iC = xVar.c(rVar.getTrackGroup());
        for (int i10 = 0; i10 < rVar.length(); i10++) {
            if (c2.f(iArr[iC][rVar.getIndexInTrackGroup(i10)]) != 32) {
                return false;
            }
        }
        return true;
    }

    private Pair Y(int i10, t.a aVar, int[][][] iArr, h.a aVar2, Comparator comparator) {
        int i11;
        RandomAccess randomAccessD;
        t.a aVar3 = aVar;
        ArrayList arrayList = new ArrayList();
        int iD = aVar3.d();
        int i12 = 0;
        while (i12 < iD) {
            if (i10 == aVar3.e(i12)) {
                ra.x xVarF = aVar3.f(i12);
                for (int i13 = 0; i13 < xVarF.f51256a; i13++) {
                    ra.v vVarB = xVarF.b(i13);
                    List listA = aVar2.a(i12, vVarB, iArr[i12][i13]);
                    boolean[] zArr = new boolean[vVarB.f51248a];
                    int i14 = 0;
                    while (i14 < vVarB.f51248a) {
                        h hVar = (h) listA.get(i14);
                        int iA = hVar.a();
                        if (zArr[i14] || iA == 0) {
                            i11 = iD;
                        } else {
                            if (iA == 1) {
                                randomAccessD = c0.D(hVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(hVar);
                                int i15 = i14 + 1;
                                while (i15 < vVarB.f51248a) {
                                    h hVar2 = (h) listA.get(i15);
                                    int i16 = iD;
                                    if (hVar2.a() == 2 && hVar.b(hVar2)) {
                                        arrayList2.add(hVar2);
                                        zArr[i15] = true;
                                    }
                                    i15++;
                                    iD = i16;
                                }
                                randomAccessD = arrayList2;
                            }
                            i11 = iD;
                            arrayList.add(randomAccessD);
                        }
                        i14++;
                        iD = i11;
                    }
                }
            }
            i12++;
            aVar3 = aVar;
            iD = iD;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i17 = 0; i17 < list.size(); i17++) {
            iArr2[i17] = ((h) list.get(i17)).f44203c;
        }
        h hVar3 = (h) list.get(0);
        return Pair.create(new r.a(hVar3.f44202b, iArr2), Integer.valueOf(hVar3.f44201a));
    }

    private void a0(d dVar) {
        boolean zEquals;
        ob.a.e(dVar);
        synchronized (this.f44128d) {
            zEquals = this.f44132h.equals(dVar);
            this.f44132h = dVar;
        }
        if (zEquals) {
            return;
        }
        if (dVar.f44171m0 && this.f44129e == null) {
            ob.u.i("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
        f();
    }

    public static /* synthetic */ int t(Integer num, Integer num2) {
        return 0;
    }

    public static /* synthetic */ int u(Integer num, Integer num2) {
        if (num.intValue() == -1) {
            return num2.intValue() == -1 ? 0 : -1;
        }
        if (num2.intValue() == -1) {
            return 1;
        }
        return num.intValue() - num2.intValue();
    }

    public static /* synthetic */ List w(final m mVar, d dVar, boolean z10, int i10, ra.v vVar, int[] iArr) {
        mVar.getClass();
        return b.e(i10, vVar, dVar, iArr, z10, new sc.q() { // from class: lb.l
            @Override // sc.q
            public final boolean apply(Object obj) {
                return this.f44125a.M((v0) obj);
            }
        });
    }

    @Override // lb.a0
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public d c() {
        d dVar;
        synchronized (this.f44128d) {
            dVar = this.f44132h;
        }
        return dVar;
    }

    protected r.a[] U(t.a aVar, int[][][] iArr, int[] iArr2, d dVar) {
        String str;
        int iD = aVar.d();
        r.a[] aVarArr = new r.a[iD];
        Pair pairZ = Z(aVar, iArr, iArr2, dVar);
        if (pairZ != null) {
            aVarArr[((Integer) pairZ.second).intValue()] = (r.a) pairZ.first;
        }
        Pair pairV = V(aVar, iArr, iArr2, dVar);
        if (pairV != null) {
            aVarArr[((Integer) pairV.second).intValue()] = (r.a) pairV.first;
        }
        if (pairV == null) {
            str = null;
        } else {
            Object obj = pairV.first;
            str = ((r.a) obj).f44219a.c(((r.a) obj).f44220b[0]).f18859c;
        }
        Pair pairX = X(aVar, iArr, dVar, str);
        if (pairX != null) {
            aVarArr[((Integer) pairX.second).intValue()] = (r.a) pairX.first;
        }
        for (int i10 = 0; i10 < iD; i10++) {
            int iE = aVar.e(i10);
            if (iE != 2 && iE != 1 && iE != 3) {
                aVarArr[i10] = W(iE, aVar.f(i10), iArr[i10], dVar);
            }
        }
        return aVarArr;
    }

    protected Pair V(t.a aVar, int[][][] iArr, int[] iArr2, final d dVar) {
        final boolean z10 = false;
        for (int i10 = 0; i10 < aVar.d(); i10++) {
            if (2 == aVar.e(i10) && aVar.f(i10).f51256a > 0) {
                z10 = true;
                break;
            }
        }
        return Y(1, aVar, iArr, new h.a() { // from class: lb.h
            @Override // lb.m.h.a
            public final List a(int i11, ra.v vVar, int[] iArr3) {
                return m.w(this.f44120a, dVar, z10, i11, vVar, iArr3);
            }
        }, new Comparator() { // from class: lb.i
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return m.b.c((List) obj, (List) obj2);
            }
        });
    }

    protected r.a W(int i10, ra.x xVar, int[][] iArr, d dVar) {
        ra.v vVar = null;
        c cVar = null;
        int i11 = 0;
        for (int i12 = 0; i12 < xVar.f51256a; i12++) {
            ra.v vVarB = xVar.b(i12);
            int[] iArr2 = iArr[i12];
            for (int i13 = 0; i13 < vVarB.f51248a; i13++) {
                if (O(iArr2[i13], dVar.f44172n0)) {
                    c cVar2 = new c(vVarB.c(i13), iArr2[i13]);
                    if (cVar == null || cVar2.compareTo(cVar) > 0) {
                        vVar = vVarB;
                        i11 = i13;
                        cVar = cVar2;
                    }
                }
            }
        }
        if (vVar == null) {
            return null;
        }
        return new r.a(vVar, i11);
    }

    protected Pair X(t.a aVar, int[][][] iArr, final d dVar, final String str) {
        return Y(3, aVar, iArr, new h.a() { // from class: lb.j
            @Override // lb.m.h.a
            public final List a(int i10, ra.v vVar, int[] iArr2) {
                return m.g.e(i10, vVar, dVar, iArr2, str);
            }
        }, new Comparator() { // from class: lb.k
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return m.g.c((List) obj, (List) obj2);
            }
        });
    }

    protected Pair Z(t.a aVar, int[][][] iArr, final int[] iArr2, final d dVar) {
        return Y(2, aVar, iArr, new h.a() { // from class: lb.f
            @Override // lb.m.h.a
            public final List a(int i10, ra.v vVar, int[] iArr3) {
                return m.i.h(i10, vVar, dVar, iArr3, iArr2[i10]);
            }
        }, new Comparator() { // from class: lb.g
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return m.i.g((List) obj, (List) obj2);
            }
        });
    }

    @Override // com.google.android.exoplayer2.c2.a
    public void a(b2 b2Var) {
        R(b2Var);
    }

    @Override // lb.a0
    public boolean h() {
        return true;
    }

    @Override // lb.a0
    public void j() {
        f fVar;
        synchronized (this.f44128d) {
            try {
                if (r0.f48425a >= 32 && (fVar = this.f44133i) != null) {
                    fVar.f();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        super.j();
    }

    @Override // lb.a0
    public void l(com.google.android.exoplayer2.audio.a aVar) {
        boolean zEquals;
        synchronized (this.f44128d) {
            zEquals = this.f44134j.equals(aVar);
            this.f44134j = aVar;
        }
        if (zEquals) {
            return;
        }
        Q();
    }

    @Override // lb.a0
    public void m(y yVar) {
        if (yVar instanceof d) {
            a0((d) yVar);
        }
        a0(new d.a().h0(yVar).A());
    }

    @Override // lb.t
    protected final Pair q(t.a aVar, int[][][] iArr, int[] iArr2, com.google.android.exoplayer2.source.p.b bVar, h2 h2Var) {
        d dVar;
        f fVar;
        synchronized (this.f44128d) {
            try {
                dVar = this.f44132h;
                if (dVar.f44171m0 && r0.f48425a >= 32 && (fVar = this.f44133i) != null) {
                    fVar.b(this, (Looper) ob.a.i(Looper.myLooper()));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        int iD = aVar.d();
        r.a[] aVarArrU = U(aVar, iArr, iArr2, dVar);
        E(aVar, dVar, aVarArrU);
        D(aVar, dVar, aVarArrU);
        for (int i10 = 0; i10 < iD; i10++) {
            int iE = aVar.e(i10);
            if (dVar.L(i10) || dVar.f44265z.contains(Integer.valueOf(iE))) {
                aVarArrU[i10] = null;
            }
        }
        r[] rVarArrA = this.f44130f.a(aVarArrU, b(), bVar, h2Var);
        h0[] h0VarArr = new h0[iD];
        for (int i11 = 0; i11 < iD; i11++) {
            h0VarArr[i11] = (dVar.L(i11) || dVar.f44265z.contains(Integer.valueOf(aVar.e(i11))) || (aVar.e(i11) != -2 && rVarArrA[i11] == null)) ? null : h0.f48289b;
        }
        if (dVar.f44173o0) {
            P(aVar, iArr, h0VarArr, rVarArrA);
        }
        return Pair.create(h0VarArr, rVarArrA);
    }

    public m(Context context, r.b bVar) {
        this(context, d.J(context), bVar);
    }

    public m(Context context, y yVar, r.b bVar) {
        this(yVar, bVar, context);
    }

    private m(y yVar, r.b bVar, Context context) {
        this.f44128d = new Object();
        this.f44129e = context != null ? context.getApplicationContext() : null;
        this.f44130f = bVar;
        if (yVar instanceof d) {
            this.f44132h = (d) yVar;
        } else {
            this.f44132h = (context == null ? d.f44155t0 : d.J(context)).A().h0(yVar).A();
        }
        this.f44134j = com.google.android.exoplayer2.audio.a.f16539g;
        boolean z10 = context != null && r0.E0(context);
        this.f44131g = z10;
        if (!z10 && context != null && r0.f48425a >= 32) {
            this.f44133i = f.g(context);
        }
        if (this.f44132h.f44171m0 && context == null) {
            ob.u.i("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    @Override // lb.a0
    public c2.a d() {
        return this;
    }
}
