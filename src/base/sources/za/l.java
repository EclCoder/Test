package za;

import android.util.Log;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import ob.d0;
import ob.r0;
import u9.b0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class l implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.exoplayer2.source.rtsp.h f58765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b0 f58766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f58767c = C.TIME_UNSET;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f58768d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f58769e = -1;

    public l(com.google.android.exoplayer2.source.rtsp.h hVar) {
        this.f58765a = hVar;
    }

    @Override // za.k
    public void a(u9.m mVar, int i10) {
        b0 b0VarTrack = mVar.track(i10, 1);
        this.f58766b = b0VarTrack;
        b0VarTrack.e(this.f58765a.f17998c);
    }

    @Override // za.k
    public void b(d0 d0Var, long j10, int i10, boolean z10) {
        int iB;
        ob.a.e(this.f58766b);
        int i11 = this.f58769e;
        if (i11 != -1 && i10 != (iB = ya.a.b(i11))) {
            Log.w("RtpPcmReader", r0.D("Received RTP packet with unexpected sequence number. Expected: %d; received: %d.", Integer.valueOf(iB), Integer.valueOf(i10)));
        }
        long jA = m.a(this.f58768d, j10, this.f58767c, this.f58765a.f17997b);
        int iA = d0Var.a();
        this.f58766b.c(d0Var, iA);
        this.f58766b.f(jA, 1, iA, 0, null);
        this.f58769e = i10;
    }

    @Override // za.k
    public void c(long j10, int i10) {
        this.f58767c = j10;
    }

    @Override // za.k
    public void seek(long j10, long j11) {
        this.f58767c = j10;
        this.f58768d = j11;
    }
}
