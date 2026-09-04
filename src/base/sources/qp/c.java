package qp;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
class c implements np.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Object f50944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f50945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object[] f50946c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    np.a.InterfaceC0736a f50947d;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class a implements np.a.InterfaceC0736a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f50948a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        np.b f50949b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        op.b f50950c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f50951d;

        public a(int i10, String str, np.b bVar, op.b bVar2) {
            this.f50948a = str;
            this.f50949b = bVar;
            this.f50950c = bVar2;
            this.f50951d = i10;
        }

        public String a() {
            return this.f50948a;
        }

        public np.b b() {
            return this.f50949b;
        }

        String c(h hVar) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(hVar.d(a()));
            stringBuffer.append("(");
            stringBuffer.append(((f) b()).k(hVar));
            stringBuffer.append(")");
            return stringBuffer.toString();
        }

        @Override // np.a.InterfaceC0736a
        public final String toString() {
            return c(h.f50968k);
        }
    }

    public c(np.a.InterfaceC0736a interfaceC0736a, Object obj, Object obj2, Object[] objArr) {
        this.f50947d = interfaceC0736a;
        this.f50944a = obj;
        this.f50945b = obj2;
        this.f50946c = objArr;
    }

    @Override // np.a
    public Object getTarget() {
        return this.f50945b;
    }

    public final String toString() {
        return this.f50947d.toString();
    }
}
