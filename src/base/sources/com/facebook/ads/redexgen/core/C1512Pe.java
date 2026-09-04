package com.facebook.ads.redexgen.core;

import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import android.widget.LinearLayout;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Pe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C1512Pe extends AbstractC1733Yb {
    public static byte[] A08;
    public static String[] A09 = {"fERBvMHNNnzy3nk4ZNYWfuNmaphricqR", "36dIUinCjWD1st1oFa", "LXwDs8sQ22ml4TxQk7X9Yy2PND6TLebQ", "XXrP48rjLtmBZR3EppDVWeHK64Oiflqr", "lJVaLdSDUZo8CZ4Z9dOQvPM3HMB2ksyr", "0Ja0eNtF0Cq6bAhyEs6lkKXZN09pMEMJ", "OH638NDLRGGNEgbxKp", "sf1pLwcEB21wXoeUmJKgsuWxlp0ZYlJT"};
    public static final int A0A;
    public static final int A0B;
    public static final int A0C;
    public static final Integer A0D;
    public static final Integer A0E;
    public int A00;
    public InterfaceC1737Yf A01;
    public float A02;
    public InterfaceC1732Ya A03;
    public boolean A04;
    public final C2198gi A05;
    public final C1736Ye A06;
    public final EnumC1738Yg A07;

    public static String A03(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A08, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ Sdk$SDKError.b.INVALID_LOG_ERROR_ENDPOINT_VALUE);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A07() {
        A08 = new byte[]{110, 65, 66, 94, 72, 13, 108, 73};
        String[] strArr = A09;
        if (strArr[6].length() != strArr[1].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A09;
        strArr2[6] = "7Gx7HJtPRSPh20N7Kw";
        strArr2[1] = "xYim5uVBO0YQkaepUH";
    }

    static {
        A07();
        A0A = XV.A0C;
        A0C = XV.A0H;
        A0B = (int) (((double) A0C) / 2.0d);
        A0D = 855638016;
        A0E = null;
    }

    public C1512Pe(C2198gi c2198gi, EnumC1738Yg enumC1738Yg, AbstractC2363jd abstractC2363jd, int i10, InterfaceC1737Yf interfaceC1737Yf) {
        super(c2198gi);
        this.A00 = 0;
        this.A04 = true;
        this.A05 = c2198gi;
        this.A07 = enumC1738Yg;
        this.A01 = interfaceC1737Yf;
        A04();
        this.A06 = new C1736Ye(this.A05, abstractC2363jd, this.A07, i10);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 48;
        this.A06.setContentDescription(A03(0, 8, 81));
        this.A06.setOnClickListener(new ViewOnClickListenerC1735Yd(this));
        addView(this.A06, layoutParams);
        A06();
    }

    private void A04() {
        View view = new View(this.A05);
        view.setLayoutParams(new LinearLayout.LayoutParams(0, 0, 1.0f));
        addView(view);
    }

    private void A05() {
        Rect requestedMargins = getRequestedMargins();
        if (this.A01 != null && requestedMargins != null) {
            this.A01.AEZ(getToolbarHeight());
        }
    }

    private void A06() {
        if (Build.VERSION.SDK_INT >= 28) {
            setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.facebook.ads.redexgen.X.Yc
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    return this.A00.A0F(view, windowInsets);
                }
            });
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1733Yb
    public final void A09() {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1733Yb
    public final void A0A() {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1733Yb
    public final void A0B() {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1733Yb
    public final void A0C(float f10, int i10) {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1733Yb
    public final void A0D(C1456Na c1456Na, boolean z10) {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1733Yb
    public final boolean A0E() {
        return false;
    }

    public final /* synthetic */ WindowInsets A0F(View view, WindowInsets windowInsets) {
        int cutoutInsetTop;
        DisplayCutout cutout = windowInsets.getDisplayCutout();
        if (cutout != null && (cutoutInsetTop = cutout.getSafeInsetTop()) != this.A00) {
            this.A00 = cutoutInsetTop;
            A05();
        }
        return windowInsets;
    }

    public final void A0G() {
        if (this.A03 != null && this.A04) {
            InterfaceC1732Ya interfaceC1732Ya = this.A03;
            if (A09[4].charAt(19) != 'Q') {
                throw new RuntimeException();
            }
            String[] strArr = A09;
            strArr[7] = "Nz9FTwNSu9sKseNM42ZlibQZooapJX2m";
            strArr[0] = "gMFqMi1vQ9rk8jIPSWsyy3tPRxgAiTUd";
            interfaceC1732Ya.ACl(this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1733Yb
    public Rect getRequestedMargins() {
        if (getResources().getConfiguration().orientation == 1) {
            int i10 = XV.A0u;
            int i11 = XV.A0c;
            int orientation = this.A00;
            return new Rect(i10, i11 + orientation, 0, 0);
        }
        return new Rect(XV.A0u, XV.A0v, 0, 0);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1733Yb
    public int getToolbarActionMode() {
        return this.A06.A09();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1733Yb
    public int getToolbarHeight() {
        if (this.A07 == EnumC1738Yg.A08) {
            if (getResources().getConfiguration().orientation == 1) {
                int i10 = this.A00;
                int orientation = A0C;
                int i11 = i10 + orientation;
                int orientation2 = XV.A0c;
                return i11 + (orientation2 * 2);
            }
            int i12 = A0C;
            int orientation3 = XV.A0v;
            return i12 + (orientation3 * 2);
        }
        return 0;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1733Yb
    public InterfaceC1732Ya getToolbarListener() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        A05();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        A05();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1733Yb
    public void setAdReportingVisible(boolean z10) {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1733Yb
    public void setCTAClickListener(View.OnClickListener onClickListener) {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1733Yb
    public void setCTAClickListener(ViewOnClickListenerC1396Kr viewOnClickListenerC1396Kr) {
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    private void setClickable(float f10) {
        boolean z10;
        if (f10 > 0.0f) {
            boolean zA19 = C1648Up.A19(this.A05);
            if (A09[4].charAt(19) != 'Q') {
                throw new RuntimeException();
            }
            A09[5] = "CynGSFEo4busEIaNEzQQTo6NoR2HzSp3";
            if (zA19) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = true;
        }
        this.A04 = z10;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1733Yb
    public void setFullscreen(boolean z10) {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1733Yb
    public void setPageDetails(C1468Nm c1468Nm, String str, int i10, C1474Ns c1474Ns) {
        this.A02 = i10 * 1000;
        setClickable(this.A02);
        this.A06.A0A(this.A02);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1733Yb
    public void setPageDetailsVisible(boolean z10) {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1733Yb
    public void setProgress(float f10) {
        float f11 = (f10 / 100.0f) * this.A02;
        float remainingMs = 0.0f;
        if (this.A02 - f11 > 0.0f) {
            float remainingMs2 = this.A02;
            remainingMs = remainingMs2 - f11;
        }
        this.A06.A0B(remainingMs);
        setClickable(remainingMs);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1733Yb
    public void setProgressClickListener(View.OnClickListener onClickListener) {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1733Yb
    public void setProgressImage(YM ym2) {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1733Yb
    public void setProgressImmediate(float f10) {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1733Yb
    public void setProgressSpinnerInvisible(boolean z10) {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1733Yb
    public void setToolbarActionMessage(String str) {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1733Yb
    public void setToolbarActionMode(int i10) {
        this.A06.A0C(i10);
        if (i10 == 0) {
            setProgress(100.0f);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1733Yb
    public void setToolbarListener(InterfaceC1732Ya interfaceC1732Ya) {
        this.A03 = interfaceC1732Ya;
    }
}
