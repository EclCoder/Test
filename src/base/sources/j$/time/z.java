package j$.time;

import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class z extends y {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f41823d = 0;
    private static final long serialVersionUID = 8386373296231747096L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f41824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient j$.time.zone.f f41825c;

    public static z X(String str, boolean z10) {
        j$.time.zone.f fVarA;
        Objects.requireNonNull(str, "zoneId");
        int length = str.length();
        if (length >= 2) {
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = str.charAt(i10);
                if ((cCharAt < 'a' || cCharAt > 'z') && ((cCharAt < 'A' || cCharAt > 'Z') && ((cCharAt != '/' || i10 == 0) && ((cCharAt < '0' || cCharAt > '9' || i10 == 0) && ((cCharAt != '~' || i10 == 0) && ((cCharAt != '.' || i10 == 0) && ((cCharAt != '_' || i10 == 0) && ((cCharAt != '+' || i10 == 0) && (cCharAt != '-' || i10 == 0))))))))) {
                    throw new c("Invalid ID for region-based ZoneId, invalid format: ".concat(str));
                }
            }
            try {
                fVarA = j$.time.zone.i.a(str);
            } catch (j$.time.zone.g e10) {
                if (z10) {
                    throw e10;
                }
                fVarA = null;
            }
            return new z(str, fVarA);
        }
        throw new c("Invalid ID for region-based ZoneId, invalid format: ".concat(str));
    }

    public z(String str, j$.time.zone.f fVar) {
        this.f41824b = str;
        this.f41825c = fVar;
    }

    @Override // j$.time.y
    public final String q() {
        return this.f41824b;
    }

    @Override // j$.time.y
    public final j$.time.zone.f A() {
        j$.time.zone.f fVar = this.f41825c;
        return fVar != null ? fVar : j$.time.zone.i.a(this.f41824b);
    }

    private Object writeReplace() {
        return new t((byte) 7, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.y
    public final void V(DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(7);
        dataOutput.writeUTF(this.f41824b);
    }
}
