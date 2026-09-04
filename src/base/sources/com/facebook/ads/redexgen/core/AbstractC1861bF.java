package com.facebook.ads.redexgen.core;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1861bF extends LinearLayout {
    public static byte[] A0A;
    public static final LinearLayout.LayoutParams A0B;
    public LinearLayout A00;
    public TextView A01;
    public String A02;
    public boolean A03;
    public final int A04;
    public final View.OnClickListener A05;
    public final RelativeLayout A06;
    public final C2198gi A07;
    public final ViewOnClickListenerC1396Kr A08;
    public final C1892bk A09;

    public static String A0h(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0A, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 11);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0i() {
        A0A = new byte[]{-96, -93, -93, -92, -77, -96, -88, -85, -78};
    }

    public abstract void A0l(int i10);

    static {
        A0i();
        A0B = new LinearLayout.LayoutParams(-2, -2);
    }

    public AbstractC1861bF(C2198gi c2198gi, ViewOnClickListenerC1396Kr viewOnClickListenerC1396Kr, int i10, C1456Na c1456Na, boolean z10, String str, VA va2, InterfaceC1739Yh interfaceC1739Yh, C2143fp c2143fp, Y2 y10, C1462Ng c1462Ng, boolean z11, String str2) {
        super(c2198gi);
        this.A02 = A0h(0, 0, 37);
        YB.A0K(this);
        this.A07 = c2198gi;
        this.A04 = i10;
        this.A03 = z11;
        this.A02 = str2;
        this.A09 = new C1892bk(c2198gi);
        YB.A0N(this.A09, 0);
        YB.A0K(this.A09);
        if (z11) {
            this.A00 = new LinearLayout(c2198gi);
            this.A01 = new TextView(c2198gi);
            YB.A0K(this.A01);
        }
        if (viewOnClickListenerC1396Kr == null) {
            this.A08 = new ViewOnClickListenerC1396Kr(c2198gi, str, c1456Na, z10, va2, interfaceC1739Yh, c2143fp, y10, c1462Ng);
        } else {
            this.A08 = viewOnClickListenerC1396Kr;
        }
        YB.A0G(1001, this.A08);
        this.A05 = AbstractC1902bu.A03(this.A08, A0h(0, 9, 52));
        this.A06 = new RelativeLayout(c2198gi);
        this.A06.setLayoutParams(A0B);
        YB.A0K(this.A06);
    }

    public void A0j() {
    }

    public void A0k() {
        this.A09.setOnClickListener(this.A05);
    }

    public void A0m(boolean z10) {
    }

    public final ViewOnClickListenerC1396Kr getCTAButton() {
        return this.A08;
    }

    public View getExpandableLayout() {
        return null;
    }

    public final ImageView getIconView() {
        return this.A09;
    }

    public void setInfo(NY ny, C1458Nc c1458Nc, String str, String str2, InterfaceC1713Xh interfaceC1713Xh, InterfaceC1876bU interfaceC1876bU) {
        this.A08.setCta(c1458Nc, str, new HashMap(), interfaceC1713Xh, interfaceC1876bU);
        new LM(this.A09, this.A07).A05(this.A04, this.A04).A07(str2);
    }

    public void setTitleMaxLines(int i10) {
    }
}
