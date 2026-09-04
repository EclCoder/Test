package com.inmobi.media;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class L3 {
    public static final Object a(tl.a block) {
        kotlin.jvm.internal.s.h(block, "block");
        try {
            fl.r.a aVar = fl.r.f38769b;
            return fl.r.b(block.invoke());
        } catch (Error e10) {
            fl.r.a aVar2 = fl.r.f38769b;
            return fl.r.b(fl.s.a(e10));
        } catch (Exception e11) {
            fl.r.a aVar3 = fl.r.f38769b;
            return fl.r.b(fl.s.a(e11));
        }
    }

    public static final String a(String url, Map macros) {
        kotlin.jvm.internal.s.h(url, "url");
        kotlin.jvm.internal.s.h(macros, "macros");
        String strI = url;
        for (Map.Entry entry : macros.entrySet()) {
            strI = bm.r.I(strI, (String) entry.getKey(), (String) entry.getValue(), false, 4, null);
        }
        return strI;
    }
}
