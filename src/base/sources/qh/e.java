package qh;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f50820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Uri f50821b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final e createFromParcel(Parcel parcel) {
            s.h(parcel, "parcel");
            return new e(parcel.readString(), (Uri) parcel.readParcelable(e.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final e[] newArray(int i10) {
            return new e[i10];
        }
    }

    public e(String path, Uri uri) {
        s.h(path, "path");
        s.h(uri, "uri");
        this.f50820a = path;
        this.f50821b = uri;
    }

    public final String a() {
        return this.f50820a;
    }

    public final Uri b() {
        return this.f50821b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        s.h(dest, "dest");
        dest.writeString(this.f50820a);
        dest.writeParcelable(this.f50821b, i10);
    }
}
