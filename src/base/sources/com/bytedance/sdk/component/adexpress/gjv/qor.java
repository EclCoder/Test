package com.bytedance.sdk.component.adexpress.gjv;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class qor {
    public static Drawable hnj(Context context, com.bytedance.sdk.component.adexpress.dynamic.gjv.dse dseVar) {
        if (context == null || dseVar == null) {
            return null;
        }
        return hnj(context, (int) dse.hnj(context, dseVar.uua()), dseVar.jip(), dseVar.vf());
    }

    public static Drawable hnj(Context context, int i10, int i11, int i12) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        if (context != null) {
            gradientDrawable.setStroke(i10, i11);
        }
        gradientDrawable.setColor(i12);
        return gradientDrawable;
    }
}
