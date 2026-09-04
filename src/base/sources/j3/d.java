package j3;

import androidx.media3.common.ParserException;
import o2.i0;
import o2.o0;
import o2.p;
import o2.q;
import o2.r;
import o2.u;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class d implements p {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final u f41947d = new u() { // from class: j3.c
        @Override // o2.u
        public final p[] createExtractors() {
            return d.a();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private r f41948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private i f41949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f41950c;

    public static /* synthetic */ p[] a() {
        return new p[]{new d()};
    }

    private static w1.u g(w1.u uVar) {
        uVar.T(0);
        return uVar;
    }

    private boolean h(q qVar) {
        f fVar = new f();
        if (fVar.a(qVar, true) && (fVar.f41957b & 2) == 2) {
            int iMin = Math.min(fVar.f41964i, 8);
            w1.u uVar = new w1.u(iMin);
            qVar.peekFully(uVar.e(), 0, iMin);
            if (b.p(g(uVar))) {
                this.f41949b = new b();
            } else if (j.r(g(uVar))) {
                this.f41949b = new j();
            } else if (h.o(g(uVar))) {
                this.f41949b = new h();
            }
            return true;
        }
        return false;
    }

    @Override // o2.p
    public int b(q qVar, i0 i0Var) throws ParserException {
        w1.a.i(this.f41948a);
        if (this.f41949b == null) {
            if (!h(qVar)) {
                throw ParserException.a("Failed to determine bitstream type", null);
            }
            qVar.resetPeekPosition();
        }
        if (!this.f41950c) {
            o0 o0VarTrack = this.f41948a.track(0, 1);
            this.f41948a.endTracks();
            this.f41949b.d(this.f41948a, o0VarTrack);
            this.f41950c = true;
        }
        return this.f41949b.g(qVar, i0Var);
    }

    @Override // o2.p
    public void c(r rVar) {
        this.f41948a = rVar;
    }

    @Override // o2.p
    public boolean d(q qVar) {
        try {
            return h(qVar);
        } catch (ParserException unused) {
            return false;
        }
    }

    @Override // o2.p
    public void seek(long j10, long j11) {
        i iVar = this.f41949b;
        if (iVar != null) {
            iVar.m(j10, j11);
        }
    }

    @Override // o2.p
    public void release() {
    }
}
