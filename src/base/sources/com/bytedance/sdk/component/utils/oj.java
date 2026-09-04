package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class oj {
    public static boolean aq(Context context) {
        if (context == null) {
            return false;
        }
        int iQor = qor(context);
        return iQor == 2 || iQor == 3 || iQor == 4 || iQor == 5 || iQor == 6;
    }

    public static boolean dkl(Context context) {
        return qor(context) == 6;
    }

    public static String dse(Context context) {
        int iQor = qor(context);
        if (iQor == 2) {
            return "2g";
        }
        if (iQor == 3) {
            return "3g";
        }
        if (iQor == 4) {
            return "wifi";
        }
        if (iQor != 5) {
            return iQor != 6 ? "mobile" : "5g";
        }
        return "4g";
    }

    public static boolean gjv(Context context) {
        return qor(context) == 4;
    }

    public static int hn(Context context) {
        int iQor = qor(context);
        if (iQor == 1) {
            return 0;
        }
        if (iQor == 4) {
            return 1;
        }
        if (iQor == 5) {
            return 4;
        }
        if (iQor != 6) {
            return iQor;
        }
        return 6;
    }

    public static boolean hnj(Context context) {
        return qor(context) != 0;
    }

    public static int qor(Context context) {
        return tgn.hnj(context, ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
    }

    public static boolean sk(Context context) {
        return qor(context) == 5;
    }

    public static boolean hnj(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith("http://") || str.startsWith("https://");
    }
}
