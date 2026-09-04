package com.bytedance.sdk.openadsdk.wu.hnj;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.orl.dkl;
import com.bytedance.sdk.openadsdk.utils.sq;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hn extends hnj {
    private String dkl;
    private final FrameLayout gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private volatile boolean f14786hn;
    private dkl qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private FrameLayout f14787sk;

    public hn(Context context, as asVar, int i10, boolean z10, FrameLayout frameLayout, String str) {
        super(context, asVar, i10, z10, frameLayout);
        this.gjv = frameLayout;
        this.dkl = str;
        hn(false);
        int iQor = sq.qor(context);
        int iSk = sq.sk(context);
        if (i10 == 1) {
            if (iQor <= iSk) {
                this.hnj.layout(0, 0, iQor, iSk);
                return;
            }
        } else {
            if (i10 != 2) {
                return;
            }
            if (iQor > iSk) {
                this.hnj.layout(0, 0, iQor, iSk);
                return;
            }
        }
        this.hnj.layout(0, 0, iSk, iQor);
    }

    public void aq() {
        super.hnj(true, new dkl() { // from class: com.bytedance.sdk.openadsdk.wu.hnj.hn.1
            @Override // com.bytedance.sdk.openadsdk.orl.dkl
            public void hnj() {
                if (hn.this.qor != null) {
                    hn.this.qor.hnj();
                } else {
                    hn.this.f14786hn = true;
                }
            }
        });
    }

    public String ojm() {
        return this.dkl;
    }

    public void hnj(FrameLayout frameLayout, dkl dklVar) {
        this.f14787sk = frameLayout;
        frameLayout.addView(this.gjv);
        this.qor = dklVar;
        if (this.f14786hn) {
            this.qor.hnj();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.wu.hnj.hnj
    public void hnj() {
        this.f14787sk.setVisibility(0);
        super.hnj();
    }
}
