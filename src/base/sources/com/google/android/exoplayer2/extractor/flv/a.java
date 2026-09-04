package com.google.android.exoplayer2.extractor.flv;

import com.google.android.exoplayer2.v0;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Collections;
import ob.d0;
import u9.b0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class a extends TagPayloadReader {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int[] f16899e = {5512, 11025, 22050, 44100};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f16900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f16901c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f16902d;

    public a(b0 b0Var) {
        super(b0Var);
    }

    @Override // com.google.android.exoplayer2.extractor.flv.TagPayloadReader
    protected boolean b(d0 d0Var) throws TagPayloadReader.UnsupportedFormatException {
        if (this.f16900b) {
            d0Var.V(1);
        } else {
            int iH = d0Var.H();
            int i10 = (iH >> 4) & 15;
            this.f16902d = i10;
            if (i10 == 2) {
                this.f16898a.e(new v0.b().g0(MimeTypes.AUDIO_MPEG).J(1).h0(f16899e[(iH >> 2) & 3]).G());
                this.f16901c = true;
            } else if (i10 == 7 || i10 == 8) {
                this.f16898a.e(new v0.b().g0(i10 == 7 ? MimeTypes.AUDIO_ALAW : MimeTypes.AUDIO_MLAW).J(1).h0(8000).G());
                this.f16901c = true;
            } else if (i10 != 10) {
                throw new TagPayloadReader.UnsupportedFormatException("Audio format not supported: " + this.f16902d);
            }
            this.f16900b = true;
        }
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.flv.TagPayloadReader
    protected boolean c(d0 d0Var, long j10) {
        if (this.f16902d == 2) {
            int iA = d0Var.a();
            this.f16898a.c(d0Var, iA);
            this.f16898a.f(j10, 1, iA, 0, null);
            return true;
        }
        int iH = d0Var.H();
        if (iH != 0 || this.f16901c) {
            if (this.f16902d == 10 && iH != 1) {
                return false;
            }
            int iA2 = d0Var.a();
            this.f16898a.c(d0Var, iA2);
            this.f16898a.f(j10, 1, iA2, 0, null);
            return true;
        }
        int iA3 = d0Var.a();
        byte[] bArr = new byte[iA3];
        d0Var.l(bArr, 0, iA3);
        q9.a.b bVarF = q9.a.f(bArr);
        this.f16898a.e(new v0.b().g0(MimeTypes.AUDIO_AAC).K(bVarF.f50441c).J(bVarF.f50440b).h0(bVarF.f50439a).V(Collections.singletonList(bArr)).G());
        this.f16901c = true;
        return false;
    }
}
