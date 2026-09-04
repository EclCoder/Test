package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class apu {
    private static final Map<Integer, hnj<?, ?>> hnj = new ConcurrentHashMap();

    private static hnj<?, ?> hn(Context context, int i10) {
        if (i10 == 7) {
            return new uua(context);
        }
        if (i10 == 8) {
            return new dse(context);
        }
        throw new IllegalArgumentException("Unsupported ad type: ".concat(String.valueOf(i10)));
    }

    public static hnj<?, ?> hnj(Context context, int i10) {
        hnj<?, ?> hnjVarHn;
        Map<Integer, hnj<?, ?>> map = hnj;
        hnj<?, ?> hnjVar = map.get(Integer.valueOf(i10));
        if (hnjVar != null) {
            return hnjVar;
        }
        synchronized (apu.class) {
            try {
                hnjVarHn = map.get(Integer.valueOf(i10));
                if (hnjVarHn == null) {
                    hnjVarHn = hn(context, i10);
                    map.put(Integer.valueOf(i10), hnjVarHn);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return hnjVarHn;
    }
}
