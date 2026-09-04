package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.utils.vf;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class bug extends com.bytedance.sdk.openadsdk.core.dkl.qor {
    private int aq;
    private Runnable dkl;
    private boolean dse;
    private long gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    protected boolean f13275hn;
    protected dnm hnj;
    private int qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private Runnable f13276sk;

    public bug(Context context) {
        super(context);
        this.gjv = 10L;
        this.f13275hn = true;
        this.dse = false;
        this.aq = 1;
        qor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hn(int i10) {
        dnm dnmVar = this.hnj;
        if (dnmVar != null) {
            dnmVar.hnj(i10);
        }
        if (i10 == 100 && this.f13275hn) {
            hn();
        }
    }

    private void qor() {
        setBackgroundColor(Color.parseColor("#2E2E2E"));
        setVisibility(8);
    }

    public dnm getLoadingStyle() {
        return this.hnj;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        qor(configuration.orientation);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f13276sk;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.f13276sk = null;
        }
    }

    public void setOnlyLoading(boolean z10) {
        this.dse = z10;
    }

    private void qor(int i10) {
        if (this.aq != i10) {
            this.aq = i10;
        }
    }

    public void hnj(as asVar) {
        com.bytedance.sdk.openadsdk.core.model.eum eumVarM31do;
        if (asVar != null && (eumVarM31do = asVar.m31do()) != null) {
            this.gjv = eumVarM31do.hnj();
        }
        dnm dnmVar = new dnm(getContext());
        this.hnj = dnmVar;
        View viewHnj = dnmVar.hnj();
        if (viewHnj.getParent() instanceof ViewGroup) {
            ((ViewGroup) viewHnj.getParent()).removeView(viewHnj);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        viewHnj.setLayoutParams(layoutParams);
        if (asVar != null) {
            boolean zHw = asVar.hw();
            com.bytedance.sdk.openadsdk.core.widget.uua uuaVarHn = this.hnj.hn();
            if (uuaVarHn != null) {
                if (!this.dse && !zHw) {
                    com.bytedance.sdk.openadsdk.core.model.oj ojVarMn = (asVar.mn() == null || TextUtils.isEmpty(asVar.mn().hnj())) ? null : asVar.mn();
                    if (ojVarMn != null && !TextUtils.isEmpty(ojVarMn.hnj())) {
                        try {
                            com.bytedance.sdk.openadsdk.ta.gjv.hnj(ojVarMn).qor(1).hnj(new com.bytedance.sdk.openadsdk.ta.hn(asVar, ojVarMn.hnj(), new vf(uuaVarHn)));
                        } catch (Throwable unused) {
                            uuaVarHn.setVisibility(8);
                        }
                    } else {
                        uuaVarHn.setVisibility(8);
                    }
                } else {
                    uuaVarHn.setVisibility(8);
                }
            }
            com.bytedance.sdk.openadsdk.core.dkl.aq aqVarQor = this.hnj.qor();
            if (aqVarQor != null) {
                if (!this.dse && !zHw) {
                    if (!TextUtils.isEmpty(asVar.kby())) {
                        aqVarQor.setText(asVar.kby());
                    } else {
                        aqVarQor.setVisibility(8);
                    }
                } else {
                    aqVarQor.setText("Loading");
                }
            }
        }
        addView(viewHnj);
        qor(getResources().getConfiguration().orientation);
    }

    public void hn() {
        this.qor = 0;
        dnm dnmVar = this.hnj;
        if (dnmVar != null) {
            removeView(dnmVar.hnj);
            this.hnj.gjv();
        }
        setVisibility(8);
        this.hnj = null;
        Runnable runnable = this.f13276sk;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        Runnable runnable2 = this.dkl;
        if (runnable2 != null) {
            removeCallbacks(runnable2);
        }
        this.dkl = null;
        this.f13276sk = null;
    }

    public void hnj() {
        post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.bug.1
            @Override // java.lang.Runnable
            public void run() {
                bug bugVar = bug.this;
                if (bugVar.hnj != null) {
                    bugVar.setVisibility(0);
                }
            }
        });
        if (this.f13276sk == null) {
            this.f13276sk = new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.bug.2
                @Override // java.lang.Runnable
                public void run() {
                    bug.this.hn();
                }
            };
        }
        postDelayed(this.f13276sk, this.gjv * 1000);
    }

    public void hnj(int i10) {
        if (i10 == 100 || Math.abs(i10 - this.qor) >= 7) {
            this.qor = i10;
            if (q6.a.a()) {
                hn(this.qor);
                return;
            }
            if (this.dkl == null) {
                this.dkl = new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.bug.3
                    @Override // java.lang.Runnable
                    public void run() {
                        bug bugVar = bug.this;
                        bugVar.hn(bugVar.qor);
                    }
                };
            }
            post(this.dkl);
        }
    }
}
