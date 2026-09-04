package com.bytedance.adsdk.ugeno.core;

import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.mp3.Annu.HqKnbV;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class ta {
    private int dkl;
    private String dse;
    private View gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private hnj f12222hn;
    Paint hnj;
    private AnimatorSet qor = new AnimatorSet();

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private int f12223sk;

    public ta(View view, hnj hnjVar) {
        this.gjv = view;
        this.f12222hn = hnjVar;
        Paint paint = new Paint();
        this.hnj = paint;
        paint.setAntiAlias(true);
    }

    public void hn() {
        AnimatorSet animatorSet = this.qor;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public void hnj() {
        ArrayList arrayList = new ArrayList();
        List<hnj.C0165hnj> listQor = this.f12222hn.qor();
        if (listQor == null || listQor.size() <= 0) {
            return;
        }
        for (hnj.C0165hnj c0165hnj : listQor) {
            if (c0165hnj != null) {
                ObjectAnimator objectAnimator = new ObjectAnimator();
                objectAnimator.setDuration(c0165hnj.hnj());
                if (TextUtils.equals(c0165hnj.sk(), "translateX")) {
                    objectAnimator.setPropertyName("translationX");
                } else if (TextUtils.equals(c0165hnj.sk(), "translateY")) {
                    objectAnimator.setPropertyName("translationY");
                } else {
                    objectAnimator.setPropertyName(c0165hnj.sk());
                }
                objectAnimator.setStartDelay(c0165hnj.gjv());
                objectAnimator.setTarget(this.gjv);
                if (TextUtils.equals(c0165hnj.sk(), TtmlNode.ATTR_TTS_BACKGROUND_COLOR)) {
                    objectAnimator.setIntValues((int) c0165hnj.dkl(), (int) c0165hnj.dse());
                    Log.d("UGenAnimation", "playAnimation: from = " + c0165hnj.dkl() + "; to=" + c0165hnj.dse());
                } else {
                    objectAnimator.setFloatValues(c0165hnj.dkl(), c0165hnj.dse());
                }
                int iHn = (int) this.f12222hn.hn();
                if (iHn != 0) {
                    objectAnimator.setRepeatCount(iHn);
                } else {
                    objectAnimator.setRepeatCount((int) c0165hnj.hn());
                }
                if (TextUtils.equals(c0165hnj.sk(), TtmlNode.ATTR_TTS_BACKGROUND_COLOR)) {
                    objectAnimator.setEvaluator(new ArgbEvaluator());
                }
                String strDkl = this.f12222hn.dkl();
                if (TextUtils.isEmpty(strDkl)) {
                    strDkl = c0165hnj.qor();
                }
                if (TextUtils.equals(strDkl, "reverse")) {
                    objectAnimator.setRepeatMode(2);
                } else {
                    objectAnimator.setRepeatMode(1);
                }
                if (c0165hnj.aq() != null && c0165hnj.aq().length > 0) {
                    objectAnimator.setFloatValues(c0165hnj.aq());
                }
                if (TextUtils.equals(c0165hnj.sk(), "rotationX")) {
                    this.gjv.post(new Runnable() { // from class: com.bytedance.adsdk.ugeno.core.ta.1
                        @Override // java.lang.Runnable
                        public void run() {
                            ta.this.gjv.setPivotX(ta.this.gjv.getWidth() / 2.0f);
                            ta.this.gjv.setPivotY(ta.this.gjv.getHeight());
                        }
                    });
                }
                if (TextUtils.equals(c0165hnj.sk(), "ripple")) {
                    this.dse = c0165hnj.ta();
                }
                String strOjm = c0165hnj.ojm();
                strOjm.getClass();
                switch (strOjm) {
                    case "accelerate":
                        objectAnimator.setInterpolator(new AccelerateInterpolator());
                        break;
                    case "decelerate":
                        objectAnimator.setInterpolator(new DecelerateInterpolator());
                        break;
                    case "linear":
                    case "standard":
                        objectAnimator.setInterpolator(new LinearInterpolator());
                        break;
                    case "accelerateDecelerate":
                        objectAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
                        break;
                }
                arrayList.add(objectAnimator);
            }
        }
        if (this.f12222hn.gjv() != 0) {
            this.qor.setDuration(this.f12222hn.gjv());
        }
        this.qor.setStartDelay(this.f12222hn.sk());
        if (TextUtils.equals(this.f12222hn.hnj(), "sequentially")) {
            this.qor.playSequentially(arrayList);
        } else {
            this.qor.playTogether(arrayList);
        }
        this.qor.start();
    }

    public void hnj(Canvas canvas, IAnimation iAnimation) {
        try {
            if (iAnimation.getRipple() == 0.0f || TextUtils.isEmpty(this.dse)) {
                return;
            }
            this.hnj.setColor(com.bytedance.adsdk.ugeno.dse.hnj.hnj(this.dse));
            this.hnj.setAlpha(90);
            ((ViewGroup) this.gjv.getParent()).setClipChildren(true);
            int i10 = this.f12223sk;
            int i11 = this.dkl;
            canvas.drawCircle(i10, i11, Math.min(i10, i11) * 2 * iAnimation.getRipple(), this.hnj);
        } catch (Throwable th2) {
            Log.d(HqKnbV.pVCgTkmxTXYagoL, "ripple animation error " + th2.getMessage());
        }
    }

    public void hnj(int i10, int i11) {
        this.f12223sk = i10 / 2;
        this.dkl = i11 / 2;
    }
}
