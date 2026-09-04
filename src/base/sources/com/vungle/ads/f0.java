package com.vungle.ads;

import android.content.Context;
import com.google.api.client.http.HttpStatusCodes;
import com.vungle.ads.internal.model.Placement;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class f0 {
    private final int height;
    private boolean isAdaptiveHeight;
    private boolean isAdaptiveWidth;
    private final int width;
    public static final a Companion = new a(null);
    public static final f0 BANNER = new f0(Sdk$SDKError.b.WEBVIEW_ERROR_VALUE, 50);
    public static final f0 BANNER_SHORT = new f0(HttpStatusCodes.STATUS_CODE_MULTIPLE_CHOICES, 50);
    public static final f0 BANNER_LEADERBOARD = new f0(728, 90);
    public static final f0 MREC = new f0(HttpStatusCodes.STATUS_CODE_MULTIPLE_CHOICES, 250);

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final f0 getAdSizeWithWidth(Context context, int i10) {
            kotlin.jvm.internal.s.h(context, "context");
            int iIntValue = ((Number) com.vungle.ads.internal.util.a0.INSTANCE.getDeviceWidthAndHeightWithOrientation(context, 0).g()).intValue();
            if (i10 < 0) {
                i10 = 0;
            }
            f0 f0Var = new f0(i10, iIntValue);
            if (f0Var.getWidth() == 0) {
                f0Var.setAdaptiveWidth$vungle_ads_release(true);
            }
            f0Var.setAdaptiveHeight$vungle_ads_release(true);
            return f0Var;
        }

        public final f0 getAdSizeWithWidthAndHeight(int i10, int i11) {
            if (i10 < 0) {
                i10 = 0;
            }
            if (i11 < 0) {
                i11 = 0;
            }
            f0 f0Var = new f0(i10, i11);
            if (f0Var.getWidth() == 0) {
                f0Var.setAdaptiveWidth$vungle_ads_release(true);
            }
            if (f0Var.getHeight() == 0) {
                f0Var.setAdaptiveHeight$vungle_ads_release(true);
            }
            return f0Var;
        }

        public final f0 getValidAdSizeFromSize(int i10, int i11, String placementId) {
            kotlin.jvm.internal.s.h(placementId, "placementId");
            Placement placement = com.vungle.ads.internal.e.INSTANCE.getPlacement(placementId);
            if (placement != null) {
                if (!placement.isInline()) {
                    placement = null;
                }
                if (placement != null) {
                    return f0.Companion.getAdSizeWithWidthAndHeight(i10, i11);
                }
            }
            f0 f0Var = f0.MREC;
            if (i10 >= f0Var.getWidth() && i11 >= f0Var.getHeight()) {
                return f0Var;
            }
            f0 f0Var2 = f0.BANNER_LEADERBOARD;
            if (i10 >= f0Var2.getWidth() && i11 >= f0Var2.getHeight()) {
                return f0Var2;
            }
            f0 f0Var3 = f0.BANNER;
            if (i10 >= f0Var3.getWidth() && i11 >= f0Var3.getHeight()) {
                return f0Var3;
            }
            f0 f0Var4 = f0.BANNER_SHORT;
            return (i10 < f0Var4.getWidth() || i11 < f0Var4.getHeight()) ? getAdSizeWithWidthAndHeight(i10, i11) : f0Var4;
        }

        private a() {
        }
    }

    public f0(int i10, int i11) {
        this.width = i10;
        this.height = i11;
    }

    public static final f0 getAdSizeWithWidth(Context context, int i10) {
        return Companion.getAdSizeWithWidth(context, i10);
    }

    public static final f0 getAdSizeWithWidthAndHeight(int i10, int i11) {
        return Companion.getAdSizeWithWidthAndHeight(i10, i11);
    }

    public static final f0 getValidAdSizeFromSize(int i10, int i11, String str) {
        return Companion.getValidAdSizeFromSize(i10, i11, str);
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getWidth() {
        return this.width;
    }

    public final boolean isAdaptiveHeight$vungle_ads_release() {
        return this.isAdaptiveHeight;
    }

    public final boolean isAdaptiveWidth$vungle_ads_release() {
        return this.isAdaptiveWidth;
    }

    public final boolean isValidSize$vungle_ads_release() {
        return this.width >= 0 && this.height >= 0;
    }

    public final void setAdaptiveHeight$vungle_ads_release(boolean z10) {
        this.isAdaptiveHeight = z10;
    }

    public final void setAdaptiveWidth$vungle_ads_release(boolean z10) {
        this.isAdaptiveWidth = z10;
    }

    public String toString() {
        return "VungleAdSize(width=" + this.width + ", height=" + this.height + ')';
    }
}
