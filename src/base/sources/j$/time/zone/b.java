package j$.time.zone;

import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements Comparable, Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f41828e = 0;
    private static final long serialVersionUID = -6946044323557704546L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f41829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDateTime f41830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ZoneOffset f41831c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ZoneOffset f41832d;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.f41829a, ((b) obj).f41829a);
    }

    public b(LocalDateTime localDateTime, ZoneOffset zoneOffset, ZoneOffset zoneOffset2) {
        this.f41829a = localDateTime.w(zoneOffset);
        this.f41830b = localDateTime;
        this.f41831c = zoneOffset;
        this.f41832d = zoneOffset2;
    }

    public b(long j10, ZoneOffset zoneOffset, ZoneOffset zoneOffset2) {
        this.f41829a = j10;
        this.f41830b = LocalDateTime.P(j10, 0, zoneOffset);
        this.f41831c = zoneOffset;
        this.f41832d = zoneOffset2;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a((byte) 2, this);
    }

    public final boolean s() {
        return this.f41832d.f41603b > this.f41831c.f41603b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f41829a == bVar.f41829a && this.f41831c.equals(bVar.f41831c) && this.f41832d.equals(bVar.f41832d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f41830b.hashCode() ^ this.f41831c.f41603b) ^ Integer.rotateLeft(this.f41832d.f41603b, 16);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Transition[");
        sb2.append(s() ? "Gap" : "Overlap");
        sb2.append(" at ");
        sb2.append(this.f41830b);
        sb2.append(this.f41831c);
        sb2.append(" to ");
        sb2.append(this.f41832d);
        sb2.append(']');
        return sb2.toString();
    }
}
