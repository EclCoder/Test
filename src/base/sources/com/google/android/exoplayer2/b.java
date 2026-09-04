package com.google.android.exoplayer2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import com.pairip.VMRunner;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f16701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f16702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f16703c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private final class a extends BroadcastReceiver implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final InterfaceC0280b f16704a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Handler f16705b;

        public a(Handler handler, InterfaceC0280b interfaceC0280b) {
            this.f16705b = handler;
            this.f16704a = interfaceC0280b;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            VMRunner.invoke("dLUuehElQ9A6tCoN", new Object[]{this, context, intent});
        }

        @Override // java.lang.Runnable
        public void run() {
            if (b.this.f16703c) {
                this.f16704a.n();
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface InterfaceC0280b {
        void n();
    }

    public b(Context context, Handler handler, InterfaceC0280b interfaceC0280b) {
        this.f16701a = context.getApplicationContext();
        this.f16702b = new a(handler, interfaceC0280b);
    }

    public void b(boolean z10) {
        if (z10 && !this.f16703c) {
            this.f16701a.registerReceiver(this.f16702b, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
            this.f16703c = true;
        } else {
            if (z10 || !this.f16703c) {
                return;
            }
            this.f16701a.unregisterReceiver(this.f16702b);
            this.f16703c = false;
        }
    }
}
