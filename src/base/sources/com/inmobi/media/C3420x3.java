package com.inmobi.media;

import java.util.LinkedHashMap;

/* JADX INFO: renamed from: com.inmobi.media.x3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3420x3 implements InterfaceC3213p3 {
    @Override // com.inmobi.media.InterfaceC3213p3
    public final void a(V2 click) {
        kotlin.jvm.internal.s.h(click, "click");
        A3 a10 = A3.f24440a;
        kotlin.jvm.internal.s.g("A3", "access$getTAG$p(...)");
        String str = click.f25870b;
        LinkedHashMap linkedHashMap = A3.f24449j;
        C2822a0 c2822a0 = (C2822a0) linkedHashMap.get(Integer.valueOf(click.f25869a));
        if (c2822a0 != null) {
            kotlin.jvm.internal.s.h(click, "click");
            c2822a0.f26163a.a(c2822a0.f26164b);
        }
        linkedHashMap.remove(Integer.valueOf(click.f25869a));
        em.j.b(null, new C3394w3(click, null), 1, null);
    }

    @Override // com.inmobi.media.InterfaceC3213p3
    public final void a(V2 click, EnumC2931e6 errorCode) {
        kotlin.jvm.internal.s.h(click, "click");
        kotlin.jvm.internal.s.h(errorCode, "errorCode");
        A3 a10 = A3.f24440a;
        kotlin.jvm.internal.s.g("A3", "access$getTAG$p(...)");
        String str = click.f25870b;
        if (click.f25874f == 0) {
            A3.a(click, errorCode.name());
        }
        A3.b(click);
        A3.f();
    }
}
