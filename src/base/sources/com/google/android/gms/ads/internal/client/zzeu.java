package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.ads.mediation.admob.Mvp.IAoPeRfJn;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdInspectorError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.OnAdInspectorClosedListener;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.initialization.AdapterStatus;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.preload.PreloadCallback;
import com.google.android.gms.ads.preload.PreloadConfiguration;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbiq;
import com.google.android.gms.internal.ads.zzbko;
import com.google.android.gms.internal.ads.zzbrp;
import com.google.android.gms.internal.ads.zzbrx;
import com.google.android.gms.internal.ads.zzbry;
import com.google.android.gms.internal.ads.zzbuy;
import com.google.android.gms.internal.ads.zzgua;
import com.mbridge.msdk.dycreator.baseview.qEqO.QGbBllacZSmHKn;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class zzeu {
    public static final Set zza = new HashSet(Arrays.asList(AdFormat.APP_OPEN_AD, AdFormat.INTERSTITIAL, AdFormat.REWARDED));
    private static zzeu zze;
    private zzem zzb;
    private zzey zzc;
    private zzel zzd;
    private zzcy zzl;
    private final Object zzf = new Object();
    private final Object zzg = new Object();
    private boolean zzi = false;
    private boolean zzj = false;
    private final Object zzk = new Object();
    private OnAdInspectorClosedListener zzm = null;
    private RequestConfiguration zzn = new RequestConfiguration.Builder().build();
    private final ArrayList zzh = new ArrayList();

    private zzeu() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static InitializationStatus zzB(List list) {
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzbrp zzbrpVar = (zzbrp) it.next();
            map.put(zzbrpVar.zza, new zzbrx(zzbrpVar.zzb ? AdapterStatus.State.READY : AdapterStatus.State.NOT_READY, zzbrpVar.zzd, zzbrpVar.zzc));
        }
        return new zzbry(map);
    }

    private final void zzC(RequestConfiguration requestConfiguration) {
        zzcy zzcyVar = this.zzl;
        if (zzcyVar == null) {
            return;
        }
        try {
            zzcyVar.zzr(new zzfr(requestConfiguration));
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to set request configuration parcel.", e10);
        }
    }

    private final void zzD(Context context) {
        if (this.zzl == null) {
            this.zzl = (zzcy) new zzat(zzay.zzb(), context).zzd(context, false);
        }
    }

    private final void zzE(String str) {
        zzcy zzcyVar = this.zzl;
        if (zzcyVar == null) {
            return;
        }
        try {
            zzcyVar.zze();
            this.zzl.zzj(null, ObjectWrapper.wrap(null));
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("MobileAdsSettingManager initialization failed", e10);
        }
    }

    public static zzeu zzb() {
        zzeu zzeuVar;
        synchronized (zzeu.class) {
            try {
                if (zze == null) {
                    zze = new zzeu();
                }
                zzeuVar = zze;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzeuVar;
    }

    final /* synthetic */ OnAdInspectorClosedListener zzA() {
        return this.zzm;
    }

    public final com.google.android.gms.ads.preload.zzb zza(AdFormat adFormat) {
        AdFormat adFormat2 = AdFormat.BANNER;
        int iOrdinal = adFormat.ordinal();
        if (iOrdinal == 1) {
            return this.zzb;
        }
        if (iOrdinal == 2) {
            return this.zzc;
        }
        if (iOrdinal != 5) {
            return null;
        }
        return this.zzd;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00a2 A[Catch: all -> 0x004e, TryCatch #1 {all -> 0x004e, blocks: (B:26:0x0034, B:28:0x003b, B:33:0x0053, B:35:0x005c, B:40:0x006f, B:42:0x0080, B:44:0x0092, B:51:0x00d5, B:52:0x00ea, B:45:0x00a2, B:47:0x00b0, B:49:0x00c2, B:50:0x00cd, B:37:0x0064, B:39:0x006a), top: B:60:0x0034, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00b0 A[Catch: all -> 0x004e, TryCatch #1 {all -> 0x004e, blocks: (B:26:0x0034, B:28:0x003b, B:33:0x0053, B:35:0x005c, B:40:0x006f, B:42:0x0080, B:44:0x0092, B:51:0x00d5, B:52:0x00ea, B:45:0x00a2, B:47:0x00b0, B:49:0x00c2, B:50:0x00cd, B:37:0x0064, B:39:0x006a), top: B:60:0x0034, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00c2 A[Catch: all -> 0x004e, TryCatch #1 {all -> 0x004e, blocks: (B:26:0x0034, B:28:0x003b, B:33:0x0053, B:35:0x005c, B:40:0x006f, B:42:0x0080, B:44:0x0092, B:51:0x00d5, B:52:0x00ea, B:45:0x00a2, B:47:0x00b0, B:49:0x00c2, B:50:0x00cd, B:37:0x0064, B:39:0x006a), top: B:60:0x0034, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00cd A[Catch: all -> 0x004e, TryCatch #1 {all -> 0x004e, blocks: (B:26:0x0034, B:28:0x003b, B:33:0x0053, B:35:0x005c, B:40:0x006f, B:42:0x0080, B:44:0x0092, B:51:0x00d5, B:52:0x00ea, B:45:0x00a2, B:47:0x00b0, B:49:0x00c2, B:50:0x00cd, B:37:0x0064, B:39:0x006a), top: B:60:0x0034, inners: #0 }] */
    /* JADX WARN: Multi-variable type inference failed */
    public final void zzc(Context context, String str, OnInitializationCompleteListener onInitializationCompleteListener) {
        synchronized (this.zzf) {
            try {
                if (this.zzi) {
                    if (onInitializationCompleteListener != null) {
                        this.zzh.add(onInitializationCompleteListener);
                    }
                    return;
                }
                if (this.zzj) {
                    if (onInitializationCompleteListener != null) {
                        onInitializationCompleteListener.onInitializationComplete(zzl());
                    }
                    return;
                }
                this.zzi = true;
                if (onInitializationCompleteListener != null) {
                    this.zzh.add(onInitializationCompleteListener);
                }
                if (context == null) {
                    throw new IllegalArgumentException("Context cannot be null.");
                }
                synchronized (this.zzk) {
                    byte[] bArr = null;
                    Object[] objArr = 0;
                    Object[] objArr2 = 0;
                    try {
                        try {
                            zzD(context);
                            zzcy zzcyVar = this.zzl;
                            if (zzcyVar != null) {
                                zzcyVar.zzp(new zzet(this, bArr));
                                this.zzl.zzo(new zzbuy());
                            }
                            if (this.zzn.getTagForChildDirectedTreatment() != -1 || this.zzn.getTagForUnderAgeOfConsent() != -1) {
                                zzC(this.zzn);
                            }
                        } catch (RemoteException e10) {
                            com.google.android.gms.ads.internal.util.client.zzo.zzj("MobileAdsSettingManager initialization failed", e10);
                        }
                        zzbiq.zza(context);
                        if (((Boolean) zzbko.zza.zze()).booleanValue()) {
                            if (((Boolean) zzba.zzc().zzd(zzbiq.zzmC)).booleanValue()) {
                                com.google.android.gms.ads.internal.util.client.zzo.zzd("Initializing on bg thread");
                                ThreadPoolExecutor threadPoolExecutor = com.google.android.gms.ads.internal.util.client.zzb.zza;
                                final Object[] objArr3 = objArr2 == true ? 1 : 0;
                                threadPoolExecutor.execute(new Runnable(objArr3) { // from class: com.google.android.gms.ads.internal.client.zzer
                                    @Override // java.lang.Runnable
                                    public final /* synthetic */ void run() {
                                        this.zza.zzt(null);
                                    }
                                });
                            } else if (((Boolean) zzbko.zzb.zze()).booleanValue()) {
                                if (((Boolean) zzba.zzc().zzd(zzbiq.zzmC)).booleanValue()) {
                                    ExecutorService executorService = com.google.android.gms.ads.internal.util.client.zzb.zzb;
                                    final Object[] objArr4 = objArr == true ? 1 : 0;
                                    executorService.execute(new Runnable(objArr4) { // from class: com.google.android.gms.ads.internal.client.zzep
                                        @Override // java.lang.Runnable
                                        public final /* synthetic */ void run() {
                                            this.zza.zzu(null);
                                        }
                                    });
                                } else {
                                    com.google.android.gms.ads.internal.util.client.zzo.zzd("Initializing on calling thread");
                                    zzE(null);
                                }
                            } else {
                                com.google.android.gms.ads.internal.util.client.zzo.zzd("Initializing on calling thread");
                                zzE(null);
                            }
                        } else if (((Boolean) zzbko.zzb.zze()).booleanValue()) {
                            if (((Boolean) zzba.zzc().zzd(zzbiq.zzmC)).booleanValue()) {
                                ExecutorService executorService2 = com.google.android.gms.ads.internal.util.client.zzb.zzb;
                                final String objArr5 = objArr == true ? 1 : 0;
                                executorService2.execute(new Runnable(objArr5) { // from class: com.google.android.gms.ads.internal.client.zzep
                                    @Override // java.lang.Runnable
                                    public final /* synthetic */ void run() {
                                        this.zza.zzu(null);
                                    }
                                });
                            } else {
                                com.google.android.gms.ads.internal.util.client.zzo.zzd("Initializing on calling thread");
                                zzE(null);
                            }
                        } else {
                            com.google.android.gms.ads.internal.util.client.zzo.zzd("Initializing on calling thread");
                            zzE(null);
                        }
                        this.zzb = new zzem(context);
                        this.zzc = new zzey(context);
                        this.zzd = new zzel(context);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void zzd() {
        synchronized (this.zzf) {
            this.zzj = false;
            this.zzi = false;
            this.zzh.clear();
        }
        synchronized (this.zzk) {
            try {
                zzcy zzcyVar = this.zzl;
                if (zzcyVar != null) {
                    zzcyVar.zzw();
                }
            } catch (RemoteException e10) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to stop the SDK.", e10);
            }
            this.zzl = null;
            zzem zzemVar = this.zzb;
            if (zzemVar != null) {
                zzemVar.zzg();
                this.zzb = null;
            }
            zzey zzeyVar = this.zzc;
            if (zzeyVar != null) {
                zzeyVar.zzg();
                this.zzc = null;
            }
            zzel zzelVar = this.zzd;
            if (zzelVar != null) {
                zzelVar.zzg();
                this.zzd = null;
            }
        }
    }

    public final Status zze(Context context, List list, PreloadCallback preloadCallback) {
        Status status;
        boolean z10 = false;
        zzbiq.zza(context);
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            PreloadConfiguration preloadConfiguration = (PreloadConfiguration) it.next();
            String strValueOf = String.valueOf(preloadConfiguration.getAdFormat());
            String adUnitId = preloadConfiguration.getAdUnitId();
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 1 + String.valueOf(adUnitId).length());
            sb2.append(strValueOf);
            sb2.append("#");
            sb2.append(adUnitId);
            String string = sb2.toString();
            map.put(string, Integer.valueOf(((Integer) com.google.android.gms.ads.internal.util.client.zzf.zzd(map, string, 0)).intValue() + 1));
        }
        Iterator it2 = map.entrySet().iterator();
        while (it2.hasNext()) {
            if (((Integer) ((Map.Entry) it2.next()).getValue()).intValue() > 1) {
                hashSet.add("Preload configurations include duplicated ad unit IDs and ad format combinations");
                z10 = true;
                break;
            }
        }
        HashMap map2 = new HashMap();
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            PreloadConfiguration preloadConfiguration2 = (PreloadConfiguration) it3.next();
            AdFormat adFormat = preloadConfiguration2.getAdFormat();
            if (zza.contains(preloadConfiguration2.getAdFormat())) {
                map2.put(adFormat, Integer.valueOf(((Integer) com.google.android.gms.ads.internal.util.client.zzf.zzd(map2, adFormat, 0)).intValue() + 1));
                if (preloadConfiguration2.getBufferSize() > 15) {
                    hashSet.add(String.format(Locale.US, "Preload configurations' buffer size exceeds the maximum limit %d for %s", 15, adFormat.name()));
                } else if (preloadConfiguration2.getBufferSize() < 0) {
                    hashSet.add(String.format(Locale.US, "Preload configurations' buffer size less than 0 for %s", adFormat.name()));
                }
            } else {
                hashSet.add("PreloadConfiguration ad format is not supported:".concat(String.valueOf(preloadConfiguration2.getAdFormat())));
            }
            z10 = true;
        }
        EnumMap enumMap = new EnumMap(AdFormat.class);
        enumMap.put(AdFormat.APP_OPEN_AD, (Integer) zzba.zzc().zzd(zzbiq.zzfv));
        enumMap.put(AdFormat.INTERSTITIAL, (Integer) zzba.zzc().zzd(zzbiq.zzft));
        enumMap.put(AdFormat.REWARDED, (Integer) zzba.zzc().zzd(zzbiq.zzfu));
        for (Map.Entry entry : map2.entrySet()) {
            AdFormat adFormat2 = (AdFormat) entry.getKey();
            int iIntValue = ((Integer) entry.getValue()).intValue();
            Integer num = (Integer) com.google.android.gms.ads.internal.util.client.zzf.zzd(enumMap, adFormat2, 0);
            if (iIntValue > num.intValue()) {
                hashSet.add(String.format(Locale.US, "Preload configurations' size exceeds the maximum limit %d for %s", num, adFormat2.name()));
                z10 = true;
            }
        }
        if (z10) {
            StringBuilder sb3 = new StringBuilder();
            Iterator it4 = hashSet.iterator();
            while (it4.hasNext()) {
                sb3.append((String) it4.next());
                if (it4.hasNext()) {
                    sb3.append(", ");
                }
            }
            String string2 = sb3.toString();
            com.google.android.gms.ads.internal.util.client.zzo.zzf(string2);
            status = new Status(13, string2);
        } else {
            status = Status.RESULT_SUCCESS;
        }
        String statusMessage = status.getStatusMessage();
        if (statusMessage == null) {
            statusMessage = "";
        }
        Preconditions.checkArgument(status.isSuccess(), statusMessage);
        synchronized (this.zzg) {
            ArrayList arrayList = new ArrayList();
            Iterator it5 = list.iterator();
            while (it5.hasNext()) {
                arrayList.add(com.google.android.gms.ads.internal.util.client.zzf.zzv(context, (PreloadConfiguration) it5.next(), 1));
            }
            try {
                com.google.android.gms.ads.zzb.zza(context).zze(arrayList, new zzen(this, preloadCallback));
            } catch (RemoteException e10) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to start preload.", e10);
                return Status.RESULT_INTERNAL_ERROR;
            }
        }
        return Status.RESULT_SUCCESS;
    }

    public final void zzf(float f10) {
        boolean z10 = true;
        Preconditions.checkArgument(f10 >= 0.0f && f10 <= 1.0f, "The app volume must be a value between 0 and 1 inclusive.");
        synchronized (this.zzk) {
            if (this.zzl == null) {
                z10 = false;
            }
            Preconditions.checkState(z10, "MobileAds.initialize() must be called prior to setting the app volume.");
            zzcy zzcyVar = this.zzl;
            if (zzcyVar == null) {
                return;
            }
            try {
                zzcyVar.zzf(f10);
            } catch (RemoteException e10) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to set app volume.", e10);
            }
        }
    }

    public final float zzg() {
        synchronized (this.zzk) {
            zzcy zzcyVar = this.zzl;
            float fZzk = 1.0f;
            if (zzcyVar == null) {
                return 1.0f;
            }
            try {
                fZzk = zzcyVar.zzk();
            } catch (RemoteException e10) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to get app volume.", e10);
            }
            return fZzk;
        }
    }

    public final void zzh(boolean z10) {
        synchronized (this.zzk) {
            Preconditions.checkState(this.zzl != null, "MobileAds.initialize() must be called prior to setting app muted state.");
            zzcy zzcyVar = this.zzl;
            if (zzcyVar == null) {
                return;
            }
            try {
                zzcyVar.zzh(z10);
            } catch (RemoteException e10) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to set app mute state.", e10);
            }
        }
    }

    public final boolean zzi() {
        synchronized (this.zzk) {
            zzcy zzcyVar = this.zzl;
            boolean zZzl = false;
            if (zzcyVar == null) {
                return false;
            }
            try {
                zZzl = zzcyVar.zzl();
            } catch (RemoteException e10) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to get app mute state.", e10);
            }
            return zZzl;
        }
    }

    public final void zzk(Class cls) {
        synchronized (this.zzk) {
            zzcy zzcyVar = this.zzl;
            if (zzcyVar == null) {
                return;
            }
            try {
                zzcyVar.zzn(cls.getCanonicalName());
            } catch (RemoteException e10) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to register RtbAdapter", e10);
            }
        }
    }

    public final InitializationStatus zzl() {
        synchronized (this.zzk) {
            Preconditions.checkState(this.zzl != null, "MobileAds.initialize() must be called prior to getting initialization status.");
            zzcy zzcyVar = this.zzl;
            if (zzcyVar == null) {
                return new InitializationStatus() { // from class: com.google.android.gms.ads.internal.client.zzeq
                    @Override // com.google.android.gms.ads.initialization.InitializationStatus
                    public final /* synthetic */ Map getAdapterStatusMap() {
                        HashMap map = new HashMap();
                        map.put("com.google.android.gms.ads.MobileAds", new zzeo(this.zza));
                        return map;
                    }
                };
            }
            try {
                return zzB(zzcyVar.zzq());
            } catch (RemoteException unused) {
                com.google.android.gms.ads.internal.util.client.zzo.zzf("Unable to get Initialization status.");
                return new InitializationStatus() { // from class: com.google.android.gms.ads.internal.client.zzeq
                    @Override // com.google.android.gms.ads.initialization.InitializationStatus
                    public final /* synthetic */ Map getAdapterStatusMap() {
                        HashMap map = new HashMap();
                        map.put("com.google.android.gms.ads.MobileAds", new zzeo(this.zza));
                        return map;
                    }
                };
            }
        }
    }

    public final void zzm(Context context) {
        synchronized (this.zzk) {
            zzD(context);
            zzcy zzcyVar = this.zzl;
            if (zzcyVar == null) {
                return;
            }
            try {
                zzcyVar.zzs();
            } catch (RemoteException unused) {
                com.google.android.gms.ads.internal.util.client.zzo.zzf("Unable to disable mediation adapter initialization.");
            }
        }
    }

    public final void zzn(Context context, OnAdInspectorClosedListener onAdInspectorClosedListener) {
        synchronized (this.zzk) {
            try {
                zzD(context);
                zzcy zzcyVar = this.zzl;
                if (zzcyVar == null) {
                    return;
                }
                this.zzm = onAdInspectorClosedListener;
                try {
                    zzcyVar.zzt(new zzes(null));
                } catch (RemoteException unused) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzf("Unable to open the ad inspector.");
                    if (onAdInspectorClosedListener != null) {
                        onAdInspectorClosedListener.onAdInspectorClosed(new AdInspectorError(0, "Ad inspector had an internal error.", MobileAds.ERROR_DOMAIN));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final RequestConfiguration zzp() {
        return this.zzn;
    }

    public final void zzq(RequestConfiguration requestConfiguration) {
        Preconditions.checkArgument(requestConfiguration != null, "Null passed to setRequestConfiguration.");
        synchronized (this.zzk) {
            try {
                RequestConfiguration requestConfiguration2 = this.zzn;
                this.zzn = requestConfiguration;
                if (this.zzl == null) {
                    return;
                }
                if (requestConfiguration2.getTagForChildDirectedTreatment() != requestConfiguration.getTagForChildDirectedTreatment() || requestConfiguration2.getTagForUnderAgeOfConsent() != requestConfiguration.getTagForUnderAgeOfConsent()) {
                    zzC(requestConfiguration);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean zzr(boolean z10) {
        synchronized (this.zzk) {
            Preconditions.checkState(this.zzl != null, "MobileAds.initialize() must be called prior to enable/disable the publisher first-party ID.");
            zzcy zzcyVar = this.zzl;
            if (zzcyVar == null) {
                return false;
            }
            try {
                zzcyVar.zzu(z10);
                return true;
            } catch (RemoteException e10) {
                String str = z10 ? "enable" : "disable";
                StringBuilder sb2 = new StringBuilder(str.length() + 40);
                sb2.append("Unable to ");
                sb2.append(str);
                sb2.append(" the publisher first-party ID.");
                com.google.android.gms.ads.internal.util.client.zzo.zzg(sb2.toString(), e10);
                return false;
            }
        }
    }

    public final void zzs(String str) {
        synchronized (this.zzk) {
            Preconditions.checkState(this.zzl != null, "MobileAds.initialize() must be called prior to setting the plugin.");
            zzcy zzcyVar = this.zzl;
            if (zzcyVar == null) {
                return;
            }
            try {
                zzcyVar.zzv(str);
            } catch (RemoteException e10) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to set plugin.", e10);
            }
        }
    }

    final /* synthetic */ void zzt(String str) {
        synchronized (this.zzk) {
            zzE(null);
        }
    }

    final /* synthetic */ void zzu(String str) {
        synchronized (this.zzk) {
            zzE(null);
        }
    }

    final /* synthetic */ Object zzw() {
        return this.zzf;
    }

    final /* synthetic */ ArrayList zzx() {
        return this.zzh;
    }

    final /* synthetic */ void zzy(boolean z10) {
        this.zzi = false;
    }

    final /* synthetic */ void zzz(boolean z10) {
        this.zzj = true;
    }

    public final void zzj(Context context, String str) {
        synchronized (this.zzk) {
            Preconditions.checkState(this.zzl != null, "MobileAds.initialize() must be called prior to opening debug menu.");
            zzcy zzcyVar = this.zzl;
            if (zzcyVar == null) {
                return;
            }
            try {
                zzcyVar.zzi(ObjectWrapper.wrap(context), str);
            } catch (RemoteException e10) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg(QGbBllacZSmHKn.cYuZds, e10);
            }
        }
    }

    public final String zzo() {
        synchronized (this.zzk) {
            Preconditions.checkState(this.zzl != null, IAoPeRfJn.FwMFyKCBpmLCYuU);
            zzcy zzcyVar = this.zzl;
            if (zzcyVar == null) {
                return "";
            }
            try {
                return zzgua.zza(zzcyVar.zzm());
            } catch (RemoteException e10) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to get internal version.", e10);
                return "";
            }
        }
    }
}
