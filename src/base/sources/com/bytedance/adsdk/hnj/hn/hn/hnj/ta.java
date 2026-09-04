package com.bytedance.adsdk.hnj.hn.hn.hnj;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class ta implements com.bytedance.adsdk.hnj.hn.hn.hnj {
    private boolean gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private String f12155hn;
    private com.bytedance.adsdk.hnj.hn.hn.hnj[] hnj;
    private com.bytedance.adsdk.hnj.hn.hnj.hnj qor;

    public ta(String str) {
        this.f12155hn = str;
    }

    @Override // com.bytedance.adsdk.hnj.hn.hn.hnj
    public String hn() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f12155hn);
        sb2.append("(");
        com.bytedance.adsdk.hnj.hn.hn.hnj[] hnjVarArr = this.hnj;
        if (hnjVarArr != null && hnjVarArr.length > 0) {
            int i10 = 0;
            while (true) {
                com.bytedance.adsdk.hnj.hn.hn.hnj[] hnjVarArr2 = this.hnj;
                if (i10 >= hnjVarArr2.length) {
                    break;
                }
                sb2.append(hnjVarArr2[i10].hn());
                sb2.append(",");
                i10++;
            }
        }
        sb2.append(")");
        return sb2.toString();
    }

    public void hnj(com.bytedance.adsdk.hnj.hn.hn.hnj[] hnjVarArr) {
        this.hnj = hnjVarArr;
    }

    public boolean qor() {
        return this.gjv;
    }

    public void hnj(boolean z10) {
        this.gjv = z10;
    }

    @Override // com.bytedance.adsdk.hnj.hn.hn.hnj
    public Object hnj(Map<String, JSONObject> map) {
        com.bytedance.adsdk.hnj.hn.hnj.hnj hnjVar = new com.bytedance.adsdk.hnj.hn.hnj.hnj();
        this.qor = hnjVar;
        hnjVar.hnj(this.f12155hn);
        Object[] objArr = new Object[this.hnj.length];
        int i10 = 0;
        while (true) {
            com.bytedance.adsdk.hnj.hn.hn.hnj[] hnjVarArr = this.hnj;
            if (i10 < hnjVarArr.length) {
                com.bytedance.adsdk.hnj.hn.hn.hnj hnjVar2 = hnjVarArr[i10];
                if (hnjVar2 != null) {
                    objArr[i10] = hnjVar2.hnj(map);
                }
                i10++;
            } else {
                this.qor.hnj(objArr);
                return com.bytedance.adsdk.hnj.jip.hnj(this.f12155hn).hnj(map.get("default_key"), objArr);
            }
        }
    }

    @Override // com.bytedance.adsdk.hnj.hn.hn.hnj
    public com.bytedance.adsdk.hnj.hn.gjv.sk hnj() {
        return com.bytedance.adsdk.hnj.hn.gjv.hn.METHOD;
    }
}
