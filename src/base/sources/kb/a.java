package kb;

import com.google.android.exoplayer2.text.SubtitleDecoderException;
import java.util.ArrayList;
import java.util.Collections;
import ob.d0;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends bb.h {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final d0 f43106o;

    public a() {
        super("Mp4WebvttDecoder");
        this.f43106o = new d0();
    }

    private static bb.b x(d0 d0Var, int i10) throws SubtitleDecoderException {
        CharSequence charSequenceQ = null;
        bb.b.C0112b c0112bO = null;
        while (i10 > 0) {
            if (i10 < 8) {
                throw new SubtitleDecoderException("Incomplete vtt cue box header found.");
            }
            int iQ = d0Var.q();
            int iQ2 = d0Var.q();
            int i11 = iQ - 8;
            String strF = r0.F(d0Var.e(), d0Var.f(), i11);
            d0Var.V(i11);
            i10 = (i10 - 8) - i11;
            if (iQ2 == 1937011815) {
                c0112bO = f.o(strF);
            } else if (iQ2 == 1885436268) {
                charSequenceQ = f.q(null, strF.trim(), Collections.EMPTY_LIST);
            }
        }
        if (charSequenceQ == null) {
            charSequenceQ = "";
        }
        return c0112bO != null ? c0112bO.o(charSequenceQ).a() : f.l(charSequenceQ);
    }

    @Override // bb.h
    protected bb.i v(byte[] bArr, int i10, boolean z10) throws SubtitleDecoderException {
        this.f43106o.S(bArr, i10);
        ArrayList arrayList = new ArrayList();
        while (this.f43106o.a() > 0) {
            if (this.f43106o.a() < 8) {
                throw new SubtitleDecoderException("Incomplete Mp4Webvtt Top Level box header found.");
            }
            int iQ = this.f43106o.q();
            if (this.f43106o.q() == 1987343459) {
                arrayList.add(x(this.f43106o, iQ - 8));
            } else {
                this.f43106o.V(iQ - 8);
            }
        }
        return new b(arrayList);
    }
}
