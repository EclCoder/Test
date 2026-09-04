package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7N, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C7N extends AbstractC2246hU {
    public static String[] A02 = {"ZvwGPtqIyq", "yiAZi4T0ry", "MW2e2TOPDP9pjEe4rTD", "HlrRgmhjIEURNOsi3rdB558cP", "dU7euze3hj2U1ev62XjIRTQ2vrQriAnf", "8gl08jl5gi3EpiFcU", "SXjkVQ4wGxN0zpwvt09Xfw5qzXSeRw0d", "Y5nQdyuIxyo1Orqk0oN6DnQ8XCev4LBn"};
    public AbstractC1542Qm A00;
    public AbstractC1542Qm A01;

    private int A00(R2 r10, View view, AbstractC1542Qm abstractC1542Qm) {
        int containerCenter;
        int iA0F = abstractC1542Qm.A0F(view) + (abstractC1542Qm.A0D(view) / 2);
        if (r10.A1V()) {
            int iA0A = abstractC1542Qm.A0A();
            int childCenter = abstractC1542Qm.A0B();
            containerCenter = iA0A + (childCenter / 2);
        } else {
            int childCenter2 = abstractC1542Qm.A06();
            containerCenter = childCenter2 / 2;
        }
        return iA0F - containerCenter;
    }

    private View A01(R2 r10, AbstractC1542Qm abstractC1542Qm) {
        int i10;
        int iA0Y = r10.A0Y();
        if (iA0Y == 0) {
            return null;
        }
        View view = null;
        if (r10.A1V()) {
            int iA0A = abstractC1542Qm.A0A();
            int childCount = abstractC1542Qm.A0B();
            i10 = iA0A + (childCount / 2);
        } else {
            int childCount2 = abstractC1542Qm.A06();
            i10 = childCount2 / 2;
        }
        int i11 = Integer.MAX_VALUE;
        for (int i12 = 0; i12 < iA0Y; i12++) {
            View viewA0v = r10.A0v(i12);
            int iA0F = abstractC1542Qm.A0F(viewA0v);
            int childCount3 = abstractC1542Qm.A0D(viewA0v);
            int childCount4 = Math.abs((iA0F + (childCount3 / 2)) - i10);
            if (childCount4 < i11) {
                i11 = childCount4;
                String[] strArr = A02;
                String str = strArr[0];
                String str2 = strArr[1];
                int length = str.length();
                int childCount5 = str2.length();
                if (length != childCount5) {
                    throw new RuntimeException();
                }
                A02[5] = "j4bRVUHHACnikA";
                view = viewA0v;
            }
        }
        return view;
    }

    private View A02(R2 r10, AbstractC1542Qm abstractC1542Qm) {
        int iA0Y = r10.A0Y();
        if (iA0Y == 0) {
            return null;
        }
        View view = null;
        int i10 = Integer.MAX_VALUE;
        if (A02[7].charAt(21) == '9') {
            throw new RuntimeException();
        }
        A02[7] = "DwjJFjjR1ioErHTPj2QZ0AbXqU5bWHnc";
        for (int childCount = 0; childCount < iA0Y; childCount++) {
            View viewA0v = r10.A0v(childCount);
            int iA0F = abstractC1542Qm.A0F(viewA0v);
            if (iA0F < i10) {
                i10 = iA0F;
                view = viewA0v;
            }
        }
        return view;
    }

    private AbstractC1542Qm A03(R2 r10) {
        if (this.A00 == null || this.A00.A02 != r10) {
            this.A00 = AbstractC1542Qm.A00(r10);
        }
        return this.A00;
    }

    private AbstractC1542Qm A04(R2 r10) {
        if (this.A01 == null || this.A01.A02 != r10) {
            this.A01 = AbstractC1542Qm.A01(r10);
        }
        return this.A01;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.ads.redexgen.core.AbstractC2246hU
    public final int A0C(R2 r10, int i10, int i11) {
        int iA0r;
        int centerPosition;
        int iA0b = r10.A0b();
        if (iA0b == 0) {
            return -1;
        }
        View viewA02 = null;
        if (r10.A23()) {
            viewA02 = A02(r10, A04(r10));
        } else if (r10.A22()) {
            viewA02 = A02(r10, A03(r10));
        }
        if (viewA02 == null || (iA0r = r10.A0r(viewA02)) == -1) {
            return -1;
        }
        if (r10.A22()) {
            centerPosition = i10 > 0 ? 1 : 0;
        } else {
            centerPosition = i11 > 0 ? 1 : 0;
        }
        boolean z10 = false;
        if (r10 instanceof RE) {
            int itemCount = iA0b - 1;
            PointF pointFA56 = ((RE) r10).A56(itemCount);
            if (pointFA56 != null) {
                z10 = pointFA56.x < 0.0f || pointFA56.y < 0.0f;
            }
        }
        if (z10) {
            return centerPosition != 0 ? iA0r - 1 : iA0r;
        }
        return centerPosition != 0 ? iA0r + 1 : iA0r;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2246hU
    public final View A0D(R2 r10) {
        if (r10.A23()) {
            return A01(r10, A04(r10));
        }
        if (r10.A22()) {
            View viewA01 = A01(r10, A03(r10));
            if (A02[4].charAt(24) != 'v') {
                throw new RuntimeException();
            }
            A02[5] = "ku3zp";
            return viewA01;
        }
        return null;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2246hU
    public final C2267hq A0E(R2 r10) {
        if (!(r10 instanceof RE)) {
            return null;
        }
        final Context context = super.A00.getContext();
        return new C2267hq(context) { // from class: com.facebook.ads.redexgen.X.7O
            @Override // com.facebook.ads.redexgen.core.C2267hq, com.facebook.ads.redexgen.core.RF
            public final void A0I(View view, RH rh2, RD rd2) {
                int[] iArrA0H = this.A00.A0H(((AbstractC2246hU) this.A00).A00.getLayoutManager(), view);
                int time = iArrA0H[0];
                int dy = iArrA0H[1];
                int dx = A0M(Math.max(Math.abs(time), Math.abs(dy)));
                if (dx > 0) {
                    rd2.A04(time, dy, dx, ((C2267hq) this).A04);
                }
            }

            @Override // com.facebook.ads.redexgen.core.C2267hq
            public final float A0J(DisplayMetrics displayMetrics) {
                return 100.0f / displayMetrics.densityDpi;
            }

            @Override // com.facebook.ads.redexgen.core.C2267hq
            public final int A0L(int i10) {
                return Math.min(100, super.A0L(i10));
            }
        };
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2246hU
    public final int[] A0H(R2 r10, View view) {
        int[] iArr = new int[2];
        if (r10.A22()) {
            iArr[0] = A00(r10, view, A03(r10));
        } else {
            iArr[0] = 0;
        }
        if (r10.A23()) {
            iArr[1] = A00(r10, view, A04(r10));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }
}
