package androidx.media3.extractor.flv;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Collections;
import o2.o0;
import t1.o;
import w1.u;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class a extends TagPayloadReader {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int[] f6246e = {5512, 11025, 22050, 44100};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f6247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f6248c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f6249d;

    public a(o0 o0Var) {
        super(o0Var);
    }

    @Override // androidx.media3.extractor.flv.TagPayloadReader
    protected boolean b(u uVar) throws TagPayloadReader.UnsupportedFormatException {
        if (this.f6247b) {
            uVar.U(1);
        } else {
            int iG = uVar.G();
            int i10 = (iG >> 4) & 15;
            this.f6249d = i10;
            if (i10 == 2) {
                this.f6245a.b(new o.b().o0(MimeTypes.AUDIO_MPEG).N(1).p0(f6246e[(iG >> 2) & 3]).K());
                this.f6248c = true;
            } else if (i10 == 7 || i10 == 8) {
                this.f6245a.b(new o.b().o0(i10 == 7 ? MimeTypes.AUDIO_ALAW : MimeTypes.AUDIO_MLAW).N(1).p0(8000).K());
                this.f6248c = true;
            } else if (i10 != 10) {
                throw new TagPayloadReader.UnsupportedFormatException("Audio format not supported: " + this.f6249d);
            }
            this.f6247b = true;
        }
        return true;
    }

    @Override // androidx.media3.extractor.flv.TagPayloadReader
    protected boolean c(u uVar, long j10) {
        if (this.f6249d == 2) {
            int iA = uVar.a();
            this.f6245a.c(uVar, iA);
            this.f6245a.e(j10, 1, iA, 0, null);
            return true;
        }
        int iG = uVar.G();
        if (iG != 0 || this.f6248c) {
            if (this.f6249d == 10 && iG != 1) {
                return false;
            }
            int iA2 = uVar.a();
            this.f6245a.c(uVar, iA2);
            this.f6245a.e(j10, 1, iA2, 0, null);
            return true;
        }
        int iA3 = uVar.a();
        byte[] bArr = new byte[iA3];
        uVar.l(bArr, 0, iA3);
        o2.a.b bVarE = o2.a.e(bArr);
        this.f6245a.b(new o.b().o0(MimeTypes.AUDIO_AAC).O(bVarE.f47966c).N(bVarE.f47965b).p0(bVarE.f47964a).b0(Collections.singletonList(bArr)).K());
        this.f6248c = true;
        return false;
    }
}
