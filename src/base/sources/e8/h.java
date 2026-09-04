package e8;

import android.os.Parcel;
import android.os.Parcelable;
import gl.r;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class h extends d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f37264g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f37263h = new b(null);
    public static final Parcelable.Creator<h> CREATOR = new a();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public h createFromParcel(Parcel source) {
            s.h(source, "source");
            return new h(source);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public h[] newArray(int i10) {
            return new h[i10];
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Parcel source) {
        List listL;
        super(source);
        s.h(source, "source");
        Parcelable[] parcelableArray = source.readParcelableArray(g.class.getClassLoader());
        if (parcelableArray != null) {
            listL = new ArrayList();
            for (Parcelable parcelable : parcelableArray) {
                g gVar = (g) parcelable;
                if (gVar != null) {
                    listL.add(gVar);
                }
            }
        } else {
            listL = r.l();
        }
        this.f37264g = listL;
    }

    @Override // e8.d, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final List j() {
        return this.f37264g;
    }

    @Override // e8.d, android.os.Parcelable
    public void writeToParcel(Parcel out, int i10) {
        s.h(out, "out");
        super.writeToParcel(out, i10);
        out.writeParcelableArray((Parcelable[]) this.f37264g.toArray(new g[0]), i10);
    }
}
