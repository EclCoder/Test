package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.graphics.PointF;
import android.os.Parcelable;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.facebook.ads.internal.androidx.support.v7.widget.LinearLayoutManager$SavedState;
import com.facebook.ads.internal.util.parcelable.WrappedParcelable;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.hr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2268hr extends R2 implements RE {
    public static byte[] A0F;
    public static String[] A0G = {"ZTDwmEtle1avZIcEXO6Ngzge8j05pfT9", "s1YfUPq4amp3sGXTr0KOnMWCCCkrB2x5", "RLSriKm", "hA4l3MFFurEjuKvfb479JjwTp2cnC09n", "5GFF521rSn4TdhEStccPhauxYrt7NMVp", "XQN2s9DMc1xKucEpv2CitIAcNHBR8E7y", "8ubGCSX", "EFysGv6XChRnXfWxG2n7d2ksHTdYT6om"};
    public int A00;
    public int A01;
    public int A02;
    public LinearLayoutManager$SavedState A03;
    public AbstractC1542Qm A04;
    public boolean A05;
    public int A06;
    public C1538Qh A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public final C1536Qf A0D;
    public final C1537Qg A0E;

    public static String A0T(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0F, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 91);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0V() {
        A0F = new byte[]{31, 24, 0, 23, 26, 31, 18, 86, 25, 4, 31, 19, 24, 2, 23, 2, 31, 25, 24, 76};
    }

    static {
        A0V();
    }

    public C2268hr(Context context) {
        this(context, 1, false);
    }

    public C2268hr(Context context, int i10, boolean z10) {
        this.A0A = false;
        this.A05 = false;
        this.A0C = false;
        this.A0B = true;
        this.A01 = -1;
        this.A02 = Integer.MIN_VALUE;
        this.A03 = null;
        this.A0D = new C1536Qf(this);
        this.A0E = new C1537Qg();
        this.A06 = 2;
        A2C(i10);
        A0h(z10);
        A1T(true);
    }

    private final int A04(int i10, RA ra2, RH rh2) {
        if (A0Y() == 0 || i10 == 0) {
            return 0;
        }
        this.A07.A0B = true;
        A2B();
        int absDy = i10 > 0 ? 1 : -1;
        int consumed = Math.abs(i10);
        A0Y(absDy, consumed, true, rh2);
        int i11 = this.A07.A07;
        int layoutDirection = A07(ra2, this.A07, rh2, false);
        int i12 = i11 + layoutDirection;
        if (i12 < 0) {
            return 0;
        }
        int absDy2 = consumed > i12 ? absDy * i12 : i10;
        int layoutDirection2 = -absDy2;
        this.A04.A0J(layoutDirection2);
        this.A07.A04 = absDy2;
        return absDy2;
    }

    private int A05(int i10, RA ra2, RH rh2, boolean z10) {
        int fixOffset;
        int gap = this.A04.A07() - i10;
        if (gap > 0) {
            int i11 = -A04(-gap, ra2, rh2);
            int i12 = i10 + i11;
            if (z10 && (fixOffset = this.A04.A07() - i12) > 0) {
                this.A04.A0J(fixOffset);
                return fixOffset + i11;
            }
            return i11;
        }
        return 0;
    }

    private int A06(int i10, RA ra2, RH rh2, boolean z10) {
        int iA0A;
        int gap = i10 - this.A04.A0A();
        if (gap > 0) {
            int i11 = -A04(gap, ra2, rh2);
            int i12 = i10 + i11;
            if (z10 && (iA0A = i12 - this.A04.A0A()) > 0) {
                this.A04.A0J(-iA0A);
                return i11 - iA0A;
            }
            return i11;
        }
        return 0;
    }

    private final int A07(RA ra2, C1538Qh c1538Qh, RH rh2, boolean z10) {
        int i10 = c1538Qh.A00;
        int start = c1538Qh.A07;
        if (start != Integer.MIN_VALUE) {
            int start2 = c1538Qh.A00;
            if (start2 < 0) {
                int i11 = c1538Qh.A07;
                int start3 = c1538Qh.A00;
                c1538Qh.A07 = i11 + start3;
            }
            A0e(ra2, c1538Qh);
        }
        int i12 = c1538Qh.A00;
        int start4 = c1538Qh.A02;
        int i13 = i12 + start4;
        C1537Qg c1537Qg = this.A0E;
        while (true) {
            if ((!c1538Qh.A09 && i13 <= 0) || !c1538Qh.A05(rh2)) {
                break;
            }
            c1537Qg.A00();
            A2F(ra2, rh2, c1538Qh, c1537Qg);
            if (!c1537Qg.A01) {
                int i14 = c1538Qh.A06;
                int remainingSpace = c1537Qg.A00;
                int start5 = c1538Qh.A05;
                c1538Qh.A06 = i14 + (remainingSpace * start5);
                if (!c1537Qg.A03 || this.A07.A08 != null || !rh2.A07()) {
                    int remainingSpace2 = c1538Qh.A00;
                    int start6 = c1537Qg.A00;
                    c1538Qh.A00 = remainingSpace2 - start6;
                    int start7 = c1537Qg.A00;
                    i13 -= start7;
                }
                int start8 = c1538Qh.A07;
                if (start8 != Integer.MIN_VALUE) {
                    int remainingSpace3 = c1538Qh.A07;
                    int start9 = c1537Qg.A00;
                    c1538Qh.A07 = remainingSpace3 + start9;
                    int start10 = c1538Qh.A00;
                    if (start10 < 0) {
                        int remainingSpace4 = c1538Qh.A07;
                        int start11 = c1538Qh.A00;
                        c1538Qh.A07 = remainingSpace4 + start11;
                    }
                    A0e(ra2, c1538Qh);
                }
                if (z10 && c1537Qg.A02) {
                    break;
                }
            } else {
                break;
            }
        }
        int start12 = c1538Qh.A00;
        return i10 - start12;
    }

    private int A08(RH rh2) {
        if (A0Y() == 0) {
            return 0;
        }
        A2B();
        return RL.A00(rh2, this.A04, A0R(!this.A0B, true), A0Q(!this.A0B, true), this, this.A0B);
    }

    private int A0A(RH rh2) {
        if (A0Y() != 0) {
            A2B();
            return RL.A02(rh2, this.A04, A0R(!this.A0B, true), A0Q(!this.A0B, true), this, this.A0B, this.A05);
        }
        if (A0G[3].charAt(25) != '2') {
            throw new RuntimeException();
        }
        A0G[1] = "J9JFedtgHh7lzsKv2wGVe5URJzbGPRgH";
        return 0;
    }

    private int A0B(RH rh2) {
        if (A0Y() == 0) {
            return 0;
        }
        A2B();
        return RL.A01(rh2, this.A04, A0R(!this.A0B, true), A0Q(!this.A0B, true), this, this.A0B);
    }

    private final int A0C(RH rh2) {
        if (rh2.A06()) {
            return this.A04.A0B();
        }
        return 0;
    }

    private View A0D() {
        return A0H(0, A0Y());
    }

    private View A0E() {
        return A0H(A0Y() - 1, -1);
    }

    private View A0F() {
        return A0v(this.A05 ? 0 : A0Y() - 1);
    }

    private View A0G() {
        return A0v(this.A05 ? A0Y() - 1 : 0);
    }

    private final View A0H(int i10, int i11) {
        int next;
        int acceptableBoundsFlag;
        int preferredBoundsFlag;
        A2B();
        if (i11 > i10) {
            next = 1;
        } else {
            next = i11 < i10 ? -1 : 0;
        }
        if (next == 0) {
            return A0v(i10);
        }
        int preferredBoundsFlag2 = this.A04.A0F(A0v(i10));
        int next2 = this.A04.A0A();
        if (preferredBoundsFlag2 < next2) {
            acceptableBoundsFlag = 16644;
            preferredBoundsFlag = 16388;
        } else {
            acceptableBoundsFlag = 4161;
            preferredBoundsFlag = 4097;
        }
        int next3 = this.A00;
        if (next3 == 0) {
            return super.A04.A00(i10, i11, acceptableBoundsFlag, preferredBoundsFlag);
        }
        return super.A05.A00(i10, i11, acceptableBoundsFlag, preferredBoundsFlag);
    }

    private final View A0I(int i10, int i11, boolean z10, boolean z11) {
        int i12;
        A2B();
        int i13 = 0;
        if (z10) {
            i12 = 24579;
        } else {
            i12 = Sdk$SDKError.b.WEBVIEW_ERROR_VALUE;
        }
        if (z11) {
            i13 = Sdk$SDKError.b.WEBVIEW_ERROR_VALUE;
        }
        int i14 = this.A00;
        int acceptableBoundsFlag = A0G[5].charAt(29);
        if (acceptableBoundsFlag != 69) {
            throw new RuntimeException();
        }
        A0G[5] = "CO2lCdhiUyNnJNyVLVKK7uQ85cne8EHP";
        if (i14 == 0) {
            return super.A04.A00(i10, i11, i12, i13);
        }
        return super.A05.A00(i10, i11, i12, i13);
    }

    private View A0J(RA ra2, RH rh2) {
        return A2A(ra2, rh2, 0, A0Y(), rh2.A03());
    }

    private View A0L(RA ra2, RH rh2) {
        return A2A(ra2, rh2, A0Y() - 1, -1, rh2.A03());
    }

    private View A0M(RA ra2, RH rh2) {
        return this.A05 ? A0D() : A0E();
    }

    private View A0N(RA ra2, RH rh2) {
        return this.A05 ? A0E() : A0D();
    }

    private View A0O(RA ra2, RH rh2) {
        return this.A05 ? A0J(ra2, rh2) : A0L(ra2, rh2);
    }

    private View A0P(RA ra2, RH rh2) {
        return this.A05 ? A0L(ra2, rh2) : A0J(ra2, rh2);
    }

    private View A0Q(boolean z10, boolean z11) {
        if (this.A05) {
            return A0I(0, A0Y(), z10, z11);
        }
        return A0I(A0Y() - 1, -1, z10, z11);
    }

    private View A0R(boolean z10, boolean z11) {
        if (this.A05) {
            return A0I(A0Y() - 1, -1, z10, z11);
        }
        return A0I(0, A0Y(), z10, z11);
    }

    private final C1538Qh A0S() {
        return new C1538Qh();
    }

    private void A0U() {
        if (this.A00 == 1 || !A2H()) {
            this.A05 = this.A0A;
        } else {
            this.A05 = !this.A0A;
        }
    }

    private void A0W(int i10, int i11) {
        this.A07.A00 = this.A04.A07() - i11;
        this.A07.A03 = this.A05 ? -1 : 1;
        this.A07.A01 = i10;
        this.A07.A05 = 1;
        this.A07.A06 = i11;
        this.A07.A07 = Integer.MIN_VALUE;
    }

    private void A0X(int i10, int i11) {
        this.A07.A00 = i11 - this.A04.A0A();
        this.A07.A01 = i10;
        this.A07.A03 = this.A05 ? 1 : -1;
        this.A07.A05 = -1;
        this.A07.A06 = i11;
        this.A07.A07 = Integer.MIN_VALUE;
    }

    private void A0Y(int i10, int i11, boolean z10, RH rh2) {
        int iA0A;
        this.A07.A09 = A0i();
        this.A07.A02 = A0C(rh2);
        this.A07.A05 = i10;
        int i12 = -1;
        if (i10 == 1) {
            this.A07.A02 += this.A04.A08();
            View viewA0F = A0F();
            C1538Qh c1538Qh = this.A07;
            if (!this.A05) {
                i12 = 1;
            }
            c1538Qh.A03 = i12;
            this.A07.A01 = A0r(viewA0F) + this.A07.A03;
            this.A07.A06 = this.A04.A0C(viewA0F);
            iA0A = this.A04.A0C(viewA0F) - this.A04.A07();
        } else {
            View viewA0G = A0G();
            this.A07.A02 += this.A04.A0A();
            this.A07.A03 = this.A05 ? 1 : -1;
            this.A07.A01 = A0r(viewA0G) + this.A07.A03;
            this.A07.A06 = this.A04.A0F(viewA0G);
            iA0A = (-this.A04.A0F(viewA0G)) + this.A04.A0A();
        }
        this.A07.A00 = i11;
        if (z10) {
            C1538Qh c1538Qh2 = this.A07;
            int scrollingOffset = c1538Qh2.A00;
            c1538Qh2.A00 = scrollingOffset - iA0A;
        }
        this.A07.A07 = iA0A;
    }

    private void A0Z(C1536Qf c1536Qf) {
        A0W(c1536Qf.A01, c1536Qf.A00);
    }

    private void A0a(C1536Qf c1536Qf) {
        A0X(c1536Qf.A01, c1536Qf.A00);
    }

    private void A0b(RA ra2, int i10) {
        int iA0Y = A0Y();
        if (i10 < 0) {
            return;
        }
        int iA06 = this.A04.A06() - i10;
        boolean z10 = this.A05;
        int limit = A0G[3].charAt(25);
        if (limit != 50) {
            throw new RuntimeException();
        }
        A0G[1] = "5eQap7viEGWOuRbzagNYDGjkAWEMIhVp";
        if (z10) {
            for (int i11 = 0; i11 < iA0Y; i11++) {
                View viewA0v = A0v(i11);
                int childCount = this.A04.A0F(viewA0v);
                if (childCount >= iA06) {
                    int childCount2 = this.A04.A0H(viewA0v);
                    if (childCount2 >= iA06) {
                    }
                }
                int limit2 = A0G[4].length();
                if (limit2 != 13) {
                    String[] strArr = A0G;
                    strArr[6] = "EiwXPaP";
                    strArr[2] = "4OvxlWI";
                    A0d(ra2, 0, i11);
                    return;
                }
                A0d(ra2, 0, i11);
                return;
            }
            return;
        }
        for (int i12 = iA0Y - 1; i12 >= 0; i12--) {
            View viewA0v2 = A0v(i12);
            int childCount3 = this.A04.A0F(viewA0v2);
            if (childCount3 >= iA06) {
                int childCount4 = this.A04.A0H(viewA0v2);
                if (childCount4 >= iA06) {
                }
            }
            int childCount5 = iA0Y - 1;
            A0d(ra2, childCount5, i12);
            return;
        }
    }

    private void A0c(RA ra2, int i10) {
        if (i10 < 0) {
            return;
        }
        int iA0Y = A0Y();
        if (this.A05) {
            for (int i11 = iA0Y - 1; i11 >= 0; i11--) {
                View viewA0v = A0v(i11);
                AbstractC1542Qm abstractC1542Qm = this.A04;
                int childCount = A0G[5].charAt(29);
                if (childCount != 69) {
                    throw new RuntimeException();
                }
                A0G[3] = "CCkneFsBnjHsOQTiipl2DNgji2H70UcR";
                int limit = abstractC1542Qm.A0C(viewA0v);
                if (limit <= i10) {
                    int limit2 = this.A04.A0G(viewA0v);
                    if (limit2 <= i10) {
                    }
                }
                int limit3 = iA0Y - 1;
                A0d(ra2, limit3, i11);
                return;
            }
            return;
        }
        for (int i12 = 0; i12 < iA0Y; i12++) {
            View viewA0v2 = A0v(i12);
            int limit4 = this.A04.A0C(viewA0v2);
            if (limit4 <= i10) {
                int limit5 = this.A04.A0G(viewA0v2);
                if (limit5 <= i10) {
                }
            }
            A0d(ra2, 0, i12);
            return;
        }
    }

    private void A0d(RA ra2, int i10, int i11) {
        if (i10 == i11) {
            return;
        }
        if (i11 > i10) {
            for (int i12 = i11 - 1; i12 >= i10; i12--) {
                A16(i12, ra2);
            }
            return;
        }
        while (i10 > i11) {
            A16(i10, ra2);
            i10--;
        }
    }

    private void A0e(RA ra2, C1538Qh c1538Qh) {
        if (!c1538Qh.A0B || c1538Qh.A09) {
            return;
        }
        if (c1538Qh.A05 == -1) {
            A0b(ra2, c1538Qh.A07);
        } else {
            A0c(ra2, c1538Qh.A07);
        }
    }

    private void A0f(RA ra2, RH rh2, int scrapExtraEnd, int scrapExtraEnd2) {
        if (!rh2.A08() || A0Y() == 0 || rh2.A07() || !A24()) {
            return;
        }
        int iA0D = 0;
        int scrapExtraStart = 0;
        List<RK> listA0J = ra2.A0J();
        int i10 = listA0J.size();
        int iA0r = A0r(A0v(0));
        for (int scrapSize = 0; scrapSize < i10; scrapSize++) {
            RK rk2 = listA0J.get(scrapSize);
            if (!rk2.A0g()) {
                int direction = 1;
                if ((rk2.A0O() < iA0r) != this.A05) {
                    direction = -1;
                }
                if (direction == -1) {
                    iA0D += this.A04.A0D(rk2.A0H);
                } else {
                    scrapExtraStart += this.A04.A0D(rk2.A0H);
                }
            }
        }
        this.A07.A08 = listA0J;
        if (iA0D > 0) {
            A0X(A0r(A0G()), scrapExtraEnd);
            this.A07.A02 = iA0D;
            this.A07.A00 = 0;
            this.A07.A04();
            A07(ra2, this.A07, rh2, false);
        }
        if (scrapExtraStart > 0) {
            A0W(A0r(A0F()), scrapExtraEnd2);
            this.A07.A02 = scrapExtraStart;
            this.A07.A00 = 0;
            this.A07.A04();
            A07(ra2, this.A07, rh2, false);
        }
        this.A07.A08 = null;
    }

    private void A0g(RA ra2, RH rh2, C1536Qf c1536Qf) {
        if (A0k(rh2, c1536Qf) || A0j(ra2, rh2, c1536Qf)) {
            return;
        }
        c1536Qf.A02();
        c1536Qf.A01 = this.A0C ? rh2.A03() - 1 : 0;
    }

    private final void A0h(boolean z10) {
        A20(null);
        if (z10 == this.A0A) {
            return;
        }
        this.A0A = z10;
        A10();
    }

    private final boolean A0i() {
        return this.A04.A09() == 0 && this.A04.A06() == 0;
    }

    private boolean A0j(RA ra2, RH rh2, C1536Qf c1536Qf) {
        View viewA0P;
        int iA0A;
        if (A0Y() == 0) {
            return false;
        }
        View viewA0u = A0u();
        if (viewA0u != null && c1536Qf.A06(viewA0u, rh2)) {
            c1536Qf.A05(viewA0u);
            return true;
        }
        if (this.A08 != this.A0C) {
            return false;
        }
        if (c1536Qf.A02) {
            viewA0P = A0O(ra2, rh2);
        } else {
            viewA0P = A0P(ra2, rh2);
        }
        if (viewA0P == null) {
            return false;
        }
        c1536Qf.A04(viewA0P);
        if (!rh2.A07() && A24()) {
            if (this.A04.A0F(viewA0P) >= this.A04.A07() || this.A04.A0C(viewA0P) < this.A04.A0A()) {
                if (c1536Qf.A02) {
                    iA0A = this.A04.A07();
                } else {
                    iA0A = this.A04.A0A();
                }
                c1536Qf.A00 = iA0A;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b2, code lost:
    
        if ((r7 - r6) < 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b4, code lost:
    
        r10.A00 = r8.A04.A0A();
        r10.A02 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00be, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c7, code lost:
    
        if ((r7 - r6) < 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ca, code lost:
    
        r1 = r8.A04.A07() - r8.A04.A0C(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d7, code lost:
    
        if (r1 >= 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d9, code lost:
    
        r10.A00 = r8.A04.A07();
        r10.A02 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e3, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00e6, code lost:
    
        if (r10.A02 == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00e8, code lost:
    
        r1 = r8.A04.A0C(r5);
        r1 = r1 + r8.A04.A05();
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f5, code lost:
    
        r10.A00 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f8, code lost:
    
        r1 = r8.A04.A0F(r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean A0k(com.facebook.ads.redexgen.core.RH r9, com.facebook.ads.redexgen.core.C1536Qf r10) {
        /*
            Method dump skipped, instruction units count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C2268hr.A0k(com.facebook.ads.redexgen.X.RH, com.facebook.ads.redexgen.X.Qf):boolean");
    }

    @Override // com.facebook.ads.redexgen.core.R2
    public int A1f(int i10, RA ra2, RH rh2) {
        if (this.A00 == 1) {
            return 0;
        }
        return A04(i10, ra2, rh2);
    }

    @Override // com.facebook.ads.redexgen.core.R2
    public int A1g(int i10, RA ra2, RH rh2) {
        if (this.A00 == 0) {
            return 0;
        }
        return A04(i10, ra2, rh2);
    }

    @Override // com.facebook.ads.redexgen.core.R2
    public final int A1h(RH rh2) {
        return A08(rh2);
    }

    @Override // com.facebook.ads.redexgen.core.R2
    public final int A1i(RH rh2) {
        return A0A(rh2);
    }

    @Override // com.facebook.ads.redexgen.core.R2
    public final int A1j(RH rh2) {
        return A0B(rh2);
    }

    @Override // com.facebook.ads.redexgen.core.R2
    public final int A1k(RH rh2) {
        return A08(rh2);
    }

    @Override // com.facebook.ads.redexgen.core.R2
    public final int A1l(RH rh2) {
        return A0A(rh2);
    }

    @Override // com.facebook.ads.redexgen.core.R2
    public final int A1m(RH rh2) {
        return A0B(rh2);
    }

    @Override // com.facebook.ads.redexgen.core.R2
    public final Parcelable A1n() {
        if (this.A03 != null) {
            return new WrappedParcelable(new LinearLayoutManager$SavedState(this.A03));
        }
        LinearLayoutManager$SavedState linearLayoutManager$SavedState = new LinearLayoutManager$SavedState();
        if (A0Y() > 0) {
            A2B();
            boolean didLayoutFromEnd = this.A08 ^ this.A05;
            linearLayoutManager$SavedState.A02 = didLayoutFromEnd;
            if (didLayoutFromEnd) {
                View refChild = A0F();
                linearLayoutManager$SavedState.A00 = this.A04.A07() - this.A04.A0C(refChild);
                linearLayoutManager$SavedState.A01 = A0r(refChild);
            } else {
                View viewA0G = A0G();
                linearLayoutManager$SavedState.A01 = A0r(viewA0G);
                linearLayoutManager$SavedState.A00 = this.A04.A0F(viewA0G) - this.A04.A0A();
            }
        } else {
            linearLayoutManager$SavedState.A00();
        }
        return new WrappedParcelable(linearLayoutManager$SavedState);
    }

    @Override // com.facebook.ads.redexgen.core.R2
    public final View A1o(int i10) {
        int firstChild = A0Y();
        if (firstChild == 0) {
            return null;
        }
        int childCount = i10 - A0r(A0v(0));
        if (childCount >= 0 && childCount < firstChild) {
            View viewA0v = A0v(childCount);
            if (A0r(viewA0v) == i10) {
                return viewA0v;
            }
        }
        return super.A1o(i10);
    }

    @Override // com.facebook.ads.redexgen.core.R2
    public View A1p(View view, int i10, RA ra2, RH rh2) {
        int maxScroll;
        View nextFocus;
        View viewA0F;
        A0U();
        if (A0Y() == 0 || (maxScroll = A29(i10)) == Integer.MIN_VALUE) {
            return null;
        }
        A2B();
        A2B();
        int layoutDir = this.A04.A0B();
        A0Y(maxScroll, (int) (layoutDir * 0.33333334f), false, rh2);
        this.A07.A07 = Integer.MIN_VALUE;
        this.A07.A0B = false;
        A07(ra2, this.A07, rh2, true);
        if (maxScroll == -1) {
            nextFocus = A0N(ra2, rh2);
        } else {
            nextFocus = A0M(ra2, rh2);
        }
        if (maxScroll == -1) {
            viewA0F = A0G();
        } else {
            viewA0F = A0F();
        }
        if (viewA0F.hasFocusable()) {
            if (nextFocus == null) {
                return null;
            }
            return viewA0F;
        }
        return nextFocus;
    }

    @Override // com.facebook.ads.redexgen.core.R2
    public R3 A1q() {
        return new R3(-2, -2);
    }

    @Override // com.facebook.ads.redexgen.core.R2
    public void A1r(int i10) {
        this.A01 = i10;
        this.A02 = Integer.MIN_VALUE;
        if (this.A03 != null) {
            this.A03.A00();
        }
        A10();
    }

    @Override // com.facebook.ads.redexgen.core.R2
    public final void A1s(int i10, int i11, RH rh2, R0 r10) {
        if (this.A00 != 0) {
            i10 = i11;
        }
        int delta = A0Y();
        if (delta == 0 || i10 == 0) {
            return;
        }
        A2B();
        int i12 = i10 > 0 ? 1 : -1;
        int delta2 = Math.abs(i10);
        A0Y(i12, delta2, true, rh2);
        A2G(rh2, this.A07, r10);
    }

    @Override // com.facebook.ads.redexgen.core.R2
    public final void A1t(int i10, R0 r10) {
        boolean z10;
        int direction;
        if (this.A03 != null && this.A03.A01()) {
            z10 = this.A03.A02;
            direction = this.A03.A01;
        } else {
            A0U();
            z10 = this.A05;
            if (this.A01 == -1) {
                direction = z10 ? i10 - 1 : 0;
            } else {
                direction = this.A01;
            }
        }
        int anchorPos = z10 ? -1 : 1;
        for (int i11 = 0; i11 < this.A06 && direction >= 0 && direction < i10; i11++) {
            r10.A42(direction, 0);
            direction += anchorPos;
        }
    }

    @Override // com.facebook.ads.redexgen.core.R2
    public final void A1u(Parcelable parcelable) {
        ClassLoader classLoader;
        if (!(parcelable instanceof WrappedParcelable) || (classLoader = getClass().getClassLoader()) == null) {
            return;
        }
        Parcelable state = ((WrappedParcelable) parcelable).unwrap(classLoader);
        if (state instanceof LinearLayoutManager$SavedState) {
            this.A03 = (LinearLayoutManager$SavedState) state;
            A10();
        }
    }

    @Override // com.facebook.ads.redexgen.core.R2
    public final void A1v(AccessibilityEvent accessibilityEvent) {
        super.A1v(accessibilityEvent);
        if (A0Y() > 0) {
            accessibilityEvent.setFromIndex(A26());
            if (A0G[1].charAt(13) == 'I') {
                throw new RuntimeException();
            }
            String[] strArr = A0G;
            strArr[6] = "JM0e54P";
            strArr[2] = "62qYDCA";
            accessibilityEvent.setToIndex(A27());
        }
    }

    /* JADX WARN: Code duplicated, block: B:86:0x0242  */
    @Override // com.facebook.ads.redexgen.core.R2
    public void A1w(RA ra2, RH rh2) {
        int startOffset;
        int fixOffset;
        int extraForStart;
        View viewA1o;
        int fixOffset2;
        int extraForStart2 = -1;
        if ((this.A03 != null || this.A01 != -1) && rh2.A03() == 0) {
            A1K(ra2);
            return;
        }
        if (this.A03 != null && this.A03.A01()) {
            this.A01 = this.A03.A01;
        }
        A2B();
        C1538Qh c1538Qh = this.A07;
        if (A0G[4].length() == 13) {
            throw new RuntimeException();
        }
        String[] strArr = A0G;
        strArr[6] = "TEU8GGg";
        strArr[2] = "lg12FnG";
        c1538Qh.A0B = false;
        A0U();
        View viewA0u = A0u();
        if (!this.A0D.A03 || this.A01 != -1 || this.A03 != null) {
            this.A0D.A03();
            this.A0D.A02 = this.A05 ^ this.A0C;
            A0g(ra2, rh2, this.A0D);
            this.A0D.A03 = true;
        } else if (viewA0u != null) {
            int startOffset2 = this.A04.A0F(viewA0u);
            int lastElement = this.A04.A07();
            if (A0G[0].charAt(9) != '8') {
                A0G[1] = "cu8BBcv0k6hBgzqZsr0VN3sfifuVMQ62";
                if (startOffset2 < lastElement) {
                    if (this.A04.A0C(viewA0u) <= this.A04.A0A()) {
                    }
                }
            } else if (startOffset2 < lastElement) {
                if (this.A04.A0C(viewA0u) <= this.A04.A0A()) {
                }
            }
            this.A0D.A05(viewA0u);
        }
        int lastElement2 = A0C(rh2);
        if (this.A07.A04 >= 0) {
            startOffset = 0;
        } else {
            startOffset = lastElement2;
            lastElement2 = 0;
        }
        int current = startOffset + this.A04.A0A();
        int startOffset3 = lastElement2 + this.A04.A08();
        if (rh2.A07() && this.A01 != -1 && this.A02 != Integer.MIN_VALUE && (viewA1o = A1o(this.A01)) != null) {
            if (this.A05) {
                fixOffset2 = (this.A04.A07() - this.A04.A0C(viewA1o)) - this.A02;
            } else {
                fixOffset2 = this.A02 - (this.A04.A0F(viewA1o) - this.A04.A0A());
            }
            if (fixOffset2 > 0) {
                current += fixOffset2;
            } else {
                startOffset3 -= fixOffset2;
            }
        }
        if (this.A0D.A02) {
            if (this.A05) {
                extraForStart2 = 1;
            }
        } else if (!this.A05) {
            extraForStart2 = 1;
        }
        A2E(ra2, rh2, this.A0D, extraForStart2);
        A1J(ra2);
        this.A07.A09 = A0i();
        this.A07.A0A = rh2.A07();
        if (this.A0D.A02) {
            A0a(this.A0D);
            this.A07.A02 = current;
            A07(ra2, this.A07, rh2, false);
            extraForStart = this.A07.A06;
            int extraForEnd = this.A07.A01;
            if (this.A07.A00 > 0) {
                C1538Qh c1538Qh2 = this.A07;
                if (A0G[7].charAt(1) != 'F') {
                    String[] strArr2 = A0G;
                    strArr2[6] = "MJWLhmn";
                    strArr2[2] = "Xdeja1C";
                    startOffset3 += c1538Qh2.A00;
                } else {
                    A0G[3] = "HkWuM96xU0ciNRE25G4cwktgC29lbS6I";
                    startOffset3 += c1538Qh2.A00;
                }
            }
            A0Z(this.A0D);
            this.A07.A02 = startOffset3;
            this.A07.A01 += this.A07.A03;
            A07(ra2, this.A07, rh2, false);
            fixOffset = this.A07.A06;
            if (this.A07.A00 > 0) {
                int i10 = this.A07.A00;
                A0X(extraForEnd, extraForStart);
                this.A07.A02 = i10;
                A07(ra2, this.A07, rh2, false);
                extraForStart = this.A07.A06;
            }
        } else {
            A0Z(this.A0D);
            this.A07.A02 = startOffset3;
            A07(ra2, this.A07, rh2, false);
            fixOffset = this.A07.A06;
            int extraForEnd2 = this.A07.A01;
            if (this.A07.A00 > 0) {
                current += this.A07.A00;
            }
            A0a(this.A0D);
            this.A07.A02 = current;
            this.A07.A01 += this.A07.A03;
            A07(ra2, this.A07, rh2, false);
            extraForStart = this.A07.A06;
            if (this.A07.A00 > 0) {
                int i11 = this.A07.A00;
                A0W(extraForEnd2, fixOffset);
                this.A07.A02 = i11;
                A07(ra2, this.A07, rh2, false);
                fixOffset = this.A07.A06;
            }
        }
        if (A0Y() > 0) {
            if (this.A05 ^ this.A0C) {
                int iA05 = A05(fixOffset, ra2, rh2, true);
                int extraForStart3 = extraForStart + iA05;
                int fixOffset3 = fixOffset + iA05;
                int iA06 = A06(extraForStart3, ra2, rh2, false);
                extraForStart = extraForStart3 + iA06;
                fixOffset = fixOffset3 + iA06;
            } else {
                int iA07 = A06(extraForStart, ra2, rh2, true);
                int extraForStart4 = extraForStart + iA07;
                int fixOffset4 = fixOffset + iA07;
                int iA08 = A05(fixOffset4, ra2, rh2, false);
                extraForStart = extraForStart4 + iA08;
                fixOffset = fixOffset4 + iA08;
            }
        }
        A0f(ra2, rh2, extraForStart, fixOffset);
        if (!rh2.A07()) {
            this.A04.A0I();
        } else {
            this.A0D.A03();
        }
        this.A08 = this.A0C;
    }

    @Override // com.facebook.ads.redexgen.core.R2
    public void A1x(RH rh2) {
        super.A1x(rh2);
        this.A03 = null;
        this.A01 = -1;
        this.A02 = Integer.MIN_VALUE;
        this.A0D.A03();
    }

    @Override // com.facebook.ads.redexgen.core.R2
    public final void A1y(C7M c7m, RA ra2) {
        super.A1y(c7m, ra2);
        if (this.A09) {
            A1K(ra2);
            ra2.A0P();
        }
    }

    @Override // com.facebook.ads.redexgen.core.R2
    public void A1z(C7M c7m, RH rh2, int i10) {
        C2267hq linearSmoothScroller = new C2267hq(c7m.getContext());
        linearSmoothScroller.A0A(i10);
        A1N(linearSmoothScroller);
    }

    @Override // com.facebook.ads.redexgen.core.R2
    public final void A20(String str) {
        if (this.A03 == null) {
            super.A20(str);
        }
    }

    @Override // com.facebook.ads.redexgen.core.R2
    public final boolean A21() {
        return (A0a() == 1073741824 || A0k() == 1073741824 || !A1U()) ? false : true;
    }

    @Override // com.facebook.ads.redexgen.core.R2
    public final boolean A22() {
        return this.A00 == 0;
    }

    @Override // com.facebook.ads.redexgen.core.R2
    public final boolean A23() {
        return this.A00 == 1;
    }

    @Override // com.facebook.ads.redexgen.core.R2
    public boolean A24() {
        return this.A03 == null && this.A08 == this.A0C;
    }

    public final int A25() {
        View child = A0I(0, A0Y(), true, false);
        if (child == null) {
            return -1;
        }
        return A0r(child);
    }

    public final int A26() {
        View child = A0I(0, A0Y(), false, true);
        if (child == null) {
            return -1;
        }
        return A0r(child);
    }

    public final int A27() {
        View child = A0I(A0Y() - 1, -1, false, true);
        if (child == null) {
            return -1;
        }
        return A0r(child);
    }

    public final int A28() {
        return this.A00;
    }

    public final int A29(int i10) {
        switch (i10) {
            case 1:
                if (this.A00 == 1) {
                    return -1;
                }
                boolean zA2H = A2H();
                if (A0G[4].length() != 13) {
                    A0G[7] = "JFBGAdvw0W46p1IiHd184rfjlhxsbjRk";
                    return zA2H ? 1 : -1;
                }
                break;
            case 2:
                return (this.A00 != 1 && A2H()) ? -1 : 1;
            case 17:
                if (this.A00 == 0) {
                    return -1;
                }
                return Integer.MIN_VALUE;
            case 33:
                if (this.A00 == 1) {
                    return -1;
                }
                return Integer.MIN_VALUE;
            case BLACK_SCREEN_IS_DETECTED_VALUE:
                int i11 = this.A00;
                String[] strArr = A0G;
                if (strArr[6].length() == strArr[2].length()) {
                    A0G[0] = "A4gNOGqmCbgTlyYHXDAs3UqrHjABAhAn";
                    return i11 == 0 ? 1 : Integer.MIN_VALUE;
                }
                break;
            case 130:
                return this.A00 == 1 ? 1 : Integer.MIN_VALUE;
            default:
                return Integer.MIN_VALUE;
        }
        throw new RuntimeException();
    }

    public View A2A(RA ra2, RH rh2, int i10, int i11, int i12) {
        A2B();
        View view = null;
        View view2 = null;
        int iA0A = this.A04.A0A();
        int boundsEnd = this.A04.A07();
        int boundsStart = i11 > i10 ? 1 : -1;
        while (i10 != i11) {
            View outOfBoundsMatch = A0v(i10);
            int iA0r = A0r(outOfBoundsMatch);
            if (iA0r >= 0 && iA0r < i12) {
                if (((R3) outOfBoundsMatch.getLayoutParams()).A02()) {
                    if (view == null) {
                        view = outOfBoundsMatch;
                    }
                } else if (this.A04.A0F(outOfBoundsMatch) >= boundsEnd || this.A04.A0C(outOfBoundsMatch) < iA0A) {
                    if (view2 == null) {
                        view2 = outOfBoundsMatch;
                    }
                } else {
                    return outOfBoundsMatch;
                }
            }
            i10 += boundsStart;
        }
        return view2 != null ? view2 : view;
    }

    public final void A2B() {
        if (this.A07 == null) {
            C1538Qh c1538QhA0S = A0S();
            if (A0G[3].charAt(25) != '2') {
                throw new RuntimeException();
            }
            A0G[7] = "6FRvOBuqOIFmnj4QgnBJgNDOjl7oudHL";
            this.A07 = c1538QhA0S;
        }
        if (this.A04 == null) {
            this.A04 = AbstractC1542Qm.A02(this, this.A00);
        }
    }

    public final void A2C(int i10) {
        if (i10 == 0 || i10 == 1) {
            A20(null);
            if (i10 == this.A00) {
                return;
            }
            this.A00 = i10;
            this.A04 = null;
            A10();
            return;
        }
        throw new IllegalArgumentException(A0T(0, 20, 45) + i10);
    }

    public final void A2D(int i10, int i11) {
        this.A01 = i10;
        this.A02 = i11;
        if (this.A03 != null) {
            this.A03.A00();
        }
        A10();
    }

    public void A2E(RA ra2, RH rh2, C1536Qf c1536Qf, int i10) {
    }

    public void A2F(RA ra2, RH rh2, C1538Qh c1538Qh, C1537Qg c1537Qg) {
        int iA0i;
        int right;
        int iA0g;
        int iA0E;
        View viewA03 = c1538Qh.A03(ra2);
        if (viewA03 == null) {
            c1537Qg.A01 = true;
            return;
        }
        R3 r10 = (R3) viewA03.getLayoutParams();
        if (c1538Qh.A08 == null) {
            if (this.A05 == (c1538Qh.A05 == -1)) {
                A19(viewA03);
            } else {
                A1B(viewA03, 0);
            }
        } else {
            boolean z10 = this.A05;
            int bottom = c1538Qh.A05;
            if (z10 == (bottom == -1)) {
                A18(viewA03);
            } else {
                A1A(viewA03, 0);
            }
        }
        A1C(viewA03, 0, 0);
        c1537Qg.A00 = this.A04.A0D(viewA03);
        if (this.A00 == 1) {
            if (A2H()) {
                iA0E = A0j() - A0h();
                iA0g = iA0E - this.A04.A0E(viewA03);
            } else {
                iA0g = A0g();
                iA0E = this.A04.A0E(viewA03) + iA0g;
            }
            if (c1538Qh.A05 == -1) {
                right = c1538Qh.A06;
                iA0i = c1538Qh.A06 - c1537Qg.A00;
            } else {
                iA0i = c1538Qh.A06;
                right = c1538Qh.A06 + c1537Qg.A00;
            }
        } else {
            iA0i = A0i();
            right = this.A04.A0E(viewA03) + iA0i;
            int bottom2 = c1538Qh.A05;
            if (bottom2 == -1) {
                iA0E = c1538Qh.A06;
                int i10 = c1538Qh.A06;
                int bottom3 = c1537Qg.A00;
                iA0g = i10 - bottom3;
            } else {
                iA0g = c1538Qh.A06;
                int i11 = c1538Qh.A06;
                int bottom4 = c1537Qg.A00;
                iA0E = i11 + bottom4;
            }
        }
        A1D(viewA03, iA0g, iA0i, iA0E, right);
        if (r10.A02() || r10.A01()) {
            c1537Qg.A03 = true;
        }
        c1537Qg.A02 = viewA03.hasFocusable();
    }

    public void A2G(RH rh2, C1538Qh c1538Qh, R0 r10) {
        int i10 = c1538Qh.A01;
        if (i10 >= 0) {
            int pos = rh2.A03();
            if (i10 < pos) {
                int pos2 = c1538Qh.A07;
                r10.A42(i10, Math.max(0, pos2));
            }
        }
    }

    public final boolean A2H() {
        return A0c() == 1;
    }

    @Override // com.facebook.ads.redexgen.core.RE
    public final PointF A56(int i10) {
        if (A0Y() == 0) {
            return null;
        }
        boolean z10 = i10 < A0r(A0v(0));
        boolean z11 = this.A05;
        int firstChildPos = A0G[4].length();
        if (firstChildPos == 13) {
            throw new RuntimeException();
        }
        A0G[7] = "FFnbbIQmxzlcCB5QJgqtb02Njm6aLfkX";
        int i11 = z10 != z11 ? -1 : 1;
        int direction = this.A00;
        if (direction == 0) {
            return new PointF(i11, 0.0f);
        }
        return new PointF(0.0f, i11);
    }
}
