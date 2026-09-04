package j$.time.format;

/* JADX INFO: loaded from: classes3.dex */
public final class m implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41709a;

    public m(String str) {
        this.f41709a = str;
    }

    @Override // j$.time.format.e
    public final boolean s(r rVar, StringBuilder sb2) {
        sb2.append(this.f41709a);
        return true;
    }

    @Override // j$.time.format.e
    public final int A(p pVar, CharSequence charSequence, int i10) {
        if (i10 > charSequence.length() || i10 < 0) {
            throw new IndexOutOfBoundsException();
        }
        String str = this.f41709a;
        return !pVar.g(charSequence, i10, str, 0, str.length()) ? ~i10 : str.length() + i10;
    }

    public final String toString() {
        return "'" + this.f41709a.replace("'", "''") + "'";
    }
}
