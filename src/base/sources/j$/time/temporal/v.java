package j$.time.temporal;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class v implements Serializable {
    private static final long serialVersionUID = -7317881728594519368L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f41809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f41810b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f41811c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f41812d;

    public static v f(long j10, long j11) {
        if (j10 > j11) {
            throw new IllegalArgumentException("Minimum value must be less than maximum value");
        }
        return new v(j10, j10, j11, j11);
    }

    public static v g(long j10, long j11) {
        if (j10 > j11) {
            throw new IllegalArgumentException("Smallest maximum value must be less than largest maximum value");
        }
        if (1 > j11) {
            throw new IllegalArgumentException("Minimum value must be less than maximum value");
        }
        return new v(1L, 1L, j10, j11);
    }

    public v(long j10, long j11, long j12, long j13) {
        this.f41809a = j10;
        this.f41810b = j11;
        this.f41811c = j12;
        this.f41812d = j13;
    }

    public final boolean d() {
        return this.f41809a >= -2147483648L && this.f41812d <= 2147483647L;
    }

    public final boolean e(long j10) {
        return j10 >= this.f41809a && j10 <= this.f41812d;
    }

    public final int a(long j10, r rVar) {
        if (d() && e(j10)) {
            return (int) j10;
        }
        throw new j$.time.c(c(j10, rVar));
    }

    public final void b(long j10, r rVar) {
        if (!e(j10)) {
            throw new j$.time.c(c(j10, rVar));
        }
    }

    public final String c(long j10, r rVar) {
        if (rVar != null) {
            return "Invalid value for " + rVar + " (valid values " + this + "): " + j10;
        }
        return "Invalid value (valid values " + this + "): " + j10;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        long j10 = this.f41809a;
        long j11 = this.f41810b;
        if (j10 > j11) {
            throw new InvalidObjectException("Smallest minimum value must be less than largest minimum value");
        }
        long j12 = this.f41811c;
        long j13 = this.f41812d;
        if (j12 > j13) {
            throw new InvalidObjectException("Smallest maximum value must be less than largest maximum value");
        }
        if (j11 > j13) {
            throw new InvalidObjectException("Minimum value must be less than maximum value");
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v) {
            v vVar = (v) obj;
            if (this.f41809a == vVar.f41809a && this.f41810b == vVar.f41810b && this.f41811c == vVar.f41811c && this.f41812d == vVar.f41812d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f41809a;
        long j11 = this.f41810b;
        long j12 = j10 + (j11 << 16) + (j11 >> 48);
        long j13 = this.f41811c;
        long j14 = j12 + (j13 << 32) + (j13 >> 32);
        long j15 = this.f41812d;
        long j16 = j14 + (j15 << 48) + (j15 >> 16);
        return (int) (j16 ^ (j16 >>> 32));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f41809a);
        if (this.f41809a != this.f41810b) {
            sb2.append('/');
            sb2.append(this.f41810b);
        }
        sb2.append(" - ");
        sb2.append(this.f41811c);
        if (this.f41811c != this.f41812d) {
            sb2.append('/');
            sb2.append(this.f41812d);
        }
        return sb2.toString();
    }
}
