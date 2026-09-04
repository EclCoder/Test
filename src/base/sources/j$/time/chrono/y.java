package j$.time.chrono;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class y implements m, Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final y f41664d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final y[] f41665e;
    private static final long serialVersionUID = 1466499369062886794L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient int f41666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final transient j$.time.i f41667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient String f41668c;

    static {
        y yVar = new y(-1, j$.time.i.b0(1868, 1, 1), "Meiji");
        f41664d = yVar;
        f41665e = new y[]{yVar, new y(0, j$.time.i.b0(1912, 7, 30), "Taisho"), new y(1, j$.time.i.b0(1926, 12, 25), "Showa"), new y(2, j$.time.i.b0(1989, 1, 8), "Heisei"), new y(3, j$.time.i.b0(2019, 5, 1), "Reiwa")};
    }

    public final y q() {
        y[] yVarArr = f41665e;
        if (this == yVarArr[yVarArr.length - 1]) {
            return null;
        }
        return r(this.f41666a + 1);
    }

    public y(int i10, j$.time.i iVar, String str) {
        this.f41666a = i10;
        this.f41667b = iVar;
        this.f41668c = str;
    }

    public static y r(int i10) {
        int i11 = i10 + 1;
        if (i11 >= 0) {
            y[] yVarArr = f41665e;
            if (i11 < yVarArr.length) {
                return yVarArr[i11];
            }
        }
        throw new j$.time.c("Invalid era: " + i10);
    }

    public static y p(j$.time.i iVar) {
        if (iVar.X(x.f41660d)) {
            throw new j$.time.c("JapaneseDate before Meiji 6 are not supported");
        }
        for (int length = f41665e.length - 1; length >= 0; length--) {
            y yVar = f41665e[length];
            if (iVar.compareTo(yVar.f41667b) >= 0) {
                return yVar;
            }
        }
        return null;
    }

    @Override // j$.time.chrono.m
    public final int getValue() {
        return this.f41666a;
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.v l(j$.time.temporal.r rVar) {
        j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
        if (rVar == aVar) {
            return v.f41658c.y(aVar);
        }
        return super.l(rVar);
    }

    public final String toString() {
        return this.f41668c;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new e0((byte) 5, this);
    }
}
