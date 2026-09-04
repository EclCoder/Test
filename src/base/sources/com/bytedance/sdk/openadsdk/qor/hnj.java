package com.bytedance.sdk.openadsdk.qor;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.utils.sq;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hnj extends com.bytedance.sdk.openadsdk.core.dkl.aq {
    private int gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private float f14591hn;
    private Paint hnj;
    private boolean qor;

    public hnj(Context context) {
        super(context);
        hnj();
    }

    private void hnj() {
        this.f14591hn = sq.hnj(getContext(), 8.0f);
        this.hnj = new Paint();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        hnj(getText().toString(), getWidth());
    }

    @Override // com.bytedance.sdk.openadsdk.core.dkl.aq, android.widget.TextView, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.gjv = getMeasuredHeight();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-2, this.gjv);
        } else {
            layoutParams.height = this.gjv;
        }
        setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.sdk.openadsdk.core.dkl.aq, android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        int i10 = this.gjv;
        if (i10 == 0 || layoutParams == null) {
            return;
        }
        layoutParams.height = i10;
    }

    public void setMinTextSize(float f10) {
        if (f10 <= 0.0f) {
            return;
        }
        this.f14591hn = f10;
    }

    private void hnj(String str, int i10) {
        if (!this.qor && i10 > 0) {
            float textSize = getTextSize();
            this.hnj.set(getPaint());
            int paddingLeft = (i10 - getPaddingLeft()) - getPaddingRight();
            float fHnj = hnj(textSize, str);
            while (fHnj > paddingLeft) {
                textSize -= 1.0f;
                this.hnj.setTextSize(textSize);
                if (textSize <= this.f14591hn) {
                    break;
                } else {
                    fHnj = hnj(textSize, str);
                }
            }
            setTextSize(0, textSize);
            this.qor = true;
        }
    }

    private float hnj(float f10, String str) {
        this.hnj.setTextSize(f10);
        return this.hnj.measureText(str);
    }
}
