package com.bytedance.adsdk.ugeno.ojm.dkl;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.Log;
import android.widget.TextView;
import com.bytedance.adsdk.ugeno.core.IAnimation;
import com.bytedance.adsdk.ugeno.gjv;
import com.bytedance.adsdk.ugeno.hnj.aq;
import com.bytedance.adsdk.ugeno.hnj.dse;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hnj extends TextView implements IAnimation, dse {
    private float dkl;
    private float dse;
    private float gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private float f12352hn;
    private gjv hnj;
    private aq qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private float f12353sk;

    public hnj(Context context) {
        super(context);
        this.gjv = -1.0f;
        this.dkl = 1.0f;
        this.dse = 0.0f;
        this.qor = new aq(this);
    }

    @Override // android.view.View
    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        gjv gjvVar = this.hnj;
        if (gjvVar != null) {
            gjvVar.hn(canvas);
        }
    }

    public float getBorderRadius() {
        return this.qor.hnj();
    }

    @Override // com.bytedance.adsdk.ugeno.core.IAnimation, com.bytedance.adsdk.ugeno.hnj.dse
    public float getRipple() {
        return this.f12352hn;
    }

    @Override // com.bytedance.adsdk.ugeno.hnj.dse
    public float getRubIn() {
        return this.qor.getRubIn();
    }

    @Override // com.bytedance.adsdk.ugeno.hnj.dse
    public float getShine() {
        return this.qor.getShine();
    }

    @Override // com.bytedance.adsdk.ugeno.hnj.dse
    public float getStretch() {
        return this.qor.getStretch();
    }

    public void hnj(gjv gjvVar) {
        this.hnj = gjvVar;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        gjv gjvVar = this.hnj;
        if (gjvVar != null) {
            gjvVar.dse();
        }
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        gjv gjvVar = this.hnj;
        if (gjvVar != null) {
            gjvVar.aq();
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        gjv gjvVar = this.hnj;
        if (gjvVar != null) {
            gjvVar.hnj(canvas, this);
            this.hnj.hnj(canvas);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        gjv gjvVar = this.hnj;
        if (gjvVar != null) {
            gjvVar.hnj(i10, i11, i12, i13);
        }
        if (z10 && this.gjv > 0.0f) {
            hnj(((i12 - i10) - getCompoundPaddingLeft()) - getCompoundPaddingRight(), ((i13 - i11) - getCompoundPaddingBottom()) - getCompoundPaddingTop());
        }
        super.onLayout(z10, i10, i11, i12, i13);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i10, int i11) {
        gjv gjvVar = this.hnj;
        if (gjvVar == null) {
            super.onMeasure(i10, i11);
        } else {
            int[] iArrHnj = gjvVar.hnj(i10, i11);
            super.onMeasure(iArrHnj[0], iArrHnj[1]);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        gjv gjvVar = this.hnj;
        if (gjvVar != null) {
            gjvVar.hn(i10, i11, i12, i12);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        this.qor.hnj(i10);
    }

    public void setBorderRadius(float f10) {
        aq aqVar = this.qor;
        if (aqVar != null) {
            aqVar.hnj(f10);
        }
    }

    @Override // android.widget.TextView
    public void setLineSpacing(float f10, float f11) {
        super.setLineSpacing(f10, f11);
        this.dkl = f11;
        this.dse = f10;
    }

    public void setMinTextSize(float f10) {
        this.gjv = f10;
    }

    @Override // com.bytedance.adsdk.ugeno.core.IAnimation
    public void setRipple(float f10) {
        this.f12352hn = f10;
        aq aqVar = this.qor;
        if (aqVar != null) {
            aqVar.hn(f10);
        }
        postInvalidate();
    }

    public void setRubIn(float f10) {
        aq aqVar = this.qor;
        if (aqVar != null) {
            aqVar.sk(f10);
        }
    }

    public void setShine(float f10) {
        aq aqVar = this.qor;
        if (aqVar != null) {
            aqVar.qor(f10);
        }
    }

    public void setStretch(float f10) {
        aq aqVar = this.qor;
        if (aqVar != null) {
            aqVar.gjv(f10);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(float f10) {
        super.setTextSize(f10);
        this.f12353sk = getTextSize();
    }

    private void hnj(int i10, int i11) {
        CharSequence text = getText();
        if (text == null || text.length() == 0 || i11 <= 0 || i10 <= 0 || this.f12353sk == 0.0f) {
            return;
        }
        TextPaint paint = getPaint();
        float fMax = this.f12353sk;
        int iHnj = hnj(text, paint, i10, fMax);
        while (iHnj > i11 && fMax > this.gjv) {
            Log.d("UGTextView", "resizeText: targetSize=" + fMax + "; mMinTextSize=" + this.gjv);
            fMax = Math.max(fMax - 1.0f, this.gjv);
            iHnj = hnj(text, paint, i10, fMax);
        }
        Log.d("UGTextView", "resizeText: targetSize: ".concat(String.valueOf(fMax)));
        setTextSize(0, fMax);
        setLineSpacing(this.dse, this.dkl);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i10, float f10) {
        super.setTextSize(i10, f10);
        this.f12353sk = getTextSize();
    }

    private int hnj(CharSequence charSequence, TextPaint textPaint, int i10, float f10) {
        TextPaint textPaint2 = new TextPaint(textPaint);
        textPaint2.setTextSize(f10);
        return new StaticLayout(charSequence, textPaint2, i10, Layout.Alignment.ALIGN_NORMAL, this.dkl, this.dse, true).getHeight();
    }
}
