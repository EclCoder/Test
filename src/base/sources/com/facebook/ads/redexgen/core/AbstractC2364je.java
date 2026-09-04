package com.facebook.ads.redexgen.core;

import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.je, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC2364je extends AbstractC1546Qq<PX> {
    public static String[] A05 = {"BofGdT", "Cb8B81bPHxSAbCDzy4", "tLXqRIVVg6Ax3ByQPtTHAjuCLXMkMIv2", "Awqy8gsEnlsE3SarczMGKLCzZdtyeG5w", "c95zYEegXXkMe1M4f4KrlDKZ96YYHdKl", "dzB1VPy83al1mBxHBTo", "7fXNgxpNBgLKECdM7L4CyN3WmxsqHAeT", "HUwJOtf8ZOX36MmDYBkOhN0MiSikj2Pg"};
    public static final int A06 = (int) (XX.A02 * 4.0f);
    public NM A00;
    public final List<UK> A01;
    public final int A02;
    public final C2198gi A03;
    public final AbstractC2142fo A04 = new C2366jg(this);

    public AbstractC2364je(C0x c0x, List<UK> list, C2198gi c2198gi) {
        this.A03 = c2198gi;
        this.A02 = c0x.getChildSpacing();
        this.A01 = list;
    }

    private ViewGroup.MarginLayoutParams A01(int i10) {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -1);
        int i11 = this.A02;
        if (i10 == 0) {
            i11 *= 2;
        }
        int size = this.A01.size() - 1;
        String[] strArr = A05;
        if (strArr[3].charAt(2) == strArr[4].charAt(2)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A05;
        strArr2[7] = "KlchvvVcsY9zV3e8wqzNtTZQscUuxnqD";
        strArr2[1] = "gQBYn2ao1l5plthpQQ";
        marginLayoutParams.setMargins(i11, 0, i10 >= size ? this.A02 * 2 : this.A02, 0);
        return marginLayoutParams;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1546Qq
    public final int A0B() {
        return this.A01.size();
    }

    public final void A0O(ImageView imageView, int i10) {
        UK uk2 = this.A01.get(i10);
        C1660Vb adCoverImage = uk2.getAdCoverImage();
        if (adCoverImage != null) {
            LM lmA04 = new LM(imageView, this.A03).A04();
            lmA04.A06(new C2365jf(this, i10, uk2));
            lmA04.A07(adCoverImage.getUrl());
        }
    }

    public final void A0P(NM nm2) {
        this.A00 = nm2;
    }

    public void A0Q(PX px, int i10) {
        px.A0p().setLayoutParams(A01(i10));
    }
}
