package f;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f38117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Intent f38118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f38116c = new b(null);
    public static final Parcelable.Creator<a> CREATOR = new C0567a();

    /* JADX INFO: renamed from: f.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class C0567a implements Parcelable.Creator {
        C0567a() {
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
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(int i10) {
            if (i10 != -1) {
                return i10 != 0 ? String.valueOf(i10) : "RESULT_CANCELED";
            }
            return "RESULT_OK";
        }

        private b() {
        }
    }

    public a(int i10, Intent intent) {
        this.f38117a = i10;
        this.f38118b = intent;
    }

    public final Intent a() {
        return this.f38118b;
    }

    public final int b() {
        return this.f38117a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "ActivityResult{resultCode=" + f38116c.a(this.f38117a) + ", data=" + this.f38118b + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i10) {
        s.h(dest, "dest");
        dest.writeInt(this.f38117a);
        dest.writeInt(this.f38118b == null ? 0 : 1);
        Intent intent = this.f38118b;
        if (intent != null) {
            intent.writeToParcel(dest, i10);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel));
        s.h(parcel, "parcel");
    }
}
