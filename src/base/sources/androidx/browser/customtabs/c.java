package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c.b f1794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ComponentName f1795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f1796c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b extends c.a.AbstractBinderC0119a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Handler f1798a = new Handler(Looper.getMainLooper());

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.browser.customtabs.b f1799b;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Bundle f1801a;

            a(Bundle bundle) {
                this.f1801a = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f1799b.onUnminimized(this.f1801a);
            }
        }

        /* JADX INFO: renamed from: androidx.browser.customtabs.c$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class RunnableC0016b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f1803a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Bundle f1804b;

            RunnableC0016b(int i10, Bundle bundle) {
                this.f1803a = i10;
                this.f1804b = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f1799b.onNavigationEvent(this.f1803a, this.f1804b);
            }
        }

        /* JADX INFO: renamed from: androidx.browser.customtabs.c$b$c, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class RunnableC0017c implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f1806a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Bundle f1807b;

            RunnableC0017c(String str, Bundle bundle) {
                this.f1806a = str;
                this.f1807b = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f1799b.extraCallback(this.f1806a, this.f1807b);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class d implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Bundle f1809a;

            d(Bundle bundle) {
                this.f1809a = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f1799b.onMessageChannelReady(this.f1809a);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class e implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f1811a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Bundle f1812b;

            e(String str, Bundle bundle) {
                this.f1811a = str;
                this.f1812b = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f1799b.onPostMessage(this.f1811a, this.f1812b);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class f implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f1814a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Uri f1815b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ boolean f1816c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Bundle f1817d;

            f(int i10, Uri uri, boolean z10, Bundle bundle) {
                this.f1814a = i10;
                this.f1815b = uri;
                this.f1816c = z10;
                this.f1817d = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f1799b.onRelationshipValidationResult(this.f1814a, this.f1815b, this.f1816c, this.f1817d);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class g implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f1819a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f1820b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Bundle f1821c;

            g(int i10, int i11, Bundle bundle) {
                this.f1819a = i10;
                this.f1820b = i11;
                this.f1821c = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f1799b.onActivityResized(this.f1819a, this.f1820b, this.f1821c);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class h implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Bundle f1823a;

            h(Bundle bundle) {
                this.f1823a = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f1799b.onWarmupCompleted(this.f1823a);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class i implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f1825a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f1826b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f1827c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ int f1828d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ int f1829e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ Bundle f1830f;

            i(int i10, int i11, int i12, int i13, int i14, Bundle bundle) {
                this.f1825a = i10;
                this.f1826b = i11;
                this.f1827c = i12;
                this.f1828d = i13;
                this.f1829e = i14;
                this.f1830f = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f1799b.onActivityLayout(this.f1825a, this.f1826b, this.f1827c, this.f1828d, this.f1829e, this.f1830f);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class j implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Bundle f1832a;

            j(Bundle bundle) {
                this.f1832a = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f1799b.onMinimized(this.f1832a);
            }
        }

        b(androidx.browser.customtabs.b bVar) {
            this.f1799b = bVar;
        }

        @Override // c.a
        public void c(int i10, int i11, int i12, int i13, int i14, Bundle bundle) {
            if (this.f1799b == null) {
                return;
            }
            this.f1798a.post(new i(i10, i11, i12, i13, i14, bundle));
        }

        @Override // c.a
        public Bundle f(String str, Bundle bundle) {
            androidx.browser.customtabs.b bVar = this.f1799b;
            if (bVar == null) {
                return null;
            }
            return bVar.extraCallbackWithResult(str, bundle);
        }

        @Override // c.a
        public void i(String str, Bundle bundle) {
            if (this.f1799b == null) {
                return;
            }
            this.f1798a.post(new RunnableC0017c(str, bundle));
        }

        @Override // c.a
        public void j(Bundle bundle) {
            if (this.f1799b == null) {
                return;
            }
            this.f1798a.post(new h(bundle));
        }

        @Override // c.a
        public void r(Bundle bundle) {
            if (this.f1799b == null) {
                return;
            }
            this.f1798a.post(new j(bundle));
        }

        @Override // c.a
        public void s(Bundle bundle) {
            if (this.f1799b == null) {
                return;
            }
            this.f1798a.post(new a(bundle));
        }

        @Override // c.a
        public void t(int i10, int i11, Bundle bundle) {
            if (this.f1799b == null) {
                return;
            }
            this.f1798a.post(new g(i10, i11, bundle));
        }

        @Override // c.a
        public void u(int i10, Bundle bundle) {
            if (this.f1799b == null) {
                return;
            }
            this.f1798a.post(new RunnableC0016b(i10, bundle));
        }

        @Override // c.a
        public void v(String str, Bundle bundle) {
            if (this.f1799b == null) {
                return;
            }
            this.f1798a.post(new e(str, bundle));
        }

        @Override // c.a
        public void x(Bundle bundle) {
            if (this.f1799b == null) {
                return;
            }
            this.f1798a.post(new d(bundle));
        }

        @Override // c.a
        public void y(int i10, Uri uri, boolean z10, Bundle bundle) {
            if (this.f1799b == null) {
                return;
            }
            this.f1798a.post(new f(i10, uri, z10, bundle));
        }
    }

    c(c.b bVar, ComponentName componentName, Context context) {
        this.f1794a = bVar;
        this.f1795b = componentName;
        this.f1796c = context;
    }

    public static boolean a(Context context, String str, e eVar) {
        eVar.setApplicationContext(context.getApplicationContext());
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, eVar, 33);
    }

    public static boolean b(Context context, String str) {
        if (str == null) {
            return false;
        }
        Context applicationContext = context.getApplicationContext();
        try {
            return a(applicationContext, str, new a(applicationContext));
        } catch (SecurityException unused) {
            return false;
        }
    }

    private c.a.AbstractBinderC0119a c(androidx.browser.customtabs.b bVar) {
        return new b(bVar);
    }

    public static String d(Context context, List list) {
        return e(context, list, false);
    }

    public static String e(Context context, List list, boolean z10) {
        ResolveInfo resolveInfoResolveActivity;
        PackageManager packageManager = context.getPackageManager();
        List<String> arrayList = list == null ? new ArrayList() : list;
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://"));
        if (!z10 && (resolveInfoResolveActivity = packageManager.resolveActivity(intent, 0)) != null) {
            String str = resolveInfoResolveActivity.activityInfo.packageName;
            ArrayList arrayList2 = new ArrayList(arrayList.size() + 1);
            arrayList2.add(str);
            if (list != null) {
                arrayList2.addAll(list);
            }
            arrayList = arrayList2;
        }
        Intent intent2 = new Intent("android.support.customtabs.action.CustomTabsService");
        for (String str2 : arrayList) {
            intent2.setPackage(str2);
            if (packageManager.resolveService(intent2, 0) != null) {
                return str2;
            }
        }
        if (Build.VERSION.SDK_INT < 30) {
            return null;
        }
        Log.w("CustomTabsClient", "Unable to find any Custom Tabs packages, you may need to add a <queries> element to your manifest. See the docs for CustomTabsClient#getPackageName.");
        return null;
    }

    private i g(androidx.browser.customtabs.b bVar, PendingIntent pendingIntent) {
        boolean zE;
        c.a.AbstractBinderC0119a abstractBinderC0119aC = c(bVar);
        try {
            if (pendingIntent != null) {
                Bundle bundle = new Bundle();
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
                zE = this.f1794a.a(abstractBinderC0119aC, bundle);
            } else {
                zE = this.f1794a.e(abstractBinderC0119aC);
            }
            if (zE) {
                return new i(this.f1794a, abstractBinderC0119aC, this.f1795b, pendingIntent);
            }
            return null;
        } catch (RemoteException unused) {
            return null;
        }
    }

    public i f(androidx.browser.customtabs.b bVar) {
        return g(bVar, null);
    }

    public boolean h(long j10) {
        try {
            return this.f1794a.p(j10);
        } catch (RemoteException unused) {
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f1797b;

        a(Context context) {
            this.f1797b = context;
        }

        @Override // androidx.browser.customtabs.e
        public final void onCustomTabsServiceConnected(ComponentName componentName, c cVar) {
            cVar.h(0L);
            this.f1797b.unbindService(this);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }
}
