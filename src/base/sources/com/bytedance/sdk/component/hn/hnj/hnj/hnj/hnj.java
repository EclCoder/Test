package com.bytedance.sdk.component.hn.hnj.hnj.hnj;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hnj extends com.bytedance.sdk.component.hn.hnj.gjv {
    public static volatile ta hnj;
    private ExecutorService gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private List<com.bytedance.sdk.component.hn.hnj.hn> f12877hn = new CopyOnWriteArrayList();
    private List<com.bytedance.sdk.component.hn.hnj.hn> qor = new CopyOnWriteArrayList();

    public hnj(ExecutorService executorService) {
        this.gjv = executorService;
    }

    @Override // com.bytedance.sdk.component.hn.hnj.gjv
    public List<com.bytedance.sdk.component.hn.hnj.hn> gjv() {
        return this.qor;
    }

    @Override // com.bytedance.sdk.component.hn.hnj.gjv
    public ExecutorService hn() {
        ExecutorService executorServiceHnj = hnj != null ? hnj.hnj() : null;
        return executorServiceHnj != null ? executorServiceHnj : this.gjv;
    }

    @Override // com.bytedance.sdk.component.hn.hnj.gjv
    public int hnj() {
        return 0;
    }

    @Override // com.bytedance.sdk.component.hn.hnj.gjv
    public List<com.bytedance.sdk.component.hn.hnj.hn> qor() {
        return this.f12877hn;
    }

    public boolean sk() {
        return (hnj == null || hnj.hnj() == null) ? false : true;
    }

    @Override // com.bytedance.sdk.component.hn.hnj.gjv
    public void hnj(int i10) {
    }

    public static void hnj(ta taVar) {
        hnj = taVar;
    }
}
