package com.pedro.library.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.TextureView;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class AutoFitTextureView extends TextureView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f35266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f35267b;

    public AutoFitTextureView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f35266a = 0;
        this.f35267b = 0;
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int i12;
        super.onMeasure(i10, i11);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int i13 = this.f35266a;
        if (i13 == 0 || (i12 = this.f35267b) == 0) {
            setMeasuredDimension(size, size2);
        } else if (size < (size2 * i13) / i12) {
            setMeasuredDimension(size, (i12 * size) / i13);
        } else {
            setMeasuredDimension((i13 * size2) / i12, size2);
        }
    }
}
