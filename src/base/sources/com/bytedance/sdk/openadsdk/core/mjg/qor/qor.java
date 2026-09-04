package com.bytedance.sdk.openadsdk.core.mjg.qor;

import com.bytedance.sdk.component.utils.dse;
import java.io.File;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class qor extends com.bytedance.sdk.openadsdk.hn.hn {
    public qor(int i10, int i11) {
        super(i10, i11);
    }

    @Override // com.bytedance.sdk.openadsdk.hn.hn, com.bytedance.sdk.openadsdk.hn.hnj
    protected void hnj(List<File> list) {
        int size = list.size();
        if (hnj(0L, size)) {
            return;
        }
        for (File file : list) {
            dse.qor(file);
            size--;
            if (hnj(file, 0L, size)) {
                return;
            }
        }
    }

    public qor(int i10, int i11, boolean z10) {
        super(i10, i11);
        this.hnj = z10;
    }
}
