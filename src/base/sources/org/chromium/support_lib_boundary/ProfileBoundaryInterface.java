package org.chromium.support_lib_boundary;

import android.webkit.CookieManager;
import android.webkit.GeolocationPermissions;
import android.webkit.ServiceWorkerController;
import android.webkit.ValueCallback;
import android.webkit.WebStorage;
import java.lang.reflect.InvocationHandler;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public interface ProfileBoundaryInterface {
    void cancelPrefetch(String str);

    void clearPrefetch(String str, ValueCallback<InvocationHandler> valueCallback);

    CookieManager getCookieManager();

    GeolocationPermissions getGeoLocationPermissions();

    String getName();

    ServiceWorkerController getServiceWorkerController();

    WebStorage getWebStorage();

    void prefetchUrl(String str, ValueCallback<InvocationHandler> valueCallback);

    void prefetchUrl(String str, InvocationHandler invocationHandler, ValueCallback<InvocationHandler> valueCallback);
}
