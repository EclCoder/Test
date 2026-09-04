package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class n implements Comparable, Parcelable {
    public static final Parcelable.Creator<n> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Calendar f19987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f19988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f19989c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f19990d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f19991e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final long f19992f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f19993g;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public n createFromParcel(Parcel parcel) {
            return n.b(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public n[] newArray(int i10) {
            return new n[i10];
        }
    }

    private n(Calendar calendar) {
        calendar.set(5, 1);
        Calendar calendarC = v.c(calendar);
        this.f19987a = calendarC;
        this.f19988b = calendarC.get(2);
        this.f19989c = calendarC.get(1);
        this.f19990d = calendarC.getMaximum(7);
        this.f19991e = calendarC.getActualMaximum(5);
        this.f19992f = calendarC.getTimeInMillis();
    }

    static n b(int i10, int i11) {
        Calendar calendarI = v.i();
        calendarI.set(1, i10);
        calendarI.set(2, i11);
        return new n(calendarI);
    }

    static n c(long j10) {
        Calendar calendarI = v.i();
        calendarI.setTimeInMillis(j10);
        return new n(calendarI);
    }

    static n e() {
        return new n(v.g());
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(n nVar) {
        return this.f19987a.compareTo(nVar.f19987a);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f19988b == nVar.f19988b && this.f19989c == nVar.f19989c;
    }

    int f(int i10) {
        int i11 = this.f19987a.get(7);
        if (i10 <= 0) {
            i10 = this.f19987a.getFirstDayOfWeek();
        }
        int i12 = i11 - i10;
        return i12 < 0 ? i12 + this.f19990d : i12;
    }

    long g(int i10) {
        Calendar calendarC = v.c(this.f19987a);
        calendarC.set(5, i10);
        return calendarC.getTimeInMillis();
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f19988b), Integer.valueOf(this.f19989c)});
    }

    int i(long j10) {
        Calendar calendarC = v.c(this.f19987a);
        calendarC.setTimeInMillis(j10);
        return calendarC.get(5);
    }

    String j() {
        if (this.f19993g == null) {
            this.f19993g = e.f(this.f19987a.getTimeInMillis());
        }
        return this.f19993g;
    }

    long l() {
        return this.f19987a.getTimeInMillis();
    }

    n n(int i10) {
        Calendar calendarC = v.c(this.f19987a);
        calendarC.add(2, i10);
        return new n(calendarC);
    }

    int o(n nVar) {
        if (this.f19987a instanceof GregorianCalendar) {
            return ((nVar.f19989c - this.f19989c) * 12) + (nVar.f19988b - this.f19988b);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f19989c);
        parcel.writeInt(this.f19988b);
    }
}
