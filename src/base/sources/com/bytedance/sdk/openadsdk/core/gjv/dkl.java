package com.bytedance.sdk.openadsdk.core.gjv;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import com.bytedance.sdk.component.utils.xyo;
import com.bytedance.sdk.openadsdk.core.fc;
import com.bytedance.sdk.openadsdk.core.fvt;
import com.bytedance.sdk.openadsdk.utils.ua;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class dkl extends com.bytedance.adsdk.ugeno.dkl.hnj<View> implements xyo.hnj {
    private hn aq;
    private boolean dkl;
    private final ViewTreeObserver.OnScrollChangedListener dnm;
    private boolean dse;
    private final Handler gjv;
    private hnj ojm;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private long f13735sk;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private final Runnable f13736ta;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface hn {
        void hnj(boolean z10);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface hnj {
        void hnj(boolean z10);
    }

    public dkl(Context context) {
        super(context);
        this.gjv = new xyo(fc.hn().getLooper(), this);
        this.dkl = true;
        this.dse = true;
        this.f13736ta = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.gjv.dkl.1
            @Override // java.lang.Runnable
            public void run() {
                if (dkl.this.ojm != null) {
                    dkl.this.ojm.hnj(dkl.this.dse);
                }
            }
        };
        this.dnm = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.bytedance.sdk.openadsdk.core.gjv.dkl.2
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public void onScrollChanged() {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                if (jElapsedRealtime - dkl.this.f13735sk > 500) {
                    dkl.this.f13735sk = jElapsedRealtime;
                    dkl.this.gjv.sendEmptyMessageDelayed(1, 500L);
                }
            }
        };
    }

    private void dse() {
        boolean zHnj = fvt.hnj(this, 50, -1, false);
        this.dse = zHnj;
        if (zHnj == this.dkl) {
            return;
        }
        this.dkl = zHnj;
        ua.hnj(this.f13736ta);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnScrollChangedListener(this.dnm);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnScrollChangedListener(this.dnm);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        hn hnVar = this.aq;
        if (hnVar != null) {
            hnVar.hnj(z10);
        }
    }

    public void setSwiperVisibleChangeListener(hnj hnjVar) {
        this.ojm = hnjVar;
    }

    public void setSwiperWindowFocusChangedListener(hn hnVar) {
        this.aq = hnVar;
    }

    @Override // com.bytedance.adsdk.ugeno.dkl.hnj
    public View ta(int i10) {
        return (View) this.hnj.get(i10);
    }

    @Override // com.bytedance.sdk.component.utils.xyo.hnj
    public void hnj(Message message) {
        if (message.what == 1) {
            dse();
        }
    }
}
