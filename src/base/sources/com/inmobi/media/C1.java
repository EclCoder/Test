package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C1 extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f24574a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1(Looper looper) {
        super(looper);
        kotlin.jvm.internal.s.h(looper, "looper");
        this.f24574a = true;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message msg) {
        kotlin.jvm.internal.s.h(msg, "msg");
        int i10 = msg.what;
        if (i10 == 1001 && this.f24574a) {
            this.f24574a = false;
            E1.a(false);
            kotlin.jvm.internal.s.g("E1", "access$getTAG$p(...)");
        } else {
            if (i10 != 1002 || this.f24574a) {
                return;
            }
            this.f24574a = true;
            E1.a(true);
            kotlin.jvm.internal.s.g("E1", "access$getTAG$p(...)");
        }
    }
}
