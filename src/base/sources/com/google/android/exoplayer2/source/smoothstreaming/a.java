package com.google.android.exoplayer2.source.smoothstreaming;

import android.net.Uri;
import ca.o;
import ca.p;
import com.google.android.exoplayer2.source.BehindLiveWindowException;
import com.google.android.exoplayer2.v0;
import com.google.common.collect.e0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.List;
import lb.r;
import lb.z;
import nb.a0;
import nb.f;
import nb.j;
import nb.v;
import o9.j0;
import ob.n0;
import ta.e;
import ta.g;
import ta.h;
import ta.k;
import ta.n;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class a implements com.google.android.exoplayer2.source.smoothstreaming.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v f18175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f18176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g[] f18177c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final j f18178d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private r f18179e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.google.android.exoplayer2.source.smoothstreaming.manifest.a f18180f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f18181g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private IOException f18182h;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.smoothstreaming.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class C0290a implements com.google.android.exoplayer2.source.smoothstreaming.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final j.a f18183a;

        public C0290a(j.a aVar) {
            this.f18183a = aVar;
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.b.a
        public com.google.android.exoplayer2.source.smoothstreaming.b a(v vVar, com.google.android.exoplayer2.source.smoothstreaming.manifest.a aVar, int i10, r rVar, a0 a0Var, f fVar) {
            j jVarCreateDataSource = this.f18183a.createDataSource();
            if (a0Var != null) {
                jVarCreateDataSource.d(a0Var);
            }
            return new a(vVar, aVar, i10, rVar, jVarCreateDataSource, fVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class b extends ta.b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final com.google.android.exoplayer2.source.smoothstreaming.manifest.a.b f18184e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f18185f;

        public b(com.google.android.exoplayer2.source.smoothstreaming.manifest.a.b bVar, int i10, int i11) {
            super(i11, bVar.f18253k - 1);
            this.f18184e = bVar;
            this.f18185f = i10;
        }

        @Override // ta.o
        public long a() {
            c();
            return this.f18184e.e((int) d());
        }

        @Override // ta.o
        public long b() {
            return a() + this.f18184e.c((int) d());
        }
    }

    public a(v vVar, com.google.android.exoplayer2.source.smoothstreaming.manifest.a aVar, int i10, r rVar, j jVar, f fVar) {
        n0 n0Var;
        p[] pVarArr;
        this.f18175a = vVar;
        this.f18180f = aVar;
        this.f18176b = i10;
        this.f18179e = rVar;
        this.f18178d = jVar;
        com.google.android.exoplayer2.source.smoothstreaming.manifest.a.b bVar = aVar.f18237f[i10];
        this.f18177c = new g[rVar.length()];
        for (int i11 = 0; i11 < this.f18177c.length; i11++) {
            int indexInTrackGroup = rVar.getIndexInTrackGroup(i11);
            v0 v0Var = bVar.f18252j[indexInTrackGroup];
            if (v0Var.f18871o != null) {
                pVarArr = ((com.google.android.exoplayer2.source.smoothstreaming.manifest.a.C0291a) ob.a.e(aVar.f18236e)).f18242c;
                n0Var = null;
            } else {
                n0Var = null;
                pVarArr = null;
            }
            int i12 = bVar.f18243a;
            this.f18177c[i11] = new e(new ca.g(3, n0Var, new o(indexInTrackGroup, i12, bVar.f18245c, C.TIME_UNSET, aVar.f18238g, v0Var, 0, pVarArr, i12 == 2 ? 4 : 0, null, null)), bVar.f18243a, v0Var);
        }
    }

    private static n i(v0 v0Var, j jVar, Uri uri, int i10, long j10, long j11, long j12, int i11, Object obj, g gVar, nb.g gVar2) {
        return new k(jVar, new com.google.android.exoplayer2.upstream.a.b().i(uri).e(e0.q()).a(), v0Var, i11, obj, j10, j11, j12, C.TIME_UNSET, i10, 1, j10, gVar);
    }

    private long j(long j10) {
        com.google.android.exoplayer2.source.smoothstreaming.manifest.a aVar = this.f18180f;
        if (!aVar.f18235d) {
            return C.TIME_UNSET;
        }
        com.google.android.exoplayer2.source.smoothstreaming.manifest.a.b bVar = aVar.f18237f[this.f18176b];
        int i10 = bVar.f18253k - 1;
        return (bVar.e(i10) + bVar.c(i10)) - j10;
    }

    @Override // com.google.android.exoplayer2.source.smoothstreaming.b
    public void a(r rVar) {
        this.f18179e = rVar;
    }

    @Override // ta.j
    public long b(long j10, j0 j0Var) {
        com.google.android.exoplayer2.source.smoothstreaming.manifest.a.b bVar = this.f18180f.f18237f[this.f18176b];
        int iD = bVar.d(j10);
        long jE = bVar.e(iD);
        return j0Var.a(j10, jE, (jE >= j10 || iD >= bVar.f18253k + (-1)) ? jE : bVar.e(iD + 1));
    }

    @Override // ta.j
    public boolean c(long j10, ta.f fVar, List list) {
        if (this.f18182h != null) {
            return false;
        }
        return this.f18179e.g(j10, fVar, list);
    }

    @Override // com.google.android.exoplayer2.source.smoothstreaming.b
    public void f(com.google.android.exoplayer2.source.smoothstreaming.manifest.a aVar) {
        com.google.android.exoplayer2.source.smoothstreaming.manifest.a.b[] bVarArr = this.f18180f.f18237f;
        int i10 = this.f18176b;
        com.google.android.exoplayer2.source.smoothstreaming.manifest.a.b bVar = bVarArr[i10];
        int i11 = bVar.f18253k;
        com.google.android.exoplayer2.source.smoothstreaming.manifest.a.b bVar2 = aVar.f18237f[i10];
        if (i11 == 0 || bVar2.f18253k == 0) {
            this.f18181g += i11;
        } else {
            int i12 = i11 - 1;
            long jE = bVar.e(i12) + bVar.c(i12);
            long jE2 = bVar2.e(0);
            if (jE <= jE2) {
                this.f18181g += i11;
            } else {
                this.f18181g += bVar.d(jE2);
            }
        }
        this.f18180f = aVar;
    }

    @Override // ta.j
    public final void g(long j10, long j11, List list, h hVar) {
        List list2;
        int iE;
        long j12 = j11;
        if (this.f18182h != null) {
            return;
        }
        com.google.android.exoplayer2.source.smoothstreaming.manifest.a aVar = this.f18180f;
        com.google.android.exoplayer2.source.smoothstreaming.manifest.a.b bVar = aVar.f18237f[this.f18176b];
        if (bVar.f18253k == 0) {
            hVar.f53221b = !aVar.f18235d;
            return;
        }
        if (list.isEmpty()) {
            iE = bVar.d(j12);
            list2 = list;
        } else {
            list2 = list;
            iE = (int) (((n) list2.get(list.size() - 1)).e() - ((long) this.f18181g));
            if (iE < 0) {
                this.f18182h = new BehindLiveWindowException();
                return;
            }
        }
        if (iE >= bVar.f18253k) {
            hVar.f53221b = !this.f18180f.f18235d;
            return;
        }
        long j13 = j12 - j10;
        long j14 = j(j10);
        int length = this.f18179e.length();
        ta.o[] oVarArr = new ta.o[length];
        for (int i10 = 0; i10 < length; i10++) {
            oVarArr[i10] = new b(bVar, this.f18179e.getIndexInTrackGroup(i10), iE);
        }
        this.f18179e.e(j10, j13, j14, list2, oVarArr);
        long jE = bVar.e(iE);
        long jC = jE + bVar.c(iE);
        if (!list.isEmpty()) {
            j12 = C.TIME_UNSET;
        }
        long j15 = j12;
        int i11 = iE + this.f18181g;
        int selectedIndex = this.f18179e.getSelectedIndex();
        hVar.f53220a = i(this.f18179e.getSelectedFormat(), this.f18178d, bVar.a(this.f18179e.getIndexInTrackGroup(selectedIndex), iE), i11, jE, jC, j15, this.f18179e.getSelectionReason(), this.f18179e.getSelectionData(), this.f18177c[selectedIndex], null);
    }

    @Override // ta.j
    public int getPreferredQueueSize(long j10, List list) {
        return (this.f18182h != null || this.f18179e.length() < 2) ? list.size() : this.f18179e.evaluateQueueSize(j10, list);
    }

    @Override // ta.j
    public boolean h(ta.f fVar, boolean z10, com.google.android.exoplayer2.upstream.c.C0294c c0294c, com.google.android.exoplayer2.upstream.c cVar) {
        com.google.android.exoplayer2.upstream.c.b bVarD = cVar.d(z.c(this.f18179e), c0294c);
        if (!z10 || bVarD == null || bVarD.f18805a != 2) {
            return false;
        }
        r rVar = this.f18179e;
        return rVar.f(rVar.h(fVar.f53214d), bVarD.f18806b);
    }

    @Override // ta.j
    public void maybeThrowError() throws IOException {
        IOException iOException = this.f18182h;
        if (iOException != null) {
            throw iOException;
        }
        this.f18175a.maybeThrowError();
    }

    @Override // ta.j
    public void release() {
        for (g gVar : this.f18177c) {
            gVar.release();
        }
    }

    @Override // ta.j
    public void e(ta.f fVar) {
    }
}
