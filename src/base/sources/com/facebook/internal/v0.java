package com.facebook.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class v0 implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f15421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f15422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private b f15423c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f15424d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Messenger f15425e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f15426f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f15427g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f15428h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f15429i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f15430j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final String f15431k;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a extends Handler {
        a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (x7.a.c(this)) {
                return;
            }
            try {
                if (x7.a.c(this)) {
                    return;
                }
                try {
                    kotlin.jvm.internal.s.h(message, "message");
                    v0.this.c(message);
                } catch (Throwable th2) {
                    x7.a.b(th2, this);
                }
            } catch (Throwable th3) {
                x7.a.b(th3, this);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface b {
        void a(Bundle bundle);
    }

    public v0(Context context, int i10, int i11, int i12, String applicationId, String redirectURI, String str) {
        kotlin.jvm.internal.s.h(context, "context");
        kotlin.jvm.internal.s.h(applicationId, "applicationId");
        kotlin.jvm.internal.s.h(redirectURI, "redirectURI");
        Context applicationContext = context.getApplicationContext();
        this.f15421a = applicationContext != null ? applicationContext : context;
        this.f15426f = i10;
        this.f15427g = i11;
        this.f15428h = applicationId;
        this.f15429i = redirectURI;
        this.f15430j = i12;
        this.f15431k = str;
        this.f15422b = new a();
    }

    private final void a(Bundle bundle) {
        if (this.f15424d) {
            this.f15424d = false;
            b bVar = this.f15423c;
            if (bVar != null) {
                bVar.a(bundle);
            }
        }
    }

    private final void e() {
        Bundle bundle = new Bundle();
        bundle.putString("com.facebook.platform.extra.APPLICATION_ID", this.f15428h);
        String str = this.f15431k;
        if (str != null) {
            bundle.putString("com.facebook.platform.extra.NONCE", str);
        }
        String str2 = this.f15429i;
        if (str2 != null) {
            bundle.putString("com.facebook.platform.extra.REDIRECT_URI", str2);
        }
        d(bundle);
        Message messageObtain = Message.obtain((Handler) null, this.f15426f);
        messageObtain.arg1 = this.f15430j;
        messageObtain.setData(bundle);
        messageObtain.replyTo = new Messenger(this.f15422b);
        try {
            Messenger messenger = this.f15425e;
            if (messenger != null) {
                messenger.send(messageObtain);
            }
        } catch (RemoteException unused) {
            a(null);
        }
    }

    public final void b() {
        this.f15424d = false;
    }

    protected final void c(Message message) {
        kotlin.jvm.internal.s.h(message, "message");
        if (message.what == this.f15427g) {
            Bundle data = message.getData();
            if (data.getString("com.facebook.platform.status.ERROR_TYPE") != null) {
                a(null);
            } else {
                a(data);
            }
            try {
                this.f15421a.unbindService(this);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    protected abstract void d(Bundle bundle);

    public final void f(b bVar) {
        this.f15423c = bVar;
    }

    public final boolean g() {
        synchronized (this) {
            boolean z10 = false;
            if (this.f15424d) {
                return false;
            }
            if (u0.y(this.f15430j) == -1) {
                return false;
            }
            Intent intentO = u0.o(this.f15421a);
            if (intentO != null) {
                z10 = true;
                this.f15424d = true;
                this.f15421a.bindService(intentO, this, 1);
            }
            return z10;
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName name, IBinder service) {
        kotlin.jvm.internal.s.h(name, "name");
        kotlin.jvm.internal.s.h(service, "service");
        this.f15425e = new Messenger(service);
        e();
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName name) {
        kotlin.jvm.internal.s.h(name, "name");
        this.f15425e = null;
        try {
            this.f15421a.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        a(null);
    }
}
