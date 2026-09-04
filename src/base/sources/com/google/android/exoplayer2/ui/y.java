package com.google.android.exoplayer2.ui;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class y {
    private int A;
    private int B;
    private int C;
    private int D;
    private StaticLayout E;
    private StaticLayout F;
    private int G;
    private int H;
    private int I;
    private Rect J;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f18694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f18695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f18696c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f18697d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f18698e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final TextPaint f18699f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Paint f18700g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Paint f18701h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private CharSequence f18702i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Layout.Alignment f18703j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Bitmap f18704k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f18705l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f18706m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f18707n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f18708o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f18709p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private float f18710q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f18711r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f18712s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f18713t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f18714u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f18715v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f18716w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private float f18717x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private float f18718y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private float f18719z;

    public y(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.lineSpacingExtra, R.attr.lineSpacingMultiplier}, 0, 0);
        this.f18698e = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f18697d = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        typedArrayObtainStyledAttributes.recycle();
        float fRound = Math.round((context.getResources().getDisplayMetrics().densityDpi * 2.0f) / 160.0f);
        this.f18694a = fRound;
        this.f18695b = fRound;
        this.f18696c = fRound;
        TextPaint textPaint = new TextPaint();
        this.f18699f = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        Paint paint = new Paint();
        this.f18700g = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f18701h = paint2;
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
    }

    private static boolean a(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence != charSequence2) {
            return charSequence != null && charSequence.equals(charSequence2);
        }
        return true;
    }

    private void c(Canvas canvas) {
        canvas.drawBitmap(this.f18704k, (Rect) null, this.J, this.f18701h);
    }

    private void d(Canvas canvas, boolean z10) {
        if (z10) {
            e(canvas);
            return;
        }
        ob.a.e(this.J);
        ob.a.e(this.f18704k);
        c(canvas);
    }

    private void e(Canvas canvas) {
        Canvas canvas2;
        StaticLayout staticLayout = this.E;
        StaticLayout staticLayout2 = this.F;
        if (staticLayout == null || staticLayout2 == null) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(this.G, this.H);
        if (Color.alpha(this.f18714u) > 0) {
            this.f18700g.setColor(this.f18714u);
            canvas2 = canvas;
            canvas2.drawRect(-this.I, 0.0f, staticLayout.getWidth() + this.I, staticLayout.getHeight(), this.f18700g);
        } else {
            canvas2 = canvas;
        }
        int i10 = this.f18716w;
        if (i10 == 1) {
            this.f18699f.setStrokeJoin(Paint.Join.ROUND);
            this.f18699f.setStrokeWidth(this.f18694a);
            this.f18699f.setColor(this.f18715v);
            this.f18699f.setStyle(Paint.Style.FILL_AND_STROKE);
            staticLayout2.draw(canvas2);
        } else if (i10 == 2) {
            TextPaint textPaint = this.f18699f;
            float f10 = this.f18695b;
            float f11 = this.f18696c;
            textPaint.setShadowLayer(f10, f11, f11, this.f18715v);
        } else if (i10 == 3 || i10 == 4) {
            boolean z10 = i10 == 3;
            int i11 = z10 ? -1 : this.f18715v;
            int i12 = z10 ? this.f18715v : -1;
            float f12 = this.f18695b / 2.0f;
            this.f18699f.setColor(this.f18712s);
            this.f18699f.setStyle(Paint.Style.FILL);
            float f13 = -f12;
            this.f18699f.setShadowLayer(this.f18695b, f13, f13, i11);
            staticLayout2.draw(canvas2);
            this.f18699f.setShadowLayer(this.f18695b, f12, f12, i12);
        }
        this.f18699f.setColor(this.f18712s);
        this.f18699f.setStyle(Paint.Style.FILL);
        staticLayout.draw(canvas2);
        this.f18699f.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        canvas2.restoreToCount(iSave);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0056  */
    /* JADX WARN: Code duplicated, block: B:16:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x005b  */
    private void f() {
        float f10;
        int i10;
        float f11;
        Bitmap bitmap = this.f18704k;
        int i11 = this.C;
        int i12 = this.A;
        int i13 = this.D;
        int i14 = this.B;
        float f12 = i11 - i12;
        float f13 = i12 + (this.f18708o * f12);
        float f14 = i13 - i14;
        float f15 = i14 + (this.f18705l * f14);
        int iRound = Math.round(f12 * this.f18710q);
        float f16 = this.f18711r;
        int iRound2 = f16 != -3.4028235E38f ? Math.round(f14 * f16) : Math.round(iRound * (bitmap.getHeight() / bitmap.getWidth()));
        int i15 = this.f18709p;
        if (i15 != 2) {
            if (i15 == 1) {
                f10 = iRound / 2;
            }
            int iRound3 = Math.round(f13);
            i10 = this.f18707n;
            if (i10 == 2) {
                if (i10 == 1) {
                    f11 = iRound2 / 2;
                }
                int iRound4 = Math.round(f15);
                this.J = new Rect(iRound3, iRound4, iRound + iRound3, iRound2 + iRound4);
            }
            f11 = iRound2;
            f15 -= f11;
            int iRound5 = Math.round(f15);
            this.J = new Rect(iRound3, iRound5, iRound + iRound3, iRound2 + iRound5);
        }
        f10 = iRound;
        f13 -= f10;
        int iRound6 = Math.round(f13);
        i10 = this.f18707n;
        if (i10 == 2) {
            if (i10 == 1) {
                f11 = iRound2 / 2;
            }
            int iRound7 = Math.round(f15);
            this.J = new Rect(iRound6, iRound7, iRound + iRound6, iRound2 + iRound7);
        }
        f11 = iRound2;
        f15 -= f11;
        int iRound8 = Math.round(f15);
        this.J = new Rect(iRound6, iRound8, iRound + iRound6, iRound2 + iRound8);
    }

    private void g() {
        int iMax;
        int iMin;
        int iRound;
        CharSequence charSequence = this.f18702i;
        SpannableStringBuilder spannableStringBuilder = charSequence instanceof SpannableStringBuilder ? (SpannableStringBuilder) charSequence : new SpannableStringBuilder(this.f18702i);
        int i10 = this.C - this.A;
        int i11 = this.D - this.B;
        this.f18699f.setTextSize(this.f18717x);
        int i12 = (int) ((this.f18717x * 0.125f) + 0.5f);
        int i13 = i12 * 2;
        int i14 = i10 - i13;
        float f10 = this.f18710q;
        float f11 = -3.4028235E38f;
        if (f10 != -3.4028235E38f) {
            i14 = (int) (i14 * f10);
        }
        int i15 = i14;
        String str = "SubtitlePainter";
        if (i15 <= 0) {
            ob.u.i("SubtitlePainter", "Skipped drawing subtitle cue (insufficient space)");
            return;
        }
        if (this.f18718y > 0.0f) {
            spannableStringBuilder.setSpan(new AbsoluteSizeSpan((int) this.f18718y), 0, spannableStringBuilder.length(), 16711680);
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
        if (this.f18716w == 1) {
            ForegroundColorSpan[] foregroundColorSpanArr = (ForegroundColorSpan[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), ForegroundColorSpan.class);
            int length = foregroundColorSpanArr.length;
            int i16 = 0;
            while (i16 < length) {
                spannableStringBuilder2.removeSpan(foregroundColorSpanArr[i16]);
                i16++;
                f11 = f11;
            }
        }
        float f12 = f11;
        if (Color.alpha(this.f18713t) > 0) {
            int i17 = this.f18716w;
            if (i17 == 0 || i17 == 2) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f18713t), 0, spannableStringBuilder.length(), 16711680);
            } else {
                spannableStringBuilder2.setSpan(new BackgroundColorSpan(this.f18713t), 0, spannableStringBuilder2.length(), 16711680);
            }
        }
        Layout.Alignment alignment = this.f18703j;
        if (alignment == null) {
            alignment = Layout.Alignment.ALIGN_CENTER;
        }
        Layout.Alignment alignment2 = alignment;
        StaticLayout staticLayout = new StaticLayout(spannableStringBuilder, this.f18699f, i15, alignment2, this.f18697d, this.f18698e, true);
        this.E = staticLayout;
        int height = staticLayout.getHeight();
        int lineCount = this.E.getLineCount();
        int iMax2 = 0;
        int i18 = 0;
        while (i18 < lineCount) {
            iMax2 = Math.max((int) Math.ceil(this.E.getLineWidth(i18)), iMax2);
            i18++;
            str = str;
        }
        String str2 = str;
        if (this.f18710q == f12 || iMax2 >= i15) {
            i15 = iMax2;
        }
        int i19 = i15 + i13;
        float f13 = this.f18708o;
        if (f13 != f12) {
            int iRound2 = Math.round(i10 * f13);
            int i20 = this.A;
            int i21 = iRound2 + i20;
            int i22 = this.f18709p;
            if (i22 == 1) {
                i21 = ((i21 * 2) - i19) / 2;
            } else if (i22 == 2) {
                i21 -= i19;
            }
            iMax = Math.max(i21, i20);
            iMin = Math.min(i19 + iMax, this.C);
        } else {
            iMax = ((i10 - i19) / 2) + this.A;
            iMin = iMax + i19;
        }
        int i23 = iMin - iMax;
        if (i23 <= 0) {
            ob.u.i(str2, "Skipped drawing subtitle cue (invalid horizontal positioning)");
            return;
        }
        float f14 = this.f18705l;
        if (f14 != f12) {
            if (this.f18706m == 0) {
                iRound = Math.round(i11 * f14) + this.B;
                int i24 = this.f18707n;
                if (i24 == 2) {
                    iRound -= height;
                } else if (i24 == 1) {
                    iRound = ((iRound * 2) - height) / 2;
                }
            } else {
                int lineBottom = this.E.getLineBottom(0) - this.E.getLineTop(0);
                float f15 = this.f18705l;
                if (f15 >= 0.0f) {
                    iRound = Math.round(f15 * lineBottom) + this.B;
                } else {
                    iRound = Math.round((f15 + 1.0f) * lineBottom) + this.D;
                    iRound -= height;
                }
            }
            int i25 = iRound + height;
            int i26 = this.D;
            if (i25 > i26) {
                iRound = i26 - height;
            } else {
                int i27 = this.B;
                if (iRound < i27) {
                    iRound = i27;
                }
            }
        } else {
            iRound = (this.D - height) - ((int) (i11 * this.f18719z));
        }
        this.E = new StaticLayout(spannableStringBuilder, this.f18699f, i23, alignment2, this.f18697d, this.f18698e, true);
        this.F = new StaticLayout(spannableStringBuilder2, this.f18699f, i23, alignment2, this.f18697d, this.f18698e, true);
        this.G = iMax;
        this.H = iRound;
        this.I = i12;
    }

    public void b(bb.b bVar, mb.b bVar2, float f10, float f11, float f12, Canvas canvas, int i10, int i11, int i12, int i13) {
        int i14;
        boolean z10 = bVar.f8744d == null;
        if (!z10) {
            i14 = -16777216;
        } else if (TextUtils.isEmpty(bVar.f8741a)) {
            return;
        } else {
            i14 = bVar.f8752l ? bVar.f8753m : bVar2.f45415c;
        }
        if (a(this.f18702i, bVar.f8741a) && r0.c(this.f18703j, bVar.f8742b) && this.f18704k == bVar.f8744d && this.f18705l == bVar.f8745e && this.f18706m == bVar.f8746f && r0.c(Integer.valueOf(this.f18707n), Integer.valueOf(bVar.f8747g)) && this.f18708o == bVar.f8748h && r0.c(Integer.valueOf(this.f18709p), Integer.valueOf(bVar.f8749i)) && this.f18710q == bVar.f8750j && this.f18711r == bVar.f8751k && this.f18712s == bVar2.f45413a && this.f18713t == bVar2.f45414b && this.f18714u == i14 && this.f18716w == bVar2.f45416d && this.f18715v == bVar2.f45417e && r0.c(this.f18699f.getTypeface(), bVar2.f45418f) && this.f18717x == f10 && this.f18718y == f11 && this.f18719z == f12 && this.A == i10 && this.B == i11 && this.C == i12 && this.D == i13) {
            d(canvas, z10);
            return;
        }
        this.f18702i = bVar.f8741a;
        this.f18703j = bVar.f8742b;
        this.f18704k = bVar.f8744d;
        this.f18705l = bVar.f8745e;
        this.f18706m = bVar.f8746f;
        this.f18707n = bVar.f8747g;
        this.f18708o = bVar.f8748h;
        this.f18709p = bVar.f8749i;
        this.f18710q = bVar.f8750j;
        this.f18711r = bVar.f8751k;
        this.f18712s = bVar2.f45413a;
        this.f18713t = bVar2.f45414b;
        this.f18714u = i14;
        this.f18716w = bVar2.f45416d;
        this.f18715v = bVar2.f45417e;
        this.f18699f.setTypeface(bVar2.f45418f);
        this.f18717x = f10;
        this.f18718y = f11;
        this.f18719z = f12;
        this.A = i10;
        this.B = i11;
        this.C = i12;
        this.D = i13;
        if (z10) {
            ob.a.e(this.f18702i);
            g();
        } else {
            ob.a.e(this.f18704k);
            f();
        }
        d(canvas, z10);
    }
}
