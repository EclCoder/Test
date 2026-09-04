package com.inmobi.media;

import com.inmobi.media.core.config.models.Config;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: renamed from: com.inmobi.media.i4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3033i4 implements hm.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3136m4 f26719a;

    public C3033i4(C3136m4 c3136m4) {
        this.f26719a = c3136m4;
    }

    @Override // hm.f
    public final Object emit(Object obj, kl.f fVar) {
        Config config = (Config) obj;
        this.f26719a.f26972a.f27114b.put(config.getType(), config);
        C3136m4 c3136m4 = this.f26719a;
        ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) c3136m4.f26972a.f27115c.get(config.getType());
        if (concurrentLinkedQueue != null) {
            Iterator it = concurrentLinkedQueue.iterator();
            while (it.hasNext()) {
                InterfaceC3395w4 interfaceC3395w4 = (InterfaceC3395w4) ((WeakReference) it.next()).get();
                if (interfaceC3395w4 != null) {
                    interfaceC3395w4.a(config);
                }
            }
        }
        c3136m4.f26972a.f27115c.remove(config.getType());
        return fl.g0.f38750a;
    }
}
