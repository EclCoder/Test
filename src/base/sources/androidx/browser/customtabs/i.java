package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f1856a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c.b f1857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c.a f1858c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ComponentName f1859d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final PendingIntent f1860e;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends c.c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Handler f1861a = new Handler(Looper.getMainLooper());

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ j f1862b;

        a(j jVar) {
            this.f1862b = jVar;
        }

        @Override // c.c
        public void onGreatestScrollPercentageIncreased(final int i10, final Bundle bundle) {
            Handler handler = this.f1861a;
            final j jVar = this.f1862b;
            handler.post(new Runnable() { // from class: androidx.browser.customtabs.g
                @Override // java.lang.Runnable
                public final void run() {
                    jVar.onGreatestScrollPercentageIncreased(i10, bundle);
                }
            });
        }

        @Override // c.c
        public void onSessionEnded(final boolean z10, final Bundle bundle) {
            Handler handler = this.f1861a;
            final j jVar = this.f1862b;
            handler.post(new Runnable() { // from class: androidx.browser.customtabs.f
                @Override // java.lang.Runnable
                public final void run() {
                    jVar.onSessionEnded(z10, bundle);
                }
            });
        }

        @Override // c.c
        public void onVerticalScrollEvent(final boolean z10, final Bundle bundle) {
            Handler handler = this.f1861a;
            final j jVar = this.f1862b;
            handler.post(new Runnable() { // from class: androidx.browser.customtabs.h
                @Override // java.lang.Runnable
                public final void run() {
                    jVar.onVerticalScrollEvent(z10, bundle);
                }
            });
        }
    }

    i(c.b bVar, c.a aVar, ComponentName componentName, PendingIntent pendingIntent) {
        this.f1857b = bVar;
        this.f1858c = aVar;
        this.f1859d = componentName;
        this.f1860e = pendingIntent;
    }

    private void a(Bundle bundle) {
        PendingIntent pendingIntent = this.f1860e;
        if (pendingIntent != null) {
            bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
        }
    }

    private Bundle b(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        a(bundle2);
        return bundle2;
    }

    private c.c.a c(j jVar) {
        return new a(jVar);
    }

    private Bundle d(Uri uri) {
        Bundle bundle = new Bundle();
        if (uri != null) {
            bundle.putParcelable("target_origin", uri);
        }
        if (this.f1860e != null) {
            a(bundle);
        }
        if (bundle.isEmpty()) {
            return null;
        }
        return bundle;
    }

    IBinder e() {
        return this.f1858c.asBinder();
    }

    ComponentName f() {
        return this.f1859d;
    }

    PendingIntent g() {
        return this.f1860e;
    }

    public boolean h(Bundle bundle) {
        try {
            return this.f1857b.h(this.f1858c, b(bundle));
        } catch (SecurityException e10) {
            throw new UnsupportedOperationException("This method isn't supported by the Custom Tabs implementation.", e10);
        }
    }

    public boolean i(Uri uri, Bundle bundle, List list) {
        try {
            return this.f1857b.k(this.f1858c, uri, b(bundle), list);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public int j(String str, Bundle bundle) {
        int iL;
        Bundle bundleB = b(bundle);
        synchronized (this.f1856a) {
            try {
                try {
                    iL = this.f1857b.l(this.f1858c, str, bundleB);
                } catch (RemoteException unused) {
                    return -2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iL;
    }

    public boolean k(Uri uri) {
        return l(uri, null, new Bundle());
    }

    public boolean l(Uri uri, Uri uri2, Bundle bundle) {
        try {
            Bundle bundleD = d(uri2);
            if (bundleD == null) {
                return this.f1857b.q(this.f1858c, uri);
            }
            bundle.putAll(bundleD);
            return this.f1857b.z(this.f1858c, uri, bundle);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public boolean m(j jVar, Bundle bundle) {
        try {
            return this.f1857b.w(this.f1858c, c(jVar).asBinder(), b(bundle));
        } catch (SecurityException e10) {
            throw new UnsupportedOperationException("This method isn't supported by the Custom Tabs implementation.", e10);
        }
    }
}
