package com.vungle.ads.internal.util;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.webkit.WebView;
import re.xQrM.UoyZyZEcGYBpIg;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public final class a0 {
    public static final a0 INSTANCE = new a0();

    private a0() {
    }

    public final fl.q getDeviceWidthAndHeightWithOrientation(Context context, int i10) {
        kotlin.jvm.internal.s.h(context, "context");
        Resources resources = context.getApplicationContext().getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        int i11 = resources.getConfiguration().orientation;
        if (i10 == 0) {
            i10 = i11;
        }
        return i10 == i11 ? new fl.q(Integer.valueOf(Math.round(displayMetrics.widthPixels / displayMetrics.density)), Integer.valueOf(Math.round(displayMetrics.heightPixels / displayMetrics.density))) : new fl.q(Integer.valueOf(Math.round(displayMetrics.heightPixels / displayMetrics.density)), Integer.valueOf(Math.round(displayMetrics.widthPixels / displayMetrics.density)));
    }

    public final WebView getWebView(Context context, String str) throws InstantiationException {
        kotlin.jvm.internal.s.h(context, "context");
        try {
            return com.vungle.ads.internal.presenter.o.INSTANCE.getOrCreateWebView(context, str);
        } catch (Resources.NotFoundException e10) {
            throw new InstantiationException("Cannot instantiate WebView due to Resources.NotFoundException: " + e10 + ".message");
        } catch (Exception e11) {
            throw new InstantiationException(e11.getMessage());
        }
    }

    public final int dpToPixels(Context context, int i10) {
        kotlin.jvm.internal.s.h(context, UoyZyZEcGYBpIg.dlg);
        return (int) ((i10 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }
}
