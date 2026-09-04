package k2;

import android.content.Context;
import android.graphics.Point;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.media3.exoplayer.f2;
import androidx.media3.exoplayer.g2;
import androidx.media3.exoplayer.h2;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.api.reward.BackupConstant;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.google.common.collect.w0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.RandomAccess;
import t1.a0;
import t1.b0;
import w1.c0;
import wc.XtO.NpmRNZ;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class n extends s implements g2.a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final w0 f42869k = w0.b(new Comparator() { // from class: k2.d
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return n.t((Integer) obj, (Integer) obj2);
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f42870d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f42871e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final q.b f42872f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f42873g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private e f42874h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private g f42875i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private t1.b f42876j;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    static final class b extends i implements Comparable {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f42877e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final boolean f42878f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final String f42879g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final e f42880h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final boolean f42881i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final int f42882j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final int f42883k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final int f42884l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final boolean f42885m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final boolean f42886n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private final int f42887o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private final int f42888p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final boolean f42889q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final int f42890r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private final int f42891s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final int f42892t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private final int f42893u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private final boolean f42894v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private final boolean f42895w;

        public b(int i10, b0 b0Var, int i11, e eVar, int i12, boolean z10, sc.q qVar, int i13) {
            int i14;
            int iE;
            int iE2;
            super(i10, b0Var, i11);
            this.f42880h = eVar;
            int i15 = eVar.f42909s0 ? 24 : 16;
            this.f42885m = eVar.f42905o0 && (i13 & i15) != 0;
            this.f42879g = n.P(this.f42935d.f52747d);
            this.f42881i = g2.n(i12, false);
            int i16 = 0;
            while (true) {
                i14 = Integer.MAX_VALUE;
                if (i16 >= eVar.f52601n.size()) {
                    iE = 0;
                    i16 = Integer.MAX_VALUE;
                    break;
                } else {
                    iE = n.E(this.f42935d, (String) eVar.f52601n.get(i16), false);
                    if (iE > 0) {
                        break;
                    } else {
                        i16++;
                    }
                }
            }
            this.f42883k = i16;
            this.f42882j = iE;
            this.f42884l = n.H(this.f42935d.f52749f, eVar.f52602o);
            t1.o oVar = this.f42935d;
            int i17 = oVar.f52749f;
            this.f42886n = i17 == 0 || (i17 & 1) != 0;
            this.f42889q = (oVar.f52748e & 1) != 0;
            int i18 = oVar.B;
            this.f42890r = i18;
            this.f42891s = oVar.C;
            int i19 = oVar.f52752i;
            this.f42892t = i19;
            this.f42878f = (i19 == -1 || i19 <= eVar.f52604q) && (i18 == -1 || i18 <= eVar.f52603p) && qVar.apply(oVar);
            String[] strArrI0 = c0.i0();
            int i20 = 0;
            while (true) {
                if (i20 >= strArrI0.length) {
                    iE2 = 0;
                    i20 = Integer.MAX_VALUE;
                    break;
                } else {
                    iE2 = n.E(this.f42935d, strArrI0[i20], false);
                    if (iE2 > 0) {
                        break;
                    } else {
                        i20++;
                    }
                }
            }
            this.f42887o = i20;
            this.f42888p = iE2;
            for (int i21 = 0; i21 < eVar.f52605r.size(); i21++) {
                String str = this.f42935d.f52757n;
                if (str != null && str.equals(eVar.f52605r.get(i21))) {
                    i14 = i21;
                    break;
                }
            }
            this.f42893u = i14;
            this.f42894v = g2.d(i12) == 128;
            this.f42895w = g2.j(i12) == 64;
            this.f42877e = f(i12, z10, i15);
        }

        public static int c(List list, List list2) {
            return ((b) Collections.max(list)).compareTo((b) Collections.max(list2));
        }

        public static com.google.common.collect.c0 e(int i10, b0 b0Var, e eVar, int[] iArr, boolean z10, sc.q qVar, int i11) {
            com.google.common.collect.c0.a aVarR = com.google.common.collect.c0.r();
            for (int i12 = 0; i12 < b0Var.f52572a; i12++) {
                aVarR.a(new b(i10, b0Var, i12, eVar, iArr[i12], z10, qVar, i11));
            }
            return aVarR.m();
        }

        private int f(int i10, boolean z10, int i11) {
            if (!g2.n(i10, this.f42880h.f42911u0)) {
                return 0;
            }
            if (!this.f42878f && !this.f42880h.f42904n0) {
                return 0;
            }
            e eVar = this.f42880h;
            if (eVar.f52606s.f52618a == 2 && !n.Q(eVar, i10, this.f42935d)) {
                return 0;
            }
            if (!g2.n(i10, false) || !this.f42878f || this.f42935d.f52752i == -1) {
                return 1;
            }
            e eVar2 = this.f42880h;
            if (eVar2.f52613z || eVar2.f52612y) {
                return 1;
            }
            return ((!eVar2.f42913w0 && z10) || eVar2.f52606s.f52618a == 2 || (i10 & i11) == 0) ? 1 : 2;
        }

        @Override // k2.n.i
        public int a() {
            return this.f42877e;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            w0 w0VarI = (this.f42878f && this.f42881i) ? n.f42869k : n.f42869k.i();
            com.google.common.collect.q qVarF = com.google.common.collect.q.j().g(this.f42881i, bVar.f42881i).f(Integer.valueOf(this.f42883k), Integer.valueOf(bVar.f42883k), w0.d().i()).d(this.f42882j, bVar.f42882j).d(this.f42884l, bVar.f42884l).g(this.f42889q, bVar.f42889q).g(this.f42886n, bVar.f42886n).f(Integer.valueOf(this.f42887o), Integer.valueOf(bVar.f42887o), w0.d().i()).d(this.f42888p, bVar.f42888p).g(this.f42878f, bVar.f42878f).f(Integer.valueOf(this.f42893u), Integer.valueOf(bVar.f42893u), w0.d().i());
            if (this.f42880h.f52612y) {
                qVarF = qVarF.f(Integer.valueOf(this.f42892t), Integer.valueOf(bVar.f42892t), n.f42869k.i());
            }
            com.google.common.collect.q qVarF2 = qVarF.g(this.f42894v, bVar.f42894v).g(this.f42895w, bVar.f42895w).f(Integer.valueOf(this.f42890r), Integer.valueOf(bVar.f42890r), w0VarI).f(Integer.valueOf(this.f42891s), Integer.valueOf(bVar.f42891s), w0VarI);
            if (c0.c(this.f42879g, bVar.f42879g)) {
                qVarF2 = qVarF2.f(Integer.valueOf(this.f42892t), Integer.valueOf(bVar.f42892t), w0VarI);
            }
            return qVarF2.i();
        }

        @Override // k2.n.i
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public boolean b(b bVar) {
            int i10;
            String str;
            int i11;
            if (!this.f42880h.f42907q0 && ((i11 = this.f42935d.B) == -1 || i11 != bVar.f42935d.B)) {
                return false;
            }
            if (!this.f42885m && ((str = this.f42935d.f52757n) == null || !TextUtils.equals(str, bVar.f42935d.f52757n))) {
                return false;
            }
            e eVar = this.f42880h;
            if (!eVar.f42906p0 && ((i10 = this.f42935d.C) == -1 || i10 != bVar.f42935d.C)) {
                return false;
            }
            if (eVar.f42908r0) {
                return true;
            }
            return this.f42894v == bVar.f42894v && this.f42895w == bVar.f42895w;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    static final class c extends i implements Comparable {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f42896e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f42897f;

        public c(int i10, b0 b0Var, int i11, e eVar, int i12) {
            super(i10, b0Var, i11);
            this.f42896e = g2.n(i12, eVar.f42911u0) ? 1 : 0;
            this.f42897f = this.f42935d.d();
        }

        public static int c(List list, List list2) {
            return ((c) list.get(0)).compareTo((c) list2.get(0));
        }

        public static com.google.common.collect.c0 e(int i10, b0 b0Var, e eVar, int[] iArr) {
            com.google.common.collect.c0.a aVarR = com.google.common.collect.c0.r();
            for (int i11 = 0; i11 < b0Var.f52572a; i11++) {
                aVarR.a(new c(i10, b0Var, i11, eVar, iArr[i11]));
            }
            return aVarR.m();
        }

        @Override // k2.n.i
        public int a() {
            return this.f42896e;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            return Integer.compare(this.f42897f, cVar.f42897f);
        }

        @Override // k2.n.i
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public boolean b(c cVar) {
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    private static final class d implements Comparable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f42898a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f42899b;

        public d(t1.o oVar, int i10) {
            this.f42898a = (oVar.f52748e & 1) != 0;
            this.f42899b = g2.n(i10, false);
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            return com.google.common.collect.q.j().g(this.f42899b, dVar.f42899b).g(this.f42898a, dVar.f42898a).i();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    public static final class e extends t1.c0 {
        public static final e A0;
        public static final e B0;
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
        private static final String N0;
        private static final String O0;
        private static final String P0;
        private static final String Q0;
        private static final String R0;
        private static final String S0;
        private static final String T0;
        private static final String U0;

        /* JADX INFO: renamed from: j0, reason: collision with root package name */
        public final boolean f42900j0;

        /* JADX INFO: renamed from: k0, reason: collision with root package name */
        public final boolean f42901k0;

        /* JADX INFO: renamed from: l0, reason: collision with root package name */
        public final boolean f42902l0;

        /* JADX INFO: renamed from: m0, reason: collision with root package name */
        public final boolean f42903m0;

        /* JADX INFO: renamed from: n0, reason: collision with root package name */
        public final boolean f42904n0;

        /* JADX INFO: renamed from: o0, reason: collision with root package name */
        public final boolean f42905o0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final boolean f42906p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final boolean f42907q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final boolean f42908r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final boolean f42909s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final boolean f42910t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final boolean f42911u0;

        /* JADX INFO: renamed from: v0, reason: collision with root package name */
        public final boolean f42912v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final boolean f42913w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final boolean f42914x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        private final SparseArray f42915y0;

        /* JADX INFO: renamed from: z0, reason: collision with root package name */
        private final SparseBooleanArray f42916z0;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class a extends t1.c0.c {
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
            private boolean O;
            private boolean P;
            private boolean Q;
            private final SparseArray R;
            private final SparseBooleanArray S;

            private static SparseArray a0(SparseArray sparseArray) {
                SparseArray sparseArray2 = new SparseArray();
                for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                    sparseArray2.put(sparseArray.keyAt(i10), new HashMap((Map) sparseArray.valueAt(i10)));
                }
                return sparseArray2;
            }

            private void b0() {
                this.C = true;
                this.D = false;
                this.E = true;
                this.F = false;
                this.G = true;
                this.H = false;
                this.I = false;
                this.J = false;
                this.K = false;
                this.L = true;
                this.M = true;
                this.N = true;
                this.O = false;
                this.P = true;
                this.Q = false;
            }

            @Override // t1.c0.c
            /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
            public e C() {
                return new e(this);
            }

            protected a c0(t1.c0 c0Var) {
                super.E(c0Var);
                return this;
            }

            @Override // t1.c0.c
            /* JADX INFO: renamed from: d0, reason: merged with bridge method [inline-methods] */
            public a F(Context context) {
                super.F(context);
                return this;
            }

            @Override // t1.c0.c
            /* JADX INFO: renamed from: e0, reason: merged with bridge method [inline-methods] */
            public a G(int i10, int i11, boolean z10) {
                super.G(i10, i11, z10);
                return this;
            }

            @Override // t1.c0.c
            /* JADX INFO: renamed from: f0, reason: merged with bridge method [inline-methods] */
            public a H(Context context, boolean z10) {
                super.H(context, z10);
                return this;
            }

            public a() {
                this.R = new SparseArray();
                this.S = new SparseBooleanArray();
                b0();
            }

            public a(Context context) {
                super(context);
                this.R = new SparseArray();
                this.S = new SparseBooleanArray();
                b0();
            }

            private a(e eVar) {
                super(eVar);
                this.C = eVar.f42900j0;
                this.D = eVar.f42901k0;
                this.E = eVar.f42902l0;
                this.F = eVar.f42903m0;
                this.G = eVar.f42904n0;
                this.H = eVar.f42905o0;
                this.I = eVar.f42906p0;
                this.J = eVar.f42907q0;
                this.K = eVar.f42908r0;
                this.L = eVar.f42909s0;
                this.M = eVar.f42910t0;
                this.N = eVar.f42911u0;
                this.O = eVar.f42912v0;
                this.P = eVar.f42913w0;
                this.Q = eVar.f42914x0;
                this.R = a0(eVar.f42915y0);
                this.S = eVar.f42916z0.clone();
            }
        }

        static {
            e eVarC = new a().C();
            A0 = eVarC;
            B0 = eVarC;
            C0 = c0.s0(1000);
            D0 = c0.s0(1001);
            E0 = c0.s0(1002);
            F0 = c0.s0(BackupConstant.SCENE_CLOSED_WITHOUT_SHOW);
            G0 = c0.s0(1004);
            H0 = c0.s0(GeofenceStatusCodes.GEOFENCE_REQUEST_TOO_FREQUENT);
            I0 = c0.s0(1006);
            J0 = c0.s0(1007);
            K0 = c0.s0(1008);
            L0 = c0.s0(1009);
            M0 = c0.s0(TTAdConstant.IMAGE_MODE_1010);
            N0 = c0.s0(TTAdConstant.IMAGE_MODE_1011);
            O0 = c0.s0(TTAdConstant.IMAGE_MODE_1012);
            P0 = c0.s0(1013);
            Q0 = c0.s0(1014);
            R0 = c0.s0(1015);
            S0 = c0.s0(1016);
            T0 = c0.s0(1017);
            U0 = c0.s0(1018);
        }

        private static boolean c(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
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

        private static boolean d(SparseArray sparseArray, SparseArray sparseArray2) {
            int size = sparseArray.size();
            if (sparseArray2.size() != size) {
                return false;
            }
            for (int i10 = 0; i10 < size; i10++) {
                int iIndexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i10));
                if (iIndexOfKey < 0 || !e((Map) sparseArray.valueAt(i10), (Map) sparseArray2.valueAt(iIndexOfKey))) {
                    return false;
                }
            }
            return true;
        }

        private static boolean e(Map map, Map map2) {
            if (map2.size() != map.size()) {
                return false;
            }
            for (Map.Entry entry : map.entrySet()) {
                i2.v vVar = (i2.v) entry.getKey();
                if (!map2.containsKey(vVar) || !c0.c(entry.getValue(), map2.get(vVar))) {
                    return false;
                }
            }
            return true;
        }

        public static e g(Context context) {
            return new a(context).C();
        }

        @Override // t1.c0
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && e.class == obj.getClass()) {
                e eVar = (e) obj;
                if (super.equals(eVar) && this.f42900j0 == eVar.f42900j0 && this.f42901k0 == eVar.f42901k0 && this.f42902l0 == eVar.f42902l0 && this.f42903m0 == eVar.f42903m0 && this.f42904n0 == eVar.f42904n0 && this.f42905o0 == eVar.f42905o0 && this.f42906p0 == eVar.f42906p0 && this.f42907q0 == eVar.f42907q0 && this.f42908r0 == eVar.f42908r0 && this.f42909s0 == eVar.f42909s0 && this.f42910t0 == eVar.f42910t0 && this.f42911u0 == eVar.f42911u0 && this.f42912v0 == eVar.f42912v0 && this.f42913w0 == eVar.f42913w0 && this.f42914x0 == eVar.f42914x0 && c(this.f42916z0, eVar.f42916z0) && d(this.f42915y0, eVar.f42915y0)) {
                    return true;
                }
            }
            return false;
        }

        public a f() {
            return new a();
        }

        public boolean h(int i10) {
            return this.f42916z0.get(i10);
        }

        @Override // t1.c0
        public int hashCode() {
            return ((((((((((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.f42900j0 ? 1 : 0)) * 31) + (this.f42901k0 ? 1 : 0)) * 31) + (this.f42902l0 ? 1 : 0)) * 31) + (this.f42903m0 ? 1 : 0)) * 31) + (this.f42904n0 ? 1 : 0)) * 31) + (this.f42905o0 ? 1 : 0)) * 31) + (this.f42906p0 ? 1 : 0)) * 31) + (this.f42907q0 ? 1 : 0)) * 31) + (this.f42908r0 ? 1 : 0)) * 31) + (this.f42909s0 ? 1 : 0)) * 31) + (this.f42910t0 ? 1 : 0)) * 31) + (this.f42911u0 ? 1 : 0)) * 31) + (this.f42912v0 ? 1 : 0)) * 31) + (this.f42913w0 ? 1 : 0)) * 31) + (this.f42914x0 ? 1 : 0);
        }

        public f i(int i10, i2.v vVar) {
            Map map = (Map) this.f42915y0.get(i10);
            if (map != null) {
                android.support.v4.media.session.b.a(map.get(vVar));
            }
            return null;
        }

        public boolean j(int i10, i2.v vVar) {
            Map map = (Map) this.f42915y0.get(i10);
            return map != null && map.containsKey(vVar);
        }

        private e(a aVar) {
            super(aVar);
            this.f42900j0 = aVar.C;
            this.f42901k0 = aVar.D;
            this.f42902l0 = aVar.E;
            this.f42903m0 = aVar.F;
            this.f42904n0 = aVar.G;
            this.f42905o0 = aVar.H;
            this.f42906p0 = aVar.I;
            this.f42907q0 = aVar.J;
            this.f42908r0 = aVar.K;
            this.f42909s0 = aVar.L;
            this.f42910t0 = aVar.M;
            this.f42911u0 = aVar.N;
            this.f42912v0 = aVar.O;
            this.f42913w0 = aVar.P;
            this.f42914x0 = aVar.Q;
            this.f42915y0 = aVar.R;
            this.f42916z0 = aVar.S;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    public static final class f {
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    private static class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Spatializer f42917a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f42918b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Handler f42919c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Spatializer$OnSpatializerStateChangedListener f42920d;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class a implements Spatializer$OnSpatializerStateChangedListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ n f42921a;

            a(n nVar) {
                this.f42921a = nVar;
            }

            public void onSpatializerAvailableChanged(Spatializer spatializer, boolean z10) {
                this.f42921a.N();
            }

            public void onSpatializerEnabledChanged(Spatializer spatializer, boolean z10) {
                this.f42921a.N();
            }
        }

        private g(Spatializer spatializer) {
            this.f42917a = spatializer;
            this.f42918b = spatializer.getImmersiveAudioLevel() != 0;
        }

        public static g g(Context context) {
            AudioManager audioManager = (AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
            if (audioManager == null) {
                return null;
            }
            return new g(audioManager.getSpatializer());
        }

        public boolean a(t1.b bVar, t1.o oVar) {
            int iL = c0.L((MimeTypes.AUDIO_E_AC3_JOC.equals(oVar.f52757n) && oVar.B == 16) ? 12 : oVar.B);
            if (iL == 0) {
                return false;
            }
            AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(iL);
            int i10 = oVar.C;
            if (i10 != -1) {
                channelMask.setSampleRate(i10);
            }
            return this.f42917a.canBeSpatialized(bVar.a().f52564a, channelMask.build());
        }

        public void b(n nVar, Looper looper) {
            if (this.f42920d == null && this.f42919c == null) {
                this.f42920d = new a(nVar);
                Handler handler = new Handler(looper);
                this.f42919c = handler;
                Spatializer spatializer = this.f42917a;
                Objects.requireNonNull(handler);
                spatializer.addOnSpatializerStateChangedListener(new d2.r(handler), this.f42920d);
            }
        }

        public boolean c() {
            return this.f42917a.isAvailable();
        }

        public boolean d() {
            return this.f42917a.isEnabled();
        }

        public boolean e() {
            return this.f42918b;
        }

        public void f() {
            Spatializer$OnSpatializerStateChangedListener spatializer$OnSpatializerStateChangedListener = this.f42920d;
            if (spatializer$OnSpatializerStateChangedListener == null || this.f42919c == null) {
                return;
            }
            this.f42917a.removeOnSpatializerStateChangedListener(spatializer$OnSpatializerStateChangedListener);
            ((Handler) c0.h(this.f42919c)).removeCallbacksAndMessages(null);
            this.f42919c = null;
            this.f42920d = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    static final class h extends i implements Comparable {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f42923e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final boolean f42924f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final boolean f42925g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final boolean f42926h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final int f42927i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final int f42928j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final int f42929k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final int f42930l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final boolean f42931m;

        public h(int i10, b0 b0Var, int i11, e eVar, int i12, String str) {
            int iE;
            super(i10, b0Var, i11);
            int i13 = 0;
            this.f42924f = g2.n(i12, false);
            int i14 = this.f42935d.f52748e & (~eVar.f52609v);
            this.f42925g = (i14 & 1) != 0;
            this.f42926h = (i14 & 2) != 0;
            com.google.common.collect.c0 c0VarD = eVar.f52607t.isEmpty() ? com.google.common.collect.c0.D("") : eVar.f52607t;
            int i15 = 0;
            while (true) {
                if (i15 >= c0VarD.size()) {
                    i15 = Integer.MAX_VALUE;
                    iE = 0;
                    break;
                } else {
                    iE = n.E(this.f42935d, (String) c0VarD.get(i15), eVar.f52610w);
                    if (iE > 0) {
                        break;
                    } else {
                        i15++;
                    }
                }
            }
            this.f42927i = i15;
            this.f42928j = iE;
            int iH = n.H(this.f42935d.f52749f, eVar.f52608u);
            this.f42929k = iH;
            this.f42931m = (this.f42935d.f52749f & 1088) != 0;
            int iE2 = n.E(this.f42935d, str, n.P(str) == null);
            this.f42930l = iE2;
            boolean z10 = iE > 0 || (eVar.f52607t.isEmpty() && iH > 0) || this.f42925g || (this.f42926h && iE2 > 0);
            if (g2.n(i12, eVar.f42911u0) && z10) {
                i13 = 1;
            }
            this.f42923e = i13;
        }

        public static int c(List list, List list2) {
            return ((h) list.get(0)).compareTo((h) list2.get(0));
        }

        public static com.google.common.collect.c0 e(int i10, b0 b0Var, e eVar, int[] iArr, String str) {
            com.google.common.collect.c0.a aVarR = com.google.common.collect.c0.r();
            for (int i11 = 0; i11 < b0Var.f52572a; i11++) {
                aVarR.a(new h(i10, b0Var, i11, eVar, iArr[i11], str));
            }
            return aVarR.m();
        }

        @Override // k2.n.i
        public int a() {
            return this.f42923e;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public int compareTo(h hVar) {
            com.google.common.collect.q qVarD = com.google.common.collect.q.j().g(this.f42924f, hVar.f42924f).f(Integer.valueOf(this.f42927i), Integer.valueOf(hVar.f42927i), w0.d().i()).d(this.f42928j, hVar.f42928j).d(this.f42929k, hVar.f42929k).g(this.f42925g, hVar.f42925g).f(Boolean.valueOf(this.f42926h), Boolean.valueOf(hVar.f42926h), this.f42928j == 0 ? w0.d() : w0.d().i()).d(this.f42930l, hVar.f42930l);
            if (this.f42929k == 0) {
                qVarD = qVarD.h(this.f42931m, hVar.f42931m);
            }
            return qVarD.i();
        }

        @Override // k2.n.i
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public boolean b(h hVar) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    static abstract class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f42932a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b0 f42933b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f42934c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final t1.o f42935d;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public interface a {
            List a(int i10, b0 b0Var, int[] iArr);
        }

        public i(int i10, b0 b0Var, int i11) {
            this.f42932a = i10;
            this.f42933b = b0Var;
            this.f42934c = i11;
            this.f42935d = b0Var.a(i11);
        }

        public abstract int a();

        public abstract boolean b(i iVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    static final class j extends i {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f42936e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final e f42937f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final boolean f42938g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final boolean f42939h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final boolean f42940i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final int f42941j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final int f42942k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final int f42943l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final int f42944m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final boolean f42945n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private final boolean f42946o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private final int f42947p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final boolean f42948q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final boolean f42949r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private final int f42950s;

        /* JADX WARN: Code duplicated, block: B:31:0x004b  */
        /* JADX WARN: Code duplicated, block: B:51:0x0079  */
        public j(int i10, b0 b0Var, int i11, e eVar, int i12, int i13, boolean z10) {
            boolean z11;
            boolean z12;
            t1.o oVar;
            int i14;
            int i15;
            int i16;
            t1.o oVar2;
            int i17;
            int i18;
            int i19;
            super(i10, b0Var, i11);
            this.f42937f = eVar;
            int i20 = eVar.f42902l0 ? 24 : 16;
            this.f42946o = eVar.f42901k0 && (i13 & i20) != 0;
            if (!z10 || (((i17 = (oVar2 = this.f42935d).f52763t) != -1 && i17 > eVar.f52588a) || ((i18 = oVar2.f52764u) != -1 && i18 > eVar.f52589b))) {
                z11 = false;
            } else {
                float f10 = oVar2.f52765v;
                if ((f10 == -1.0f || f10 <= eVar.f52590c) && ((i19 = oVar2.f52752i) == -1 || i19 <= eVar.f52591d)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            }
            this.f42936e = z11;
            if (!z10 || (((i14 = (oVar = this.f42935d).f52763t) != -1 && i14 < eVar.f52592e) || ((i15 = oVar.f52764u) != -1 && i15 < eVar.f52593f))) {
                z12 = false;
            } else {
                float f11 = oVar.f52765v;
                if ((f11 == -1.0f || f11 >= eVar.f52594g) && ((i16 = oVar.f52752i) == -1 || i16 >= eVar.f52595h)) {
                    z12 = true;
                } else {
                    z12 = false;
                }
            }
            this.f42938g = z12;
            this.f42939h = g2.n(i12, false);
            t1.o oVar3 = this.f42935d;
            float f12 = oVar3.f52765v;
            this.f42940i = f12 != -1.0f && f12 >= 10.0f;
            this.f42941j = oVar3.f52752i;
            this.f42942k = oVar3.d();
            this.f42944m = n.H(this.f42935d.f52749f, eVar.f52600m);
            int i21 = this.f42935d.f52749f;
            this.f42945n = i21 == 0 || (i21 & 1) != 0;
            int i22 = 0;
            while (true) {
                if (i22 >= eVar.f52599l.size()) {
                    i22 = Integer.MAX_VALUE;
                    break;
                }
                String str = this.f42935d.f52757n;
                if (str != null && str.equals(eVar.f52599l.get(i22))) {
                    break;
                } else {
                    i22++;
                }
            }
            this.f42943l = i22;
            this.f42948q = g2.d(i12) == 128;
            this.f42949r = g2.j(i12) == 64;
            this.f42950s = n.I(this.f42935d.f52757n);
            this.f42947p = i(i12, i20);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int e(j jVar, j jVar2) {
            com.google.common.collect.q qVarG = com.google.common.collect.q.j().g(jVar.f42939h, jVar2.f42939h).d(jVar.f42944m, jVar2.f42944m).g(jVar.f42945n, jVar2.f42945n).g(jVar.f42940i, jVar2.f42940i).g(jVar.f42936e, jVar2.f42936e).g(jVar.f42938g, jVar2.f42938g).f(Integer.valueOf(jVar.f42943l), Integer.valueOf(jVar2.f42943l), w0.d().i()).g(jVar.f42948q, jVar2.f42948q).g(jVar.f42949r, jVar2.f42949r);
            if (jVar.f42948q && jVar.f42949r) {
                qVarG = qVarG.d(jVar.f42950s, jVar2.f42950s);
            }
            return qVarG.i();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int f(j jVar, j jVar2) {
            w0 w0VarI = (jVar.f42936e && jVar.f42939h) ? n.f42869k : n.f42869k.i();
            com.google.common.collect.q qVarJ = com.google.common.collect.q.j();
            if (jVar.f42937f.f52612y) {
                qVarJ = qVarJ.f(Integer.valueOf(jVar.f42941j), Integer.valueOf(jVar2.f42941j), n.f42869k.i());
            }
            return qVarJ.f(Integer.valueOf(jVar.f42942k), Integer.valueOf(jVar2.f42942k), w0VarI).f(Integer.valueOf(jVar.f42941j), Integer.valueOf(jVar2.f42941j), w0VarI).i();
        }

        public static int g(List list, List list2) {
            return com.google.common.collect.q.j().f((j) Collections.max(list, new Comparator() { // from class: k2.o
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return n.j.e((n.j) obj, (n.j) obj2);
                }
            }), (j) Collections.max(list2, new Comparator() { // from class: k2.o
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return n.j.e((n.j) obj, (n.j) obj2);
                }
            }), new Comparator() { // from class: k2.o
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return n.j.e((n.j) obj, (n.j) obj2);
                }
            }).d(list.size(), list2.size()).f((j) Collections.max(list, new Comparator() { // from class: k2.p
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return n.j.f((n.j) obj, (n.j) obj2);
                }
            }), (j) Collections.max(list2, new Comparator() { // from class: k2.p
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return n.j.f((n.j) obj, (n.j) obj2);
                }
            }), new Comparator() { // from class: k2.p
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return n.j.f((n.j) obj, (n.j) obj2);
                }
            }).i();
        }

        public static com.google.common.collect.c0 h(int i10, b0 b0Var, e eVar, int[] iArr, int i11) {
            int iF = n.F(b0Var, eVar.f52596i, eVar.f52597j, eVar.f52598k);
            com.google.common.collect.c0.a aVarR = com.google.common.collect.c0.r();
            for (int i12 = 0; i12 < b0Var.f52572a; i12++) {
                int iD = b0Var.a(i12).d();
                aVarR.a(new j(i10, b0Var, i12, eVar, iArr[i12], i11, iF == Integer.MAX_VALUE || (iD != -1 && iD <= iF)));
            }
            return aVarR.m();
        }

        private int i(int i10, int i11) {
            if ((this.f42935d.f52749f & 16384) != 0 || !g2.n(i10, this.f42937f.f42911u0)) {
                return 0;
            }
            if (!this.f42936e && !this.f42937f.f42900j0) {
                return 0;
            }
            if (!g2.n(i10, false) || !this.f42938g || !this.f42936e || this.f42935d.f52752i == -1) {
                return 1;
            }
            e eVar = this.f42937f;
            return (eVar.f52613z || eVar.f52612y || (i10 & i11) == 0) ? 1 : 2;
        }

        @Override // k2.n.i
        public int a() {
            return this.f42947p;
        }

        @Override // k2.n.i
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean b(j jVar) {
            if (!this.f42946o && !c0.c(this.f42935d.f52757n, jVar.f42935d.f52757n)) {
                return false;
            }
            if (this.f42937f.f42903m0) {
                return true;
            }
            return this.f42948q == jVar.f42948q && this.f42949r == jVar.f42949r;
        }
    }

    public n(Context context) {
        this(context, new k2.a.b());
    }

    private static void B(s.a aVar, e eVar, q.a[] aVarArr) {
        int iD = aVar.d();
        for (int i10 = 0; i10 < iD; i10++) {
            i2.v vVarF = aVar.f(i10);
            if (eVar.j(i10, vVarF)) {
                eVar.i(i10, vVarF);
                aVarArr[i10] = null;
            }
        }
    }

    private static void C(s.a aVar, t1.c0 c0Var, q.a[] aVarArr) {
        int iD = aVar.d();
        HashMap map = new HashMap();
        for (int i10 = 0; i10 < iD; i10++) {
            D(aVar.f(i10), c0Var, map);
        }
        D(aVar.h(), c0Var, map);
        for (int i11 = 0; i11 < iD; i11++) {
            android.support.v4.media.session.b.a(map.get(Integer.valueOf(aVar.e(i11))));
        }
    }

    private static void D(i2.v vVar, t1.c0 c0Var, Map map) {
        for (int i10 = 0; i10 < vVar.f40818a; i10++) {
            android.support.v4.media.session.b.a(c0Var.A.get(vVar.b(i10)));
        }
    }

    protected static int E(t1.o oVar, String str, boolean z10) {
        if (!TextUtils.isEmpty(str) && str.equals(oVar.f52747d)) {
            return 4;
        }
        String strP = P(str);
        String strP2 = P(oVar.f52747d);
        if (strP2 == null || strP == null) {
            return (z10 && strP2 == null) ? 1 : 0;
        }
        if (strP2.startsWith(strP) || strP.startsWith(strP2)) {
            return 3;
        }
        return c0.V0(strP2, "-")[0].equals(c0.V0(strP, "-")[0]) ? 2 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int F(b0 b0Var, int i10, int i11, boolean z10) {
        int i12;
        int i13 = Integer.MAX_VALUE;
        if (i10 != Integer.MAX_VALUE && i11 != Integer.MAX_VALUE) {
            for (int i14 = 0; i14 < b0Var.f52572a; i14++) {
                t1.o oVarA = b0Var.a(i14);
                int i15 = oVarA.f52763t;
                if (i15 > 0 && (i12 = oVarA.f52764u) > 0) {
                    Point pointG = G(z10, i10, i11, i15, i12);
                    int i16 = oVarA.f52763t;
                    int i17 = oVarA.f52764u;
                    int i18 = i16 * i17;
                    if (i16 >= ((int) (pointG.x * 0.98f)) && i17 >= ((int) (pointG.y * 0.98f)) && i18 < i13) {
                        i13 = i18;
                    }
                }
            }
        }
        return i13;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x000f  */
    private static Point G(boolean z10, int i10, int i11, int i12, int i13) {
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
        return i14 >= i15 ? new Point(i11, c0.j(i15, i12)) : new Point(c0.j(i14, i13), i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int H(int i10, int i11) {
        if (i10 == 0 || i10 != i11) {
            return Integer.bitCount(i10 & i11);
        }
        return Integer.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int I(String str) {
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
    public boolean J(t1.o oVar) {
        boolean z10;
        g gVar;
        g gVar2;
        synchronized (this.f42870d) {
            try {
                if (this.f42874h.f42910t0 && !this.f42873g && oVar.B > 2 && (!K(oVar) || (c0.f55769a >= 32 && (gVar2 = this.f42875i) != null && gVar2.e()))) {
                    z10 = c0.f55769a >= 32 && (gVar = this.f42875i) != null && gVar.e() && this.f42875i.c() && this.f42875i.d() && this.f42875i.a(this.f42876j, oVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    private static void L(e eVar, s.a aVar, int[][][] iArr, h2[] h2VarArr, q[] qVarArr) {
        int i10 = -1;
        boolean z10 = false;
        int i11 = 0;
        for (int i12 = 0; i12 < aVar.d(); i12++) {
            int iE = aVar.e(i12);
            q qVar = qVarArr[i12];
            if (iE != 1 && qVar != null) {
                return;
            }
            if (iE == 1 && qVar != null && qVar.length() == 1) {
                if (Q(eVar, iArr[i12][aVar.f(i12).d(qVar.getTrackGroup())][qVar.getIndexInTrackGroup(0)], qVar.getSelectedFormat())) {
                    i11++;
                    i10 = i12;
                }
            }
        }
        if (i11 == 1) {
            int i13 = eVar.f52606s.f52619b ? 1 : 2;
            h2 h2Var = h2VarArr[i10];
            if (h2Var != null && h2Var.f5381b) {
                z10 = true;
            }
            h2VarArr[i10] = new h2(i13, z10);
        }
    }

    private static void M(s.a aVar, int[][][] iArr, h2[] h2VarArr, q[] qVarArr) {
        boolean z10;
        int i10 = -1;
        int i11 = -1;
        int i12 = 0;
        while (true) {
            if (i12 >= aVar.d()) {
                z10 = true;
                break;
            }
            int iE = aVar.e(i12);
            q qVar = qVarArr[i12];
            if ((iE == 1 || iE == 2) && qVar != null && R(iArr[i12], aVar.f(i12), qVar)) {
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
        if (z10 && ((i11 == -1 || i10 == -1) ? false : true)) {
            h2 h2Var = new h2(0, true);
            h2VarArr[i11] = h2Var;
            h2VarArr[i10] = h2Var;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N() {
        boolean z10;
        g gVar;
        synchronized (this.f42870d) {
            try {
                z10 = this.f42874h.f42910t0 && !this.f42873g && c0.f55769a >= 32 && (gVar = this.f42875i) != null && gVar.e();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            e();
        }
    }

    private void O(f2 f2Var) {
        boolean z10;
        synchronized (this.f42870d) {
            z10 = this.f42874h.f42914x0;
        }
        if (z10) {
            f(f2Var);
        }
    }

    protected static String P(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, C.LANGUAGE_UNDETERMINED)) {
            return null;
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean Q(e eVar, int i10, t1.o oVar) {
        if (g2.r(i10) == 0) {
            return false;
        }
        if (eVar.f52606s.f52620c && (g2.r(i10) & 2048) == 0) {
            return false;
        }
        if (eVar.f52606s.f52619b) {
            boolean z10 = (oVar.E == 0 && oVar.F == 0) ? false : true;
            boolean z11 = (g2.r(i10) & UserVerificationMethods.USER_VERIFY_ALL) != 0;
            if (z10 && !z11) {
                return false;
            }
        }
        return true;
    }

    private static boolean R(int[][] iArr, i2.v vVar, q qVar) {
        if (qVar == null) {
            return false;
        }
        int iD = vVar.d(qVar.getTrackGroup());
        for (int i10 = 0; i10 < qVar.length(); i10++) {
            if (g2.f(iArr[iD][qVar.getIndexInTrackGroup(i10)]) != 32) {
                return false;
            }
        }
        return true;
    }

    private Pair X(int i10, s.a aVar, int[][][] iArr, i.a aVar2, Comparator comparator) {
        int i11;
        RandomAccess randomAccessD;
        s.a aVar3 = aVar;
        ArrayList arrayList = new ArrayList();
        int iD = aVar3.d();
        int i12 = 0;
        while (i12 < iD) {
            if (i10 == aVar3.e(i12)) {
                i2.v vVarF = aVar3.f(i12);
                for (int i13 = 0; i13 < vVarF.f40818a; i13++) {
                    b0 b0VarB = vVarF.b(i13);
                    List listA = aVar2.a(i12, b0VarB, iArr[i12][i13]);
                    boolean[] zArr = new boolean[b0VarB.f52572a];
                    int i14 = 0;
                    while (i14 < b0VarB.f52572a) {
                        i iVar = (i) listA.get(i14);
                        int iA = iVar.a();
                        if (zArr[i14] || iA == 0) {
                            i11 = iD;
                        } else {
                            if (iA == 1) {
                                randomAccessD = com.google.common.collect.c0.D(iVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(iVar);
                                int i15 = i14 + 1;
                                while (i15 < b0VarB.f52572a) {
                                    i iVar2 = (i) listA.get(i15);
                                    int i16 = iD;
                                    if (iVar2.a() == 2 && iVar.b(iVar2)) {
                                        arrayList2.add(iVar2);
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
            iArr2[i17] = ((i) list.get(i17)).f42934c;
        }
        i iVar3 = (i) list.get(0);
        return Pair.create(new q.a(iVar3.f42933b, iArr2), Integer.valueOf(iVar3.f42932a));
    }

    public static /* synthetic */ List r(final n nVar, e eVar, boolean z10, int[] iArr, int i10, b0 b0Var, int[] iArr2) {
        nVar.getClass();
        return b.e(i10, b0Var, eVar, iArr2, z10, new sc.q() { // from class: k2.m
            @Override // sc.q
            public final boolean apply(Object obj) {
                return this.f42868a.J((t1.o) obj);
            }
        }, iArr[i10]);
    }

    public static /* synthetic */ int t(Integer num, Integer num2) {
        if (num.intValue() == -1) {
            return num2.intValue() == -1 ? 0 : -1;
        }
        if (num2.intValue() == -1) {
            return 1;
        }
        return num.intValue() - num2.intValue();
    }

    protected q.a[] S(s.a aVar, int[][][] iArr, int[] iArr2, e eVar) {
        int iD = aVar.d();
        q.a[] aVarArr = new q.a[iD];
        Pair pairY = Y(aVar, iArr, iArr2, eVar);
        String str = null;
        Pair pairU = (eVar.f52611x || pairY == null) ? U(aVar, iArr, eVar) : null;
        if (pairU != null) {
            aVarArr[((Integer) pairU.second).intValue()] = (q.a) pairU.first;
        } else if (pairY != null) {
            aVarArr[((Integer) pairY.second).intValue()] = (q.a) pairY.first;
        }
        Pair pairT = T(aVar, iArr, iArr2, eVar);
        if (pairT != null) {
            aVarArr[((Integer) pairT.second).intValue()] = (q.a) pairT.first;
        }
        if (pairT != null) {
            Object obj = pairT.first;
            str = ((q.a) obj).f42951a.a(((q.a) obj).f42952b[0]).f52747d;
        }
        Pair pairW = W(aVar, iArr, eVar, str);
        if (pairW != null) {
            aVarArr[((Integer) pairW.second).intValue()] = (q.a) pairW.first;
        }
        for (int i10 = 0; i10 < iD; i10++) {
            int iE = aVar.e(i10);
            if (iE != 2 && iE != 1 && iE != 3 && iE != 4) {
                aVarArr[i10] = V(iE, aVar.f(i10), iArr[i10], eVar);
            }
        }
        return aVarArr;
    }

    protected Pair T(s.a aVar, int[][][] iArr, final int[] iArr2, final e eVar) {
        final boolean z10 = false;
        for (int i10 = 0; i10 < aVar.d(); i10++) {
            if (2 == aVar.e(i10) && aVar.f(i10).f40818a > 0) {
                z10 = true;
                break;
            }
        }
        return X(1, aVar, iArr, new i.a() { // from class: k2.g
            @Override // k2.n.i.a
            public final List a(int i11, b0 b0Var, int[] iArr3) {
                return n.r(this.f42860a, eVar, z10, iArr2, i11, b0Var, iArr3);
            }
        }, new Comparator() { // from class: k2.h
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return n.b.c((List) obj, (List) obj2);
            }
        });
    }

    protected Pair U(s.a aVar, int[][][] iArr, final e eVar) {
        if (eVar.f52606s.f52618a == 2) {
            return null;
        }
        return X(4, aVar, iArr, new i.a() { // from class: k2.e
            @Override // k2.n.i.a
            public final List a(int i10, b0 b0Var, int[] iArr2) {
                return n.c.e(i10, b0Var, eVar, iArr2);
            }
        }, new Comparator() { // from class: k2.f
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return n.c.c((List) obj, (List) obj2);
            }
        });
    }

    protected q.a V(int i10, i2.v vVar, int[][] iArr, e eVar) {
        if (eVar.f52606s.f52618a == 2) {
            return null;
        }
        int i11 = 0;
        b0 b0Var = null;
        d dVar = null;
        for (int i12 = 0; i12 < vVar.f40818a; i12++) {
            b0 b0VarB = vVar.b(i12);
            int[] iArr2 = iArr[i12];
            for (int i13 = 0; i13 < b0VarB.f52572a; i13++) {
                if (g2.n(iArr2[i13], eVar.f42911u0)) {
                    d dVar2 = new d(b0VarB.a(i13), iArr2[i13]);
                    if (dVar == null || dVar2.compareTo(dVar) > 0) {
                        b0Var = b0VarB;
                        i11 = i13;
                        dVar = dVar2;
                    }
                }
            }
        }
        if (b0Var == null) {
            return null;
        }
        return new q.a(b0Var, i11);
    }

    protected Pair W(s.a aVar, int[][][] iArr, final e eVar, final String str) {
        if (eVar.f52606s.f52618a == 2) {
            return null;
        }
        return X(3, aVar, iArr, new i.a() { // from class: k2.k
            @Override // k2.n.i.a
            public final List a(int i10, b0 b0Var, int[] iArr2) {
                return n.h.e(i10, b0Var, eVar, iArr2, str);
            }
        }, new Comparator() { // from class: k2.l
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return n.h.c((List) obj, (List) obj2);
            }
        });
    }

    protected Pair Y(s.a aVar, int[][][] iArr, final int[] iArr2, final e eVar) {
        if (eVar.f52606s.f52618a == 2) {
            return null;
        }
        return X(2, aVar, iArr, new i.a() { // from class: k2.i
            @Override // k2.n.i.a
            public final List a(int i10, b0 b0Var, int[] iArr3) {
                return n.j.h(i10, b0Var, eVar, iArr3, iArr2[i10]);
            }
        }, new Comparator() { // from class: k2.j
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return n.j.g((List) obj, (List) obj2);
            }
        });
    }

    @Override // androidx.media3.exoplayer.g2.a
    public void a(f2 f2Var) {
        O(f2Var);
    }

    @Override // k2.v
    public g2.a c() {
        return this;
    }

    @Override // k2.v
    public boolean g() {
        return true;
    }

    @Override // k2.v
    public void i() {
        g gVar;
        synchronized (this.f42870d) {
            try {
                if (c0.f55769a >= 32 && (gVar = this.f42875i) != null) {
                    gVar.f();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        super.i();
    }

    @Override // k2.v
    public void k(t1.b bVar) {
        boolean zEquals;
        synchronized (this.f42870d) {
            zEquals = this.f42876j.equals(bVar);
            this.f42876j = bVar;
        }
        if (zEquals) {
            return;
        }
        N();
    }

    @Override // k2.s
    protected final Pair o(s.a aVar, int[][][] iArr, int[] iArr2, androidx.media3.exoplayer.source.r.b bVar, a0 a0Var) {
        e eVar;
        g gVar;
        synchronized (this.f42870d) {
            try {
                eVar = this.f42874h;
                if (eVar.f42910t0 && c0.f55769a >= 32 && (gVar = this.f42875i) != null) {
                    gVar.b(this, (Looper) w1.a.i(Looper.myLooper()));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        int iD = aVar.d();
        q.a[] aVarArrS = S(aVar, iArr, iArr2, eVar);
        C(aVar, eVar, aVarArrS);
        B(aVar, eVar, aVarArrS);
        for (int i10 = 0; i10 < iD; i10++) {
            int iE = aVar.e(i10);
            if (eVar.h(i10) || eVar.B.contains(Integer.valueOf(iE))) {
                aVarArrS[i10] = null;
            }
        }
        q[] qVarArrA = this.f42872f.a(aVarArrS, b(), bVar, a0Var);
        h2[] h2VarArr = new h2[iD];
        for (int i11 = 0; i11 < iD; i11++) {
            h2VarArr[i11] = (eVar.h(i11) || eVar.B.contains(Integer.valueOf(aVar.e(i11))) || (aVar.e(i11) != -2 && qVarArrA[i11] == null)) ? null : h2.f5379c;
        }
        if (eVar.f42912v0) {
            M(aVar, iArr, h2VarArr, qVarArrA);
        }
        if (eVar.f52606s.f52618a != 0) {
            L(eVar, aVar, iArr, h2VarArr, qVarArrA);
        }
        return Pair.create(h2VarArr, qVarArrA);
    }

    public n(Context context, q.b bVar) {
        this(context, e.g(context), bVar);
    }

    private static boolean K(t1.o oVar) {
        String str = oVar.f52757n;
        if (str == null) {
            return false;
        }
        str.getClass();
        byte b10 = -1;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals(MimeTypes.AUDIO_E_AC3_JOC)) {
                    b10 = 0;
                }
                break;
            case 187078296:
                if (str.equals(MimeTypes.AUDIO_AC3)) {
                    b10 = 1;
                }
                break;
            case 187078297:
                if (str.equals(NpmRNZ.YcxCk)) {
                    b10 = 2;
                }
                break;
            case 1504578661:
                if (str.equals(MimeTypes.AUDIO_E_AC3)) {
                    b10 = 3;
                }
                break;
        }
        switch (b10) {
            case 0:
            case 1:
            case 2:
            case 3:
                return true;
            default:
                return false;
        }
    }

    public n(Context context, t1.c0 c0Var, q.b bVar) {
        this(c0Var, bVar, context);
    }

    private n(t1.c0 c0Var, q.b bVar, Context context) {
        this.f42870d = new Object();
        this.f42871e = context != null ? context.getApplicationContext() : null;
        this.f42872f = bVar;
        if (c0Var instanceof e) {
            this.f42874h = (e) c0Var;
        } else {
            this.f42874h = (context == null ? e.A0 : e.g(context)).f().c0(c0Var).C();
        }
        this.f42876j = t1.b.f52552g;
        boolean z10 = context != null && c0.A0(context);
        this.f42873g = z10;
        if (!z10 && context != null && c0.f55769a >= 32) {
            this.f42875i = g.g(context);
        }
        if (this.f42874h.f42910t0 && context == null) {
            w1.n.h("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }
}
