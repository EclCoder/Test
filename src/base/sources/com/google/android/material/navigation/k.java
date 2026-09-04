package com.google.android.material.navigation;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public class k implements androidx.appcompat.view.menu.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private j f20641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f20642b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f20643c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class a implements Parcelable {
        public static final Parcelable.Creator<a> CREATOR = new C0313a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f20644a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        s f20645b;

        /* JADX INFO: renamed from: com.google.android.material.navigation.k$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class C0313a implements Parcelable.Creator {
            C0313a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public a createFromParcel(Parcel parcel) {
                return new a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public a[] newArray(int i10) {
                return new a[i10];
            }
        }

        a() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f20644a);
            parcel.writeParcelable(this.f20645b, 0);
        }

        a(Parcel parcel) {
            this.f20644a = parcel.readInt();
            this.f20645b = (s) parcel.readParcelable(getClass().getClassLoader());
        }
    }

    public void a(int i10) {
        this.f20643c = i10;
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean c(androidx.appcompat.view.menu.e eVar, androidx.appcompat.view.menu.g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void e(Parcelable parcelable) {
        if (parcelable instanceof a) {
            a aVar = (a) parcelable;
            this.f20641a.p(aVar.f20644a);
            this.f20641a.n(ub.c.c(this.f20641a.getContext(), aVar.f20645b));
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean f(androidx.appcompat.view.menu.m mVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public Parcelable g() {
        a aVar = new a();
        aVar.f20644a = this.f20641a.getSelectedItemId();
        aVar.f20645b = ub.c.d(this.f20641a.getBadgeDrawables());
        return aVar;
    }

    @Override // androidx.appcompat.view.menu.j
    public int getId() {
        return this.f20643c;
    }

    @Override // androidx.appcompat.view.menu.j
    public void h(boolean z10) {
        if (this.f20642b) {
            return;
        }
        if (z10) {
            this.f20641a.d();
        } else {
            this.f20641a.r();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean i() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean j(androidx.appcompat.view.menu.e eVar, androidx.appcompat.view.menu.g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void k(Context context, androidx.appcompat.view.menu.e eVar) {
        this.f20641a.a(eVar);
    }

    public void l(j jVar) {
        this.f20641a = jVar;
    }

    public void m(boolean z10) {
        this.f20642b = z10;
    }

    @Override // androidx.appcompat.view.menu.j
    public void b(androidx.appcompat.view.menu.e eVar, boolean z10) {
    }
}
