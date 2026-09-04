package com.hecorat.screenrecorder.free.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class AutoResizeTextView extends AppCompatTextView {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final RectF f23556h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private RectF f23557i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private SparseIntArray f23558j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private TextPaint f23559k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f23560l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f23561m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f23562n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f23563o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f23564p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f23565q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f23566r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f23567s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final b f23568t;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements b {
        a() {
        }

        @Override // com.hecorat.screenrecorder.free.widget.AutoResizeTextView.b
        public int a(int i10, RectF rectF) {
            AutoResizeTextView.this.f23559k.setTextSize(i10);
            String string = AutoResizeTextView.this.getText().toString();
            if (AutoResizeTextView.this.getMaxLines() == 1) {
                AutoResizeTextView.this.f23556h.bottom = AutoResizeTextView.this.f23559k.getFontSpacing();
                AutoResizeTextView.this.f23556h.right = AutoResizeTextView.this.f23559k.measureText(string);
            } else {
                StaticLayout staticLayout = new StaticLayout(string, AutoResizeTextView.this.f23559k, AutoResizeTextView.this.f23564p, Layout.Alignment.ALIGN_NORMAL, AutoResizeTextView.this.f23561m, AutoResizeTextView.this.f23562n, true);
                if (AutoResizeTextView.this.getMaxLines() != -1 && staticLayout.getLineCount() > AutoResizeTextView.this.getMaxLines()) {
                    return 1;
                }
                AutoResizeTextView.this.f23556h.bottom = staticLayout.getHeight();
                int lineWidth = -1;
                for (int i11 = 0; i11 < staticLayout.getLineCount(); i11++) {
                    if (lineWidth < staticLayout.getLineWidth(i11)) {
                        lineWidth = (int) staticLayout.getLineWidth(i11);
                    }
                }
                AutoResizeTextView.this.f23556h.right = lineWidth;
            }
            AutoResizeTextView.this.f23556h.offsetTo(0.0f, 0.0f);
            return rectF.contains(AutoResizeTextView.this.f23556h) ? -1 : 1;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private interface b {
        int a(int i10, RectF rectF);
    }

    public AutoResizeTextView(Context context) {
        super(context);
        this.f23556h = new RectF();
        this.f23561m = 1.0f;
        this.f23562n = 0.0f;
        this.f23563o = 20.0f;
        this.f23566r = true;
        this.f23568t = new a();
        A();
    }

    private void A() {
        this.f23559k = new TextPaint(getPaint());
        this.f23560l = getTextSize();
        this.f23557i = new RectF();
        this.f23558j = new SparseIntArray();
        if (this.f23565q == 0) {
            this.f23565q = -1;
        }
        this.f23567s = true;
    }

    private void B() {
        x(getText().toString());
    }

    private void x(String str) {
        if (this.f23567s) {
            int i10 = (int) this.f23563o;
            int measuredHeight = (getMeasuredHeight() - getCompoundPaddingBottom()) - getCompoundPaddingTop();
            int measuredWidth = (getMeasuredWidth() - getCompoundPaddingLeft()) - getCompoundPaddingRight();
            this.f23564p = measuredWidth;
            RectF rectF = this.f23557i;
            rectF.right = measuredWidth;
            rectF.bottom = measuredHeight;
            super.setTextSize(0, z(i10, (int) this.f23560l, this.f23568t, rectF));
        }
    }

    private static int y(int i10, int i11, b bVar, RectF rectF) {
        int i12 = i11 - 1;
        int i13 = i10;
        while (i10 <= i12) {
            i13 = (i10 + i12) >>> 1;
            int iA = bVar.a(i13, rectF);
            if (iA >= 0) {
                if (iA <= 0) {
                    break;
                }
                i13--;
                i12 = i13;
            } else {
                int i14 = i13 + 1;
                i13 = i10;
                i10 = i14;
            }
        }
        return i13;
    }

    private int z(int i10, int i11, b bVar, RectF rectF) {
        if (!this.f23566r) {
            return y(i10, i11, bVar, rectF);
        }
        String string = getText().toString();
        int length = string == null ? 0 : string.length();
        int i12 = this.f23558j.get(length);
        if (i12 != 0) {
            return i12;
        }
        int iY = y(i10, i11, bVar, rectF);
        this.f23558j.put(length, iY);
        return iY;
    }

    @Override // android.widget.TextView
    public int getMaxLines() {
        return this.f23565q;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        this.f23558j.clear();
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 == i12 && i11 == i13) {
            return;
        }
        B();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        B();
    }

    @Override // android.widget.TextView
    public void setLineSpacing(float f10, float f11) {
        super.setLineSpacing(f10, f11);
        this.f23561m = f11;
        this.f23562n = f10;
    }

    @Override // android.widget.TextView
    public void setLines(int i10) {
        super.setLines(i10);
        this.f23565q = i10;
        B();
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i10) {
        super.setMaxLines(i10);
        this.f23565q = i10;
        B();
    }

    public void setMinTextSize(float f10) {
        this.f23563o = f10;
        B();
    }

    @Override // android.widget.TextView
    public void setSingleLine() {
        super.setSingleLine();
        this.f23565q = 1;
        B();
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        x(charSequence.toString());
    }

    @Override // android.widget.TextView
    public void setTextSize(float f10) {
        this.f23560l = f10;
        this.f23558j.clear();
        x(getText().toString());
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z10) {
        super.setSingleLine(z10);
        if (z10) {
            this.f23565q = 1;
        } else {
            this.f23565q = -1;
        }
        B();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void setTextSize(int i10, float f10) {
        Resources resources;
        Context context = getContext();
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        this.f23560l = TypedValue.applyDimension(i10, f10, resources.getDisplayMetrics());
        this.f23558j.clear();
        x(getText().toString());
    }

    public AutoResizeTextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f23556h = new RectF();
        this.f23561m = 1.0f;
        this.f23562n = 0.0f;
        this.f23563o = 20.0f;
        this.f23566r = true;
        this.f23568t = new a();
        A();
    }
}
