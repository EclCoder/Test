package com.bytedance.sdk.component.dkl.hnj.hnj.hn;

import com.bytedance.sdk.component.dkl.hnj.gjv.hnj;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class gjv<T extends com.bytedance.sdk.component.dkl.hnj.gjv.hnj> {
    private String gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private Queue<T> f12812hn = new ConcurrentLinkedQueue();
    private com.bytedance.sdk.component.dkl.hnj.gjv.hn.hnj hnj;
    private Queue<String> qor;

    public gjv(com.bytedance.sdk.component.dkl.hnj.gjv.hn.hnj hnjVar, Queue<String> queue, String str) {
        this.hnj = hnjVar;
        this.qor = queue;
        this.gjv = str;
    }

    public synchronized boolean hn(int i10, int i11) {
        int size = this.f12812hn.size();
        int iHnj = this.hnj.hnj();
        if (i10 != 2 && i10 != 1) {
            return size >= iHnj;
        }
        if (com.bytedance.sdk.component.dkl.hnj.qor.hnj.qor()) {
            return size > 0;
        }
        return size >= iHnj;
    }

    public void hnj(T t10) {
        Queue<T> queue = this.f12812hn;
        if (queue == null || t10 == null) {
            return;
        }
        queue.offer(t10);
    }

    public synchronized List<com.bytedance.sdk.component.dkl.hnj.gjv.hnj> hnj(int i10, int i11) {
        if (!hn(i10, i11)) {
            return null;
        }
        ArrayList arrayList = new ArrayList(this.hnj.hnj());
        do {
            T tPoll = this.f12812hn.poll();
            if (tPoll == null) {
                break;
            }
            arrayList.add(tPoll);
        } while (arrayList.size() != this.hnj.hn());
        return arrayList;
    }

    public synchronized void hnj(int i10, List<T> list) {
        try {
            if (i10 != -1 && i10 != 200 && i10 != 509) {
                this.f12812hn.addAll(list);
            } else {
                this.f12812hn.size();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
