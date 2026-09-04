package com.mbridge.msdk.out;

import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public interface OnImageLoadListener {
    void loadError(String str);

    void loadSuccess(Drawable drawable, int i10);
}
