package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import vl.Rlkc.CIdIVqKnNZ;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public abstract class Wc {
    public static final String a(String str, Uc nativeBeaconModel, Map extraMacros) {
        kotlin.jvm.internal.s.h(str, "<this>");
        kotlin.jvm.internal.s.h(nativeBeaconModel, "nativeBeaconModel");
        kotlin.jvm.internal.s.h(extraMacros, "extraMacros");
        String strI = bm.r.I(bm.r.I(bm.r.I(str, "$TS", String.valueOf(System.currentTimeMillis()), false, 4, null), "$LTS", String.valueOf(nativeBeaconModel.f25829a.f26293g), false, 4, null), "$STS", String.valueOf(nativeBeaconModel.f25829a.f26290d), false, 4, null);
        SecureRandom secureRandom = new SecureRandom();
        StringBuilder sb2 = new StringBuilder();
        int iNextInt = 0;
        while (iNextInt == 0) {
            iNextInt = (secureRandom.nextInt() & Integer.MAX_VALUE) % 10;
        }
        sb2.append(iNextInt);
        for (int i10 = 1; i10 < 8; i10++) {
            sb2.append((secureRandom.nextInt() & Integer.MAX_VALUE) % 10);
        }
        String string = sb2.toString();
        kotlin.jvm.internal.s.g(string, "toString(...)");
        String strI2 = bm.r.I(strI, "[CACHEBUSTING]", string, false, 4, null);
        String str2 = nativeBeaconModel.f25830b;
        if (str2 != null) {
            strI2 = bm.r.I(strI2, CIdIVqKnNZ.HnNHbPW, str2, false, 4, null);
        }
        String strI3 = strI2;
        String str3 = nativeBeaconModel.f25831c;
        if (str3 != null) {
            strI3 = bm.r.I(strI3, "[ADSERVINGID]", str3, false, 4, null);
        }
        String strI4 = strI3;
        String str4 = nativeBeaconModel.f25832d;
        if (str4 != null) {
            strI4 = bm.r.I(strI4, "[ASSETURI]", str4, false, 4, null);
        }
        int i11 = nativeBeaconModel.f25833e;
        kotlin.jvm.internal.o0 o0Var = kotlin.jvm.internal.o0.f43602a;
        Locale locale = Locale.US;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long j10 = i11;
        String str5 = String.format(locale, "%02d:%02d:%02d.%03d", Arrays.copyOf(new Object[]{Long.valueOf(timeUnit.toHours(j10)), Long.valueOf(timeUnit.toMinutes(j10) - TimeUnit.HOURS.toMinutes(timeUnit.toHours(j10))), Long.valueOf(timeUnit.toSeconds(j10) - TimeUnit.MINUTES.toSeconds(timeUnit.toMinutes(j10))), Long.valueOf(j10 - (timeUnit.toSeconds(j10) * ((long) 1000)))}, 4));
        kotlin.jvm.internal.s.g(str5, "format(...)");
        String strI5 = bm.r.I(strI4, "[CONTENTPLAYHEAD]", str5, false, 4, null);
        String strI6 = strI5;
        for (Map.Entry entry : extraMacros.entrySet()) {
            strI6 = bm.r.I(strI6, (String) entry.getKey(), (String) entry.getValue(), false, 4, null);
        }
        return strI6;
    }

    public static final boolean a(C2874c0 c2874c0) {
        kotlin.jvm.internal.s.h(c2874c0, "<this>");
        C3136m4 c3136m4 = AbstractC2878c4.f26300a;
        kotlin.jvm.internal.s.h(AdConfig.class, "clazz");
        return !((AdConfig) AbstractC2878c4.f26300a.a(AdConfig.class)).getNative().getInteraction().getBlockBeaconsOnExpiry() || c2874c0.f26294h <= 0 || System.currentTimeMillis() < c2874c0.f26294h;
    }
}
