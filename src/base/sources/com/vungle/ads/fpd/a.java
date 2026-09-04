package com.vungle.ads.fpd;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public enum a {
    AGE_18_20(1, new yl.f(18, 20)),
    AGE_21_30(2, new yl.f(21, 30)),
    AGE_31_40(3, new yl.f(31, 40)),
    AGE_41_50(4, new yl.f(41, 50)),
    AGE_51_60(5, new yl.f(51, 60)),
    AGE_61_70(6, new yl.f(61, 70)),
    AGE_71_75(7, new yl.f(71, 75)),
    OTHERS(0, new yl.f(Integer.MIN_VALUE, Integer.MAX_VALUE));

    public static final C0490a Companion = new C0490a(null);

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final int f35794id;
    private final yl.f range;

    /* JADX INFO: renamed from: com.vungle.ads.fpd.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class C0490a {
        public /* synthetic */ C0490a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0021  */
        /* JADX WARN: Code duplicated, block: B:13:0x0024 A[RETURN] */
        public final a fromAge$vungle_ads_release(int i10) {
            for (a aVar : a.values()) {
                yl.f range = aVar.getRange();
                int iA = range.a();
                if (i10 <= range.b() && iA <= i10) {
                    if (aVar == null) {
                        return a.OTHERS;
                    }
                    return aVar;
                }
            }
            aVar = null;
            if (aVar == null) {
                return a.OTHERS;
            }
            return aVar;
        }

        private C0490a() {
        }
    }

    a(int i10, yl.f fVar) {
        this.f35794id = i10;
        this.range = fVar;
    }

    public final int getId() {
        return this.f35794id;
    }

    public final yl.f getRange() {
        return this.range;
    }
}
