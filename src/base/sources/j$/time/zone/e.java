package j$.time.zone;

import j$.time.ZoneOffset;
import j$.time.l;
import j$.time.n;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements Serializable {
    private static final long serialVersionUID = 6889046316657758795L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f41835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte f41836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j$.time.e f41837c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l f41838d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f41839e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d f41840f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ZoneOffset f41841g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ZoneOffset f41842h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ZoneOffset f41843i;

    public e(n nVar, int i10, j$.time.e eVar, l lVar, boolean z10, d dVar, ZoneOffset zoneOffset, ZoneOffset zoneOffset2, ZoneOffset zoneOffset3) {
        this.f41835a = nVar;
        this.f41836b = (byte) i10;
        this.f41837c = eVar;
        this.f41838d = lVar;
        this.f41839e = z10;
        this.f41840f = dVar;
        this.f41841g = zoneOffset;
        this.f41842h = zoneOffset2;
        this.f41843i = zoneOffset3;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a((byte) 3, this);
    }

    public final void b(DataOutput dataOutput) {
        byte b10;
        int iE0 = this.f41839e ? 86400 : this.f41838d.e0();
        int i10 = this.f41841g.f41603b;
        int i11 = this.f41842h.f41603b - i10;
        int i12 = this.f41843i.f41603b - i10;
        if (iE0 % 3600 == 0) {
            b10 = this.f41839e ? (byte) 24 : this.f41838d.f41761a;
        } else {
            b10 = 31;
        }
        int i13 = i10 % 900 == 0 ? (i10 / 900) + 128 : 255;
        int i14 = (i11 == 0 || i11 == 1800 || i11 == 3600) ? i11 / 1800 : 3;
        int i15 = (i12 == 0 || i12 == 1800 || i12 == 3600) ? i12 / 1800 : 3;
        j$.time.e eVar = this.f41837c;
        dataOutput.writeInt((this.f41835a.getValue() << 28) + ((this.f41836b + 32) << 22) + ((eVar == null ? 0 : eVar.getValue()) << 19) + (b10 << 14) + (this.f41840f.ordinal() << 12) + (i13 << 4) + (i14 << 2) + i15);
        if (b10 == 31) {
            dataOutput.writeInt(iE0);
        }
        if (i13 == 255) {
            dataOutput.writeInt(i10);
        }
        if (i14 == 3) {
            dataOutput.writeInt(this.f41842h.f41603b);
        }
        if (i15 == 3) {
            dataOutput.writeInt(this.f41843i.f41603b);
        }
    }

    public static e a(DataInput dataInput) {
        l lVarA;
        int i10;
        int i11;
        int i12 = dataInput.readInt();
        n nVarI = n.I(i12 >>> 28);
        int i13 = ((264241152 & i12) >>> 22) - 32;
        int i14 = (3670016 & i12) >>> 19;
        j$.time.e eVarS = i14 == 0 ? null : j$.time.e.s(i14);
        int i15 = (507904 & i12) >>> 14;
        d dVar = d.values()[(i12 & 12288) >>> 12];
        int i16 = (i12 & 4080) >>> 4;
        int i17 = (i12 & 12) >>> 2;
        int i18 = i12 & 3;
        if (i15 == 31) {
            long j10 = dataInput.readInt();
            l lVar = l.f41757e;
            j$.time.temporal.a.SECOND_OF_DAY.X(j10);
            int i19 = (int) (j10 / 3600);
            long j11 = j10 - ((long) (i19 * 3600));
            int i20 = (int) (j11 / 60);
            lVarA = l.A(i19, i20, (int) (j11 - ((long) (i20 * 60))), 0);
        } else {
            int i21 = i15 % 24;
            l lVar2 = l.f41757e;
            j$.time.temporal.a.HOUR_OF_DAY.X(i21);
            lVarA = l.f41760h[i21];
        }
        ZoneOffset zoneOffsetZ = ZoneOffset.Z(i16 == 255 ? dataInput.readInt() : (i16 - 128) * 900);
        if (i17 == 3) {
            i10 = dataInput.readInt();
        } else {
            i10 = (i17 * 1800) + zoneOffsetZ.f41603b;
        }
        ZoneOffset zoneOffsetZ2 = ZoneOffset.Z(i10);
        if (i18 == 3) {
            i11 = dataInput.readInt();
        } else {
            i11 = (i18 * 1800) + zoneOffsetZ.f41603b;
        }
        ZoneOffset zoneOffsetZ3 = ZoneOffset.Z(i11);
        boolean z10 = i15 == 24;
        Objects.requireNonNull(nVarI, "month");
        Objects.requireNonNull(lVarA, "time");
        Objects.requireNonNull(dVar, "timeDefnition");
        if (i13 < -28 || i13 > 31 || i13 == 0) {
            throw new IllegalArgumentException("Day of month indicator must be between -28 and 31 inclusive excluding zero");
        }
        if (z10 && !lVarA.equals(l.f41759g)) {
            throw new IllegalArgumentException("Time must be midnight when end of day flag is true");
        }
        if (lVarA.f41764d != 0) {
            throw new IllegalArgumentException("Time's nano-of-second must be zero");
        }
        return new e(nVarI, i13, eVarS, lVarA, z10, dVar, zoneOffsetZ, zoneOffsetZ2, zoneOffsetZ3);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (this.f41835a == eVar.f41835a && this.f41836b == eVar.f41836b && this.f41837c == eVar.f41837c && this.f41840f == eVar.f41840f && this.f41838d.equals(eVar.f41838d) && this.f41839e == eVar.f41839e && this.f41841g.equals(eVar.f41841g) && this.f41842h.equals(eVar.f41842h) && this.f41843i.equals(eVar.f41843i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iE0 = ((this.f41838d.e0() + (this.f41839e ? 1 : 0)) << 15) + (this.f41835a.ordinal() << 11) + ((this.f41836b + 32) << 5);
        j$.time.e eVar = this.f41837c;
        return ((this.f41841g.f41603b ^ (this.f41840f.ordinal() + (iE0 + ((eVar == null ? 7 : eVar.ordinal()) << 2)))) ^ this.f41842h.f41603b) ^ this.f41843i.f41603b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TransitionRule[");
        sb2.append(this.f41843i.f41603b - this.f41842h.f41603b > 0 ? "Gap " : "Overlap ");
        sb2.append(this.f41842h);
        sb2.append(" to ");
        sb2.append(this.f41843i);
        sb2.append(", ");
        j$.time.e eVar = this.f41837c;
        if (eVar != null) {
            byte b10 = this.f41836b;
            if (b10 == -1) {
                sb2.append(eVar.name());
                sb2.append(" on or before last day of ");
                sb2.append(this.f41835a.name());
            } else if (b10 < 0) {
                sb2.append(eVar.name());
                sb2.append(" on or before last day minus ");
                sb2.append((-this.f41836b) - 1);
                sb2.append(" of ");
                sb2.append(this.f41835a.name());
            } else {
                sb2.append(eVar.name());
                sb2.append(" on or after ");
                sb2.append(this.f41835a.name());
                sb2.append(' ');
                sb2.append((int) this.f41836b);
            }
        } else {
            sb2.append(this.f41835a.name());
            sb2.append(' ');
            sb2.append((int) this.f41836b);
        }
        sb2.append(" at ");
        sb2.append(this.f41839e ? "24:00" : this.f41838d.toString());
        sb2.append(" ");
        sb2.append(this.f41840f);
        sb2.append(", standard offset ");
        sb2.append(this.f41841g);
        sb2.append(']');
        return sb2.toString();
    }
}
