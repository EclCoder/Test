package com.bytedance.sdk.openadsdk.component.reward.hnj;

import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.as;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class gjv {
    private boolean gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final as f13448hn;
    com.bytedance.sdk.openadsdk.eum.hnj.hnj.qor hnj;
    private final String qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private final com.bytedance.sdk.openadsdk.component.reward.hnj.hnj f13449sk;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface hnj {
        void hnj(View view, float f10, float f11, float f12, float f13, SparseArray<com.bytedance.sdk.openadsdk.core.qor.qor.hnj> sparseArray, int i10, int i11, int i12);

        void hnj(String str, JSONObject jSONObject);
    }

    public gjv(com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar) {
        this.f13449sk = hnjVar;
        this.f13448hn = hnjVar.f13456hn;
        this.qor = hnjVar.f13461sk;
    }

    private void gjv() {
        if (this.f13448hn.rg() == 4) {
            this.hnj = com.bytedance.sdk.openadsdk.eum.hnj.hnj.gjv.hnj(this.f13449sk.jbd, this.qor);
        }
        if (this.hnj == null) {
            this.hnj = com.bytedance.sdk.openadsdk.eum.hnj.hnj.gjv.hnj(this.f13449sk.orp, this.qor);
        }
    }

    public void hn() {
        com.bytedance.sdk.openadsdk.eum.hnj.hnj.qor qorVar = this.hnj;
        if (qorVar != null) {
            qorVar.hnj(this.f13448hn);
        }
    }

    public void hnj() {
        if (this.gjv) {
            return;
        }
        this.gjv = true;
        gjv();
    }

    public com.bytedance.sdk.openadsdk.eum.hnj.hnj.qor qor() {
        return this.hnj;
    }

    public void hnj(View view, float f10, float f11, float f12, float f13, SparseArray<com.bytedance.sdk.openadsdk.core.qor.qor.hnj> sparseArray, int i10, int i11, int i12, hnj hnjVar) {
        if (this.hnj != null) {
            int id2 = view.getId();
            if (id2 == com.bytedance.sdk.openadsdk.utils.jip.dse) {
                hnjVar.hnj("click_play_star_level", null);
                return;
            }
            if (id2 == com.bytedance.sdk.openadsdk.utils.jip.dkl) {
                hnjVar.hnj("click_play_star_nums", null);
                return;
            } else if (id2 == com.bytedance.sdk.openadsdk.utils.jip.f14679sk) {
                hnjVar.hnj("click_play_source", null);
                return;
            } else {
                if (id2 == com.bytedance.sdk.openadsdk.utils.jip.gjv) {
                    hnjVar.hnj("click_play_logo", null);
                    return;
                }
                return;
            }
        }
        hnjVar.hnj(view, f10, f11, f12, f13, sparseArray, i10, i11, i12);
    }
}
