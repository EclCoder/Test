package com.google.android.gms.common.logging;

import android.util.Log;
import com.google.android.gms.common.internal.GmsLogger;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class Logger {
    private final String zza;
    private final String zzb;
    private final GmsLogger zzc;
    private final int zzd;

    public Logger(String str, String... strArr) {
        String string;
        if (strArr.length == 0) {
            string = "";
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('[');
            for (String str2 : strArr) {
                if (sb2.length() > 1) {
                    sb2.append(",");
                }
                sb2.append(str2);
            }
            sb2.append("] ");
            string = sb2.toString();
        }
        this.zzb = string;
        this.zza = str;
        this.zzc = new GmsLogger(str);
        int i10 = 2;
        while (i10 <= 7 && !Log.isLoggable(this.zza, i10)) {
            i10++;
        }
        this.zzd = i10;
    }

    public void d(String str, Object... objArr) {
        if (isLoggable(3)) {
            Log.d(this.zza, format(str, objArr));
        }
    }

    public void e(String str, Throwable th2, Object... objArr) {
        Log.e(this.zza, format(str, objArr), th2);
    }

    protected String format(String str, Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return this.zzb.concat(str);
    }

    public String getTag() {
        return this.zza;
    }

    public void i(String str, Object... objArr) {
        Log.i(this.zza, format(str, objArr));
    }

    public boolean isLoggable(int i10) {
        return this.zzd <= i10;
    }

    public void v(String str, Throwable th2, Object... objArr) {
        if (isLoggable(2)) {
            Log.v(this.zza, format(str, objArr), th2);
        }
    }

    public void w(String str, Object... objArr) {
        Log.w(this.zza, format(str, objArr));
    }

    public void wtf(String str, Throwable th2, Object... objArr) {
        Log.wtf(this.zza, format(str, objArr), th2);
    }

    public void e(String str, Object... objArr) {
        Log.e(this.zza, format(str, objArr));
    }

    public void wtf(Throwable th2) {
        Log.wtf(this.zza, th2);
    }

    public void v(String str, Object... objArr) {
        if (isLoggable(2)) {
            Log.v(this.zza, format(str, objArr));
        }
    }
}
