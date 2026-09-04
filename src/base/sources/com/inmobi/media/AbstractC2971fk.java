package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import com.inmobi.media.AbstractC2971fk;

/* JADX INFO: renamed from: com.inmobi.media.fk, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC2971fk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final fl.k f26574a = fl.l.b(new tl.a() { // from class: yh.r8
        @Override // tl.a
        public final Object invoke() {
            return AbstractC2971fk.a();
        }
    });

    public static final void a(Runnable runnable) {
        kotlin.jvm.internal.s.h(runnable, "runnable");
        ((Handler) f26574a.getValue()).post(runnable);
    }

    public static final Handler a() {
        return new Handler(Looper.getMainLooper());
    }
}
