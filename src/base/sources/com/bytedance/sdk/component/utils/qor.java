package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.content.pm.Signature;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.foundation.tools.SameMD5;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class qor {
    private static HashMap<String, ArrayList<String>> hnj = new HashMap<>();

    private static Signature[] hn(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 64).signatures;
        } catch (Exception unused) {
            return null;
        }
    }

    public static ArrayList<String> hnj(Context context, String str) {
        ArrayList<String> arrayList = null;
        if (context != null && str != null) {
            String packageName = context.getPackageName();
            if (packageName == null) {
                return null;
            }
            if (hnj.get(str) != null) {
                return hnj.get(str);
            }
            arrayList = new ArrayList<>();
            try {
                for (Signature signature : hn(context, packageName)) {
                    String strHnj = "error!";
                    if (SameMD5.TAG.equals(str)) {
                        strHnj = hnj(signature, SameMD5.TAG);
                    } else if ("SHA1".equals(str)) {
                        strHnj = hnj(signature, "SHA1");
                    } else if ("SHA256".equals(str)) {
                        strHnj = hnj(signature, "SHA256");
                    }
                    arrayList.add(strHnj);
                }
            } catch (Exception unused) {
            }
            hnj.put(str, arrayList);
        }
        return arrayList;
    }

    public static String hnj(Context context) {
        StringBuilder sb2 = new StringBuilder();
        ArrayList<String> arrayListHnj = hnj(context, "SHA1");
        if (arrayListHnj != null && arrayListHnj.size() != 0) {
            for (int i10 = 0; i10 < arrayListHnj.size(); i10++) {
                sb2.append(arrayListHnj.get(i10));
                if (i10 < arrayListHnj.size() - 1) {
                    sb2.append(",");
                }
            }
        }
        return sb2.toString();
    }

    private static String hnj(Signature signature, String str) {
        byte[] byteArray = signature.toByteArray();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            if (messageDigest != null) {
                byte[] bArrDigest = messageDigest.digest(byteArray);
                StringBuilder sb2 = new StringBuilder();
                for (byte b10 : bArrDigest) {
                    sb2.append(Integer.toHexString((b10 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | 256).substring(1, 3).toUpperCase());
                    sb2.append(":");
                }
                return sb2.substring(0, sb2.length() - 1).toString();
            }
            return "error!";
        } catch (Exception unused) {
            return "error!";
        }
    }
}
