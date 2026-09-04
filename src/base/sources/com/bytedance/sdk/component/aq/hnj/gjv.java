package com.bytedance.sdk.component.aq.hnj;

import com.bytedance.sdk.component.aq.hnj.qor;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class gjv<T extends qor> {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private BlockingQueue<T> f12748hn = new LinkedBlockingQueue();
    private int hnj;

    private gjv(int i10) {
        this.hnj = i10;
    }

    public static gjv hnj(int i10) {
        return new gjv(i10);
    }

    public T hnj() {
        return this.f12748hn.poll();
    }

    public boolean hnj(T t10) {
        if (t10 == null) {
            return false;
        }
        t10.hnj();
        if (this.f12748hn.size() >= this.hnj) {
            return false;
        }
        return this.f12748hn.offer(t10);
    }
}
