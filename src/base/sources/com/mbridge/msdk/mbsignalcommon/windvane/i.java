package com.mbridge.msdk.mbsignalcommon.windvane;

import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String[] f31732a = {"wv_hybrid:", "mraid:", "ssp:", "mvb_hybrid:"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f31733b = Pattern.compile("hybrid://(.+?):(.+?)/(.+?)(\\?(.*?))?");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pattern f31734c = Pattern.compile("mraid://(.+?):(.+?)/(.+?)(\\?(.*?))?");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Pattern f31735d = Pattern.compile("ssp://(.+?):(.+?)/(.+?)(\\?(.*?))?");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Pattern f31736e = Pattern.compile("mv://(.+?):(.+?)/(.+?)(\\?(.*?))?");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static Map<String, String> f31737f = new HashMap();

    static {
        for (d dVar : d.values()) {
            f31737f.put(dVar.h(), dVar.g());
        }
    }

    public static String a(String str) {
        char[] cArr = {'\'', '\\'};
        StringBuffer stringBuffer = new StringBuffer(1000);
        stringBuffer.setLength(0);
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt <= 255) {
                int i11 = 0;
                while (true) {
                    if (i11 >= 2) {
                        stringBuffer.append(cCharAt);
                        break;
                    }
                    if (cArr[i11] == cCharAt) {
                        stringBuffer.append("\\" + cCharAt);
                        break;
                    }
                    i11++;
                }
            } else {
                stringBuffer.append("\\u");
                String upperCase = Integer.toHexString(cCharAt >>> '\b').toUpperCase();
                if (upperCase.length() == 1) {
                    stringBuffer.append(MBridgeConstans.ENDCARD_URL_TYPE_PL);
                }
                stringBuffer.append(upperCase);
                String upperCase2 = Integer.toHexString(cCharAt & 255).toUpperCase();
                if (upperCase2.length() == 1) {
                    stringBuffer.append(MBridgeConstans.ENDCARD_URL_TYPE_PL);
                }
                stringBuffer.append(upperCase2);
            }
        }
        return new String(stringBuffer);
    }

    public static String b(String str) {
        String str2 = f31737f.get(d(str));
        return str2 == null ? "" : str2;
    }

    public static Pattern c(String str) {
        if ("wv_hybrid:".equals(str)) {
            return f31736e;
        }
        if ("mraid:".equals(str)) {
            return f31734c;
        }
        if ("ssp:".equals(str)) {
            return f31735d;
        }
        if ("mvb_hybrid:".equals(str)) {
            return f31736e;
        }
        return null;
    }

    public static String d(String str) {
        String path;
        int iLastIndexOf;
        return (TextUtils.isEmpty(str) || (path = Uri.parse(str).getPath()) == null || (iLastIndexOf = path.lastIndexOf(".")) == -1) ? "" : path.substring(iLastIndexOf + 1);
    }

    public static boolean e(String str) {
        return b(str).startsWith("image");
    }

    public static boolean f(String str) {
        for (String str2 : f31732a) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }
}
