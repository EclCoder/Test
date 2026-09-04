package com.facebook.ads.redexgen.core;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class M8 extends LinearLayout implements InterfaceC1841av {
    public static byte[] A0C;
    public static String[] A0D = {"gmSbsJUTV6ssYU6sPFdQApLIq3Ne91IM", "MfGeHL5PmkPbpLjQYYWOTSdzt", "", "SJThwTW85f7z2tdQDzwWLTm6w", "rQXooJE", "LhKJvtc1UCCcm5M0SWMNGP7YHUEfZfxE", "", "2Oh5HyK"};
    public static final int A0E;
    public static final int A0F;
    public static final int A0G;
    public static final Uri A0H;
    public static final View.OnTouchListener A0I;
    public ImageView A00;
    public ImageView A01;
    public ImageView A02;
    public ImageView A03;
    public C1832am A04;
    public InterfaceC1840au A05;
    public String A06;
    public final WebView A07;
    public final C2198gi A08;
    public final InterfaceC1837ar A09;
    public final boolean A0A;
    public final boolean A0B;

    public static String A06(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0C, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 93);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0A() {
        byte[] bArr = {-43, -12, -10, -2, -68, -27, -24, -20, -34, 0, 41, 44, 49, 27, 44, 30, 23, 56, 45, 54, -24, 54, 41, 60, 49, 62, 45, -24, 42, 58, 55, 63, 59, 45, 58, 41, 42, 55, 61, 60, 2, 42, 52, 41, 54, 51, 55, 68, 58, 72, 69, 63, 58, 4, 63, 68, 74, 59, 68, 74, 4, 55, 57, 74, 63, 69, 68, 4, 44, 31, 27, 45, -29, -17, -19, -82, -31, -18, -28, -14, -17, -23, -28, -82, -29, -24, -14, -17, -19, -27, 59, 71, 71, 67, 13, 2, 2, 74, 74, 74, 1, 57, 52, 54, 56, 53, 66, 66, 62, 1, 54, 66, 64};
        String[] strArr = A0D;
        if (strArr[2].length() != strArr[6].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0D;
        strArr2[7] = "Ujyw6mT";
        strArr2[4] = "Vqhraj8";
        A0C = bArr;
    }

    static {
        A0A();
        A0F = Color.rgb(224, 224, 224);
        A0G = Color.argb(34, 0, 0, 0);
        A0E = XV.A0k;
        A0H = XB.A00(A06(90, 23, Sdk$SDKError.b.PROTOBUF_SERIALIZATION_ERROR_VALUE));
        A0I = new ViewOnTouchListenerC1817aX();
    }

    public M8(C2198gi c2198gi, WebView webView, boolean z10) {
        super(c2198gi);
        this.A09 = new M9(this);
        this.A07 = webView;
        this.A08 = c2198gi;
        this.A0A = AbstractC1649Uq.A06(c2198gi);
        this.A0B = z10;
        A08();
        A0C(false);
    }

    private void A08() {
        float f10;
        YB.A0N(this, -1);
        setGravity(16);
        this.A01 = new ImageView(this.A08);
        this.A01.setContentDescription(A06(4, 5, 28));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(A0E, A0E);
        layoutParams.setMargins(0, 0, XV.A0b, 0);
        this.A01.setScaleType(ImageView.ScaleType.CENTER);
        this.A01.setImageBitmap(YN.A01(YM.BROWSER_CLOSE));
        this.A01.setOnTouchListener(A0I);
        this.A01.setOnClickListener(new ViewOnClickListenerC1818aY(this));
        addView(this.A01, layoutParams);
        if (this.A0A && !C1648Up.A2w(this.A08)) {
            this.A00 = new ImageView(this.A08);
            this.A00.setEnabled(false);
            this.A00.setAlpha(0.3f);
            this.A00.setContentDescription(A06(0, 4, 54));
            ViewGroup.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(A0E, A0E);
            this.A00.setScaleType(ImageView.ScaleType.CENTER);
            this.A00.setImageBitmap(YN.A01(YM.BACK_ARROW_V2));
            this.A00.setOnTouchListener(A0I);
            this.A00.setOnClickListener(new ViewOnClickListenerC1819aZ(this));
            addView(this.A00, layoutParams2);
        }
        this.A04 = new C1832am(this.A08);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, -2);
        if (this.A0A || C1648Up.A2w(this.A08)) {
            f10 = 0.5f;
        } else {
            f10 = 1.0f;
        }
        layoutParams3.weight = f10;
        this.A04.setGravity(17);
        if (C1648Up.A2w(this.A08) && !this.A0B) {
            LinearLayout linearLayout = new LinearLayout(this.A08);
            linearLayout.setOrientation(1);
            addView(linearLayout, layoutParams3);
            YB.A0K(linearLayout);
            ImageView imageView = new ImageView(this.A08);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageBitmap(YN.A01(YM.HANDLER));
            linearLayout.addView(imageView, new LinearLayout.LayoutParams(-1, -2));
            LinearLayout.LayoutParams closeButtonParams = new LinearLayout.LayoutParams(-1, -2);
            linearLayout.addView(this.A04, closeButtonParams);
        } else {
            addView(this.A04, layoutParams3);
        }
        if (this.A0A && !C1648Up.A2w(this.A08)) {
            this.A02 = new ImageView(this.A08);
            this.A02.setEnabled(false);
            this.A02.setAlpha(0.3f);
            this.A02.setContentDescription(A06(9, 7, 93));
            ViewGroup.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(A0E, A0E);
            this.A02.setScaleType(ImageView.ScaleType.CENTER);
            this.A02.setImageBitmap(YN.A02(YM.BACK_ARROW_V2));
            this.A02.setOnTouchListener(A0I);
            this.A02.setOnClickListener(new ViewOnClickListenerC1820aa(this));
            addView(this.A02, layoutParams4);
        }
        this.A03 = new ImageView(this.A08);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(A0E, A0E);
        layoutParams5.setMargins(XV.A0b, 0, 0, 0);
        this.A03.setContentDescription(A06(16, 19, 107));
        this.A03.setScaleType(ImageView.ScaleType.CENTER);
        this.A03.setOnTouchListener(A0I);
        this.A03.setOnClickListener(new ViewOnClickListenerC1821ab(this));
        addView(this.A03, layoutParams5);
        A09();
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0073  */
    /* JADX WARN: Code duplicated, block: B:22:0x007d  */
    /* JADX WARN: Code duplicated, block: B:24:0x0097  */
    private void A09() {
        PackageManager packageManager;
        Bitmap externalBrowserBitmap = null;
        boolean zA0k = C1648Up.A0k(this.A08);
        if (!zA0k && (packageManager = this.A08.getPackageManager()) != null) {
            List<ResolveInfo> infos = packageManager.queryIntentActivities(new Intent(A06(46, 26, Sdk$SDKError.b.TPAT_ERROR_VALUE), A0H), C.DEFAULT_BUFFER_SEGMENT_SIZE);
            if (infos.isEmpty()) {
                this.A03.setVisibility(8);
            } else {
                int size = infos.size();
                String[] strArr = A0D;
                if (strArr[7].length() == strArr[4].length()) {
                    A0D[0] = "OiPmrAn3GllLAwonlzrco6n6FhbN6530";
                    if (size == 1) {
                        if (infos.get(0).activityInfo != null) {
                            if (A06(72, 18, 35).equals(infos.get(0).activityInfo.packageName)) {
                                externalBrowserBitmap = YN.A01(YM.BROWSER_LAUNCH_CHROME);
                            }
                        }
                    }
                } else if (size == 1) {
                    if (infos.get(0).activityInfo != null) {
                        if (A06(72, 18, 35).equals(infos.get(0).activityInfo.packageName)) {
                            externalBrowserBitmap = YN.A01(YM.BROWSER_LAUNCH_CHROME);
                        }
                    }
                }
                externalBrowserBitmap = getExternalBrowserBitmap();
            }
        }
        if (C1648Up.A2w(this.A08) || zA0k) {
            ImageView imageView = this.A03;
            String[] strArr2 = A0D;
            if (strArr2[2].length() != strArr2[6].length()) {
                throw new RuntimeException();
            }
            A0D[0] = "H3zrzdIXpl7cuf9737Dh0UcXPx3q90pI";
            imageView.setVisibility(0);
            externalBrowserBitmap = getExternalBrowserBitmap();
        }
        this.A03.setImageBitmap(externalBrowserBitmap);
        String[] strArr3 = A0D;
        if (strArr3[2].length() != strArr3[6].length()) {
            throw new RuntimeException();
        }
        A0D[5] = "C5b1pkMeIVGGxpo7XcAe9IGkuMZh8kn1";
    }

    private void A0C(boolean z10) {
        int i10 = z10 ? 0 : 8;
        if (this.A00 != null) {
            this.A00.setVisibility(i10);
        }
        if (this.A02 != null) {
            this.A02.setVisibility(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0D(boolean z10) {
        if (z10) {
            A0C(true);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1841av
    public InterfaceC1837ar getBrowserNavigationListener() {
        return this.A09;
    }

    public static Bitmap getExternalBrowserBitmap() {
        YM ym2 = YM.BROWSER_LAUNCH_NATIVE_V2;
        if (A0D[0].charAt(23) == 'K') {
            throw new RuntimeException();
        }
        A0D[0] = "lUY1mRDCMXM3WZHcFiHRXNaY27JpPEEp";
        return YN.A01(ym2);
    }

    public void setCloseButtonVisibility(int i10) {
        this.A01.setVisibility(i10);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1841av
    public void setListener(InterfaceC1840au interfaceC1840au) {
        this.A05 = interfaceC1840au;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1841av
    public void setTitle(String str) {
        this.A04.setTitle(str);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1841av
    public void setUrl(String str) {
        this.A06 = str;
        if (!TextUtils.isEmpty(this.A06)) {
            String strA06 = A06(35, 11, 107);
            if (A0D[0].charAt(23) == 'K') {
                throw new RuntimeException();
            }
            A0D[0] = "qQ1cUQL6zuFcmcs6RwakvLgHhcCBx0UL";
            if (!strA06.equals(this.A06)) {
                this.A04.setSubtitle(this.A06);
                this.A03.setEnabled(true);
                this.A03.setColorFilter((ColorFilter) null);
                return;
            }
        }
        this.A04.setSubtitle(null);
        this.A03.setEnabled(false);
        this.A03.setColorFilter(new PorterDuffColorFilter(A0F, PorterDuff.Mode.SRC_IN));
    }
}
