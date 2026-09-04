package com.inmobi.media;

import java.lang.reflect.Field;
import java.util.List;

/* JADX INFO: renamed from: com.inmobi.media.jn, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC3077jn {
    public static final void a(String str) {
        try {
            Class.forName("androidx.media3.exoplayer.q0");
            if (str == null || str.length() == 0) {
                return;
            }
            String str2 = null;
            try {
                int i10 = t1.s.f52952c;
                Field declaredField = t1.s.class.getDeclaredField("VERSION");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(null);
                String str3 = obj instanceof String ? (String) obj : null;
                if (str3 != null && !bm.r.h0(str3)) {
                    str2 = str3;
                }
            } catch (Throwable unused) {
            }
            if (str2 == null) {
                throw new Ag(8800);
            }
            C2841aj c2841ajB = b(str2);
            if (c2841ajB == null) {
                throw new Ag(8802);
            }
            C2841aj c2841ajB2 = b(str);
            if (c2841ajB2 == null) {
                throw new Ag(8803);
            }
            int i11 = c2841ajB.f26223a;
            int i12 = c2841ajB2.f26223a;
            if (i11 >= i12) {
                if (i11 != i12 || c2841ajB.f26224b > c2841ajB2.f26224b) {
                    throw new Ag(8804);
                }
            }
        } catch (ClassNotFoundException unused2) {
            throw new Ag(8800);
        }
    }

    public static final C2841aj b(String str) {
        List listF0 = bm.r.F0(str, new String[]{"."}, false, 3, 2, null);
        if (listF0.size() < 2) {
            return null;
        }
        int iC = c((String) listF0.get(0));
        int iC2 = c((String) listF0.get(1));
        int iC3 = listF0.size() >= 3 ? c((String) listF0.get(2)) : 0;
        if (iC < 0 || iC2 < 0) {
            return null;
        }
        return new C2841aj(iC, iC2, iC3);
    }

    public static final int c(String str) {
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!Character.isDigit(str.charAt(i10))) {
                str = str.substring(0, i10);
                kotlin.jvm.internal.s.g(str, "substring(...)");
                break;
            }
        }
        Integer numQ = bm.r.q(str);
        if (numQ != null) {
            return numQ.intValue();
        }
        return 0;
    }
}
