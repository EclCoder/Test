package com.google.android.exoplayer2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.pairip.VMRunner;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class e2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f16889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f16890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f16891c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AudioManager f16892d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private c f16893e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f16894f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f16895g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f16896h;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface b {
        void m(int i10);

        void q(int i10, boolean z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    final class c extends BroadcastReceiver {
        private c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            VMRunner.invoke("mWPBoLIXIoTo7RvC", new Object[]{this, context, intent});
        }
    }

    public e2(Context context, Handler handler, b bVar) {
        Context applicationContext = context.getApplicationContext();
        this.f16889a = applicationContext;
        this.f16890b = handler;
        this.f16891c = bVar;
        AudioManager audioManager = (AudioManager) ob.a.i((AudioManager) applicationContext.getSystemService(MimeTypes.BASE_TYPE_AUDIO));
        this.f16892d = audioManager;
        this.f16894f = 3;
        this.f16895g = f(audioManager, 3);
        this.f16896h = e(audioManager, this.f16894f);
        c cVar = new c();
        try {
            applicationContext.registerReceiver(cVar, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            this.f16893e = cVar;
        } catch (RuntimeException e10) {
            ob.u.j("StreamVolumeManager", "Error registering stream volume receiver", e10);
        }
    }

    private static boolean e(AudioManager audioManager, int i10) {
        if (ob.r0.f48425a >= 23) {
            return audioManager.isStreamMute(i10);
        }
        return f(audioManager, i10) == 0;
    }

    private static int f(AudioManager audioManager, int i10) {
        try {
            return audioManager.getStreamVolume(i10);
        } catch (RuntimeException e10) {
            ob.u.j("StreamVolumeManager", "Could not retrieve stream volume for stream type " + i10, e10);
            return audioManager.getStreamMaxVolume(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        int iF = f(this.f16892d, this.f16894f);
        boolean zE = e(this.f16892d, this.f16894f);
        if (this.f16895g == iF && this.f16896h == zE) {
            return;
        }
        this.f16895g = iF;
        this.f16896h = zE;
        this.f16891c.q(iF, zE);
    }

    public int c() {
        return this.f16892d.getStreamMaxVolume(this.f16894f);
    }

    public int d() {
        if (ob.r0.f48425a >= 28) {
            return this.f16892d.getStreamMinVolume(this.f16894f);
        }
        return 0;
    }

    public void g() {
        c cVar = this.f16893e;
        if (cVar != null) {
            try {
                this.f16889a.unregisterReceiver(cVar);
            } catch (RuntimeException e10) {
                ob.u.j("StreamVolumeManager", "Error unregistering stream volume receiver", e10);
            }
            this.f16893e = null;
        }
    }

    public void h(int i10) {
        if (this.f16894f == i10) {
            return;
        }
        this.f16894f = i10;
        i();
        this.f16891c.m(i10);
    }
}
