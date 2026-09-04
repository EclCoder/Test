package com.bytedance.sdk.openadsdk.qor;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import com.bytedance.sdk.openadsdk.utils.sq;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class dnm extends View {
    private final int hnj;

    public dnm(Context context) {
        this(context, Color.parseColor("#25000000"));
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        setMeasuredDimension(getMeasuredWidth(), this.hnj);
    }

    public dnm(Context context, int i10) {
        super(context);
        setBackgroundColor(i10);
        this.hnj = sq.hn(getContext(), 0.66f);
    }
}
