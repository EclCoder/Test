package u3;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class b implements o2.p {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final o2.u f53743d = new o2.u() { // from class: u3.a
        @Override // o2.u
        public final o2.p[] createExtractors() {
            return b.a();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f53744a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w1.u f53745b = new w1.u(2786);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f53746c;

    public static /* synthetic */ o2.p[] a() {
        return new o2.p[]{new b()};
    }

    @Override // o2.p
    public int b(o2.q qVar, o2.i0 i0Var) {
        int i10 = qVar.read(this.f53745b.e(), 0, 2786);
        if (i10 == -1) {
            return -1;
        }
        this.f53745b.T(0);
        this.f53745b.S(i10);
        if (!this.f53746c) {
            this.f53744a.c(0L, 4);
            this.f53746c = true;
        }
        this.f53744a.b(this.f53745b);
        return 0;
    }

    @Override // o2.p
    public void c(o2.r rVar) {
        this.f53744a.d(rVar, new k0.d(0, 1));
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
            qVar.peekFully(uVar.e(), 0, 6);
            uVar.T(0);
            if (uVar.M() != 2935) {
                qVar.resetPeekPosition();
                i12++;
                if (i12 - i10 >= 8192) {
                    return false;
                }
                qVar.advancePeekPosition(i12);
                i11 = 0;
            } else {
                i11++;
                if (i11 >= 4) {
                    return true;
                }
                int iG = o2.b.g(uVar.e());
                if (iG == -1) {
                    return false;
                }
                qVar.advancePeekPosition(iG - 6);
            }
        }
    }

    @Override // o2.p
    public void seek(long j10, long j11) {
        this.f53746c = false;
        this.f53744a.seek();
    }

    @Override // o2.p
    public void release() {
    }
}
