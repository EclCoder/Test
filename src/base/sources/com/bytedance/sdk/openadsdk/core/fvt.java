package com.bytedance.sdk.openadsdk.core;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class fvt {
    private static boolean hn(View view) {
        return view != null && view.isShown();
    }

    private static boolean hnj(View view, int i10) {
        float fHnj = hnj(view);
        return fHnj > 0.0f && fHnj >= ((float) i10) / 100.0f;
    }

    private static int qor(View view, int i10) {
        if (i10 == 3) {
            return com.bytedance.sdk.openadsdk.utils.sq.sk(view.getContext().getApplicationContext()) / 2;
        }
        return 20;
    }

    private static int hn(View view, int i10) {
        if (i10 == 3) {
            return (int) (((double) com.bytedance.sdk.openadsdk.utils.sq.qor(view.getContext().getApplicationContext())) * 0.7d);
        }
        return 20;
    }

    public static float hnj(View view) {
        if (view != null) {
            try {
                if (view.getVisibility() == 0 && view.getParent() != null) {
                    Rect rect = new Rect();
                    if (!view.getGlobalVisibleRect(rect)) {
                        return -1.0f;
                    }
                    long jHeight = ((long) rect.height()) * ((long) rect.width());
                    long height = ((long) view.getHeight()) * ((long) view.getWidth());
                    if (height <= 0) {
                        return -1.0f;
                    }
                    return jHeight / height;
                }
            } catch (Throwable unused) {
            }
        }
        return -1.0f;
    }

    private static int hn(View view, int i10, int i11, boolean z10) {
        if (view.getWindowVisibility() != 0) {
            return 4;
        }
        if (!hn(view)) {
            return 1;
        }
        if (hnj(view, i11, z10)) {
            return !hnj(view, i10) ? 3 : 0;
        }
        return 6;
    }

    private static boolean hnj(View view, int i10, boolean z10) {
        int iHn = hn(view, i10);
        int iQor = qor(view, i10);
        if (i10 == 1 && z10) {
            return view.getWidth() > 0 && view.getHeight() > 0;
        }
        return view.getWidth() >= iHn && view.getHeight() >= iQor;
    }

    public static boolean hnj(View view, int i10, int i11, boolean z10) {
        if (i11 == 1) {
            while (view != null) {
                try {
                    if (view.getVisibility() != 0) {
                        return false;
                    }
                    if ((view instanceof com.bytedance.sdk.openadsdk.core.ojm.apu) || (view instanceof com.bytedance.sdk.openadsdk.core.gjv.gjv)) {
                        break;
                    }
                    view = (View) view.getParent();
                } catch (Throwable unused) {
                }
            }
            if (z10) {
                i10 = 0;
            }
        }
        return hn(view, i10, i11, z10) == 0;
    }
}
