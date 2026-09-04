package com.bytedance.sdk.openadsdk.core.ojm;

import com.bytedance.sdk.openadsdk.utils.ua;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class orl implements com.bytedance.adsdk.ugeno.core.oj, com.bytedance.sdk.component.adexpress.hn.ojm {
    private boolean dkl;
    private final String gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final String f14066hn;
    private final com.bytedance.sdk.openadsdk.gjv.gjv.sk hnj;
    private final com.bytedance.sdk.openadsdk.core.model.as qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private long f14067sk;

    public orl(com.bytedance.sdk.openadsdk.gjv.gjv.sk skVar, String str, com.bytedance.sdk.openadsdk.core.model.as asVar, String str2, boolean z10) {
        this.hnj = skVar;
        this.f14066hn = str;
        this.gjv = str2;
        this.qor = asVar;
        this.dkl = z10;
    }

    @Override // com.bytedance.sdk.component.adexpress.hn.ojm
    public void aq() {
        this.hnj.mjg();
    }

    @Override // com.bytedance.sdk.component.adexpress.hn.ojm
    public void dkl(int i10) {
        final String str;
        System.currentTimeMillis();
        if (i10 == 3) {
            this.hnj.dse("dynamic_render2_success");
            str = "dynamic2_render";
        } else {
            this.hnj.dse("dynamic_render_success");
            str = "dynamic_backup_native_render";
        }
        this.hnj.hnj(true);
        ua.hn(new com.bytedance.sdk.component.aq.hn.qor("dynamic_success") { // from class: com.bytedance.sdk.openadsdk.core.ojm.orl.1
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.openadsdk.gjv.qor.hn(orl.this.qor, orl.this.f14066hn, str, (JSONObject) null);
            }
        }, 10);
    }

    @Override // com.bytedance.sdk.component.adexpress.hn.ojm
    public void dse(int i10) {
        this.hnj.hnj(i10);
    }

    @Override // com.bytedance.sdk.component.adexpress.hn.ojm
    public void gjv() {
        this.hnj.hnj();
    }

    @Override // com.bytedance.sdk.component.adexpress.hn.ojm
    public void ojm() {
        this.hnj.hn();
    }

    @Override // com.bytedance.sdk.component.adexpress.hn.ojm
    public void qor(int i10) {
        if (i10 == 3) {
            this.hnj.gjv("dynamic_sub_analysis2_end");
        } else {
            this.hnj.gjv("dynamic_sub_analysis_end");
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.hn.ojm
    public void sk() {
        this.hnj.hn();
    }

    public void ta() {
        this.hnj.ta();
        this.hnj.dnm();
    }

    @Override // com.bytedance.sdk.component.adexpress.hn.ojm
    public void dse() {
        this.hnj.orl();
    }

    @Override // com.bytedance.sdk.component.adexpress.hn.ojm
    public void gjv(int i10) {
        if (i10 == 3) {
            this.hnj.gjv("dynamic_sub_render2_start");
        } else {
            this.hnj.gjv("dynamic_sub_render_start");
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.hn.ojm
    public void hn(int i10) {
        if (i10 == 3) {
            this.hnj.gjv("dynamic_sub_analysis2_start");
        } else {
            this.hnj.gjv("dynamic_sub_analysis_start");
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.hn.ojm
    public void hnj(boolean z10) {
        this.hnj.hn(z10 ? 1 : 0);
    }

    @Override // com.bytedance.sdk.component.adexpress.hn.ojm
    public void sk(int i10) {
        if (i10 == 3) {
            this.hnj.gjv("dynamic_sub_render2_end");
        } else {
            this.hnj.gjv("dynamic_sub_render_end");
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.hn.ojm
    public void hnj(int i10, String str) {
        this.hnj.hnj(i10, str);
        dnm.hnj("Web", i10, str, this.f14066hn, this.gjv, this.qor);
    }

    @Override // com.bytedance.adsdk.ugeno.core.oj
    public void qor() {
        this.hnj.sk("ugen_sub_render_start");
    }

    @Override // com.bytedance.adsdk.ugeno.core.oj
    public void hn() {
        this.hnj.sk("ugen_sub_analysis_end");
    }

    @Override // com.bytedance.sdk.component.adexpress.hn.ojm
    public void hnj(int i10) {
        this.f14067sk = System.currentTimeMillis();
        if (i10 == 3) {
            this.hnj.qor("dynamic_render2_start");
        } else {
            this.hnj.qor("dynamic_render_start");
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.hn.ojm
    public void dkl() {
        this.hnj.hnj(true);
        this.hnj.bug();
        ua.hn(new com.bytedance.sdk.component.aq.hn.qor("native_success") { // from class: com.bytedance.sdk.openadsdk.core.ojm.orl.2
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.openadsdk.gjv.qor.hn(orl.this.qor, orl.this.f14066hn, "dynamic_backup_render", (JSONObject) null);
            }
        }, 10);
    }

    @Override // com.bytedance.sdk.component.adexpress.hn.ojm
    public void hnj(int i10, int i11, String str, boolean z10) {
        if (!z10) {
            this.hnj.hnj(true);
        }
        if (i10 == 3) {
            this.hnj.hn(i11, "dynamic_render2_error");
        } else {
            this.hnj.hn(i11, "dynamic_render_error");
        }
        dnm.hnj("NDR", i11, str, this.f14066hn, this.gjv, this.qor);
    }

    @Override // com.bytedance.adsdk.ugeno.core.oj
    public void hnj() {
        this.hnj.hnj("ugen_render_start", this.dkl);
        this.hnj.sk("ugen_sub_analysis_start");
    }

    @Override // com.bytedance.adsdk.ugeno.core.oj
    public void hnj(com.bytedance.adsdk.ugeno.core.uua uuaVar) {
        if (uuaVar.hnj() == 0) {
            this.hnj.sk("ugen_sub_render_end");
            this.hnj.dkl("ugen_render_success");
        } else {
            this.hnj.qor(uuaVar.hnj(), "ugen_render_error");
            dnm.hnj("UGen", uuaVar.hnj(), uuaVar.hn(), this.f14066hn, this.gjv, this.qor);
        }
        this.hnj.hnj(true);
    }
}
