package j$.time.temporal;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class p implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f41801b;

    public /* synthetic */ p(int i10, int i11) {
        this.f41800a = i11;
        this.f41801b = i10;
    }

    @Override // j$.time.temporal.o
    public final m e(m mVar) {
        switch (this.f41800a) {
            case 0:
                int iG = mVar.g(a.DAY_OF_WEEK);
                int i10 = this.f41801b;
                if (iG == i10) {
                    return mVar;
                }
                int i11 = iG - i10;
                return mVar.d(i11 >= 0 ? 7 - i11 : -i11, b.DAYS);
            default:
                int iG2 = mVar.g(a.DAY_OF_WEEK);
                int i12 = this.f41801b;
                if (iG2 == i12) {
                    return mVar;
                }
                int i13 = i12 - iG2;
                return mVar.a(i13 >= 0 ? 7 - i13 : -i13, b.DAYS);
        }
    }
}
