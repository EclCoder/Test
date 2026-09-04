package j$.time;

import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public abstract class y implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map f41822a;
    private static final long serialVersionUID = 8352817235686L;

    public abstract j$.time.zone.f A();

    public abstract void V(DataOutput dataOutput);

    public abstract String q();

    static {
        Map.Entry[] entryArr = {new AbstractMap.SimpleImmutableEntry("ACT", "Australia/Darwin"), new AbstractMap.SimpleImmutableEntry("AET", "Australia/Sydney"), new AbstractMap.SimpleImmutableEntry("AGT", "America/Argentina/Buenos_Aires"), new AbstractMap.SimpleImmutableEntry("ART", "Africa/Cairo"), new AbstractMap.SimpleImmutableEntry("AST", "America/Anchorage"), new AbstractMap.SimpleImmutableEntry("BET", "America/Sao_Paulo"), new AbstractMap.SimpleImmutableEntry("BST", "Asia/Dhaka"), new AbstractMap.SimpleImmutableEntry("CAT", "Africa/Harare"), new AbstractMap.SimpleImmutableEntry("CNT", "America/St_Johns"), new AbstractMap.SimpleImmutableEntry("CST", "America/Chicago"), new AbstractMap.SimpleImmutableEntry("CTT", "Asia/Shanghai"), new AbstractMap.SimpleImmutableEntry("EAT", "Africa/Addis_Ababa"), new AbstractMap.SimpleImmutableEntry("ECT", "Europe/Paris"), new AbstractMap.SimpleImmutableEntry("IET", "America/Indiana/Indianapolis"), new AbstractMap.SimpleImmutableEntry("IST", "Asia/Kolkata"), new AbstractMap.SimpleImmutableEntry("JST", "Asia/Tokyo"), new AbstractMap.SimpleImmutableEntry("MIT", "Pacific/Apia"), new AbstractMap.SimpleImmutableEntry("NET", "Asia/Yerevan"), new AbstractMap.SimpleImmutableEntry("NST", "Pacific/Auckland"), new AbstractMap.SimpleImmutableEntry("PLT", "Asia/Karachi"), new AbstractMap.SimpleImmutableEntry("PNT", "America/Phoenix"), new AbstractMap.SimpleImmutableEntry("PRT", "America/Puerto_Rico"), new AbstractMap.SimpleImmutableEntry("PST", "America/Los_Angeles"), new AbstractMap.SimpleImmutableEntry("SST", "Pacific/Guadalcanal"), new AbstractMap.SimpleImmutableEntry("VST", "Asia/Ho_Chi_Minh"), new AbstractMap.SimpleImmutableEntry("EST", "-05:00"), new AbstractMap.SimpleImmutableEntry("MST", "-07:00"), new AbstractMap.SimpleImmutableEntry("HST", "-10:00")};
        HashMap map = new HashMap(28);
        for (int i10 = 0; i10 < 28; i10++) {
            Map.Entry entry = entryArr[i10];
            Object key = entry.getKey();
            Objects.requireNonNull(key);
            Object value = entry.getValue();
            Objects.requireNonNull(value);
            if (map.put(key, value) != null) {
                throw new IllegalArgumentException("duplicate key: " + key);
            }
        }
        f41822a = Collections.unmodifiableMap(map);
    }

    public static y I(String str, ZoneOffset zoneOffset) {
        Objects.requireNonNull(str, "prefix");
        Objects.requireNonNull(zoneOffset, "offset");
        if (str.isEmpty()) {
            return zoneOffset;
        }
        if (!str.equals("GMT") && !str.equals("UTC") && !str.equals("UT")) {
            throw new IllegalArgumentException("prefix should be GMT, UTC or UT, is: ".concat(str));
        }
        if (zoneOffset.f41603b != 0) {
            str = str.concat(zoneOffset.f41604c);
        }
        return new z(str, new j$.time.zone.f(zoneOffset));
    }

    public static y F(String str, boolean z10) {
        Objects.requireNonNull(str, "zoneId");
        if (str.length() <= 1 || str.startsWith("+") || str.startsWith("-")) {
            return ZoneOffset.X(str);
        }
        if (str.startsWith("UTC") || str.startsWith("GMT")) {
            return P(str, 3, z10);
        }
        if (str.startsWith("UT")) {
            return P(str, 2, z10);
        }
        return z.X(str, z10);
    }

    public static y P(String str, int i10, boolean z10) {
        String strSubstring = str.substring(0, i10);
        if (str.length() == i10) {
            return I(strSubstring, ZoneOffset.UTC);
        }
        if (str.charAt(i10) != '+' && str.charAt(i10) != '-') {
            return z.X(str, z10);
        }
        try {
            ZoneOffset zoneOffsetX = ZoneOffset.X(str.substring(i10));
            if (zoneOffsetX == ZoneOffset.UTC) {
                return I(strSubstring, zoneOffsetX);
            }
            return I(strSubstring, zoneOffsetX);
        } catch (c e10) {
            throw new c("Invalid ID for offset-based ZoneId: ".concat(str), e10);
        }
    }

    public static y s(j$.time.temporal.n nVar) {
        y yVar = (y) nVar.b(j$.time.temporal.s.f41806e);
        if (yVar != null) {
            return yVar;
        }
        throw new c("Unable to obtain ZoneId from TemporalAccessor: " + nVar + " of type " + nVar.getClass().getName());
    }

    public y() {
        if (getClass() != ZoneOffset.class && getClass() != z.class) {
            throw new AssertionError("Invalid subclass");
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof y) {
            return q().equals(((y) obj).q());
        }
        return false;
    }

    public int hashCode() {
        return q().hashCode();
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public String toString() {
        return q();
    }

    private Object writeReplace() {
        return new t((byte) 7, this);
    }
}
