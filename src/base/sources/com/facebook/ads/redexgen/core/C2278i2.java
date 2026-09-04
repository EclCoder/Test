package com.facebook.ads.redexgen.core;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.i2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2278i2 implements PR {
    public static String[] A02 = {"gru2Lda4S7GCbNBLtOIdQEnlbYeRFwfL", "XnGCgKT7Pg2", "mKUX8sgZfunspLF5wjmFH8sDBtb3K48d", "jKk7kH4cQGBiDg5TKe33YqGV3AsPygQR", "TZdQK9usf81OKXIWMb61JsmxOZFMnA3k", "eyC2dzaRwXiJKVGsgdgz1meLL5sRgImY", "S4mkNNYHIh7xNNZ0OEskqLhCY0hDyySt", "ZXfiglEYlIOoTIuj216uQxYNuz12aQjw"};
    public final Rect A00 = new Rect();
    public final /* synthetic */ Pv A01;

    public C2278i2(Pv pv) {
        this.A01 = pv;
    }

    @Override // com.facebook.ads.redexgen.core.PR
    public final C1529Py ACw(View view, C1529Py c1529Py) {
        C1529Py c1529PyA06 = Ph.A06(view, c1529Py);
        if (c1529PyA06.A07()) {
            return c1529PyA06;
        }
        Rect rect = this.A00;
        rect.left = c1529PyA06.A03();
        rect.top = c1529PyA06.A05();
        rect.right = c1529PyA06.A04();
        rect.bottom = c1529PyA06.A02();
        int count = this.A01.getChildCount();
        for (int i10 = 0; i10 < count; i10++) {
            C1529Py c1529PyA05 = Ph.A05(this.A01.getChildAt(i10), c1529PyA06);
            rect.left = Math.min(c1529PyA05.A03(), rect.left);
            rect.top = Math.min(c1529PyA05.A05(), rect.top);
            rect.right = Math.min(c1529PyA05.A04(), rect.right);
            rect.bottom = Math.min(c1529PyA05.A02(), rect.bottom);
        }
        int i11 = rect.left;
        int i12 = rect.top;
        int i13 = rect.right;
        int i14 = rect.bottom;
        if (A02[1].length() != 11) {
            throw new RuntimeException();
        }
        String[] strArr = A02;
        strArr[6] = "4mRHs0uPE72ppwyI9I2NgTpzqE63n9j5";
        strArr[2] = "Zp0DshFYJF7gm0rY227qRNMYobzVhEjB";
        C1529Py applied = c1529PyA06.A06(i11, i12, i13, i14);
        return applied;
    }
}
