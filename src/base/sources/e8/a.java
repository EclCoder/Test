package e8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import gl.s0;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Bundle f37231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f37230b = new c(null);
    public static final Parcelable.Creator<a> CREATOR = new b();

    /* JADX INFO: renamed from: e8.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class C0560a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Bundle f37232a = new Bundle();

        public a a() {
            return new a(this, null);
        }

        public final Bundle b() {
            return this.f37232a;
        }

        public final C0560a c(Parcel parcel) {
            s.h(parcel, "parcel");
            return d((a) parcel.readParcelable(a.class.getClassLoader()));
        }

        public C0560a d(a aVar) {
            if (aVar != null) {
                this.f37232a.putAll(aVar.f37231a);
            }
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b implements Parcelable.Creator {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            s.h(parcel, "parcel");
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    public /* synthetic */ a(C0560a c0560a, DefaultConstructorMarker defaultConstructorMarker) {
        this(c0560a);
    }

    public final Object b(String str) {
        Bundle bundle = this.f37231a;
        if (bundle != null) {
            return bundle.get(str);
        }
        return null;
    }

    public final Set c() {
        Bundle bundle = this.f37231a;
        Set<String> setKeySet = bundle != null ? bundle.keySet() : null;
        return setKeySet == null ? s0.d() : setKeySet;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i10) {
        s.h(out, "out");
        out.writeBundle(this.f37231a);
    }

    private a(C0560a c0560a) {
        this.f37231a = c0560a.b();
    }

    public a(Parcel parcel) {
        s.h(parcel, "parcel");
        this.f37231a = parcel.readBundle(a.class.getClassLoader());
    }
}
