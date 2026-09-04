package u3;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import o2.o0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class r implements m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private o0 f54049b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f54050c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f54052e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f54053f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w1.u f54048a = new w1.u(10);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f54051d = C.TIME_UNSET;

    @Override // u3.m
    public void b(w1.u uVar) {
        w1.a.i(this.f54049b);
        if (this.f54050c) {
            int iA = uVar.a();
            int i10 = this.f54053f;
            if (i10 < 10) {
                int iMin = Math.min(iA, 10 - i10);
                System.arraycopy(uVar.e(), uVar.f(), this.f54048a.e(), this.f54053f, iMin);
                if (this.f54053f + iMin == 10) {
                    this.f54048a.T(0);
                    if (73 != this.f54048a.G() || 68 != this.f54048a.G() || 51 != this.f54048a.G()) {
                        w1.n.h("Id3Reader", "Discarding invalid ID3 tag");
                        this.f54050c = false;
                        return;
                    } else {
                        this.f54048a.U(3);
                        this.f54052e = this.f54048a.F() + 10;
                    }
                }
            }
            int iMin2 = Math.min(iA, this.f54052e - this.f54053f);
            this.f54049b.c(uVar, iMin2);
            this.f54053f += iMin2;
        }
    }

    @Override // u3.m
    public void c(long j10, int i10) {
        if ((i10 & 4) == 0) {
            return;
        }
        this.f54050c = true;
        this.f54051d = j10;
        this.f54052e = 0;
        this.f54053f = 0;
    }

    @Override // u3.m
    public void d(o2.r rVar, k0.d dVar) {
        dVar.a();
        o0 o0VarTrack = rVar.track(dVar.c(), 5);
        this.f54049b = o0VarTrack;
        o0VarTrack.b(new t1.o.b().a0(dVar.b()).o0(MimeTypes.APPLICATION_ID3).K());
    }

    @Override // u3.m
    public void e(boolean z10) {
        int i10;
        w1.a.i(this.f54049b);
        if (this.f54050c && (i10 = this.f54052e) != 0 && this.f54053f == i10) {
            w1.a.g(this.f54051d != C.TIME_UNSET);
            this.f54049b.e(this.f54051d, 1, this.f54052e, 0, null);
            this.f54050c = false;
        }
    }

    @Override // u3.m
    public void seek() {
        this.f54050c = false;
        this.f54051d = C.TIME_UNSET;
    }
}
