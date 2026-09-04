package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int[] f4043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final ArrayList f4044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int[] f4045c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int[] f4046d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f4047e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final String f4048f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final int f4049g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final int f4050h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final CharSequence f4051i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final int f4052j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final CharSequence f4053k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final ArrayList f4054l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final ArrayList f4055m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final boolean f4056n;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public b[] newArray(int i10) {
            return new b[i10];
        }
    }

    b(androidx.fragment.app.a aVar) {
        int size = aVar.f4208c.size();
        this.f4043a = new int[size * 6];
        if (!aVar.f4214i) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f4044b = new ArrayList(size);
        this.f4045c = new int[size];
        this.f4046d = new int[size];
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            o0.a aVar2 = (o0.a) aVar.f4208c.get(i11);
            int i12 = i10 + 1;
            this.f4043a[i10] = aVar2.f4225a;
            ArrayList arrayList = this.f4044b;
            Fragment fragment = aVar2.f4226b;
            arrayList.add(fragment != null ? fragment.mWho : null);
            int[] iArr = this.f4043a;
            iArr[i12] = aVar2.f4227c ? 1 : 0;
            iArr[i10 + 2] = aVar2.f4228d;
            iArr[i10 + 3] = aVar2.f4229e;
            int i13 = i10 + 5;
            iArr[i10 + 4] = aVar2.f4230f;
            i10 += 6;
            iArr[i13] = aVar2.f4231g;
            this.f4045c[i11] = aVar2.f4232h.ordinal();
            this.f4046d[i11] = aVar2.f4233i.ordinal();
        }
        this.f4047e = aVar.f4213h;
        this.f4048f = aVar.f4216k;
        this.f4049g = aVar.f4040v;
        this.f4050h = aVar.f4217l;
        this.f4051i = aVar.f4218m;
        this.f4052j = aVar.f4219n;
        this.f4053k = aVar.f4220o;
        this.f4054l = aVar.f4221p;
        this.f4055m = aVar.f4222q;
        this.f4056n = aVar.f4223r;
    }

    private void a(androidx.fragment.app.a aVar) {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            boolean z10 = true;
            if (i10 >= this.f4043a.length) {
                aVar.f4213h = this.f4047e;
                aVar.f4216k = this.f4048f;
                aVar.f4214i = true;
                aVar.f4217l = this.f4050h;
                aVar.f4218m = this.f4051i;
                aVar.f4219n = this.f4052j;
                aVar.f4220o = this.f4053k;
                aVar.f4221p = this.f4054l;
                aVar.f4222q = this.f4055m;
                aVar.f4223r = this.f4056n;
                return;
            }
            o0.a aVar2 = new o0.a();
            int i12 = i10 + 1;
            aVar2.f4225a = this.f4043a[i10];
            if (f0.N0(2)) {
                Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i11 + " base fragment #" + this.f4043a[i12]);
            }
            aVar2.f4232h = androidx.lifecycle.s.b.values()[this.f4045c[i11]];
            aVar2.f4233i = androidx.lifecycle.s.b.values()[this.f4046d[i11]];
            int[] iArr = this.f4043a;
            int i13 = i10 + 2;
            if (iArr[i12] == 0) {
                z10 = false;
            }
            aVar2.f4227c = z10;
            int i14 = iArr[i13];
            aVar2.f4228d = i14;
            int i15 = iArr[i10 + 3];
            aVar2.f4229e = i15;
            int i16 = i10 + 5;
            int i17 = iArr[i10 + 4];
            aVar2.f4230f = i17;
            i10 += 6;
            int i18 = iArr[i16];
            aVar2.f4231g = i18;
            aVar.f4209d = i14;
            aVar.f4210e = i15;
            aVar.f4211f = i17;
            aVar.f4212g = i18;
            aVar.e(aVar2);
            i11++;
        }
    }

    public androidx.fragment.app.a b(f0 f0Var) {
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(f0Var);
        a(aVar);
        aVar.f4040v = this.f4049g;
        for (int i10 = 0; i10 < this.f4044b.size(); i10++) {
            String str = (String) this.f4044b.get(i10);
            if (str != null) {
                ((o0.a) aVar.f4208c.get(i10)).f4226b = f0Var.h0(str);
            }
        }
        aVar.u(1);
        return aVar;
    }

    public androidx.fragment.app.a c(f0 f0Var, Map map) {
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(f0Var);
        a(aVar);
        for (int i10 = 0; i10 < this.f4044b.size(); i10++) {
            String str = (String) this.f4044b.get(i10);
            if (str != null) {
                Fragment fragment = (Fragment) map.get(str);
                if (fragment == null) {
                    throw new IllegalStateException("Restoring FragmentTransaction " + this.f4048f + " failed due to missing saved state for Fragment (" + str + ")");
                }
                ((o0.a) aVar.f4208c.get(i10)).f4226b = fragment;
            }
        }
        return aVar;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeIntArray(this.f4043a);
        parcel.writeStringList(this.f4044b);
        parcel.writeIntArray(this.f4045c);
        parcel.writeIntArray(this.f4046d);
        parcel.writeInt(this.f4047e);
        parcel.writeString(this.f4048f);
        parcel.writeInt(this.f4049g);
        parcel.writeInt(this.f4050h);
        TextUtils.writeToParcel(this.f4051i, parcel, 0);
        parcel.writeInt(this.f4052j);
        TextUtils.writeToParcel(this.f4053k, parcel, 0);
        parcel.writeStringList(this.f4054l);
        parcel.writeStringList(this.f4055m);
        parcel.writeInt(this.f4056n ? 1 : 0);
    }

    b(Parcel parcel) {
        this.f4043a = parcel.createIntArray();
        this.f4044b = parcel.createStringArrayList();
        this.f4045c = parcel.createIntArray();
        this.f4046d = parcel.createIntArray();
        this.f4047e = parcel.readInt();
        this.f4048f = parcel.readString();
        this.f4049g = parcel.readInt();
        this.f4050h = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f4051i = (CharSequence) creator.createFromParcel(parcel);
        this.f4052j = parcel.readInt();
        this.f4053k = (CharSequence) creator.createFromParcel(parcel);
        this.f4054l = parcel.createStringArrayList();
        this.f4055m = parcel.createStringArrayList();
        this.f4056n = parcel.readInt() != 0;
    }
}
