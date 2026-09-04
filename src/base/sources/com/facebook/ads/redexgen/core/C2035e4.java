package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.e4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2035e4 extends LinearLayout {
    public static final int A04 = (int) (XX.A02 * 32.0f);
    public static final int A05 = (int) (XX.A02 * 8.0f);
    public TextView A00;
    public TextView A01;
    public C1892bk A02;
    public final C2198gi A03;

    public C2035e4(C2198gi c2198gi) {
        super(c2198gi);
        this.A03 = c2198gi;
        A00(c2198gi);
    }

    private final void A00(C2198gi c2198gi) {
        setGravity(16);
        this.A02 = new C1892bk(c2198gi);
        this.A02.setFullCircleCorners(true);
        LinearLayout.LayoutParams pageImageViewParams = new LinearLayout.LayoutParams(A04, A04);
        pageImageViewParams.setMargins(0, 0, A05, 0);
        addView(this.A02, pageImageViewParams);
        LinearLayout pageInfoView = new LinearLayout(c2198gi);
        pageInfoView.setOrientation(1);
        this.A00 = new TextView(c2198gi);
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        YB.A0a(this.A00, true, 16);
        this.A00.setEllipsize(TextUtils.TruncateAt.END);
        this.A00.setSingleLine(true);
        this.A01 = new TextView(c2198gi);
        YB.A0a(this.A01, false, 14);
        pageInfoView.addView(this.A00);
        pageInfoView.addView(this.A01);
        addView(pageInfoView, layoutParams);
    }

    public final void A01() {
        this.A02.setImageBitmap(null);
        this.A00.setText("");
        this.A01.setText("");
    }

    public final void A02(int i10, int i11) {
        this.A00.setTextColor(i10);
        this.A01.setTextColor(i11);
    }

    public void setPageDetails(C1468Nm c1468Nm) {
        LM lm2 = new LM(this.A02, this.A03);
        lm2.A05(A04, A04);
        lm2.A07(c1468Nm.A01());
        this.A00.setText(c1468Nm.A02());
        this.A01.setText(c1468Nm.A03());
    }
}
