package com.inmobi.media;

import com.inmobi.media.Gc;
import f8.Ygx.FuoITeVPeXAj;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public final class Gc extends AbstractC2979g2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uc f24850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tl.a f24851c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Gc(final Uc nativeBeaconMacroData, tl.a getBeacons) {
        super(new tl.a() { // from class: yh.r1
            @Override // tl.a
            public final Object invoke() {
                return Boolean.valueOf(Gc.a(nativeBeaconMacroData));
            }
        });
        kotlin.jvm.internal.s.h(nativeBeaconMacroData, "nativeBeaconMacroData");
        kotlin.jvm.internal.s.h(getBeacons, "getBeacons");
        this.f24850b = nativeBeaconMacroData;
        this.f24851c = getBeacons;
    }

    public static final boolean a(Uc uc2) {
        return Wc.a(uc2.f25829a);
    }

    @Override // com.inmobi.media.AbstractC2979g2
    public final void b(D2 beaconExtras) {
        kotlin.jvm.internal.s.h(beaconExtras, "beaconExtras");
        boolean z10 = beaconExtras instanceof Wo;
        List listS0 = gl.r.s0((Collection) this.f24851c.invoke(), z10 ? ((Wo) beaconExtras).f25985b : gl.r.l());
        if (listS0.isEmpty()) {
            return;
        }
        Map mapH = z10 ? ((Wo) beaconExtras).f25984a : gl.l0.h();
        Iterator it = listS0.iterator();
        while (it.hasNext()) {
            String strA = Wc.a((String) it.next(), this.f24850b, mapH);
            A3 a10 = A3.f24440a;
            kotlin.jvm.internal.s.h(strA, FuoITeVPeXAj.svIPCXICK);
            A3.a(strA, false, null);
        }
    }
}
