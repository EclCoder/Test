package u;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
class g implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object[] f53683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f53684b;

    g(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f53683a = new Object[i10];
    }

    @Override // u.f
    public boolean a(Object obj) {
        int i10 = this.f53684b;
        Object[] objArr = this.f53683a;
        if (i10 >= objArr.length) {
            return false;
        }
        objArr[i10] = obj;
        this.f53684b = i10 + 1;
        return true;
    }

    @Override // u.f
    public Object b() {
        int i10 = this.f53684b;
        if (i10 <= 0) {
            return null;
        }
        int i11 = i10 - 1;
        Object[] objArr = this.f53683a;
        Object obj = objArr[i11];
        objArr[i11] = null;
        this.f53684b = i10 - 1;
        return obj;
    }

    @Override // u.f
    public void c(Object[] objArr, int i10) {
        if (i10 > objArr.length) {
            i10 = objArr.length;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            Object obj = objArr[i11];
            int i12 = this.f53684b;
            Object[] objArr2 = this.f53683a;
            if (i12 < objArr2.length) {
                objArr2[i12] = obj;
                this.f53684b = i12 + 1;
            }
        }
    }
}
