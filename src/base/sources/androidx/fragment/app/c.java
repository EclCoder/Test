package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final List f4058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final List f4059b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c createFromParcel(Parcel parcel) {
            return new c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public c[] newArray(int i10) {
            return new c[i10];
        }
    }

    c(List list, List list2) {
        this.f4058a = list;
        this.f4059b = list2;
    }

    List a(f0 f0Var, Map map) {
        HashMap map2 = new HashMap(this.f4058a.size());
        for (String str : this.f4058a) {
            Fragment fragment = (Fragment) map.get(str);
            if (fragment != null) {
                map2.put(fragment.mWho, fragment);
            } else {
                Bundle bundleB = f0Var.y0().B(str, null);
                if (bundleB != null) {
                    ClassLoader classLoader = f0Var.A0().f().getClassLoader();
                    Fragment fragmentA = ((l0) bundleB.getParcelable("state")).a(f0Var.x0(), classLoader);
                    fragmentA.mSavedFragmentState = bundleB;
                    if (bundleB.getBundle("savedInstanceState") == null) {
                        fragmentA.mSavedFragmentState.putBundle("savedInstanceState", new Bundle());
                    }
                    Bundle bundle = bundleB.getBundle("arguments");
                    if (bundle != null) {
                        bundle.setClassLoader(classLoader);
                    }
                    fragmentA.setArguments(bundle);
                    map2.put(fragmentA.mWho, fragmentA);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f4059b.iterator();
        while (it.hasNext()) {
            arrayList.add(((b) it.next()).c(f0Var, map2));
        }
        return arrayList;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeStringList(this.f4058a);
        parcel.writeTypedList(this.f4059b);
    }

    c(Parcel parcel) {
        this.f4058a = parcel.createStringArrayList();
        this.f4059b = parcel.createTypedArrayList(b.CREATOR);
    }
}
