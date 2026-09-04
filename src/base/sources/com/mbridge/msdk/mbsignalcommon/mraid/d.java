package com.mbridge.msdk.mbsignalcommon.mraid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static double f31667f = -1.0d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f31668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AudioManager f31669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f31670c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private b f31671d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private a f31672e;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class a extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<d> f31673a;

        public a(d dVar) {
            this.f31673a = new WeakReference<>(dVar);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            d dVar;
            b bVarB;
            if (!"android.media.VOLUME_CHANGED_ACTION".equals(intent.getAction()) || intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1) != 3 || (dVar = this.f31673a.get()) == null || (bVarB = dVar.b()) == null) {
                return;
            }
            double dA = dVar.a();
            if (dA >= 0.0d) {
                bVarB.a(dA);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface b {
        void a(double d10);
    }

    public d(Context context) {
        this.f31668a = context;
        this.f31669b = (AudioManager) context.getApplicationContext().getSystemService(MimeTypes.BASE_TYPE_AUDIO);
    }

    public double a() {
        AudioManager audioManager = this.f31669b;
        int streamMaxVolume = audioManager != null ? audioManager.getStreamMaxVolume(3) : -1;
        AudioManager audioManager2 = this.f31669b;
        double streamVolume = (((double) (audioManager2 != null ? audioManager2.getStreamVolume(3) : -1)) * 100.0d) / ((double) streamMaxVolume);
        f31667f = streamVolume;
        return streamVolume;
    }

    public b b() {
        return this.f31671d;
    }

    public void c() {
        if (this.f31668a != null) {
            this.f31672e = new a(this);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.media.VOLUME_CHANGED_ACTION");
            this.f31668a.registerReceiver(this.f31672e, intentFilter);
            this.f31670c = true;
        }
    }

    public void d() {
        Context context;
        if (!this.f31670c || (context = this.f31668a) == null) {
            return;
        }
        try {
            context.unregisterReceiver(this.f31672e);
            this.f31671d = null;
            this.f31670c = false;
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void a(b bVar) {
        this.f31671d = bVar;
    }
}
