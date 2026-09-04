package com.facebook.login;

import android.content.ComponentName;
import android.net.Uri;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class d extends androidx.browser.customtabs.e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static androidx.browser.customtabs.c f15577c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static androidx.browser.customtabs.i f15578d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f15576b = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final ReentrantLock f15579e = new ReentrantLock();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void d() {
            androidx.browser.customtabs.c cVar;
            d.f15579e.lock();
            if (d.f15578d == null && (cVar = d.f15577c) != null) {
                d.f15578d = cVar.f(null);
            }
            d.f15579e.unlock();
        }

        public final androidx.browser.customtabs.i b() {
            d.f15579e.lock();
            androidx.browser.customtabs.i iVar = d.f15578d;
            d.f15578d = null;
            d.f15579e.unlock();
            return iVar;
        }

        public final void c(Uri url) {
            kotlin.jvm.internal.s.h(url, "url");
            d();
            d.f15579e.lock();
            androidx.browser.customtabs.i iVar = d.f15578d;
            if (iVar != null) {
                iVar.i(url, null, null);
            }
            d.f15579e.unlock();
        }

        private a() {
        }
    }

    @Override // androidx.browser.customtabs.e
    public void onCustomTabsServiceConnected(ComponentName name, androidx.browser.customtabs.c newClient) {
        kotlin.jvm.internal.s.h(name, "name");
        kotlin.jvm.internal.s.h(newClient, "newClient");
        newClient.h(0L);
        f15577c = newClient;
        f15576b.d();
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        kotlin.jvm.internal.s.h(componentName, "componentName");
    }
}
