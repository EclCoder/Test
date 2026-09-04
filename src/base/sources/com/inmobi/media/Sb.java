package com.inmobi.media;

import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class Sb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static byte f25685a;

    public static final void a(byte b10, String tag, String str) {
        kotlin.jvm.internal.s.h(tag, "tag");
        if (str == null) {
            return;
        }
        if (b10 == 1) {
            byte b11 = f25685a;
            if (2 == b11 || 1 == b11 || 3 == b11) {
                Log.e("[InMobi]", str);
                return;
            }
            return;
        }
        if (b10 != 2) {
            if (b10 == 3) {
                a(tag, str);
            }
        } else {
            byte b12 = f25685a;
            if (2 == b12 || 3 == b12) {
                Log.d("[InMobi]", str);
            }
        }
    }

    public static void a(String str, String str2) {
        if (str2.length() > 4000) {
            String strSubstring = str2.substring(0, 4000);
            kotlin.jvm.internal.s.g(strSubstring, "substring(...)");
            Log.d(str, strSubstring);
            String strSubstring2 = str2.substring(4000);
            kotlin.jvm.internal.s.g(strSubstring2, "substring(...)");
            a(str, strSubstring2);
            return;
        }
        Log.d(str, str2);
    }
}
