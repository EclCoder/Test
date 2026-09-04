package com.bytedance.adsdk.hn.qor.hn;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class jip implements qor {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final List<qor> f12068hn;
    private final String hnj;
    private final boolean qor;

    public jip(String str, List<qor> list, boolean z10) {
        this.hnj = str;
        this.f12068hn = list;
        this.qor = z10;
    }

    public List<qor> hn() {
        return this.f12068hn;
    }

    public String hnj() {
        return this.hnj;
    }

    public boolean qor() {
        return this.qor;
    }

    public String toString() {
        return "ShapeGroup{name='" + this.hnj + "' Shapes: " + Arrays.toString(this.f12068hn.toArray()) + '}';
    }

    @Override // com.bytedance.adsdk.hn.qor.hn.qor
    public com.bytedance.adsdk.hn.hnj.hnj.qor hnj(com.bytedance.adsdk.hn.ojm ojmVar, com.bytedance.adsdk.hn.dse dseVar, com.bytedance.adsdk.hn.qor.qor.hnj hnjVar) {
        return new com.bytedance.adsdk.hn.hnj.hnj.gjv(ojmVar, hnjVar, this, dseVar);
    }
}
