package androidx.media3.exoplayer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.pairip.VMRunner;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class l2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f5486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f5487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f5488c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AudioManager f5489d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private c f5490e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f5491f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f5492g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f5493h;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface b {
        void m(int i10);

        void q(int i10, boolean z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes2.dex */
    final class c extends BroadcastReceiver {
        private c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            VMRunner.invoke("MqsuD1kthCKfwqAD", new Object[]{this, context, intent});
        }
    }

    public l2(Context context, Handler handler, b bVar) {
        Context applicationContext = context.getApplicationContext();
        this.f5486a = applicationContext;
        this.f5487b = handler;
        this.f5488c = bVar;
        AudioManager audioManager = (AudioManager) w1.a.i((AudioManager) applicationContext.getSystemService(MimeTypes.BASE_TYPE_AUDIO));
        this.f5489d = audioManager;
        this.f5491f = 3;
        this.f5492g = f(audioManager, 3);
        this.f5493h = e(audioManager, this.f5491f);
        c cVar = new c();
        try {
            applicationContext.registerReceiver(cVar, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            this.f5490e = cVar;
        } catch (RuntimeException e10) {
            w1.n.i("StreamVolumeManager", "Error registering stream volume receiver", e10);
        }
    }

    private static boolean e(AudioManager audioManager, int i10) {
        if (w1.c0.f55769a >= 23) {
            return audioManager.isStreamMute(i10);
        }
        return f(audioManager, i10) == 0;
    }

    private static int f(AudioManager audioManager, int i10) {
        try {
            return audioManager.getStreamVolume(i10);
        } catch (RuntimeException e10) {
            w1.n.i("StreamVolumeManager", "Could not retrieve stream volume for stream type " + i10, e10);
            return audioManager.getStreamMaxVolume(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        int iF = f(this.f5489d, this.f5491f);
        boolean zE = e(this.f5489d, this.f5491f);
        if (this.f5492g == iF && this.f5493h == zE) {
            return;
        }
        this.f5492g = iF;
        this.f5493h = zE;
        this.f5488c.q(iF, zE);
    }

    public int c() {
        return this.f5489d.getStreamMaxVolume(this.f5491f);
    }

    public int d() {
        if (w1.c0.f55769a >= 28) {
            return this.f5489d.getStreamMinVolume(this.f5491f);
        }
        return 0;
    }

    public void g() {
        c cVar = this.f5490e;
        if (cVar != null) {
            try {
                this.f5486a.unregisterReceiver(cVar);
            } catch (RuntimeException e10) {
                w1.n.i("StreamVolumeManager", "Error unregistering stream volume receiver", e10);
            }
            this.f5490e = null;
        }
    }

    public void h(int i10) {
        if (this.f5491f == i10) {
            return;
        }
        this.f5491f = i10;
        i();
        this.f5488c.m(i10);
    }
}
