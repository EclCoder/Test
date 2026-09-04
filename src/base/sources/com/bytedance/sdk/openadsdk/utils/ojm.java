package com.bytedance.sdk.openadsdk.utils;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class ojm implements mjg, Runnable {
    private boolean aq;
    private boolean dkl;
    private final hnj dse;
    private long gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final Activity f14700hn;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private long f14701sk;
    private final AtomicBoolean ojm = new AtomicBoolean(false);
    private final Handler qor = new Handler(Looper.getMainLooper());
    private View hnj = gjv();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface hnj {
        void hn();

        View hnj();
    }

    private ojm(Activity activity, int i10, hnj hnjVar) {
        this.dse = hnjVar;
        this.f14700hn = activity;
        this.gjv = i10;
    }

    private void dkl() {
        Activity activity;
        View childAt;
        if (this.dkl || (activity = this.f14700hn) == null || activity.isFinishing() || this.f14700hn.isDestroyed()) {
            return;
        }
        if (this.hnj == null) {
            this.hnj = gjv();
        }
        View view = this.hnj;
        if (view != null) {
            if (hn(view)) {
                hnj(this.hnj);
                View view2 = this.hnj;
                if ((view2 instanceof ViewGroup) && ((ViewGroup) view2).getChildCount() > 0 && (childAt = ((ViewGroup) this.hnj).getChildAt(0)) != null && hn(childAt)) {
                    hnj(childAt);
                }
                hnj hnjVar = this.dse;
                if (hnjVar != null) {
                    hnjVar.hn();
                }
            }
            dse();
        }
        this.dkl = true;
    }

    private void dse() {
        ViewParent parent = this.hnj.getParent();
        if (parent instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup.indexOfChild(this.hnj) != viewGroup.getChildCount() - 1) {
                this.hnj.bringToFront();
            }
        }
    }

    private View gjv() {
        hnj hnjVar = this.dse;
        if (hnjVar != null) {
            return hnjVar.hnj();
        }
        return null;
    }

    public static mjg hnj(Activity activity, hnj hnjVar) {
        int iKo = com.bytedance.sdk.openadsdk.core.settings.dnm.hn().ko();
        return iKo < 0 ? new mjg() { // from class: com.bytedance.sdk.openadsdk.utils.ojm.1
            @Override // com.bytedance.sdk.openadsdk.utils.mjg
            public void hnj() {
            }

            @Override // com.bytedance.sdk.openadsdk.utils.mjg
            public void hnj(long j10) {
            }

            @Override // com.bytedance.sdk.openadsdk.utils.mjg
            public void hn() {
            }

            @Override // com.bytedance.sdk.openadsdk.utils.mjg
            public void qor() {
            }
        } : new ojm(activity, Math.min(iKo, 50) * 1000, hnjVar);
    }

    private void sk() {
        this.aq = false;
        this.f14701sk = SystemClock.elapsedRealtime();
        Handler handler = this.qor;
        if (handler != null) {
            handler.postDelayed(this, this.gjv);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.utils.mjg
    public void hn() {
        if (this.f14701sk <= 0 || this.dkl) {
            return;
        }
        if (!this.aq) {
            this.gjv -= SystemClock.elapsedRealtime() - this.f14701sk;
        }
        this.aq = true;
        if (this.gjv <= 0) {
            dkl();
            return;
        }
        Handler handler = this.qor;
        if (handler != null) {
            try {
                handler.removeCallbacks(this);
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.apu.qor(th2.getMessage(), new Object[0]);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.utils.mjg
    public void qor() {
        if (this.dkl) {
            return;
        }
        this.dkl = true;
        Handler handler = this.qor;
        if (handler != null) {
            try {
                handler.removeCallbacks(this);
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.apu.qor(th2.getMessage(), new Object[0]);
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        dkl();
    }

    @Override // com.bytedance.sdk.openadsdk.utils.mjg
    public void hnj(long j10) {
        if (this.ojm.compareAndSet(false, true)) {
            if (j10 < 0) {
                j10 = 0;
            }
            this.gjv += j10;
            sk();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.utils.mjg
    public void hnj() {
        if (this.f14701sk == 0 || !this.aq) {
            return;
        }
        sk();
    }

    private void hnj(View view) {
        view.setVisibility(0);
        view.setAlpha(1.0f);
    }

    private boolean hn(View view) {
        if (view == null) {
            return true;
        }
        return !view.isShown() || ((double) view.getAlpha()) <= 0.9d;
    }
}
