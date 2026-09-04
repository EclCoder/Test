package com.facebook.ads.internal.dynamicloading;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.internal.api.AdViewApi;
import com.facebook.ads.internal.api.AdViewParentApi;
import com.facebook.ads.internal.api.InterstitialAdApi;
import com.facebook.ads.internal.api.NativeAdBaseApi;
import com.facebook.ads.internal.api.RewardedVideoAdApi;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
class DynamicLoaderFallback {
    private static final WeakHashMap<Object, AdListener> sApiProxyToAdListenersMap = new WeakHashMap<>();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements InvocationHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f14889a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Map f14890b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f14891c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ List f14892d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Map f14893e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f14894f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ List f14895g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ Method f14896h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ Method f14897i;

        a(List list, Map map, List list2, List list3, Map map2, List list4, List list5, Method method, Method method2) {
            this.f14889a = list;
            this.f14890b = map;
            this.f14891c = list2;
            this.f14892d = list3;
            this.f14893e = map2;
            this.f14894f = list4;
            this.f14895g = list5;
            this.f14896h = method;
            this.f14897i = method2;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            if (method.getReturnType().isPrimitive()) {
                if (!method.getReturnType().equals(Void.TYPE)) {
                    return Array.get(Array.newInstance(method.getReturnType(), 1), 0);
                }
                Iterator it = this.f14889a.iterator();
                while (it.hasNext() && (!DynamicLoaderFallback.equalsMethods(method, (Method) it.next()) || !DynamicLoaderFallback.reportError(obj, this.f14890b))) {
                }
                Iterator it2 = this.f14891c.iterator();
                while (it2.hasNext()) {
                    if (DynamicLoaderFallback.equalsMethods(method, (Method) it2.next()) && DynamicLoaderFallback.reportError(obj, this.f14890b)) {
                        return null;
                    }
                }
                return null;
            }
            if (method.getReturnType().equals(String.class)) {
                return "";
            }
            Object objNewProxyInstance = method.getReturnType().equals(obj.getClass().getInterfaces()[0]) ? obj : Proxy.newProxyInstance(DynamicLoaderFallback.class.getClassLoader(), new Class[]{method.getReturnType()}, this);
            Iterator it3 = this.f14892d.iterator();
            while (it3.hasNext()) {
                if (DynamicLoaderFallback.equalsMethods(method, (Method) it3.next())) {
                    DynamicLoaderFallback.sApiProxyToAdListenersMap.put(this.f14893e.get(obj), (AdListener) objArr[0]);
                    break;
                }
            }
            Iterator it4 = this.f14894f.iterator();
            while (it4.hasNext()) {
                if (DynamicLoaderFallback.equalsMethods(method, (Method) it4.next())) {
                    this.f14893e.put(objNewProxyInstance, obj);
                }
            }
            Iterator it5 = this.f14895g.iterator();
            while (it5.hasNext()) {
                if (DynamicLoaderFallback.equalsMethods(method, (Method) it5.next())) {
                    for (Object obj2 : objArr) {
                        if (obj2 instanceof Ad) {
                            this.f14890b.put(objNewProxyInstance, (Ad) obj2);
                        }
                    }
                }
            }
            if (DynamicLoaderFallback.equalsMethods(method, this.f14896h)) {
                this.f14890b.put(objArr[1], (Ad) objArr[0]);
            }
            if (DynamicLoaderFallback.equalsMethods(method, this.f14897i)) {
                this.f14890b.put(objArr[1], (Ad) objArr[0]);
            }
            return objNewProxyInstance;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdListener f14898a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Ad f14899b;

        b(AdListener adListener, Ad ad2) {
            this.f14898a = adListener;
            this.f14899b = ad2;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f14898a.onError(this.f14899b, new AdError(-1, "Can't load Audience Network Dex. Please, check that audience_network folder is inside of assets folder."));
        }
    }

    DynamicLoaderFallback() {
    }

