package com.bumptech.glide.load.engine;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f11475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f11476b = new Handler(Looper.getMainLooper(), new a());

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((t5.c) message.obj).a();
            return true;
        }
    }

    u() {
    }

    synchronized void a(t5.c cVar, boolean z10) {
        try {
            if (this.f11475a || z10) {
                this.f11476b.obtainMessage(1, cVar).sendToTarget();
            } else {
                this.f11475a = true;
                cVar.a();
                this.f11475a = false;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
