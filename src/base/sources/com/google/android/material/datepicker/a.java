package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.AdError;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0307a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n f19875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n f19876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c f19877c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private n f19878d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f19879e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f19880f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f19881g;

    /* JADX INFO: renamed from: com.google.android.material.datepicker.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class C0307a implements Parcelable.Creator {
        C0307a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return new a((n) parcel.readParcelable(n.class.getClassLoader()), (n) parcel.readParcelable(n.class.getClassLoader()), (c) parcel.readParcelable(c.class.getClassLoader()), (n) parcel.readParcelable(n.class.getClassLoader()), parcel.readInt(), null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        static final long f19882f = v.a(n.b(1900, 0).f19992f);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        static final long f19883g = v.a(n.b(AdError.BROKEN_MEDIA_ERROR_CODE, 11).f19992f);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f19884a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f19885b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Long f19886c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f19887d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private c f19888e;

        b(a aVar) {
            this.f19884a = f19882f;
            this.f19885b = f19883g;
            this.f19888e = f.a(Long.MIN_VALUE);
            this.f19884a = aVar.f19875a.f19992f;
            this.f19885b = aVar.f19876b.f19992f;
            this.f19886c = Long.valueOf(aVar.f19878d.f19992f);
            this.f19887d = aVar.f19879e;
            this.f19888e = aVar.f19877c;
        }

        public a a() {
            Bundle bundle = new Bundle();
            bundle.putParcelable("DEEP_COPY_VALIDATOR_KEY", this.f19888e);
            n nVarC = n.c(this.f19884a);
            n nVarC2 = n.c(this.f19885b);
            c cVar = (c) bundle.getParcelable("DEEP_COPY_VALIDATOR_KEY");
            Long l10 = this.f19886c;
            return new a(nVarC, nVarC2, cVar, l10 == null ? null : n.c(l10.longValue()), this.f19887d, null);
        }

        public b b(long j10) {
            this.f19886c = Long.valueOf(j10);
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface c extends Parcelable {
        boolean h(long j10);
    }

    /* synthetic */ a(n nVar, n nVar2, c cVar, n nVar3, int i10, C0307a c0307a) {
        this(nVar, nVar2, cVar, nVar3, i10);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f19875a.equals(aVar.f19875a) && this.f19876b.equals(aVar.f19876b) && m0.b.a(this.f19878d, aVar.f19878d) && this.f19879e == aVar.f19879e && this.f19877c.equals(aVar.f19877c);
    }

    public c g() {
        return this.f19877c;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f19875a, this.f19876b, this.f19878d, Integer.valueOf(this.f19879e), this.f19877c});
    }

    n i() {
        return this.f19876b;
    }

    int j() {
        return this.f19879e;
    }

    int l() {
        return this.f19881g;
    }

    n n() {
        return this.f19878d;
    }

    n o() {
        return this.f19875a;
    }

    int p() {
        return this.f19880f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f19875a, 0);
        parcel.writeParcelable(this.f19876b, 0);
        parcel.writeParcelable(this.f19878d, 0);
        parcel.writeParcelable(this.f19877c, 0);
        parcel.writeInt(this.f19879e);
    }

    private a(n nVar, n nVar2, c cVar, n nVar3, int i10) {
        Objects.requireNonNull(nVar, "start cannot be null");
        Objects.requireNonNull(nVar2, "end cannot be null");
        Objects.requireNonNull(cVar, "validator cannot be null");
        this.f19875a = nVar;
        this.f19876b = nVar2;
        this.f19878d = nVar3;
        this.f19879e = i10;
        this.f19877c = cVar;
        if (nVar3 != null && nVar.compareTo(nVar3) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (nVar3 != null && nVar3.compareTo(nVar2) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i10 < 0 || i10 > v.i().getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.f19881g = nVar.o(nVar2) + 1;
        this.f19880f = (nVar2.f19989c - nVar.f19989c) + 1;
    }
}
