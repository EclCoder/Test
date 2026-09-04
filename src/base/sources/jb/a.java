package jb;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import bb.h;
import bb.i;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.charset.Charset;
import java.util.List;
import ob.d0;
import ob.r0;
import ob.u;
import sc.e;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends h {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final d0 f42203o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final boolean f42204p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final int f42205q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final int f42206r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final String f42207s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final float f42208t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final int f42209u;

    public a(List list) {
        super("Tx3gDecoder");
        this.f42203o = new d0();
        int size = list.size();
        String str = C.SANS_SERIF_NAME;
        if (size != 1 || (((byte[]) list.get(0)).length != 48 && ((byte[]) list.get(0)).length != 53)) {
            this.f42205q = 0;
            this.f42206r = -1;
            this.f42207s = C.SANS_SERIF_NAME;
            this.f42204p = false;
            this.f42208t = 0.85f;
            this.f42209u = -1;
            return;
        }
        byte[] bArr = (byte[]) list.get(0);
        this.f42205q = bArr[24];
        this.f42206r = ((bArr[26] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | ((bArr[27] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArr[28] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArr[29] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
        this.f42207s = "Serif".equals(r0.F(bArr, 43, bArr.length - 43)) ? C.SERIF_NAME : str;
        int i10 = bArr[25] * 20;
        this.f42209u = i10;
        boolean z10 = (bArr[0] & 32) != 0;
        this.f42204p = z10;
        if (z10) {
            this.f42208t = r0.p(((bArr[11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr[10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8)) / i10, 0.0f, 0.95f);
        } else {
            this.f42208t = 0.85f;
        }
    }

    private static void A(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
        if (i10 != i11) {
            int i15 = i14 | 33;
            boolean z10 = (i10 & 1) != 0;
            boolean z11 = (i10 & 2) != 0;
            if (z10) {
                if (z11) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i12, i13, i15);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i12, i13, i15);
                }
            } else if (z11) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i12, i13, i15);
            }
            boolean z12 = (i10 & 4) != 0;
            if (z12) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i12, i13, i15);
            }
            if (z12 || z10 || z11) {
                return;
            }
            spannableStringBuilder.setSpan(new StyleSpan(0), i12, i13, i15);
        }
    }

    private static void B(SpannableStringBuilder spannableStringBuilder, String str, int i10, int i11) {
        if (str != C.SANS_SERIF_NAME) {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), i10, i11, 16711713);
        }
    }

    private static String C(d0 d0Var) throws SubtitleDecoderException {
        y(d0Var.a() >= 2);
        int iN = d0Var.N();
        if (iN == 0) {
            return "";
        }
        int iF = d0Var.f();
        Charset charsetP = d0Var.P();
        int iF2 = iN - (d0Var.f() - iF);
        if (charsetP == null) {
            charsetP = e.f52294c;
        }
        return d0Var.F(iF2, charsetP);
    }

    private void x(d0 d0Var, SpannableStringBuilder spannableStringBuilder) throws SubtitleDecoderException {
        y(d0Var.a() >= 12);
        int iN = d0Var.N();
        int iN2 = d0Var.N();
        d0Var.V(2);
        int iH = d0Var.H();
        d0Var.V(1);
        int iQ = d0Var.q();
        if (iN2 > spannableStringBuilder.length()) {
            u.i("Tx3gDecoder", "Truncating styl end (" + iN2 + ") to cueText.length() (" + spannableStringBuilder.length() + ").");
            iN2 = spannableStringBuilder.length();
        }
        int i10 = iN2;
        if (iN < i10) {
            A(spannableStringBuilder, iH, this.f42205q, iN, i10, 0);
            z(spannableStringBuilder, iQ, this.f42206r, iN, i10, 0);
            return;
        }
        u.i("Tx3gDecoder", "Ignoring styl with start (" + iN + ") >= end (" + i10 + ").");
    }

    private static void y(boolean z10) throws SubtitleDecoderException {
        if (!z10) {
            throw new SubtitleDecoderException("Unexpected subtitle format.");
        }
    }

    private static void z(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
        if (i10 != i11) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i10 >>> 8) | ((i10 & 255) << 24)), i12, i13, i14 | 33);
        }
    }

    @Override // bb.h
    protected i v(byte[] bArr, int i10, boolean z10) throws SubtitleDecoderException {
        this.f42203o.S(bArr, i10);
        String strC = C(this.f42203o);
        if (strC.isEmpty()) {
            return b.f42210b;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strC);
        A(spannableStringBuilder, this.f42205q, 0, 0, spannableStringBuilder.length(), 16711680);
        z(spannableStringBuilder, this.f42206r, -1, 0, spannableStringBuilder.length(), 16711680);
        B(spannableStringBuilder, this.f42207s, 0, spannableStringBuilder.length());
        float fP = this.f42208t;
        while (this.f42203o.a() >= 8) {
            int iF = this.f42203o.f();
            int iQ = this.f42203o.q();
            int iQ2 = this.f42203o.q();
            if (iQ2 == 1937013100) {
                y(this.f42203o.a() >= 2);
                int iN = this.f42203o.N();
                for (int i11 = 0; i11 < iN; i11++) {
                    x(this.f42203o, spannableStringBuilder);
                }
            } else if (iQ2 == 1952608120 && this.f42204p) {
                y(this.f42203o.a() >= 2);
                fP = r0.p(this.f42203o.N() / this.f42209u, 0.0f, 0.95f);
            }
            this.f42203o.U(iF + iQ);
        }
        return new b(new bb.b.C0112b().o(spannableStringBuilder).h(fP, 0).i(0).a());
    }
}
