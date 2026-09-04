package cm;

import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
abstract class e {
    public static final double a(double d10, d sourceUnit, d targetUnit) {
        s.h(sourceUnit, "sourceUnit");
        s.h(targetUnit, "targetUnit");
        long jConvert = targetUnit.g().convert(1L, sourceUnit.g());
        return jConvert > 0 ? d10 * jConvert : d10 / sourceUnit.g().convert(1L, targetUnit.g());
    }

    public static final long b(long j10, d sourceUnit, d targetUnit) {
        s.h(sourceUnit, "sourceUnit");
        s.h(targetUnit, "targetUnit");
        return targetUnit.g().convert(j10, sourceUnit.g());
    }

    public static final long c(long j10, d sourceUnit, d targetUnit) {
        s.h(sourceUnit, "sourceUnit");
        s.h(targetUnit, "targetUnit");
        return targetUnit.g().convert(j10, sourceUnit.g());
    }
}
