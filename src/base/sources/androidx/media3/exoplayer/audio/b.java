package androidx.media3.exoplayer.audio;

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
import w1.c0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f4999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f f5000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f5001c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f5002d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final BroadcastReceiver f5003e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final d f5004f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private androidx.media3.exoplayer.audio.a f5005g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private androidx.media3.exoplayer.audio.c f5006h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private t1.b f5007i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f5008j;

    /* JADX INFO: renamed from: androidx.media3.exoplayer.audio.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class C0059b {
        public static void a(Context context, AudioDeviceCallback audioDeviceCallback, Handler handler) {
            ((AudioManager) w1.a.e((AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO))).registerAudioDeviceCallback(audioDeviceCallback, handler);
        }

        public static void b(Context context, AudioDeviceCallback audioDeviceCallback) {
            ((AudioManager) w1.a.e((AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO))).unregisterAudioDeviceCallback(audioDeviceCallback);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private final class c extends AudioDeviceCallback {
        private c() {
        }

        @Override // android.media.AudioDeviceCallback
        public void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
            b bVar = b.this;
            bVar.f(androidx.media3.exoplayer.audio.a.g(bVar.f4999a, b.this.f5007i, b.this.f5006h));
        }

        @Override // android.media.AudioDeviceCallback
        public void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
            if (c0.r(audioDeviceInfoArr, b.this.f5006h)) {
                b.this.f5006h = null;
            }
            b bVar = b.this;
            bVar.f(androidx.media3.exoplayer.audio.a.g(bVar.f4999a, b.this.f5007i, b.this.f5006h));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private final class d extends ContentObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ContentResolver f5010a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Uri f5011b;

        public d(Handler handler, ContentResolver contentResolver, Uri uri) {
            super(handler);
            this.f5010a = contentResolver;
            this.f5011b = uri;
        }

        public void a() {
            this.f5010a.registerContentObserver(this.f5011b, false, this);
        }

        public void b() {
            this.f5010a.unregisterContentObserver(this);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z10) {
            b bVar = b.this;
            bVar.f(androidx.media3.exoplayer.audio.a.g(bVar.f4999a, b.this.f5007i, b.this.f5006h));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private final class e extends BroadcastReceiver {
        private e() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (isInitialStickyBroadcast()) {
                return;
            }
            b bVar = b.this;
            bVar.f(androidx.media3.exoplayer.audio.a.f(context, intent, bVar.f5007i, b.this.f5006h));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface f {
        void a(androidx.media3.exoplayer.audio.a aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    b(Context context, f fVar, t1.b bVar, androidx.media3.exoplayer.audio.c cVar) {
        Context applicationContext = context.getApplicationContext();
        this.f4999a = applicationContext;
        this.f5000b = (f) w1.a.e(fVar);
        this.f5007i = bVar;
        this.f5006h = cVar;
        Handler handlerB = c0.B();
        this.f5001c = handlerB;
        int i10 = c0.f55769a;
        Object[] objArr = 0;
        this.f5002d = i10 >= 23 ? new c() : null;
        this.f5003e = i10 >= 21 ? new e() : null;
        Uri uriJ = androidx.media3.exoplayer.audio.a.j();
        this.f5004f = uriJ != null ? new d(handlerB, applicationContext.getContentResolver(), uriJ) : null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(androidx.media3.exoplayer.audio.a aVar) {
        if (!this.f5008j || aVar.equals(this.f5005g)) {
            return;
        }
        this.f5005g = aVar;
        this.f5000b.a(aVar);
    }

    public androidx.media3.exoplayer.audio.a g() {
        c cVar;
        if (this.f5008j) {
            return (androidx.media3.exoplayer.audio.a) w1.a.e(this.f5005g);
        }
        this.f5008j = true;
        d dVar = this.f5004f;
        if (dVar != null) {
            dVar.a();
        }
        if (c0.f55769a >= 23 && (cVar = this.f5002d) != null) {
            C0059b.a(this.f4999a, cVar, this.f5001c);
        }
        androidx.media3.exoplayer.audio.a aVarF = androidx.media3.exoplayer.audio.a.f(this.f4999a, this.f5003e != null ? this.f4999a.registerReceiver(this.f5003e, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, this.f5001c) : null, this.f5007i, this.f5006h);
        this.f5005g = aVarF;
        return aVarF;
    }

    public void h(t1.b bVar) {
        this.f5007i = bVar;
        f(androidx.media3.exoplayer.audio.a.g(this.f4999a, bVar, this.f5006h));
    }

    public void i(AudioDeviceInfo audioDeviceInfo) {
        androidx.media3.exoplayer.audio.c cVar = this.f5006h;
        if (c0.c(audioDeviceInfo, cVar == null ? null : cVar.f5014a)) {
            return;
        }
        androidx.media3.exoplayer.audio.c cVar2 = audioDeviceInfo != null ? new androidx.media3.exoplayer.audio.c(audioDeviceInfo) : null;
        this.f5006h = cVar2;
        f(androidx.media3.exoplayer.audio.a.g(this.f4999a, this.f5007i, cVar2));
    }

    public void j() {
        c cVar;
        if (this.f5008j) {
            this.f5005g = null;
            if (c0.f55769a >= 23 && (cVar = this.f5002d) != null) {
                C0059b.b(this.f4999a, cVar);
            }
            BroadcastReceiver broadcastReceiver = this.f5003e;
            if (broadcastReceiver != null) {
                this.f4999a.unregisterReceiver(broadcastReceiver);
            }
            d dVar = this.f5004f;
            if (dVar != null) {
                dVar.b();
            }
            this.f5008j = false;
        }
    }
}
