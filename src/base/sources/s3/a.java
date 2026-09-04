package s3;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.charset.Charset;
import java.util.List;
import l3.r;
import sc.e;
import w1.c0;
import w1.h;
import w1.n;
import w1.u;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class a implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u f51467a = new u();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f51468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f51469c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f51470d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f51471e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f51472f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f51473g;

    public a(List list) {
        int size = list.size();
        String str = C.SANS_SERIF_NAME;
        if (size != 1 || (((byte[]) list.get(0)).length != 48 && ((byte[]) list.get(0)).length != 53)) {
            this.f51469c = 0;
            this.f51470d = -1;
            this.f51471e = C.SANS_SERIF_NAME;
            this.f51468b = false;
            this.f51472f = 0.85f;
            this.f51473g = -1;
            return;
        }
        byte[] bArr = (byte[]) list.get(0);
        this.f51469c = bArr[24];
        this.f51470d = ((bArr[26] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | ((bArr[27] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArr[28] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArr[29] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
        this.f51471e = "Serif".equals(c0.H(bArr, 43, bArr.length - 43)) ? C.SERIF_NAME : str;
        int i10 = bArr[25] * 20;
        this.f51473g = i10;
        boolean z10 = (bArr[0] & 32) != 0;
        this.f51468b = z10;
        if (z10) {
            this.f51472f = c0.n(((bArr[11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr[10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8)) / i10, 0.0f, 0.95f);
        } else {
            this.f51472f = 0.85f;
        }
    }

    private void d(u uVar, SpannableStringBuilder spannableStringBuilder) {
        w1.a.a(uVar.a() >= 12);
        int iM = uVar.M();
        int iM2 = uVar.M();
        uVar.U(2);
        int iG = uVar.G();
        uVar.U(1);
        int iP = uVar.p();
        if (iM2 > spannableStringBuilder.length()) {
            n.h("Tx3gParser", "Truncating styl end (" + iM2 + ") to cueText.length() (" + spannableStringBuilder.length() + ").");
            iM2 = spannableStringBuilder.length();
        }
        int i10 = iM2;
        if (iM < i10) {
            f(spannableStringBuilder, iG, this.f51469c, iM, i10, 0);
            e(spannableStringBuilder, iP, this.f51470d, iM, i10, 0);
            return;
        }
        n.h("Tx3gParser", "Ignoring styl with start (" + iM + ") >= end (" + i10 + ").");
    }

    private static void e(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
        if (i10 != i11) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i10 >>> 8) | ((i10 & 255) << 24)), i12, i13, i14 | 33);
        }
    }

    private static void f(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
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

    private static void g(SpannableStringBuilder spannableStringBuilder, String str, int i10, int i11) {
        if (str != C.SANS_SERIF_NAME) {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), i10, i11, 16711713);
        }
    }

    private static String h(u uVar) {
        w1.a.a(uVar.a() >= 2);
        int iM = uVar.M();
        if (iM == 0) {
            return "";
        }
        int iF = uVar.f();
        Charset charsetO = uVar.O();
        int iF2 = iM - (uVar.f() - iF);
        if (charsetO == null) {
            charsetO = e.f52294c;
        }
        return uVar.E(iF2, charsetO);
    }

    @Override // l3.r
    public void a(byte[] bArr, int i10, int i11, r.b bVar, h hVar) {
        this.f51467a.R(bArr, i11 + i10);
        this.f51467a.T(i10);
        String strH = h(this.f51467a);
        if (strH.isEmpty()) {
            hVar.accept(new l3.e(com.google.common.collect.c0.C(), C.TIME_UNSET, C.TIME_UNSET));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strH);
        f(spannableStringBuilder, this.f51469c, 0, 0, spannableStringBuilder.length(), 16711680);
        e(spannableStringBuilder, this.f51470d, -1, 0, spannableStringBuilder.length(), 16711680);
        g(spannableStringBuilder, this.f51471e, 0, spannableStringBuilder.length());
        float fN = this.f51472f;
        while (this.f51467a.a() >= 8) {
            int iF = this.f51467a.f();
            int iP = this.f51467a.p();
            int iP2 = this.f51467a.p();
            if (iP2 == 1937013100) {
                w1.a.a(this.f51467a.a() >= 2);
                int iM = this.f51467a.M();
                for (int i12 = 0; i12 < iM; i12++) {
                    d(this.f51467a, spannableStringBuilder);
                }
            } else if (iP2 == 1952608120 && this.f51468b) {
                w1.a.a(this.f51467a.a() >= 2);
                fN = c0.n(this.f51467a.M() / this.f51473g, 0.0f, 0.95f);
            }
            this.f51467a.T(iF + iP);
        }
        hVar.accept(new l3.e(com.google.common.collect.c0.D(new v1.a.b().o(spannableStringBuilder).h(fN, 0).i(0).a()), C.TIME_UNSET, C.TIME_UNSET));
    }

    @Override // l3.r
    public int c() {
        return 2;
    }
}
