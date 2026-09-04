package com.bytedance.sdk.openadsdk.core.bug.hn.sk;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.adsdk.ugeno.core.bug;
import com.bytedance.adsdk.ugeno.gjv;
import com.bytedance.adsdk.ugeno.hn.qor;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hn extends com.bytedance.adsdk.ugeno.hn.hnj<hnj> {
    private JSONArray dlk;
    private int iwu;

    /* JADX INFO: renamed from: vk, reason: collision with root package name */
    private int f13668vk;

    public hn(Context context) {
        super(context);
        this.iwu = 0;
        this.f13668vk = 0;
    }

    private void gjv() {
        for (int i10 = 0; i10 < ((com.bytedance.adsdk.ugeno.hn.hnj) this).hnj.size(); i10++) {
            qor<View> qorVar = ((com.bytedance.adsdk.ugeno.hn.hnj) this).hnj.get(i10);
            if (qorVar != null) {
                bug bugVar = new bug(this.f12280hn);
                bugVar.hnj(this.jle);
                ((hnj) this.f12293sk).hnj(bugVar.hnj(qorVar.nyv(), this.gjv, (JSONObject) null));
            }
        }
    }

    private void qor() {
        List<qor<View>> list = ((com.bytedance.adsdk.ugeno.hn.hnj) this).hnj;
        if (list == null || list.isEmpty()) {
            return;
        }
        qor<View> qorVar = ((com.bytedance.adsdk.ugeno.hn.hnj) this).hnj.get(0);
        if (this.dlk == null) {
            return;
        }
        for (int i10 = 0; i10 < this.dlk.length(); i10++) {
            bug bugVar = new bug(this.f12280hn);
            bugVar.hnj(this.jle);
            try {
                JSONObject jSONObjectOptJSONObject = this.dlk.optJSONObject(i10);
                if (jSONObjectOptJSONObject != null) {
                    if (jSONObjectOptJSONObject.has("$chunk")) {
                        this.gjv.put("$item", jSONObjectOptJSONObject.optJSONArray("$chunk"));
                    } else {
                        this.gjv.put("$item", jSONObjectOptJSONObject);
                    }
                    ((hnj) this.f12293sk).hnj(bugVar.hnj(qorVar.nyv(), this.gjv, (JSONObject) null));
                }
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.bytedance.adsdk.ugeno.hn.hnj, com.bytedance.adsdk.ugeno.hn.qor
    public void hn() {
        super.hn();
        T t10 = this.f12293sk;
        if (t10 instanceof hnj) {
            ((hnj) t10).setOrientation(this.iwu);
            ((hnj) this.f12293sk).hnj(this);
            if (this.f13668vk == 1) {
                gjv();
            } else {
                qor();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [T extends android.view.View, android.view.View] */
    @Override // com.bytedance.adsdk.ugeno.hn.qor
    public View hnj() {
        try {
            hnj hnjVar = new hnj(this.f12280hn);
            this.f12293sk = hnjVar;
            hnjVar.hnj((gjv) this);
        } catch (Throwable unused) {
            this.f12293sk = new View(this.f12280hn);
        }
        return this.f12293sk;
    }

    @Override // com.bytedance.adsdk.ugeno.hn.qor
    public void hnj(String str, String str2) {
        super.hnj(str, str2);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        str.getClass();
        switch (str) {
            case "driveMode":
                this.f13668vk = com.bytedance.adsdk.ugeno.dse.qor.hnj(str2, 0);
                break;
            case "direction":
                if (TextUtils.equals(str2, "vertical")) {
                    this.iwu = 1;
                    break;
                } else {
                    this.iwu = 0;
                    break;
                }
                break;
            case "dataList":
                this.dlk = com.bytedance.adsdk.ugeno.dse.hn.hnj(str2, (JSONArray) null);
                break;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.hn.hnj
    public void hnj(qor qorVar) {
        if (qorVar == null) {
            return;
        }
        ((com.bytedance.adsdk.ugeno.hn.hnj) this).hnj.add(qorVar);
    }

    @Override // com.bytedance.adsdk.ugeno.hn.hnj
    public void hnj(qor qorVar, ViewGroup.LayoutParams layoutParams) {
        if (qorVar == null) {
            return;
        }
        ((com.bytedance.adsdk.ugeno.hn.hnj) this).hnj.add(qorVar);
    }
}
