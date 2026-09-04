package com.google.android.exoplayer2.extractor.flv;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.v0;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import ob.d0;
import ob.z;
import u9.b0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class d extends TagPayloadReader {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d0 f16923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d0 f16924c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f16925d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f16926e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f16927f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f16928g;

    public d(b0 b0Var) {
        super(b0Var);
        this.f16923b = new d0(z.f48467a);
        this.f16924c = new d0(4);
    }

    @Override // com.google.android.exoplayer2.extractor.flv.TagPayloadReader
    protected boolean b(d0 d0Var) throws TagPayloadReader.UnsupportedFormatException {
        int iH = d0Var.H();
        int i10 = (iH >> 4) & 15;
        int i11 = iH & 15;
        if (i11 == 7) {
            this.f16928g = i10;
            return i10 != 5;
        }
        throw new TagPayloadReader.UnsupportedFormatException("Video format not supported: " + i11);
    }

    @Override // com.google.android.exoplayer2.extractor.flv.TagPayloadReader
    protected boolean c(d0 d0Var, long j10) throws ParserException {
        int iH = d0Var.H();
        long jR = j10 + (((long) d0Var.r()) * 1000);
        if (iH == 0 && !this.f16926e) {
            d0 d0Var2 = new d0(new byte[d0Var.a()]);
            d0Var.l(d0Var2.e(), 0, d0Var.a());
            pb.a aVarB = pb.a.b(d0Var2);
            this.f16925d = aVarB.f49815b;
            this.f16898a.e(new v0.b().g0(MimeTypes.VIDEO_H264).K(aVarB.f49822i).n0(aVarB.f49816c).S(aVarB.f49817d).c0(aVarB.f49821h).V(aVarB.f49814a).G());
            this.f16926e = true;
            return false;
        }
        if (iH != 1 || !this.f16926e) {
            return false;
        }
        int i10 = this.f16928g == 1 ? 1 : 0;
        if (!this.f16927f && i10 == 0) {
            return false;
        }
        byte[] bArrE = this.f16924c.e();
        bArrE[0] = 0;
        bArrE[1] = 0;
        bArrE[2] = 0;
        int i11 = 4 - this.f16925d;
        int i12 = 0;
        while (d0Var.a() > 0) {
            d0Var.l(this.f16924c.e(), i11, this.f16925d);
            this.f16924c.U(0);
            int iL = this.f16924c.L();
            this.f16923b.U(0);
            this.f16898a.c(this.f16923b, 4);
            this.f16898a.c(d0Var, iL);
            i12 = i12 + 4 + iL;
        }
        this.f16898a.f(jR, i10, i12, 0, null);
        this.f16927f = true;
        return true;
    }
}
