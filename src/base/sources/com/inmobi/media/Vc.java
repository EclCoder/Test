package com.inmobi.media;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Vc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uc f25892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Tc f25893b;

    public Vc(Bl bl2, C2874c0 adLifecycleData, Ji responseBeaconData) {
        kotlin.jvm.internal.s.h(adLifecycleData, "adLifecycleData");
        kotlin.jvm.internal.s.h(responseBeaconData, "responseBeaconData");
        ArrayList arrayList = null;
        this.f25892a = new Uc(adLifecycleData, bl2 != null ? bl2.f24562a : null, bl2 != null ? bl2.f24563b : null, 24);
        if (bl2 != null) {
            ArrayList arrayList2 = bl2.f24565d;
            arrayList = new ArrayList();
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                String type = ((De) obj).f24653b;
                kotlin.jvm.internal.s.h(type, "type");
                if (kotlin.jvm.internal.s.c(type, "Impression")) {
                    arrayList.add(obj);
                }
            }
        }
        this.f25893b = new Tc(this.f25892a, new Xc(responseBeaconData, arrayList));
    }

    public final void a(short s10, List trackers) {
        kotlin.jvm.internal.s.h(trackers, "trackers");
        this.f25893b.f25747c.a(new Wo(gl.l0.f(fl.w.a("[EVENTTYPE]", String.valueOf((int) s10))), trackers));
    }
}
