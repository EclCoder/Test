package p4;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f49505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object[] f49506b;

    public a(String str, Object[] objArr) {
        this.f49505a = str;
        this.f49506b = objArr;
    }

    private static void b(d dVar, int i10, Object obj) {
        if (obj == null) {
            dVar.E0(i10);
            return;
        }
        if (obj instanceof byte[]) {
            dVar.u0(i10, (byte[]) obj);
            return;
        }
        if (obj instanceof Float) {
            dVar.e(i10, ((Float) obj).floatValue());
            return;
        }
        if (obj instanceof Double) {
            dVar.e(i10, ((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof Long) {
            dVar.s0(i10, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof Integer) {
            dVar.s0(i10, ((Integer) obj).intValue());
            return;
        }
        if (obj instanceof Short) {
            dVar.s0(i10, ((Short) obj).shortValue());
            return;
        }
        if (obj instanceof Byte) {
            dVar.s0(i10, ((Byte) obj).byteValue());
            return;
        }
        if (obj instanceof String) {
            dVar.h0(i10, (String) obj);
            return;
        }
        if (obj instanceof Boolean) {
            dVar.s0(i10, ((Boolean) obj).booleanValue() ? 1L : 0L);
            return;
        }
        throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i10 + " Supported types: null, byte[], float, double, long, int, short, byte, string");
    }

    public static void c(d dVar, Object[] objArr) {
        if (objArr == null) {
            return;
        }
        int length = objArr.length;
        int i10 = 0;
        while (i10 < length) {
            Object obj = objArr[i10];
            i10++;
            b(dVar, i10, obj);
        }
    }

    @Override // p4.e
    public void a(d dVar) {
        c(dVar, this.f49506b);
    }

    @Override // p4.e
    public String d() {
        return this.f49505a;
    }

    public a(String str) {
        this(str, null);
    }
}
