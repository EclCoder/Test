package com.bytedance.adsdk.hn.hnj.hnj;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hn {
    private final List<eum> hnj = new ArrayList();

    void hnj(eum eumVar) {
        this.hnj.add(eumVar);
    }

    public void hnj(Path path) {
        for (int size = this.hnj.size() - 1; size >= 0; size--) {
            com.bytedance.adsdk.hn.dkl.dkl.hnj(path, this.hnj.get(size));
        }
    }
}
