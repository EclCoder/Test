package com.bytedance.adsdk.ugeno.core.hn;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.bytedance.adsdk.ugeno.core.fc;
import com.bytedance.adsdk.ugeno.core.orl;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class qor {
    private final int dkl;
    private Context gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private float f12204hn;
    private float hnj;
    private orl qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private boolean f12205sk;

    public qor(Context context, orl orlVar) {
        this.gjv = context;
        this.qor = orlVar;
        this.dkl = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    public boolean hnj(fc fcVar, com.bytedance.adsdk.ugeno.hn.qor qorVar, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.hnj = motionEvent.getX();
            this.f12204hn = motionEvent.getY();
        } else if (action != 1) {
            if (action == 2) {
                float x10 = motionEvent.getX();
                float y10 = motionEvent.getY();
                if (Math.abs(x10 - this.hnj) >= this.dkl || Math.abs(y10 - this.f12204hn) >= this.dkl) {
                    this.f12205sk = true;
                }
            } else if (action == 3) {
                this.f12205sk = false;
            }
        } else {
            if (this.f12205sk) {
                this.f12205sk = false;
                return false;
            }
            float x11 = motionEvent.getX();
            float y11 = motionEvent.getY();
            if (Math.abs(x11 - this.hnj) >= this.dkl || Math.abs(y11 - this.f12204hn) >= this.dkl) {
                this.f12205sk = false;
            } else if (fcVar != null) {
                fcVar.hnj(this.qor, qorVar, qorVar);
                return true;
            }
        }
        return true;
    }
}
