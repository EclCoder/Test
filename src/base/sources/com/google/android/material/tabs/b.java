package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
class b extends c {
    b() {
    }

    @Override // com.google.android.material.tabs.c
    void d(TabLayout tabLayout, View view, View view2, float f10, Drawable drawable) {
        if (f10 >= 0.5f) {
            view = view2;
        }
        RectF rectFA = c.a(tabLayout, view);
        float fB = f10 < 0.5f ? tb.b.b(1.0f, 0.0f, 0.0f, 0.5f, f10) : tb.b.b(0.0f, 1.0f, 0.5f, 1.0f, f10);
        drawable.setBounds((int) rectFA.left, drawable.getBounds().top, (int) rectFA.right, drawable.getBounds().bottom);
        drawable.setAlpha((int) (fB * 255.0f));
    }
}
