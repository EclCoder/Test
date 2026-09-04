package com.inmobi.media;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class El {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final G f24733a;

    public El(G adContext) {
        kotlin.jvm.internal.s.h(adContext, "adContext");
        this.f24733a = adContext;
    }

    public static void a(HashMap macros, List nativeTrackers, C3348u9 c3348u9) {
        kotlin.jvm.internal.s.h(macros, "macros");
        kotlin.jvm.internal.s.h(nativeTrackers, "nativeTrackers");
        ArrayList arrayList = new ArrayList();
        for (Object obj : nativeTrackers) {
            if (kotlin.jvm.internal.s.c(((De) obj).f24653b, "error")) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(gl.r.v(arrayList, 10));
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj2 = arrayList.get(i11);
            i11++;
            String str = ((De) obj2).f24652a;
            kotlin.jvm.internal.s.h(str, "<this>");
            kotlin.jvm.internal.s.h(macros, "macros");
            String strI = str;
            for (Map.Entry entry : macros.entrySet()) {
                strI = bm.r.I(strI, (String) entry.getKey(), (String) entry.getValue(), false, 4, null);
            }
            arrayList2.add(strI);
        }
        int size2 = arrayList2.size();
        while (i10 < size2) {
            Object obj3 = arrayList2.get(i10);
            i10++;
            String url = (String) obj3;
            A3 a10 = A3.f24440a;
            Jg priority = Jg.REGULAR;
            kotlin.jvm.internal.s.h(url, "url");
            kotlin.jvm.internal.s.h(priority, "priority");
            Mg.a(priority, new C3264r3(url, c3348u9, null));
        }
    }
}
