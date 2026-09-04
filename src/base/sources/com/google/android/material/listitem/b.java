package com.google.android.material.listitem;

import android.view.View;
import android.widget.FrameLayout;
import n0.m;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
abstract class b {
    static boolean a(View view) {
        int i10;
        if (!(view.getLayoutParams() instanceof FrameLayout.LayoutParams) || (i10 = ((FrameLayout.LayoutParams) view.getLayoutParams()).gravity) == -1) {
            i10 = 8388613;
        }
        return (m.b(i10, view.getLayoutDirection()) & 7) == 5;
    }
}
