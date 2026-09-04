package za;

import com.google.android.exoplayer2.v0;
import java.util.List;
import ob.d0;
import ob.r0;
import ob.u;
import q9.v;
import u9.b0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class j implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.exoplayer2.source.rtsp.h f58758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b0 f58759b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f58761d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f58763f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f58764g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f58760c = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f58762e = -1;

    public j(com.google.android.exoplayer2.source.rtsp.h hVar) {
        this.f58758a = hVar;
    }

    private static void d(d0 d0Var) {
        int iF = d0Var.f();
        ob.a.b(d0Var.g() > 18, "ID Header has insufficient data");
        ob.a.b(d0Var.E(8).equals("OpusHead"), "ID Header missing");
        ob.a.b(d0Var.H() == 1, "version number must always be 1");
        d0Var.U(iF);
    }

    @Override // za.k
    public void a(u9.m mVar, int i10) {
        b0 b0VarTrack = mVar.track(i10, 1);
        this.f58759b = b0VarTrack;
        b0VarTrack.e(this.f58758a.f17998c);
    }

    @Override // za.k
    public void b(d0 d0Var, long j10, int i10, boolean z10) {
        ob.a.i(this.f58759b);
        if (!this.f58763f) {
            d(d0Var);
            List listA = v.a(d0Var.e());
            v0.b bVarB = this.f58758a.f17998c.b();
            bVarB.V(listA);
            this.f58759b.e(bVarB.G());
            this.f58763f = true;
        } else if (this.f58764g) {
            int iB = ya.a.b(this.f58762e);
            if (i10 != iB) {
                u.i("RtpOpusReader", r0.D("Received RTP packet with unexpected sequence number. Expected: %d; received: %d.", Integer.valueOf(iB), Integer.valueOf(i10)));
            }
            int iA = d0Var.a();
            this.f58759b.c(d0Var, iA);
            this.f58759b.f(m.a(this.f58761d, j10, this.f58760c, 48000), 1, iA, 0, null);
        } else {
            ob.a.b(d0Var.g() >= 8, "Comment Header has insufficient data");
            ob.a.b(d0Var.E(8).equals("OpusTags"), "Comment Header should follow ID Header");
            this.f58764g = true;
        }
        this.f58762e = i10;
    }

    @Override // za.k
    public void c(long j10, int i10) {
        this.f58760c = j10;
    }

    @Override // za.k
    public void seek(long j10, long j11) {
        this.f58760c = j10;
        this.f58761d = j11;
    }
}
