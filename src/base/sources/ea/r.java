package ea;

import com.google.android.exoplayer2.v0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class r implements m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private u9.b0 f37592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f37593c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f37595e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f37596f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ob.d0 f37591a = new ob.d0(10);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f37594d = C.TIME_UNSET;

    @Override // ea.m
    public void b(ob.d0 d0Var) {
        ob.a.i(this.f37592b);
        if (this.f37593c) {
            int iA = d0Var.a();
            int i10 = this.f37596f;
            if (i10 < 10) {
                int iMin = Math.min(iA, 10 - i10);
                System.arraycopy(d0Var.e(), d0Var.f(), this.f37591a.e(), this.f37596f, iMin);
                if (this.f37596f + iMin == 10) {
                    this.f37591a.U(0);
                    if (73 != this.f37591a.H() || 68 != this.f37591a.H() || 51 != this.f37591a.H()) {
                        ob.u.i("Id3Reader", "Discarding invalid ID3 tag");
                        this.f37593c = false;
                        return;
                    } else {
                        this.f37591a.V(3);
                        this.f37595e = this.f37591a.G() + 10;
                    }
                }
            }
            int iMin2 = Math.min(iA, this.f37595e - this.f37596f);
            this.f37592b.c(d0Var, iMin2);
            this.f37596f += iMin2;
        }
    }

    @Override // ea.m
    public void c(long j10, int i10) {
        if ((i10 & 4) == 0) {
            return;
        }
        this.f37593c = true;
        if (j10 != C.TIME_UNSET) {
            this.f37594d = j10;
        }
        this.f37595e = 0;
        this.f37596f = 0;
    }

    @Override // ea.m
    public void d(u9.m mVar, i0.d dVar) {
        dVar.a();
        u9.b0 b0VarTrack = mVar.track(dVar.c(), 5);
        this.f37592b = b0VarTrack;
        b0VarTrack.e(new v0.b().U(dVar.b()).g0(MimeTypes.APPLICATION_ID3).G());
    }

    @Override // ea.m
    public void packetFinished() {
        int i10;
        ob.a.i(this.f37592b);
        if (this.f37593c && (i10 = this.f37595e) != 0 && this.f37596f == i10) {
            long j10 = this.f37594d;
            if (j10 != C.TIME_UNSET) {
                this.f37592b.f(j10, 1, i10, 0, null);
            }
            this.f37593c = false;
        }
    }

    @Override // ea.m
    public void seek() {
        this.f37593c = false;
        this.f37594d = C.TIME_UNSET;
    }
}
