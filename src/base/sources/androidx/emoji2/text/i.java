package androidx.emoji2.text;

import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class i extends ReplacementSpan {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o f3891b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Paint.FontMetricsInt f3890a = new Paint.FontMetricsInt();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private short f3892c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private short f3893d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f3894e = 1.0f;

    i(o oVar) {
        m0.g.h(oVar, "rasterizer cannot be null");
        this.f3891b = oVar;
    }

    public final o a() {
        return this.f3891b;
    }

    final int b() {
        return this.f3892c;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        paint.getFontMetricsInt(this.f3890a);
        Paint.FontMetricsInt fontMetricsInt2 = this.f3890a;
        this.f3894e = (Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f) / this.f3891b.e();
        this.f3893d = (short) (this.f3891b.e() * this.f3894e);
        short sI = (short) (this.f3891b.i() * this.f3894e);
        this.f3892c = sI;
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt3 = this.f3890a;
            fontMetricsInt.ascent = fontMetricsInt3.ascent;
            fontMetricsInt.descent = fontMetricsInt3.descent;
            fontMetricsInt.top = fontMetricsInt3.top;
            fontMetricsInt.bottom = fontMetricsInt3.bottom;
        }
        return sI;
    }
}
