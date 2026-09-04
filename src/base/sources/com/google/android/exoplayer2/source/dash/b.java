package com.google.android.exoplayer2.source.dash;

import android.util.Pair;
import android.util.SparseArray;
import com.google.android.exoplayer2.drm.j;
import com.google.android.exoplayer2.source.d0;
import com.google.android.exoplayer2.source.o;
import com.google.android.exoplayer2.source.q;
import com.google.android.exoplayer2.v0;
import com.google.common.collect.n0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import lb.r;
import nb.a0;
import nb.f;
import nb.v;
import o9.j0;
import ob.r0;
import p9.s1;
import ra.h;
import ra.s;
import ra.x;
import ta.i;
import va.g;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class b implements o, d0.a, i.b {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final Pattern f17538y = Pattern.compile("CC([1-4])=(.+)");

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final Pattern f17539z = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f17540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.exoplayer2.source.dash.a.InterfaceC0284a f17541b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a0 f17542c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final j f17543d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.exoplayer2.upstream.c f17544e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ua.b f17545f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f17546g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final v f17547h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final nb.b f17548i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final x f17549j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final a[] f17550k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final ra.d f17551l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final e f17552m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final q.a f17554o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final com.google.android.exoplayer2.drm.i.a f17555p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final s1 f17556q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private o.a f17557r;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private d0 f17560u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private va.c f17561v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f17562w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private List f17563x;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private i[] f17558s = u(0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private d[] f17559t = new d[0];

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final IdentityHashMap f17553n = new IdentityHashMap();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int[] f17564a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f17565b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f17566c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f17567d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f17568e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f17569f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f17570g;

        private a(int i10, int i11, int[] iArr, int i12, int i13, int i14, int i15) {
            this.f17565b = i10;
            this.f17564a = iArr;
            this.f17566c = i11;
            this.f17568e = i12;
            this.f17569f = i13;
            this.f17570g = i14;
            this.f17567d = i15;
        }

        public static a a(int[] iArr, int i10) {
            return new a(3, 1, iArr, i10, -1, -1, -1);
        }

        public static a b(int[] iArr, int i10) {
            return new a(5, 1, iArr, i10, -1, -1, -1);
        }

        public static a c(int i10) {
            return new a(5, 2, new int[0], -1, -1, -1, i10);
        }

        public static a d(int i10, int[] iArr, int i11, int i12, int i13) {
            return new a(i10, 0, iArr, i11, i12, i13, -1);
        }
    }

    public b(int i10, va.c cVar, ua.b bVar, int i11, com.google.android.exoplayer2.source.dash.a.InterfaceC0284a interfaceC0284a, a0 a0Var, f fVar, j jVar, com.google.android.exoplayer2.drm.i.a aVar, com.google.android.exoplayer2.upstream.c cVar2, q.a aVar2, long j10, v vVar, nb.b bVar2, ra.d dVar, e.b bVar3, s1 s1Var) {
        this.f17540a = i10;
        this.f17561v = cVar;
        this.f17545f = bVar;
        this.f17562w = i11;
        this.f17541b = interfaceC0284a;
        this.f17542c = a0Var;
        this.f17543d = jVar;
        this.f17555p = aVar;
        this.f17544e = cVar2;
        this.f17554o = aVar2;
        this.f17546g = j10;
        this.f17547h = vVar;
        this.f17548i = bVar2;
        this.f17551l = dVar;
        this.f17556q = s1Var;
        this.f17552m = new e(cVar, bVar3, bVar2);
        this.f17560u = dVar.a(this.f17558s);
        g gVarC = cVar.c(i11);
        List list = gVarC.f55341d;
        this.f17563x = list;
        Pair pairK = k(jVar, gVarC.f55340c, list);
        this.f17549j = (x) pairK.first;
        this.f17550k = (a[]) pairK.second;
    }

    private void A(r[] rVarArr, s[] sVarArr, boolean[] zArr, long j10, int[] iArr) {
        for (int i10 = 0; i10 < rVarArr.length; i10++) {
            r rVar = rVarArr[i10];
            if (rVar != null) {
                s sVar = sVarArr[i10];
                if (sVar == null) {
                    zArr[i10] = true;
                    a aVar = this.f17550k[iArr[i10]];
                    int i11 = aVar.f17566c;
                    if (i11 == 0) {
                        sVarArr[i10] = j(aVar, rVar, j10);
                    } else if (i11 == 2) {
                        sVarArr[i10] = new d((va.f) this.f17563x.get(aVar.f17567d), rVar.getTrackGroup().c(0), this.f17561v.f55306d);
                    }
                } else if (sVar instanceof i) {
                    ((com.google.android.exoplayer2.source.dash.a) ((i) sVar).q()).a(rVar);
                }
            }
        }
        for (int i12 = 0; i12 < rVarArr.length; i12++) {
            if (sVarArr[i12] == null && rVarArr[i12] != null) {
                a aVar2 = this.f17550k[iArr[i12]];
                if (aVar2.f17566c == 1) {
                    int iQ = q(i12, iArr);
                    if (iQ == -1) {
                        sVarArr[i12] = new h();
                    } else {
                        sVarArr[i12] = ((i) sVarArr[iQ]).F(j10, aVar2.f17565b);
                    }
                }
            }
        }
    }

    private static void h(List list, ra.v[] vVarArr, a[] aVarArr, int i10) {
        int i11 = 0;
        while (i11 < list.size()) {
            va.f fVar = (va.f) list.get(i11);
            vVarArr[i10] = new ra.v(fVar.a() + ":" + i11, new v0.b().U(fVar.a()).g0(MimeTypes.APPLICATION_EMSG).G());
            aVarArr[i10] = a.c(i11);
            i11++;
            i10++;
        }
    }

    private static int i(j jVar, List list, int[][] iArr, int i10, boolean[] zArr, v0[][] v0VarArr, ra.v[] vVarArr, a[] aVarArr) {
        int i11;
        int i12;
        int i13 = 0;
        int i14 = 0;
        while (i13 < i10) {
            int[] iArr2 = iArr[i13];
            ArrayList arrayList = new ArrayList();
            for (int i15 : iArr2) {
                arrayList.addAll(((va.a) list.get(i15)).f55295c);
            }
            int size = arrayList.size();
            v0[] v0VarArr2 = new v0[size];
            for (int i16 = 0; i16 < size; i16++) {
                v0 v0Var = ((va.j) arrayList.get(i16)).f55353b;
                v0VarArr2[i16] = v0Var.c(jVar.b(v0Var));
            }
            va.a aVar = (va.a) list.get(iArr2[0]);
            long j10 = aVar.f55293a;
            String string = j10 != -1 ? Long.toString(j10) : "unset:" + i13;
            int i17 = i14 + 1;
            if (zArr[i13]) {
                i11 = i14 + 2;
            } else {
                i11 = i17;
                i17 = -1;
            }
            if (v0VarArr[i13].length != 0) {
                i12 = i11 + 1;
            } else {
                i12 = i11;
                i11 = -1;
            }
            vVarArr[i14] = new ra.v(string, v0VarArr2);
            aVarArr[i14] = a.d(aVar.f55294b, iArr2, i14, i17, i11);
            if (i17 != -1) {
                String str = string + ":emsg";
                vVarArr[i17] = new ra.v(str, new v0.b().U(str).g0(MimeTypes.APPLICATION_EMSG).G());
                aVarArr[i17] = a.b(iArr2, i14);
            }
            if (i11 != -1) {
                vVarArr[i11] = new ra.v(string + ":cc", v0VarArr[i13]);
                aVarArr[i11] = a.a(iArr2, i14);
            }
            i13++;
            i14 = i12;
        }
        return i14;
    }

    private i j(a aVar, r rVar, long j10) {
        int i10;
        ra.v vVarB;
        ra.v vVarB2;
        int i11;
        int i12 = aVar.f17569f;
        boolean z10 = i12 != -1;
        e.c cVarK = null;
        if (z10) {
            vVarB = this.f17549j.b(i12);
            i10 = 1;
        } else {
            i10 = 0;
            vVarB = null;
        }
        int i13 = aVar.f17570g;
        boolean z11 = i13 != -1;
        if (z11) {
            vVarB2 = this.f17549j.b(i13);
            i10 += vVarB2.f51248a;
        } else {
            vVarB2 = null;
        }
        v0[] v0VarArr = new v0[i10];
        int[] iArr = new int[i10];
        if (z10) {
            v0VarArr[0] = vVarB.c(0);
            iArr[0] = 5;
            i11 = 1;
        } else {
            i11 = 0;
        }
        ArrayList arrayList = new ArrayList();
        if (z11) {
            for (int i14 = 0; i14 < vVarB2.f51248a; i14++) {
                v0 v0VarC = vVarB2.c(i14);
                v0VarArr[i11] = v0VarC;
                iArr[i11] = 3;
                arrayList.add(v0VarC);
                i11++;
            }
        }
        if (this.f17561v.f55306d && z10) {
            cVarK = this.f17552m.k();
        }
        e.c cVar = cVarK;
        i iVar = new i(aVar.f17565b, iArr, v0VarArr, this.f17541b.a(this.f17547h, this.f17561v, this.f17545f, this.f17562w, aVar.f17564a, rVar, aVar.f17565b, this.f17546g, z10, arrayList, cVar, this.f17542c, this.f17556q, null), this, this.f17548i, j10, this.f17543d, this.f17555p, this.f17544e, this.f17554o);
        synchronized (this) {
            this.f17553n.put(iVar, cVar);
        }
        return iVar;
    }

    private static Pair k(j jVar, List list, List list2) {
        int[][] iArrP = p(list);
        int length = iArrP.length;
        boolean[] zArr = new boolean[length];
        v0[][] v0VarArr = new v0[length][];
        int iT = t(length, list, iArrP, zArr, v0VarArr) + length + list2.size();
        ra.v[] vVarArr = new ra.v[iT];
        a[] aVarArr = new a[iT];
        h(list2, vVarArr, aVarArr, i(jVar, list, iArrP, length, zArr, v0VarArr, vVarArr, aVarArr));
        return Pair.create(new x(vVarArr), aVarArr);
    }

    private static va.e l(List list) {
        return m(list, "urn:mpeg:dash:adaptation-set-switching:2016");
    }

    private static va.e m(List list, String str) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            va.e eVar = (va.e) list.get(i10);
            if (str.equals(eVar.f55330a)) {
                return eVar;
            }
        }
        return null;
    }

    private static va.e n(List list) {
        return m(list, "http://dashif.org/guidelines/trickmode");
    }

    private static v0[] o(List list, int[] iArr) {
        for (int i10 : iArr) {
            va.a aVar = (va.a) list.get(i10);
            List list2 = ((va.a) list.get(i10)).f55296d;
            for (int i11 = 0; i11 < list2.size(); i11++) {
                va.e eVar = (va.e) list2.get(i11);
                if ("urn:scte:dash:cc:cea-608:2015".equals(eVar.f55330a)) {
                    return w(eVar, f17538y, new v0.b().g0(MimeTypes.APPLICATION_CEA608).U(aVar.f55293a + ":cea608").G());
                }
                if ("urn:scte:dash:cc:cea-708:2015".equals(eVar.f55330a)) {
                    return w(eVar, f17539z, new v0.b().g0(MimeTypes.APPLICATION_CEA708).U(aVar.f55293a + ":cea708").G());
                }
            }
        }
        return new v0[0];
    }

    private static int[][] p(List list) {
        va.e eVarL;
        Integer num;
        int size = list.size();
        HashMap mapG = n0.g(size);
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i10 = 0; i10 < size; i10++) {
            mapG.put(Long.valueOf(((va.a) list.get(i10)).f55293a), Integer.valueOf(i10));
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i10));
            arrayList.add(arrayList2);
            sparseArray.put(i10, arrayList2);
        }
        for (int i11 = 0; i11 < size; i11++) {
            va.a aVar = (va.a) list.get(i11);
            va.e eVarN = n(aVar.f55297e);
            if (eVarN == null) {
                eVarN = n(aVar.f55298f);
            }
            int iIntValue = (eVarN == null || (num = (Integer) mapG.get(Long.valueOf(Long.parseLong(eVarN.f55331b)))) == null) ? i11 : num.intValue();
            if (iIntValue == i11 && (eVarL = l(aVar.f55298f)) != null) {
                for (String str : r0.Y0(eVarL.f55331b, ",")) {
                    Integer num2 = (Integer) mapG.get(Long.valueOf(Long.parseLong(str)));
                    if (num2 != null) {
                        iIntValue = Math.min(iIntValue, num2.intValue());
                    }
                }
            }
            if (iIntValue != i11) {
                List list2 = (List) sparseArray.get(i11);
                List list3 = (List) sparseArray.get(iIntValue);
                list3.addAll(list2);
                sparseArray.put(i11, list3);
                arrayList.remove(list2);
            }
        }
        int size2 = arrayList.size();
        int[][] iArr = new int[size2][];
        for (int i12 = 0; i12 < size2; i12++) {
            int[] iArrN = com.google.common.primitives.g.n((Collection) arrayList.get(i12));
            iArr[i12] = iArrN;
            Arrays.sort(iArrN);
        }
        return iArr;
    }

    private int q(int i10, int[] iArr) {
        int i11 = iArr[i10];
        if (i11 == -1) {
            return -1;
        }
        int i12 = this.f17550k[i11].f17568e;
        for (int i13 = 0; i13 < iArr.length; i13++) {
            int i14 = iArr[i13];
            if (i14 == i12 && this.f17550k[i14].f17566c == 0) {
                return i13;
            }
        }
        return -1;
    }

    private int[] r(r[] rVarArr) {
        int[] iArr = new int[rVarArr.length];
        for (int i10 = 0; i10 < rVarArr.length; i10++) {
            r rVar = rVarArr[i10];
            if (rVar != null) {
                iArr[i10] = this.f17549j.c(rVar.getTrackGroup());
            } else {
                iArr[i10] = -1;
            }
        }
        return iArr;
    }

    private static boolean s(List list, int[] iArr) {
        for (int i10 : iArr) {
            List list2 = ((va.a) list.get(i10)).f55295c;
            for (int i11 = 0; i11 < list2.size(); i11++) {
                if (!((va.j) list2.get(i11)).f55356e.isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    private static int t(int i10, List list, int[][] iArr, boolean[] zArr, v0[][] v0VarArr) {
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            if (s(list, iArr[i12])) {
                zArr[i12] = true;
                i11++;
            }
            v0[] v0VarArrO = o(list, iArr[i12]);
            v0VarArr[i12] = v0VarArrO;
            if (v0VarArrO.length != 0) {
                i11++;
            }
        }
        return i11;
    }

    private static i[] u(int i10) {
        return new i[i10];
    }

    private static v0[] w(va.e eVar, Pattern pattern, v0 v0Var) {
        String str = eVar.f55331b;
        if (str == null) {
            return new v0[]{v0Var};
        }
        String[] strArrY0 = r0.Y0(str, ";");
        v0[] v0VarArr = new v0[strArrY0.length];
        for (int i10 = 0; i10 < strArrY0.length; i10++) {
            Matcher matcher = pattern.matcher(strArrY0[i10]);
            if (!matcher.matches()) {
                return new v0[]{v0Var};
            }
            int i11 = Integer.parseInt(matcher.group(1));
            v0VarArr[i10] = v0Var.b().U(v0Var.f18857a + ":" + i11).H(i11).X(matcher.group(2)).G();
        }
        return v0VarArr;
    }

    private void y(r[] rVarArr, boolean[] zArr, s[] sVarArr) {
        for (int i10 = 0; i10 < rVarArr.length; i10++) {
            if (rVarArr[i10] == null || !zArr[i10]) {
                s sVar = sVarArr[i10];
                if (sVar instanceof i) {
                    ((i) sVar).C(this);
                } else if (sVar instanceof i.a) {
                    ((i.a) sVar).c();
                }
                sVarArr[i10] = null;
            }
        }
    }

    private void z(r[] rVarArr, s[] sVarArr, int[] iArr) {
        boolean z10;
        for (int i10 = 0; i10 < rVarArr.length; i10++) {
            s sVar = sVarArr[i10];
            if ((sVar instanceof h) || (sVar instanceof i.a)) {
                int iQ = q(i10, iArr);
                if (iQ == -1) {
                    z10 = sVarArr[i10] instanceof h;
                } else {
                    s sVar2 = sVarArr[i10];
                    z10 = (sVar2 instanceof i.a) && ((i.a) sVar2).f53245a == sVarArr[iQ];
                }
                if (!z10) {
                    s sVar3 = sVarArr[i10];
                    if (sVar3 instanceof i.a) {
                        ((i.a) sVar3).c();
                    }
                    sVarArr[i10] = null;
                }
            }
        }
    }

    public void B(va.c cVar, int i10) {
        this.f17561v = cVar;
        this.f17562w = i10;
        this.f17552m.q(cVar);
        i[] iVarArr = this.f17558s;
        if (iVarArr != null) {
            for (i iVar : iVarArr) {
                ((com.google.android.exoplayer2.source.dash.a) iVar.q()).d(cVar, i10);
            }
            this.f17557r.c(this);
        }
        this.f17563x = cVar.c(i10).f55341d;
        for (d dVar : this.f17559t) {
            for (va.f fVar : this.f17563x) {
                if (fVar.a().equals(dVar.b())) {
                    dVar.d(fVar, cVar.f55306d && i10 == cVar.d() - 1);
                    break;
                }
            }
        }
    }

    @Override // ta.i.b
    public synchronized void a(i iVar) {
        e.c cVar = (e.c) this.f17553n.remove(iVar);
        if (cVar != null) {
            cVar.n();
        }
    }

    @Override // com.google.android.exoplayer2.source.o
    public long b(long j10, j0 j0Var) {
        for (i iVar : this.f17558s) {
            if (iVar.f53222a == 2) {
                return iVar.b(j10, j0Var);
            }
        }
        return j10;
    }

    @Override // com.google.android.exoplayer2.source.o, com.google.android.exoplayer2.source.d0
    public boolean continueLoading(long j10) {
        return this.f17560u.continueLoading(j10);
    }

    @Override // com.google.android.exoplayer2.source.o
    public void d(o.a aVar, long j10) {
        this.f17557r = aVar;
        aVar.g(this);
    }

    @Override // com.google.android.exoplayer2.source.o
    public void discardBuffer(long j10, boolean z10) {
        for (i iVar : this.f17558s) {
            iVar.discardBuffer(j10, z10);
        }
    }

    @Override // com.google.android.exoplayer2.source.o
    public long f(r[] rVarArr, boolean[] zArr, s[] sVarArr, boolean[] zArr2, long j10) {
        int[] iArrR = r(rVarArr);
        y(rVarArr, zArr, sVarArr);
        z(rVarArr, sVarArr, iArrR);
        A(rVarArr, sVarArr, zArr2, j10, iArrR);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (s sVar : sVarArr) {
            if (sVar instanceof i) {
                arrayList.add((i) sVar);
            } else if (sVar instanceof d) {
                arrayList2.add((d) sVar);
            }
        }
        i[] iVarArrU = u(arrayList.size());
        this.f17558s = iVarArrU;
        arrayList.toArray(iVarArrU);
        d[] dVarArr = new d[arrayList2.size()];
        this.f17559t = dVarArr;
        arrayList2.toArray(dVarArr);
        this.f17560u = this.f17551l.a(this.f17558s);
        return j10;
    }

    @Override // com.google.android.exoplayer2.source.o, com.google.android.exoplayer2.source.d0
    public long getBufferedPositionUs() {
        return this.f17560u.getBufferedPositionUs();
    }

    @Override // com.google.android.exoplayer2.source.o, com.google.android.exoplayer2.source.d0
    public long getNextLoadPositionUs() {
        return this.f17560u.getNextLoadPositionUs();
    }

    @Override // com.google.android.exoplayer2.source.o
    public x getTrackGroups() {
        return this.f17549j;
    }

    @Override // com.google.android.exoplayer2.source.o, com.google.android.exoplayer2.source.d0
    public boolean isLoading() {
        return this.f17560u.isLoading();
    }

    @Override // com.google.android.exoplayer2.source.o
    public void maybeThrowPrepareError() {
        this.f17547h.maybeThrowError();
    }

    @Override // com.google.android.exoplayer2.source.o
    public long readDiscontinuity() {
        return C.TIME_UNSET;
    }

    @Override // com.google.android.exoplayer2.source.o, com.google.android.exoplayer2.source.d0
    public void reevaluateBuffer(long j10) {
        this.f17560u.reevaluateBuffer(j10);
    }

    @Override // com.google.android.exoplayer2.source.o
    public long seekToUs(long j10) throws Throwable {
        for (i iVar : this.f17558s) {
            iVar.E(j10);
        }
        for (d dVar : this.f17559t) {
            dVar.c(j10);
        }
        return j10;
    }

    @Override // com.google.android.exoplayer2.source.d0.a
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public void c(i iVar) {
        this.f17557r.c(this);
    }

    public void x() {
        this.f17552m.o();
        for (i iVar : this.f17558s) {
            iVar.C(this);
        }
        this.f17557r = null;
    }
}
