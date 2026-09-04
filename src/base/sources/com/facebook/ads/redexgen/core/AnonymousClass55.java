package com.facebook.ads.redexgen.core;

import android.R;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Configuration;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.55, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class AnonymousClass55 extends AbstractC1337Ij {
    public static byte[] A0o;
    public static String[] A0p = {"PW", "VMuxnsAFAgr5cT24vzltLNiVzxTvarbU", "jq4GRSBqKMr4rGHs6WabqGWnms1UYtFJ", "ha", "80KuzsseMGT5f9rKVuNW3ow7LLk13v1X", "uG1OElCv3xaCg8aDr811TJkNgBcTan1c", "YwXHrw3Tlq3bJQZfooudgwuoCwRnfSi1", "LVHFB8bkqwAuG3vKzwVN0RmVN3FHwXeF"};
    public static final int A0q;
    public static final int A0r;
    public static final int A0s;
    public static final int A0t;
    public static final int A0u;
    public float A00;
    public int A01;
    public ImageView A02;
    public LinearLayout A03;
    public M8 A04;
    public C1827ah A05;
    public M3 A06;
    public C1875bT A07;
    public ViewOnClickListenerC1396Kr A08;
    public C1927cJ A09;
    public EnumC2085et A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public final float A0N;
    public final int A0O;
    public final Handler A0P;
    public final Handler A0Q;
    public final Handler A0R;
    public final AbstractC1450Mt A0S;
    public final C1456Na A0T;
    public final C2198gi A0U;
    public final VI A0V;
    public final AbstractC1733Yb A0W;
    public final LK A0X;
    public final InterfaceC1876bU A0Y;
    public final InterfaceC2018dm A0Z;
    public final C1245Eu A0a;
    public final C1235Ek A0b;
    public final C4L A0c;
    public final EA A0d;
    public final E8 A0e;
    public final E4 A0f;
    public final E2 A0g;
    public final E0 A0h;
    public final AbstractC1224Dz A0i;
    public final C1202Dd A0j;
    public final DZ A0k;
    public final Runnable A0l;
    public final boolean A0m;
    public final boolean A0n;

    public static String A0J(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0o, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 29);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0W() {
        A0o = new byte[]{33, 46, 43, 33, 41, 29, 49, 45, 55, 48, 33, 39, 58, 54, 52, 119, 63, 56, 58, 60, 59, 54, 54, 50, 119, 56, 61, 42, 119, 48, 55, 45, 60, 43, 42, 45, 48, 45, 48, 56, 53, 119, 58, 53, 48, 58, 50, 60, 61, 33, 54, 36, 50, 33, 55, 54, 55, 12, 37, 58, 55, 54, 60, 61, 59, 45, 58, 43, 36, 33, 43, 35, 23, 46, 33, 36, 60, 45, 58, 45, 44, 9};
    }

    static {
        A0W();
        A0q = (int) (XX.A02 * 4.0f);
        A0r = (int) (XX.A02 * 32.0f);
        A0s = P3.A02(-1, 77);
        A0t = (int) (XX.A02 * 26.0f);
        A0u = (int) (XX.A02 * 12.0f);
    }

    public AnonymousClass55(C2198gi c2198gi, VA va2, AbstractC1733Yb abstractC1733Yb, AbstractC2363jd abstractC2363jd, C1604Sx c1604Sx, ZU zu, int i10, InterfaceC1739Yh interfaceC1739Yh, VI vi2, int i11, boolean z10, boolean z11, InterfaceC2018dm interfaceC2018dm, int i12, int i13) {
        C1456Na c1456NaA00;
        super(c2198gi, zu, va2, abstractC2363jd, i10, z10, z11, interfaceC1739Yh, i13);
        this.A0H = false;
        this.A0G = false;
        this.A0F = false;
        this.A01 = 0;
        this.A0J = true;
        this.A0M = false;
        this.A0I = false;
        this.A0Q = new Handler(Looper.getMainLooper());
        this.A0l = new RunnableC2011df(this);
        this.A0E = false;
        this.A00 = 0.0f;
        this.A0B = true;
        this.A0C = false;
        this.A0K = false;
        this.A0R = new Handler(Looper.getMainLooper());
        this.A0h = new E0() { // from class: com.facebook.ads.redexgen.X.5D
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.UN
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(E1 e10) {
                if (!this.A00.A0M) {
                    this.A00.A0M = true;
                    this.A00.A0U.A0F().AKh(XL.A00((float) ((AbstractC1337Ij) this.A00).A06.A0k()), this.A00.getResources().getConfiguration().orientation, true, true, AbstractC1450Mt.A0A());
                    this.A00.A0X(this.A00.getResources().getConfiguration().orientation);
                    this.A00.A0X.setVisibility(0);
                    this.A00.A0X.A0u(this.A00.getResources().getConfiguration().orientation);
                    this.A00.A0X.bringToFront();
                    this.A00.A0V();
                }
            }
        };
        this.A0g = new E2() { // from class: com.facebook.ads.redexgen.X.5B
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.UN
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(E3 e10) {
                if (!((AbstractC1337Ij) this.A00).A0A.A07()) {
                    this.A00.A1F();
                }
            }
        };
        this.A0f = new E4() { // from class: com.facebook.ads.redexgen.X.59
            @Override // com.facebook.ads.redexgen.core.UN
            public final /* bridge */ /* synthetic */ void A03(UL ul2) {
            }
        };
        this.A0i = new AbstractC1224Dz() { // from class: com.facebook.ads.redexgen.X.58
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.UN
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C4A c4a) {
                this.A00.A0o(c4a);
                this.A00.A0Z.ADw((this.A00.A00 * this.A00.A0b.getDuration()) + c4a.A00());
            }
        };
        this.A0d = new EA() { // from class: com.facebook.ads.redexgen.X.57
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.UN
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C4K c4k) {
                this.A00.A0Z.ADc(this.A00.A0b.getDuration());
                AnonymousClass55.A01(this.A00, 1.0f);
                this.A00.A0b.A0e(EnumC2085et.A02, 28);
            }
        };
        this.A0e = new AnonymousClass56(this);
        this.A0Y = new HW(this);
        this.A0W = abstractC1733Yb;
        this.A0O = i12;
        this.A0P = new Handler(Looper.getMainLooper());
        this.A0S = C1451Mu.A01(c2198gi, va2, abstractC2363jd.A2E(), XB.A00(abstractC2363jd.A29().A0J().A05()), new HashMap(), false, true, abstractC2363jd.A2A());
        this.A0U = c2198gi;
        this.A0V = vi2;
        this.A0j = new C1202Dd(this.A0U, this.A0V);
        this.A0k = new DZ(this.A0U, i12);
        this.A0Z = interfaceC2018dm;
        if (i11 == 1) {
            c1456NaA00 = super.A06.A28().A01();
        } else {
            c1456NaA00 = super.A06.A28().A00();
        }
        this.A0T = c1456NaA00;
        AbstractC1899br.A00(this.A0U, this, abstractC2363jd.A29().A0H().A08());
        this.A0b = new C1235Ek(this.A0U);
        this.A0b.getEventBus().A03(this.A0h, this.A0g, this.A0f, this.A0i, this.A0d, this.A0e);
        this.A0c = new C4L(c2198gi, va2, this.A0b, abstractC2363jd.A2E());
        A0U();
        String videoUrl = super.A06.A29().A0H().A09();
        this.A0b.setVideoURI(c1604Sx.A0T(videoUrl));
        this.A0N = (float) abstractC2363jd.A0k();
        A0Q();
        A0M();
        A0L();
        this.A0X = A0D();
        addView(this.A0X);
        YB.A0K(this.A0X);
        A0T();
        A0R();
        A0S();
        this.A0X.getProgressBarAnimation().setShouldClearAnimationWhenVideoCompleted(false);
        if (C1648Up.A1z(this.A0U)) {
            VM vmA0B = this.A0U.A0B();
            C1235Ek c1235Ek = this.A0b;
            String videoUrl2 = super.A06.A2E();
            vmA0B.AKn(c1235Ek, videoUrl2, true);
        }
        if (C1648Up.A20(this.A0U)) {
            this.A0a = new C1245Eu(this.A0U, va2, this.A0b, super.A06.A2E(), false, this.A0c, null);
        } else {
            this.A0a = null;
        }
        A0d(abstractC2363jd.A29());
        this.A0m = super.A06.A1m();
        this.A0n = super.A06.A1z();
        A0P();
        c2198gi.A0F().ACI(this.A0m, this.A0n, true);
        this.A0j.bringToFront();
    }

    public static /* synthetic */ float A01(AnonymousClass55 anonymousClass55, float f10) {
        float f11 = anonymousClass55.A00 + f10;
        anonymousClass55.A00 = f11;
        return f11;
    }

    public static /* synthetic */ int A03(AnonymousClass55 anonymousClass55) {
        int i10 = anonymousClass55.A01;
        anonymousClass55.A01 = i10 + 1;
        return i10;
    }

    private LK A0D() {
        String strA0J;
        if (super.A06.A10().equals(A0J(49, 14, 78))) {
            strA0J = EnumC2091ez.A04.A03();
        } else {
            strA0J = A0J(12, 37, 68);
        }
        LK lkA03 = new C1900bs(this.A0N, strA0J, this.A0U, getColors(), super.A06, super.A0B, this.A08, AbstractC1337Ij.A0G, false, super.A08, super.A0D, super.A0A, this.A0k, this.A0V, true).A03();
        RelativeLayout.LayoutParams adDetailsParams = new RelativeLayout.LayoutParams(-1, -1);
        adDetailsParams.addRule(12);
        lkA03.setVisibility(8);
        lkA03.setChainedAdInfo(super.A00);
        lkA03.setLayoutParams(adDetailsParams);
        return lkA03;
    }

    private void A0K() {
        this.A09 = new C1927cJ(this.A0U, super.A06, this.A0V, this.A0Q, super.A0B);
        this.A09.A0I(false);
        addView(this.A09.A0C(getRegularCtaForEndCard()));
    }

    private void A0L() {
        this.A0k.A08(-1, A0s, false);
        this.A0k.setPadding(A0u, A0u, A0u, A0u);
    }

    private void A0M() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(A0r, A0r);
        layoutParams.setMargins(XV.A0b, XV.A0r, XV.A0b, XV.A0Z);
        layoutParams.addRule(9);
        layoutParams.addRule(10);
        ViewGroup.LayoutParams videoViewParams = new RelativeLayout.LayoutParams(-1, -1);
        addView(this.A0b, videoViewParams);
        addView(this.A0j, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0N() {
        if (super.A06.A1e() && this.A0E) {
            this.A0E = false;
            A0q(A0J(63, 18, 85));
        }
    }

    private void A0O() {
        if (super.A06.A1e() && this.A0E) {
            this.A0E = false;
            Map<String, String> mapA05 = new C1855b9().A03(null).A02(null).A05();
            mapA05.put(A0J(0, 12, 95), A0J(63, 18, 85));
            super.A08.AB6(super.A06.A2E(), mapA05);
        }
    }

    private void A0P() {
        if (!super.A06.A29().A0K().A04()) {
            return;
        }
        this.A02 = new ImageView(this.A0U);
        addView(this.A02);
        this.A02.setVisibility(4);
        new LM(this.A02, this.A0U).A04().A06(new C1304Hc(this)).A07(super.A06.A29().A0H().A08());
    }

    private void A0Q() {
        postDelayed(new C1315Hn(this), C1648Up.A0P(this.A0U));
    }

    private void A0R() {
        YB.A0J(this.A03);
        this.A03 = new LinearLayout(this.A0U);
        this.A03.setOrientation(1);
        YB.A0K(this.A03);
        this.A03.setBackgroundColor(-1);
        addView(this.A03);
    }

    private void A0S() {
        if (super.A06.A1X() && this.A0S != null && XL.A03(this.A0N)) {
            this.A07 = new C1875bT(this.A0U, super.A0B, super.A06.A0l(), this.A0S, this.A0X.getCTAButton(), this.A0X);
            addView(this.A07.getBrowserPeekView());
            this.A0R.postDelayed(new RunnableC2008dc(this), 5900L);
        }
    }

    private void A0T() {
        if (super.A06.A1e()) {
            this.A0b.setOnClickListener(new ViewOnClickListenerC2014di(this));
        }
        YB.A0J(this.A0b);
        YB.A0K(this.A0b);
        addView(this.A0b, new RelativeLayout.LayoutParams(-1, -2));
        this.A08 = new ViewOnClickListenerC1396Kr(this.A0U, super.A06, this.A0T, super.A08, super.A0B, super.A0D, super.A0A, (InterfaceC1713Xh) null);
        YB.A0G(1001, this.A08);
        if (C1648Up.A17(this.A0U)) {
            View.OnClickListener onClickListener = new ViewOnClickListenerC2006da(this);
            this.A0X.setCTAClickListener(onClickListener);
            if (this.A0W != null) {
                View.OnClickListener onClickListener2 = new ViewOnClickListenerC2007db(this);
                this.A0W.setCTAClickListener(onClickListener2);
            }
        }
    }

    private void A0U() {
        this.A0b.A0f(this.A0k);
        this.A0b.A0f(this.A0j);
        if (!TextUtils.isEmpty(super.A06.A29().A0H().A08())) {
            C3S c3s = new C3S(this.A0U, true);
            this.A0b.A0f(c3s);
            c3s.setImage(super.A06.A29().A0H().A08());
        }
        this.A0b.A0f(new C3B(this.A0U));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0V() {
        int duration = this.A0b.getDuration();
        int videoDuration = this.A0k.getCustomDuration();
        if (videoDuration > duration) {
            this.A0k.setCustomDuration(duration);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0X(int i10) {
        if (!this.A0M) {
            return;
        }
        C1235Ek c1235Ek = this.A0b;
        RelativeLayout adjacentView = (RelativeLayout) this.A0b.getVideoView();
        this.A0b.A0Z(i10);
        A0Z(i10, c1235Ek, adjacentView);
    }

    private void A0Y(int i10) {
        if (this.A0j != null) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.A0j.getLayoutParams();
            layoutParams.setMargins(XV.A09, i10, XV.A09, XV.A05);
            this.A0j.setLayoutParams(layoutParams);
        }
    }

    private void A0Z(int i10, ViewGroup viewGroup, RelativeLayout relativeLayout) {
        if (relativeLayout == null) {
            return;
        }
        YB.A0J(this.A0X);
        if ((this.A0X instanceof C6V) || (this.A0X instanceof C6U)) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            if (getResources().getConfiguration().orientation == 2) {
                layoutParams.addRule(1, relativeLayout.getId());
                this.A0X.setLayoutParams(layoutParams);
                viewGroup.addView(this.A0X);
            } else {
                View view = this.A0X;
                String[] strArr = A0p;
                if (strArr[1].charAt(10) != strArr[2].charAt(10)) {
                    throw new RuntimeException();
                }
                A0p[4] = "hNSRRdlixh2gw3rjMoVJbJnBOeMmg8Zc";
                addView(view, layoutParams);
            }
        } else if (this.A0X instanceof C6T) {
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams2.addRule(12);
            this.A0X.setLayoutParams(layoutParams2);
            addView(this.A0X, layoutParams2);
        }
        this.A0X.A0l(i10);
        this.A0X.A0y(viewGroup, relativeLayout, i10);
    }

    private void A0a(ViewGroup viewGroup, View view, int i10) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) viewGroup.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) view.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = -1;
        if (i10 == 1) {
            layoutParams2.width = -1;
            layoutParams2.height = -2;
        } else {
            layoutParams2.width = -2;
            layoutParams2.height = -1;
        }
        layoutParams2.removeRule(14);
        viewGroup.setLayoutParams(layoutParams);
        view.setLayoutParams(layoutParams2);
        A0X(i10);
    }

    private void A0b(ViewGroup viewGroup, View view, AbstractC1733Yb abstractC1733Yb, int i10) {
        YB.A0d(this.A03);
        YB.A0J(abstractC1733Yb);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, abstractC1733Yb.getToolbarHeight());
        layoutParams.addRule(10);
        layoutParams.setMargins(XV.A0u, XV.A0r, 0, 0);
        RelativeLayout.LayoutParams parentLayoutParam = (RelativeLayout.LayoutParams) viewGroup.getLayoutParams();
        RelativeLayout.LayoutParams toolbarParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
        parentLayoutParam.width = -1;
        parentLayoutParam.height = -1;
        if (i10 == 1) {
            toolbarParams.width = -1;
            toolbarParams.height = -2;
        } else {
            toolbarParams.width = -2;
            toolbarParams.height = -1;
        }
        toolbarParams.removeRule(14);
        viewGroup.setLayoutParams(parentLayoutParam);
        view.setLayoutParams(toolbarParams);
        this.A0X.A0z(viewGroup, false, false, this.A03.getId());
        A0X(i10);
        viewGroup.addView(abstractC1733Yb, layoutParams);
    }

    private void A0c(ViewGroup viewGroup, View view, AbstractC1733Yb abstractC1733Yb, int i10) {
        YB.A0J(this.A03);
        YB.A0J(abstractC1733Yb);
        YB.A0J(this.A0X);
        boolean zA05 = XL.A05(this.A0N);
        boolean isBrowserBelowMediaView = i10 == 1;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(10);
        if (!super.A06.A2U() || i10 != 2 || !zA05) {
            A0Y(XV.A0N);
            layoutParams.setMargins(XV.A0T, XV.A0N, 0, 0);
        } else {
            layoutParams.setMargins(XV.A0T, XV.A0B, 0, 0);
            A0Y(XV.A0B);
        }
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) viewGroup.getLayoutParams();
        RelativeLayout.LayoutParams browserLayoutParam = (RelativeLayout.LayoutParams) view.getLayoutParams();
        browserLayoutParam.removeRule(14);
        browserLayoutParam.removeRule(9);
        RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.A03.getLayoutParams();
        layoutParams3.removeRule(3);
        layoutParams3.removeRule(1);
        boolean z10 = isBrowserBelowMediaView || zA05;
        if (z10) {
            layoutParams2.height = getHeightPixels() / 4;
            browserLayoutParam.height = getHeightPixels() / 4;
            if (A0p[5].charAt(30) != '1') {
                throw new RuntimeException();
            }
            String[] strArr = A0p;
            strArr[1] = "aNPRQigyxlriqHgRS6C1obCW9NP8FFpI";
            strArr[2] = "RUJfPTyX2Zr9a7jBp48wtOZ1EckF1HKn";
            browserLayoutParam.addRule(14);
            layoutParams3.addRule(3, viewGroup.getId());
        } else {
            this.A0b.A0Z(i10);
            layoutParams2.height = -1;
            browserLayoutParam.height = -1;
            browserLayoutParam.addRule(9);
            layoutParams3.addRule(1, view.getId());
        }
        layoutParams2.addRule(9);
        layoutParams2.addRule(10);
        viewGroup.setLayoutParams(layoutParams2);
        browserLayoutParam.width = -2;
        view.setLayoutParams(browserLayoutParam);
        layoutParams3.width = -1;
        layoutParams3.height = -1;
        layoutParams3.setMargins(0, 0, 0, 0);
        this.A03.setLayoutParams(layoutParams3);
        if (z10) {
            addView(this.A03);
            addView(abstractC1733Yb, layoutParams);
        } else {
            viewGroup.addView(this.A03);
            layoutParams.addRule(0, this.A03.getId());
            viewGroup.addView(abstractC1733Yb, layoutParams);
        }
        this.A0X.A0z(viewGroup, true, zA05, this.A03.getId());
    }

    private void A0d(NR nr) {
        this.A0X.setInfo(nr.A0I(), nr.A0J(), super.A06.A2E(), super.A06.A2C().A01(), null, this.A0Y);
        this.A0X.getCTAButton().setIsInAppBrowser(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0o(C4A c4a) {
        if (this.A0b.getState() == EnumC2140fm.A02 && C1648Up.A1e(this.A0U)) {
            postDelayed(new C1314Hm(this, c4a), 5000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0p(String str) {
        M3 m10;
        YB.A0J(this.A06);
        C1319Hr c1319Hr = new C1319Hr(this);
        if (this.A0U.A0E() == null) {
            this.A0U.A0F().A9v();
        }
        if (this.A07 != null) {
            this.A07.A0B();
            this.A07 = null;
        }
        if (AbstractC1649Uq.A02(this.A0U) || this.A0U.A0E() == null) {
            m10 = new M3(this.A0U, c1319Hr);
        } else {
            m10 = new M3(this.A0U, this.A0U.A0E(), c1319Hr);
        }
        this.A06 = m10;
        setUpBrowserControls(this.A06);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        layoutParams.weight = 0.9f;
        this.A03.addView(this.A06, layoutParams);
        this.A06.loadUrl(str);
    }

    private void A0q(String str) {
        Map<String, String> mapA05 = new C1855b9().A03(null).A02(null).A05();
        mapA05.put(A0J(0, 12, 95), str);
        this.A0V.A04(VH.A0J, mapA05);
        super.A0B.A4j(super.A06.A0w());
        super.A08.ABM(super.A06.A2E(), mapA05);
        if (C1648Up.A2U(this.A0U)) {
            HashMap map = new HashMap();
            map.put(AbstractC2402kH.A04, Boolean.TRUE.toString());
            map.put(AbstractC2402kH.A05, Boolean.TRUE.toString());
            map.put(AbstractC2402kH.A06, Boolean.TRUE.toString());
            super.A08.ABn(super.A06.A2E(), map);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0r(String str) {
        if (super.A06.A25() > 0) {
            if (super.A06.A2O() && this.A0F) {
                return;
            }
            this.A0F = true;
            A0q(str);
            return;
        }
        if (super.A06.A1d()) {
            A0N();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0s(String str) {
        if (!this.A0K) {
            this.A0K = true;
            this.A0Z.AGQ(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0t(String str) {
        if (!this.A0D) {
            this.A0X.getCTAButton().A0E(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0u(boolean z10) {
        if (!z10 && this.A0m) {
            return;
        }
        this.A0D = z10;
        if (z10) {
            this.A01 = 0;
            this.A0G = false;
            this.A0F = false;
        } else {
            this.A0P.removeCallbacksAndMessages(null);
        }
        LinearLayout linearLayout = this.A03;
        float y10 = this.A03.getY();
        float heightPixels = getHeightPixels();
        if (z10) {
            heightPixels /= 4.0f;
        }
        String strA0J = A0J(81, 1, 109);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(linearLayout, strA0J, y10, heightPixels);
        objectAnimatorOfFloat.setDuration(500L);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.A0b, strA0J, this.A0b.getY(), 0.0f);
        objectAnimatorOfFloat2.setDuration(500L);
        int height = this.A0b.getHeight();
        int heightPixels2 = getHeightPixels();
        if (z10) {
            heightPixels2 /= 4;
        }
        ValueAnimator duration = ValueAnimator.ofInt(height, heightPixels2).setDuration(500L);
        duration.addUpdateListener(new C2009dd(this));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, duration);
        animatorSet.addListener(new C2010de(this, z10));
        if (this.A0n) {
            this.A0b.A0c(animatorSet, z10);
        }
        A0w(this.A0D, true);
        if (!z10 && this.A06 != null) {
            this.A06.destroy();
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0056  */
    private void A0v(boolean z10, int i10) {
        this.A0U.A0F().ACG(!z10, i10);
        if (this.A04 != null) {
            boolean z11 = this.A0m;
            int i11 = 4;
            String[] strArr = A0p;
            if (strArr[1].charAt(10) != strArr[2].charAt(10)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0p;
            strArr2[6] = "EaXPQIkUGhcx1dZHr3fchF7eoR8nmh6r";
            strArr2[7] = "BoqCm6Atk4DXyXzUZY25jylGRvSX4IAb";
            if (z11) {
                this.A04.setCloseButtonVisibility(4);
                return;
            }
            M8 m10 = this.A04;
            String[] strArr3 = A0p;
            if (strArr3[3].length() == strArr3[0].length()) {
                String[] strArr4 = A0p;
                strArr4[3] = "X7";
                strArr4[0] = "zP";
                if (z10) {
                    i11 = 0;
                }
            } else if (z10) {
                i11 = 0;
            }
            m10.setCloseButtonVisibility(i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0w(boolean z10, boolean z11) {
        if (!this.A0M) {
            return;
        }
        int i10 = getResources().getConfiguration().orientation;
        if (z10) {
            A0c(this.A0b, this.A0b.getVideoView(), this.A0W, i10);
            return;
        }
        if (z11) {
            C1235Ek c1235Ek = this.A0b;
            C1235Ek c1235Ek2 = this.A0b;
            String[] strArr = A0p;
            String str = strArr[6];
            String str2 = strArr[7];
            int iCharAt = str.charAt(0);
            int orientation = str2.charAt(0);
            if (iCharAt == orientation) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0p;
            strArr2[6] = "obEiGvqtCCvFNuJUlwIyPJMxkodqaQ5K";
            strArr2[7] = "nJocAzrRDHwRQikLytOPP2BE8QGdYkmy";
            A0b(c1235Ek, c1235Ek2.getVideoView(), this.A0W, i10);
            return;
        }
        A0a(this.A0b, this.A0b.getVideoView(), i10);
    }

    private final boolean A0x() {
        return this.A0D;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1337Ij
    public final EnumC1447Mq A1D(String str) {
        if (!A0x()) {
            if (this.A09 != null) {
                return this.A09.A0E().A0E(str);
            }
            return this.A0X.getCTAButton().A0E(str);
        }
        return EnumC1447Mq.A09;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1337Ij
    public final void A1E() {
        A0O();
        this.A0X.A0j();
        this.A0R.removeCallbacksAndMessages(null);
        if (this.A09 != null) {
            this.A09.A0F();
        }
        this.A0Q.removeCallbacksAndMessages(null);
        if (C1648Up.A1z(this.A0U)) {
            this.A0U.A0B().AKU(this.A0b);
        }
        if (this.A0a != null) {
            this.A0a.A07();
        }
        C1875bT c1875bT = this.A07;
        String[] strArr = A0p;
        if (strArr[1].charAt(10) != strArr[2].charAt(10)) {
            throw new RuntimeException();
        }
        A0p[4] = "zZx5K1WC5ur1IIrcKdsfSp5hTLdY49e9";
        if (c1875bT != null) {
            this.A07.A0B();
            this.A07 = null;
        }
        if (this.A0b != null) {
            this.A0b.getEventBus().A04(this.A0h, this.A0g, this.A0f, this.A0i, this.A0d, this.A0e);
            YB.A0H(this.A0b);
            this.A0b.A0W();
        }
        this.A0c.A0p();
        YB.A0d(this.A0b, this.A0k, this.A0j);
        super.A0D.A0V();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1337Ij
    public final void A1G() {
        this.A0I = true;
        this.A0X.A0o();
        YB.A0d(this.A0b, this.A0X, this.A0k, this.A04, this.A0j, this.A03, this.A0W);
        if (this.A07 != null) {
            this.A07.A0B();
        }
        YB.A0W(this);
        if (this.A02 != null) {
            this.A02.setVisibility(0);
        }
        A0K();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(10);
        layoutParams.setMargins(XV.A0u, XV.A0r, 0, 0);
        addView(this.A0W, layoutParams);
        this.A0W.bringToFront();
        this.A0B = true;
        this.A0Z.AFw(true);
        if (this.A0W != null && getAdDataBundle().A29().A0K().A00() > 0) {
            this.A0B = false;
            if (getAdDataBundle().A2P()) {
                this.A0W.setToolbarActionMode(8);
            } else {
                this.A0W.setToolbarActionMode(2);
            }
            new Handler(Looper.getMainLooper()).postDelayed(new RunnableC2012dg(this), getAdDataBundle().A29().A0K().A00());
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1337Ij
    public final void A1H() {
        C1235Ek c1235Ek = this.A0b;
        int secondsForNextCta = super.A06.A29().A0H().A0A() ? 0 : 1065353216;
        c1235Ek.setVolume(secondsForNextCta);
        this.A0b.A0e(EnumC2085et.A02, 20);
        int iA02 = super.A06.A29().A0H().A02();
        if (iA02 != 0) {
            int secondsForNextCta2 = this.A0O;
            if (iA02 < secondsForNextCta2) {
                if (iA02 <= 0) {
                    return;
                }
                this.A0W.setProgressSpinnerInvisible(true);
                new XO(iA02, new C1317Hp(this)).A07();
                return;
            }
        }
        this.A0W.setToolbarActionMode(8);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1337Ij
    public final void A1I(boolean z10) {
        this.A0J = z10;
        A0v(z10, 4);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x006f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0080  */
    /* JADX WARN: Code duplicated, block: B:30:0x0095  */
    @Override // com.facebook.ads.redexgen.core.AbstractC1337Ij
    public final void A1J(boolean z10) {
        C1875bT c1875bT;
        if (!this.A0C) {
            this.A0X.A0m(z10);
        }
        if (this.A09 != null) {
            boolean z11 = this.A0C;
            String[] strArr = A0p;
            if (strArr[1].charAt(10) != strArr[2].charAt(10)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0p;
            strArr2[1] = "0qZcOgUU1tryulZiP6XyTUbAv74itU8r";
            strArr2[2] = "FbQDSrVtnmrn6n1tCiGdEtRCABZgMVu6";
            if (!z11) {
                this.A09.A0H(z10);
            }
        }
        this.A0C = false;
        if (this.A0b.A0n()) {
            return;
        }
        if (this.A07 != null) {
            int i10 = getResources().getConfiguration().orientation;
            if (A0p[5].charAt(30) != '1') {
                A0p[5] = "NO4KYfXMvMpDq3TiuILiTAIZZLlPHE1o";
                if (i10 == 1) {
                    c1875bT = this.A07;
                    if (A0p[4].charAt(14) != 'r') {
                        throw new RuntimeException();
                    }
                    A0p[5] = "A4MeJOKX43Wbu7wDNPQrh0qwNu1xfN10";
                    c1875bT.A0C();
                }
            } else {
                String[] strArr3 = A0p;
                strArr3[1] = "uxhOTaOwbBr7x682JVxutMugyCdaSc2z";
                strArr3[2] = "WtxTL59IucrgXt9Ertpm7Y8tzE2Zsttw";
                if (i10 == 1) {
                    c1875bT = this.A07;
                    if (A0p[4].charAt(14) != 'r') {
                        throw new RuntimeException();
                    }
                    A0p[5] = "A4MeJOKX43Wbu7wDNPQrh0qwNu1xfN10";
                    c1875bT.A0C();
                }
            }
        }
        this.A0A = this.A0b.getVideoStartReason();
        this.A0L = z10;
        this.A0b.A0i(false, 13);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1337Ij
    public final void A1K(boolean z10) {
        if (this.A0b.getState() == EnumC2140fm.A06 || this.A0A == null) {
            return;
        }
        if (!this.A0L || z10) {
            C1235Ek c1235Ek = this.A0b;
            EnumC2085et enumC2085et = this.A0A;
            String[] strArr = A0p;
            if (strArr[3].length() != strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0p;
            strArr2[1] = "9WZdaf1ZSKrkBdUpSM4gGNVox8spVJjj";
            strArr2[2] = "I46V5u0Uk9rGg82Mpkl9CB9pMmc46Jha";
            c1235Ek.A0e(enumC2085et, 19);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1337Ij
    public final boolean A1L() {
        if (super.A06.A29().A0V() && super.A06.A29().A0K().A04()) {
            boolean z10 = this.A0I;
            if (A0p[4].charAt(14) != 'r') {
                throw new RuntimeException();
            }
            String[] strArr = A0p;
            strArr[1] = "C2SzQuWg94rP8CljhRH7nkSf4iQhtgDx";
            strArr[2] = "CARYfrdNq1rie86wRQdSwAxjb6sfTLqG";
            if (!z10) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1337Ij
    public final boolean A1M() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1337Ij
    public final boolean A1N() {
        return this.A0B;
    }

    public final boolean A1O() {
        return !A0x();
    }

    public C1456Na getColors() {
        return this.A0T;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1337Ij
    public C2016dk getFullScreenAdStyle() {
        return new C2016dk(true, C2016dk.A06, super.A06.A28().A01(), ViewOnClickListenerC1396Kr.A05(super.A06), super.A06.A28().A01().A08(true), super.A06.A29().A0H().A08());
    }

    private int getHeightPixels() {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        return displayMetrics.heightPixels;
    }

    private ViewOnClickListenerC1396Kr getRegularCtaForEndCard() {
        ViewOnClickListenerC1396Kr viewOnClickListenerC1396Kr = new ViewOnClickListenerC1396Kr(this.A0U, super.A06.A0w(), super.A06.A28().A01(), super.A08, super.A0B, (C2143fp) null, super.A0A, super.A06.A2A());
        viewOnClickListenerC1396Kr.setViewShowsOverMedia(true);
        YB.A0K(viewOnClickListenerC1396Kr);
        viewOnClickListenerC1396Kr.setText(super.A06.A29().A0J().A04());
        YB.A0G(1001, viewOnClickListenerC1396Kr);
        viewOnClickListenerC1396Kr.setCta(super.A06.A29().A0J(), super.A06.A2E(), new HashMap(), null);
        return viewOnClickListenerC1396Kr;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1337Ij, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.A0I) {
            return;
        }
        A0X(configuration.orientation);
        A0w(this.A0D, false);
        if (this.A07 != null) {
            this.A07.A0D(configuration.orientation);
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        if (z10) {
            A1K(false);
        } else {
            this.A0C = true;
            A1J(false);
        }
    }

    private void setUpBrowserControls(M3 m10) {
        if (this.A04 != null) {
            YB.A0J(this.A04);
        }
        this.A04 = new M8(this.A0U, m10, true);
        if (this.A0m) {
            A0v(this.A0J, 1);
        }
        m10.setBrowserNavigationListener(this.A04.getBrowserNavigationListener());
        YB.A0K(this.A04);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(XV.A0v, XV.A0v, XV.A0v, XV.A0v);
        this.A04.setListener(new C1318Hq(this));
        this.A03.addView(this.A04, layoutParams);
        if (this.A05 != null) {
            YB.A0J(this.A05);
        }
        this.A05 = new C1827ah(this.A0U, null, R.attr.progressBarStyleHorizontal);
        this.A03.addView(this.A05, new LinearLayout.LayoutParams(-1, A0q));
    }
}
