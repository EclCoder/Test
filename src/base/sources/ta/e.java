package ta;

import android.util.SparseArray;
import com.google.android.exoplayer2.v0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.List;
import ob.d0;
import ob.r0;
import p9.s1;
import u9.b0;
import u9.y;
import u9.z;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class e implements u9.m, g {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final g.a f53193j = new g.a() { // from class: ta.d
        @Override // ta.g.a
        public final g a(int i10, v0 v0Var, boolean z10, List list, b0 b0Var, s1 s1Var) {
            return e.f(i10, v0Var, z10, list, b0Var, s1Var);
        }
    };

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final y f53194k = new y();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u9.k f53195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f53196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final v0 f53197c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final SparseArray f53198d = new SparseArray();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f53199e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private g.b f53200f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f53201g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private z f53202h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private v0[] f53203i;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a implements b0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f53204a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f53205b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final v0 f53206c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final u9.j f53207d = new u9.j();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public v0 f53208e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private b0 f53209f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f53210g;

        public a(int i10, int i11, v0 v0Var) {
            this.f53204a = i10;
            this.f53205b = i11;
            this.f53206c = v0Var;
        }

        @Override // u9.b0
        public void b(d0 d0Var, int i10, int i11) {
            ((b0) r0.j(this.f53209f)).c(d0Var, i10);
        }

        @Override // u9.b0
        public int d(nb.h hVar, int i10, boolean z10, int i11) {
            return ((b0) r0.j(this.f53209f)).a(hVar, i10, z10);
        }

        @Override // u9.b0
        public void e(v0 v0Var) {
            v0 v0Var2 = this.f53206c;
            if (v0Var2 != null) {
                v0Var = v0Var.k(v0Var2);
            }
            this.f53208e = v0Var;
            ((b0) r0.j(this.f53209f)).e(this.f53208e);
        }

        @Override // u9.b0
        public void f(long j10, int i10, int i11, int i12, b0.a aVar) {
            long j11 = this.f53210g;
            if (j11 != C.TIME_UNSET && j10 >= j11) {
                this.f53209f = this.f53207d;
            }
            ((b0) r0.j(this.f53209f)).f(j10, i10, i11, i12, aVar);
        }

        public void g(g.b bVar, long j10) {
            if (bVar == null) {
                this.f53209f = this.f53207d;
                return;
            }
            this.f53210g = j10;
            b0 b0VarTrack = bVar.track(this.f53204a, this.f53205b);
            this.f53209f = b0VarTrack;
            v0 v0Var = this.f53208e;
            if (v0Var != null) {
                b0VarTrack.e(v0Var);
            }
        }
    }

    public e(u9.k kVar, int i10, v0 v0Var) {
        this.f53195a = kVar;
        this.f53196b = i10;
        this.f53197c = v0Var;
    }

    public static /* synthetic */ g f(int i10, v0 v0Var, boolean z10, List list, b0 b0Var, s1 s1Var) {
        u9.k gVar;
        String str = v0Var.f18867k;
        if (ob.y.r(str)) {
            return null;
        }
        if (ob.y.q(str)) {
            gVar = new aa.e(1);
        } else {
            gVar = new ca.g(z10 ? 4 : 0, null, null, list, b0Var);
        }
        return new e(gVar, i10, v0Var);
    }

    @Override // ta.g
    public boolean a(u9.l lVar) {
        int iC = this.f53195a.c(lVar, f53194k);
        ob.a.g(iC != 1);
        return iC == 0;
    }

    @Override // ta.g
    public u9.c b() {
        z zVar = this.f53202h;
        if (zVar instanceof u9.c) {
            return (u9.c) zVar;
        }
        return null;
    }

    @Override // u9.m
    public void c(z zVar) {
        this.f53202h = zVar;
    }

    @Override // ta.g
    public void d(g.b bVar, long j10, long j11) {
        this.f53200f = bVar;
        this.f53201g = j11;
        if (!this.f53199e) {
            this.f53195a.b(this);
            if (j10 != C.TIME_UNSET) {
                this.f53195a.seek(0L, j10);
            }
            this.f53199e = true;
            return;
        }
        u9.k kVar = this.f53195a;
        if (j10 == C.TIME_UNSET) {
            j10 = 0;
        }
        kVar.seek(0L, j10);
        for (int i10 = 0; i10 < this.f53198d.size(); i10++) {
            ((a) this.f53198d.valueAt(i10)).g(bVar, j11);
        }
    }

    @Override // ta.g
    public v0[] e() {
        return this.f53203i;
    }

    @Override // u9.m
    public void endTracks() {
        v0[] v0VarArr = new v0[this.f53198d.size()];
        for (int i10 = 0; i10 < this.f53198d.size(); i10++) {
            v0VarArr[i10] = (v0) ob.a.i(((a) this.f53198d.valueAt(i10)).f53208e);
        }
        this.f53203i = v0VarArr;
    }

    @Override // ta.g
    public void release() {
        this.f53195a.release();
    }

    @Override // u9.m
    public b0 track(int i10, int i11) {
        a aVar = (a) this.f53198d.get(i10);
        if (aVar == null) {
            ob.a.g(this.f53203i == null);
            aVar = new a(i10, i11, i11 == this.f53196b ? this.f53197c : null);
            aVar.g(this.f53200f, this.f53201g);
            this.f53198d.put(i10, aVar);
        }
        return aVar;
    }
}
