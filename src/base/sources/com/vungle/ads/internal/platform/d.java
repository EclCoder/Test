package com.vungle.ads.internal.platform;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.os.SystemClock;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import bm.r;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.internal.executor.i;
import com.vungle.ads.internal.util.q;
import fl.k;
import fl.l;
import fl.o;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class d implements f {
    public static final a Companion = new a(null);
    private static final String PREF_KEY_SDK_INSTALL_TIME = "sit";
    private static final String TAG = "AndroidPlatform";
    private com.vungle.ads.internal.model.c advertisingInfo;
    private String appSetId;
    private Integer appSetIdScope;
    private final AudioManager audioManager;
    private final Context context;
    private String gpVersion;
    private final boolean isSideLoaded;
    private final PowerManager powerManager;
    private Long sdkInstallationTime;
    private final i uaExecutor;
    private String userAgent;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String getCarrierName$vungle_ads_release(Context context) {
            s.h(context, "context");
            Object systemService = context.getSystemService("phone");
            s.f(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
            return ((TelephonyManager) systemService).getNetworkOperatorName();
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b extends t implements tl.a {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context) {
            super(0);
            this.$context = context;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.persistence.b, java.lang.Object] */
        @Override // tl.a
        public final com.vungle.ads.internal.persistence.b invoke() {
            return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.persistence.b.class);
        }
    }

    public d(Context context, i uaExecutor, PowerManager powerManager, AudioManager audioManager) {
        s.h(context, "context");
        s.h(uaExecutor, "uaExecutor");
        s.h(powerManager, "powerManager");
        s.h(audioManager, "audioManager");
        this.context = context;
        this.uaExecutor = uaExecutor;
        this.powerManager = powerManager;
        this.audioManager = audioManager;
        updateAppSetID();
    }

    private final com.vungle.ads.internal.model.c getAmazonAdvertisingInfo() {
        com.vungle.ads.internal.model.c cVar = new com.vungle.ads.internal.model.c();
        try {
            ContentResolver contentResolver = this.context.getContentResolver();
            boolean z10 = true;
            if (Settings.Secure.getInt(contentResolver, "limit_ad_tracking") != 1) {
                z10 = false;
            }
            cVar.setLimitAdTracking(z10);
            cVar.setAdvertisingId(Settings.Secure.getString(contentResolver, "advertising_id"));
            return cVar;
        } catch (Settings.SettingNotFoundException e10) {
            q.Companion.e(TAG, "Error getting Amazon advertising info: Setting not found.", e10);
            return cVar;
        } catch (Exception e11) {
            q.Companion.e(TAG, "Error getting Amazon advertising info", e11);
            return cVar;
        }
    }

    private final com.vungle.ads.internal.model.c getGoogleAdvertisingInfo() {
        com.vungle.ads.internal.model.c cVar = new com.vungle.ads.internal.model.c();
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.context);
            s.g(advertisingIdInfo, "getAdvertisingIdInfo(context)");
            cVar.setAdvertisingId(advertisingIdInfo.getId());
            cVar.setLimitAdTracking(advertisingIdInfo.isLimitAdTrackingEnabled());
            return cVar;
        } catch (GooglePlayServicesNotAvailableException e10) {
            q.Companion.e(TAG, "Play services Not available: " + e10.getLocalizedMessage());
            return cVar;
        } catch (Exception e11) {
            q.Companion.e(TAG, "Error getting Google advertising info: " + e11.getLocalizedMessage());
            return cVar;
        } catch (NoClassDefFoundError e12) {
            q.Companion.e(TAG, "Play services Not available: " + e12.getLocalizedMessage());
            cVar.setAdvertisingId(Settings.Secure.getString(this.context.getContentResolver(), "advertising_id"));
            return cVar;
        }
    }

    /* JADX INFO: renamed from: getSDKInstallationTime$lambda-4, reason: not valid java name */
    private static final com.vungle.ads.internal.persistence.b m121getSDKInstallationTime$lambda4(k kVar) {
        return (com.vungle.ads.internal.persistence.b) kVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getUserAgentLazy$lambda-0, reason: not valid java name */
    public static final void m122getUserAgentLazy$lambda0(d this$0, m0.a consumer) {
        s.h(this$0, "this$0");
        s.h(consumer, "$consumer");
        g.INSTANCE.getUserAgent(this$0.context, consumer);
    }

    private final float sanitizeVolume(float f10) {
        if (Float.isNaN(f10) || Float.isInfinite(f10) || f10 < 0.0f) {
            return 0.0f;
        }
        if (f10 > 1.0f) {
            return 1.0f;
        }
        return f10;
    }

    private final void updateAppSetID() {
        String str = this.appSetId;
        if (str == null || str.length() == 0) {
            try {
                AppSetIdClient client = AppSet.getClient(this.context);
                s.g(client, "getClient(context)");
                Task<AppSetIdInfo> appSetIdInfo = client.getAppSetIdInfo();
                s.g(appSetIdInfo, "client.appSetIdInfo");
                appSetIdInfo.addOnSuccessListener(new OnSuccessListener() { // from class: com.vungle.ads.internal.platform.c
                    @Override // com.google.android.gms.tasks.OnSuccessListener
                    public final void onSuccess(Object obj) {
                        d.m123updateAppSetID$lambda8(this.f35845a, (AppSetIdInfo) obj);
                    }
                });
            } catch (Exception e10) {
                q.Companion.e(TAG, "Error getting AppSetID: " + e10.getLocalizedMessage());
            } catch (NoClassDefFoundError e11) {
                q.Companion.e(TAG, "Required libs to get AppSetID Not available: " + e11.getLocalizedMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: updateAppSetID$lambda-8, reason: not valid java name */
    public static final void m123updateAppSetID$lambda8(d this$0, AppSetIdInfo appSetIdInfo) {
        s.h(this$0, "this$0");
        if (appSetIdInfo != null) {
            this$0.appSetId = appSetIdInfo.getId();
            this$0.appSetIdScope = Integer.valueOf(appSetIdInfo.getScope());
        }
    }

    @Override // com.vungle.ads.internal.platform.f
    public com.vungle.ads.internal.model.c getAdvertisingInfo() {
        String advertisingId;
        com.vungle.ads.internal.model.c cVar = this.advertisingInfo;
        if (cVar != null && (advertisingId = cVar.getAdvertisingId()) != null && advertisingId.length() != 0) {
            return cVar;
        }
        com.vungle.ads.internal.model.c amazonAdvertisingInfo = r.A(Build.MANUFACTURER, "Amazon", true) ? getAmazonAdvertisingInfo() : getGoogleAdvertisingInfo();
        this.advertisingInfo = amazonAdvertisingInfo;
        return amazonAdvertisingInfo;
    }

    @Override // com.vungle.ads.internal.platform.f
    public String getAppSetId() {
        return this.appSetId;
    }

    @Override // com.vungle.ads.internal.platform.f
    public Integer getAppSetIdScope() {
        return this.appSetIdScope;
    }

    @Override // com.vungle.ads.internal.platform.f
    public long getBuildTime() {
        return Build.TIME;
    }

    @Override // com.vungle.ads.internal.platform.f
    public String getCarrierName() {
        String carrierName$vungle_ads_release = Companion.getCarrierName$vungle_ads_release(this.context);
        s.g(carrierName$vungle_ads_release, "getCarrierName(context)");
        return carrierName$vungle_ads_release;
    }

    @Override // com.vungle.ads.internal.platform.f
    public String getGPVersion() {
        String str = this.gpVersion;
        if (str != null) {
            return str;
        }
        try {
            String str2 = (Build.VERSION.SDK_INT >= 33 ? this.context.getPackageManager().getPackageInfo("com.android.vending", PackageManager.PackageInfoFlags.of(0L)) : this.context.getPackageManager().getPackageInfo("com.android.vending", 0)).versionName;
            this.gpVersion = str2;
            return str2;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @Override // com.vungle.ads.internal.platform.f
    public long getLastBootTime() {
        return System.currentTimeMillis() - SystemClock.elapsedRealtime();
    }

    @Override // com.vungle.ads.internal.platform.f
    public long getOSInstallationTime() {
        Object objB;
        try {
            fl.r.a aVar = fl.r.f38769b;
            objB = fl.r.b(Long.valueOf((Build.VERSION.SDK_INT >= 33 ? this.context.getPackageManager().getPackageInfo("android", PackageManager.PackageInfoFlags.of(0L)) : this.context.getPackageManager().getPackageInfo("android", 0)).firstInstallTime));
        } catch (Throwable th2) {
            fl.r.a aVar2 = fl.r.f38769b;
            objB = fl.r.b(fl.s.a(th2));
        }
        Throwable thE = fl.r.e(objB);
        if (thE != null) {
            if (thE instanceof PackageManager.NameNotFoundException) {
                q.Companion.e(TAG, "Error getting OS installation time: " + ((PackageManager.NameNotFoundException) thE).getLocalizedMessage());
            }
            objB = -1L;
        }
        return ((Number) objB).longValue();
    }

    @Override // com.vungle.ads.internal.platform.f
    public long getSDKInstallationTime() {
        ServiceLocator.Companion companion = ServiceLocator.Companion;
        k kVarA = l.a(o.SYNCHRONIZED, new b(this.context));
        Long l10 = this.sdkInstallationTime;
        if (l10 != null) {
            return l10.longValue();
        }
        long jCurrentTimeMillis = m121getSDKInstallationTime$lambda4(kVarA).getLong(PREF_KEY_SDK_INSTALL_TIME, 0L);
        if (jCurrentTimeMillis == 0) {
            jCurrentTimeMillis = System.currentTimeMillis();
            m121getSDKInstallationTime$lambda4(kVarA).put(PREF_KEY_SDK_INSTALL_TIME, jCurrentTimeMillis).apply();
        }
        this.sdkInstallationTime = Long.valueOf(jCurrentTimeMillis);
        return jCurrentTimeMillis;
    }

    @Override // com.vungle.ads.internal.platform.f
    public String getUserAgent() {
        String str = this.userAgent;
        return str == null ? System.getProperty("http.agent") : str;
    }

    @Override // com.vungle.ads.internal.platform.f
    public void getUserAgentLazy(final m0.a consumer) {
        s.h(consumer, "consumer");
        this.uaExecutor.execute(new Runnable() { // from class: com.vungle.ads.internal.platform.b
            @Override // java.lang.Runnable
            public final void run() {
                d.m122getUserAgentLazy$lambda0(this.f35843a, consumer);
            }
        });
    }

    @Override // com.vungle.ads.internal.platform.f
    public float getVolumeLevel() {
        try {
            return sanitizeVolume(this.audioManager.getStreamVolume(3) / this.audioManager.getStreamMaxVolume(3));
        } catch (Exception unused) {
            return 0.0f;
        }
    }

    @Override // com.vungle.ads.internal.platform.f
    public boolean isBatterySaverEnabled() {
        return this.powerManager.isPowerSaveMode();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0038  */
    /* JADX WARN: Code duplicated, block: B:6:0x0011  */
    @Override // com.vungle.ads.internal.platform.f
    public boolean isProblematicMaliDevice() {
        String lowerCase;
        boolean z10;
        String str = Build.HARDWARE;
        if (str != null) {
            lowerCase = str.toLowerCase(Locale.ROOT);
            s.g(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            if (lowerCase == null) {
                lowerCase = "";
            }
        } else {
            lowerCase = "";
        }
        if (r.T(lowerCase, "exynos", false, 2, null)) {
            if (Build.VERSION.SDK_INT >= 31) {
                String SOC_MANUFACTURER = Build.SOC_MANUFACTURER;
                s.g(SOC_MANUFACTURER, "SOC_MANUFACTURER");
                if (!r.R(SOC_MANUFACTURER, "samsung", true)) {
                    z10 = false;
                }
            }
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z11 = r.T(lowerCase, "mali", false, 2, null) || z10;
        int i10 = Build.VERSION.SDK_INT;
        return z11 && (29 <= i10 && i10 < 34);
    }

    @Override // com.vungle.ads.internal.platform.f
    public boolean isSdCardPresent() {
        try {
            return s.c(Environment.getExternalStorageState(), "mounted");
        } catch (Exception e10) {
            q.Companion.e(TAG, "Acquiring external storage state failed", e10);
            return false;
        }
    }

    @Override // com.vungle.ads.internal.platform.f
    public boolean isSideLoaded() {
        return this.isSideLoaded;
    }

    @Override // com.vungle.ads.internal.platform.f
    public boolean isSilentModeEnabled() {
        try {
            return this.audioManager.getRingerMode() == 0 || this.audioManager.getRingerMode() == 1;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.vungle.ads.internal.platform.f
    public boolean isSoundEnabled() {
        try {
            return this.audioManager.getStreamVolume(3) > 0;
        } catch (Exception unused) {
            return true;
        }
    }

    public void setUserAgent(String str) {
        this.userAgent = str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ d(Context context, i iVar, PowerManager powerManager, AudioManager audioManager, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i10 & 4) != 0) {
            Object systemService = context.getSystemService("power");
            s.f(systemService, "null cannot be cast to non-null type android.os.PowerManager");
            powerManager = (PowerManager) systemService;
        }
        if ((i10 & 8) != 0) {
            Object systemService2 = context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
            s.f(systemService2, "null cannot be cast to non-null type android.media.AudioManager");
            audioManager = (AudioManager) systemService2;
        }
        this(context, iVar, powerManager, audioManager);
    }
}
