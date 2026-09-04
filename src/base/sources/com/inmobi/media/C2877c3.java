package com.inmobi.media;

import com.inmobi.media.C2877c3;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.inmobi.media.c3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C2877c3 extends AbstractC2979g2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uc f26297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f26298c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f26299d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2877c3(final Uc vastBeaconDataModel) {
        super(new tl.a() { // from class: yh.f7
            @Override // tl.a
            public final Object invoke() {
                return Boolean.valueOf(C2877c3.a(vastBeaconDataModel));
            }
        });
        kotlin.jvm.internal.s.h(vastBeaconDataModel, "vastBeaconDataModel");
        this.f26297b = vastBeaconDataModel;
        this.f26298c = new AtomicBoolean(false);
        this.f26299d = new AtomicBoolean(false);
    }

    public static final boolean a(Uc uc2) {
        return Wc.a(uc2.f25829a);
    }

    @Override // com.inmobi.media.AbstractC2979g2
    public final void b(D2 beaconExtras) {
        kotlin.jvm.internal.s.h(beaconExtras, "beaconExtras");
        Wo wo2 = beaconExtras instanceof Wo ? (Wo) beaconExtras : null;
        if (wo2 == null) {
            return;
        }
        Map map = wo2.f25984a;
        List list = wo2.f25985b;
        String str = (String) map.get("[EVENTTYPE]");
        if (str == null) {
            return;
        }
        if (kotlin.jvm.internal.s.c(str, "1") || bm.r.R(str, "companion", true)) {
            if (!this.f26299d.compareAndSet(false, true)) {
                return;
            }
        } else if (!this.f26298c.compareAndSet(false, true)) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String url = Wc.a((String) it.next(), this.f26297b, map);
            A3 a10 = A3.f24440a;
            kotlin.jvm.internal.s.h(url, "url");
            A3.a(url, false, null);
        }
    }
}
