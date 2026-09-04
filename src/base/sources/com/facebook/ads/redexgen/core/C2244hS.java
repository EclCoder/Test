package com.facebook.ads.redexgen.core;

import android.view.View;
import android.widget.RelativeLayout;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.hS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2244hS implements InterfaceC1739Yh {
    public static String[] A01 = {"8tOzOPKLz5DDIwqC88XBXxH90bmVDotF", "YCktuRbEMhZaz9U821mncTHWO05lwCqY", "Eq7g3criU65KDBPK", "XEHycrxPk7FQv1FkL381pmPNBNbKujpl", "niYnM4G6gzmxtC7fq", "sRQOtQAi", "8G5qrnHnaOtx52JqPPi", "6arHmIfqlBfM2iqNpfy3RxuQJelIt1eI"};
    public final WeakReference<C1560Re> A00;

    public C2244hS(C1560Re c1560Re) {
        this.A00 = new WeakReference<>(c1560Re);
    }

    private void A00(C1560Re c1560Re) {
        C2046eF c2046eFA07 = c1560Re.A07();
        if (c2046eFA07 != null && c1560Re.A04() != null) {
            c1560Re.A04().bringChildToFront(c2046eFA07);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1739Yh
    public void A44(View view, int i10, RelativeLayout.LayoutParams layoutParams) {
        C1560Re c1560Re = this.A00.get();
        if (c1560Re != null && c1560Re.A04() != null) {
            c1560Re.A04().addView(view, i10, layoutParams);
            A00(c1560Re);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1739Yh
    public void A45(View view, RelativeLayout.LayoutParams layoutParams) {
        C1560Re c1560Re = this.A00.get();
        if (c1560Re != null && c1560Re.A04() != null) {
            c1560Re.A04().addView(view, layoutParams);
            A00(c1560Re);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1739Yh
    public void A4j(String str) {
        if (this.A00.get() != null) {
            this.A00.get().A0C(str);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1739Yh
    public void A4k(String str, UL ul2) {
        if (this.A00.get() != null) {
            this.A00.get().A0E(str, ul2);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1739Yh
    public void AAo(String str, C1468Nm c1468Nm) {
        if (this.A00.get() != null) {
            WeakReference<C1560Re> weakReference = this.A00;
            if (A01[4].length() == 0) {
                throw new RuntimeException();
            }
            A01[2] = "IO1gKUYJJG6YtU6JnI8y";
            weakReference.get().A0D(str, c1468Nm);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1739Yh
    public void ADJ(int i10) {
        C1560Re activityApi = this.A00.get();
        if (activityApi != null) {
            activityApi.finish(i10);
        }
    }
}
