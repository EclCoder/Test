package j$.time.chrono;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements j$.time.temporal.q, Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f41625e = 0;
    private static final long serialVersionUID = 57387258289L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f41626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f41627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f41628c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f41629d;

    static {
        j$.time.b.a(new Object[]{j$.time.temporal.b.YEARS, j$.time.temporal.b.MONTHS, j$.time.temporal.b.DAYS});
    }

    public h(l lVar, int i10, int i11, int i12) {
        this.f41626a = lVar;
        this.f41627b = i10;
        this.f41628c = i11;
        this.f41629d = i12;
    }

    public final String toString() {
        if (this.f41627b == 0 && this.f41628c == 0 && this.f41629d == 0) {
            return this.f41626a.toString() + " P0D";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f41626a.toString());
        sb2.append(" P");
        int i10 = this.f41627b;
        if (i10 != 0) {
            sb2.append(i10);
            sb2.append('Y');
        }
        int i11 = this.f41628c;
        if (i11 != 0) {
            sb2.append(i11);
            sb2.append('M');
        }
        int i12 = this.f41629d;
        if (i12 != 0) {
            sb2.append(i12);
            sb2.append('D');
        }
        return sb2.toString();
    }

    @Override // j$.time.temporal.q
    public final j$.time.temporal.m s(j$.time.temporal.m mVar) {
        l lVar = (l) mVar.b(j$.time.temporal.s.f41803b);
        if (lVar == null || this.f41626a.equals(lVar)) {
            if (this.f41628c != 0) {
                j$.time.temporal.v vVarY = this.f41626a.y(j$.time.temporal.a.MONTH_OF_YEAR);
                long j10 = (vVarY.f41809a == vVarY.f41810b && vVarY.f41811c == vVarY.f41812d && vVarY.d()) ? (vVarY.f41812d - vVarY.f41809a) + 1 : -1L;
                if (j10 > 0) {
                    mVar = mVar.d((((long) this.f41627b) * j10) + ((long) this.f41628c), j$.time.temporal.b.MONTHS);
                } else {
                    int i10 = this.f41627b;
                    if (i10 != 0) {
                        mVar = mVar.d(i10, j$.time.temporal.b.YEARS);
                    }
                    mVar = mVar.d(this.f41628c, j$.time.temporal.b.MONTHS);
                }
            } else {
                int i11 = this.f41627b;
                if (i11 != 0) {
                    mVar = mVar.d(i11, j$.time.temporal.b.YEARS);
                }
            }
            int i12 = this.f41629d;
            return i12 != 0 ? mVar.d(i12, j$.time.temporal.b.DAYS) : mVar;
        }
        throw new j$.time.c("Chronology mismatch, expected: " + this.f41626a.q() + ", actual: " + lVar.q());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (this.f41627b == hVar.f41627b && this.f41628c == hVar.f41628c && this.f41629d == hVar.f41629d && this.f41626a.equals(hVar.f41626a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (Integer.rotateLeft(this.f41629d, 16) + (Integer.rotateLeft(this.f41628c, 8) + this.f41627b)) ^ this.f41626a.hashCode();
    }

    public Object writeReplace() {
        return new e0((byte) 9, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
