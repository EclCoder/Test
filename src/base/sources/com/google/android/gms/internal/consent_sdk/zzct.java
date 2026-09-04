package com.google.android.gms.internal.consent_sdk;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import com.googlecode.mp4parser.boxes.microsoft.lIu.trPLwhKZgZ;
import com.mbridge.msdk.foundation.tools.SameMD5;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzct {
    private static String zza;

    private static String zzb(String str) {
        for (int i10 = 0; i10 < 3; i10++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
                messageDigest.update(str.getBytes());
                return String.format("%032X", new BigInteger(1, messageDigest.digest()));
            } catch (ArithmeticException unused) {
                return "";
            } catch (NoSuchAlgorithmException unused2) {
            }
        }
        return "";
    }

    public static synchronized String zza(Context context) {
        try {
            if (zza == null) {
                ContentResolver contentResolver = context.getContentResolver();
                String string = contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id");
                if (string == null || zzdb.zza(true)) {
                    string = trPLwhKZgZ.Pwo;
                }
                zza = zzb(string);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return zza;
    }
}
