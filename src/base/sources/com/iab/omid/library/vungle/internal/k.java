package com.iab.omid.library.vungle.internal;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public class k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static k f24278d = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WeakReference<Context> f24279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f24280b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f24281c = false;

    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            k kVar;
            boolean z10;
            boolean z11;
            if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
                kVar = k.this;
                z10 = kVar.f24281c;
                z11 = true;
            } else {
                if (!intent.getAction().equals("android.intent.action.SCREEN_ON")) {
                    return;
                }
                kVar = k.this;
                z10 = kVar.f24281c;
                z11 = false;
            }
            kVar.a(z11, z10);
            k.this.f24280b = z11;
        }
    }

    public static k b() {
        return f24278d;
    }

    public void a() {
        KeyguardManager keyguardManager;
        Context context = this.f24279a.get();
        if (context == null || (keyguardManager = (KeyguardManager) context.getSystemService("keyguard")) == null) {
            return;
        }
        boolean zIsDeviceLocked = keyguardManager.isDeviceLocked();
        a(this.f24280b, zIsDeviceLocked);
        this.f24281c = zIsDeviceLocked;
    }

    public void a(Context context) {
        if (context == null) {
            return;
        }
        this.f24279a = new WeakReference<>(context);
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        context.registerReceiver(new a(), intentFilter);
    }

    public void a(boolean z10, boolean z11) {
        if ((z11 || z10) == (this.f24281c || this.f24280b)) {
            return;
        }
        Iterator<com.iab.omid.library.vungle.adsession.a> it = c.c().b().iterator();
        while (it.hasNext()) {
            it.next().d().b(z11 || z10);
        }
    }
}
