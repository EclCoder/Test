package com.bytedance.sdk.openadsdk.component.reward.hnj;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.utils.sq;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class bug {
    private boolean dkl;
    private final hnj gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    com.bytedance.sdk.component.adexpress.dynamic.gjv f13432hn;
    com.bytedance.sdk.openadsdk.component.reward.top.qor hnj;
    private final Activity qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private boolean f13433sk = false;

    public bug(hnj hnjVar) {
        this.qor = hnjVar.orp;
        this.gjv = hnjVar;
    }

    public void gjv(boolean z10) {
        com.bytedance.sdk.openadsdk.component.reward.top.qor qorVar;
        if (this.dkl || (qorVar = this.hnj) == null) {
            return;
        }
        qorVar.setShowSkip(z10);
    }

    public void hn(boolean z10) {
        com.bytedance.sdk.openadsdk.component.reward.top.qor qorVar = this.hnj;
        if (qorVar != null) {
            qorVar.setSoundMute(z10);
        }
        com.bytedance.sdk.component.adexpress.dynamic.gjv gjvVar = this.f13432hn;
        if (gjvVar != null) {
            gjvVar.setSoundMute(z10);
        }
    }

    public void hnj() {
        if (this.f13433sk) {
            return;
        }
        this.f13433sk = true;
        hnj hnjVar = this.gjv;
        com.bytedance.sdk.openadsdk.component.reward.top.qor qorVar = hnjVar.tll;
        if (qorVar != null) {
            this.hnj = qorVar;
            this.dkl = true;
        } else {
            this.hnj = (com.bytedance.sdk.openadsdk.component.reward.top.qor) hnjVar.fvt.findViewById(com.bytedance.sdk.openadsdk.utils.jip.f52if);
        }
        com.bytedance.sdk.openadsdk.component.reward.top.qor qorVar2 = this.hnj;
        if (qorVar2 != null) {
            qorVar2.hnj(this.gjv.f13456hn);
            if (this.gjv.f13456hn.qs()) {
                hnj(false);
            } else {
                hnj(this.gjv.f13456hn.ij());
            }
        }
    }

    public void qor(boolean z10) {
        com.bytedance.sdk.openadsdk.component.reward.top.qor qorVar;
        if (this.dkl || (qorVar = this.hnj) == null) {
            return;
        }
        qorVar.setShowSound(z10);
    }

    public void sk(boolean z10) {
        com.bytedance.sdk.openadsdk.component.reward.top.qor qorVar;
        if (this.dkl || (qorVar = this.hnj) == null) {
            return;
        }
        qorVar.setSkipEnable(z10);
    }

    public void gjv() {
        com.bytedance.sdk.openadsdk.component.reward.top.qor qorVar = this.hnj;
        if (qorVar != null) {
            qorVar.clickSkip();
        }
    }

    public void qor() {
        com.bytedance.sdk.openadsdk.component.reward.top.qor qorVar;
        if (this.dkl || (qorVar = this.hnj) == null) {
            return;
        }
        qorVar.showSkipButton();
    }

    public void sk() {
        com.bytedance.sdk.openadsdk.component.reward.top.qor qorVar;
        if (this.dkl || (qorVar = this.hnj) == null) {
            return;
        }
        qorVar.setSkipInvisiable();
    }

    public void hn() {
        com.bytedance.sdk.openadsdk.component.reward.top.qor qorVar;
        if (this.dkl || (qorVar = this.hnj) == null) {
            return;
        }
        qorVar.showCountDownText();
    }

    public void hnj(boolean z10) {
        com.bytedance.sdk.openadsdk.component.reward.top.qor qorVar;
        if (this.dkl || (qorVar = this.hnj) == null) {
            return;
        }
        qorVar.setShowDislike(z10);
    }

    public void hnj(String str, CharSequence charSequence) {
        com.bytedance.sdk.openadsdk.component.reward.top.qor qorVar;
        if (this.dkl || (qorVar = this.hnj) == null) {
            return;
        }
        qorVar.setTime(String.valueOf(str), charSequence);
    }

    public void hnj(CharSequence charSequence) {
        com.bytedance.sdk.openadsdk.component.reward.top.qor qorVar;
        if (this.dkl || (qorVar = this.hnj) == null) {
            return;
        }
        qorVar.setSkipText(charSequence);
    }

    public void hnj(String str) {
        com.bytedance.sdk.openadsdk.component.reward.top.qor qorVar = this.hnj;
        if (qorVar != null) {
            qorVar.clickSound(str);
        }
    }

    public void hnj(com.bytedance.sdk.openadsdk.component.reward.top.hn hnVar) {
        com.bytedance.sdk.openadsdk.component.reward.top.qor qorVar = this.hnj;
        if (qorVar != null) {
            qorVar.setListener(hnVar);
        }
    }

    public void hnj(com.bytedance.sdk.component.adexpress.dynamic.gjv gjvVar) {
        this.f13432hn = gjvVar;
    }

    public void hnj(int i10) {
        View viewFindViewById;
        com.bytedance.sdk.openadsdk.component.reward.top.qor qorVar = this.hnj;
        if (qorVar == null || qorVar.getITopLayout() == null || i10 == 0 || (viewFindViewById = this.hnj.getITopLayout().findViewById(520093713)) == null || !(viewFindViewById.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) || viewFindViewById.getWidth() <= 0 || viewFindViewById.getVisibility() != 0) {
            return;
        }
        int[] iArr = new int[2];
        viewFindViewById.getLocationOnScreen(iArr);
        int width = i10 - (iArr[0] + viewFindViewById.getWidth());
        if (width < sq.hn(this.qor, 16.0f)) {
            ((ViewGroup.MarginLayoutParams) viewFindViewById.getLayoutParams()).rightMargin += sq.hn(this.qor, 16.0f) - width;
            viewFindViewById.requestLayout();
        }
    }
}
