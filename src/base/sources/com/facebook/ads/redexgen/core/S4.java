package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdLayout;
import com.facebook.ads.NativeAdView;
import com.facebook.ads.NativeAdViewAttributes;
import com.facebook.ads.internal.api.NativeAdViewApi;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class S4 implements NativeAdViewApi {
    public static View A00(C2198gi c2198gi, NativeAd nativeAd, NativeAdView.Type type, NativeAdViewAttributes nativeAdViewAttributes) {
        if (nativeAdViewAttributes == null) {
            nativeAdViewAttributes = new NativeAdViewAttributes();
        }
        C1662Vd c1662Vd = (C1662Vd) nativeAdViewAttributes.getInternalAttributes();
        UK internalNativeAd = UK.A0L(nativeAd.getInternalNativeAd());
        internalNativeAd.A1h(EnumC1663Ve.A00(type.getEnumCode()));
        internalNativeAd.A1g(c1662Vd);
        C7C c7c = new C7C();
        NativeAdLayout mediumRectTemplateLayout = new NativeAdLayout(c2198gi, c7c);
        c7c.A08(mediumRectTemplateLayout, c2198gi, nativeAd, c1662Vd);
        mediumRectTemplateLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, (int) (XX.A02 * type.getHeight())));
        return mediumRectTemplateLayout;
    }

    public static View A01(C2198gi c2198gi, NativeAd nativeAd, NativeAdViewAttributes nativeAdViewAttributes) {
        if (nativeAdViewAttributes == null) {
            nativeAdViewAttributes = new NativeAdViewAttributes();
        }
        UK ukA0L = UK.A0L(nativeAd.getInternalNativeAd());
        C1662Vd c1662Vd = (C1662Vd) nativeAdViewAttributes.getInternalAttributes();
        ukA0L.A1h(EnumC1663Ve.A0B);
        ukA0L.A1g(c1662Vd);
        C7C c7c = new C7C();
        NativeAdLayout nativeAdLayout = new NativeAdLayout(c2198gi, c7c);
        c7c.A08(nativeAdLayout, c2198gi, nativeAd, c1662Vd);
        return nativeAdLayout;
    }

    @Override // com.facebook.ads.internal.api.NativeAdViewApi
    public final View render(Context context, NativeAd nativeAd) {
        return render(context, nativeAd, (NativeAdViewAttributes) null);
    }

    @Override // com.facebook.ads.internal.api.NativeAdViewApi
    public final View render(Context context, NativeAd nativeAd, NativeAdView.Type type) {
        return render(context, nativeAd, type, null);
    }

    @Override // com.facebook.ads.internal.api.NativeAdViewApi
    public final View render(Context context, NativeAd nativeAd, NativeAdView.Type type, NativeAdViewAttributes nativeAdViewAttributes) {
        try {
            return A00(C1571Rp.A03(context), nativeAd, type, nativeAdViewAttributes);
        } catch (Throwable th2) {
            return Z4.A00(C1571Rp.A03(context), th2);
        }
    }

    @Override // com.facebook.ads.internal.api.NativeAdViewApi
    public final View render(Context context, NativeAd nativeAd, NativeAdViewAttributes nativeAdViewAttributes) {
        C2198gi contextWrapper;
        try {
            if (context instanceof C2198gi) {
                contextWrapper = (C2198gi) context;
            } else {
                contextWrapper = C1571Rp.A03(context);
            }
            return A01(contextWrapper, nativeAd, nativeAdViewAttributes);
        } catch (Throwable th2) {
            return Z4.A00(C1571Rp.A03(context), th2);
        }
    }
}
