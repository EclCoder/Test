package com.iab.omid.library.mmadbridge.internal;

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
    private static j f24118d = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WeakReference<Context> f24119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f24120b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f24121c = false;

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
                z10 = jVar.f24121c;
                z11 = true;
            } else {
                if (!intent.getAction().equals("android.intent.action.SCREEN_ON")) {
                    return;
                }
                jVar = j.this;
                z10 = jVar.f24121c;
                z11 = false;
            }
            jVar.a(z11, z10);
            j.this.f24120b = z11;
        }
    }

    public static j b() {
        return f24118d;
    }

    public void a() {
        Context context = this.f24119a.get();
        if (context == null) {
            return;
        }
        boolean zIsDeviceLocked = ((KeyguardManager) context.getSystemService("keyguard")).isDeviceLocked();
        a(this.f24120b, zIsDeviceLocked);
        this.f24121c = zIsDeviceLocked;
    }

    public void a(Context context) {
        if (context == null) {
            return;
        }
        this.f24119a = new WeakReference<>(context);
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        context.registerReceiver(new a(), intentFilter);
    }

    public void a(boolean z10, boolean z11) {
        if ((z11 || z10) == (this.f24121c || this.f24120b)) {
            return;
        }
        Iterator<com.iab.omid.library.mmadbridge.adsession.a> it = c.c().b().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().b(z11 || z10);
        }
    }
}
