package j$.time;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class t implements Externalizable {
    private static final long serialVersionUID = -7683839454370182990L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte f41780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f41781b;

    public t() {
    }

    public t(byte b10, Object obj) {
        this.f41780a = b10;
        this.f41781b = obj;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        byte b10 = this.f41780a;
        Object obj = this.f41781b;
        objectOutput.writeByte(b10);
        switch (b10) {
            case 1:
                f fVar = (f) obj;
                objectOutput.writeLong(fVar.f41673a);
                objectOutput.writeInt(fVar.f41674b);
                return;
            case 2:
                Instant instant = (Instant) obj;
                objectOutput.writeLong(instant.f41590a);
                objectOutput.writeInt(instant.f41591b);
                return;
            case 3:
                i iVar = (i) obj;
                objectOutput.writeInt(iVar.f41751a);
                objectOutput.writeByte(iVar.f41752b);
                objectOutput.writeByte(iVar.f41753c);
                return;
            case 4:
                ((l) obj).h0(objectOutput);
                return;
            case 5:
                LocalDateTime localDateTime = (LocalDateTime) obj;
                i iVar2 = localDateTime.f41594a;
                objectOutput.writeInt(iVar2.f41751a);
                objectOutput.writeByte(iVar2.f41752b);
                objectOutput.writeByte(iVar2.f41753c);
                localDateTime.f41595b.h0(objectOutput);
                return;
            case 6:
                ZonedDateTime zonedDateTime = (ZonedDateTime) obj;
                LocalDateTime localDateTime2 = zonedDateTime.f41605a;
                i iVar3 = localDateTime2.f41594a;
                objectOutput.writeInt(iVar3.f41751a);
                objectOutput.writeByte(iVar3.f41752b);
                objectOutput.writeByte(iVar3.f41753c);
                localDateTime2.f41595b.h0(objectOutput);
                zonedDateTime.f41606b.c0(objectOutput);
                zonedDateTime.f41607c.V(objectOutput);
                return;
            case 7:
                objectOutput.writeUTF(((z) obj).f41824b);
                return;
            case 8:
                ((ZoneOffset) obj).c0(objectOutput);
                return;
            case 9:
                r rVar = (r) obj;
                rVar.f41774a.h0(objectOutput);
                rVar.f41775b.c0(objectOutput);
                return;
            case 10:
                OffsetDateTime offsetDateTime = (OffsetDateTime) obj;
                LocalDateTime localDateTime3 = offsetDateTime.f41597a;
                i iVar4 = localDateTime3.f41594a;
                objectOutput.writeInt(iVar4.f41751a);
                objectOutput.writeByte(iVar4.f41752b);
                objectOutput.writeByte(iVar4.f41753c);
                localDateTime3.f41595b.h0(objectOutput);
                offsetDateTime.f41598b.c0(objectOutput);
                return;
            case 11:
                objectOutput.writeInt(((v) obj).f41816a);
                return;
            case 12:
                x xVar = (x) obj;
                objectOutput.writeInt(xVar.f41820a);
                objectOutput.writeByte(xVar.f41821b);
                return;
            case 13:
                p pVar = (p) obj;
                objectOutput.writeByte(pVar.f41770a);
                objectOutput.writeByte(pVar.f41771b);
                return;
            case 14:
                s sVar = (s) obj;
                objectOutput.writeInt(sVar.f41777a);
                objectOutput.writeInt(sVar.f41778b);
                objectOutput.writeInt(sVar.f41779c);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type");
        }
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        byte b10 = objectInput.readByte();
        this.f41780a = b10;
        this.f41781b = a(b10, objectInput);
    }

    public static Object a(byte b10, ObjectInput objectInput) throws IOException {
        switch (b10) {
            case 1:
                f fVar = f.f41672c;
                long j10 = objectInput.readLong();
                long j11 = objectInput.readInt();
                return f.A(Math.addExact(j10, Math.floorDiv(j11, C.NANOS_PER_SECOND)), (int) Math.floorMod(j11, C.NANOS_PER_SECOND));
            case 2:
                Instant instant = Instant.f41589c;
                return Instant.A(objectInput.readLong(), objectInput.readInt());
            case 3:
                i iVar = i.f41749d;
                return i.b0(objectInput.readInt(), objectInput.readByte(), objectInput.readByte());
            case 4:
                return l.c0(objectInput);
            case 5:
                LocalDateTime localDateTime = LocalDateTime.f41592c;
                i iVar2 = i.f41749d;
                return LocalDateTime.I(i.b0(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), l.c0(objectInput));
            case 6:
                LocalDateTime localDateTime2 = LocalDateTime.f41592c;
                i iVar3 = i.f41749d;
                LocalDateTime localDateTimeI = LocalDateTime.I(i.b0(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), l.c0(objectInput));
                ZoneOffset zoneOffsetB0 = ZoneOffset.b0(objectInput);
                y yVar = (y) a(objectInput.readByte(), objectInput);
                Objects.requireNonNull(yVar, "zone");
                if (!(yVar instanceof ZoneOffset) || zoneOffsetB0.equals(yVar)) {
                    return new ZonedDateTime(localDateTimeI, yVar, zoneOffsetB0);
                }
                throw new IllegalArgumentException("ZoneId must match ZoneOffset");
            case 7:
                int i10 = z.f41823d;
                return y.F(objectInput.readUTF(), false);
            case 8:
                return ZoneOffset.b0(objectInput);
            case 9:
                int i11 = r.f41773c;
                return new r(l.c0(objectInput), ZoneOffset.b0(objectInput));
            case 10:
                int i12 = OffsetDateTime.f41596c;
                i iVar4 = i.f41749d;
                return new OffsetDateTime(LocalDateTime.I(i.b0(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), l.c0(objectInput)), ZoneOffset.b0(objectInput));
            case 11:
                int i13 = v.f41815b;
                return v.s(objectInput.readInt());
            case 12:
                int i14 = x.f41819c;
                int i15 = objectInput.readInt();
                byte b11 = objectInput.readByte();
                j$.time.temporal.a.YEAR.X(i15);
                j$.time.temporal.a.MONTH_OF_YEAR.X(b11);
                return new x(i15, b11);
            case 13:
                int i16 = p.f41769c;
                byte b12 = objectInput.readByte();
                byte b13 = objectInput.readByte();
                n nVarI = n.I(b12);
                Objects.requireNonNull(nVarI, "month");
                j$.time.temporal.a.DAY_OF_MONTH.X(b13);
                if (b13 <= nVarI.F()) {
                    return new p(nVarI.getValue(), b13);
                }
                throw new c("Illegal value for DayOfMonth field, value " + ((int) b13) + " is not valid for month " + nVarI.name());
            case 14:
                s sVar = s.f41776d;
                return s.a(objectInput.readInt(), objectInput.readInt(), objectInput.readInt());
            default:
                throw new StreamCorruptedException("Unknown serialized type");
        }
    }

    private Object readResolve() {
        return this.f41781b;
    }
}
