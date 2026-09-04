package e8;

import android.os.Parcel;
import android.os.Parcelable;
import gl.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class j extends d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f37277g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final c f37276h = new c(null);
    public static final Parcelable.Creator<j> CREATOR = new b();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a extends d.a {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final List f37278g = new ArrayList();

        public final a n(i iVar) {
            if (iVar != null) {
                this.f37278g.add(new i.a().i(iVar).d());
            }
            return this;
        }

        public final a o(List list) {
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    n((i) it.next());
                }
            }
            return this;
        }

        public j p() {
            return new j(this, null);
        }

        public final List q() {
            return this.f37278g;
        }

        public a r(j jVar) {
            return jVar == null ? this : ((a) super.g(jVar)).o(jVar.j());
        }

        public final a s(List list) {
            this.f37278g.clear();
            o(list);
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b implements Parcelable.Creator {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public j createFromParcel(Parcel parcel) {
            s.h(parcel, "parcel");
            return new j(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public j[] newArray(int i10) {
            return new j[i10];
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

    public /* synthetic */ j(a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }

    @Override // e8.d, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final List j() {
        return this.f37277g;
    }

    @Override // e8.d, android.os.Parcelable
    public void writeToParcel(Parcel out, int i10) {
        s.h(out, "out");
        super.writeToParcel(out, i10);
        i.a.f37271g.b(out, i10, this.f37277g);
    }

    private j(a aVar) {
        super(aVar);
        this.f37277g = r.I0(aVar.q());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Parcel parcel) {
        super(parcel);
        s.h(parcel, "parcel");
        this.f37277g = r.I0(i.a.f37271g.a(parcel));
    }
}
