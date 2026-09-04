package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.wrappers.Wrappers;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbzy implements zzcaa {
    public static zzcaa zza;
    static zzcaa zzb;
    static zzcaa zzc;
    static Boolean zzd;
    private static final Object zze = new Object();
    private final Object zzf;
    private final Context zzg;
    private final WeakHashMap zzh;
    private final ExecutorService zzi;
    private final VersionInfoParcel zzj;
    private final PackageInfo zzk;
    private final String zzl;
    private final String zzm;
    private final AtomicBoolean zzn;
    private boolean zzo;
    private Set zzp;

    /* JADX WARN: Code duplicated, block: B:11:0x0050  */
    protected zzbzy(Context context, VersionInfoParcel versionInfoParcel) {
        PackageInfo packageInfo;
        String country;
        this.zzf = new Object();
        this.zzh = new WeakHashMap();
        zzgal.zza();
        this.zzi = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());
        this.zzn = new AtomicBoolean();
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zzg = context;
        this.zzj = versionInfoParcel;
        String string = null;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zziV)).booleanValue()) {
            Handler handler = com.google.android.gms.ads.internal.util.client.zzf.zza;
            if (context == null || context.getApplicationInfo() == null) {
                packageInfo = null;
            } else {
                try {
                    packageInfo = Wrappers.packageManager(context).getPackageInfo(context.getApplicationInfo().packageName, 0);
                } catch (PackageManager.NameNotFoundException unused) {
                    packageInfo = null;
                }
            }
        } else {
            packageInfo = null;
        }
        this.zzk = packageInfo;
        zzbih zzbihVar = zzbiq.zziI;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbihVar)).booleanValue()) {
            Handler handler2 = com.google.android.gms.ads.internal.util.client.zzf.zza;
            country = Locale.getDefault().getCountry();
        } else {
            country = "unknown";
        }
        this.zzl = country;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbihVar)).booleanValue()) {
            Context context2 = this.zzg;
            Handler handler3 = com.google.android.gms.ads.internal.util.client.zzf.zza;
            if (context2 != null) {
                try {
                    PackageInfo packageInfo2 = Wrappers.packageManager(context2).getPackageInfo("com.android.vending", 128);
                    if (packageInfo2 != null) {
                        string = Integer.toString(packageInfo2.versionCode);
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                }
            }
        } else {
            string = "unknown";
        }
        this.zzm = string;
        if (((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zziE)).intValue() > 0) {
            this.zzp = new HashSet();
        }
    }

    public static zzcaa zza(Context context) {
        synchronized (zze) {
            try {
                if (zza == null) {
                    if (zzj(context)) {
                        zza = new zzbzy(context, VersionInfoParcel.forPackage());
                    } else {
                        zza = new zzbzz();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zza;
    }

    public static zzcaa zzb(Context context, VersionInfoParcel versionInfoParcel) {
        synchronized (zze) {
            try {
                if (zzc == null) {
                    boolean z10 = false;
                    if (((Boolean) zzbki.zzc.zze()).booleanValue()) {
                        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zziC)).booleanValue() || ((Boolean) zzbki.zza.zze()).booleanValue()) {
                            z10 = true;
                        }
                    }
                    if (zzj(context)) {
                        zzbzy zzbzyVar = new zzbzy(context, versionInfoParcel);
                        zzbzyVar.zzl();
                        zzbzyVar.zzk();
                        zzc = zzbzyVar;
                    } else if (!z10 || context == null) {
                        zzc = new zzbzz();
                    } else {
                        zzbzy zzbzyVar2 = new zzbzy(context, versionInfoParcel, true);
                        zzbzyVar2.zzl();
                        zzbzyVar2.zzk();
                        zzc = zzbzyVar2;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzc;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003b A[Catch: all -> 0x0039, TryCatch #0 {all -> 0x0039, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x0019, B:11:0x002d, B:14:0x003b, B:15:0x0042), top: B:20:0x0003 }] */
    public static zzcaa zzc(Context context) {
        synchronized (zze) {
            try {
                if (zzb == null) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zziD)).booleanValue()) {
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zziC)).booleanValue() || context == null) {
                            zzb = new zzbzz();
                        } else {
                            zzb = new zzbzy(context, VersionInfoParcel.forPackage());
                        }
                    } else {
                        zzb = new zzbzz();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzb;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0035 A[Catch: all -> 0x0033, TryCatch #0 {all -> 0x0033, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x0019, B:10:0x002b, B:13:0x0035, B:14:0x003c), top: B:19:0x0003 }] */
    public static zzcaa zzd(Context context, VersionInfoParcel versionInfoParcel) {
        synchronized (zze) {
            try {
                if (zzb == null) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zziD)).booleanValue()) {
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zziC)).booleanValue()) {
                            zzb = new zzbzz();
                        } else {
                            zzb = new zzbzy(context, versionInfoParcel);
                        }
                    } else {
                        zzb = new zzbzz();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzb;
    }

    public static String zze(Throwable th2) {
        StringWriter stringWriter = new StringWriter();
        th2.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static String zzf(Throwable th2) {
        return zzgua.zza(com.google.android.gms.ads.internal.util.client.zzf.zzh(zze(th2)));
    }

    private static boolean zzj(Context context) {
        if (context == null) {
            return false;
        }
        synchronized (zze) {
            try {
                if (zzd == null) {
                    zzd = Boolean.valueOf(com.google.android.gms.ads.internal.client.zzay.zzh().nextInt(100) < ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzoi)).intValue());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (zzd.booleanValue()) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zziC)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    private final void zzk() {
        Thread.setDefaultUncaughtExceptionHandler(new zzbzv(this, Thread.getDefaultUncaughtExceptionHandler()));
    }

    private final void zzl() {
        Thread thread = Looper.getMainLooper().getThread();
        if (thread == null) {
            return;
        }
        synchronized (this.zzf) {
            this.zzh.put(thread, Boolean.TRUE);
        }
        thread.setUncaughtExceptionHandler(new zzbzw(this, thread.getUncaughtExceptionHandler()));
    }

    protected final void zzg(Thread thread, Throwable th2) {
        if (th2 != null) {
            boolean zZzq = false;
            boolean zEquals = false;
            for (Throwable cause = th2; cause != null; cause = cause.getCause()) {
                for (StackTraceElement stackTraceElement : cause.getStackTrace()) {
                    zZzq |= com.google.android.gms.ads.internal.util.client.zzf.zzq(stackTraceElement.getClassName());
                    zEquals |= zzbzy.class.getName().equals(stackTraceElement.getClassName());
                }
            }
            int iIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zziE)).intValue();
            if (iIntValue > 0) {
                if (this.zzp.size() >= iIntValue) {
                    return;
                }
                String strZzf = zzf(th2);
                if (this.zzp.contains(strZzf)) {
                    return;
                } else {
                    this.zzp.add(strZzf);
                }
            }
            if (!zZzq || zEquals) {
                return;
            }
            if (!this.zzo) {
                zzh(th2, "");
            }
            if (this.zzn.getAndSet(true) || !((Boolean) zzbki.zzc.zze()).booleanValue()) {
                return;
            }
            zzbib.zzb(this.zzg);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcaa
    public final void zzh(Throwable th2, String str) {
        if (this.zzo) {
            return;
        }
        zzi(th2, str, 1.0f);
    }

    @Override // com.google.android.gms.internal.ads.zzcaa
    public final void zzi(Throwable th2, String str, float f10) {
        Throwable th3;
        boolean zIsCallerInstantApp;
        String packageName;
        PackageInfo packageInfo;
        ActivityManager.MemoryInfo memoryInfoZze;
        if (this.zzo) {
            return;
        }
        Handler handler = com.google.android.gms.ads.internal.util.client.zzf.zza;
        int i10 = 0;
        if (((Boolean) zzbkz.zze.zze()).booleanValue()) {
            th3 = th2;
        } else {
            LinkedList linkedList = new LinkedList();
            for (Throwable cause = th2; cause != null; cause = cause.getCause()) {
                linkedList.push(cause);
            }
            th3 = null;
            while (!linkedList.isEmpty()) {
                Throwable th4 = (Throwable) linkedList.pop();
                StackTraceElement[] stackTrace = th4.getStackTrace();
                boolean z10 = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzdf)).booleanValue() && stackTrace != null && stackTrace.length == 0 && com.google.android.gms.ads.internal.util.client.zzf.zzq(th4.getClass().getName());
                ArrayList arrayList = new ArrayList();
                arrayList.add(new StackTraceElement(th4.getClass().getName(), "<filtered>", "<filtered>", 1));
                for (StackTraceElement stackTraceElement : stackTrace) {
                    if (com.google.android.gms.ads.internal.util.client.zzf.zzq(stackTraceElement.getClassName())) {
                        arrayList.add(stackTraceElement);
                        z10 = true;
                    } else {
                        String className = stackTraceElement.getClassName();
                        if (!TextUtils.isEmpty(className) && (className.startsWith("android.") || className.startsWith("java."))) {
                            arrayList.add(stackTraceElement);
                        } else {
                            arrayList.add(new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1));
                        }
                    }
                }
                if (z10) {
                    th3 = th3 == null ? new Throwable(th4.getMessage()) : new Throwable(th4.getMessage(), th3);
                    th3.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
                }
            }
        }
        if (th3 != null) {
            String name = th2.getClass().getName();
            String strZze = zze(th2);
            String strZzf = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzkd)).booleanValue() ? zzf(th2) : "";
            double d10 = f10;
            double dRandom = Math.random();
            int i11 = f10 > 0.0f ? (int) (1.0f / f10) : 1;
            if (dRandom < d10) {
                ArrayList arrayList2 = new ArrayList();
                try {
                    zIsCallerInstantApp = Wrappers.packageManager(this.zzg).isCallerInstantApp();
                } catch (Throwable th5) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzg("Error fetching instant app info", th5);
                    zIsCallerInstantApp = false;
                }
                try {
                    packageName = this.zzg.getPackageName();
                } catch (Throwable unused) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Cannot obtain package name, proceeding.");
                    packageName = "unknown";
                }
                Uri.Builder builderAppendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("is_aia", Boolean.toString(zIsCallerInstantApp)).appendQueryParameter("id", "gmob-apps-report-exception").appendQueryParameter("os", Build.VERSION.RELEASE);
                int i12 = Build.VERSION.SDK_INT;
                Uri.Builder builderAppendQueryParameter2 = builderAppendQueryParameter.appendQueryParameter("api", String.valueOf(i12));
                String str2 = Build.MANUFACTURER;
                String string = Build.MODEL;
                if (!string.startsWith(str2)) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 1 + string.length());
                    sb2.append(str2);
                    sb2.append(" ");
                    sb2.append(string);
                    string = sb2.toString();
                }
                Uri.Builder builderAppendQueryParameter3 = builderAppendQueryParameter2.appendQueryParameter("device", string);
                VersionInfoParcel versionInfoParcel = this.zzj;
                Uri.Builder builderAppendQueryParameter4 = builderAppendQueryParameter3.appendQueryParameter("js", versionInfoParcel.afmaVersion).appendQueryParameter("appid", packageName).appendQueryParameter("exceptiontype", name).appendQueryParameter("stacktrace", strZze).appendQueryParameter("eids", TextUtils.join(",", com.google.android.gms.ads.internal.client.zzba.zzb().zze())).appendQueryParameter("exceptionkey", str).appendQueryParameter("cl", "885195211").appendQueryParameter(DownloadCommon.DOWNLOAD_REPORT_RETRY_COUNT, "dev").appendQueryParameter("sampling_rate", Integer.toString(i11)).appendQueryParameter("pb_tm", String.valueOf(zzbkz.zzc.zze()));
                Context context = this.zzg;
                Uri.Builder builderAppendQueryParameter5 = builderAppendQueryParameter4.appendQueryParameter("gmscv", String.valueOf(GoogleApiAvailabilityLight.getInstance().getApkVersion(context))).appendQueryParameter("lite", true != versionInfoParcel.isLiteSdk ? MBridgeConstans.ENDCARD_URL_TYPE_PL : "1");
                if (!TextUtils.isEmpty(strZzf)) {
                    builderAppendQueryParameter5.appendQueryParameter("hash", strZzf);
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zziJ)).booleanValue() && (memoryInfoZze = com.google.android.gms.ads.internal.util.client.zzf.zze(context)) != null) {
                    builderAppendQueryParameter5.appendQueryParameter("available_memory", Long.toString(memoryInfoZze.availMem));
                    builderAppendQueryParameter5.appendQueryParameter("total_memory", Long.toString(memoryInfoZze.totalMem));
                    builderAppendQueryParameter5.appendQueryParameter("is_low_memory", true != memoryInfoZze.lowMemory ? MBridgeConstans.ENDCARD_URL_TYPE_PL : "1");
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zziI)).booleanValue()) {
                    String str3 = this.zzl;
                    if (!TextUtils.isEmpty(str3)) {
                        builderAppendQueryParameter5.appendQueryParameter("countrycode", str3);
                    }
                    String str4 = this.zzm;
                    if (!TextUtils.isEmpty(str4)) {
                        builderAppendQueryParameter5.appendQueryParameter("psv", str4);
                    }
                    if (i12 >= 26) {
                        packageInfo = WebView.getCurrentWebViewPackage();
                    } else if (context == null) {
                        packageInfo = null;
                    } else {
                        try {
                            packageInfo = Wrappers.packageManager(context).getPackageInfo("com.android.webview", 128);
                        } catch (PackageManager.NameNotFoundException unused2) {
                            packageInfo = null;
                        }
                    }
                    if (packageInfo != null) {
                        builderAppendQueryParameter5.appendQueryParameter("wvvc", Integer.toString(packageInfo.versionCode));
                        builderAppendQueryParameter5.appendQueryParameter("wvvn", packageInfo.versionName);
                        builderAppendQueryParameter5.appendQueryParameter("wvpn", packageInfo.packageName);
                    }
                }
                PackageInfo packageInfo2 = this.zzk;
                if (packageInfo2 != null) {
                    builderAppendQueryParameter5.appendQueryParameter("appvc", String.valueOf(packageInfo2.versionCode));
                    builderAppendQueryParameter5.appendQueryParameter("appvn", packageInfo2.versionName);
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzmU)).booleanValue()) {
                    builderAppendQueryParameter5.appendQueryParameter("uev", zzgua.zza(com.google.android.gms.ads.internal.util.client.zzf.zzf(this.zzg)));
                }
                arrayList2.add(builderAppendQueryParameter5.toString());
                int size = arrayList2.size();
                while (i10 < size) {
                    Object obj = arrayList2.get(i10);
                    i10++;
                    final String str5 = (String) obj;
                    final com.google.android.gms.ads.internal.util.client.zzu zzuVar = new com.google.android.gms.ads.internal.util.client.zzu(this.zzg, null);
                    this.zzi.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbzx
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            zzuVar.zzc(str5, null);
                        }
                    });
                }
            }
        }
    }

    protected zzbzy(Context context, VersionInfoParcel versionInfoParcel, boolean z10) {
        this(context, versionInfoParcel);
        this.zzo = true;
    }
}
