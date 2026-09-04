package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.collection.a;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.CollectionUtils;
import com.google.android.gms.common.util.Strings;
import com.google.android.gms.internal.measurement.zzabw;
import com.google.android.gms.internal.measurement.zzabx;
import com.google.android.gms.internal.measurement.zzaif;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.api.client.auth.openidconnect.SMoW.mDXVAtwcaFMHJ;
import com.google.common.collect.e0;
import com.google.common.collect.g0;
import com.google.common.collect.p1;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.x;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import com.mbridge.msdk.playercommon.PHx.jyeoXJ;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import re.xQrM.UoyZyZEcGYBpIg;
import tn.xQIL.Saucuwx;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzlj extends zzg {
    protected zzky zza;
    final zzx zzb;
    protected boolean zzc;
    private zzjp zzd;
    private final Set zze;
    private boolean zzf;
    private final AtomicReference zzg;
    private final Object zzh;
    private boolean zzi;
    private int zzj;
    private zzaz zzk;
    private zzaz zzl;
    private PriorityQueue zzm;
    private zzjl zzn;
    private final AtomicLong zzo;
    private long zzp;
    private zzaz zzq;
    private SharedPreferences.OnSharedPreferenceChangeListener zzr;
    private zzaz zzs;
    private final zzpo zzt;

    protected zzlj(zzic zzicVar) {
        super(zzicVar);
        this.zze = new CopyOnWriteArraySet();
        this.zzh = new Object();
        this.zzi = false;
        this.zzj = 1;
        this.zzc = true;
        this.zzt = new zzkn(this);
        this.zzg = new AtomicReference();
        this.zzn = zzjl.zza;
        this.zzp = -1L;
        this.zzo = new AtomicLong(0L);
        this.zzb = new zzx(zzicVar);
    }

    private final zzlr zzap(final zzom zzomVar) {
        try {
            URL url = new URI(zzomVar.zzc).toURL();
            final AtomicReference atomicReference = new AtomicReference();
            String strZzl = this.zzu.zzv().zzl();
            zzic zzicVar = this.zzu;
            zzgs zzgsVarZzk = zzicVar.zzaW().zzk();
            Long lValueOf = Long.valueOf(zzomVar.zza);
            zzgsVarZzk.zzd("[sgtm] Uploading data from app. row_id, url, uncompressed size", lValueOf, zzomVar.zzc, Integer.valueOf(zzomVar.zzb.length));
            if (!TextUtils.isEmpty(zzomVar.zzg)) {
                zzicVar.zzaW().zzk().zzc("[sgtm] Uploading data from app. row_id", lValueOf, zzomVar.zzg);
            }
            HashMap map = new HashMap();
            Bundle bundle = zzomVar.zzd;
            for (String str : bundle.keySet()) {
                String string = bundle.getString(str);
                if (!TextUtils.isEmpty(string)) {
                    map.put(str, string);
                }
            }
            zzlo zzloVarZzn = zzicVar.zzn();
            byte[] bArr = zzomVar.zzb;
            zzll zzllVar = new zzll() { // from class: com.google.android.gms.measurement.internal.zzkz
                /* JADX WARN: Code duplicated, block: B:10:0x0016  */
                /* JADX WARN: Code duplicated, block: B:11:0x002e A[PHI: r8
                  0x002e: PHI (r8v7 int) = (r8v1 int), (r8v0 int) binds: [B:9:0x0014, B:7:0x0011] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Code duplicated, block: B:13:0x0064  */
                /* JADX WARN: Code duplicated, block: B:14:0x0067  */
                @Override // com.google.android.gms.measurement.internal.zzll
                public final /* synthetic */ void zza(String str2, int i10, Throwable th2, byte[] bArr2, Map map2) {
                    zzlr zzlrVar;
                    zzlj zzljVar = this.zza;
                    zzljVar.zzg();
                    zzom zzomVar2 = zzomVar;
                    if (i10 == 200 || i10 == 204) {
                        if (th2 == null) {
                            zzljVar.zzu.zzaW().zzk().zzb("[sgtm] Upload succeeded for row_id", Long.valueOf(zzomVar2.zza));
                            zzlrVar = zzlr.SUCCESS;
                        } else {
                            zzljVar.zzu.zzaW().zze().zzd("[sgtm] Upload failed for row_id. response, exception", Long.valueOf(zzomVar2.zza), Integer.valueOf(i10), th2);
                            if (Arrays.asList(((String) zzfy.zzt.zzb(null)).split(",")).contains(String.valueOf(i10))) {
                                zzlrVar = zzlr.BACKOFF;
                            } else {
                                zzlrVar = zzlr.FAILURE;
                            }
                        }
                    } else if (i10 == 304) {
                        i10 = 304;
                        if (th2 == null) {
                            zzljVar.zzu.zzaW().zzk().zzb("[sgtm] Upload succeeded for row_id", Long.valueOf(zzomVar2.zza));
                            zzlrVar = zzlr.SUCCESS;
                        } else {
                            zzljVar.zzu.zzaW().zze().zzd("[sgtm] Upload failed for row_id. response, exception", Long.valueOf(zzomVar2.zza), Integer.valueOf(i10), th2);
                            if (Arrays.asList(((String) zzfy.zzt.zzb(null)).split(",")).contains(String.valueOf(i10))) {
                                zzlrVar = zzlr.BACKOFF;
                            } else {
                                zzlrVar = zzlr.FAILURE;
                            }
                        }
                    } else {
                        zzljVar.zzu.zzaW().zze().zzd("[sgtm] Upload failed for row_id. response, exception", Long.valueOf(zzomVar2.zza), Integer.valueOf(i10), th2);
                        if (Arrays.asList(((String) zzfy.zzt.zzb(null)).split(",")).contains(String.valueOf(i10))) {
                            zzlrVar = zzlr.BACKOFF;
                        } else {
                            zzlrVar = zzlr.FAILURE;
                        }
                    }
                    AtomicReference atomicReference2 = atomicReference;
                    zznl zznlVarZzt = zzljVar.zzu.zzt();
                    long j10 = zzomVar2.zza;
                    zznlVarZzt.zzy(new zzaf(j10, zzlrVar.zza(), zzomVar2.zzf));
                    zzljVar.zzu.zzaW().zzk().zzc("[sgtm] Updated status for row_id", Long.valueOf(j10), zzlrVar);
                    synchronized (atomicReference2) {
                        atomicReference2.set(zzlrVar);
                        atomicReference2.notifyAll();
                    }
                }
            };
            zzloVarZzn.zzw();
            Preconditions.checkNotNull(url);
            Preconditions.checkNotNull(bArr);
            Preconditions.checkNotNull(zzllVar);
            zzloVarZzn.zzu.zzaX().zzm(new zzln(zzloVarZzn, strZzl, url, bArr, map, zzllVar));
            try {
                zzic zzicVar2 = zzicVar.zzk().zzu;
                long jCurrentTimeMillis = zzicVar2.zzba().currentTimeMillis();
                long j10 = jCurrentTimeMillis + ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS;
                synchronized (atomicReference) {
                    for (long jCurrentTimeMillis2 = ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS; atomicReference.get() == null && jCurrentTimeMillis2 > 0; jCurrentTimeMillis2 = j10 - zzicVar2.zzba().currentTimeMillis()) {
                        try {
                            atomicReference.wait(jCurrentTimeMillis2);
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            } catch (InterruptedException unused) {
                this.zzu.zzaW().zze().zza("[sgtm] Interrupted waiting for uploading batch");
            }
            return atomicReference.get() == null ? zzlr.UNKNOWN : (zzlr) atomicReference.get();
        } catch (MalformedURLException | URISyntaxException e10) {
            this.zzu.zzaW().zzb().zzd("[sgtm] Bad upload url for row_id", zzomVar.zzc, Long.valueOf(zzomVar.zza), e10);
            return zzlr.FAILURE;
        }
    }

    private final void zzaq(Boolean bool, boolean z10) {
        zzg();
        zzb();
        zzic zzicVar = this.zzu;
        zzicVar.zzaW().zzj().zzb("Setting app measurement enabled (FE)", bool);
        zzicVar.zzd().zzh(bool);
        if (z10) {
            zzhh zzhhVarZzd = zzicVar.zzd();
            zzic zzicVar2 = zzhhVarZzd.zzu;
            zzhhVarZzd.zzg();
            SharedPreferences.Editor editorEdit = zzhhVarZzd.zzd().edit();
            if (bool != null) {
                editorEdit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                editorEdit.remove("measurement_enabled_from_api");
            }
            editorEdit.apply();
        }
        if (this.zzu.zzE() || !(bool == null || bool.booleanValue())) {
            zzak();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzar, reason: merged with bridge method [inline-methods] */
    public final void zzak() {
        zzlj zzljVar;
        zzg();
        zzic zzicVar = this.zzu;
        String strZza = zzicVar.zzd().zzh.zza();
        if (strZza == null) {
            zzljVar = this;
        } else if ("unset".equals(strZza)) {
            zzljVar = this;
            zzljVar.zzM(MBridgeConstans.DYNAMIC_VIEW_WX_APP, "_npa", null, zzicVar.zzba().currentTimeMillis());
        } else {
            zzM(MBridgeConstans.DYNAMIC_VIEW_WX_APP, "_npa", Long.valueOf(true != "true".equals(strZza) ? 0L : 1L), zzicVar.zzba().currentTimeMillis());
            zzljVar = this;
        }
        if (!zzljVar.zzu.zzB() || !zzljVar.zzc) {
            zzicVar.zzaW().zzj().zza("Updating Scion state (FE)");
            zzljVar.zzu.zzt().zzi();
        } else {
            zzicVar.zzaW().zzj().zza("Recording app launch after enabling measurement for the first time (FE)");
            zzT();
            zzljVar.zzu.zzh().zza.zza();
            zzicVar.zzaX().zzj(new zzjz(this));
        }
    }

    public final void zzA(String str, String str2, Bundle bundle) {
        zzic zzicVar = this.zzu;
        zzB(str, str2, bundle, true, true, zzicVar.zzba().currentTimeMillis(), zzicVar.zzc().zzp(null, zzfy.zzbe) ? zzicVar.zzba().elapsedRealtime() : 0L);
    }

    public final void zzB(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10, long j11) {
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        if (Objects.equals(str2, "screen_view")) {
            zzic zzicVar = this.zzu;
            zzicVar.zzs().zzj(bundle2, j10, true != zzicVar.zzc().zzp(null, zzfy.zzbe) ? 0L : j11);
            return;
        }
        long j12 = 0;
        boolean z12 = !z11 || this.zzd == null || zzpp.zzac(str2);
        if (str == null) {
            str = MBridgeConstans.DYNAMIC_VIEW_WX_APP;
        }
        String str3 = str;
        if (true == this.zzu.zzc().zzp(null, zzfy.zzbe)) {
            j12 = j11;
        }
        zzI(str3, str2, j10, j12, bundle2, z11, z12, z10, null);
    }

    public final void zzC() {
        zzod zzodVar;
        zzabx zzabxVar;
        zzg();
        zzic zzicVar = this.zzu;
        zzicVar.zzaW().zzj().zza("Handle tcf update.");
        SharedPreferences sharedPreferencesZze = zzicVar.zzd().zze();
        int i10 = zzof.zzb;
        zzabw zzabwVar = zzabw.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE;
        zzoe zzoeVar = zzoe.CONSENT;
        zzabw zzabwVar2 = zzabw.IAB_TCF_PURPOSE_SELECT_BASIC_ADS;
        zzoe zzoeVar2 = zzoe.FLEXIBLE_LEGITIMATE_INTEREST;
        e0 e0VarV = e0.v(zzabwVar, zzoeVar, zzabwVar2, zzoeVar2, zzabw.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE, zzoeVar, zzabw.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS, zzoeVar, zzabw.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE, zzoeVar2, zzabw.IAB_TCF_PURPOSE_APPLY_MARKET_RESEARCH_TO_GENERATE_AUDIENCE_INSIGHTS, zzoeVar2, zzabw.IAB_TCF_PURPOSE_DEVELOP_AND_IMPROVE_PRODUCTS, zzoeVar2);
        g0 g0VarA = g0.A("CH");
        char[] cArr = new char[5];
        boolean zContains = sharedPreferencesZze.contains("IABTCF_TCString");
        int iZzb = zzof.zzb(sharedPreferencesZze, "IABTCF_CmpSdkID");
        int iZzb2 = zzof.zzb(sharedPreferencesZze, "IABTCF_PolicyVersion");
        int iZzb3 = zzof.zzb(sharedPreferencesZze, "IABTCF_gdprApplies");
        int iZzb4 = zzof.zzb(sharedPreferencesZze, "IABTCF_PurposeOneTreatment");
        int iZzb5 = zzof.zzb(sharedPreferencesZze, "IABTCF_EnableAdvertiserConsentMode");
        String strZza = zzof.zza(sharedPreferencesZze, "IABTCF_PublisherCC");
        e0.a aVarG = e0.g();
        p1 it = e0VarV.keySet().iterator();
        while (it.hasNext()) {
            zzabw zzabwVar3 = (zzabw) it.next();
            int iZza = zzabwVar3.zza();
            StringBuilder sb2 = new StringBuilder(String.valueOf(iZza).length() + 28);
            sb2.append("IABTCF_PublisherRestrictions");
            sb2.append(iZza);
            String strZza2 = zzof.zza(sharedPreferencesZze, sb2.toString());
            if (TextUtils.isEmpty(strZza2) || strZza2.length() < 755) {
                zzabxVar = zzabx.PURPOSE_RESTRICTION_UNDEFINED;
            } else {
                int iDigit = Character.digit(strZza2.charAt(754), 10);
                if (iDigit < 0 || iDigit > zzabx.values().length || iDigit == 0) {
                    zzabxVar = zzabx.PURPOSE_RESTRICTION_NOT_ALLOWED;
                } else if (iDigit != 1) {
                    zzabxVar = iDigit != 2 ? zzabx.PURPOSE_RESTRICTION_UNDEFINED : zzabx.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST;
                } else {
                    zzabxVar = zzabx.PURPOSE_RESTRICTION_REQUIRE_CONSENT;
                }
            }
            aVarG.g(zzabwVar3, zzabxVar);
        }
        e0 e0VarD = aVarG.d();
        String strZza3 = zzof.zza(sharedPreferencesZze, "IABTCF_PurposeConsents");
        String strZza4 = zzof.zza(sharedPreferencesZze, "IABTCF_VendorConsents");
        boolean z10 = !TextUtils.isEmpty(strZza4) && strZza4.length() >= 755 && strZza4.charAt(754) == '1';
        String strZza5 = zzof.zza(sharedPreferencesZze, "IABTCF_PurposeLegitimateInterests");
        String strZza6 = zzof.zza(sharedPreferencesZze, "IABTCF_VendorLegitimateInterests");
        boolean z11 = !TextUtils.isEmpty(strZza6) && strZza6.length() >= 755 && strZza6.charAt(754) == '1';
        cArr[0] = '2';
        zzod zzodVar2 = new zzod(zzof.zzd(e0VarV, e0VarD, g0VarA, cArr, iZzb, iZzb5, iZzb3, iZzb2, iZzb4, strZza, strZza3, strZza5, z10, z11, zContains));
        zzicVar.zzaW().zzk().zzb("Tcf preferences read", zzodVar2);
        zzhh zzhhVarZzd = zzicVar.zzd();
        zzhhVarZzd.zzg();
        String string = zzhhVarZzd.zzd().getString("stored_tcf_param", "");
        HashMap map = new HashMap();
        if (TextUtils.isEmpty(string)) {
            zzodVar = new zzod(map);
        } else {
            for (String str : string.split(";")) {
                String[] strArrSplit = str.split("=");
                if (strArrSplit.length >= 2 && zzof.zza.contains(strArrSplit[0])) {
                    map.put(strArrSplit[0], strArrSplit[1]);
                }
            }
            zzodVar = new zzod(map);
        }
        zzhh zzhhVarZzd2 = zzicVar.zzd();
        zzhhVarZzd2.zzg();
        String string2 = zzhhVarZzd2.zzd().getString("stored_tcf_param", "");
        String strZza7 = zzodVar2.zza();
        if (strZza7.equals(string2)) {
            return;
        }
        SharedPreferences.Editor editorEdit = zzhhVarZzd2.zzd().edit();
        editorEdit.putString("stored_tcf_param", strZza7);
        editorEdit.apply();
        Bundle bundleZzb = zzodVar2.zzb();
        zzicVar.zzaW().zzk().zzb("Consent generated from Tcf", bundleZzb);
        if (bundleZzb != Bundle.EMPTY) {
            zzp(bundleZzb, -30, zzicVar.zzba().currentTimeMillis());
        }
        Bundle bundle = new Bundle();
        bundle.putString("_tcfm", zzodVar2.zzd(zzodVar));
        bundle.putString("_tcfd2", zzodVar2.zzc());
        bundle.putString("_tcfd", zzodVar2.zze());
        zzE("auto", "_tcf", bundle);
    }

    public final void zzD() {
        zzg();
        zzic zzicVar = this.zzu;
        zzicVar.zzaW().zzj().zza("Register tcfPrefChangeListener.");
        if (this.zzr == null) {
            this.zzs = new zzkb(this, this.zzu);
            this.zzr = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.measurement.internal.zzle
                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                public final /* synthetic */ void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                    this.zza.zzaf(sharedPreferences, str);
                }
            };
        }
        zzicVar.zzd().zze().registerOnSharedPreferenceChangeListener(this.zzr);
    }

    final void zzE(String str, String str2, Bundle bundle) {
        zzg();
        zzic zzicVar = this.zzu;
        zzF(str, str2, zzicVar.zzba().currentTimeMillis(), zzicVar.zzc().zzp(null, zzfy.zzbe) ? zzicVar.zzba().elapsedRealtime() : 0L, bundle);
    }

    final void zzF(String str, String str2, long j10, long j11, Bundle bundle) {
        zzg();
        boolean z10 = true;
        if (this.zzd != null && !zzpp.zzac(str2)) {
            z10 = false;
        }
        zzG(str, str2, j10, j11, bundle, true, z10, true, null);
    }

    public final void zzH(String str, String str2, Bundle bundle, String str3) {
        zzic.zzL();
        zzic zzicVar = this.zzu;
        zzI("auto", str2, zzicVar.zzba().currentTimeMillis(), zzicVar.zzc().zzp(null, zzfy.zzbe) ? zzicVar.zzba().elapsedRealtime() : 0L, bundle, false, true, true, str3);
    }

    protected final void zzI(String str, String str2, long j10, long j11, Bundle bundle, boolean z10, boolean z11, boolean z12, String str3) {
        int i10 = zzpp.zza;
        Bundle bundle2 = new Bundle(bundle);
        for (String str4 : bundle2.keySet()) {
            Object obj = bundle2.get(str4);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str4, new Bundle((Bundle) obj));
            } else {
                int i11 = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i11 < parcelableArr.length) {
                        Parcelable parcelable = parcelableArr[i11];
                        if (parcelable instanceof Bundle) {
                            parcelableArr[i11] = new Bundle((Bundle) parcelable);
                        }
                        i11++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i11 < list.size()) {
                        Object obj2 = list.get(i11);
                        if (obj2 instanceof Bundle) {
                            list.set(i11, new Bundle((Bundle) obj2));
                        }
                        i11++;
                    }
                }
            }
        }
        this.zzu.zzaX().zzj(new zzkc(this, str, str2, j10, j11, bundle2, z10, z11, z12, str3));
    }

    public final void zzJ(String str, String str2, Object obj, boolean z10) {
        zzK("auto", "_ldl", obj, true, this.zzu.zzba().currentTimeMillis());
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0044  */
    /* JADX WARN: Code duplicated, block: B:20:0x0053  */
    /* JADX WARN: Code duplicated, block: B:23:0x0067 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x0069  */
    /* JADX WARN: Code duplicated, block: B:25:0x006c  */
    /* JADX WARN: Code duplicated, block: B:27:0x0070  */
    /* JADX WARN: Code duplicated, block: B:29:0x007c  */
    /* JADX WARN: Code duplicated, block: B:35:0x0092  */
    /* JADX WARN: Code duplicated, block: B:38:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:42:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0026  */
    public final void zzK(String str, String str2, Object obj, boolean z10, long j10) {
        int i10;
        int iZzs;
        String str3;
        zzic zzicVar;
        int iZzM;
        Object objZzN;
        if (!z10) {
            zzpp zzppVarZzk = this.zzu.zzk();
            if (!zzppVarZzk.zzk("user property", str2)) {
                i10 = 6;
            } else if (zzppVarZzk.zzm("user property", zzjo.zza, null, str2)) {
                zzppVarZzk.zzu.zzc();
                if (zzppVarZzk.zzn("user property", 24, str2)) {
                    i10 = 0;
                } else {
                    i10 = 6;
                }
            } else {
                iZzs = 15;
            }
            if (i10 != 0) {
                zzic zzicVar2 = this.zzu;
                zzpp zzppVarZzk2 = zzicVar2.zzk();
                zzicVar2.zzc();
                this.zzu.zzk().zzP(this.zzt, null, i10, "_ev", zzppVarZzk2.zzE(str2, 24, true), str2 != null ? str2.length() : 0);
                return;
            }
            if (str == null) {
                str3 = MBridgeConstans.DYNAMIC_VIEW_WX_APP;
            } else {
                str3 = str;
            }
            if (obj != null) {
                zzL(str3, str2, j10, null);
                return;
            }
            zzicVar = this.zzu;
            iZzM = zzicVar.zzk().zzM(str2, obj);
            if (iZzM != 0) {
                objZzN = zzicVar.zzk().zzN(str2, obj);
                if (objZzN != null) {
                    zzL(str3, str2, j10, objZzN);
                    return;
                }
                return;
            }
            zzpp zzppVarZzk3 = zzicVar.zzk();
            zzicVar.zzc();
            this.zzu.zzk().zzP(this.zzt, null, iZzM, "_ev", zzppVarZzk3.zzE(str2, 24, true), (!(obj instanceof String) || (obj instanceof CharSequence)) ? obj.toString().length() : 0);
        }
        iZzs = this.zzu.zzk().zzs(str2);
        i10 = iZzs;
        if (i10 != 0) {
            zzic zzicVar3 = this.zzu;
            zzpp zzppVarZzk4 = zzicVar3.zzk();
            zzicVar3.zzc();
            if (str2 != null) {
            }
            this.zzu.zzk().zzP(this.zzt, null, i10, "_ev", zzppVarZzk4.zzE(str2, 24, true), str2 != null ? str2.length() : 0);
            return;
        }
        if (str == null) {
            str3 = MBridgeConstans.DYNAMIC_VIEW_WX_APP;
        } else {
            str3 = str;
        }
        if (obj != null) {
            zzL(str3, str2, j10, null);
            return;
        }
        zzicVar = this.zzu;
        iZzM = zzicVar.zzk().zzM(str2, obj);
        if (iZzM != 0) {
            objZzN = zzicVar.zzk().zzN(str2, obj);
            if (objZzN != null) {
                zzL(str3, str2, j10, objZzN);
                return;
            }
            return;
        }
        zzpp zzppVarZzk5 = zzicVar.zzk();
        zzicVar.zzc();
        this.zzu.zzk().zzP(this.zzt, null, iZzM, "_ev", zzppVarZzk5.zzE(str2, 24, true), (!(obj instanceof String) || (obj instanceof CharSequence)) ? obj.toString().length() : 0);
    }

    final void zzL(String str, String str2, long j10, Object obj) {
        this.zzu.zzaX().zzj(new zzkd(this, str, str2, obj, j10));
    }

    public final Map zzO(String str, String str2, boolean z10) {
        zzic zzicVar = this.zzu;
        if (zzicVar.zzaX().zze()) {
            zzicVar.zzaW().zzb().zza("Cannot get user properties from analytics worker thread");
            return Collections.EMPTY_MAP;
        }
        zzicVar.zzaV();
        if (zzae.zza()) {
            zzicVar.zzaW().zzb().zza("Cannot get user properties from main thread");
            return Collections.EMPTY_MAP;
        }
        AtomicReference atomicReference = new AtomicReference();
        this.zzu.zzaX().zzk(atomicReference, 5000L, "get user properties", new zzkl(this, atomicReference, null, str, str2, z10));
        List<zzpl> list = (List) atomicReference.get();
        if (list == null) {
            zzicVar.zzaW().zzb().zzb("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z10));
            return Collections.EMPTY_MAP;
        }
        a aVar = new a(list.size());
        for (zzpl zzplVar : list) {
            Object objZza = zzplVar.zza();
            if (objZza != null) {
                aVar.put(zzplVar.zzb, objZza);
            }
        }
        return aVar;
    }

    public final String zzP() {
        return (String) this.zzg.get();
    }

    final void zzQ(String str) {
        this.zzg.set(str);
    }

    public final void zzR() {
        zzg();
        zzic zzicVar = this.zzu;
        if (zzicVar.zzd().zzo.zza()) {
            zzicVar.zzaW().zzj().zza("Deferred Deep Link already retrieved. Not fetching again.");
            return;
        }
        long jZza = zzicVar.zzd().zzp.zza();
        zzicVar.zzd().zzp.zzb(1 + jZza);
        zzicVar.zzc();
        if (jZza >= 5) {
            zzicVar.zzaW().zze().zza("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
            zzicVar.zzd().zzo.zzb(true);
        } else {
            if (this.zzq == null) {
                this.zzq = new zzkg(this, this.zzu);
            }
            this.zzq.zzb(0L);
        }
    }

    public final void zzS(long j10, long j11) {
        this.zzg.set(null);
        this.zzu.zzaX().zzj(new zzkh(this, j10));
    }

    public final void zzT() {
        zzg();
        zzb();
        if (this.zzu.zzH()) {
            zzic zzicVar = this.zzu;
            zzal zzalVarZzc = zzicVar.zzc();
            zzalVarZzc.zzu.zzaV();
            Boolean boolZzr = zzalVarZzc.zzr("google_analytics_deferred_deep_link_enabled");
            if (boolZzr != null && boolZzr.booleanValue()) {
                zzicVar.zzaW().zzj().zza("Deferred Deep Link feature enabled.");
                zzicVar.zzaX().zzj(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzlh
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzR();
                    }
                });
            }
            this.zzu.zzt().zzE();
            this.zzc = false;
            zzhh zzhhVarZzd = zzicVar.zzd();
            zzhhVarZzd.zzg();
            String string = zzhhVarZzd.zzd().getString("previous_os_version", null);
            zzhhVarZzd.zzu.zzu().zzw();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor editorEdit = zzhhVarZzd.zzd().edit();
                editorEdit.putString("previous_os_version", str);
                editorEdit.apply();
            }
            if (TextUtils.isEmpty(string)) {
                return;
            }
            zzicVar.zzu().zzw();
            if (string.equals(str)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", string);
            zzE("auto", "_ou", bundle);
        }
    }

    public final void zzU(zzjp zzjpVar) {
        zzjp zzjpVar2;
        zzg();
        zzb();
        if (zzjpVar != null && zzjpVar != (zzjpVar2 = this.zzd)) {
            Preconditions.checkState(zzjpVar2 == null, "EventInterceptor already set.");
        }
        this.zzd = zzjpVar;
    }

    public final void zzV(zzjq zzjqVar) {
        zzb();
        Preconditions.checkNotNull(zzjqVar);
        if (this.zze.add(zzjqVar)) {
            return;
        }
        this.zzu.zzaW().zze().zza("OnEventListener already registered");
    }

    public final void zzW(zzjq zzjqVar) {
        zzb();
        Preconditions.checkNotNull(zzjqVar);
        if (this.zze.remove(zzjqVar)) {
            return;
        }
        this.zzu.zzaW().zze().zza("OnEventListener had not been registered");
    }

    public final int zzX(String str) {
        Preconditions.checkNotEmpty(str);
        this.zzu.zzc();
        return 25;
    }

    public final void zzY(Bundle bundle) {
        zzZ(bundle, this.zzu.zzba().currentTimeMillis());
    }

    public final void zzaa(String str, String str2, Bundle bundle) {
        zzic zzicVar = this.zzu;
        long jCurrentTimeMillis = zzicVar.zzba().currentTimeMillis();
        Preconditions.checkNotEmpty(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, jCurrentTimeMillis);
        if (str2 != null) {
            bundle2.putString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, str2);
            bundle2.putBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, bundle);
        }
        zzicVar.zzaX().zzj(new zzkj(this, bundle2));
    }

    public final ArrayList zzab(String str, String str2) {
        zzic zzicVar = this.zzu;
        if (zzicVar.zzaX().zze()) {
            zzicVar.zzaW().zzb().zza("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        zzicVar.zzaV();
        if (zzae.zza()) {
            zzicVar.zzaW().zzb().zza("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        this.zzu.zzaX().zzk(atomicReference, 5000L, "get conditional user properties", new zzkk(this, atomicReference, null, str, str2));
        List list = (List) atomicReference.get();
        if (list != null) {
            return zzpp.zzav(list);
        }
        zzicVar.zzaW().zzb().zzb("Timed out waiting for get conditional user properties", null);
        return new ArrayList();
    }

    public final String zzac() {
        zzlu zzluVarZzl = this.zzu.zzs().zzl();
        if (zzluVarZzl != null) {
            return zzluVarZzl.zza;
        }
        return null;
    }

    public final String zzad() {
        zzlu zzluVarZzl = this.zzu.zzs().zzl();
        if (zzluVarZzl != null) {
            return zzluVarZzl.zzb;
        }
        return null;
    }

    public final String zzae() {
        try {
            return zzlt.zza(this.zzu.zzaZ(), "google_app_id", this.zzu.zzq());
        } catch (IllegalStateException e10) {
            this.zzu.zzaW().zzb().zzb("getGoogleAppId failed with exception", e10);
            return null;
        }
    }

    final /* synthetic */ void zzaf(SharedPreferences sharedPreferences, String str) {
        if (Objects.equals(str, "IABTCF_TCString") || Objects.equals(str, "IABTCF_gdprApplies") || Objects.equals(str, "IABTCF_EnableAdvertiserConsentMode")) {
            this.zzu.zzaW().zzk().zza("IABTCF_TCString change picked up in listener.");
            ((zzaz) Preconditions.checkNotNull(this.zzs)).zzb(500L);
        }
    }

    final /* synthetic */ void zzag(Bundle bundle) {
        int i10;
        if (!bundle.isEmpty()) {
            zzic zzicVar = this.zzu;
            Bundle bundle2 = new Bundle(zzicVar.zzd().zzt.zza());
            Iterator<String> it = bundle.keySet().iterator();
            while (true) {
                i10 = 0;
                if (!it.hasNext()) {
                    break;
                }
                String next = it.next();
                Object obj = bundle.get(next);
                if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                    if (zzicVar.zzk().zzz(obj)) {
                        zzicVar.zzk().zzP(this.zzt, null, 27, null, null, 0);
                    }
                    zzicVar.zzaW().zzh().zzc("Invalid default event parameter type. Name, value", next, obj);
                } else if (zzpp.zzac(next)) {
                    zzicVar.zzaW().zzh().zzb("Invalid default event parameter name. Name", next);
                } else if (obj == null) {
                    bundle2.remove(next);
                } else if (zzicVar.zzk().zzA("param", next, zzicVar.zzc().zze(null, false), obj)) {
                    zzicVar.zzk().zzO(bundle2, next, obj);
                }
            }
            zzicVar.zzk();
            int iZzc = zzicVar.zzc().zzc();
            if (bundle2.size() > iZzc) {
                for (String str : new TreeSet(bundle2.keySet())) {
                    i10++;
                    if (i10 > iZzc) {
                        bundle2.remove(str);
                    }
                }
                zzicVar.zzk().zzP(this.zzt, null, 26, null, null, 0);
                zzicVar.zzaW().zzh().zza("Too many default event parameters set. Discarding beyond event parameter limit");
            }
            bundle = bundle2;
        }
        this.zzu.zzd().zzt.zzb(bundle);
        this.zzu.zzt().zzH(bundle);
    }

    final /* synthetic */ void zzah(int i10) {
        if (this.zzk == null) {
            this.zzk = new zzjx(this, this.zzu);
        }
        this.zzk.zzb(((long) i10) * 1000);
    }

    final /* synthetic */ void zzai(Boolean bool, boolean z10) {
        zzaq(bool, true);
    }

    final /* synthetic */ void zzaj(zzjl zzjlVar, long j10, boolean z10, boolean z11) {
        zzg();
        zzb();
        zzic zzicVar = this.zzu;
        zzjl zzjlVarZzl = zzicVar.zzd().zzl();
        if (j10 <= this.zzp && zzjl.zzu(zzjlVarZzl.zzb(), zzjlVar.zzb())) {
            zzicVar.zzaW().zzi().zzb("Dropped out-of-date consent setting, proposed settings", zzjlVar);
            return;
        }
        zzhh zzhhVarZzd = zzicVar.zzd();
        zzic zzicVar2 = zzhhVarZzd.zzu;
        zzhhVarZzd.zzg();
        int iZzb = zzjlVar.zzb();
        if (!zzhhVarZzd.zzk(iZzb)) {
            zzicVar.zzaW().zzi().zzb("Lower precedence consent source ignored, proposed source", Integer.valueOf(zzjlVar.zzb()));
            return;
        }
        zzic zzicVar3 = this.zzu;
        SharedPreferences.Editor editorEdit = zzhhVarZzd.zzd().edit();
        editorEdit.putString("consent_settings", zzjlVar.zzl());
        editorEdit.putInt("consent_source", iZzb);
        editorEdit.apply();
        zzicVar.zzaW().zzk().zzb("Setting storage consent(FE)", zzjlVar);
        this.zzp = j10;
        if (zzicVar3.zzt().zzP()) {
            zzicVar3.zzt().zzk(z10);
        } else {
            zzicVar3.zzt().zzj(z10);
        }
        if (z11) {
            zzicVar3.zzt().zzC(new AtomicReference());
        }
    }

    final /* synthetic */ void zzal(boolean z10) {
        this.zzi = false;
    }

    final /* synthetic */ int zzam() {
        return this.zzj;
    }

    final /* synthetic */ void zzan(int i10) {
        this.zzj = i10;
    }

    final /* synthetic */ zzaz zzao() {
        return this.zzq;
    }

    @Override // com.google.android.gms.measurement.internal.zzg
    protected final boolean zze() {
        return false;
    }

    public final void zzh() {
        zzic zzicVar = this.zzu;
        if (!(zzicVar.zzaZ().getApplicationContext() instanceof Application) || this.zza == null) {
            return;
        }
        ((Application) zzicVar.zzaZ().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.zza);
    }

    public final Boolean zzi() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) this.zzu.zzaX().zzk(atomicReference, MBInterstitialActivity.WEB_LOAD_TIME, "boolean test flag value", new zzke(this, atomicReference));
    }

    public final String zzj() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) this.zzu.zzaX().zzk(atomicReference, MBInterstitialActivity.WEB_LOAD_TIME, "String test flag value", new zzko(this, atomicReference));
    }

    public final Long zzk() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) this.zzu.zzaX().zzk(atomicReference, MBInterstitialActivity.WEB_LOAD_TIME, "long test flag value", new zzkp(this, atomicReference));
    }

    public final Integer zzl() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) this.zzu.zzaX().zzk(atomicReference, MBInterstitialActivity.WEB_LOAD_TIME, "int test flag value", new zzkq(this, atomicReference));
    }

    public final Double zzm() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) this.zzu.zzaX().zzk(atomicReference, MBInterstitialActivity.WEB_LOAD_TIME, "double test flag value", new zzkr(this, atomicReference));
    }

    public final void zzn(Boolean bool) {
        zzb();
        this.zzu.zzaX().zzj(new zzks(this, bool));
    }

    final void zzp(Bundle bundle, int i10, long j10) {
        Object obj;
        String string;
        zzb();
        zzjl zzjlVar = zzjl.zza;
        zzjk[] zzjkVarArrZzb = zzjj.STORAGE.zzb();
        int length = zzjkVarArrZzb.length;
        int i11 = 0;
        while (true) {
            obj = null;
            if (i11 >= length) {
                break;
            }
            String str = zzjkVarArrZzb[i11].zze;
            if (bundle.containsKey(str) && (string = bundle.getString(str)) != null) {
                if (string.equals("granted")) {
                    obj = Boolean.TRUE;
                } else if (string.equals("denied")) {
                    obj = Boolean.FALSE;
                }
                if (obj == null) {
                    obj = string;
                    break;
                }
            }
            i11++;
        }
        if (obj != null) {
            zzic zzicVar = this.zzu;
            zzicVar.zzaW().zzh().zzb("Ignoring invalid consent setting", obj);
            zzicVar.zzaW().zzh().zza("Valid consent values are 'granted', 'denied'");
        }
        boolean zZze = this.zzu.zzaX().zze();
        zzjl zzjlVarZze = zzjl.zze(bundle, i10);
        if (zzjlVarZze.zzc()) {
            zzs(zzjlVarZze, zZze);
        }
        zzba zzbaVarZzh = zzba.zzh(bundle, i10);
        if (zzbaVarZzh.zzd()) {
            zzq(zzbaVarZzh, zZze);
        }
        Boolean boolZzi = zzba.zzi(bundle);
        if (boolZzi != null) {
            String str2 = i10 == -30 ? "tcf" : MBridgeConstans.DYNAMIC_VIEW_WX_APP;
            if (zZze) {
                zzM(str2, "allow_personalized_ads", boolZzi.toString(), j10);
            } else {
                zzK(str2, "allow_personalized_ads", boolZzi.toString(), false, j10);
            }
        }
    }

    final void zzq(zzba zzbaVar, boolean z10) {
        zzkt zzktVar = new zzkt(this, zzbaVar);
        if (!z10) {
            this.zzu.zzaX().zzj(zzktVar);
        } else {
            zzg();
            zzktVar.run();
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:55:0x00cf
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1478)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public final void zzs(com.google.android.gms.measurement.internal.zzjl r10, boolean r11) {
        /*
            Method dump skipped, instruction units count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzlj.zzs(com.google.android.gms.measurement.internal.zzjl, boolean):void");
    }

    final void zzt(Runnable runnable) {
        zzb();
        zzic zzicVar = this.zzu;
        if (zzicVar.zzaX().zze()) {
            zzicVar.zzaW().zzb().zza("Cannot retrieve and upload batches from analytics worker thread");
            return;
        }
        if (zzicVar.zzaX().zzf()) {
            zzicVar.zzaW().zzb().zza("Cannot retrieve and upload batches from analytics network thread");
            return;
        }
        zzicVar.zzaV();
        if (zzae.zza()) {
            zzicVar.zzaW().zzb().zza("Cannot retrieve and upload batches from main thread");
            return;
        }
        zzicVar.zzaW().zzk().zza("[sgtm] Started client-side batch upload work.");
        boolean z10 = false;
        int size = 0;
        int i10 = 0;
        while (!z10) {
            zzicVar.zzaW().zzk().zza("[sgtm] Getting upload batches from service (FE)");
            final AtomicReference atomicReference = new AtomicReference();
            zzicVar.zzaX().zzk(atomicReference, 10000L, "[sgtm] Getting upload batches", new Runnable() { // from class: com.google.android.gms.measurement.internal.zzli
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzu.zzt().zzx(atomicReference, zzoo.zza(zzls.SGTM_CLIENT));
                }
            });
            zzoq zzoqVar = (zzoq) atomicReference.get();
            if (zzoqVar == null) {
                break;
            }
            List list = zzoqVar.zza;
            if (!list.isEmpty()) {
                zzicVar.zzaW().zzk().zzb("[sgtm] Retrieved upload batches. count", Integer.valueOf(list.size()));
                size += list.size();
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z10 = false;
                        break;
                    }
                    zzlr zzlrVarZzap = zzap((zzom) it.next());
                    if (zzlrVarZzap == zzlr.SUCCESS) {
                        i10++;
                    } else if (zzlrVarZzap == zzlr.BACKOFF) {
                        z10 = true;
                        break;
                    }
                }
            } else {
                break;
            }
        }
        zzicVar.zzaW().zzk().zzc("[sgtm] Completed client-side batch upload work. total, success", Integer.valueOf(size), Integer.valueOf(i10));
        runnable.run();
    }

    final void zzu(long j10) {
        zzg();
        if (this.zzl == null) {
            this.zzl = new zzju(this, this.zzu);
        }
        this.zzl.zzb(j10);
    }

    final void zzv() {
        zzg();
        zzaz zzazVar = this.zzl;
        if (zzazVar != null) {
            zzazVar.zzd();
        }
    }

    final void zzw() {
        zzaif.zza();
        zzic zzicVar = this.zzu;
        if (zzicVar.zzc().zzp(null, zzfy.zzaP)) {
            if (zzicVar.zzaX().zze()) {
                zzicVar.zzaW().zzb().zza("Cannot get trigger URIs from analytics worker thread");
                return;
            }
            zzicVar.zzaV();
            if (zzae.zza()) {
                zzicVar.zzaW().zzb().zza("Cannot get trigger URIs from main thread");
                return;
            }
            zzb();
            zzicVar.zzaW().zzk().zza("Getting trigger URIs (FE)");
            final AtomicReference atomicReference = new AtomicReference();
            zzicVar.zzaX().zzk(atomicReference, 10000L, "get trigger URIs", new Runnable() { // from class: com.google.android.gms.measurement.internal.zzla
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzlj zzljVar = this.zza;
                    zzljVar.zzu.zzt().zzw(atomicReference, zzljVar.zzu.zzd().zzi.zza());
                }
            });
            final List list = (List) atomicReference.get();
            if (list == null) {
                zzicVar.zzaW().zzd().zza("Timed out waiting for get trigger URIs");
            } else {
                zzicVar.zzaX().zzj(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzlb
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzlj zzljVar = this.zza;
                        zzljVar.zzg();
                        if (Build.VERSION.SDK_INT < 30) {
                            return;
                        }
                        List<zzoh> list2 = list;
                        SparseArray sparseArrayZzf = zzljVar.zzu.zzd().zzf();
                        for (zzoh zzohVar : list2) {
                            int i10 = zzohVar.zzc;
                            if (!sparseArrayZzf.contains(i10) || ((Long) sparseArrayZzf.get(i10)).longValue() < zzohVar.zzb) {
                                zzljVar.zzx().add(zzohVar);
                            }
                        }
                        zzljVar.zzy();
                    }
                });
            }
        }
    }

    final PriorityQueue zzx() {
        if (this.zzm == null) {
            this.zzm = new PriorityQueue(Comparator.comparing(zzlc.zza, zzld.zza));
        }
        return this.zzm;
    }

    final void zzy() {
        zzoh zzohVar;
        zzg();
        if (zzx().isEmpty() || this.zzi || (zzohVar = (zzoh) zzx().poll()) == null) {
            return;
        }
        zzic zzicVar = this.zzu;
        h4.a aVarZzV = zzicVar.zzk().zzV();
        if (aVarZzV != null) {
            this.zzi = true;
            zzgs zzgsVarZzk = zzicVar.zzaW().zzk();
            String str = zzohVar.zza;
            zzgsVarZzk.zzb("Registering trigger URI", str);
            ListenableFuture listenableFutureD = aVarZzV.d(Uri.parse(str));
            if (listenableFutureD != null) {
                x.a(listenableFutureD, new zzjw(this, zzohVar), new zzjv(this));
            } else {
                this.zzi = false;
                zzx().add(zzohVar);
            }
        }
    }

    final void zzz(zzjl zzjlVar) {
        zzg();
        boolean z10 = (zzjlVar.zzo(zzjk.ANALYTICS_STORAGE) && zzjlVar.zzo(zzjk.AD_STORAGE)) || this.zzu.zzt().zzO();
        zzic zzicVar = this.zzu;
        if (z10 != zzicVar.zzE()) {
            zzicVar.zzD(z10);
            zzhh zzhhVarZzd = this.zzu.zzd();
            zzic zzicVar2 = zzhhVarZzd.zzu;
            zzhhVarZzd.zzg();
            Boolean boolValueOf = zzhhVarZzd.zzd().contains("measurement_enabled_from_api") ? Boolean.valueOf(zzhhVarZzd.zzd().getBoolean("measurement_enabled_from_api", true)) : null;
            if (!z10 || boolValueOf == null || boolValueOf.booleanValue()) {
                zzaq(Boolean.valueOf(z10), false);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x010a  */
    /* JADX WARN: Multi-variable type inference failed */
    protected final void zzG(String str, String str2, long j10, long j11, Bundle bundle, boolean z10, boolean z11, boolean z12, String str3) {
        boolean z13;
        int i10;
        zzic zzicVar;
        long j12;
        long j13;
        String str4;
        zzlj zzljVar;
        Bundle[] bundleArr;
        int i11;
        String str5 = str;
        Preconditions.checkNotEmpty(str5);
        Preconditions.checkNotNull(bundle);
        zzg();
        zzb();
        zzic zzicVar2 = this.zzu;
        if (!zzicVar2.zzB()) {
            this.zzu.zzaW().zzj().zza("Event not sent since app measurement is disabled");
            return;
        }
        List listZzp = this.zzu.zzv().zzp();
        if (listZzp != null && !listZzp.contains(str2)) {
            this.zzu.zzaW().zzj().zzc("Dropping non-safelisted event. event name, origin", str2, str5);
            return;
        }
        if (!this.zzf) {
            this.zzf = true;
            try {
                try {
                    (!zzicVar2.zzp() ? Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, this.zzu.zzaZ().getClassLoader()) : Class.forName("com.google.android.gms.tagmanager.TagManagerService")).getDeclaredMethod("initialize", Context.class).invoke(null, this.zzu.zzaZ());
                } catch (Exception e10) {
                    this.zzu.zzaW().zze().zzb("Failed to invoke Tag Manager's initialize() method", e10);
                }
            } catch (ClassNotFoundException unused) {
                this.zzu.zzaW().zzi().zza("Tag Manager is not found and thus will not be used");
            }
        }
        zzic zzicVar3 = this.zzu;
        if (!zzicVar3.zzc().zzp(null, zzfy.zzaZ) && "_cmp".equals(str2) && bundle.containsKey("gclid")) {
            zzicVar3.zzaV();
            zzM("auto", "_lgclid", bundle.getString("gclid"), zzicVar3.zzba().currentTimeMillis());
        }
        zzicVar3.zzaV();
        if (z10 && zzpp.zzai(str2)) {
            zzicVar3.zzk().zzK(bundle, zzicVar3.zzd().zzt.zza());
        }
        if (!z12) {
            zzicVar3.zzaV();
            if (!"_iap".equals(str2)) {
                zzic zzicVar4 = this.zzu;
                zzpp zzppVarZzk = zzicVar4.zzk();
                if (zzppVarZzk.zzk(NotificationCompat.CATEGORY_EVENT, str2)) {
                    zzic zzicVar5 = zzppVarZzk.zzu;
                    if (zzppVarZzk.zzm(NotificationCompat.CATEGORY_EVENT, zzjm.zza, zzicVar5.zzc().zzp(null, zzfy.zzbf) ? zzjm.zzc : zzjm.zzb, str2)) {
                        zzicVar5.zzc();
                        if (zzppVarZzk.zzn(NotificationCompat.CATEGORY_EVENT, 40, str2)) {
                            i11 = 0;
                        } else {
                            i11 = 2;
                        }
                    } else {
                        i11 = 13;
                    }
                } else {
                    i11 = 2;
                }
                if (i11 != 0) {
                    zzicVar3.zzaW().zzd().zzb("Invalid public event name. Event will not be logged (FE)", zzicVar3.zzl().zza(str2));
                    zzpp zzppVarZzk2 = zzicVar4.zzk();
                    zzicVar4.zzc();
                    zzicVar4.zzk().zzP(this.zzt, null, i11, "_ev", zzppVarZzk2.zzE(str2, 40, true), str2 != null ? str2.length() : 0);
                    return;
                }
            }
        }
        zzicVar3.zzaV();
        zzic zzicVar6 = this.zzu;
        zzlu zzluVarZzh = zzicVar6.zzs().zzh(false);
        if (zzluVarZzh != null && !bundle.containsKey("_sc")) {
            zzluVarZzh.zzd = true;
        }
        zzpp.zzay(zzluVarZzh, bundle, z10 && !z12);
        boolean zEquals = "am".equals(str5);
        boolean zZzac = zzpp.zzac(str2);
        if (!z10 || this.zzd == null || zZzac) {
            z13 = zEquals;
        } else {
            if (!zEquals) {
                zzicVar3.zzaW().zzj().zzc("Passing event to registered event handler (FE)", zzicVar3.zzl().zza(str2), zzicVar3.zzl().zze(bundle));
                Preconditions.checkNotNull(this.zzd);
                this.zzd.interceptEvent(str5, str2, bundle, j10);
                return;
            }
            z13 = true;
        }
        zzic zzicVar7 = this.zzu;
        if (zzicVar7.zzH()) {
            int iZzp = zzicVar3.zzk().zzp(str2);
            if (iZzp != 0) {
                zzicVar3.zzaW().zzd().zzb("Invalid event name. Event will not be logged (FE)", zzicVar3.zzl().zza(str2));
                zzpp zzppVarZzk3 = zzicVar3.zzk();
                zzicVar3.zzc();
                zzicVar7.zzk().zzP(this.zzt, str3, iZzp, "_ev", zzppVarZzk3.zzE(str2, 40, true), str2 != null ? str2.length() : 0);
                return;
            }
            Bundle bundleZzH = zzicVar3.zzk().zzH(str3, str2, bundle, CollectionUtils.listOf((Object[]) new String[]{"_o", "_sn", "_sc", "_si"}), z12);
            Preconditions.checkNotNull(bundleZzH);
            zzicVar3.zzaV();
            if (zzicVar6.zzs().zzh(false) == null || !"_ae".equals(str2)) {
                i10 = 0;
                zzicVar = zzicVar6;
                j12 = 0;
            } else {
                zzoa zzoaVar = zzicVar6.zzh().zzb;
                j12 = 0;
                long jElapsedRealtime = zzoaVar.zzc.zzu.zzba().elapsedRealtime();
                i10 = 0;
                zzicVar = zzicVar6;
                long j14 = jElapsedRealtime - zzoaVar.zzb;
                zzoaVar.zzb = jElapsedRealtime;
                if (j14 > 0) {
                    zzicVar3.zzk().zzan(bundleZzH, j14);
                }
            }
            if (!UoyZyZEcGYBpIg.wAofkJ.equals(str5) && "_ssr".equals(str2)) {
                zzpp zzppVarZzk4 = zzicVar3.zzk();
                String string = bundleZzH.getString("_ffr");
                if (Strings.isEmptyOrWhitespace(string)) {
                    string = null;
                } else if (string != null) {
                    string = string.trim();
                }
                zzic zzicVar8 = zzppVarZzk4.zzu;
                if (Objects.equals(string, zzicVar8.zzd().zzq.zza())) {
                    zzicVar8.zzaW().zzj().zza("Not logging duplicate session_start_with_rollout event");
                    return;
                }
                zzicVar8.zzd().zzq.zzb(string);
            } else if ("_ae".equals(str2)) {
                String strZza = zzicVar3.zzk().zzu.zzd().zzq.zza();
                if (!TextUtils.isEmpty(strZza)) {
                    bundleZzH.putString("_ffr", strZza);
                }
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(bundleZzH);
            boolean zZzi = zzicVar3.zzc().zzp(null, zzfy.zzaS) ? zzicVar.zzh().zzi() : zzicVar3.zzd().zzn.zza();
            if (zzicVar3.zzd().zzk.zza() > j12 && zzicVar3.zzd().zzo(j10) && zZzi) {
                zzicVar3.zzaW().zzk().zza("Current session is expired, remove the session number, ID, and engagement time");
                j13 = j12;
                str4 = "_ae";
                zzM("auto", "_sid", null, zzicVar3.zzba().currentTimeMillis());
                zzM("auto", "_sno", null, zzicVar3.zzba().currentTimeMillis());
                zzM("auto", "_se", null, zzicVar3.zzba().currentTimeMillis());
                zzljVar = this;
                zzicVar3.zzd().zzl.zzb(j13);
            } else {
                j13 = j12;
                str4 = "_ae";
                zzljVar = this;
            }
            if (bundleZzH.getLong("extend_session", j13) == 1) {
                zzicVar3.zzaW().zzk().zza("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                zzicVar7.zzh().zza.zzb(j10, j11, true);
            }
            ArrayList arrayList2 = new ArrayList(bundleZzH.keySet());
            Collections.sort(arrayList2);
            int size = arrayList2.size();
            for (int i12 = i10; i12 < size; i12++) {
                String str6 = (String) arrayList2.get(i12);
                if (str6 != null) {
                    zzicVar3.zzk();
                    Object obj = bundleZzH.get(str6);
                    if (obj instanceof Bundle) {
                        bundleArr = new Bundle[1];
                        bundleArr[i10] = (Bundle) obj;
                    } else if (obj instanceof Parcelable[]) {
                        Parcelable[] parcelableArr = (Parcelable[]) obj;
                        bundleArr = (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList3 = (ArrayList) obj;
                        bundleArr = (Bundle[]) arrayList3.toArray(new Bundle[arrayList3.size()]);
                    } else {
                        bundleArr = null;
                    }
                    if (bundleArr != null) {
                        bundleZzH.putParcelableArray(str6, bundleArr);
                    }
                }
            }
            int i13 = i10;
            while (i13 < arrayList.size()) {
                Bundle bundleZzae = (Bundle) arrayList.get(i13);
                String str7 = i13 != 0 ? "_ep" : str2;
                bundleZzae.putString("_o", str5);
                if (z11) {
                    bundleZzae = zzicVar3.zzk().zzae(bundleZzae, null);
                }
                Bundle bundle2 = bundleZzae;
                zzicVar.zzt().zzn(new zzbh(str7, new zzbf(bundle2), str5, j10, j11), str3);
                if (!z13) {
                    Iterator it = zzljVar.zze.iterator();
                    while (it.hasNext()) {
                        ((zzjq) it.next()).onEvent(str, str2, new Bundle(bundle2), j10);
                    }
                }
                i13++;
                str5 = str;
            }
            zzicVar3.zzaV();
            if (zzicVar.zzs().zzh(i10) == null || !str4.equals(str2)) {
                return;
            }
            zzicVar.zzh().zzb.zzd(true, true, zzicVar3.zzba().elapsedRealtime());
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0053 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0055  */
    final void zzM(String str, String str2, Object obj, long j10) {
        long j11;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzg();
        zzb();
        Object obj2 = obj;
        if ("allow_personalized_ads".equals(str2)) {
            if (obj instanceof String) {
                String str3 = (String) obj;
                if (!TextUtils.isEmpty(str3)) {
                    String lowerCase = str3.toLowerCase(Locale.ENGLISH);
                    String str4 = "false";
                    if (true != "false".equals(lowerCase)) {
                        j11 = 0;
                    } else {
                        j11 = 1;
                    }
                    zzic zzicVar = this.zzu;
                    Long lValueOf = Long.valueOf(j11);
                    zzhg zzhgVar = zzicVar.zzd().zzh;
                    if (lValueOf.longValue() == 1) {
                        str4 = "true";
                    }
                    zzhgVar.zzb(str4);
                    obj = lValueOf;
                } else if (obj == null) {
                    this.zzu.zzd().zzh.zzb("unset");
                    obj = obj;
                }
                str2 = "_npa";
            } else if (obj == null) {
                this.zzu.zzd().zzh.zzb("unset");
                obj = obj;
                str2 = "_npa";
            }
            this.zzu.zzaW().zzk().zzc("Setting user property(FE)", "non_personalized_ads(_npa)", obj);
            obj2 = obj;
        }
        String str5 = str2;
        Object obj3 = obj2;
        zzic zzicVar2 = this.zzu;
        if (!zzicVar2.zzB()) {
            this.zzu.zzaW().zzk().zza(mDXVAtwcaFMHJ.AYqh);
        } else {
            if (!zzicVar2.zzH()) {
                return;
            }
            this.zzu.zzt().zzA(new zzpl(str5, j10, obj3, str));
        }
    }

    public final List zzN(boolean z10) {
        zzb();
        zzic zzicVar = this.zzu;
        zzicVar.zzaW().zzk().zza("Getting user properties (FE)");
        if (!zzicVar.zzaX().zze()) {
            zzicVar.zzaV();
            if (zzae.zza()) {
                zzicVar.zzaW().zzb().zza("Cannot get all user properties from main thread");
                return Collections.EMPTY_LIST;
            }
            AtomicReference atomicReference = new AtomicReference();
            this.zzu.zzaX().zzk(atomicReference, 5000L, "get user properties", new zzkf(this, atomicReference, z10));
            List list = (List) atomicReference.get();
            if (list == null) {
                zzicVar.zzaW().zzb().zzb(Saucuwx.TbwgVdNjypCLNw, Boolean.valueOf(z10));
                return Collections.EMPTY_LIST;
            }
            return list;
        }
        zzicVar.zzaW().zzb().zza("Cannot get all user properties from analytics worker thread");
        return Collections.EMPTY_LIST;
    }

    public final void zzZ(Bundle bundle, long j10) {
        Preconditions.checkNotNull(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString(MBridgeConstans.APP_ID))) {
            this.zzu.zzaW().zze().zza("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove(MBridgeConstans.APP_ID);
        Preconditions.checkNotNull(bundle2);
        zzjh.zzb(bundle2, MBridgeConstans.APP_ID, String.class, null);
        zzjh.zzb(bundle2, "origin", String.class, null);
        zzjh.zzb(bundle2, "name", String.class, null);
        zzjh.zzb(bundle2, AppMeasurementSdk.ConditionalUserProperty.VALUE, Object.class, null);
        zzjh.zzb(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, String.class, null);
        zzjh.zzb(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, Long.class, 0L);
        zzjh.zzb(bundle2, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, String.class, null);
        zzjh.zzb(bundle2, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, Bundle.class, null);
        zzjh.zzb(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, String.class, null);
        zzjh.zzb(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, Bundle.class, null);
        zzjh.zzb(bundle2, AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, Long.class, 0L);
        zzjh.zzb(bundle2, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, String.class, null);
        zzjh.zzb(bundle2, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, Bundle.class, null);
        Preconditions.checkNotEmpty(bundle2.getString("name"));
        Preconditions.checkNotEmpty(bundle2.getString("origin"));
        Preconditions.checkNotNull(bundle2.get(AppMeasurementSdk.ConditionalUserProperty.VALUE));
        bundle2.putLong(jyeoXJ.KBeCSCLnx, j10);
        String string = bundle2.getString("name");
        Object obj = bundle2.get(AppMeasurementSdk.ConditionalUserProperty.VALUE);
        zzic zzicVar = this.zzu;
        if (zzicVar.zzk().zzs(string) == 0) {
            if (zzicVar.zzk().zzM(string, obj) == 0) {
                Object objZzN = zzicVar.zzk().zzN(string, obj);
                if (objZzN == null) {
                    zzicVar.zzaW().zzb().zzc("Unable to normalize conditional user property value", zzicVar.zzl().zzc(string), obj);
                    return;
                }
                zzjh.zza(bundle2, objZzN);
                long j11 = bundle2.getLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT);
                if (!TextUtils.isEmpty(bundle2.getString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME))) {
                    zzicVar.zzc();
                    if (j11 > 15552000000L || j11 < 1) {
                        zzicVar.zzaW().zzb().zzc("Invalid conditional user property timeout", zzicVar.zzl().zzc(string), Long.valueOf(j11));
                        return;
                    }
                }
                long j12 = bundle2.getLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE);
                zzicVar.zzc();
                if (j12 <= 15552000000L && j12 >= 1) {
                    zzicVar.zzaX().zzj(new zzki(this, bundle2));
                    return;
                } else {
                    zzicVar.zzaW().zzb().zzc("Invalid conditional user property time to live", zzicVar.zzl().zzc(string), Long.valueOf(j12));
                    return;
                }
            }
            zzicVar.zzaW().zzb().zzc("Invalid conditional user property value", zzicVar.zzl().zzc(string), obj);
            return;
        }
        zzicVar.zzaW().zzb().zzb("Invalid conditional user property name", zzicVar.zzl().zzc(string));
    }
}
