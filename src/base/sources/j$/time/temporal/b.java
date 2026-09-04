package j$.time.temporal;

import com.inmobi.media.core.config.models.TelemetryConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: loaded from: classes3.dex */
public enum b implements t {
    NANOS("Nanos"),
    MICROS("Micros"),
    MILLIS("Millis"),
    SECONDS("Seconds"),
    MINUTES("Minutes"),
    HOURS("Hours"),
    HALF_DAYS("HalfDays"),
    DAYS("Days"),
    WEEKS("Weeks"),
    MONTHS("Months"),
    YEARS("Years"),
    DECADES("Decades"),
    CENTURIES("Centuries"),
    MILLENNIA("Millennia"),
    ERAS("Eras"),
    FOREVER("Forever");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41786a;

    static {
        j$.time.f.F(1L);
        j$.time.f.F(1000L);
        j$.time.f.F(1000000L);
        j$.time.f.A(1L, 0);
        j$.time.f.A(60L, 0);
        j$.time.f.A(3600L, 0);
        j$.time.f.A(43200L, 0);
        j$.time.f.A(86400L, 0);
        j$.time.f.A(TelemetryConfig.DEFAULT_EVENT_TTL_SEC, 0);
        j$.time.f.A(2629746L, 0);
        j$.time.f.A(31556952L, 0);
        j$.time.f.A(315569520L, 0);
        j$.time.f.A(3155695200L, 0);
        j$.time.f.A(31556952000L, 0);
        j$.time.f.A(31556952000000000L, 0);
        j$.time.f.A(Math.addExact(Long.MAX_VALUE, Math.floorDiv(999999999L, C.NANOS_PER_SECOND)), (int) Math.floorMod(999999999L, C.NANOS_PER_SECOND));
    }

    b(String str) {
        this.f41786a = str;
    }

    @Override // j$.time.temporal.t
    public final m s(m mVar, long j10) {
        return mVar.d(j10, this);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f41786a;
    }
}
