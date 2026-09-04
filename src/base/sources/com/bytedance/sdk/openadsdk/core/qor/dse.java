package com.bytedance.sdk.openadsdk.core.qor;

import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.openadsdk.utils.jip;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class dse extends qor {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final com.bytedance.sdk.openadsdk.core.orl.hnj f14158hn;
    private final String hnj;
    private qor qor;

    public dse(String str, com.bytedance.sdk.openadsdk.core.orl.hnj hnjVar) {
        this(str, hnjVar, null);
    }

    public void hnj(qor qorVar) {
        this.qor = qorVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.qor.qor, android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return super.onTouch(view, motionEvent);
    }

    public dse(String str, com.bytedance.sdk.openadsdk.core.orl.hnj hnjVar, qor qorVar) {
        this.hnj = str;
        this.f14158hn = hnjVar;
        this.qor = qorVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.qor.qor
    protected void hnj(View view, float f10, float f11, float f12, float f13, SparseArray<qor.hnj> sparseArray, boolean z10) {
        com.bytedance.sdk.openadsdk.core.orl.hnj hnjVar = this.f14158hn;
        if (hnjVar != null) {
            hnjVar.sk(this.hnj);
        }
        if (view != null) {
            if (view.getId() == jip.f14679sk) {
                view.setTag(570425345, "VAST_TITLE");
            } else if (view.getId() == jip.ojm) {
                view.setTag(570425345, "VAST_DESCRIPTION");
            } else {
                view.setTag(570425345, this.hnj);
            }
        }
        qor qorVar = this.qor;
        if (qorVar != null) {
            qorVar.f44do = this.f44do;
            qorVar.tu = this.tu;
            qorVar.tgn = this.tgn;
            int i10 = this.tgn;
            qorVar.xyo = i10;
            qorVar.f14172vf = i10;
            qorVar.hnj(view, f10, f11, f12, f13, sparseArray, z10);
        }
    }
}
