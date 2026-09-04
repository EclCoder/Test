package com.bytedance.sdk.component.aq.hn;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hn<V> extends FutureTask<V> implements Comparable<hn<V>> {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private int f12744hn;
    private int hnj;

    public hn(Callable<V> callable, int i10, int i11) {
        super(callable);
        this.hnj = i10 == -1 ? 5 : i10;
        this.f12744hn = i11;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: hnj, reason: merged with bridge method [inline-methods] */
    public int compareTo(hn hnVar) {
        if (hnj() < hnVar.hnj()) {
            return 1;
        }
        return hnj() > hnVar.hnj() ? -1 : 0;
    }

    public int hnj() {
        return this.hnj;
    }
}
