package com.iab.omid.library.inmobi.internal;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public class j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static j f23983d = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WeakReference<Context> f23984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f23985b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f23986c = false;

    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            j jVar;
            boolean z10;
            boolean z11;
            if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
                jVar = j.this;
                z10 = jVar.f23986c;
                z11 = true;
            } else {
                if (!intent.getAction().equals("android.intent.action.SCREEN_ON")) {
                    return;
                }
                jVar = j.this;
                z10 = jVar.f23986c;
                z11 = false;
            }
            jVar.a(z11, z10);
            j.this.f23985b = z11;
        }
    }

    public static j b() {
        return f23983d;
    }

    public void a() {
        KeyguardManager keyguardManager;
        Context context = this.f23984a.get();
        if (context == null || (keyguardManager = (KeyguardManager) context.getSystemService("keyguard")) == null) {
            return;
        }
        boolean zIsDeviceLocked = keyguardManager.isDeviceLocked();
        a(this.f23985b, zIsDeviceLocked);
        this.f23986c = zIsDeviceLocked;
    }

    public void a(Context context) {
        if (context == null) {
            return;
        }
        this.f23984a = new WeakReference<>(context);
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        context.registerReceiver(new a(), intentFilter);
    }

    public void a(boolean z10, boolean z11) {
        if ((z11 || z10) == (this.f23986c || this.f23985b)) {
            return;
        }
        Iterator<com.iab.omid.library.inmobi.adsession.a> it = c.c().b().iterator();
        while (it.hasNext()) {
            it.next().d().b(z11 || z10);
        }
    }
}
