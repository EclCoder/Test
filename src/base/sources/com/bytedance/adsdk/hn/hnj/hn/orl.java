package com.bytedance.adsdk.hn.hnj.hn;

import android.graphics.Path;
import com.bytedance.adsdk.hn.hnj.hnj.xn;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class orl extends hnj<com.bytedance.adsdk.hn.qor.hn.mjg, Path> {
    private List<xn> dkl;
    private final com.bytedance.adsdk.hn.qor.hn.mjg gjv;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private final Path f11973sk;

    public orl(List<com.bytedance.adsdk.hn.dse.hnj<com.bytedance.adsdk.hn.qor.hn.mjg>> list) {
        super(list);
        this.gjv = new com.bytedance.adsdk.hn.qor.hn.mjg();
        this.f11973sk = new Path();
    }

    @Override // com.bytedance.adsdk.hn.hnj.hn.hnj
    /* JADX INFO: renamed from: hn, reason: merged with bridge method [inline-methods] */
    public Path hnj(com.bytedance.adsdk.hn.dse.hnj<com.bytedance.adsdk.hn.qor.hn.mjg> hnjVar, float f10) {
        this.gjv.hnj(hnjVar.hnj, hnjVar.f11946hn, f10);
        com.bytedance.adsdk.hn.qor.hn.mjg mjgVarHnj = this.gjv;
        List<xn> list = this.dkl;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                mjgVarHnj = this.dkl.get(size).hnj(mjgVarHnj);
            }
        }
        com.bytedance.adsdk.hn.dkl.sk.hnj(mjgVarHnj, this.f11973sk);
        return this.f11973sk;
    }

    public void hnj(List<xn> list) {
        this.dkl = list;
    }
}
