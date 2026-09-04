package qp;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
class g implements op.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Class f50964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f50965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f50966c;

    g(Class cls, String str, int i10) {
        this.f50964a = cls;
        this.f50965b = str;
        this.f50966c = i10;
    }

    public String a() {
        return this.f50965b;
    }

    public int b() {
        return this.f50966c;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(a());
        stringBuffer.append(":");
        stringBuffer.append(b());
        return stringBuffer.toString();
    }
}
