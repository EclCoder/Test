package com.google.android.material.internal;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class StaticLayoutBuilderCompat {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    static final int f20284o = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CharSequence f20285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TextPaint f20286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f20287c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f20289e;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f20296l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private v f20298n;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f20288d = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Layout.Alignment f20290f = Layout.Alignment.ALIGN_NORMAL;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f20291g = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f20292h = 0.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f20293i = 1.0f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f20294j = f20284o;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f20295k = true;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private TextUtils.TruncateAt f20297m = null;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class StaticLayoutBuilderCompatException extends Exception {
    }

    private StaticLayoutBuilderCompat(CharSequence charSequence, TextPaint textPaint, int i10) {
        this.f20285a = charSequence;
        this.f20286b = textPaint;
        this.f20287c = i10;
        this.f20289e = charSequence.length();
    }

    public static StaticLayoutBuilderCompat b(CharSequence charSequence, TextPaint textPaint, int i10) {
        return new StaticLayoutBuilderCompat(charSequence, textPaint, i10);
    }

    public StaticLayout a() {
        if (this.f20285a == null) {
            this.f20285a = "";
        }
        int iMax = Math.max(0, this.f20287c);
        CharSequence charSequenceEllipsize = this.f20285a;
        if (this.f20291g == 1) {
            charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, this.f20286b, iMax, this.f20297m);
        }
        int iMin = Math.min(charSequenceEllipsize.length(), this.f20289e);
        this.f20289e = iMin;
        if (this.f20296l && this.f20291g == 1) {
            this.f20290f = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequenceEllipsize, this.f20288d, iMin, this.f20286b, iMax);
        builderObtain.setAlignment(this.f20290f);
        builderObtain.setIncludePad(this.f20295k);
        builderObtain.setTextDirection(this.f20296l ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f20297m;
        if (truncateAt != null) {
            builderObtain.setEllipsize(truncateAt);
        }
        builderObtain.setMaxLines(this.f20291g);
        float f10 = this.f20292h;
        if (f10 != 0.0f || this.f20293i != 1.0f) {
            builderObtain.setLineSpacing(f10, this.f20293i);
        }
        if (this.f20291g > 1) {
            builderObtain.setHyphenationFrequency(this.f20294j);
        }
        v vVar = this.f20298n;
        if (vVar != null) {
            vVar.a(builderObtain);
        }
        return builderObtain.build();
    }

    public StaticLayoutBuilderCompat c(Layout.Alignment alignment) {
        this.f20290f = alignment;
        return this;
    }

    public StaticLayoutBuilderCompat d(TextUtils.TruncateAt truncateAt) {
        this.f20297m = truncateAt;
        return this;
    }

    public StaticLayoutBuilderCompat e(int i10) {
        this.f20294j = i10;
        return this;
    }

    public StaticLayoutBuilderCompat f(boolean z10) {
        this.f20295k = z10;
        return this;
    }

    public StaticLayoutBuilderCompat g(boolean z10) {
        this.f20296l = z10;
        return this;
    }

    public StaticLayoutBuilderCompat h(float f10, float f11) {
        this.f20292h = f10;
        this.f20293i = f11;
        return this;
    }

    public StaticLayoutBuilderCompat i(int i10) {
        this.f20291g = i10;
        return this;
    }

    public StaticLayoutBuilderCompat j(v vVar) {
        this.f20298n = vVar;
        return this;
    }
}
