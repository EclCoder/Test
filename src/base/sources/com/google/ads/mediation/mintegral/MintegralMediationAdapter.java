package com.google.ads.mediation.mintegral;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.ads.mediation.mintegral.MintegralMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.VersionInfo;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationAppOpenAdCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbSignalData;
import com.google.android.gms.ads.mediation.rtb.SignalCallbacks;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.MBridgeSDK;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.same.net.Aa;
import com.mbridge.msdk.mbbid.out.BidManager;
import com.mbridge.msdk.out.MBridgeSDKFactory;
import com.mbridge.msdk.out.SDKInitStatusListener;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.mp3.Annu.HqKnbV;
import com.mbridge.msdk.system.MBridgeSDKImpl;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import q8.j;
import t8.b;
import t8.c;
import t8.d;
import t8.e;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class MintegralMediationAdapter extends RtbAdapter {
    public static final String TAG = "MintegralMediationAdapter";
    public static final Map<j, WeakReference<Object>> loadedSlotIdentifiers = new ConcurrentHashMap();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static MBridgeSDK f16333n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b f16334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c f16335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private e f16336c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private d f16337d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private t8.a f16338e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private s8.b f16339f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private s8.c f16340g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private s8.e f16341h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private s8.d f16342i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private s8.a f16343j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ExecutorService f16344k = Executors.newCachedThreadPool();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final q8.a f16345l = new q8.a();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final q8.b f16346m = new q8.b();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public class a implements SDKInitStatusListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f16347a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ InitializationCompleteCallback f16348b;

        a(Context context, InitializationCompleteCallback initializationCompleteCallback) {
            this.f16347a = context;
            this.f16348b = initializationCompleteCallback;
        }

        @Override // com.mbridge.msdk.out.SDKInitStatusListener
        public void onInitFail(String str) {
            AdError adErrorB = q8.e.b(105, str);
            this.f16348b.onInitializationFailed(adErrorB.getMessage());
            Log.w(MintegralMediationAdapter.TAG, adErrorB.toString());
        }

        @Override // com.mbridge.msdk.out.SDKInitStatusListener
        public void onInitSuccess() {
            com.google.ads.mediation.mintegral.a.a(this.f16347a, MintegralMediationAdapter.f16333n);
            this.f16348b.onInitializationSucceeded();
        }
    }

    public static /* synthetic */ void a(MintegralMediationAdapter mintegralMediationAdapter, Map map, Context context, InitializationCompleteCallback initializationCompleteCallback) {
        mintegralMediationAdapter.getClass();
        f16333n.init((Map<String, String>) map, context, mintegralMediationAdapter.new a(context, initializationCompleteCallback));
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void collectSignals(RtbSignalData rtbSignalData, SignalCallbacks signalCallbacks) {
        if (this.f16345l.c()) {
            Iterator it = com.google.ads.mediation.mintegral.a.d(rtbSignalData).iterator();
            while (it.hasNext()) {
                WeakReference<Object> weakReference = loadedSlotIdentifiers.get((j) it.next());
                if (weakReference != null && weakReference.get() != null) {
                    signalCallbacks.onFailure(new AdError(106, "An ad for the Mintegral slot is already loaded and is yet to be shown.", "com.google.ads.mediation.mintegral"));
                    return;
                }
            }
        }
        signalCallbacks.onSuccess(BidManager.getBuyerUid(rtbSignalData.getContext()));
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public VersionInfo getSDKVersionInfo() {
        String strE = com.google.ads.mediation.mintegral.a.e();
        String[] strArrSplit = strE.split("_");
        if (strArrSplit.length > 1) {
            String[] strArrSplit2 = strArrSplit[1].split("\\.");
            if (strArrSplit2.length >= 3) {
                return new VersionInfo(Integer.parseInt(strArrSplit2[0]), Integer.parseInt(strArrSplit2[1]), Integer.parseInt(strArrSplit2[2]));
            }
        }
        Log.w(TAG, String.format("Unexpected SDK version format: %s. Returning 0.0.0 for SDK version.", strE));
        return new VersionInfo(0, 0, 0);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void initialize(final Context context, final InitializationCompleteCallback initializationCompleteCallback, List<MediationConfiguration> list) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        Iterator<MediationConfiguration> it = list.iterator();
        while (it.hasNext()) {
            Bundle serverParameters = it.next().getServerParameters();
            String string = serverParameters.getString(MBridgeConstans.APP_ID);
            String string2 = serverParameters.getString(MBridgeConstans.APP_KEY);
            if (!TextUtils.isEmpty(string)) {
                hashSet.add(string);
            }
            if (!TextUtils.isEmpty(string2)) {
                hashSet2.add(string2);
            }
        }
        int size = hashSet.size();
        int size2 = hashSet2.size();
        if (size <= 0 || size2 <= 0) {
            AdError adErrorA = q8.e.a(101, "Missing or invalid App ID or App Key configured for this ad source instance in the AdMob or Ad Manager UI");
            Log.e(TAG, adErrorA.toString());
            initializationCompleteCallback.onInitializationFailed(adErrorA.toString());
            return;
        }
        String str = (String) hashSet.iterator().next();
        String str2 = (String) hashSet2.iterator().next();
        if (size > 1) {
            Log.w(TAG, String.format("Found multiple app IDs in %s. Using %s to initialize Mintegral SDK.", hashSet, str));
        }
        if (size2 > 1) {
            Log.w(TAG, String.format("Found multiple App Keys in %s. Using %s to initialize Mintegral SDK.", hashSet2, str2));
        }
        MBridgeSDKImpl mBridgeSDK = MBridgeSDKFactory.getMBridgeSDK();
        f16333n = mBridgeSDK;
        final Map<String, String> mBConfigurationMap = mBridgeSDK.getMBConfigurationMap(str, str2);
        try {
            Aa aa2 = new Aa();
            Method declaredMethod = Aa.class.getDeclaredMethod(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, String.class);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(aa2, "Y+H6DFttYrPQYcIBiQKwJQKQYrN=");
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        this.f16344k.submit(new Runnable() { // from class: q8.g
            @Override // java.lang.Runnable
            public final void run() {
                MintegralMediationAdapter.a(this.f50431a, mBConfigurationMap, context, initializationCompleteCallback);
            }
        });
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadAppOpenAd(MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration, MediationAdLoadCallback<MediationAppOpenAd, MediationAppOpenAdCallback> mediationAdLoadCallback) {
        this.f16345l.b(mediationAppOpenAdConfiguration.getServerParameters());
        t8.a aVar = new t8.a(mediationAdLoadCallback, this.f16345l);
        this.f16338e = aVar;
        aVar.a(mediationAppOpenAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadBannerAd(MediationBannerAdConfiguration mediationBannerAdConfiguration, MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback) {
        this.f16345l.b(mediationBannerAdConfiguration.getServerParameters());
        b bVar = new b(mediationAdLoadCallback);
        this.f16334a = bVar;
        bVar.b(mediationBannerAdConfiguration, this.f16346m);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadInterstitialAd(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback) {
        this.f16345l.b(mediationInterstitialAdConfiguration.getServerParameters());
        c cVar = new c(mediationInterstitialAdConfiguration, mediationAdLoadCallback, this.f16345l);
        this.f16335b = cVar;
        cVar.a(mediationInterstitialAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadNativeAd(MediationNativeAdConfiguration mediationNativeAdConfiguration, MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback) {
        this.f16345l.b(mediationNativeAdConfiguration.getServerParameters());
        d dVar = new d(mediationNativeAdConfiguration, mediationAdLoadCallback);
        this.f16337d = dVar;
        dVar.c(mediationNativeAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadRewardedAd(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        this.f16345l.b(mediationRewardedAdConfiguration.getServerParameters());
        e eVar = new e(mediationRewardedAdConfiguration, mediationAdLoadCallback, this.f16345l);
        this.f16336c = eVar;
        eVar.a(mediationRewardedAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbAppOpenAd(MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration, MediationAdLoadCallback<MediationAppOpenAd, MediationAppOpenAdCallback> mediationAdLoadCallback) {
        this.f16345l.b(mediationAppOpenAdConfiguration.getServerParameters());
        s8.a aVar = new s8.a(mediationAdLoadCallback, this.f16345l);
        this.f16343j = aVar;
        aVar.a(mediationAppOpenAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbBannerAd(MediationBannerAdConfiguration mediationBannerAdConfiguration, MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback) {
        this.f16345l.b(mediationBannerAdConfiguration.getServerParameters());
        s8.b bVar = new s8.b(mediationAdLoadCallback);
        this.f16339f = bVar;
        bVar.b(mediationBannerAdConfiguration, this.f16346m);
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbInterstitialAd(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback) {
        this.f16345l.b(mediationInterstitialAdConfiguration.getServerParameters());
        s8.c cVar = new s8.c(mediationInterstitialAdConfiguration, mediationAdLoadCallback, this.f16345l);
        this.f16340g = cVar;
        cVar.a(mediationInterstitialAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbNativeAd(MediationNativeAdConfiguration mediationNativeAdConfiguration, MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback) {
        this.f16345l.b(mediationNativeAdConfiguration.getServerParameters());
        s8.d dVar = new s8.d(mediationNativeAdConfiguration, mediationAdLoadCallback);
        this.f16342i = dVar;
        dVar.c(mediationNativeAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbRewardedAd(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        this.f16345l.b(mediationRewardedAdConfiguration.getServerParameters());
        s8.e eVar = new s8.e(mediationRewardedAdConfiguration, mediationAdLoadCallback, this.f16345l);
        this.f16341h = eVar;
        eVar.a(mediationRewardedAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public VersionInfo getVersionInfo() {
        String strC = com.google.ads.mediation.mintegral.a.c();
        String[] strArrSplit = strC.split("\\.");
        if (strArrSplit.length >= 4) {
            return new VersionInfo(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), (Integer.parseInt(strArrSplit[2]) * 100) + Integer.parseInt(strArrSplit[3]));
        }
        Log.w(TAG, String.format(HqKnbV.IUvpzJx, strC));
        return new VersionInfo(0, 0, 0);
    }
}
