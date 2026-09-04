package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class FY extends RK implements InterfaceC1746Yo {
    public C1462Ng A00;
    public AbstractC2142fo A01;
    public C2143fp A02;
    public C2143fp A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final SparseBooleanArray A08;
    public final C2198gi A09;
    public final AnonymousClass67 A0A;

    public FY(AnonymousClass67 anonymousClass67, SparseBooleanArray sparseBooleanArray, C2143fp c2143fp, int i10, int i11, int i12, int i13, C2198gi c2198gi, C1462Ng c1462Ng) {
        super(anonymousClass67);
        this.A09 = c2198gi;
        this.A0A = anonymousClass67;
        this.A08 = sparseBooleanArray;
        this.A02 = c2143fp;
        this.A04 = i10;
        this.A05 = i11;
        this.A06 = i12;
        this.A07 = i13;
        this.A00 = c1462Ng;
    }

    private void A05(VA va2, Y2 y10, String str, C2036e5 c2036e5) {
        if (this.A08.get(c2036e5.A02())) {
            return;
        }
        if (this.A03 != null) {
            this.A03.A0V();
            this.A03 = null;
        }
        this.A01 = new C1253Fc(this, str, c2036e5, va2, c2036e5.A04(), y10);
        this.A03 = new C2143fp(this.A0A, 10, new WeakReference(this.A01), this.A09);
        this.A03.A0Y(false);
        this.A03.A0W(100);
        this.A03.A0X(100);
        this.A0A.setOnAssetsLoadedListener(new FZ(this, c2036e5));
    }

    public final ViewOnClickListenerC1396Kr A0p() {
        return this.A0A.getCtaButton();
    }

    public final void A0q(C2036e5 c2036e5, VA va2, C1604Sx c1604Sx, Y2 y10, String str) {
        int iA02 = c2036e5.A02();
        this.A0A.setTag(-1593835536, Integer.valueOf(iA02));
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(this.A04, -2);
        int rightMargin = iA02 == 0 ? this.A05 : this.A06;
        int position = this.A07;
        marginLayoutParams.setMargins(rightMargin, 0, iA02 >= position + (-1) ? this.A05 : this.A06, 0);
        String imageUrl = c2036e5.A03().A0H().A08();
        String strA09 = c2036e5.A03().A0H().A09();
        this.A0A.setIsVideo(!TextUtils.isEmpty(strA09));
        if (this.A0A.A1V()) {
            this.A0A.setVideoPlaceholderUrl(imageUrl);
            this.A0A.setVideoUrl(c1604Sx.A0T(strA09));
        } else {
            this.A0A.setImageUrl(imageUrl);
        }
        this.A0A.setLayoutParams(marginLayoutParams);
        this.A0A.setAdTitleAndDescription(c2036e5.A03().A0I().A0G(), c2036e5.A03().A0I().A04());
        this.A0A.setCTAInfo(c2036e5.A03().A0J(), c2036e5.A04());
        this.A0A.A1Y(c2036e5.A04());
        A05(va2, y10, str, c2036e5);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1746Yo
    public final void AJF() {
        this.A0A.A1Q();
    }
}
