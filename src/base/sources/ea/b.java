package ea;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class b implements u9.k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final u9.p f37318d = new u9.p() { // from class: ea.a
        @Override // u9.p
        public final u9.k[] createExtractors() {
            return b.a();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f37319a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ob.d0 f37320b = new ob.d0(2786);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f37321c;

    public static /* synthetic */ u9.k[] a() {
        return new u9.k[]{new b()};
    }

    @Override // u9.k
    public void b(u9.m mVar) {
        this.f37319a.d(mVar, new i0.d(0, 1));
        mVar.endTracks();
        mVar.c(new u9.z.b(C.TIME_UNSET));
    }

    @Override // u9.k
    public int c(u9.l lVar, u9.y yVar) {
        int i10 = lVar.read(this.f37320b.e(), 0, 2786);
        if (i10 == -1) {
            return -1;
        }
        this.f37320b.U(0);
        this.f37320b.T(i10);
        if (!this.f37321c) {
            this.f37319a.c(0L, 4);
            this.f37321c = true;
        }
        this.f37319a.b(this.f37320b);
        return 0;
    }

    @Override // u9.k
    public boolean d(u9.l lVar) {
        ob.d0 d0Var = new ob.d0(10);
        int i10 = 0;
        while (true) {
            lVar.peekFully(d0Var.e(), 0, 10);
            d0Var.U(0);
            if (d0Var.K() != 4801587) {
                break;
            }
            d0Var.V(3);
            int iG = d0Var.G();
            i10 += iG + 10;
            lVar.advancePeekPosition(iG);
        }
        lVar.resetPeekPosition();
        lVar.advancePeekPosition(i10);
        int i11 = 0;
        int i12 = i10;
        while (true) {
            lVar.peekFully(d0Var.e(), 0, 6);
            d0Var.U(0);
            if (d0Var.N() != 2935) {
                lVar.resetPeekPosition();
                i12++;
                if (i12 - i10 >= 8192) {
                    return false;
                }
                lVar.advancePeekPosition(i12);
                i11 = 0;
            } else {
                i11++;
                if (i11 >= 4) {
                    return true;
                }
                int iG2 = q9.b.g(d0Var.e());
                if (iG2 == -1) {
                    return false;
                }
                lVar.advancePeekPosition(iG2 - 6);
            }
        }
    }

    @Override // u9.k
    public void seek(long j10, long j11) {
        this.f37321c = false;
        this.f37319a.seek();
    }

    @Override // u9.k
    public void release() {
    }
}
