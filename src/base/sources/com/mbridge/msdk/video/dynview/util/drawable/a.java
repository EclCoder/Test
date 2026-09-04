package com.mbridge.msdk.video.dynview.util.drawable;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import com.mbridge.msdk.foundation.tools.v0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class a {
    public static void a(View view, int i10, int i11, String str, String str2) {
        if (view != null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(Color.parseColor(str2));
            gradientDrawable.setCornerRadius(v0.a(view.getContext(), i11));
            gradientDrawable.setStroke(v0.a(view.getContext(), i10), Color.parseColor(str));
            view.setBackground(gradientDrawable);
        }
    }

    public static void a(View view, float f10, float f11, String str, String[] strArr, GradientDrawable.Orientation orientation) {
        if (view == null || strArr == null) {
            return;
        }
        int[] iArr = new int[strArr.length];
        for (int i10 = 0; i10 < strArr.length; i10++) {
            iArr[i10] = Color.parseColor(strArr[i10]);
        }
        GradientDrawable gradientDrawable = new GradientDrawable(orientation, iArr);
        gradientDrawable.setCornerRadius(v0.a(view.getContext(), f11));
        gradientDrawable.setStroke(v0.a(view.getContext(), f10), Color.parseColor(str));
        view.setBackground(gradientDrawable);
    }
}
