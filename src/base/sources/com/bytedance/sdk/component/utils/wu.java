package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import com.mbridge.msdk.mbnative.report.RN.lkCBSIFlvmyGX;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public final class wu {
    private static boolean dkl;
    private static String gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private static String f13007hn;
    private static Context hnj;
    private static Resources qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private static boolean f13008sk;

    public static int aq(Context context, String str) {
        return hnj(context, str, TtmlNode.ATTR_TTS_COLOR);
    }

    public static int dkl(Context context, String str) {
        return hnj(context, str, TtmlNode.TAG_STYLE);
    }

    public static int dse(Context context, String str) {
        return hn(context).getColor(aq(context, str));
    }

    private static String gjv(Context context) {
        if (gjv == null) {
            gjv = context.getPackageName();
        }
        return gjv;
    }

    public static int hn(Context context, String str) {
        return hnj(context, str, lkCBSIFlvmyGX.JDNyyMHqAJlEDvl);
    }

    public static void hnj(Context context) {
        hnj = context;
    }

    public static int ojm(Context context, String str) {
        return hnj(context, str, "anim");
    }

    public static Drawable qor(Context context, String str) {
        try {
            return hn(context).getDrawable(gjv(context, str));
        } catch (Exception unused) {
            return null;
        }
    }

    public static int sk(Context context, String str) {
        return hnj(context, str, "id");
    }

    public static Resources hn(Context context) {
        Resources resources = qor;
        if (resources == null) {
            resources = null;
        }
        Context context2 = hnj;
        if (context2 != null) {
            resources = context2.getResources();
        }
        return resources == null ? context.getResources() : resources;
    }

    public static void hnj(String str) {
        gjv = str;
    }

    private static int hnj(Context context, String str, String str2) {
        int identifier = hn(context).getIdentifier(str, str2, gjv(context));
        if (identifier != 0) {
            return identifier;
        }
        if (!f13008sk) {
            qor(context);
            return hn(context).getIdentifier(str, str2, gjv(context));
        }
        return context.getResources().getIdentifier(str, str2, gjv(context));
    }

    public static synchronized void qor(Context context) {
        try {
            if (TextUtils.isEmpty(f13007hn)) {
                return;
            }
            f13008sk = true;
        } catch (Throwable th2) {
            Log.e("ResourceHelp", "makePluginResources failed", th2);
        }
    }

    public static int gjv(Context context, String str) {
        try {
            return hnj(context, str, "drawable");
        } catch (Exception unused) {
            return 0;
        }
    }

    public static String hnj(Context context, String str) {
        return hn(context).getString(hn(context, str));
    }
}
