package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class l0 implements Parcelable {
    public static final Parcelable.Creator<l0> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f4172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final String f4173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final boolean f4174c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f4175d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f4176e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final String f4177f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final boolean f4178g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final boolean f4179h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final boolean f4180i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final boolean f4181j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final int f4182k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final String f4183l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final int f4184m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final boolean f4185n;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public l0 createFromParcel(Parcel parcel) {
            return new l0(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public l0[] newArray(int i10) {
            return new l0[i10];
        }
    }

    l0(Fragment fragment) {
        this.f4172a = fragment.getClass().getName();
        this.f4173b = fragment.mWho;
        this.f4174c = fragment.mFromLayout;
        this.f4175d = fragment.mFragmentId;
        this.f4176e = fragment.mContainerId;
        this.f4177f = fragment.mTag;
        this.f4178g = fragment.mRetainInstance;
        this.f4179h = fragment.mRemoving;
        this.f4180i = fragment.mDetached;
        this.f4181j = fragment.mHidden;
        this.f4182k = fragment.mMaxState.ordinal();
        this.f4183l = fragment.mTargetWho;
        this.f4184m = fragment.mTargetRequestCode;
        this.f4185n = fragment.mUserVisibleHint;
    }

    Fragment a(w wVar, ClassLoader classLoader) {
        Fragment fragmentA = wVar.a(classLoader, this.f4172a);
        fragmentA.mWho = this.f4173b;
        fragmentA.mFromLayout = this.f4174c;
        fragmentA.mRestored = true;
        fragmentA.mFragmentId = this.f4175d;
        fragmentA.mContainerId = this.f4176e;
        fragmentA.mTag = this.f4177f;
        fragmentA.mRetainInstance = this.f4178g;
        fragmentA.mRemoving = this.f4179h;
        fragmentA.mDetached = this.f4180i;
        fragmentA.mHidden = this.f4181j;
        fragmentA.mMaxState = androidx.lifecycle.s.b.values()[this.f4182k];
        fragmentA.mTargetWho = this.f4183l;
        fragmentA.mTargetRequestCode = this.f4184m;
        fragmentA.mUserVisibleHint = this.f4185n;
        return fragmentA;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentState{");
        sb2.append(this.f4172a);
        sb2.append(" (");
        sb2.append(this.f4173b);
        sb2.append(")}:");
        if (this.f4174c) {
            sb2.append(" fromLayout");
        }
        if (this.f4176e != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(this.f4176e));
        }
        String str = this.f4177f;
        if (str != null && !str.isEmpty()) {
            sb2.append(" tag=");
            sb2.append(this.f4177f);
        }
        if (this.f4178g) {
            sb2.append(" retainInstance");
        }
        if (this.f4179h) {
            sb2.append(" removing");
        }
        if (this.f4180i) {
            sb2.append(" detached");
        }
        if (this.f4181j) {
            sb2.append(" hidden");
        }
        if (this.f4183l != null) {
            sb2.append(" targetWho=");
            sb2.append(this.f4183l);
            sb2.append(" targetRequestCode=");
            sb2.append(this.f4184m);
        }
        if (this.f4185n) {
            sb2.append(" userVisibleHint");
        }
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f4172a);
        parcel.writeString(this.f4173b);
        parcel.writeInt(this.f4174c ? 1 : 0);
        parcel.writeInt(this.f4175d);
        parcel.writeInt(this.f4176e);
        parcel.writeString(this.f4177f);
        parcel.writeInt(this.f4178g ? 1 : 0);
        parcel.writeInt(this.f4179h ? 1 : 0);
        parcel.writeInt(this.f4180i ? 1 : 0);
        parcel.writeInt(this.f4181j ? 1 : 0);
        parcel.writeInt(this.f4182k);
        parcel.writeString(this.f4183l);
        parcel.writeInt(this.f4184m);
        parcel.writeInt(this.f4185n ? 1 : 0);
    }

    l0(Parcel parcel) {
        this.f4172a = parcel.readString();
        this.f4173b = parcel.readString();
        this.f4174c = parcel.readInt() != 0;
        this.f4175d = parcel.readInt();
        this.f4176e = parcel.readInt();
        this.f4177f = parcel.readString();
        this.f4178g = parcel.readInt() != 0;
        this.f4179h = parcel.readInt() != 0;
        this.f4180i = parcel.readInt() != 0;
        this.f4181j = parcel.readInt() != 0;
        this.f4182k = parcel.readInt();
        this.f4183l = parcel.readString();
        this.f4184m = parcel.readInt();
        this.f4185n = parcel.readInt() != 0;
    }
}
