package com.mbridge.msdk.config.component.status;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AudioManager f29121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private b f29122c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f29120a = "MBVolumeEventPublisher";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<com.mbridge.msdk.config.component.status.a> f29123d = new CopyOnWriteArrayList();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private final class b extends BroadcastReceiver {
        private b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.media.VOLUME_CHANGED_ACTION".equals(intent.getAction()) && intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1) == 3) {
                e.this.b();
            }
        }
    }

    public e() {
        Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
        if (contextD != null) {
            this.f29121b = (AudioManager) contextD.getApplicationContext().getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        }
        c();
    }

    public void b(com.mbridge.msdk.config.component.status.a aVar) {
        if (aVar != null) {
            this.f29123d.remove(aVar);
        }
    }

    public void c() {
        try {
            Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
            if (contextD != null) {
                this.f29122c = new b();
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.media.VOLUME_CHANGED_ACTION");
                contextD.registerReceiver(this.f29122c, intentFilter);
            }
        } catch (Throwable th2) {
            q0.b("MBVolumeEventPublisher", th2.getMessage());
        }
    }

    public void d() {
        if (this.f29123d.isEmpty()) {
            e();
            this.f29121b = null;
        }
    }

    public void e() {
        try {
            Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
            if (contextD != null) {
                contextD.unregisterReceiver(this.f29122c);
            }
        } catch (Throwable th2) {
            q0.b("MBVolumeEventPublisher", th2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        try {
            com.mbridge.msdk.config.component.base.b bVar = new com.mbridge.msdk.config.component.base.b();
            bVar.b("916005");
            HashMap map = new HashMap();
            map.put(com.mbridge.msdk.config.component.common.util.c.c("volume"), String.valueOf(a()));
            bVar.a(map);
            Iterator<com.mbridge.msdk.config.component.status.a> it = this.f29123d.iterator();
            while (it.hasNext()) {
                it.next().a(bVar);
            }
        } catch (Throwable th2) {
            q0.b("MBVolumeEventPublisher", th2.getMessage());
        }
    }

    public void a(com.mbridge.msdk.config.component.status.a aVar) {
        if (this.f29123d.contains(aVar)) {
            return;
        }
        this.f29123d.add(aVar);
    }

    private double a() {
        AudioManager audioManager = this.f29121b;
        int streamMaxVolume = audioManager != null ? audioManager.getStreamMaxVolume(3) : -1;
        AudioManager audioManager2 = this.f29121b;
        return (((double) (audioManager2 != null ? audioManager2.getStreamVolume(3) : -1)) * 100.0d) / ((double) streamMaxVolume);
    }
}
