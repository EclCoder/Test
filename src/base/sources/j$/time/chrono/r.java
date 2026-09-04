package j$.time.chrono;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class r implements m {
    public static final r AH;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ r[] f41654a;

    @Override // j$.time.chrono.m
    public final int getValue() {
        return 1;
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) f41654a.clone();
    }

    static {
        r rVar = new r("AH", 0);
        AH = rVar;
        f41654a = new r[]{rVar};
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.v l(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.a.ERA) {
            return j$.time.temporal.v.f(1L, 1L);
        }
        return super.l(rVar);
    }
}
