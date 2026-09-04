package com.bytedance.adsdk.ugeno.hnj;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hnj extends AnimatorListenerAdapter {
    private String aq;
    private int dkl = 1;
    private com.bytedance.adsdk.ugeno.hnj.hnj.hnj dse;
    private Context gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private qor f12318hn;
    private com.bytedance.adsdk.ugeno.hn.qor hnj;
    private hn ojm;
    private ValueAnimator qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private int f12319sk;

    public hnj(Context context, com.bytedance.adsdk.ugeno.hn.qor qorVar, qor qorVar2) {
        this.hnj = qorVar;
        this.f12318hn = qorVar2;
        this.gjv = context;
    }

    public ValueAnimator gjv() {
        com.bytedance.adsdk.ugeno.hnj.hn.hnj qorVar;
        qor qorVar2 = this.f12318hn;
        if (qorVar2 == null || this.hnj == null) {
            return null;
        }
        Map<String, TreeMap<Float, String>> mapHn = qorVar2.hn();
        ArrayList arrayList = new ArrayList();
        if (mapHn != null && !mapHn.isEmpty()) {
            for (Map.Entry<String, TreeMap<Float, String>> entry : mapHn.entrySet()) {
                if (entry != null) {
                    String key = entry.getKey();
                    String strQor = sk.hnj(key).qor();
                    strQor.getClass();
                    switch (strQor) {
                        case "int":
                            qorVar = new com.bytedance.adsdk.ugeno.hnj.hn.qor(this.gjv, this.hnj, key, entry.getValue());
                            break;
                        case "float":
                            qorVar = new com.bytedance.adsdk.ugeno.hnj.hn.hn(this.gjv, this.hnj, key, entry.getValue());
                            break;
                        case "point":
                            qorVar = new com.bytedance.adsdk.ugeno.hnj.hn.gjv(this.gjv, this.hnj, key, entry.getValue());
                            break;
                        default:
                            qorVar = null;
                            break;
                    }
                    if (qorVar != null) {
                        arrayList.addAll(qorVar.sk());
                    }
                }
            }
        }
        JSONObject jSONObjectHnj = this.f12318hn.hnj();
        if (jSONObjectHnj != null) {
            com.bytedance.adsdk.ugeno.hnj.hnj.hnj hnjVarHnj = com.bytedance.adsdk.ugeno.hnj.hnj.hnj.C0171hnj.hnj(this.hnj, jSONObjectHnj);
            this.dse = hnjVarHnj;
            if (hnjVarHnj != null) {
                arrayList.addAll(hnjVarHnj.qor());
            }
        }
        final View viewDnm = this.hnj.dnm();
        if (viewDnm == null) {
            return null;
        }
        final qor.hnj hnjVarDse = this.f12318hn.dse();
        if (hnjVarDse != null) {
            viewDnm.post(new Runnable() { // from class: com.bytedance.adsdk.ugeno.hnj.hnj.1
                @Override // java.lang.Runnable
                public void run() {
                    int width = viewDnm.getWidth();
                    int height = viewDnm.getHeight();
                    viewDnm.setPivotX(gjv.hnj(hnjVarDse.hnj, width));
                    viewDnm.setPivotY(gjv.hnj(hnjVarDse.f12334hn, height));
                }
            });
        }
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(viewDnm, (PropertyValuesHolder[]) arrayList.toArray(new PropertyValuesHolder[0]));
        this.f12319sk = gjv.hnj(this.f12318hn.gjv());
        objectAnimatorOfPropertyValuesHolder.setDuration(this.f12318hn.qor());
        int i10 = this.f12319sk;
        if (i10 != Integer.MIN_VALUE) {
            objectAnimatorOfPropertyValuesHolder.setRepeatCount(i10);
        }
        this.dkl = this.f12318hn.ta();
        this.aq = this.f12318hn.ojm();
        objectAnimatorOfPropertyValuesHolder.setStartDelay(this.f12318hn.dkl());
        objectAnimatorOfPropertyValuesHolder.setRepeatMode(gjv.hnj(this.f12318hn.sk()));
        objectAnimatorOfPropertyValuesHolder.setInterpolator(gjv.hn(this.f12318hn.aq()));
        objectAnimatorOfPropertyValuesHolder.addListener(this);
        this.qor = objectAnimatorOfPropertyValuesHolder;
        return objectAnimatorOfPropertyValuesHolder;
    }

    public void hn() {
        ValueAnimator valueAnimator = this.qor;
        if (valueAnimator != null) {
            valueAnimator.start();
        }
    }

    public void hnj() {
        ValueAnimator valueAnimator = this.qor;
        if (valueAnimator == null || this.dkl == 0 || this.f12319sk == Integer.MIN_VALUE) {
            return;
        }
        valueAnimator.start();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        hn hnVar = this.ojm;
        if (hnVar != null) {
            hnVar.hn();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        super.onAnimationStart(animator);
        hn hnVar = this.ojm;
        if (hnVar != null) {
            hnVar.hnj();
        }
    }

    public void qor() {
        ValueAnimator valueAnimator = this.qor;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    public String sk() {
        return this.aq;
    }

    public void hn(Canvas canvas) {
        com.bytedance.adsdk.ugeno.hnj.hnj.hnj hnjVar = this.dse;
        if (hnjVar != null) {
            hnjVar.hn(canvas);
        }
    }

    public void hnj(hn hnVar) {
        this.ojm = hnVar;
    }

    public void hnj(Canvas canvas) {
        com.bytedance.adsdk.ugeno.hnj.hnj.hnj hnjVar = this.dse;
        if (hnjVar != null) {
            hnjVar.hnj(canvas);
        }
    }

    public void hnj(int i10, int i11) {
        com.bytedance.adsdk.ugeno.hnj.hnj.hnj hnjVar = this.dse;
        if (hnjVar != null) {
            hnjVar.hnj(i10, i11);
        }
    }
}
