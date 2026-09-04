package xm;

import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import androidx.browser.customtabs.i;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference f56886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicReference f56887b = new AtomicReference();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CountDownLatch f56888c = new CountDownLatch(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private androidx.browser.customtabs.e f56889d;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends androidx.browser.customtabs.e {
        a() {
        }

        private void a(androidx.browser.customtabs.c cVar) {
            e.this.f56887b.set(cVar);
            e.this.f56888c.countDown();
        }

        @Override // androidx.browser.customtabs.e
        public void onCustomTabsServiceConnected(ComponentName componentName, androidx.browser.customtabs.c cVar) {
            zm.a.a("CustomTabsService is connected", new Object[0]);
            cVar.h(0L);
            a(cVar);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            zm.a.a("CustomTabsService is disconnected", new Object[0]);
            a(null);
        }
    }

    public e(Context context) {
        this.f56886a = new WeakReference(context);
    }

    public synchronized void c(String str) {
        try {
            if (this.f56889d != null) {
                return;
            }
            this.f56889d = new a();
            Context context = (Context) this.f56886a.get();
            if (context == null || !androidx.browser.customtabs.c.a(context, str, this.f56889d)) {
                zm.a.e("Unable to bind custom tabs service", new Object[0]);
                this.f56888c.countDown();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public i d(androidx.browser.customtabs.b bVar, Uri... uriArr) {
        androidx.browser.customtabs.c cVarF = f();
        if (cVarF == null) {
            return null;
        }
        i iVarF = cVarF.f(bVar);
        if (iVarF == null) {
            zm.a.g("Failed to create custom tabs session through custom tabs client", new Object[0]);
            return null;
        }
        if (uriArr != null && uriArr.length > 0) {
            iVarF.i(uriArr[0], null, zm.b.f(uriArr, 1));
        }
        return iVarF;
    }

    public androidx.browser.customtabs.d.C0018d e(Uri... uriArr) {
        return new androidx.browser.customtabs.d.C0018d(d(null, uriArr));
    }

    public androidx.browser.customtabs.c f() {
        try {
            this.f56888c.await(1L, TimeUnit.SECONDS);
        } catch (InterruptedException unused) {
            zm.a.e("Interrupted while waiting for browser connection", new Object[0]);
            this.f56888c.countDown();
        }
        return (androidx.browser.customtabs.c) this.f56887b.get();
    }
}
