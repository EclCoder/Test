package qp;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
abstract class a extends d implements np.b {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    Class[] f50934k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    String[] f50935l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    Class[] f50936m;

    a(int i10, String str, Class cls, Class[] clsArr, String[] strArr, Class[] clsArr2) {
        super(i10, str, cls);
        this.f50934k = clsArr;
        this.f50935l = strArr;
        this.f50936m = clsArr2;
    }

    public Class[] l() {
        if (this.f50936m == null) {
            this.f50936m = e(5);
        }
        return this.f50936m;
    }

    public Class[] m() {
        if (this.f50934k == null) {
            this.f50934k = e(3);
        }
        return this.f50934k;
    }
}
