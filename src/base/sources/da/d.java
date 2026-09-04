package da;

import com.google.android.exoplayer2.ParserException;
import ob.d0;
import u9.b0;
import u9.k;
import u9.l;
import u9.m;
import u9.p;
import u9.y;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class d implements k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p f36504d = new p() { // from class: da.c
        @Override // u9.p
        public final k[] createExtractors() {
            return d.a();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private m f36505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private i f36506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f36507c;

    public static /* synthetic */ k[] a() {
        return new k[]{new d()};
    }

    private static d0 e(d0 d0Var) {
        d0Var.U(0);
        return d0Var;
    }

    private boolean f(l lVar) {
        f fVar = new f();
        if (fVar.a(lVar, true) && (fVar.f36514b & 2) == 2) {
            int iMin = Math.min(fVar.f36521i, 8);
            d0 d0Var = new d0(iMin);
            lVar.peekFully(d0Var.e(), 0, iMin);
            if (b.p(e(d0Var))) {
                this.f36506b = new b();
            } else if (j.r(e(d0Var))) {
                this.f36506b = new j();
            } else if (h.o(e(d0Var))) {
                this.f36506b = new h();
            }
            return true;
        }
        return false;
    }

    @Override // u9.k
    public void b(m mVar) {
        this.f36505a = mVar;
    }

    @Override // u9.k
    public int c(l lVar, y yVar) throws ParserException {
        ob.a.i(this.f36505a);
        if (this.f36506b == null) {
            if (!f(lVar)) {
                throw ParserException.a("Failed to determine bitstream type", null);
            }
            lVar.resetPeekPosition();
        }
        if (!this.f36507c) {
            b0 b0VarTrack = this.f36505a.track(0, 1);
            this.f36505a.endTracks();
            this.f36506b.d(this.f36505a, b0VarTrack);
            this.f36507c = true;
        }
        return this.f36506b.g(lVar, yVar);
    }

    @Override // u9.k
    public boolean d(l lVar) {
        try {
            return f(lVar);
        } catch (ParserException unused) {
            return false;
        }
    }

    @Override // u9.k
    public void seek(long j10, long j11) {
        i iVar = this.f36506b;
        if (iVar != null) {
            iVar.m(j10, j11);
        }
    }

    @Override // u9.k
    public void release() {
    }
}
