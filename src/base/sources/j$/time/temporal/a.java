package j$.time.temporal;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: loaded from: classes3.dex */
public enum a implements r {
    NANO_OF_SECOND("NanoOfSecond", v.f(0, 999999999)),
    NANO_OF_DAY("NanoOfDay", v.f(0, 86399999999999L)),
    MICRO_OF_SECOND("MicroOfSecond", v.f(0, 999999)),
    MICRO_OF_DAY("MicroOfDay", v.f(0, 86399999999L)),
    MILLI_OF_SECOND("MilliOfSecond", v.f(0, 999)),
    MILLI_OF_DAY("MilliOfDay", v.f(0, 86399999)),
    SECOND_OF_MINUTE("SecondOfMinute", v.f(0, 59), 0),
    SECOND_OF_DAY("SecondOfDay", v.f(0, 86399)),
    MINUTE_OF_HOUR("MinuteOfHour", v.f(0, 59), 0),
    MINUTE_OF_DAY("MinuteOfDay", v.f(0, 1439)),
    HOUR_OF_AMPM("HourOfAmPm", v.f(0, 11)),
    CLOCK_HOUR_OF_AMPM("ClockHourOfAmPm", v.f(1, 12)),
    HOUR_OF_DAY("HourOfDay", v.f(0, 23), 0),
    CLOCK_HOUR_OF_DAY("ClockHourOfDay", v.f(1, 24)),
    AMPM_OF_DAY("AmPmOfDay", v.f(0, 1), 0),
    DAY_OF_WEEK("DayOfWeek", v.f(1, 7), 0),
    ALIGNED_DAY_OF_WEEK_IN_MONTH("AlignedDayOfWeekInMonth", v.f(1, 7)),
    ALIGNED_DAY_OF_WEEK_IN_YEAR("AlignedDayOfWeekInYear", v.f(1, 7)),
    DAY_OF_MONTH("DayOfMonth", v.g(28, 31), 0),
    DAY_OF_YEAR("DayOfYear", v.g(365, 366)),
    EPOCH_DAY("EpochDay", v.f(-365243219162L, 365241780471L)),
    ALIGNED_WEEK_OF_MONTH("AlignedWeekOfMonth", v.g(4, 5)),
    ALIGNED_WEEK_OF_YEAR("AlignedWeekOfYear", v.f(1, 53)),
    MONTH_OF_YEAR("MonthOfYear", v.f(1, 12), 0),
    PROLEPTIC_MONTH("ProlepticMonth", v.f(-11999999988L, 11999999999L)),
    YEAR_OF_ERA("YearOfEra", v.g(999999999, C.NANOS_PER_SECOND)),
    YEAR("Year", v.f(-999999999, 999999999), 0),
    ERA("Era", v.f(0, 1), 0),
    INSTANT_SECONDS("InstantSeconds", v.f(Long.MIN_VALUE, Long.MAX_VALUE)),
    OFFSET_SECONDS("OffsetSeconds", v.f(-64800, 64800));


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f41784b;

    static {
        b bVar = b.NANOS;
    }

    a(String str, v vVar) {
        this.f41783a = str;
        this.f41784b = vVar;
    }

    a(String str, v vVar, int i10) {
        this.f41783a = str;
        this.f41784b = vVar;
    }

    @Override // j$.time.temporal.r
    public final v I() {
        return this.f41784b;
    }

    public final void X(long j10) {
        this.f41784b.b(j10, this);
    }

    @Override // j$.time.temporal.r
    public final boolean isDateBased() {
        return ordinal() >= DAY_OF_WEEK.ordinal() && ordinal() <= ERA.ordinal();
    }

    public final boolean Y() {
        return ordinal() < DAY_OF_WEEK.ordinal();
    }

    @Override // j$.time.temporal.r
    public final boolean s(n nVar) {
        return nVar.h(this);
    }

    @Override // j$.time.temporal.r
    public final v A(n nVar) {
        return nVar.l(this);
    }

    @Override // j$.time.temporal.r
    public final long P(n nVar) {
        return nVar.i(this);
    }

    @Override // j$.time.temporal.r
    public final m V(m mVar, long j10) {
        return mVar.c(j10, this);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f41783a;
    }
}
