package za;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import ob.d0;
import ob.r0;
import ob.u;
import u9.b0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class d implements k {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int[] f58704h = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int[] f58705i = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.exoplayer2.source.rtsp.h f58706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f58707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f58708c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private b0 f58709d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f58710e = C.TIME_UNSET;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f58712g = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f58711f = 0;

    public d(com.google.android.exoplayer2.source.rtsp.h hVar) {
        this.f58706a = hVar;
        this.f58707b = MimeTypes.AUDIO_AMR_WB.equals(ob.a.e(hVar.f17998c.f18868l));
        this.f58708c = hVar.f17997b;
    }

    public static int d(int i10, boolean z10) {
        boolean z11 = (i10 >= 0 && i10 <= 8) || i10 == 15;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Illegal AMR ");
        sb2.append(z10 ? "WB" : "NB");
        sb2.append(" frame type ");
        sb2.append(i10);
        ob.a.b(z11, sb2.toString());
        return z10 ? f58705i[i10] : f58704h[i10];
    }

    @Override // za.k
    public void a(u9.m mVar, int i10) {
        b0 b0VarTrack = mVar.track(i10, 1);
        this.f58709d = b0VarTrack;
        b0VarTrack.e(this.f58706a.f17998c);
    }

    @Override // za.k
    public void b(d0 d0Var, long j10, int i10, boolean z10) {
        int iB;
        ob.a.i(this.f58709d);
        int i11 = this.f58712g;
        if (i11 != -1 && i10 != (iB = ya.a.b(i11))) {
            u.i("RtpAmrReader", r0.D("Received RTP packet with unexpected sequence number. Expected: %d; received: %d.", Integer.valueOf(iB), Integer.valueOf(i10)));
        }
        d0Var.V(1);
        int iD = d((d0Var.j() >> 3) & 15, this.f58707b);
        int iA = d0Var.a();
        ob.a.b(iA == iD, "compound payload not supported currently");
        this.f58709d.c(d0Var, iA);
        this.f58709d.f(m.a(this.f58711f, j10, this.f58710e, this.f58708c), 1, iA, 0, null);
        this.f58712g = i10;
    }

    @Override // za.k
    public void c(long j10, int i10) {
        this.f58710e = j10;
    }

    @Override // za.k
    public void seek(long j10, long j11) {
        this.f58710e = j10;
        this.f58711f = j11;
    }
}
