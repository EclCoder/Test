package e8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import gl.r;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class g implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Bundle f37257a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static abstract class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final C0562a f37258b = new C0562a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Bundle f37259a = new Bundle();

        /* JADX INFO: renamed from: e8.g$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class C0562a {
            public /* synthetic */ C0562a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final List a(Parcel parcel) {
                s.h(parcel, "parcel");
                Parcelable[] parcelableArray = parcel.readParcelableArray(g.class.getClassLoader());
                if (parcelableArray == null) {
                    return r.l();
                }
                ArrayList arrayList = new ArrayList();
                for (Parcelable parcelable : parcelableArray) {
                    if (parcelable instanceof g) {
                        arrayList.add(parcelable);
                    }
                }
                return arrayList;
            }

            private C0562a() {
            }
        }

        public final Bundle a() {
            return this.f37259a;
        }

        public a b(g gVar) {
            if (gVar != null) {
                return c(gVar.f37257a);
            }
            s.f(this, "null cannot be cast to non-null type B of com.facebook.share.model.ShareMedia.Builder");
            return this;
        }

        public final a c(Bundle parameters) {
            s.h(parameters, "parameters");
            this.f37259a.putAll(parameters);
            s.f(this, "null cannot be cast to non-null type B of com.facebook.share.model.ShareMedia.Builder");
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public enum b {
        PHOTO,
        VIDEO
    }

    protected g(a builder) {
        s.h(builder, "builder");
        this.f37257a = new Bundle(builder.a());
    }

    public abstract b b();

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i10) {
        s.h(dest, "dest");
        dest.writeBundle(this.f37257a);
    }

    public g(Parcel parcel) {
        s.h(parcel, "parcel");
        Bundle bundle = parcel.readBundle(getClass().getClassLoader());
        this.f37257a = bundle == null ? new Bundle() : bundle;
    }
}
