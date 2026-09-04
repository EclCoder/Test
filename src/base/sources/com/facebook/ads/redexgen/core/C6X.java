package com.facebook.ads.redexgen.core;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6X, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C6X extends C1274Fy {
    public static String[] A00 = {"f1NrkMLFHAOxAk1WYXb4ZQBI9BQGMxNf", "ieQbYkP9qXWhodiL", "FasCpRA2RHhykdlBGUblwYUAQMGKU0mS", "sjzKgK2sh59qhJK5Sm5NCXrbKyy", "73hXtYSYooo4yypUFlMlXcqu25ITYI9G", "jFG3gQjXUuH0GALbmhZbm14pHMTfeDNL", "AB4YZhA3BNaHUCHwFjy4bae76Yz8EFa9", "dMMrkYyDXzmdfTW8HhUzXkOm8W"};

    public C6X(C1J c1j, int i10, List<C2036e5> list, C2143fp c2143fp, Bundle bundle) {
        super(c1j, i10, list, c2143fp, bundle);
        c1j.A1h(this);
        this.A03 = new M2(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A00() {
        int iA25 = this.A0C.A25();
        if (this.A05 == null || iA25 == -1) {
            return;
        }
        int curPos = this.A05.size();
        if (iA25 < curPos - 1) {
            int i10 = iA25 + 1;
            if (A00[2].charAt(8) != 'R') {
                throw new RuntimeException();
            }
            A00[2] = "QoZYEwWSRtnMYn7R6MgH1oBp1kGEXSrp";
            A0U(i10);
        }
    }

    private void A01(int i10) {
        int visibleItem = this.A0C.A26();
        int lastVisibleItem = this.A0C.A27();
        int firstVisibleItem = this.A0C.A25();
        if (firstVisibleItem != visibleItem) {
            A0S(visibleItem);
        }
        if (firstVisibleItem != lastVisibleItem) {
            A0S(lastVisibleItem);
        }
        A0T(firstVisibleItem);
        A0V(visibleItem, lastVisibleItem, i10);
    }

    @Override // com.facebook.ads.redexgen.core.C1274Fy, com.facebook.ads.redexgen.core.R7
    public final void A0L(C7M c7m, int i10) {
    }

    @Override // com.facebook.ads.redexgen.core.C1274Fy, com.facebook.ads.redexgen.core.R7
    public final void A0M(C7M c7m, int i10, int i11) {
        if (this.A0C.A25() != -1) {
            AbstractC1359Jg curCard = (AbstractC1359Jg) this.A0C.A1o(this.A0C.A25());
            if (curCard != null && curCard.A1V() && !curCard.A1U()) {
                curCard.A1S();
            }
            A01(i10);
        }
    }

    @Override // com.facebook.ads.redexgen.core.C1274Fy
    public final void A0X(View view, boolean z10) {
        view.setAlpha(z10 ? 1.0f : 0.8f);
    }

    @Override // com.facebook.ads.redexgen.core.C1274Fy
    public final void A0Z(AbstractC1359Jg abstractC1359Jg, boolean z10) {
        A0X(abstractC1359Jg, z10);
        if (!z10 && abstractC1359Jg.A1U()) {
            abstractC1359Jg.A1R();
        }
    }

    @Override // com.facebook.ads.redexgen.core.C1274Fy
    public final boolean A0a(View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        return ((float) rect.width()) / ((float) view.getWidth()) >= 0.75f;
    }

    public final C2143fp A0b() {
        return this.A04;
    }

    public final void A0c(C2143fp c2143fp) {
        this.A04 = c2143fp;
    }

    public final void A0d(List<C2036e5> list) {
        this.A05 = list;
    }
}
