package sd;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f52364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d[] f52365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f52366c;

    public a(int i10, d... dVarArr) {
        this.f52364a = i10;
        this.f52365b = dVarArr;
        this.f52366c = new b(i10);
    }

    @Override // sd.d
    public StackTraceElement[] a(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= this.f52364a) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArrA = stackTraceElementArr;
        for (d dVar : this.f52365b) {
            if (stackTraceElementArrA.length <= this.f52364a) {
                break;
            }
            stackTraceElementArrA = dVar.a(stackTraceElementArr);
        }
        return stackTraceElementArrA.length > this.f52364a ? this.f52366c.a(stackTraceElementArrA) : stackTraceElementArrA;
    }
}
