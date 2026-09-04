package com.inmobi.media;

import java.util.Map;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class F5 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ L5 f24756a;

    public F5(L5 l10) {
        this.f24756a = l10;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        synchronized (this.f24756a) {
            try {
                L5 l10 = this.f24756a;
                if (l10.f25187l == null) {
                    return null;
                }
                while (l10.f25186k > l10.f25185j) {
                    l10.d((String) ((Map.Entry) l10.f25184i.entrySet().iterator().next()).getKey());
                }
                L5 l11 = this.f24756a;
                int i10 = l11.f25188m;
                if (i10 >= 2000 && i10 >= l11.f25184i.size()) {
                    this.f24756a.c();
                    this.f24756a.f25188m = 0;
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
