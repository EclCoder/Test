package androidx.media3.extractor.flv;

import androidx.media3.common.ParserException;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import o2.o0;
import t1.o;
import w1.u;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class d extends TagPayloadReader {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final u f6270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final u f6271c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f6272d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f6273e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f6274f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f6275g;

    public d(o0 o0Var) {
        super(o0Var);
        this.f6270b = new u(x1.d.f56574a);
        this.f6271c = new u(4);
    }

    @Override // androidx.media3.extractor.flv.TagPayloadReader
    protected boolean b(u uVar) throws TagPayloadReader.UnsupportedFormatException {
        int iG = uVar.G();
        int i10 = (iG >> 4) & 15;
        int i11 = iG & 15;
        if (i11 == 7) {
            this.f6275g = i10;
            return i10 != 5;
        }
        throw new TagPayloadReader.UnsupportedFormatException("Video format not supported: " + i11);
    }

    @Override // androidx.media3.extractor.flv.TagPayloadReader
    protected boolean c(u uVar, long j10) throws ParserException {
        int iG = uVar.G();
        long jQ = j10 + (((long) uVar.q()) * 1000);
        if (iG == 0 && !this.f6273e) {
            u uVar2 = new u(new byte[uVar.a()]);
            uVar.l(uVar2.e(), 0, uVar.a());
            o2.d dVarB = o2.d.b(uVar2);
            this.f6272d = dVarB.f48003b;
            this.f6245a.b(new o.b().o0(MimeTypes.VIDEO_H264).O(dVarB.f48013l).t0(dVarB.f48004c).Y(dVarB.f48005d).k0(dVarB.f48012k).b0(dVarB.f48002a).K());
            this.f6273e = true;
            return false;
        }
        if (iG != 1 || !this.f6273e) {
            return false;
        }
        int i10 = this.f6275g == 1 ? 1 : 0;
        if (!this.f6274f && i10 == 0) {
            return false;
        }
        byte[] bArrE = this.f6271c.e();
        bArrE[0] = 0;
        bArrE[1] = 0;
        bArrE[2] = 0;
        int i11 = 4 - this.f6272d;
        int i12 = 0;
        while (uVar.a() > 0) {
            uVar.l(this.f6271c.e(), i11, this.f6272d);
            this.f6271c.T(0);
            int iK = this.f6271c.K();
            this.f6270b.T(0);
            this.f6245a.c(this.f6270b, 4);
            this.f6245a.c(uVar, iK);
            i12 = i12 + 4 + iK;
        }
        this.f6245a.e(jQ, i10, i12, 0, null);
        this.f6274f = true;
        return true;
    }
}
