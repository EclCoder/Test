package wa;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.source.d0;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker;
import com.google.android.exoplayer2.v0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import nb.a0;
import o9.j0;
import ob.r0;
import ob.y;
import p9.s1;
import ra.v;
import ra.x;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class k implements com.google.android.exoplayer2.source.o, HlsPlaylistTracker.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f56079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HlsPlaylistTracker f56080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g f56081c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a0 f56082d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.exoplayer2.drm.j f56083e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.android.exoplayer2.drm.i.a f56084f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.google.android.exoplayer2.upstream.c f56085g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.google.android.exoplayer2.source.q.a f56086h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final nb.b f56087i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final ra.d f56090l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f56091m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f56092n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f56093o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final s1 f56094p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final long f56096r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private com.google.android.exoplayer2.source.o.a f56097s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f56098t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private x f56099u;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f56103y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private d0 f56104z;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final p.b f56095q = new b();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final IdentityHashMap f56088j = new IdentityHashMap();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final r f56089k = new r();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private p[] f56100v = new p[0];

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private p[] f56101w = new p[0];

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int[][] f56102x = new int[0][];

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class b implements p.b {
        private b() {
        }

        @Override // com.google.android.exoplayer2.source.d0.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void c(p pVar) {
            k.this.f56097s.c(k.this);
        }

        @Override // wa.p.b
        public void e(Uri uri) {
            k.this.f56080b.f(uri);
        }

        @Override // wa.p.b
        public void onPrepared() {
            if (k.e(k.this) > 0) {
                return;
            }
            int i10 = 0;
            for (p pVar : k.this.f56100v) {
                i10 += pVar.getTrackGroups().f51256a;
            }
            v[] vVarArr = new v[i10];
            int i11 = 0;
            for (p pVar2 : k.this.f56100v) {
                int i12 = pVar2.getTrackGroups().f51256a;
                int i13 = 0;
                while (i13 < i12) {
                    vVarArr[i11] = pVar2.getTrackGroups().b(i13);
                    i13++;
                    i11++;
                }
            }
            k.this.f56099u = new x(vVarArr);
            k.this.f56097s.g(k.this);
        }
    }

    public k(h hVar, HlsPlaylistTracker hlsPlaylistTracker, g gVar, a0 a0Var, nb.f fVar, com.google.android.exoplayer2.drm.j jVar, com.google.android.exoplayer2.drm.i.a aVar, com.google.android.exoplayer2.upstream.c cVar, com.google.android.exoplayer2.source.q.a aVar2, nb.b bVar, ra.d dVar, boolean z10, int i10, boolean z11, s1 s1Var, long j10) {
        this.f56079a = hVar;
        this.f56080b = hlsPlaylistTracker;
        this.f56081c = gVar;
        this.f56082d = a0Var;
        this.f56083e = jVar;
        this.f56084f = aVar;
        this.f56085g = cVar;
        this.f56086h = aVar2;
        this.f56087i = bVar;
        this.f56090l = dVar;
        this.f56091m = z10;
        this.f56092n = i10;
        this.f56093o = z11;
        this.f56094p = s1Var;
        this.f56096r = j10;
        this.f56104z = dVar.a(new d0[0]);
    }

    static /* synthetic */ int e(k kVar) {
        int i10 = kVar.f56098t - 1;
        kVar.f56098t = i10;
        return i10;
    }

    private void k(long j10, List list, List list2, List list3, Map map) {
        ArrayList arrayList = new ArrayList(list.size());
        ArrayList arrayList2 = new ArrayList(list.size());
        ArrayList arrayList3 = new ArrayList(list.size());
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < list.size(); i10++) {
            String str = ((com.google.android.exoplayer2.source.hls.playlist.d.a) list.get(i10)).f17818d;
            if (hashSet.add(str)) {
                arrayList.clear();
                arrayList2.clear();
                arrayList3.clear();
                boolean z10 = true;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    if (r0.c(str, ((com.google.android.exoplayer2.source.hls.playlist.d.a) list.get(i11)).f17818d)) {
                        com.google.android.exoplayer2.source.hls.playlist.d.a aVar = (com.google.android.exoplayer2.source.hls.playlist.d.a) list.get(i11);
                        arrayList3.add(Integer.valueOf(i11));
                        arrayList.add(aVar.f17815a);
                        arrayList2.add(aVar.f17816b);
                        z10 &= r0.L(aVar.f17816b.f18865i, 1) == 1;
                    }
                }
                String str2 = "audio:" + str;
                p pVarN = n(str2, 1, (Uri[]) arrayList.toArray((Uri[]) r0.k(new Uri[0])), (v0[]) arrayList2.toArray(new v0[0]), null, Collections.EMPTY_LIST, map, j10);
                list3.add(com.google.common.primitives.g.n(arrayList3));
                list2.add(pVarN);
                if (this.f56091m && z10) {
                    pVarN.Q(new v[]{new v(str2, (v0[]) arrayList2.toArray(new v0[0]))}, 0, new int[0]);
                }
            }
        }
    }

    private void l(com.google.android.exoplayer2.source.hls.playlist.d dVar, long j10, List list, List list2, Map map) {
        boolean z10;
        boolean z11;
        int size = dVar.f17806e.size();
        int[] iArr = new int[size];
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < dVar.f17806e.size(); i12++) {
            v0 v0Var = ((com.google.android.exoplayer2.source.hls.playlist.d.b) dVar.f17806e.get(i12)).f17820b;
            if (v0Var.f18874r > 0 || r0.M(v0Var.f18865i, 2) != null) {
                iArr[i12] = 2;
                i10++;
            } else if (r0.M(v0Var.f18865i, 1) != null) {
                iArr[i12] = 1;
                i11++;
            } else {
                iArr[i12] = -1;
            }
        }
        if (i10 > 0) {
            size = i10;
            z10 = true;
            z11 = false;
        } else if (i11 < size) {
            size -= i11;
            z10 = false;
            z11 = true;
        } else {
            z10 = false;
            z11 = false;
        }
        Uri[] uriArr = new Uri[size];
        v0[] v0VarArr = new v0[size];
        int[] iArr2 = new int[size];
        int i13 = 0;
        for (int i14 = 0; i14 < dVar.f17806e.size(); i14++) {
            if ((!z10 || iArr[i14] == 2) && (!z11 || iArr[i14] != 1)) {
                com.google.android.exoplayer2.source.hls.playlist.d.b bVar = (com.google.android.exoplayer2.source.hls.playlist.d.b) dVar.f17806e.get(i14);
                uriArr[i13] = bVar.f17819a;
                v0VarArr[i13] = bVar.f17820b;
                iArr2[i13] = i14;
                i13++;
            }
        }
        String str = v0VarArr[0].f18865i;
        int iL = r0.L(str, 2);
        int iL2 = r0.L(str, 1);
        boolean z12 = (iL2 == 1 || (iL2 == 0 && dVar.f17808g.isEmpty())) && iL <= 1 && iL2 + iL > 0;
        p pVarN = n("main", (z10 || iL2 <= 0) ? 0 : 1, uriArr, v0VarArr, dVar.f17811j, dVar.f17812k, map, j10);
        list.add(pVarN);
        list2.add(iArr2);
        if (this.f56091m && z12) {
            ArrayList arrayList = new ArrayList();
            if (iL > 0) {
                v0[] v0VarArr2 = new v0[size];
                for (int i15 = 0; i15 < size; i15++) {
                    v0VarArr2[i15] = q(v0VarArr[i15]);
                }
                arrayList.add(new v("main", v0VarArr2));
                if (iL2 > 0 && (dVar.f17811j != null || dVar.f17808g.isEmpty())) {
                    arrayList.add(new v("main:audio", o(v0VarArr[0], dVar.f17811j, false)));
                }
                List list3 = dVar.f17812k;
                if (list3 != null) {
                    for (int i16 = 0; i16 < list3.size(); i16++) {
                        arrayList.add(new v("main:cc:" + i16, (v0) list3.get(i16)));
                    }
                }
            } else {
                v0[] v0VarArr3 = new v0[size];
                for (int i17 = 0; i17 < size; i17++) {
                    v0VarArr3[i17] = o(v0VarArr[i17], dVar.f17811j, true);
                }
                arrayList.add(new v("main", v0VarArr3));
            }
            v vVar = new v("main:id3", new v0.b().U("ID3").g0(MimeTypes.APPLICATION_ID3).G());
            arrayList.add(vVar);
            pVarN.Q((v[]) arrayList.toArray(new v[0]), 0, arrayList.indexOf(vVar));
        }
    }

    private void m(long j10) {
        com.google.android.exoplayer2.source.hls.playlist.d dVar = (com.google.android.exoplayer2.source.hls.playlist.d) ob.a.e(this.f56080b.d());
        Map mapP = this.f56093o ? p(dVar.f17814m) : Collections.EMPTY_MAP;
        boolean zIsEmpty = dVar.f17806e.isEmpty();
        List list = dVar.f17808g;
        List list2 = dVar.f17809h;
        this.f56098t = 0;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (!zIsEmpty) {
            l(dVar, j10, arrayList, arrayList2, mapP);
        }
        k(j10, list, arrayList, arrayList2, mapP);
        this.f56103y = arrayList.size();
        for (int i10 = 0; i10 < list2.size(); i10++) {
            com.google.android.exoplayer2.source.hls.playlist.d.a aVar = (com.google.android.exoplayer2.source.hls.playlist.d.a) list2.get(i10);
            String str = "subtitle:" + i10 + ":" + aVar.f17818d;
            Map map = mapP;
            p pVarN = n(str, 3, new Uri[]{aVar.f17815a}, new v0[]{aVar.f17816b}, null, Collections.EMPTY_LIST, map, j10);
            mapP = map;
            arrayList2.add(new int[]{i10});
            arrayList.add(pVarN);
            pVarN.Q(new v[]{new v(str, aVar.f17816b)}, 0, new int[0]);
        }
        this.f56100v = (p[]) arrayList.toArray(new p[0]);
        this.f56102x = (int[][]) arrayList2.toArray(new int[0][]);
        this.f56098t = this.f56100v.length;
        for (int i11 = 0; i11 < this.f56103y; i11++) {
            this.f56100v[i11].Z(true);
        }
        for (p pVar : this.f56100v) {
            pVar.o();
        }
        this.f56101w = this.f56100v;
    }

    private p n(String str, int i10, Uri[] uriArr, v0[] v0VarArr, v0 v0Var, List list, Map map, long j10) {
        return new p(str, i10, this.f56095q, new f(this.f56079a, this.f56080b, uriArr, v0VarArr, this.f56081c, this.f56082d, this.f56089k, this.f56096r, list, this.f56094p, null), map, this.f56087i, j10, v0Var, this.f56083e, this.f56084f, this.f56085g, this.f56086h, this.f56092n);
    }

    private static v0 o(v0 v0Var, v0 v0Var2, boolean z10) {
        String strM;
        ha.a aVar;
        int i10;
        String str;
        int i11;
        int i12;
        String str2;
        if (v0Var2 != null) {
            strM = v0Var2.f18865i;
            aVar = v0Var2.f18866j;
            i11 = v0Var2.f18881y;
            i10 = v0Var2.f18860d;
            i12 = v0Var2.f18861e;
            str = v0Var2.f18859c;
            str2 = v0Var2.f18858b;
        } else {
            strM = r0.M(v0Var.f18865i, 1);
            aVar = v0Var.f18866j;
            if (z10) {
                i11 = v0Var.f18881y;
                i10 = v0Var.f18860d;
                i12 = v0Var.f18861e;
                str = v0Var.f18859c;
                str2 = v0Var.f18858b;
            } else {
                i10 = 0;
                str = null;
                i11 = -1;
                i12 = 0;
                str2 = null;
            }
        }
        return new v0.b().U(v0Var.f18857a).W(str2).M(v0Var.f18867k).g0(y.g(strM)).K(strM).Z(aVar).I(z10 ? v0Var.f18862f : -1).b0(z10 ? v0Var.f18863g : -1).J(i11).i0(i10).e0(i12).X(str).G();
    }

    private static Map p(List list) {
        ArrayList arrayList = new ArrayList(list);
        HashMap map = new HashMap();
        int i10 = 0;
        while (i10 < arrayList.size()) {
            com.google.android.exoplayer2.drm.h hVarG = (com.google.android.exoplayer2.drm.h) list.get(i10);
            String str = hVarG.f16856c;
            i10++;
            int i11 = i10;
            while (i11 < arrayList.size()) {
                com.google.android.exoplayer2.drm.h hVar = (com.google.android.exoplayer2.drm.h) arrayList.get(i11);
                if (TextUtils.equals(hVar.f16856c, str)) {
                    hVarG = hVarG.g(hVar);
                    arrayList.remove(i11);
                } else {
                    i11++;
                }
            }
            map.put(str, hVarG);
        }
        return map;
    }

    private static v0 q(v0 v0Var) {
        String strM = r0.M(v0Var.f18865i, 2);
        return new v0.b().U(v0Var.f18857a).W(v0Var.f18858b).M(v0Var.f18867k).g0(y.g(strM)).K(strM).Z(v0Var.f18866j).I(v0Var.f18862f).b0(v0Var.f18863g).n0(v0Var.f18873q).S(v0Var.f18874r).R(v0Var.f18875s).i0(v0Var.f18860d).e0(v0Var.f18861e).G();
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker.b
    public void a() {
        for (p pVar : this.f56100v) {
            pVar.O();
        }
        this.f56097s.c(this);
    }

    @Override // com.google.android.exoplayer2.source.o
    public long b(long j10, j0 j0Var) {
        for (p pVar : this.f56101w) {
            if (pVar.E()) {
                return pVar.b(j10, j0Var);
            }
        }
        return j10;
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker.b
    public boolean c(Uri uri, com.google.android.exoplayer2.upstream.c.C0294c c0294c, boolean z10) {
        boolean zN = true;
        for (p pVar : this.f56100v) {
            zN &= pVar.N(uri, c0294c, z10);
        }
        this.f56097s.c(this);
        return zN;
    }

    @Override // com.google.android.exoplayer2.source.o, com.google.android.exoplayer2.source.d0
    public boolean continueLoading(long j10) {
        if (this.f56099u != null) {
            return this.f56104z.continueLoading(j10);
        }
        for (p pVar : this.f56100v) {
            pVar.o();
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.source.o
    public void d(com.google.android.exoplayer2.source.o.a aVar, long j10) {
        this.f56097s = aVar;
        this.f56080b.g(this);
        m(j10);
    }

    @Override // com.google.android.exoplayer2.source.o
    public void discardBuffer(long j10, boolean z10) {
        for (p pVar : this.f56101w) {
            pVar.discardBuffer(j10, z10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00d8  */
    @Override // com.google.android.exoplayer2.source.o
    public long f(lb.r[] rVarArr, boolean[] zArr, ra.s[] sVarArr, boolean[] zArr2, long j10) {
        int[] iArr = new int[rVarArr.length];
        int[] iArr2 = new int[rVarArr.length];
        for (int i10 = 0; i10 < rVarArr.length; i10++) {
            ra.s sVar = sVarArr[i10];
            iArr[i10] = sVar == null ? -1 : ((Integer) this.f56088j.get(sVar)).intValue();
            iArr2[i10] = -1;
            lb.r rVar = rVarArr[i10];
            if (rVar != null) {
                v trackGroup = rVar.getTrackGroup();
                int i11 = 0;
                while (true) {
                    p[] pVarArr = this.f56100v;
                    if (i11 >= pVarArr.length) {
                        break;
                    }
                    if (pVarArr[i11].getTrackGroups().c(trackGroup) != -1) {
                        iArr2[i10] = i11;
                        break;
                    }
                    i11++;
                }
            }
        }
        this.f56088j.clear();
        int length = rVarArr.length;
        ra.s[] sVarArr2 = new ra.s[length];
        ra.s[] sVarArr3 = new ra.s[rVarArr.length];
        lb.r[] rVarArr2 = new lb.r[rVarArr.length];
        p[] pVarArr2 = new p[this.f56100v.length];
        int i12 = 0;
        int i13 = 0;
        boolean z10 = false;
        while (i12 < this.f56100v.length) {
            for (int i14 = 0; i14 < rVarArr.length; i14++) {
                lb.r rVar2 = null;
                sVarArr3[i14] = iArr[i14] == i12 ? sVarArr[i14] : null;
                if (iArr2[i14] == i12) {
                    rVar2 = rVarArr[i14];
                }
                rVarArr2[i14] = rVar2;
            }
            p pVar = this.f56100v[i12];
            int[] iArr3 = iArr;
            int i15 = i12;
            int i16 = i13;
            boolean zW = pVar.W(rVarArr2, zArr, sVarArr3, zArr2, j10, z10);
            boolean z11 = false;
            for (int i17 = 0; i17 < rVarArr.length; i17++) {
                ra.s sVar2 = sVarArr3[i17];
                if (iArr2[i17] == i15) {
                    ob.a.e(sVar2);
                    sVarArr2[i17] = sVar2;
                    this.f56088j.put(sVar2, Integer.valueOf(i15));
                    z11 = true;
                } else if (iArr3[i17] == i15) {
                    ob.a.g(sVar2 == null);
                }
            }
            if (z11) {
                pVarArr2[i16] = pVar;
                i13 = i16 + 1;
                if (i16 == 0) {
                    pVar.Z(true);
                    if (zW) {
                        this.f56089k.b();
                        z10 = true;
                    } else {
                        p[] pVarArr3 = this.f56101w;
                        if (pVarArr3.length == 0 || pVar != pVarArr3[0]) {
                            this.f56089k.b();
                            z10 = true;
                        }
                    }
                } else {
                    pVar.Z(i15 < this.f56103y);
                }
            } else {
                i13 = i16;
            }
            i12 = i15 + 1;
            iArr = iArr3;
        }
        System.arraycopy(sVarArr2, 0, sVarArr, 0, length);
        p[] pVarArr4 = (p[]) r0.M0(pVarArr2, i13);
        this.f56101w = pVarArr4;
        this.f56104z = this.f56090l.a(pVarArr4);
        return j10;
    }

    @Override // com.google.android.exoplayer2.source.o, com.google.android.exoplayer2.source.d0
    public long getBufferedPositionUs() {
        return this.f56104z.getBufferedPositionUs();
    }

    @Override // com.google.android.exoplayer2.source.o, com.google.android.exoplayer2.source.d0
    public long getNextLoadPositionUs() {
        return this.f56104z.getNextLoadPositionUs();
    }

    @Override // com.google.android.exoplayer2.source.o
    public x getTrackGroups() {
        return (x) ob.a.e(this.f56099u);
    }

    @Override // com.google.android.exoplayer2.source.o, com.google.android.exoplayer2.source.d0
    public boolean isLoading() {
        return this.f56104z.isLoading();
    }

    @Override // com.google.android.exoplayer2.source.o
    public void maybeThrowPrepareError() throws ParserException {
        for (p pVar : this.f56100v) {
            pVar.maybeThrowPrepareError();
        }
    }

    public void r() {
        this.f56080b.a(this);
        for (p pVar : this.f56100v) {
            pVar.S();
        }
        this.f56097s = null;
    }

    @Override // com.google.android.exoplayer2.source.o
    public long readDiscontinuity() {
        return C.TIME_UNSET;
    }

    @Override // com.google.android.exoplayer2.source.o, com.google.android.exoplayer2.source.d0
    public void reevaluateBuffer(long j10) {
        this.f56104z.reevaluateBuffer(j10);
    }

    @Override // com.google.android.exoplayer2.source.o
    public long seekToUs(long j10) {
        p[] pVarArr = this.f56101w;
        if (pVarArr.length > 0) {
            boolean zV = pVarArr[0].V(j10, false);
            int i10 = 1;
            while (true) {
                p[] pVarArr2 = this.f56101w;
                if (i10 >= pVarArr2.length) {
                    break;
                }
                pVarArr2[i10].V(j10, zV);
                i10++;
            }
            if (zV) {
                this.f56089k.b();
            }
        }
        return j10;
    }
}
