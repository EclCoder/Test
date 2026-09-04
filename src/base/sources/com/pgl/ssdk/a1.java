package com.pgl.ssdk;

import android.os.HandlerThread;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class a1 extends a4 implements a2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HandlerThread f35271b;

    a1(HandlerThread handlerThread, a4.a aVar) {
        super(handlerThread.getLooper(), aVar);
        this.f35271b = handlerThread;
    }

    public void a(a4.a aVar) {
        this.f35274a = new WeakReference<>(aVar);
    }

    public void a(String str) {
        HandlerThread handlerThread = this.f35271b;
        if (handlerThread != null) {
            handlerThread.setName(str);
        }
    }
}
