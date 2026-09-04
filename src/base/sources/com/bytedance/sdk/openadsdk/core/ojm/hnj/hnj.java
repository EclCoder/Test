package com.bytedance.sdk.openadsdk.core.ojm.hnj;

import android.content.Context;
import android.util.Pair;
import android.view.View;
import android.view.Window;
import com.bytedance.sdk.openadsdk.utils.sq;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hnj {
    public static float hn(Context context) {
        return sq.qor(context, sq.orl(context));
    }

    public static Pair<Float, Float> hnj(Window window, int i10) {
        View decorView = window.getDecorView();
        float[] fArrHnj = {decorView.getWidth() - (decorView.getPaddingLeft() * 2), decorView.getHeight() - (decorView.getPaddingTop() * 2)};
        fArrHnj[0] = sq.qor(window.getContext(), fArrHnj[0]);
        float fQor = sq.qor(window.getContext(), fArrHnj[1]);
        fArrHnj[1] = fQor;
        if (fArrHnj[0] < 10.0f || fQor < 10.0f) {
            fArrHnj = hnj(window.getContext(), sq.qor(window.getContext(), sq.hnj()), i10);
        }
        float fMax = Math.max(fArrHnj[0], fArrHnj[1]);
        float fMin = Math.min(fArrHnj[0], fArrHnj[1]);
        if (i10 == 1) {
            fArrHnj[0] = fMin;
            fArrHnj[1] = fMax;
        } else {
            fArrHnj[0] = fMax;
            fArrHnj[1] = fMin;
        }
        return new Pair<>(Float.valueOf(fArrHnj[0]), Float.valueOf(fArrHnj[1]));
    }

    private static float[] hnj(Context context, int i10, int i11) {
        float fHnj = hnj(context);
        float fHn = hn(context);
        if ((i11 == 1) != (fHnj > fHn)) {
            float f10 = fHnj + fHn;
            fHn = f10 - fHn;
            fHnj = f10 - fHn;
        }
        if (i11 == 1) {
            fHnj -= i10;
        } else {
            fHn -= i10;
        }
        return new float[]{fHn, fHnj};
    }

    public static float hnj(Context context) {
        return sq.qor(context, sq.bug(context));
    }
}
