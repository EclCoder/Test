package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class KZ extends AbstractC1911c3 implements XQ {
    public static byte[] A03;
    public static String[] A04 = {"jViytUMb8W4ggVUJxJM4ipopCTL5", "9aLNfhHGIgyW1yw0lAvb2knTk6C61HAs", "tSRmVjXXTSnTtzrce7INiQjRTYiInlbV", "4hcdJiGUQmFME9vgh87fiTmYWHBJid0b", "Sl93MFe7LYTqHCUKgRBPFfcYUFdC2Wx2", "6CReOOSeiw7R4vGYWPFAi839J8MszZAI", "rkSedGSxOJTtoP7gEY2R8PFp4jzzUrYJ", "HZKY5YyrBfN27m9O42YnVDeAUeo6GkfS"};
    public final AbstractC2363jd A00;
    public final XS A01;
    public final InterfaceC1739Yh A02;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A04[0].length() != 28) {
                throw new RuntimeException();
            }
            String[] strArr = A04;
            strArr[1] = "P3g3yiO3ICi92ZTGqQIjITPfAPWFUEMm";
            strArr[2] = "pyBqNmisWoZkDTGCi8bHuToayw1uFlPn";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 78);
            i13++;
        }
    }

    public static void A01() {
        A03 = new byte[]{64, 68, 72, 78, 76};
    }

    static {
        A01();
    }

    public KZ(C1915c7 c1915c7, boolean z10) {
        FrameLayout.LayoutParams layoutParams;
        super(c1915c7, true);
        this.A02 = c1915c7.A0C();
        this.A00 = c1915c7.A05();
        RelativeLayout relativeLayout = new RelativeLayout(c1915c7.A06());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(12);
        YB.A0U(relativeLayout, getAdContextWrapper());
        LinearLayout linearLayout = new LinearLayout(c1915c7.A06());
        linearLayout.setOrientation(!z10 ? 1 : 0);
        linearLayout.setGravity(80);
        YB.A0K(linearLayout);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams3.setMargins(AbstractC1911c3.A08, 0, AbstractC1911c3.A08, AbstractC1911c3.A08);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(z10 ? -2 : -1, -2);
        layoutParams4.setMargins(z10 ? AbstractC1911c3.A08 : 0, z10 ? 0 : AbstractC1911c3.A08, 0, 0);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(z10 ? 0 : -1, -2);
        layoutParams5.setMargins(0, 0, 0, 0);
        layoutParams5.weight = 1.0f;
        linearLayout.addView(getTitleDescContainer(), layoutParams5);
        this.A01 = XS.A00(c1915c7.A06(), this.A00, this);
        XR xrA02 = this.A01.A02(this.A00);
        c1915c7.A06().A0H().A00(xrA02.A01);
        if (c1915c7.A0H() && !z10) {
            C2035e4 c2035e4 = new C2035e4(c1915c7.A06());
            c2035e4.setPageDetails(c1915c7.A05().A2C());
            int iA05 = this.A07.A05().A28().A00().A05(true);
            c2035e4.A02(iA05, iA05);
            YB.A0G(1007, c2035e4);
            LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams6.setMargins(0, AbstractC1911c3.A08, 0, 0);
            linearLayout.addView(c2035e4, layoutParams6);
            if (C1648Up.A18(c1915c7.A06())) {
                c2035e4.setOnClickListener(getCtaButton());
            }
        }
        linearLayout.addView(getCtaButton(), layoutParams4);
        relativeLayout.addView(linearLayout, layoutParams3);
        getCtaButton().A0F(c1915c7.A05(), c1915c7.A0B());
        View viewA02 = c1915c7.A02();
        if (viewA02 != null && (xrA02.A00 || C1648Up.A1J(getAdContextWrapper()))) {
            if (z10) {
                layoutParams = new FrameLayout.LayoutParams(-2, -1);
            } else {
                layoutParams = new FrameLayout.LayoutParams(-1, -2);
            }
            layoutParams.gravity = 17;
            FrameLayout frameLayout = new FrameLayout(c1915c7.A06());
            frameLayout.addView(viewA02, layoutParams);
            addView(frameLayout, new RelativeLayout.LayoutParams(-1, -1));
            getCtaButton().setCreativeAsCtaLoggingHelper(this.A01);
            if (xrA02.A00) {
                viewA02.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.bz
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.A00.A1Q(view);
                    }
                });
            } else {
                AbstractC1858bC.A00(viewA02, C1648Up.A1K(getAdContextWrapper()), new ViewOnClickListenerC1908c0(this));
            }
        } else if (viewA02 != null) {
            addView(viewA02, new RelativeLayout.LayoutParams(-1, -1));
        }
        addView(relativeLayout, layoutParams2);
        if (C1648Up.A17(c1915c7.A06())) {
            getTitleDescContainer().setCTAClickListener(getCtaButton());
            if (c1915c7.A0B() != null) {
                c1915c7.A0B().setCTAClickListener(getCtaButton());
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1911c3
    public final void A1C() {
        super.A1C();
        this.A01.A03();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1911c3
    public final void A1H(NR nr, String str, double d10, Bundle bundle) {
        super.A1H(nr, str, d10, bundle);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1911c3
    public final boolean A1O() {
        return true;
    }

    public final /* synthetic */ void A1Q(View view) {
        getCtaButton().A0E(A00(0, 5, 103));
    }
}
