package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class a1 implements l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n0 f3499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f3500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object[] f3501c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f3502d;

    a1(n0 n0Var, String str, Object[] objArr) {
        this.f3499a = n0Var;
        this.f3500b = str;
        this.f3501c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f3502d = cCharAt;
            return;
        }
        int i10 = cCharAt & 8191;
        int i11 = 13;
        int i12 = 1;
        while (true) {
            int i13 = i12 + 1;
            char cCharAt2 = str.charAt(i12);
            if (cCharAt2 < 55296) {
                this.f3502d = i10 | (cCharAt2 << i11);
                return;
            } else {
                i10 |= (cCharAt2 & 8191) << i11;
                i11 += 13;
                i12 = i13;
            }
        }
    }

    Object[] a() {
        return this.f3501c;
    }

    String b() {
        return this.f3500b;
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public n0 getDefaultInstance() {
        return this.f3499a;
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public x0 getSyntax() {
        int i10 = this.f3502d;
        if ((i10 & 1) != 0) {
            return x0.PROTO2;
        }
        return (i10 & 4) == 4 ? x0.EDITIONS : x0.PROTO3;
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public boolean isMessageSetWireFormat() {
        return (this.f3502d & 2) == 2;
    }
}
