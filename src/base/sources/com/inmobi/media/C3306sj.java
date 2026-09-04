package com.inmobi.media;

import com.inmobi.media.C3306sj;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.inmobi.media.sj, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3306sj extends AbstractC2979g2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uc f27473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tl.a f27474c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f27475d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3306sj(final Uc vastBeaconDataModel, tl.a getBeacons) {
        super(new tl.a() { // from class: yh.dc
            @Override // tl.a
            public final Object invoke() {
                return Boolean.valueOf(C3306sj.a(vastBeaconDataModel));
            }
        });
        kotlin.jvm.internal.s.h(vastBeaconDataModel, "vastBeaconDataModel");
        kotlin.jvm.internal.s.h(getBeacons, "getBeacons");
        this.f27473b = vastBeaconDataModel;
        this.f27474c = getBeacons;
        this.f27475d = new AtomicBoolean(false);
    }

    public static final boolean a(Uc uc2) {
        return Wc.a(uc2.f25829a);
    }

    @Override // com.inmobi.media.AbstractC2979g2
    public final void b(D2 beaconExtras) {
        kotlin.jvm.internal.s.h(beaconExtras, "beaconExtras");
        if (this.f27475d.getAndSet(true)) {
            return;
        }
        boolean z10 = beaconExtras instanceof Wo;
        Map mapH = z10 ? ((Wo) beaconExtras).f25984a : gl.l0.h();
        List listS0 = gl.r.s0((Collection) this.f27474c.invoke(), z10 ? ((Wo) beaconExtras).f25985b : gl.r.l());
        if (listS0.isEmpty()) {
            return;
        }
        Iterator it = listS0.iterator();
        while (it.hasNext()) {
            String url = Wc.a((String) it.next(), this.f27473b, mapH);
            A3 a10 = A3.f24440a;
            kotlin.jvm.internal.s.h(url, "url");
            A3.a(url, false, null);
        }
    }
}
