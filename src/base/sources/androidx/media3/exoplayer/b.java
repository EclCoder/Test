package androidx.media3.exoplayer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import com.pairip.VMRunner;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f5091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f5092b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f5093c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes2.dex */
    private final class a extends BroadcastReceiver implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final InterfaceC0060b f5094a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Handler f5095b;

        public a(Handler handler, InterfaceC0060b interfaceC0060b) {
            this.f5095b = handler;
            this.f5094a = interfaceC0060b;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            VMRunner.invoke("dhHFA7JNOlyDlukb", new Object[]{this, context, intent});
        }

        @Override // java.lang.Runnable
        public void run() {
            if (b.this.f5093c) {
                this.f5094a.n();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.media3.exoplayer.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface InterfaceC0060b {
        void n();
    }

    public b(Context context, Handler handler, InterfaceC0060b interfaceC0060b) {
        this.f5091a = context.getApplicationContext();
        this.f5092b = new a(handler, interfaceC0060b);
    }

    public void b(boolean z10) {
        if (z10 && !this.f5093c) {
            this.f5091a.registerReceiver(this.f5092b, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
            this.f5093c = true;
        } else {
            if (z10 || !this.f5093c) {
                return;
            }
            this.f5091a.unregisterReceiver(this.f5092b);
            this.f5093c = false;
        }
    }
}
