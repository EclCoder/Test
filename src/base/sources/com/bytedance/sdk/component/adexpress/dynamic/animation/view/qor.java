package com.bytedance.sdk.component.adexpress.dynamic.animation.view;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.dnm;
import com.bytedance.sdk.component.adexpress.dynamic.gjv.dse;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class qor {
    private int dkl;
    private int gjv;
    Paint hnj;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private int f12524sk;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    Path f12523hn = new Path();
    Path qor = new Path();

    public qor() {
        Paint paint = new Paint();
        this.hnj = paint;
        paint.setAntiAlias(true);
    }

    public void hnj(Canvas canvas, IAnimation iAnimation, View view) {
        int iIntValue;
        String str;
        float[] fArrHn;
        int iIntValue2 = 0;
        if (iAnimation.getRippleValue() != 0.0f) {
            if (com.bytedance.sdk.component.adexpress.hnj.hnj.hnj.hnj().qor() != null) {
                try {
                    str = (String) view.getTag(2097610712);
                    try {
                        fArrHn = dse.hn(str);
                    } catch (Exception unused) {
                        fArrHn = null;
                    }
                } catch (Exception unused2) {
                    str = "";
                }
                if (str.startsWith("#")) {
                    this.hnj.setColor(Color.parseColor(str));
                    this.hnj.setAlpha(90);
                } else if (fArrHn != null) {
                    this.hnj.setColor(com.bytedance.sdk.component.adexpress.gjv.dse.hnj(fArrHn[3] * (1.0f - iAnimation.getRippleValue()), fArrHn[0] / 256.0f, fArrHn[1] / 256.0f, fArrHn[2] / 256.0f));
                }
            }
            ((ViewGroup) view.getParent()).setClipChildren(true);
            int i10 = this.gjv;
            int i11 = this.f12524sk;
            canvas.drawCircle(i10, i11, Math.min(i10, i11) * 2 * iAnimation.getRippleValue(), this.hnj);
        }
        if (iAnimation.getShineValue() != 0.0f) {
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).setClipChildren(true);
            }
            if (view.getParent().getParent() != null) {
                ((ViewGroup) view.getParent().getParent()).setClipChildren(true);
            }
            this.f12523hn.reset();
            try {
                iIntValue = ((Integer) view.getTag(2097610711)).intValue();
            } catch (Exception unused3) {
                iIntValue = 0;
            }
            if (iIntValue >= 0) {
                int shineValue = ((int) ((((this.gjv * 4) + (iIntValue * 2)) + (this.f12524sk * 2)) * iAnimation.getShineValue())) - ((this.f12524sk * 2) + iIntValue);
                float f10 = shineValue;
                int i12 = this.f12524sk;
                this.hnj.setShader(new LinearGradient(f10, 0.0f, ((iIntValue + i12) / 2) + shineValue, i12 / 2, new int[]{Color.parseColor("#20ffffff"), Color.parseColor("#60ffffff"), Color.parseColor("#65ffffff")}, (float[]) null, Shader.TileMode.MIRROR));
                this.hnj.setStrokeWidth(this.gjv * 2);
                Path path = this.qor;
                if (path != null) {
                    canvas.clipPath(path, Region.Op.INTERSECT);
                }
                int i13 = shineValue + iIntValue;
                int i14 = this.f12524sk;
                canvas.drawLine(f10, 0.0f, i13 + i14, i14, this.hnj);
            }
        }
        if (iAnimation.getMarqueeValue() != 0.0f) {
            try {
                iIntValue2 = ((Integer) view.getTag(2097610709)).intValue();
            } catch (Exception unused4) {
            }
            if (iIntValue2 >= 0) {
                this.f12523hn.reset();
                this.f12523hn.moveTo(0.0f, 0.0f);
                this.f12523hn.lineTo(this.gjv * 2, 0.0f);
                this.f12523hn.lineTo(this.gjv * 2, this.f12524sk * 2);
                this.f12523hn.lineTo(0.0f, this.f12524sk * 2);
                this.f12523hn.lineTo(0.0f, 0.0f);
                this.hnj.setShader(new LinearGradient(0.0f, 0.0f, this.gjv * 2, this.f12524sk * 2, new int[]{(int) (iAnimation.getMarqueeValue() * (-65536.0f)), (int) ((1.0f - iAnimation.getMarqueeValue()) * (-65536.0f))}, (float[]) null, Shader.TileMode.CLAMP));
                this.hnj.setColor(-65536);
                this.hnj.setStyle(Paint.Style.STROKE);
                this.hnj.setStrokeWidth(iIntValue2);
                canvas.drawPath(this.f12523hn, this.hnj);
            }
        }
    }

    public void hnj(View view, float f10) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int i10 = this.dkl;
        int i11 = (int) (i10 * f10);
        layoutParams.width = i11;
        view.setTranslationX((i10 - i11) / 2);
        if (view instanceof dnm) {
            int i12 = 0;
            while (true) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (i12 >= viewGroup.getChildCount()) {
                    break;
                }
                viewGroup.getChildAt(i12).setTranslationX((-(this.dkl - layoutParams.width)) / 2);
                i12++;
            }
        }
        view.setLayoutParams(layoutParams);
    }

    public void hnj(View view, int i10, int i11) {
        String str;
        this.gjv = i10 / 2;
        this.f12524sk = i11 / 2;
        if (this.dkl == 0 && view.getLayoutParams().width > 0) {
            this.dkl = view.getLayoutParams().width;
        }
        try {
            str = (String) view.getTag(2097610710);
            try {
                this.qor.addRoundRect(new RectF(0.0f, 0.0f, i10, i11), i11 / 2, i11 / 2, Path.Direction.CW);
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            str = "";
        }
        if (TtmlNode.RIGHT.equals(str)) {
            view.setPivotX(this.gjv * 2);
            view.setPivotY(this.f12524sk);
        } else if (TtmlNode.LEFT.equals(str)) {
            view.setPivotX(0.0f);
            view.setPivotY(this.f12524sk);
        } else {
            view.setPivotX(this.gjv);
            view.setPivotY(this.f12524sk);
        }
    }
}
