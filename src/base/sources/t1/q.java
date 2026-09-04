package t1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f52806c = w1.c0.s0(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f52807d = w1.c0.s0(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f52808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f52809b;

    public q(String str, String str2) {
        this.f52808a = w1.c0.G0(str);
        this.f52809b = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            q qVar = (q) obj;
            if (w1.c0.c(this.f52808a, qVar.f52808a) && w1.c0.c(this.f52809b, qVar.f52809b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = this.f52809b.hashCode() * 31;
        String str = this.f52808a;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
