package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebSettings;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.eI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2049eI extends FrameLayout {
    public static byte[] A0C;
    public static String[] A0D = {"5vYLtEaU9MAxDoI06TlJjFfWs8tiaGj", "TX23sib3Tj6X7eJy5cgYAILp0vVPLOiW", "Lxz50jZMaNdiu", "yIxUapHBf", "xsW4qvb7U5EMj5cNQbMl14i5qh6u6uOh", "8XLPt3rjq6gnj0Cd96o3z24ZTqMdgzej", "IIODaFrLnzdPntRGftRJpuPC", "ODWlzaCdU1siup4vWOfVQK22DnthNinE"};
    public static final float A0E;
    public static final RelativeLayout.LayoutParams A0F;
    public int A00;
    public long A01;
    public Map<String, String> A02;
    public final AbstractC2363jd A03;
    public final C1470No A04;
    public final C2198gi A05;
    public final VA A06;
    public final InterfaceC1847b1 A07;
    public final LV A08;
    public final InterfaceC2047eG A09;
    public final AtomicBoolean A0A;
    public final AtomicBoolean A0B;

    public static String A07(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0C, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 9);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0A() {
        String[] strArr = A0D;
        if (strArr[1].charAt(1) != strArr[5].charAt(1)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0D;
        strArr2[7] = "Af0WM9g7Nak7nSkWG18ndsMVC8MahONd";
        strArr2[4] = "VergmF1iO6RBn6aZ7U2vBdquKGl77VZm";
        A0C = new byte[]{54, 18, 32, 28, 17, 9, 17, 18, 28, 21, 49, 20, 19, 34, 49, 48, 42, 45, 36, 99, 38, 49, 49, 44, 49, 68, 120, 117, 109, 117, 118, 120, 113, 52, 112, 123, 87, 96, 117, 87, 120, 125, 119, 127, 52, 96, 102, 125, 115, 115, 113, 102, 113, 112, 52, 99, 125, 96, 124, 52, 100, 102, 113, 57, 113, 98, 113, 122, 96, 52, 119, 120, 125, 119, 127, 103, 52, 119, 123, 97, 122, 96, 52, 117, 122, 112, 52, 80, 113, 120, 117, 109, 13, 49, 60, 36, 60, 63, 49, 56, 28, 57, 46, 11, 52, 56, 42, 114, 117, 119, 121, 126, 48, 124, 127, 113, 116, 121, 126, 119, 48, 98, 117, 125, 127, 100, 117, 48, 96, 124, 113, 105, 113, 114, 124, 117, 34, 45, 40, 34, 42, 50, 5, 4, 13, 0, 24, 114, 110, 99, 123, 99, 96, 110, 103, 52, 40, 37, 61, 37, 38, 40, 33, 27, 54, 33, 41, 43, 48, 33, 95, 72, 64, 66, 89, 72, 114, 94, 72, 94, 94, 68, 66, 67, 114, 68, 73, 78, 85, 81, 95, 84, 119, 101, 98, 95, 118, 105, 101, 119};
    }

    static {
        A0A();
        A0E = (int) (XX.A02 * 4.0f);
        A0F = new RelativeLayout.LayoutParams(-1, -1);
    }

    public C2049eI(C2198gi c2198gi, AbstractC2363jd abstractC2363jd, C1470No c1470No, VA va2, InterfaceC2047eG interfaceC2047eG, Map<String, String> playableMetricsData) {
        super(c2198gi);
        this.A0A = new AtomicBoolean(false);
        this.A0B = new AtomicBoolean(false);
        this.A01 = -1L;
        this.A00 = 0;
        this.A07 = new AbstractC1420Lp() { // from class: com.facebook.ads.redexgen.X.4S
            @Override // com.facebook.ads.redexgen.core.InterfaceC1847b1
            public final void ACz() {
            }

            @Override // com.facebook.ads.redexgen.core.AbstractC1420Lp, com.facebook.ads.redexgen.core.InterfaceC1847b1
            public final void ADu(int i10, String str) {
                this.A00.A0B.set(true);
                this.A00.A09.AEh();
            }

            @Override // com.facebook.ads.redexgen.core.InterfaceC1847b1
            public final void AEA() {
                if (this.A00.A0B.get() || !this.A00.A0A.compareAndSet(false, true)) {
                    return;
                }
                this.A00.A09.AEA();
            }

            @Override // com.facebook.ads.redexgen.core.InterfaceC1847b1
            public final void AF8() {
                if (!this.A00.A04.A0b()) {
                    return;
                }
                this.A00.A09.AFQ();
            }

            @Override // com.facebook.ads.redexgen.core.InterfaceC1847b1
            public final void AGg() {
                this.A00.A09.AGg();
            }
        };
        this.A05 = c2198gi;
        this.A03 = abstractC2363jd;
        this.A04 = c1470No;
        this.A06 = va2;
        this.A09 = interfaceC2047eG;
        this.A02 = playableMetricsData;
        this.A08 = A05();
        if (C1648Up.A1z(this.A05)) {
            this.A05.A0B().AKn(this.A08, this.A03.A2E(), false);
        }
        addView(this.A08, A0F);
    }

    public static /* synthetic */ int A00(C2049eI c2049eI) {
        int i10 = c2049eI.A00;
        c2049eI.A00 = i10 + 1;
        return i10;
    }

    private LV A05() {
        LV lv = new LV(this.A05, (WeakReference<InterfaceC1847b1>) new WeakReference(this.A07), 10, C1648Up.A28(this.A05));
        lv.setCornerRadius(A0E);
        lv.setLogMultipleImpressions(false);
        lv.setCheckAssetsByJavascriptBridge(false);
        lv.setWebViewTimeoutInMillis(this.A04.A0F());
        lv.setRequestId(this.A03.A1D());
        lv.setOnTouchListener(new ViewOnTouchListenerC2048eH(this));
        WebSettings settings = lv.getSettings();
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setAllowFileAccess(true);
        settings.setAllowFileAccessFromFileURLs(true);
        lv.addJavascriptInterface(new C2050eJ(this.A05, this, this.A06, this.A02, this.A03.A2E()), A07(0, 12, Sdk$SDKError.b.TPAT_ERROR_VALUE));
        return lv;
    }

    public final void A0B() {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.A01;
        C1611Te c1611Te = new C1611Te(A07(25, 67, 29));
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(A07(Sdk$SDKError.b.PRIVACY_URL_ERROR_VALUE, 6, 72), this.A00);
            jSONObject.put(A07(142, 5, 104), jCurrentTimeMillis);
            jSONObject.put(A07(187, 5, 51), this.A03.A2E());
        } catch (JSONException e10) {
            Log.e(A07(92, 15, 84), A07(12, 13, 74), e10);
        }
        c1611Te.A07(jSONObject);
        c1611Te.A05(1);
        InterfaceC1609Tc interfaceC1609TcA08 = this.A05.A08();
        int i10 = AbstractC1610Td.A2D;
        String strA07 = A07(147, 8, 11);
        interfaceC1609TcA08.ABD(strA07, i10, c1611Te);
        this.A00 = 0;
        if (!C1648Up.A1u(this.A05)) {
            this.A09.ADX();
            return;
        }
        if (jCurrentTimeMillis <= C1648Up.A0L(this.A05)) {
            InterfaceC2047eG interfaceC2047eG = this.A09;
            String[] strArr = A0D;
            if (strArr[7].charAt(0) == strArr[4].charAt(0)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0D;
            strArr2[1] = "0XAlcIRGce3nNmobAWWNAzxTwWjfpKo1";
            strArr2[5] = "vX4VpuJxASYV4FwrDvVxGQ4QiWthZxUm";
            interfaceC2047eG.ADX();
            return;
        }
        c1611Te.A05(0);
        this.A05.A08().ABC(strA07, AbstractC1610Td.A2E, c1611Te);
    }

    public final void A0C() {
        String strA0L;
        if (this.A04.A0Y()) {
            C1611Te c1611Te = new C1611Te(A07(107, 29, 25));
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(A07(170, 17, 36), this.A04.A0P());
                jSONObject.put(A07(187, 5, 51), this.A03.A2E());
            } catch (JSONException e10) {
                String strA07 = A07(92, 15, 84);
                String strA08 = A07(12, 13, 74);
                String[] strArr = A0D;
                if (strArr[1].charAt(1) != strArr[5].charAt(1)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0D;
                strArr2[3] = "qKqF8GsLC";
                strArr2[6] = "yUBs4wOBB81EmWZp6CsNCuI0";
                Log.e(strA07, strA08, e10);
            }
            c1611Te.A07(jSONObject);
            c1611Te.A05(1);
            InterfaceC1609Tc interfaceC1609TcA08 = this.A05.A08();
            int i10 = AbstractC1610Td.A2G;
            String strA09 = A07(155, 15, 77);
            interfaceC1609TcA08.ABD(strA09, i10, c1611Te);
            if (C1648Up.A0r(this.A05) && AbstractC1731Xz.A00(this.A05) == EnumC1730Xy.A07) {
                this.A05.A08().ABD(strA09, AbstractC1610Td.A2F, c1611Te);
                this.A07.ADu(0, null);
                String[] strArr3 = A0D;
                if (strArr3[1].charAt(1) != strArr3[5].charAt(1)) {
                    String[] strArr4 = A0D;
                    strArr4[7] = "eYeTyqsAvkMxTzxGPJMzaaOJBs1WoRUE";
                    strArr4[4] = "DGSgvEgHkFrTWskIwQomZOyU4ros1fyW";
                    return;
                } else {
                    String[] strArr5 = A0D;
                    strArr5[1] = "QXwUk7ZcYbXDO6xLw92fyo5XHWgn18Du";
                    strArr5[5] = "iXthj0ZXJZZP0QlicLBvNNfJ4d5EWvqr";
                    return;
                }
            }
        }
        try {
            LV lv = this.A08;
            if (!TextUtils.isEmpty(this.A04.A0I())) {
                strA0L = this.A04.A0I();
            } else {
                strA0L = this.A04.A0L();
            }
            lv.loadUrl(strA0L);
        } catch (Exception e11) {
            this.A05.A08().ABC(A07(PsExtractor.AUDIO_STREAM, 8, 9), AbstractC1610Td.A2f, new C1611Te(e11));
        }
    }

    public final void A0D() {
        if (C1648Up.A1z(this.A05)) {
            this.A05.A0B().AKU(this.A08);
        }
        this.A08.removeJavascriptInterface(A07(0, 12, Sdk$SDKError.b.TPAT_ERROR_VALUE));
        this.A08.destroy();
    }

    public final void A0E(int i10) {
        this.A08.setVisibility(i10);
        if (i10 == 0) {
            this.A08.resumeTimers();
        } else {
            this.A08.pauseTimers();
        }
    }

    public Y2 getTouchDataRecorder() {
        return this.A08.getTouchDataRecorder();
    }

    public C2143fp getViewabilityChecker() {
        return this.A08.getViewabilityChecker();
    }
}
