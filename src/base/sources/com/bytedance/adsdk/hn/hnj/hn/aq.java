package com.bytedance.adsdk.hn.hnj.hn;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class aq {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final List<hnj<Integer, Integer>> f11963hn;
    private final List<hnj<com.bytedance.adsdk.hn.qor.hn.mjg, Path>> hnj;
    private final List<com.bytedance.adsdk.hn.qor.hn.aq> qor;

    public aq(List<com.bytedance.adsdk.hn.qor.hn.aq> list) {
        this.qor = list;
        this.hnj = new ArrayList(list.size());
        this.f11963hn = new ArrayList(list.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.hnj.add(list.get(i10).hn().hnj());
            this.f11963hn.add(list.get(i10).qor().hnj());
        }
    }

    public List<hnj<com.bytedance.adsdk.hn.qor.hn.mjg, Path>> hn() {
        return this.hnj;
    }

    public List<com.bytedance.adsdk.hn.qor.hn.aq> hnj() {
        return this.qor;
    }

    public List<hnj<Integer, Integer>> qor() {
        return this.f11963hn;
    }
}
