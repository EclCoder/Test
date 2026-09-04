package com.facebook.ads.redexgen.core;

import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class MC extends AbstractC1761Zd {
    public static byte[] A05;
    public static final int A06;
    public static final int A07;
    public static final int A08;
    public final ImageView A00;
    public final LinearLayout A01;
    public final ScrollView A02;
    public final C1488Og A03;
    public final C2198gi A04;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 24);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{-52, -21, -19, -11, 120, -95, -92, -88, -102, 85, 118, -103, 85, -121, -102, -91, -92, -89, -87, -98, -93, -100};
    }

    static {
        A01();
        A08 = (int) (XX.A02 * 8.0f);
        A07 = (int) (XX.A02 * 10.0f);
        A06 = (int) (XX.A02 * 44.0f);
    }

    public MC(C2198gi c2198gi, VA va2, String str) {
        super(c2198gi, va2, str);
        this.A04 = c2198gi;
        this.A03 = AbstractC1489Oh.A00(this.A04.A02());
        this.A00 = new ImageView(getContext());
        this.A00.setPadding(A07, A07, A07, A07);
        this.A00.setColorFilter(-10459280);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(A06, A06);
        layoutParams.gravity = 3;
        this.A00.setLayoutParams(layoutParams);
        this.A02 = new ScrollView(getContext());
        this.A02.setFillViewport(true);
        YB.A0N(this.A02, -218103809);
        this.A01 = new LinearLayout(getContext());
        this.A01.setOrientation(1);
        this.A01.setPadding(A08, A08, A08, A08);
        this.A02.addView(this.A01, new FrameLayout.LayoutParams(-1, -2));
        addView(this.A02, new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1761Zd
    public final void A0O() {
        this.A00.setImageBitmap(YN.A01(YM.CROSS));
        this.A00.setOnClickListener(new ViewOnClickListenerC1780Zw(this));
        this.A00.setContentDescription(A00(4, 18, 29));
        C1765Zh c1765Zh = new C1765Zh(this.A04);
        c1765Zh.setData(this.A03.A0H(), YM.HIDE_AD);
        c1765Zh.setOnClickListener(new ViewOnClickListenerC1781Zx(this, c1765Zh));
        C1765Zh c1765Zh2 = new C1765Zh(this.A04);
        c1765Zh2.setData(this.A03.A0L(), YM.REPORT_AD);
        c1765Zh2.setOnClickListener(new ViewOnClickListenerC1782Zy(this, c1765Zh2));
        C1765Zh c1765Zh3 = new C1765Zh(this.A04);
        c1765Zh3.setData(this.A03.A0M(), YM.AD_CHOICES_ICON);
        c1765Zh3.setOnClickListener(new ViewOnClickListenerC1783Zz(this, c1765Zh3));
        LinearLayout.LayoutParams menuParams = new LinearLayout.LayoutParams(-2, -2);
        menuParams.setMargins(A08, A08, A08, A08);
        menuParams.gravity = 17;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, 0);
        layoutParams.gravity = 17;
        layoutParams.weight = 1.0f;
        YB.A0W(this.A01);
        this.A01.removeAllViews();
        this.A01.addView(this.A00);
        this.A01.addView(linearLayout, layoutParams);
        linearLayout.addView(c1765Zh, menuParams);
        linearLayout.addView(c1765Zh2, menuParams);
        linearLayout.addView(c1765Zh3, menuParams);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1761Zd
    public final void A0P() {
        YB.A0I(this);
        YB.A0J(this);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1761Zd
    public final void A0Q(C1492Ok c1492Ok, EnumC1490Oi enumC1490Oi) {
        String strA0H;
        YM ym2;
        int i10;
        this.A00.setOnClickListener(null);
        if (enumC1490Oi == EnumC1490Oi.A06) {
            strA0H = this.A03.A0F();
            ym2 = YM.REPORT_AD;
            i10 = -552389;
        } else {
            strA0H = this.A03.A0H();
            ym2 = YM.HIDE_AD;
            i10 = -13272859;
        }
        C1758Za c1758ZaA0H = new C1758Za(this.A04, this.A0D).A0H(strA0H);
        String title = this.A03.A0D();
        C1758Za c1758ZaA0G = c1758ZaA0H.A0G(title);
        String title2 = c1492Ok.A04();
        C1759Zb adHiddenView = c1758ZaA0G.A0E(title2).A0J(false).A0D(ym2).A0C(i10).A0K(false).A0I(false).A0L();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.gravity = 17;
        layoutParams.weight = 1.0f;
        YB.A0W(this.A01);
        this.A02.fullScroll(33);
        this.A01.removeAllViews();
        this.A01.addView(adHiddenView, layoutParams);
        super.A0Q(c1492Ok, enumC1490Oi);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1761Zd
    public final void A0R(C1492Ok c1492Ok, EnumC1490Oi enumC1490Oi) {
        boolean isReportFlow = enumC1490Oi == EnumC1490Oi.A06;
        C1779Zv c1779Zv = new C1779Zv(this.A04, c1492Ok, this.A0D, isReportFlow ? YM.REPORT_AD : YM.HIDE_AD);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, 0);
        layoutParams.gravity = 17;
        layoutParams.weight = 1.0f;
        this.A00.setImageBitmap(YN.A01(YM.BACK_ARROW));
        this.A00.setOnClickListener(new ViewOnClickListenerC1784a0(this));
        this.A00.setContentDescription(A00(0, 4, Sdk$SDKError.b.ASSET_WRITE_ERROR_VALUE));
        YB.A0W(this.A01);
        this.A02.fullScroll(33);
        this.A01.removeAllViews();
        this.A01.addView(this.A00);
        this.A01.addView(c1779Zv, layoutParams);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1761Zd
    public final boolean A0S() {
        return true;
    }
}
