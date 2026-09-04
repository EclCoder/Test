package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class aq extends View implements com.bytedance.sdk.component.utils.xyo.hnj {
    private int aq;
    private boolean bug;
    private List<View> dkl;
    private ViewTreeObserver.OnGlobalLayoutListener dnm;
    private boolean dse;
    private View gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private boolean f13572hn;
    private boolean hnj;
    private final Runnable mjg;
    private final Handler ojm;
    private boolean orl;
    private hnj qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private List<View> f13573sk;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private final AtomicBoolean f13574ta;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface hnj {
        void hn();

        void hnj();

        void hnj(View view);

        void hnj(boolean z10);
    }

    public aq(Context context, View view, boolean z10) {
        super(oj.hnj());
        this.ojm = new com.bytedance.sdk.component.utils.xyo(fc.hn().getLooper(), this);
        this.f13574ta = new AtomicBoolean(true);
        this.orl = false;
        this.mjg = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.aq.3
            @Override // java.lang.Runnable
            public void run() {
                if (aq.this.qor != null) {
                    aq.this.qor.hnj(aq.this.gjv);
                }
            }
        };
        this.bug = z10;
        this.gjv = view;
        setLayoutParams(new ViewGroup.LayoutParams(0, 0));
        this.dnm = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bytedance.sdk.openadsdk.core.aq.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                if (aq.this.orl) {
                    return;
                }
                aq.this.sk();
                aq.this.gjv();
            }
        };
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.dse = false;
        hn();
        if (this.dnm != null) {
            getViewTreeObserver().addOnGlobalLayoutListener(this.dnm);
        }
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        sk();
        this.dse = true;
        qor();
        hnj(false);
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        hn();
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        qor();
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        hnj hnjVar = this.qor;
        if (hnjVar != null) {
            hnjVar.hnj(z10);
        }
    }

    public void setAdType(int i10) {
        this.aq = i10;
    }

    public void setCallback(hnj hnjVar) {
        this.qor = hnjVar;
    }

    public void setNeedCheckingShow(boolean z10) {
        this.f13572hn = z10;
        if (!z10 && this.hnj) {
            sk();
        } else {
            if (!z10 || this.hnj) {
                return;
            }
            gjv();
        }
    }

    public void setRefClickViews(List<View> list) {
        this.f13573sk = list;
    }

    public void setRefCreativeViews(List<View> list) {
        this.dkl = list;
    }

    private boolean dkl() {
        View view = this.gjv;
        if (view instanceof com.bytedance.sdk.openadsdk.core.ojm.apu) {
            return ((com.bytedance.sdk.openadsdk.core.ojm.apu) view).as();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gjv() {
        if (!this.f13572hn || this.hnj) {
            return;
        }
        this.hnj = true;
        this.ojm.sendEmptyMessage(1);
    }

    private void hn() {
        hnj hnjVar;
        if (!this.f13574ta.getAndSet(false) || (hnjVar = this.qor) == null) {
            return;
        }
        hnjVar.hnj();
    }

    private void qor() {
        hnj hnjVar;
        if (this.f13574ta.getAndSet(true) || (hnjVar = this.qor) == null) {
            return;
        }
        hnjVar.hn();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sk() {
        if (this.hnj) {
            this.ojm.removeCallbacksAndMessages(null);
            this.hnj = false;
        }
    }

    public void hnj() {
        hnj(this.f13573sk, (com.bytedance.sdk.openadsdk.core.qor.qor) null);
        hnj(this.dkl, (com.bytedance.sdk.openadsdk.core.qor.qor) null);
    }

    public void hnj(List<View> list, com.bytedance.sdk.openadsdk.core.qor.qor qorVar) {
        if (com.bytedance.sdk.component.utils.orl.hn(list)) {
            for (View view : list) {
                if (view != null) {
                    view.setOnClickListener(qorVar);
                    view.setOnTouchListener(qorVar);
                }
            }
        }
    }

    @Override // com.bytedance.sdk.component.utils.xyo.hnj
    public void hnj(Message message) {
        if (message.what == 1 && this.hnj) {
            if (dkl() && fvt.hnj(this.gjv, 20, this.aq, this.bug)) {
                sk();
                this.orl = true;
                fc.qor().post(this.mjg);
                hnj(true);
                return;
            }
            this.ojm.sendEmptyMessageDelayed(1, 1000L);
        }
    }

    private void hnj(final boolean z10) {
        final ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        com.bytedance.sdk.component.utils.ojm.hn().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.aq.2
            @Override // java.lang.Runnable
            public void run() {
                ViewTreeObserver viewTreeObserver2;
                if (aq.this.dnm != null && (viewTreeObserver2 = viewTreeObserver) != null) {
                    try {
                        viewTreeObserver2.removeOnGlobalLayoutListener(aq.this.dnm);
                    } catch (Exception unused) {
                    }
                }
                if (z10) {
                    aq.this.dnm = null;
                }
            }
        });
    }
}
