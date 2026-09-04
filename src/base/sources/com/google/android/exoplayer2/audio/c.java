package com.google.android.exoplayer2.audio;

import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Handler;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.pairip.VMRunner;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f16564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f f16565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f16566c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C0279c f16567d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final BroadcastReceiver f16568e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final d f16569f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    com.google.android.exoplayer2.audio.b f16570g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f16571h;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class b {
        public static void a(Context context, AudioDeviceCallback audioDeviceCallback, Handler handler) {
            ((AudioManager) ob.a.e((AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO))).registerAudioDeviceCallback(audioDeviceCallback, handler);
        }

        public static void b(Context context, AudioDeviceCallback audioDeviceCallback) {
            ((AudioManager) ob.a.e((AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO))).unregisterAudioDeviceCallback(audioDeviceCallback);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.audio.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private final class C0279c extends AudioDeviceCallback {
        private C0279c() {
        }

        @Override // android.media.AudioDeviceCallback
        public void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
            c cVar = c.this;
            cVar.c(com.google.android.exoplayer2.audio.b.c(cVar.f16564a));
        }

        @Override // android.media.AudioDeviceCallback
        public void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
            c cVar = c.this;
            cVar.c(com.google.android.exoplayer2.audio.b.c(cVar.f16564a));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private final class d extends ContentObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ContentResolver f16573a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Uri f16574b;

        public d(Handler handler, ContentResolver contentResolver, Uri uri) {
            super(handler);
            this.f16573a = contentResolver;
            this.f16574b = uri;
        }

        public void a() {
            this.f16573a.registerContentObserver(this.f16574b, false, this);
        }

        public void b() {
            this.f16573a.unregisterContentObserver(this);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z10) {
            c cVar = c.this;
            cVar.c(com.google.android.exoplayer2.audio.b.c(cVar.f16564a));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private final class e extends BroadcastReceiver {
        private e() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            VMRunner.invoke("GIMLw206zDpsO41v", new Object[]{this, context, intent});
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface f {
        void a(com.google.android.exoplayer2.audio.b bVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(Context context, f fVar) {
        Context applicationContext = context.getApplicationContext();
        this.f16564a = applicationContext;
        this.f16565b = (f) ob.a.e(fVar);
        Handler handlerY = r0.y();
        this.f16566c = handlerY;
        int i10 = r0.f48425a;
        Object[] objArr = 0;
        this.f16567d = i10 >= 23 ? new C0279c() : null;
        this.f16568e = i10 >= 21 ? new e() : null;
        Uri uriG = com.google.android.exoplayer2.audio.b.g();
        this.f16569f = uriG != null ? new d(handlerY, applicationContext.getContentResolver(), uriG) : null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(com.google.android.exoplayer2.audio.b bVar) {
        if (!this.f16571h || bVar.equals(this.f16570g)) {
            return;
        }
        this.f16570g = bVar;
        this.f16565b.a(bVar);
    }

    public com.google.android.exoplayer2.audio.b d() {
        C0279c c0279c;
        if (this.f16571h) {
            return (com.google.android.exoplayer2.audio.b) ob.a.e(this.f16570g);
        }
        this.f16571h = true;
        d dVar = this.f16569f;
        if (dVar != null) {
            dVar.a();
        }
        if (r0.f48425a >= 23 && (c0279c = this.f16567d) != null) {
            b.a(this.f16564a, c0279c, this.f16566c);
        }
        com.google.android.exoplayer2.audio.b bVarD = com.google.android.exoplayer2.audio.b.d(this.f16564a, this.f16568e != null ? this.f16564a.registerReceiver(this.f16568e, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, this.f16566c) : null);
        this.f16570g = bVarD;
        return bVarD;
    }

    public void e() {
        C0279c c0279c;
        if (this.f16571h) {
            this.f16570g = null;
            if (r0.f48425a >= 23 && (c0279c = this.f16567d) != null) {
                b.b(this.f16564a, c0279c);
            }
            BroadcastReceiver broadcastReceiver = this.f16568e;
            if (broadcastReceiver != null) {
                this.f16564a.unregisterReceiver(broadcastReceiver);
            }
            d dVar = this.f16569f;
            if (dVar != null) {
                dVar.b();
            }
            this.f16571h = false;
        }
    }
}
