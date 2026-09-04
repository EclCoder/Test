package com.inmobi.media;

import com.inmobi.media.R5;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class R5 extends AbstractC2979g2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uc f25583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C2947em f25584c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C3306sj f25585d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicInteger f25586e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R5(final Uc nativeBeaconMacroData, C2947em nativeBeaconTrackerData, C3306sj progressReceivedBeacons, C3306sj progressTriggeredBeacons) {
        super(new tl.a() { // from class: yh.v3
            @Override // tl.a
            public final Object invoke() {
                return Boolean.valueOf(R5.a(nativeBeaconMacroData));
            }
        });
        kotlin.jvm.internal.s.h(nativeBeaconMacroData, "nativeBeaconMacroData");
        kotlin.jvm.internal.s.h(nativeBeaconTrackerData, "nativeBeaconTrackerData");
        kotlin.jvm.internal.s.h(progressReceivedBeacons, "progressReceivedBeacons");
        kotlin.jvm.internal.s.h(progressTriggeredBeacons, "progressTriggeredBeacons");
        this.f25583b = nativeBeaconMacroData;
        this.f25584c = nativeBeaconTrackerData;
        this.f25585d = progressTriggeredBeacons;
        this.f25586e = new AtomicInteger(-1);
        if (nativeBeaconTrackerData.f26518c.isEmpty()) {
            return;
        }
        progressReceivedBeacons.a(C2863bf.f26261a);
    }

    public static final boolean a(Uc uc2) {
        return Wc.a(uc2.f25829a);
    }

    @Override // com.inmobi.media.AbstractC2979g2
    public final void b(D2 beaconExtras) {
        kotlin.jvm.internal.s.h(beaconExtras, "beaconExtras");
        int i10 = this.f25583b.f25833e;
        int i11 = this.f25586e.get();
        if (i10 <= this.f25586e.getAndSet(i10)) {
            return;
        }
        ArrayList arrayList = this.f25584c.f26518c;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            int i13 = i11 + 1;
            int i14 = ((Q5) obj).f25536a;
            if (i13 <= i14 && i14 <= i10) {
                arrayList2.add(obj);
            }
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        this.f25585d.a(C2863bf.f26261a);
        int size2 = arrayList2.size();
        int i15 = 0;
        while (i15 < size2) {
            Object obj2 = arrayList2.get(i15);
            i15++;
            String url = Wc.a(((Q5) obj2).f25537b, this.f25583b, gl.l0.h());
            A3 a10 = A3.f24440a;
            kotlin.jvm.internal.s.h(url, "url");
            A3.a(url, false, null);
        }
    }
}
