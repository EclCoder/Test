package com.inmobi.media;

import android.webkit.URLUtil;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class Fl {
    public static final boolean a(String str) {
        if (str == null || bm.r.S(bm.r.V0(str).toString(), ' ', false, 2, null)) {
            return false;
        }
        return URLUtil.isHttpsUrl(str) || URLUtil.isHttpUrl(str);
    }

    public static final String b(String str) {
        if (str == null) {
            return "";
        }
        int length = str.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean z11 = kotlin.jvm.internal.s.i(str.charAt(!z10 ? i10 : length), 32) <= 0;
            if (z10) {
                if (!z11) {
                    break;
                }
                length--;
            } else if (z11) {
                i10++;
            } else {
                z10 = true;
            }
        }
        String string = str.subSequence(i10, length + 1).toString();
        return string == null ? "" : string;
    }
}
