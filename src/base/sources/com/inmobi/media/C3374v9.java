package com.inmobi.media;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* JADX INFO: renamed from: com.inmobi.media.v9, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3374v9 {
    public static void a() {
        Context context;
        try {
            Iterator it = AbstractC3426x9.f27835a.iterator();
            while (it.hasNext()) {
                Rb rb2 = (Rb) ((WeakReference) it.next()).get();
                if (rb2 != null && (context = (Context) rb2.f25633f.get()) != null) {
                    em.o0 o0Var = AbstractC2834ac.f26174a;
                    Zb.a(new Qb(rb2, context, null));
                }
            }
        } catch (Exception e10) {
            fl.k kVar = W9.f25935a;
            AbstractC3219p9.a(e10);
        }
    }
}
