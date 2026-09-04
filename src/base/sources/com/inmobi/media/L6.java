package com.inmobi.media;

import android.os.HandlerThread;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class L6 {
    public static final boolean a(String str) {
        return str == null || bm.r.V0(str).toString().length() == 0 || !(bm.r.N(str, "http://", false, 2, null) || bm.r.N(str, "https://", false, 2, null));
    }

    public static final void a(HandlerThread handlerThread, String name) {
        kotlin.jvm.internal.s.h(handlerThread, "<this>");
        kotlin.jvm.internal.s.h(name, "name");
        try {
            handlerThread.start();
        } catch (InternalError e10) {
            e10.toString();
        }
    }

    public static final void a(em.z1 z1Var) {
        if (z1Var == null || !z1Var.isActive()) {
            return;
        }
        em.z1.c0(z1Var, null, 1, null);
    }
}
