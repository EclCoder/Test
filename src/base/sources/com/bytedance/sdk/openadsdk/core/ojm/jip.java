package com.bytedance.sdk.openadsdk.core.ojm;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.utils.sq;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class jip extends com.bytedance.sdk.openadsdk.core.mjg.hn.dkl implements View.OnClickListener {
    private boolean uua;

    public jip(Context context, com.bytedance.sdk.openadsdk.core.model.as asVar, String str, com.bytedance.sdk.openadsdk.gjv.dse dseVar, boolean z10) {
        super(context, asVar, false, str, false, false, dseVar);
        this.uua = false;
        setOnClickListener(this);
        setNeedNativeVideoPlayBtnVisible(false);
        setNeedSelfManagerVideo(!z10);
    }

    private void oj() {
        sq.hnj((View) this.dse, 0);
        sq.hnj((View) this.aq, 0);
        sq.hnj((View) this.f13794ta, 8);
    }

    private void xn() {
        dse();
        RelativeLayout relativeLayout = this.dse;
        if (relativeLayout != null) {
            if (relativeLayout.getVisibility() == 0) {
                return;
            } else {
                com.bytedance.sdk.openadsdk.apu.hn.hn().hnj(this.hnj.pwt().J(), this.hnj.pwt().D(), this.hnj.pwt().p(), this.aq, this.hnj);
            }
        }
        oj();
    }

    public void gjv() {
        ImageView imageView = this.f13794ta;
        if (imageView != null) {
            sq.hnj((View) imageView, 8);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.hn.dkl
    protected void hn() {
        if (!this.f13793sk || !Cdo.hn(this.bug)) {
            this.gjv = false;
        }
        super.hn();
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.hn.dkl
    protected void hnj(boolean z10) {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        ImageView imageView = this.ojm;
        if (imageView != null && imageView.getVisibility() == 0) {
            sq.sk(this.dse);
        }
        qor();
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.hn.dkl, android.view.View
    public void onWindowFocusChanged(boolean z10) {
        ImageView imageView = this.ojm;
        if (imageView == null || imageView.getVisibility() != 0) {
            super.onWindowFocusChanged(z10);
        } else {
            xn();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.hn.dkl, android.view.View
    protected void onWindowVisibilityChanged(int i10) {
        ImageView imageView = this.ojm;
        if (imageView == null || imageView.getVisibility() != 0) {
            super.onWindowVisibilityChanged(i10);
        } else {
            xn();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.hn.dkl
    protected void qor() {
        if (this.uua) {
            super.qor();
        }
    }

    public void setCanInterruptVideoPlay(boolean z10) {
        this.uua = z10;
    }

    public void setShouldCheckNetChange(boolean z10) {
        com.bytedance.sdk.openadsdk.core.mjg.hn.qor qorVar = this.f13791hn;
        if (qorVar != null) {
            qorVar.sk(z10);
        }
    }

    public void setShowAdInteractionView(boolean z10) {
        com.bytedance.sdk.openadsdk.core.mjg.hn.sk skVarBug;
        com.bytedance.sdk.openadsdk.core.mjg.hn.qor qorVar = this.f13791hn;
        if (qorVar == null || (skVarBug = qorVar.bug()) == null) {
            return;
        }
        skVarBug.hnj(z10);
    }

    protected void sk() {
        dse();
        sq.hnj((View) this.dse, 0);
    }

    public void hnj(int i10, int i11) {
        com.bytedance.sdk.openadsdk.core.mjg.hn.qor qorVar = this.f13791hn;
        if (qorVar != null) {
            qorVar.hn(i10, i11);
        }
    }
}
