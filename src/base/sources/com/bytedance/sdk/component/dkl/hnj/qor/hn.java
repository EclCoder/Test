package com.bytedance.sdk.component.dkl.hnj.qor;

import com.bytedance.sdk.component.dkl.hnj.dse;
import com.bytedance.sdk.component.dkl.hnj.sk;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hn {
    public static void hnj(AtomicLong atomicLong, int i10) {
        sk skVarFc = dse.dkl().fc();
        if (skVarFc == null || !skVarFc.dse() || atomicLong == null) {
            return;
        }
        atomicLong.getAndAdd(i10);
    }
}
