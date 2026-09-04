package wa;

import android.net.Uri;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.exoplayer2.source.BehindLiveWindowException;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker;
import com.google.android.exoplayer2.v0;
import com.google.common.collect.c0;
import com.google.common.collect.e0;
import com.google.common.collect.i0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import nb.a0;
import o9.j0;
import ob.p0;
import ob.r0;
import p9.s1;
import ra.v;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f56030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final nb.j f56031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final nb.j f56032c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final r f56033d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Uri[] f56034e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final v0[] f56035f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final HlsPlaylistTracker f56036g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final v f56037h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List f56038i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final s1 f56040k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final long f56041l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f56042m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private IOException f56044o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Uri f56045p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f56046q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private lb.r f56047r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f56049t;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final wa.e f56039j = new wa.e(4);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private byte[] f56043n = r0.f48430f;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f56048s = C.TIME_UNSET;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a extends ta.l {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private byte[] f56050l;

        public a(nb.j jVar, com.google.android.exoplayer2.upstream.a aVar, v0 v0Var, int i10, Object obj, byte[] bArr) {
            super(jVar, aVar, 3, v0Var, i10, obj, bArr);
        }

        @Override // ta.l
        protected void e(byte[] bArr, int i10) {
            this.f56050l = Arrays.copyOf(bArr, i10);
        }

        public byte[] h() {
            return this.f56050l;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ta.f f56051a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f56052b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Uri f56053c;

        public b() {
            a();
        }

        public void a() {
            this.f56051a = null;
            this.f56052b = false;
            this.f56053c = null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class c extends ta.b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final List f56054e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final long f56055f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final String f56056g;

        public c(String str, long j10, List list) {
            super(0L, list.size() - 1);
            this.f56056g = str;
            this.f56055f = j10;
            this.f56054e = list;
        }

        @Override // ta.o
        public long a() {
            c();
            return this.f56055f + ((com.google.android.exoplayer2.source.hls.playlist.c.e) this.f56054e.get((int) d())).f17792e;
        }

        @Override // ta.o
        public long b() {
            c();
            com.google.android.exoplayer2.source.hls.playlist.c.e eVar = (com.google.android.exoplayer2.source.hls.playlist.c.e) this.f56054e.get((int) d());
            return this.f56055f + eVar.f17792e + eVar.f17790c;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class d extends lb.c {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f56057h;

        public d(v vVar, int[] iArr) {
            super(vVar, iArr);
            this.f56057h = h(vVar.c(iArr[0]));
        }

        @Override // lb.r
        public void e(long j10, long j11, long j12, List list, ta.o[] oVarArr) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (d(this.f56057h, jElapsedRealtime)) {
                for (int i10 = this.f44112b - 1; i10 >= 0; i10--) {
                    if (!d(i10, jElapsedRealtime)) {
                        this.f56057h = i10;
                        return;
                    }
                }
                throw new IllegalStateException();
            }
        }

        @Override // lb.r
        public int getSelectedIndex() {
            return this.f56057h;
        }

        @Override // lb.r
        public Object getSelectionData() {
            return null;
        }

        @Override // lb.r
        public int getSelectionReason() {
            return 0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.google.android.exoplayer2.source.hls.playlist.c.e f56058a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f56059b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f56060c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f56061d;

        public e(com.google.android.exoplayer2.source.hls.playlist.c.e eVar, long j10, int i10) {
            this.f56058a = eVar;
            this.f56059b = j10;
            this.f56060c = i10;
            this.f56061d = (eVar instanceof com.google.android.exoplayer2.source.hls.playlist.c.b) && ((com.google.android.exoplayer2.source.hls.playlist.c.b) eVar).f17782m;
        }
    }

    public f(h hVar, HlsPlaylistTracker hlsPlaylistTracker, Uri[] uriArr, v0[] v0VarArr, g gVar, a0 a0Var, r rVar, long j10, List list, s1 s1Var, nb.f fVar) {
        this.f56030a = hVar;
        this.f56036g = hlsPlaylistTracker;
        this.f56034e = uriArr;
        this.f56035f = v0VarArr;
        this.f56033d = rVar;
        this.f56041l = j10;
        this.f56038i = list;
        this.f56040k = s1Var;
        nb.j jVarA = gVar.a(1);
        this.f56031b = jVarA;
        if (a0Var != null) {
            jVarA.d(a0Var);
        }
        this.f56032c = gVar.a(3);
        this.f56037h = new v(v0VarArr);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < uriArr.length; i10++) {
            if ((v0VarArr[i10].f18861e & 16384) == 0) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        this.f56047r = new d(this.f56037h, com.google.common.primitives.g.n(arrayList));
    }

    private static Uri d(com.google.android.exoplayer2.source.hls.playlist.c cVar, com.google.android.exoplayer2.source.hls.playlist.c.e eVar) {
        String str;
        if (eVar == null || (str = eVar.f17794g) == null) {
            return null;
        }
        return p0.e(cVar.f56810a, str);
    }

    private Pair f(i iVar, boolean z10, com.google.android.exoplayer2.source.hls.playlist.c cVar, long j10, long j11) {
        int i10 = -1;
        if (iVar != null && !z10) {
            if (!iVar.f()) {
                return new Pair(Long.valueOf(iVar.f53262j), Integer.valueOf(iVar.f56067o));
            }
            Long lValueOf = Long.valueOf(iVar.f56067o == -1 ? iVar.e() : iVar.f53262j);
            int i11 = iVar.f56067o;
            return new Pair(lValueOf, Integer.valueOf(i11 != -1 ? i11 + 1 : -1));
        }
        long j12 = cVar.f17779u + j10;
        if (iVar != null && !this.f56046q) {
            j11 = iVar.f53217g;
        }
        if (!cVar.f17773o && j11 >= j12) {
            return new Pair(Long.valueOf(cVar.f17769k + ((long) cVar.f17776r.size())), -1);
        }
        long j13 = j11 - j10;
        int iF = r0.f(cVar.f17776r, Long.valueOf(j13), true, !this.f56036g.j() || iVar == null);
        long j14 = ((long) iF) + cVar.f17769k;
        if (iF >= 0) {
            com.google.android.exoplayer2.source.hls.playlist.c.d dVar = (com.google.android.exoplayer2.source.hls.playlist.c.d) cVar.f17776r.get(iF);
            List list = j13 < dVar.f17792e + dVar.f17790c ? dVar.f17787m : cVar.f17777s;
            for (int i12 = 0; i12 < list.size(); i12++) {
                com.google.android.exoplayer2.source.hls.playlist.c.b bVar = (com.google.android.exoplayer2.source.hls.playlist.c.b) list.get(i12);
                if (j13 < bVar.f17792e + bVar.f17790c) {
                    if (!bVar.f17781l) {
                        break;
                    }
                    j14 += list == cVar.f17777s ? 1L : 0L;
                    i10 = i12;
                    break;
                }
            }
        }
        return new Pair(Long.valueOf(j14), Integer.valueOf(i10));
    }

    private static e g(com.google.android.exoplayer2.source.hls.playlist.c cVar, long j10, int i10) {
        int i11 = (int) (j10 - cVar.f17769k);
        if (i11 == cVar.f17776r.size()) {
            if (i10 == -1) {
                i10 = 0;
            }
            if (i10 < cVar.f17777s.size()) {
                return new e((com.google.android.exoplayer2.source.hls.playlist.c.e) cVar.f17777s.get(i10), j10, i10);
            }
            return null;
        }
        com.google.android.exoplayer2.source.hls.playlist.c.d dVar = (com.google.android.exoplayer2.source.hls.playlist.c.d) cVar.f17776r.get(i11);
        if (i10 == -1) {
            return new e(dVar, j10, -1);
        }
        if (i10 < dVar.f17787m.size()) {
            return new e((com.google.android.exoplayer2.source.hls.playlist.c.e) dVar.f17787m.get(i10), j10, i10);
        }
        int i12 = i11 + 1;
        if (i12 < cVar.f17776r.size()) {
            return new e((com.google.android.exoplayer2.source.hls.playlist.c.e) cVar.f17776r.get(i12), j10 + 1, -1);
        }
        if (cVar.f17777s.isEmpty()) {
            return null;
        }
        return new e((com.google.android.exoplayer2.source.hls.playlist.c.e) cVar.f17777s.get(0), j10 + 1, 0);
    }

    static List i(com.google.android.exoplayer2.source.hls.playlist.c cVar, long j10, int i10) {
        int i11 = (int) (j10 - cVar.f17769k);
        if (i11 < 0 || cVar.f17776r.size() < i11) {
            return c0.C();
        }
        ArrayList arrayList = new ArrayList();
        if (i11 < cVar.f17776r.size()) {
            if (i10 != -1) {
                com.google.android.exoplayer2.source.hls.playlist.c.d dVar = (com.google.android.exoplayer2.source.hls.playlist.c.d) cVar.f17776r.get(i11);
                if (i10 == 0) {
                    arrayList.add(dVar);
                } else if (i10 < dVar.f17787m.size()) {
                    List list = dVar.f17787m;
                    arrayList.addAll(list.subList(i10, list.size()));
                }
                i11++;
            }
            List list2 = cVar.f17776r;
            arrayList.addAll(list2.subList(i11, list2.size()));
            i10 = 0;
        }
        if (cVar.f17772n != C.TIME_UNSET) {
            int i12 = i10 != -1 ? i10 : 0;
            if (i12 < cVar.f17777s.size()) {
                List list3 = cVar.f17777s;
                arrayList.addAll(list3.subList(i12, list3.size()));
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    private ta.f l(Uri uri, int i10, boolean z10, nb.g gVar) {
        if (uri == null) {
            return null;
        }
        byte[] bArrC = this.f56039j.c(uri);
        if (bArrC != null) {
            this.f56039j.b(uri, bArrC);
            return null;
        }
        return new a(this.f56032c, new com.google.android.exoplayer2.upstream.a.b().i(uri).b(1).e(e0.q()).a(), this.f56035f[i10], this.f56047r.getSelectionReason(), this.f56047r.getSelectionData(), this.f56043n);
    }

    private long s(long j10) {
        long j11 = this.f56048s;
        return j11 != C.TIME_UNSET ? j11 - j10 : C.TIME_UNSET;
    }

    private void w(com.google.android.exoplayer2.source.hls.playlist.c cVar) {
        this.f56048s = cVar.f17773o ? C.TIME_UNSET : cVar.d() - this.f56036g.c();
    }

    public ta.o[] a(i iVar, long j10) {
        int iD = iVar == null ? -1 : this.f56037h.d(iVar.f53214d);
        int length = this.f56047r.length();
        ta.o[] oVarArr = new ta.o[length];
        for (int i10 = 0; i10 < length; i10++) {
            int indexInTrackGroup = this.f56047r.getIndexInTrackGroup(i10);
            Uri uri = this.f56034e[indexInTrackGroup];
            if (this.f56036g.h(uri)) {
                com.google.android.exoplayer2.source.hls.playlist.c cVarO = this.f56036g.o(uri, false);
                ob.a.e(cVarO);
                long jC = cVarO.f17766h - this.f56036g.c();
                Pair pairF = f(iVar, indexInTrackGroup != iD, cVarO, jC, j10);
                oVarArr[i10] = new c(cVarO.f56810a, jC, i(cVarO, ((Long) pairF.first).longValue(), ((Integer) pairF.second).intValue()));
            } else {
                oVarArr[i10] = ta.o.f53263a;
            }
        }
        return oVarArr;
    }

    public long b(long j10, j0 j0Var) {
        int selectedIndex = this.f56047r.getSelectedIndex();
        Uri[] uriArr = this.f56034e;
        com.google.android.exoplayer2.source.hls.playlist.c cVarO = (selectedIndex >= uriArr.length || selectedIndex == -1) ? null : this.f56036g.o(uriArr[this.f56047r.getSelectedIndexInTrackGroup()], true);
        if (cVarO == null || cVarO.f17776r.isEmpty() || !cVarO.f56812c) {
            return j10;
        }
        long jC = cVarO.f17766h - this.f56036g.c();
        long j11 = j10 - jC;
        int iF = r0.f(cVarO.f17776r, Long.valueOf(j11), true, true);
        long j12 = ((com.google.android.exoplayer2.source.hls.playlist.c.d) cVarO.f17776r.get(iF)).f17792e;
        return j0Var.a(j11, j12, iF != cVarO.f17776r.size() - 1 ? ((com.google.android.exoplayer2.source.hls.playlist.c.d) cVarO.f17776r.get(iF + 1)).f17792e : j12) + jC;
    }

    public int c(i iVar) {
        if (iVar.f56067o == -1) {
            return 1;
        }
        com.google.android.exoplayer2.source.hls.playlist.c cVar = (com.google.android.exoplayer2.source.hls.playlist.c) ob.a.e(this.f56036g.o(this.f56034e[this.f56037h.d(iVar.f53214d)], false));
        int i10 = (int) (iVar.f53262j - cVar.f17769k);
        if (i10 < 0) {
            return 1;
        }
        List list = i10 < cVar.f17776r.size() ? ((com.google.android.exoplayer2.source.hls.playlist.c.d) cVar.f17776r.get(i10)).f17787m : cVar.f17777s;
        if (iVar.f56067o >= list.size()) {
            return 2;
        }
        com.google.android.exoplayer2.source.hls.playlist.c.b bVar = (com.google.android.exoplayer2.source.hls.playlist.c.b) list.get(iVar.f56067o);
        if (bVar.f17782m) {
            return 0;
        }
        return r0.c(Uri.parse(p0.d(cVar.f56810a, bVar.f17788a)), iVar.f53212b.f18779a) ? 1 : 2;
    }

    public void e(long j10, long j11, List list, boolean z10, b bVar) {
        int i10;
        i iVar = list.isEmpty() ? null : (i) i0.d(list);
        int iD = iVar == null ? -1 : this.f56037h.d(iVar.f53214d);
        long jMax = j11 - j10;
        long jS = s(j10);
        if (iVar != null && !this.f56046q) {
            long jB = iVar.b();
            jMax = Math.max(0L, jMax - jB);
            if (jS != C.TIME_UNSET) {
                jS = Math.max(0L, jS - jB);
            }
        }
        this.f56047r.e(j10, jMax, jS, list, a(iVar, j11));
        int selectedIndexInTrackGroup = this.f56047r.getSelectedIndexInTrackGroup();
        boolean z11 = iD != selectedIndexInTrackGroup;
        Uri uri = this.f56034e[selectedIndexInTrackGroup];
        if (!this.f56036g.h(uri)) {
            bVar.f56053c = uri;
            this.f56049t &= uri.equals(this.f56045p);
            this.f56045p = uri;
            return;
        }
        com.google.android.exoplayer2.source.hls.playlist.c cVarO = this.f56036g.o(uri, true);
        ob.a.e(cVarO);
        this.f56046q = cVarO.f56812c;
        w(cVarO);
        long jC = cVarO.f17766h - this.f56036g.c();
        Pair pairF = f(iVar, z11, cVarO, jC, j11);
        long jLongValue = ((Long) pairF.first).longValue();
        int iIntValue = ((Integer) pairF.second).intValue();
        int i11 = iD;
        if (jLongValue >= cVarO.f17769k || iVar == null || !z11) {
            i10 = selectedIndexInTrackGroup;
        } else {
            uri = this.f56034e[i11];
            cVarO = this.f56036g.o(uri, true);
            ob.a.e(cVarO);
            jC = cVarO.f17766h - this.f56036g.c();
            Pair pairF2 = f(iVar, false, cVarO, jC, j11);
            jLongValue = ((Long) pairF2.first).longValue();
            iIntValue = ((Integer) pairF2.second).intValue();
            i10 = i11;
        }
        Uri uri2 = uri;
        com.google.android.exoplayer2.source.hls.playlist.c cVar = cVarO;
        if (jLongValue < cVar.f17769k) {
            this.f56044o = new BehindLiveWindowException();
            return;
        }
        e eVarG = g(cVar, jLongValue, iIntValue);
        if (eVarG == null) {
            if (!cVar.f17773o) {
                bVar.f56053c = uri2;
                this.f56049t &= uri2.equals(this.f56045p);
                this.f56045p = uri2;
                return;
            } else {
                if (z10 || cVar.f17776r.isEmpty()) {
                    bVar.f56052b = true;
                    return;
                }
                eVarG = new e((com.google.android.exoplayer2.source.hls.playlist.c.e) i0.d(cVar.f17776r), (cVar.f17769k + ((long) cVar.f17776r.size())) - 1, -1);
            }
        }
        this.f56049t = false;
        this.f56045p = null;
        Uri uriD = d(cVar, eVarG.f56058a.f17789b);
        ta.f fVarL = l(uriD, i10, true, null);
        bVar.f56051a = fVarL;
        if (fVarL != null) {
            return;
        }
        Uri uriD2 = d(cVar, eVarG.f56058a);
        ta.f fVarL2 = l(uriD2, i10, false, null);
        bVar.f56051a = fVarL2;
        if (fVarL2 != null) {
            return;
        }
        long j12 = jC;
        boolean zU = i.u(iVar, uri2, cVar, eVarG, j12);
        if (zU && eVarG.f56061d) {
            return;
        }
        bVar.f56051a = i.h(this.f56030a, this.f56031b, this.f56035f[i10], j12, cVar, eVarG, uri2, this.f56038i, this.f56047r.getSelectionReason(), this.f56047r.getSelectionData(), this.f56042m, this.f56033d, this.f56041l, iVar, this.f56039j.a(uriD2), this.f56039j.a(uriD), zU, this.f56040k, null);
    }

    public int h(long j10, List list) {
        return (this.f56044o != null || this.f56047r.length() < 2) ? list.size() : this.f56047r.evaluateQueueSize(j10, list);
    }

    public v j() {
        return this.f56037h;
    }

    public lb.r k() {
        return this.f56047r;
    }

    public boolean m(ta.f fVar, long j10) {
        lb.r rVar = this.f56047r;
        return rVar.f(rVar.indexOf(this.f56037h.d(fVar.f53214d)), j10);
    }

    public void n() throws IOException {
        IOException iOException = this.f56044o;
        if (iOException != null) {
            throw iOException;
        }
        Uri uri = this.f56045p;
        if (uri == null || !this.f56049t) {
            return;
        }
        this.f56036g.b(uri);
    }

    public boolean o(Uri uri) {
        return r0.s(this.f56034e, uri);
    }

    public void p(ta.f fVar) {
        if (fVar instanceof a) {
            a aVar = (a) fVar;
            this.f56043n = aVar.f();
            this.f56039j.b(aVar.f53212b.f18779a, (byte[]) ob.a.e(aVar.h()));
        }
    }

    public boolean q(Uri uri, long j10) {
        int iIndexOf;
        int i10 = 0;
        while (true) {
            Uri[] uriArr = this.f56034e;
            if (i10 >= uriArr.length) {
                i10 = -1;
                break;
            }
            if (uriArr[i10].equals(uri)) {
                break;
            }
            i10++;
        }
        if (i10 == -1 || (iIndexOf = this.f56047r.indexOf(i10)) == -1) {
            return true;
        }
        this.f56049t |= uri.equals(this.f56045p);
        return j10 == C.TIME_UNSET || (this.f56047r.f(iIndexOf, j10) && this.f56036g.k(uri, j10));
    }

    public void r() {
        this.f56044o = null;
    }

    public void t(boolean z10) {
        this.f56042m = z10;
    }

    public void u(lb.r rVar) {
        this.f56047r = rVar;
    }

    public boolean v(long j10, ta.f fVar, List list) {
        if (this.f56044o != null) {
            return false;
        }
        return this.f56047r.g(j10, fVar, list);
    }
}
