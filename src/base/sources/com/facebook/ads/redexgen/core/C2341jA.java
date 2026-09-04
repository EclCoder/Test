package com.facebook.ads.redexgen.core;

import android.webkit.WebView;
import com.facebook.ads.AdError;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.jA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2341jA implements InterfaceC1596Sp {
    public final C1470No A00;
    public final O3 A01;
    public final C1604Sx A02;
    public final C2198gi A03;
    public final boolean A04;

    public C2341jA(C2198gi c2198gi, O3 o10, C1604Sx c1604Sx, C1470No c1470No, boolean z10) {
        this.A03 = c2198gi;
        this.A01 = o10;
        this.A02 = c1604Sx;
        this.A00 = c1470No;
        this.A04 = z10;
    }

    private final void A00() {
        WebView webView = new WebView(this.A03);
        webView.getSettings().setCacheMode(1);
        O4 playableWebViewClient = new O4(this.A00, this.A01, this.A04);
        webView.setWebViewClient(playableWebViewClient);
        webView.loadUrl(this.A00.A0L());
        playableWebViewClient.A03();
    }

    private void A01(boolean z10) {
        if (this.A00.A0G() == EnumC1471Np.A05) {
            A00();
            return;
        }
        String strA0L = this.A00.A0L();
        if (z10) {
            C1604Sx c1604Sx = this.A02;
            String markupUrlResult = this.A00.A0L();
            strA0L = c1604Sx.A0S(markupUrlResult);
        }
        this.A00.A0T(strA0L);
        this.A01.AFG();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1596Sp
    public final void ADL() {
        if (this.A04) {
            this.A01.AFF(AdError.CACHE_ERROR);
        } else {
            A01(false);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1596Sp
    public final void ADT() {
        A01(true);
    }
}
