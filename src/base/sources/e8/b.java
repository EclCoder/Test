package e8;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import gl.s0;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class b implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Bundle f37234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f37233b = new c(null);
    public static final Parcelable.Creator<b> CREATOR = new C0561b();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Bundle f37235a = new Bundle();

        public b a() {
            return new b(this, null);
        }

        public final Bundle b() {
            return this.f37235a;
        }

        public final a c(Parcel parcel) {
            s.h(parcel, "parcel");
            return d((b) parcel.readParcelable(b.class.getClassLoader()));
        }

        public a d(b bVar) {
            if (bVar != null) {
                this.f37235a.putAll(bVar.f37234a);
            }
            return this;
        }
    }

    /* JADX INFO: renamed from: e8.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class C0561b implements Parcelable.Creator {
        C0561b() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b createFromParcel(Parcel parcel) {
            s.h(parcel, "parcel");
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public b[] newArray(int i10) {
            return new b[i10];
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

    public /* synthetic */ b(a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }

    public final Bitmap b(String str) {
        Bundle bundle = this.f37234a;
        Object obj = bundle != null ? bundle.get(str) : null;
        if (obj instanceof Bitmap) {
            return (Bitmap) obj;
        }
        return null;
    }

    public final Uri c(String str) {
        Bundle bundle = this.f37234a;
        Object obj = bundle != null ? bundle.get(str) : null;
        if (obj instanceof Uri) {
            return (Uri) obj;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final Set e() {
        Bundle bundle = this.f37234a;
        Set<String> setKeySet = bundle != null ? bundle.keySet() : null;
        return setKeySet == null ? s0.d() : setKeySet;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i10) {
        s.h(out, "out");
        out.writeBundle(this.f37234a);
    }

    private b(a aVar) {
        this.f37234a = aVar.b();
    }

    public b(Parcel parcel) {
        s.h(parcel, "parcel");
        this.f37234a = parcel.readBundle(b.class.getClassLoader());
    }
}
