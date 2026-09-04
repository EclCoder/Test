package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.text.TextUtils;
import com.android.vending.billing.fTvD.qEagQqzJZsd;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.InstantApps;
import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzaif;
import com.google.android.gms.internal.measurement.zzaja;
import com.vungle.ads.internal.signals.b;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgi extends zzg {
    private String zza;
    private String zzb;
    private int zzc;
    private String zzd;
    private String zze;
    private long zzf;
    private final long zzg;
    private final long zzh;
    private List zzi;
    private String zzj;
    private final String zzk;
    private int zzl;
    private String zzm;
    private String zzn;
    private long zzo;
    private String zzp;

    zzgi(zzic zzicVar, long j10, long j11, String str) {
        super(zzicVar);
        this.zzo = 0L;
        this.zzp = null;
        this.zzg = j10;
        this.zzh = j11;
        this.zzk = str;
    }

    @Override // com.google.android.gms.measurement.internal.zzg
    protected final boolean zze() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:30:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:32:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:40:0x00da  */
    /* JADX WARN: Code duplicated, block: B:41:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:42:0x0107  */
    /* JADX WARN: Code duplicated, block: B:43:0x0117  */
    /* JADX WARN: Code duplicated, block: B:44:0x0127  */
    /* JADX WARN: Code duplicated, block: B:45:0x0137  */
    /* JADX WARN: Code duplicated, block: B:46:0x0147  */
    /* JADX WARN: Code duplicated, block: B:47:0x0157  */
    /* JADX WARN: Code duplicated, block: B:51:0x0175  */
    /* JADX WARN: Code duplicated, block: B:52:0x0176 A[Catch: IllegalStateException -> 0x01a2, TryCatch #1 {IllegalStateException -> 0x01a2, blocks: (B:49:0x016d, B:53:0x0184, B:57:0x018c, B:59:0x0190, B:52:0x0176), top: B:83:0x016d }] */
    /* JADX WARN: Code duplicated, block: B:55:0x018a  */
    /* JADX WARN: Code duplicated, block: B:56:0x018b  */
    /* JADX WARN: Code duplicated, block: B:59:0x0190 A[Catch: IllegalStateException -> 0x01a2, TRY_LEAVE, TryCatch #1 {IllegalStateException -> 0x01a2, blocks: (B:49:0x016d, B:53:0x0184, B:57:0x018c, B:59:0x0190, B:52:0x0176), top: B:83:0x016d }] */
    /* JADX WARN: Code duplicated, block: B:66:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:68:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:69:0x01df  */
    /* JADX WARN: Code duplicated, block: B:72:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:75:0x01fc A[EDGE_INSN: B:75:0x01fc->B:76:0x01fe BREAK  A[LOOP:0: B:70:0x01e3->B:91:?]] */
    /* JADX WARN: Code duplicated, block: B:77:0x0200  */
    /* JADX WARN: Code duplicated, block: B:79:0x020b  */
    /* JADX WARN: Code duplicated, block: B:89:0x01fc A[SYNTHETIC] */
    @Override // com.google.android.gms.measurement.internal.zzg
    protected final void zzf() {
        String str;
        String string;
        zzic zzicVar;
        int iZzC;
        zzic zzicVar2;
        zzic zzicVar3;
        List listZzs;
        Iterator it;
        String strZza;
        zzic zzicVar4 = this.zzu;
        zzicVar4.zzaW().zzk().zzc("sdkVersion bundled with app, dynamiteVersion", Long.valueOf(this.zzh), Long.valueOf(this.zzg));
        String packageName = zzicVar4.zzaZ().getPackageName();
        PackageManager packageManager = zzicVar4.zzaZ().getPackageManager();
        String str2 = "";
        int i10 = Integer.MIN_VALUE;
        String str3 = "Unknown";
        String installerPackageName = "unknown";
        try {
            if (packageManager != null) {
                try {
                    installerPackageName = packageManager.getInstallerPackageName(packageName);
                } catch (IllegalArgumentException unused) {
                    this.zzu.zzaW().zzb().zzb("Error retrieving app installer package name. appId", zzgu.zzl(packageName));
                }
                if (installerPackageName == null) {
                    installerPackageName = "manual_install";
                } else if ("com.android.vending".equals(installerPackageName)) {
                    installerPackageName = "";
                }
                try {
                    PackageInfo packageInfo = packageManager.getPackageInfo(this.zzu.zzaZ().getPackageName(), 0);
                    if (packageInfo != null) {
                        CharSequence applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                        string = !TextUtils.isEmpty(applicationLabel) ? applicationLabel.toString() : "Unknown";
                        try {
                            str3 = packageInfo.versionName;
                            i10 = packageInfo.versionCode;
                        } catch (PackageManager.NameNotFoundException unused2) {
                            str = str3;
                            str3 = string;
                            this.zzu.zzaW().zzb().zzc("Error retrieving package info. appId, appName", zzgu.zzl(packageName), str3);
                            string = str3;
                            str3 = str;
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused3) {
                    str = "Unknown";
                }
                this.zza = packageName;
                this.zzd = installerPackageName;
                this.zzb = str3;
                this.zzc = i10;
                this.zze = string;
                this.zzf = 0L;
                zzicVar = this.zzu;
                iZzC = zzicVar.zzC();
                if (iZzC != 0) {
                    this.zzu.zzaW().zzk().zza("App measurement collection enabled");
                } else if (iZzC != 1) {
                    this.zzu.zzaW().zzi().zza("App measurement deactivated via the manifest");
                } else if (iZzC != 3) {
                    this.zzu.zzaW().zzi().zza("App measurement disabled by setAnalyticsCollectionEnabled(false)");
                } else if (iZzC != 4) {
                    this.zzu.zzaW().zzi().zza("App measurement disabled via the manifest");
                } else if (iZzC != 6) {
                    this.zzu.zzaW().zzh().zza("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
                } else if (iZzC != 7) {
                    this.zzu.zzaW().zzi().zza("App measurement disabled via the global data collection setting");
                } else if (iZzC != 8) {
                    zzic zzicVar5 = this.zzu;
                    zzicVar5.zzaW().zzi().zza("App measurement disabled");
                    zzicVar5.zzaW().zzc().zza("Invalid scion state in identity");
                } else {
                    this.zzu.zzaW().zzi().zza("App measurement disabled due to denied storage consent");
                }
                this.zzm = "";
                zzicVar2 = this.zzu;
                zzicVar2.zzaV();
                strZza = this.zzk;
                if (!TextUtils.isEmpty(strZza)) {
                    strZza = zzlt.zza(zzicVar2.zzaZ(), "google_app_id", zzicVar.zzq());
                }
                if (TextUtils.isEmpty(strZza)) {
                    str2 = strZza;
                }
                this.zzm = str2;
                if (iZzC == 0) {
                    zzicVar2.zzaW().zzk().zzc("App measurement enabled for app package, google app id", this.zza, this.zzm);
                }
                this.zzi = null;
                zzicVar3 = this.zzu;
                zzicVar3.zzaV();
                listZzs = zzicVar3.zzc().zzs("analytics.safelisted_events");
                if (listZzs != null) {
                    this.zzi = listZzs;
                    break;
                } else if (listZzs.isEmpty()) {
                    it = listZzs.iterator();
                    do {
                        if (it.hasNext()) {
                            this.zzi = listZzs;
                            break;
                        }
                    } while (zzicVar3.zzk().zzl("safelisted event", (String) it.next()));
                } else {
                    zzicVar3.zzaW().zzh().zza("Safelisted event list is empty. Ignoring");
                }
                if (packageManager != null) {
                    this.zzl = InstantApps.isInstantApp(zzicVar3.zzaZ()) ? 1 : 0;
                } else {
                    this.zzl = 0;
                }
            }
            zzicVar4.zzaW().zzb().zzb("PackageManager is null, app identity information might be inaccurate. appId", zzgu.zzl(packageName));
            strZza = this.zzk;
            if (!TextUtils.isEmpty(strZza)) {
                strZza = zzlt.zza(zzicVar2.zzaZ(), "google_app_id", zzicVar.zzq());
            }
            if (TextUtils.isEmpty(strZza)) {
                str2 = strZza;
            }
            this.zzm = str2;
            if (iZzC == 0) {
                zzicVar2.zzaW().zzk().zzc("App measurement enabled for app package, google app id", this.zza, this.zzm);
            }
        } catch (IllegalStateException e10) {
            this.zzu.zzaW().zzb().zzc("Fetching Google App Id failed with exception. appId", zzgu.zzl(packageName), e10);
        }
        string = "Unknown";
        this.zza = packageName;
        this.zzd = installerPackageName;
        this.zzb = str3;
        this.zzc = i10;
        this.zze = string;
        this.zzf = 0L;
        zzicVar = this.zzu;
        iZzC = zzicVar.zzC();
        if (iZzC != 0) {
            this.zzu.zzaW().zzk().zza("App measurement collection enabled");
        } else if (iZzC != 1) {
            this.zzu.zzaW().zzi().zza("App measurement deactivated via the manifest");
        } else if (iZzC != 3) {
            this.zzu.zzaW().zzi().zza("App measurement disabled by setAnalyticsCollectionEnabled(false)");
        } else if (iZzC != 4) {
            this.zzu.zzaW().zzi().zza("App measurement disabled via the manifest");
        } else if (iZzC != 6) {
            this.zzu.zzaW().zzh().zza("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
        } else if (iZzC != 7) {
            this.zzu.zzaW().zzi().zza("App measurement disabled via the global data collection setting");
        } else if (iZzC != 8) {
            zzic zzicVar6 = this.zzu;
            zzicVar6.zzaW().zzi().zza("App measurement disabled");
            zzicVar6.zzaW().zzc().zza("Invalid scion state in identity");
        } else {
            this.zzu.zzaW().zzi().zza("App measurement disabled due to denied storage consent");
        }
        this.zzm = "";
        zzicVar2 = this.zzu;
        zzicVar2.zzaV();
        this.zzi = null;
        zzicVar3 = this.zzu;
        zzicVar3.zzaV();
        listZzs = zzicVar3.zzc().zzs("analytics.safelisted_events");
        if (listZzs != null) {
            this.zzi = listZzs;
            break;
        } else if (listZzs.isEmpty()) {
            it = listZzs.iterator();
            do {
                if (it.hasNext()) {
                    this.zzi = listZzs;
                    break;
                }
            } while (zzicVar3.zzk().zzl("safelisted event", (String) it.next()));
        } else {
            zzicVar3.zzaW().zzh().zza("Safelisted event list is empty. Ignoring");
        }
        if (packageManager != null) {
            this.zzl = InstantApps.isInstantApp(zzicVar3.zzaZ()) ? 1 : 0;
        } else {
            this.zzl = 0;
        }
    }

    final void zzi() {
        String str;
        zzg();
        zzic zzicVar = this.zzu;
        if (zzicVar.zzd().zzl().zzo(zzjk.ANALYTICS_STORAGE)) {
            byte[] bArr = new byte[16];
            zzicVar.zzk().zzf().nextBytes(bArr);
            str = String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        } else {
            zzicVar.zzaW().zzj().zza("Analytics Storage consent is not granted");
            str = null;
        }
        zzicVar.zzaW().zzj().zza(String.format("Resetting session stitching token to %s", str == null ? "null" : "not null"));
        this.zzn = str;
        this.zzo = zzicVar.zzba().currentTimeMillis();
    }

    final String zzj() {
        zzb();
        Preconditions.checkNotNull(this.zza);
        return this.zza;
    }

    final String zzk() {
        zzg();
        zzb();
        Preconditions.checkNotNull(this.zzm);
        return this.zzm;
    }

    final String zzl() {
        zzb();
        Preconditions.checkNotNull(this.zze);
        return this.zze;
    }

    final int zzm() {
        zzb();
        return this.zzc;
    }

    final long zzn() {
        return this.zzh;
    }

    final int zzo() {
        zzb();
        return this.zzl;
    }

    final List zzp() {
        return this.zzi;
    }

    final boolean zzq(String str) {
        String str2 = this.zzp;
        boolean z10 = false;
        if (str2 != null && !str2.equals(str)) {
            z10 = true;
        }
        this.zzp = str;
        return z10;
    }

    final zzr zzh(String str) {
        long j10;
        String str2;
        String str3;
        boolean z10;
        int i10;
        int i11;
        long j11;
        long j12;
        int i12;
        zzg();
        String strZzj = zzj();
        String strZzk = zzk();
        zzb();
        String str4 = this.zzb;
        zzb();
        long j13 = this.zzc;
        zzb();
        Preconditions.checkNotNull(this.zzd);
        String str5 = this.zzd;
        zzic zzicVar = this.zzu;
        zzicVar.zzc().zzi();
        zzb();
        zzg();
        long j14 = this.zzf;
        if (j14 == 0) {
            zzpp zzppVarZzk = this.zzu.zzk();
            Context contextZzaZ = zzicVar.zzaZ();
            String packageName = zzicVar.zzaZ().getPackageName();
            zzppVarZzk.zzg();
            Preconditions.checkNotNull(contextZzaZ);
            Preconditions.checkNotEmpty(packageName);
            PackageManager packageManager = contextZzaZ.getPackageManager();
            MessageDigest messageDigestZzQ = zzpp.zzQ();
            long jZzR = -1;
            if (messageDigestZzQ == null) {
                zzppVarZzk.zzu.zzaW().zzb().zza("Could not get MD5 instance");
                j10 = 0;
            } else {
                if (packageManager != null) {
                    try {
                        if (zzppVarZzk.zzag(contextZzaZ, packageName)) {
                            j10 = 0;
                            jZzR = 0;
                        } else {
                            PackageManagerWrapper packageManagerWrapperPackageManager = Wrappers.packageManager(contextZzaZ);
                            zzic zzicVar2 = zzppVarZzk.zzu;
                            j10 = 0;
                            try {
                                Signature[] signatureArr = packageManagerWrapperPackageManager.getPackageInfo(zzicVar2.zzaZ().getPackageName(), 64).signatures;
                                if (signatureArr == null || signatureArr.length <= 0) {
                                    zzicVar2.zzaW().zze().zza("Could not get signatures");
                                } else {
                                    jZzR = zzpp.zzR(messageDigestZzQ.digest(signatureArr[0].toByteArray()));
                                }
                            } catch (PackageManager.NameNotFoundException e10) {
                                e = e10;
                                zzppVarZzk.zzu.zzaW().zzb().zzb("Package name not found", e);
                                j14 = j10;
                            }
                        }
                    } catch (PackageManager.NameNotFoundException e11) {
                        e = e11;
                        j10 = 0;
                    }
                } else {
                    j10 = 0;
                }
                j14 = j10;
                this.zzf = j14;
            }
            j14 = jZzR;
            this.zzf = j14;
        } else {
            j10 = 0;
        }
        long j15 = j14;
        zzic zzicVar3 = this.zzu;
        boolean zZzB = zzicVar3.zzB();
        boolean z11 = !zzicVar3.zzd().zzm;
        zzg();
        if (zzicVar3.zzB()) {
            zzaja.zza();
            if (zzicVar3.zzc().zzp(null, zzfy.zzaH)) {
                this.zzu.zzaW().zzk().zza("Disabled IID for tests.");
            } else {
                try {
                    Class<?> clsLoadClass = zzicVar3.zzaZ().getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                    if (clsLoadClass != null) {
                        try {
                            Object objInvoke = clsLoadClass.getDeclaredMethod("getInstance", Context.class).invoke(null, this.zzu.zzaZ());
                            if (objInvoke != null) {
                                try {
                                    str2 = (String) clsLoadClass.getDeclaredMethod("getFirebaseInstanceId", null).invoke(objInvoke, null);
                                } catch (Exception unused) {
                                    this.zzu.zzaW().zzh().zza("Failed to retrieve Firebase Instance Id");
                                    str2 = null;
                                }
                            }
                        } catch (Exception unused2) {
                            this.zzu.zzaW().zzf().zza("Failed to obtain Firebase Analytics instance");
                        }
                    }
                } catch (ClassNotFoundException unused3) {
                }
            }
            str2 = null;
        } else {
            str2 = null;
        }
        zzic zzicVar4 = this.zzu;
        long jZza = zzicVar4.zzd().zzc.zza();
        long jMin = jZza == j10 ? zzicVar4.zza : Math.min(zzicVar4.zza, jZza);
        zzb();
        int i13 = this.zzl;
        zzic zzicVar5 = this.zzu;
        boolean zZzu = zzicVar5.zzc().zzu();
        zzhh zzhhVarZzd = zzicVar5.zzd();
        zzhhVarZzd.zzg();
        String str6 = str2;
        boolean z12 = zzhhVarZzd.zzd().getBoolean(qEagQqzJZsd.szdWZgiePWCKDj, false);
        boolean z13 = zzicVar5.zzc().zzw("google_analytics_default_allow_ad_personalization_signals", true) != zzji.GRANTED;
        long j16 = this.zzg;
        Boolean boolValueOf = Boolean.valueOf(z13);
        List list = this.zzi;
        String strZzl = zzicVar5.zzd().zzl().zzl();
        if (this.zzj == null) {
            this.zzj = zzicVar5.zzk().zzaz();
        }
        String str7 = this.zzj;
        if (zzicVar5.zzd().zzl().zzo(zzjk.ANALYTICS_STORAGE)) {
            zzg();
            if (this.zzo != j10) {
                long jCurrentTimeMillis = zzicVar5.zzba().currentTimeMillis() - this.zzo;
                if (this.zzn != null && jCurrentTimeMillis > b.TWENTY_FOUR_HOURS_MILLIS && this.zzp == null) {
                    zzi();
                }
            }
            if (this.zzn == null) {
                zzi();
            }
            str3 = this.zzn;
        } else {
            str3 = null;
        }
        boolean zZzx = zzicVar5.zzc().zzx();
        zzpp zzppVarZzk2 = zzicVar5.zzk();
        String strZzj2 = zzj();
        String str8 = str3;
        zzic zzicVar6 = zzppVarZzk2.zzu;
        if (zzicVar6.zzaZ().getPackageManager() == null) {
            z10 = zZzx;
            j11 = j10;
        } else {
            try {
                z10 = zZzx;
                i10 = 0;
                try {
                    ApplicationInfo applicationInfo = Wrappers.packageManager(zzicVar6.zzaZ()).getApplicationInfo(strZzj2, 0);
                    i11 = applicationInfo != null ? applicationInfo.targetSdkVersion : i10;
                } catch (PackageManager.NameNotFoundException unused4) {
                    zzic zzicVar7 = zzppVarZzk2.zzu;
                    zzicVar7.zzaV();
                    zzicVar7.zzaW().zzi().zzb("PackageManager failed to find running app: app_id", strZzj2);
                }
            } catch (PackageManager.NameNotFoundException unused5) {
                z10 = zZzx;
                i10 = 0;
            }
            j11 = i11;
        }
        zzic zzicVar8 = this.zzu;
        int iZzb = zzicVar8.zzd().zzl().zzb();
        String strZze = zzicVar8.zzd().zzj().zze();
        zzaif.zza();
        zzal zzalVarZzc = zzicVar8.zzc();
        zzfx zzfxVar = zzfy.zzaP;
        long j17 = j11;
        int iZzW = zzalVarZzc.zzp(null, zzfxVar) ? zzicVar8.zzk().zzW() : 0;
        zzaif.zza();
        long jZzX = zzicVar8.zzc().zzp(null, zzfxVar) ? zzicVar8.zzk().zzX() : j10;
        String strZzz = zzicVar8.zzc().zzz();
        int i14 = iZzW;
        String strZzb = new zze(zzicVar8.zzc().zzw("google_analytics_default_allow_ad_personalization_signals", true)).zzb();
        zzic zzicVar9 = this.zzu;
        long j18 = zzicVar9.zza;
        int iZza = zzicVar9.zzx().zzj().zza();
        if (zzicVar8.zzc().zzp(null, zzfy.zzbe)) {
            j12 = zzicVar9.zzb;
            i12 = i14;
        } else {
            j12 = j10;
            i12 = i14;
        }
        return new zzr(strZzj, strZzk, str4, j13, str5, 161000L, j15, str, zZzB, z11, str6, jMin, i13, zZzu, z12, boolValueOf, j16, list, strZzl, str7, str8, z10, j17, iZzb, strZze, i12, jZzX, strZzz, strZzb, j18, iZza, j12);
    }
}
