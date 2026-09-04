package df;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private cf.b f36730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private cf.a f36731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private cf.c f36732c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f36733d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private b f36734e;

    public static boolean b(int i10) {
        return i10 >= 0 && i10 < 8;
    }

    public b a() {
        return this.f36734e;
    }

    public void c(cf.a aVar) {
        this.f36731b = aVar;
    }

    public void d(int i10) {
        this.f36733d = i10;
    }

    public void e(b bVar) {
        this.f36734e = bVar;
    }

    public void f(cf.b bVar) {
        this.f36730a = bVar;
    }

    public void g(cf.c cVar) {
        this.f36732c = cVar;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(200);
        sb2.append("<<\n");
        sb2.append(" mode: ");
        sb2.append(this.f36730a);
        sb2.append("\n ecLevel: ");
        sb2.append(this.f36731b);
        sb2.append("\n version: ");
        sb2.append(this.f36732c);
        sb2.append("\n maskPattern: ");
        sb2.append(this.f36733d);
        if (this.f36734e == null) {
            sb2.append("\n matrix: null\n");
        } else {
            sb2.append("\n matrix:\n");
            sb2.append(this.f36734e);
        }
        sb2.append(">>\n");
        return sb2.toString();
    }
}
