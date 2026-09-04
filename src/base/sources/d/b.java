package d;

import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final boolean f36028a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Handler f36029b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    d.a f36030c;

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

    /* JADX INFO: renamed from: d.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class BinderC0541b extends d.a.AbstractBinderC0539a {
        BinderC0541b() {
        }

        @Override // d.a
        public void n(int i10, Bundle bundle) {
            b bVar = b.this;
            Handler handler = bVar.f36029b;
            if (handler != null) {
                handler.post(bVar.new c(i10, bundle));
            } else {
                bVar.a(i10, bundle);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f36032a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Bundle f36033b;

        c(int i10, Bundle bundle) {
            this.f36032a = i10;
            this.f36033b = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.a(this.f36032a, this.f36033b);
        }
    }

    b(Parcel parcel) {
        this.f36030c = d.a.AbstractBinderC0539a.B(parcel.readStrongBinder());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        synchronized (this) {
            try {
                if (this.f36030c == null) {
                    this.f36030c = new BinderC0541b();
                }
                parcel.writeStrongBinder(this.f36030c.asBinder());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    protected void a(int i10, Bundle bundle) {
    }
}
