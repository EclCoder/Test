package com.facebook.ads.redexgen.core;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class Z2 extends FrameLayout {
    public static byte[] A0D;
    public static String[] A0E = {"EYRP1PEEhxzmFZofVXiCCrEXWQs6qPAa", "IPRTBS", "NsAYUXCCkxBbK0XyUhCt1xHChz5fZfMK", "fEJJ0", "6651Qynk9CVpAvzNTMvYSQKVDYa6iazW", "nD7S5n7VHEDKGeK1PzI1a27Vk58dSaaa", "vFV0GS7SjmRPmH7mLZ5yrXn6gSrRknN8", "LPfldR2r"};
    public static final int A0F;
    public boolean A00;
    public final C2368ji A01;
    public final AbstractC2363jd A02;
    public final C2198gi A03;
    public final VA A04;
    public final VI A05;
    public final Y2 A06;
    public final C1504Ow A07;
    public final AbstractC1498Oq A08;
    public final AbstractC2142fo A09;
    public final C2143fp A0A;
    public final String A0B;
    public final WeakReference<Z1> A0C;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public Z2(C2198gi c2198gi, VA va2, C1604Sx c1604Sx, WeakReference<Z1> weakReference, int i10, int i11, int i12, int i13, C2368ji c2368ji, String str) {
        super(c2198gi);
        this.A06 = new Y2();
        this.A03 = c2198gi;
        this.A04 = va2;
        this.A01 = c2368ji;
        this.A0C = weakReference;
        this.A0B = str;
        AbstractC2363jd abstractC2363jdA0F = this.A01.A0F();
        if (abstractC2363jdA0F == null) {
            throw new IllegalStateException(A09(0, 32, 86));
        }
        this.A02 = this.A01.A0F();
        YB.A0N(this, -1);
        this.A05 = new VI(this.A01.A7O(), this.A04);
        this.A09 = A06();
        this.A0A = A07(i10, i13, i11, i12);
        LinearLayout linearLayout = new LinearLayout(c2198gi);
        linearLayout.setOrientation(1);
        addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
        this.A08 = A04(c1604Sx);
        if (this.A08 != null) {
            linearLayout.addView(this.A08, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        }
        this.A07 = A02(abstractC2363jdA0F);
        linearLayout.addView(this.A07, new LinearLayout.LayoutParams(-1, -2));
    }

    public static String A09(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0D, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            byte b10 = (byte) ((bArrCopyOfRange[i13] - i12) - 99);
            if (A0E[6].charAt(17) == 'I') {
                throw new RuntimeException();
            }
            A0E[6] = "HyV3wef6DGt1nbLL1fRSvAmBe6VeBas4";
            bArrCopyOfRange[i13] = b10;
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0F() {
        A0D = new byte[]{-6, 29, -39, 29, 26, 45, 26, -39, 27, 46, 39, 29, 37, 30, -39, 34, 44, -39, 28, 26, 39, 39, 40, 45, -39, 27, 30, -39, 39, 46, 37, 37, 52, 64, 62, -1, 55, 50, 52, 54, 51, 64, 64, 60, -1, 50, 53, 68, -1, 51, 50, 63, 63, 54, 67, -1, 52, 61, 58, 52, 60, 54, 53};
    }

    static {
        A0F();
        A0F = (int) (XX.A02 * 40.0f);
    }

    private C1504Ow A02(AbstractC2363jd abstractC2363jd) {
        C1456Na c1456NaA00;
        NR nrA29 = abstractC2363jd.A29();
        PW pw = new PW() { // from class: com.facebook.ads.redexgen.X.6f
            public static byte[] A01;
            public static String[] A02 = {"69whQSJFXzC5tMS1mvBQof2SK7ErE5ZD", "1jHEgafKgZ1qGtZeFln5jYEaZuoTSi1L", "X7dL0uEA8hI8yFDxVjmpGWGPGaRf3imC", "xkNxR1N5ht6u5HrBYV6Jaj9BRbbqvvjX", "FzWiIV8jsRMCATg74qRy8XJg", "NPgeBhkCK5cdUCtVbQG3V7Bzbyz9qF6p", "wkBgnizDM2wMuU", "fQJYdDBiu8hI0YoMzyDMv7ESaoH1tCRU"};

            public static String A00(int i10, int i11, int i12) {
                byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
                int i13 = 0;
                while (true) {
                    int length = bArrCopyOfRange.length;
                    String[] strArr = A02;
                    if (strArr[5].charAt(30) == strArr[3].charAt(30)) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A02;
                    strArr2[5] = "zFlqgUHcpRBmVFunDUsFQIo1zDN3Ly6W";
                    strArr2[3] = "vgtBZdmtnd3XTM9GsG6r3isUaM0HNLHl";
                    if (i13 >= length) {
                        return new String(bArrCopyOfRange);
                    }
                    bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 4);
                    i13++;
                }
            }

            public static void A01() {
                A01 = new byte[]{-102};
            }

            static {
                A01();
            }

            @Override // com.facebook.ads.redexgen.core.InterfaceC1739Yh
            public final void A4j(String str) {
                P2.A00(this.A00.A03).A07(new Intent(str + A00(0, 1, 92) + this.A00.A0B));
            }
        };
        if (getOrientation() == 1) {
            c1456NaA00 = abstractC2363jd.A28().A01();
        } else {
            NN nnA28 = abstractC2363jd.A28();
            String[] strArr = A0E;
            if (strArr[1].length() == strArr[3].length()) {
                throw new RuntimeException();
            }
            A0E[7] = "bY8FFe1Y";
            c1456NaA00 = nnA28.A00();
        }
        C1504Ow c1504Ow = new C1504Ow(this.A03, A0F, c1456NaA00, nrA29.A0J().A06(), A09(32, 31, 110), this.A04, pw, this.A0A, this.A06, abstractC2363jd.A2A());
        c1504Ow.setInfo(nrA29.A0I(), nrA29.A0J(), this.A01.A7O(), abstractC2363jd.A2C().A01(), null, null);
        if (C1648Up.A1N(this.A03)) {
            c1504Ow.A0k();
        }
        return c1504Ow;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.facebook.ads.redexgen.X.6q] */
    private AbstractC1498Oq A04(C1604Sx c1604Sx) {
        final ViewOnClickListenerC1757Yz viewOnClickListenerC1757Yz = new ViewOnClickListenerC1757Yz(this);
        String videoUrl = this.A01.A0e();
        if (A0H(c1604Sx, this.A01) && videoUrl != null) {
            C10426g videoView = new C10426g(this.A03, this.A04, c1604Sx, this.A05, viewOnClickListenerC1757Yz, this.A02).A0I(this.A01.A7O(), videoUrl, this.A01.A0H() != null ? this.A01.A0H().getUrl() : null, this.A01.A0R(), this.A01.A0Q());
            if (C1648Up.A1R(this.A03)) {
                setViewAsCTA(videoView);
            }
            return videoView;
        }
        C1660Vb c1660VbA0H = this.A01.A0H();
        if (c1660VbA0H == null) {
            return null;
        }
        final C2198gi c2198gi = this.A03;
        final VI vi2 = this.A05;
        final AbstractC2363jd abstractC2363jd = this.A02;
        C10526q c10526qA0I = new AbstractC1498Oq(c2198gi, viewOnClickListenerC1757Yz, vi2, abstractC2363jd) { // from class: com.facebook.ads.redexgen.X.6q
            public final C1851b5 A00;

            {
                super(c2198gi, viewOnClickListenerC1757Yz, vi2, abstractC2363jd);
                this.A00 = new C1851b5(c2198gi);
                addView(this.A00, new RelativeLayout.LayoutParams(-1, -1));
            }

            @Override // com.facebook.ads.redexgen.core.AbstractC1498Oq
            public final void A0E() {
                super.A0E();
            }

            @Override // com.facebook.ads.redexgen.core.AbstractC1498Oq
            public final void A0F() {
                super.A0F();
                if (this.A04 != null) {
                    YB.A0J(this.A04);
                    this.A04.setLayoutParams(AbstractC1498Oq.A0A(null));
                    addView(this.A04);
                }
            }

            public final C10526q A0I(String str) {
                new LM(this.A00, this.A08).A05(this.A00.getHeight(), this.A00.getWidth()).A06(new C1499Or(this)).A07(str);
                A0F();
                return this;
            }

            @Override // com.facebook.ads.redexgen.core.AbstractC1498Oq
            public int getMediaViewId() {
                return this.A00.getId();
            }
        }.A0I(c1660VbA0H.getUrl());
        if (C1648Up.A1P(this.A03)) {
            setViewAsCTA(c10526qA0I);
        }
        return c10526qA0I;
    }

    private C1483Ob A06() {
        return new C1483Ob(this);
    }

    private C2143fp A07(int i10, int i11, int i12, int i13) {
        C2143fp c2143fp = new C2143fp(this, i10, i11, true, new WeakReference(this.A09), this.A03);
        c2143fp.A0W(i12);
        c2143fp.A0X(i13);
        return c2143fp;
    }

    private void A0C() {
        String strA0M = this.A01.A0M();
        if (!TextUtils.isEmpty(strA0M)) {
            X6 x10 = new X6();
            C2198gi c2198gi = this.A03;
            Uri uriA00 = XB.A00(strA0M);
            String adChoicesLinkUrl = this.A01.A7O();
            X6.A0O(x10, c2198gi, uriA00, adChoicesLinkUrl);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0D() {
        this.A05.A04(VH.A0A, null);
        if (!AbstractC1489Oh.A00(this.A03.A02()).A0O(this.A03, false)) {
            A0C();
            return;
        }
        AbstractC1761Zd abstractC1761ZdA01 = AbstractC1762Ze.A01(this.A03, this.A04, this.A01.A7O(), this);
        if (abstractC1761ZdA01 == null) {
            A0C();
            return;
        }
        YB.A0W(this);
        addView(abstractC1761ZdA01, new FrameLayout.LayoutParams(-1, -1));
        abstractC1761ZdA01.A0N();
    }

    private void A0E() {
        if (getVisibility() == 0 && this.A00 && hasWindowFocus()) {
            this.A0A.A0U();
        } else {
            this.A0A.A0V();
        }
    }

    public static boolean A0H(C1604Sx c1604Sx, C2368ji c2368ji) {
        String strA0e = c2368ji.A0e();
        if (TextUtils.isEmpty(strA0e)) {
            return false;
        }
        String videoUrl = c1604Sx.A0T(strA0e);
        return !TextUtils.isEmpty(videoUrl);
    }

    public final void A0I() {
        if (this.A08 != null) {
            this.A08.A0D();
        }
        if (this.A0A != null) {
            this.A0A.A0V();
        }
        YB.A0J(this);
    }

    public final void A0J() {
        if (this.A08 != null) {
            AbstractC1498Oq abstractC1498Oq = this.A08;
            if (A0E[2].charAt(13) == 'c') {
                throw new RuntimeException();
            }
            String[] strArr = A0E;
            strArr[0] = "hgkEcT5pEsAUKYMkvVnojxGMD5WCOUSh";
            strArr[5] = "qBRuzdoZQfMYUt1SZmDdshQz8Ndd8EXP";
            abstractC1498Oq.A0E();
        }
    }

    private int getOrientation() {
        Activity activity = this.A03.A0E();
        if (activity != null) {
            return activity.getResources().getConfiguration().orientation;
        }
        return 1;
    }

    public C2143fp getViewabilityChecker() {
        return this.A0A;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A00 = true;
        A0E();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A00 = false;
        A0E();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.A06.A06(this.A03, motionEvent, this, this);
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        A0E();
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        A0E();
    }

    private void setViewAsCTA(View view) {
        view.setOnClickListener(new Z0(this));
    }
}
