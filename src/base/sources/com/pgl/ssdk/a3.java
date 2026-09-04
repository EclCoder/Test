package com.pgl.ssdk;

import com.pgl.ssdk.a2;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class a3<T extends a2> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f35272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private BlockingQueue<T> f35273b = new LinkedBlockingQueue();

    private a3(int i10) {
        this.f35272a = i10;
    }

    public static a3 a(int i10) {
        return new a3(i10);
    }

    public T a() {
        return this.f35273b.poll();
    }
}
