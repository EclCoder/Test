package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ow, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C1504Ow extends AbstractC1861bF {
    public final TextView A00;
    public final TextView A01;
    public static final int A02 = (int) (XX.A02 * 36.0f);
    public static final int A05 = (int) (XX.A02 * 4.0f);
    public static final int A03 = (int) (XX.A02 * 8.0f);
    public static final int A04 = (int) (XX.A02 * 4.0f);

    public C1504Ow(C2198gi c2198gi, int i10, C1456Na c1456Na, boolean z10, String str, VA va2, InterfaceC1739Yh interfaceC1739Yh, C2143fp c2143fp, Y2 y10, C1462Ng c1462Ng) {
        super(c2198gi, null, i10, c1456Na, z10, str, va2, interfaceC1739Yh, c2143fp, y10, c1462Ng, false, "");
        setOrientation(0);
        setPadding(A05, A05, A05, A05);
        this.A01 = A01(-16448251, 13, true);
        this.A00 = A01(-10131605, 12, false);
        this.A06.addView(A00(i10), new LinearLayout.LayoutParams(-1, -2));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
        layoutParams.weight = 1.0f;
        addView(this.A06, layoutParams);
        this.A08.setPadding(A03, 0, A03, 0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, A02);
        layoutParams2.gravity = 17;
        addView(this.A08, layoutParams2);
    }

    private LinearLayout A00(int i10) {
        LinearLayout linearLayout = new LinearLayout(this.A07);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(A04, 0, A04, 0);
        linearLayout.addView(this.A01, AbstractC1861bF.A0B);
        linearLayout.addView(this.A00, AbstractC1861bF.A0B);
        LinearLayout linearLayout2 = new LinearLayout(this.A07);
        linearLayout2.setOrientation(0);
        linearLayout2.addView(this.A09, new LinearLayout.LayoutParams(i10, i10));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 16;
        linearLayout2.addView(linearLayout, layoutParams);
        return linearLayout2;
    }

    private TextView A01(int i10, int i11, boolean z10) {
        TextView textView = new TextView(this.A07);
        textView.setTextColor(i10);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        YB.A0a(textView, z10, i11);
        return textView;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1861bF
    public final void A0k() {
        super.A0k();
        setOnClickListener(this.A05);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1861bF
    public final void A0l(int i10) {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1861bF
    public void setInfo(NY ny, C1458Nc c1458Nc, String str, String str2, InterfaceC1713Xh interfaceC1713Xh, InterfaceC1876bU interfaceC1876bU) {
        super.setInfo(ny, c1458Nc, str, str2, interfaceC1713Xh, interfaceC1876bU);
        this.A01.setText(ny.A0G());
        this.A00.setText(ny.A0F());
        if (TextUtils.isEmpty(c1458Nc.A04())) {
            YB.A0H(this.A08);
        }
    }
}
