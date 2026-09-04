package com.hecorat.screenrecorder.free.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class AutoFitTextureView extends TextureView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f23553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f23554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f23555c;

    public AutoFitTextureView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void a() {
        this.f23555c = false;
    }

    public void b(int i10, int i11) {
        if (i10 < 0 || i11 < 0) {
            throw new IllegalArgumentException("Size cannot be negative.");
        }
        this.f23553a = i10;
        this.f23554b = i11;
        requestLayout();
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int i12;
        super.onMeasure(i10, i11);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int i13 = (size2 - size) / 2;
        if (!this.f23555c && i13 != 0) {
            this.f23555c = true;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
            wp.a.a("Margin: %d", Integer.valueOf(i13));
            if (i13 > 0) {
                int i14 = -i13;
                marginLayoutParams.topMargin = i14;
                marginLayoutParams.bottomMargin = i14;
                marginLayoutParams.leftMargin = 0;
                marginLayoutParams.rightMargin = 0;
            } else {
                marginLayoutParams.topMargin = 0;
                marginLayoutParams.bottomMargin = 0;
                marginLayoutParams.leftMargin = i13;
                marginLayoutParams.rightMargin = i13;
            }
            setLayoutParams(marginLayoutParams);
        }
        int i15 = this.f23553a;
        if (i15 == 0 || (i12 = this.f23554b) == 0) {
            setMeasuredDimension(size, size2);
        } else if (size < size2) {
            setMeasuredDimension(size, (i12 * size) / i15);
        } else {
            setMeasuredDimension((i15 * size2) / i12, size2);
        }
        wp.a.a("onMeasure", new Object[0]);
    }

    public AutoFitTextureView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f23553a = 0;
        this.f23554b = 0;
        this.f23555c = false;
    }
}
