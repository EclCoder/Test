package com.bytedance.sdk.openadsdk.core.bug.hn;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hn extends com.bytedance.adsdk.ugeno.ojm.dkl.hn {
    private String dlk;

    /* JADX INFO: renamed from: vk, reason: collision with root package name */
    private String f13638vk;

    public hn(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.ojm.dkl.hn, com.bytedance.adsdk.ugeno.hn.qor
    public void hn() {
        super.hn();
        if (TextUtils.isEmpty(this.f13638vk) || TextUtils.equals(this.f13638vk, "null")) {
            this.f13638vk = "";
        }
        if (TextUtils.isEmpty(this.dlk) || TextUtils.equals(this.dlk, "null")) {
            this.dlk = "";
        }
        String str = this.dlk + this.f13638vk;
        ((com.bytedance.adsdk.ugeno.ojm.dkl.hn) this).hnj = str;
        ((com.bytedance.adsdk.ugeno.ojm.dkl.hnj) this.f12293sk).setText(str);
        ((com.bytedance.adsdk.ugeno.ojm.dkl.hnj) this.f12293sk).setGravity(17);
    }

    @Override // com.bytedance.adsdk.ugeno.ojm.dkl.hn, com.bytedance.adsdk.ugeno.hn.qor
    public void hnj(String str, String str2) {
        super.hnj(str, str2);
        str.getClass();
        if (str.equals("before")) {
            this.dlk = str2;
        } else if (str.equals("after")) {
            this.f13638vk = str2;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.ojm.dkl.hn
    public void orl(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "null")) {
            str = "";
        }
        if (TextUtils.isEmpty(this.f13638vk) || TextUtils.equals(this.f13638vk, "null")) {
            this.f13638vk = "";
        }
        if (TextUtils.isEmpty(this.dlk) || TextUtils.equals(this.dlk, "null")) {
            this.dlk = "";
        }
        String str2 = this.dlk + str + this.f13638vk;
        ((com.bytedance.adsdk.ugeno.ojm.dkl.hn) this).hnj = str2;
        ((com.bytedance.adsdk.ugeno.ojm.dkl.hnj) this.f12293sk).setText(str2);
        try {
            float f10 = this.f12278gm ? this.xyo : this.tgn;
            float f11 = this.f12300ul ? this.f12301vf : this.tgn;
            float fMeasureText = ((com.bytedance.adsdk.ugeno.ojm.dkl.hnj) this.f12293sk).getPaint().measureText(((com.bytedance.adsdk.ugeno.ojm.dkl.hn) this).hnj);
            if (fMeasureText >= 0.0f) {
                sk((int) (f10 + fMeasureText + f11));
            }
        } catch (Throwable unused) {
        }
    }
}
