package com.facebook.ads.redexgen.core;

import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.RelativeLayout;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.3L, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C3L extends ED implements View.OnClickListener {
    public final EA A00;
    public final E4 A01;
    public final E2 A02;
    public final E0 A03;
    public final C2110fI A04;

    public C3L(C2198gi c2198gi) {
        this(c2198gi, null);
    }

    public C3L(C2198gi c2198gi, AttributeSet attributeSet) {
        this(c2198gi, attributeSet, 0);
    }

    public C3L(C2198gi c2198gi, AttributeSet attributeSet, int i10) {
        super(c2198gi, attributeSet, i10);
        this.A03 = new E0() { // from class: com.facebook.ads.redexgen.X.3R
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.UN
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(E1 e10) {
                this.A00.setVisibility(0);
            }
        };
        this.A01 = new E4() { // from class: com.facebook.ads.redexgen.X.3Q
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.UN
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C4B c4b) {
                this.A00.A04.setChecked(true);
            }
        };
        this.A02 = new E2() { // from class: com.facebook.ads.redexgen.X.3O
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.UN
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(E3 e10) {
                this.A00.A04.setChecked(false);
            }
        };
        this.A00 = new EA() { // from class: com.facebook.ads.redexgen.X.3M
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.UN
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C4K c4k) {
                this.A00.A04.setChecked(true);
            }
        };
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.A04 = new C2110fI(c2198gi);
        this.A04.setChecked(true);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) (displayMetrics.density * 25.0f), (int) (displayMetrics.density * 25.0f));
        setVisibility(8);
        addView(this.A04, layoutParams);
        setClickable(true);
        setFocusable(true);
    }

    @Override // com.facebook.ads.redexgen.core.ED
    public final void A07() {
        super.A07();
        setOnClickListener(this);
        this.A04.setOnClickListener(this);
        if (getVideoView() != null) {
            getVideoView().getEventBus().A03(this.A03, this.A00, this.A01, this.A02);
        }
    }

    @Override // com.facebook.ads.redexgen.core.ED
    public final void A08() {
        if (getVideoView() != null) {
            getVideoView().getEventBus().A04(this.A02, this.A01, this.A00, this.A03);
        }
        setOnClickListener(null);
        this.A04.setOnClickListener(null);
        super.A08();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (WU.A02(this)) {
            return;
        }
        try {
            C1235Ek videoView = getVideoView();
            if (videoView == null) {
                return;
            }
            if (videoView.getState() == EnumC2140fm.A07 || videoView.getState() == EnumC2140fm.A05 || videoView.getState() == EnumC2140fm.A06) {
                videoView.A0e(EnumC2085et.A04, 11);
            } else if (videoView.getState() == EnumC2140fm.A0A) {
                videoView.A0i(true, 7);
            }
        } catch (Throwable th2) {
            WU.A00(th2, this);
        }
    }

    public void setPauseAccessibilityLabel(String str) {
        this.A04.setPauseAccessibilityLabel(str);
    }

    public void setPlayAccessibilityLabel(String str) {
        this.A04.setPlayAccessibilityLabel(str);
    }
}
