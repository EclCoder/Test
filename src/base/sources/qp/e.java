package qp;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
class e extends a implements op.a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Class f50952n;

    e(int i10, String str, Class cls, Class[] clsArr, String[] strArr, Class[] clsArr2, Class cls2) {
        super(i10, str, cls, clsArr, strArr, clsArr2);
        this.f50952n = cls2;
    }

    @Override // qp.f
    protected String a(h hVar) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(hVar.e(i()));
        if (hVar.f50971b) {
            stringBuffer.append(hVar.g(n()));
        }
        if (hVar.f50971b) {
            stringBuffer.append(" ");
        }
        stringBuffer.append(hVar.f(f(), g()));
        stringBuffer.append(".");
        stringBuffer.append(j());
        hVar.a(stringBuffer, m());
        hVar.b(stringBuffer, l());
        return stringBuffer.toString();
    }

    public Class n() {
        if (this.f50952n == null) {
            this.f50952n = d(6);
        }
        return this.f50952n;
    }
}