    private static boolean equalsMethodParams(Method method, Method method2) {
        return Arrays.equals(method.getParameterTypes(), method2.getParameterTypes());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean equalsMethods(Method method, Method method2) {
        return method != null && method2 != null && method.getDeclaringClass().equals(method2.getDeclaringClass()) && method.getName().equals(method2.getName()) && equalsMethodParams(method, method2);
    }

    static DynamicLoader makeFallbackLoader() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        c cVar = new c(null);
        DynamicLoader dynamicLoader = (DynamicLoader) cVar.c(DynamicLoader.class);
        dynamicLoader.createInterstitialAd(null, null, null);
        arrayList5.add(cVar.b());
        dynamicLoader.createRewardedVideoAd(null, null, null);
        arrayList5.add(cVar.b());
        dynamicLoader.createAdViewApi((Context) null, (String) null, (AdSize) null, (AdViewParentApi) null, (AdView) null);
        arrayList5.add(cVar.b());
        try {
            dynamicLoader.createAdViewApi((Context) null, (String) null, (String) null, (AdViewParentApi) null, (AdView) null);
        } catch (Exception unused) {
        }
        arrayList5.add(cVar.b());
        dynamicLoader.createNativeAdApi(null, null);
        Method methodB = cVar.b();
        dynamicLoader.createNativeBannerAdApi(null, null);
        Method methodB2 = cVar.b();
        NativeAdBaseApi nativeAdBaseApi = (NativeAdBaseApi) cVar.c(NativeAdBaseApi.class);
        nativeAdBaseApi.loadAd();
        arrayList.add(cVar.b());
        nativeAdBaseApi.loadAd(null);
        arrayList2.add(cVar.b());
        nativeAdBaseApi.buildLoadAdConfig(null);
        arrayList4.add(cVar.b());
        InterstitialAdApi interstitialAdApi = (InterstitialAdApi) cVar.c(InterstitialAdApi.class);
        interstitialAdApi.loadAd();
        arrayList.add(cVar.b());
        interstitialAdApi.loadAd(null);
        arrayList2.add(cVar.b());
        interstitialAdApi.buildLoadAdConfig();
        arrayList4.add(cVar.b());
        RewardedVideoAdApi rewardedVideoAdApi = (RewardedVideoAdApi) cVar.c(RewardedVideoAdApi.class);
        rewardedVideoAdApi.loadAd();
        arrayList.add(cVar.b());
        rewardedVideoAdApi.loadAd(null);
        arrayList2.add(cVar.b());
        rewardedVideoAdApi.buildLoadAdConfig();
        arrayList4.add(cVar.b());
        AdViewApi adViewApi = (AdViewApi) cVar.c(AdViewApi.class);
        adViewApi.loadAd();
        arrayList.add(cVar.b());
        adViewApi.loadAd(null);
        arrayList2.add(cVar.b());
        adViewApi.buildLoadAdConfig();
        arrayList4.add(cVar.b());
        ((AdView.AdViewLoadConfigBuilder) cVar.c(AdView.AdViewLoadConfigBuilder.class)).withAdListener(null);
        arrayList3.add(cVar.b());
        ((NativeAdBase.NativeAdLoadConfigBuilder) cVar.c(NativeAdBase.NativeAdLoadConfigBuilder.class)).withAdListener(null);
        arrayList3.add(cVar.b());
        ((InterstitialAd.InterstitialAdLoadConfigBuilder) cVar.c(InterstitialAd.InterstitialAdLoadConfigBuilder.class)).withAdListener(null);
        arrayList3.add(cVar.b());
        ((RewardedVideoAd.RewardedVideoAdLoadConfigBuilder) cVar.c(RewardedVideoAd.RewardedVideoAdLoadConfigBuilder.class)).withAdListener(null);
        arrayList3.add(cVar.b());
        return (DynamicLoader) Proxy.newProxyInstance(DynamicLoaderFallback.class.getClassLoader(), new Class[]{DynamicLoader.class}, new a(arrayList, map, arrayList2, arrayList3, map2, arrayList4, arrayList5, methodB, methodB2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean reportError(Object obj, Map<Object, Ad> map) {
        if (obj == null) {
            return false;
        }
        AdListener adListener = sApiProxyToAdListenersMap.get(obj);
        Ad ad2 = map.get(obj);
        if (adListener == null) {
            return false;
        }
        new Handler(Looper.getMainLooper()).postDelayed(new b(adListener, ad2), 500L);
        return true;
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Method f14900a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final InvocationHandler f14901b;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class a implements InvocationHandler {
            a() {
            }

            @Override // java.lang.reflect.InvocationHandler
            public Object invoke(Object obj, Method method, Object[] objArr) {
                if ("toString".equals(method.getName())) {
                    return null;
                }
                c.this.f14900a = method;
                return null;
            }
        }

        private c() {
            this.f14901b = new a();
        }

        Method b() {
            return this.f14900a;
        }

        public Object c(Class cls) {
            return cls.cast(Proxy.newProxyInstance(DynamicLoaderFallback.class.getClassLoader(), new Class[]{cls}, this.f14901b));
        }

        /* synthetic */ c(a aVar) {
            this();
        }
    }
}
