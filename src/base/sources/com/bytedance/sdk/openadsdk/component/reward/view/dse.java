package com.bytedance.sdk.openadsdk.component.reward.view;

import android.view.View;
import com.bytedance.sdk.openadsdk.component.reward.hnj.fc;
import com.bytedance.sdk.openadsdk.component.reward.hnj.uua;
import com.bytedance.sdk.openadsdk.utils.jip;
import com.bytedance.sdk.openadsdk.utils.sq;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class dse {
    private uua gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private RFEndCardBackUpLayout f13547hn;
    private final com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnj;
    private boolean qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private boolean f13548sk;

    public dse(com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar) {
        this.hnj = hnjVar;
    }

    public void gjv() {
        uua uuaVar = this.gjv;
        if (uuaVar != null) {
            uuaVar.hn();
        }
    }

    public void hn() {
        this.f13548sk = true;
        sq.hnj((View) this.f13547hn, 0);
    }

    public void hnj() {
        if (this.qor) {
            return;
        }
        this.qor = true;
        RFEndCardBackUpLayout rFEndCardBackUpLayout = (RFEndCardBackUpLayout) this.hnj.fvt.findViewById(jip.aip);
        this.f13547hn = rFEndCardBackUpLayout;
        if (rFEndCardBackUpLayout != null) {
            rFEndCardBackUpLayout.init(this.hnj);
        }
        if (this.hnj.f13456hn.qs()) {
            this.gjv = new uua(this.hnj);
        }
    }

    public void qor() {
        uua uuaVar = this.gjv;
        if (uuaVar != null) {
            uuaVar.hnj();
        }
    }

    public boolean sk() {
        return this.f13548sk;
    }

    public void hnj(com.bytedance.sdk.openadsdk.core.qor.sk skVar) {
        RFEndCardBackUpLayout rFEndCardBackUpLayout = this.f13547hn;
        if (rFEndCardBackUpLayout == null) {
            return;
        }
        sq.hnj(rFEndCardBackUpLayout, new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.dse.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        }, "TTBaseVideoActivity#mFLEndCardBackupContainer");
        uua uuaVar = this.gjv;
        if (uuaVar != null) {
            uuaVar.hnj(skVar);
        }
    }

    public boolean hnj(fc fcVar) {
        this.f13548sk = true;
        uua uuaVar = this.gjv;
        if (uuaVar == null || !uuaVar.hnj(fcVar)) {
            return false;
        }
        sq.hnj((View) this.f13547hn, 0);
        return true;
    }

    public void hnj(int i10) {
        RFEndCardBackUpLayout rFEndCardBackUpLayout = this.f13547hn;
        if (rFEndCardBackUpLayout == null) {
            return;
        }
        rFEndCardBackUpLayout.setShownAdCount(i10);
    }
}
