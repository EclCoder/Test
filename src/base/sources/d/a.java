package d;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public interface a extends IInterface {

    /* JADX INFO: renamed from: v2, reason: collision with root package name */
    public static final String f36026v2 = "android$support$v4$os$IResultReceiver".replace('$', '.');

    void n(int i10, Bundle bundle);

    /* JADX INFO: renamed from: d.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static abstract class AbstractBinderC0539a extends Binder implements a {

        /* JADX INFO: renamed from: d.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        private static class C0540a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private IBinder f36027a;

            C0540a(IBinder iBinder) {
                this.f36027a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f36027a;
            }
        }

        public AbstractBinderC0539a() {
            attachInterface(this, a.f36026v2);
        }

        public static a B(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(a.f36026v2);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof a)) ? new C0540a(iBinder) : (a) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            String str = a.f36026v2;
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i10 != 1) {
                return super.onTransact(i10, parcel, parcel2, i11);
            }
            n(parcel.readInt(), (Bundle) parcel.readTypedObject(Bundle.CREATOR));
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
