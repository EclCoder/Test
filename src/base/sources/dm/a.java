package dm;

import bm.r;
import fl.b0;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements Comparable, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0557a f36989c = new C0557a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final a f36990d = new a(0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f36991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f36992b;

    /* JADX INFO: renamed from: dm.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class C0557a {
        public /* synthetic */ C0557a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a(long j10, long j11) {
            return (j10 == 0 && j11 == 0) ? b() : new a(j10, j11, null);
        }

        public final a b() {
            return a.f36990d;
        }

        public final a c(String uuidString) {
            s.h(uuidString, "uuidString");
            int length = uuidString.length();
            if (length == 32) {
                return b.c(uuidString);
            }
            if (length == 36) {
                return b.d(uuidString);
            }
            throw new IllegalArgumentException("Expected either a 36-char string in the standard hex-and-dash UUID format or a 32-char hexadecimal string, but was \"" + c.h(uuidString, 64) + "\" of length " + uuidString.length());
        }

        private C0557a() {
        }
    }

    public /* synthetic */ a(long j10, long j11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11);
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        return b.b(this);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public int compareTo(a other) {
        s.h(other, "other");
        long j10 = this.f36991a;
        return j10 != other.f36991a ? Long.compare(b0.b(j10) ^ Long.MIN_VALUE, b0.b(other.f36991a) ^ Long.MIN_VALUE) : Long.compare(b0.b(this.f36992b) ^ Long.MIN_VALUE, b0.b(other.f36992b) ^ Long.MIN_VALUE);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f36991a == aVar.f36991a && this.f36992b == aVar.f36992b;
    }

    public final long g() {
        return this.f36992b;
    }

    public final long h() {
        return this.f36991a;
    }

    public int hashCode() {
        return Long.hashCode(this.f36991a ^ this.f36992b);
    }

    public final String i() {
        byte[] bArr = new byte[36];
        b.a(this.f36991a, bArr, 0, 0, 4);
        bArr[8] = 45;
        b.a(this.f36991a, bArr, 9, 4, 6);
        bArr[13] = 45;
        b.a(this.f36991a, bArr, 14, 6, 8);
        bArr[18] = 45;
        b.a(this.f36992b, bArr, 19, 0, 2);
        bArr[23] = 45;
        b.a(this.f36992b, bArr, 24, 2, 8);
        return r.w(bArr);
    }

    public String toString() {
        return i();
    }

    private a(long j10, long j11) {
        this.f36991a = j10;
        this.f36992b = j11;
    }
}
