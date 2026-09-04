package rb;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import z8.b;
import z8.c;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public interface a extends IInterface {

    /* JADX INFO: renamed from: rb.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static abstract class AbstractBinderC0789a extends b implements a {

        /* JADX INFO: renamed from: rb.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static class C0790a extends z8.a implements a {
            C0790a(IBinder iBinder) {
                super(iBinder);
            }

            @Override // rb.a
            public final Bundle g(Bundle bundle) {
                Parcel parcelB = B();
                c.b(parcelB, bundle);
                Parcel parcelC = C(parcelB);
                Bundle bundle2 = (Bundle) c.a(parcelC, Bundle.CREATOR);
                parcelC.recycle();
                return bundle2;
            }
        }

        public static a B(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            return iInterfaceQueryLocalInterface instanceof a ? (a) iInterfaceQueryLocalInterface : new C0790a(iBinder);
        }
    }

    Bundle g(Bundle bundle);
}
