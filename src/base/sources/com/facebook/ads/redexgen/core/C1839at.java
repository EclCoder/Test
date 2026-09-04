package com.facebook.ads.redexgen.core;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.at, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C1839at extends WebViewClient {
    public static byte[] A05;
    public final WeakReference<C2198gi> A02;
    public final WeakReference<InterfaceC1836aq> A03;
    public final WeakReference<C1831al> A04;
    public final InterfaceC1835ap A01 = new InterfaceC1835ap() { // from class: com.facebook.ads.redexgen.X.M4
        @Override // com.facebook.ads.redexgen.core.InterfaceC1835ap
        public final boolean AAf(String str) {
            return C1839at.A04(str);
        }
    };
    public WeakReference<InterfaceC1837ar> A00 = new WeakReference<>(null);

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 44);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{28, 31, 18, 8, 9, 71, 31, 17, 28, 19, 22, 37, 42, 27, 37, 39, 48, 45, 50, 45, 48, 61, 12, 3, 9, 31, 2, 4, 9, 67, 4, 3, 25, 8, 3, 25, 67, 12, 14, 25, 4, 2, 3, 67, 59, 36, 40, 58, 119, 120, 114, 100, 121, 127, 114, 56, 127, 120, 98, 115, 120, 98, 56, 117, 119, 98, 115, 113, 121, 100, 111, 56, 84, 68, 89, 65, 69, 87, 84, 90, 83, 117, 101, 120, 96, 100, 114, 101, 72, 113, 118, 123, 123, 117, 118, 116, 124, 72, 98, 101, 123, 51, 54, 35, 54, 97, 102, 124, 109, 102, 124, 2, 5, 27, 77, 87, 31, 13, 10, 55, 30, 1, 13, 31};
    }

    public C1839at(WeakReference<C2198gi> weakReference, WeakReference<InterfaceC1836aq> weakReference2, WeakReference<C1831al> weakReference3) {
        this.A02 = weakReference;
        this.A03 = weakReference2;
        this.A04 = weakReference3;
    }

    private void A02(String str, C2198gi c2198gi) {
        c2198gi.A08().ABC(A00(11, 11, 104), AbstractC1610Td.A09, new C1611Te(A00(111, 5, 91) + str));
    }

    private boolean A03(WebView webView, String str) {
        Intent intent;
        String strA00 = A00(Sdk$SDKError.b.GZIP_ENCODE_ERROR_VALUE, 8, 68);
        C2198gi c2198gi = this.A02.get();
        if (c2198gi != null) {
            if ((M3.A0A && (TextUtils.isEmpty(str) || A00(0, 11, 81).equals(str))) || !this.A01.AAf(str)) {
                return true;
            }
            try {
                Uri uri = XB.A00(str);
                String scheme = uri.getScheme();
                try {
                    boolean zA14 = C1648Up.A14(c2198gi);
                    String strA01 = A00(48, 33, 58);
                    String strA02 = A00(22, 26, 65);
                    String strA03 = A00(105, 6, 36);
                    if (zA14) {
                        if (!M3.A0D.contains(scheme) && !A00(101, 4, Sdk$SDKError.b.INVALID_RI_ENDPOINT_VALUE).equals(scheme)) {
                            if (strA03.equalsIgnoreCase(scheme)) {
                                intent = Intent.parseUri(str, 1);
                                intent.setComponent(null);
                                intent.setSelector(null);
                            } else {
                                intent = new Intent(strA02, uri);
                            }
                            intent.addCategory(strA01);
                            if (Build.VERSION.SDK_INT >= 30) {
                                intent.setFlags(268436480);
                            } else {
                                intent.setFlags(268435456);
                            }
                            try {
                                if (!C1702Wu.A0D(c2198gi, intent)) {
                                    A02(str, c2198gi);
                                }
                                return true;
                            } catch (C1700Ws unused) {
                                if (strA03.equals(scheme)) {
                                    String stringExtra = intent.getStringExtra(A00(81, 20, 59));
                                    if (!TextUtils.isEmpty(stringExtra)) {
                                        if (!C1702Wu.A0D(c2198gi, new Intent(strA02, XB.A00(stringExtra)))) {
                                            A02(str, c2198gi);
                                        }
                                        return true;
                                    }
                                }
                                C1611Te c1611Te = new C1611Te(A00(111, 5, 91) + str);
                                c1611Te.A05(1);
                                c2198gi.A08().ABD(A00(11, 11, 104), AbstractC1610Td.A06, c1611Te);
                                return true;
                            }
                        }
                        return false;
                    }
                    if (!M3.A0A || !strA03.equalsIgnoreCase(scheme)) {
                        if ((M3.A0A && AbstractC1707Xb.A04(str)) || !M3.A0D.contains(scheme)) {
                            return C1702Wu.A0D(c2198gi, new Intent(strA02, uri));
                        }
                    } else {
                        Intent uri2 = Intent.parseUri(str, 1);
                        uri2.addCategory(strA01);
                        uri2.setComponent(null);
                        uri2.setSelector(null);
                        if (c2198gi.getPackageManager().resolveActivity(uri2, C.DEFAULT_BUFFER_SEGMENT_SIZE) != null && C1702Wu.A0D(c2198gi, uri2)) {
                            webView.goBack();
                            return true;
                        }
                    }
                } catch (Exception e10) {
                    c2198gi.A08().ABD(strA00, AbstractC1610Td.A2d, new C1611Te(e10));
                    c2198gi.A0F().AA2(e10.toString());
                }
                return false;
            } catch (SecurityException e11) {
                c2198gi.A08().ABD(strA00, AbstractC1610Td.A2d, new C1611Te(e11));
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ boolean A04(String str) {
        return true;
    }

    public final void A05(WeakReference<InterfaceC1837ar> weakReference) {
        this.A00 = weakReference;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        C1831al timingLogger = this.A04.get();
        if (timingLogger != null) {
            timingLogger.A03();
        }
        InterfaceC1836aq interfaceC1836aq = this.A03.get();
        if (interfaceC1836aq != null) {
            interfaceC1836aq.AF7(str);
        }
        InterfaceC1837ar interfaceC1837ar = this.A00.get();
        if (interfaceC1837ar != null) {
            interfaceC1837ar.ADB(webView.canGoBack());
            interfaceC1837ar.ADx(webView.canGoForward());
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        InterfaceC1836aq listener = this.A03.get();
        if (listener != null) {
            listener.AF9(str);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i10, String str, String str2) {
        super.onReceivedError(webView, i10, str, str2);
        C2198gi c2198gi = this.A02.get();
        if (c2198gi != null) {
            StringBuilder sb2 = new StringBuilder();
            String strA00 = A00(0, 0, 109);
            String errorMessage = AbstractC1707Xb.A01(i10, sb2.append(strA00).append(str).toString(), strA00 + str2);
            c2198gi.A0F().A9z(errorMessage);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        C2198gi c2198gi = this.A02.get();
        if (c2198gi != null) {
            int errorCode = webResourceError.getErrorCode();
            StringBuilder sb2 = new StringBuilder();
            String strA00 = A00(0, 0, 109);
            String errorMessage = AbstractC1707Xb.A01(errorCode, sb2.append(strA00).append((Object) webResourceError.getDescription()).toString(), strA00 + webResourceRequest.getUrl());
            c2198gi.A0F().A9z(errorMessage);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        C2198gi context = this.A02.get();
        if (context != null) {
            context.A0F().AA0();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        C2198gi context = this.A02.get();
        if (context != null) {
            context.A0F().AA1();
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        AbstractC1844ay.A0D(AbstractC1610Td.A2e);
        InterfaceC1836aq listener = this.A03.get();
        if (listener != null) {
            listener.AFe();
            return true;
        }
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return A03(webView, webResourceRequest.getUrl().toString());
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return A03(webView, str);
    }
}
