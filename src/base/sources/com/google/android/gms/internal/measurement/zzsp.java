package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import sc.i;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzsp {
    private static final Pattern zza = Pattern.compile("(\\w+).*");

    public static String zza(String str) {
        Matcher matcher = zza.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        throw new IllegalArgumentException("Invalid fragment spec: ".concat(String.valueOf(str)));
    }

    public static String zzb(List list) {
        if (list.isEmpty()) {
            return null;
        }
        return "transform=".concat(String.valueOf(i.g("+").d(list)));
    }
}
