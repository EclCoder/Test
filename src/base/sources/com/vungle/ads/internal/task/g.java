package com.vungle.ads.internal.task;

import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class g implements j {
    @Override // com.vungle.ads.internal.task.j
    public int makeAndroidThreadPriority(d jobInfo) {
        s.h(jobInfo, "jobInfo");
        return Math.min(19, Math.abs(Math.min(0, jobInfo.getPriority() - 2)) + 10);
    }
}
