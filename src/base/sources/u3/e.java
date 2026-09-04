package u3;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class e implements o2.p {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final o2.u f53780d = new o2.u() { // from class: u3.d
        @Override // o2.u
        public final o2.p[] createExtractors() {
            return e.a();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f53781a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w1.u f53782b = new w1.u(16384);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f53783c;

    public static /* synthetic */ o2.p[] a() {
        return new o2.p[]{new e()};
    }

    @Override // o2.p
    public int b(o2.q qVar, o2.i0 i0Var) {
        int i10 = qVar.read(this.f53782b.e(), 0, 16384);
        if (i10 == -1) {
            return -1;
        }
        this.f53782b.T(0);
        this.f53782b.S(i10);
        if (!this.f53783c) {
            this.f53781a.c(0L, 4);
            this.f53783c = true;
        }
        this.f53781a.b(this.f53782b);
        return 0;
    }

    @Override // o2.p
    public void c(o2.r rVar) {
        this.f53781a.d(rVar, new k0.d(0, 1));
        rVar.endTracks();
        rVar.d(new o2.j0.b(C.TIME_UNSET));
    }

    @Override // o2.p
    public boolean d(o2.q qVar) {
        w1.u uVar = new w1.u(10);
        int i10 = 0;
        while (true) {
            qVar.peekFully(uVar.e(), 0, 10);
            uVar.T(0);
            if (uVar.J() != 4801587) {
                break;
            }
            uVar.U(3);
            int iF = uVar.F();
            i10 += iF + 10;
            qVar.advancePeekPosition(iF);
        }
        qVar.resetPeekPosition();
        qVar.advancePeekPosition(i10);
        int i11 = 0;
        int i12 = i10;
        while (true) {
            qVar.peekFully(uVar.e(), 0, 7);
            uVar.T(0);
            int iM = uVar.M();
            if (iM == 44096 || iM == 44097) {
                i11++;
                if (i11 >= 4) {
                    return true;
                }
                int iE = o2.c.e(uVar.e(), iM);
                if (iE == -1) {
                    return false;
                }
                qVar.advancePeekPosition(iE - 7);
            } else {
                qVar.resetPeekPosition();
                i12++;
                if (i12 - i10 >= 8192) {
                    return false;
                }
                qVar.advancePeekPosition(i12);
                i11 = 0;
            }
        }
    }

    @Override // o2.p
    public void seek(long j10, long j11) {
        this.f53783c = false;
        this.f53781a.seek();
    }

    @Override // o2.p
    public void release() {
    }
}
