package c;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public interface b extends IInterface {

    /* JADX INFO: renamed from: r2, reason: collision with root package name */
    public static final String f9245r2 = "android$support$customtabs$ICustomTabsService".replace('$', '.');

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static abstract class a extends Binder implements b {

        /* JADX INFO: renamed from: c.b$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        private static class C0120a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private IBinder f9246a;

            C0120a(IBinder iBinder) {
                this.f9246a = iBinder;
            }

            @Override // c.b
            public boolean a(c.a aVar, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f9245r2);
                    parcelObtain.writeStrongInterface(aVar);
                    C0121b.d(parcelObtain, bundle, 0);
                    this.f9246a.transact(10, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f9246a;
            }

            @Override // c.b
            public boolean e(c.a aVar) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f9245r2);
                    parcelObtain.writeStrongInterface(aVar);
                    this.f9246a.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // c.b
            public boolean h(c.a aVar, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f9245r2);
                    parcelObtain.writeStrongInterface(aVar);
                    C0121b.d(parcelObtain, bundle, 0);
                    this.f9246a.transact(13, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // c.b
            public boolean k(c.a aVar, Uri uri, Bundle bundle, List list) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f9245r2);
                    parcelObtain.writeStrongInterface(aVar);
                    C0121b.d(parcelObtain, uri, 0);
                    C0121b.d(parcelObtain, bundle, 0);
                    C0121b.c(parcelObtain, list, 0);
                    this.f9246a.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // c.b
            public int l(c.a aVar, String str, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f9245r2);
                    parcelObtain.writeStrongInterface(aVar);
                    parcelObtain.writeString(str);
                    C0121b.d(parcelObtain, bundle, 0);
                    this.f9246a.transact(8, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // c.b
            public boolean p(long j10) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f9245r2);
                    parcelObtain.writeLong(j10);
                    this.f9246a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // c.b
            public boolean q(c.a aVar, Uri uri) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f9245r2);
                    parcelObtain.writeStrongInterface(aVar);
                    C0121b.d(parcelObtain, uri, 0);
                    this.f9246a.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // c.b
            public boolean w(c.a aVar, IBinder iBinder, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f9245r2);
                    parcelObtain.writeStrongInterface(aVar);
                    parcelObtain.writeStrongBinder(iBinder);
                    C0121b.d(parcelObtain, bundle, 0);
                    this.f9246a.transact(14, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // c.b
            public boolean z(c.a aVar, Uri uri, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f9245r2);
                    parcelObtain.writeStrongInterface(aVar);
                    C0121b.d(parcelObtain, uri, 0);
                    C0121b.d(parcelObtain, bundle, 0);
                    this.f9246a.transact(11, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public static b B(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(b.f9245r2);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof b)) ? new C0120a(iBinder) : (b) iInterfaceQueryLocalInterface;
        }
    }

    /* JADX INFO: renamed from: c.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class C0121b {
        /* JADX INFO: Access modifiers changed from: private */
        public static void c(Parcel parcel, List list, int i10) {
            if (list == null) {
                parcel.writeInt(-1);
                return;
            }
            int size = list.size();
            parcel.writeInt(size);
            for (int i11 = 0; i11 < size; i11++) {
                d(parcel, (Parcelable) list.get(i11), i10);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void d(Parcel parcel, Parcelable parcelable, int i10) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcelable.writeToParcel(parcel, i10);
            }
        }
    }

    boolean a(c.a aVar, Bundle bundle);

    boolean e(c.a aVar);

    boolean h(c.a aVar, Bundle bundle);

    boolean k(c.a aVar, Uri uri, Bundle bundle, List list);

    int l(c.a aVar, String str, Bundle bundle);

    boolean p(long j10);

    boolean q(c.a aVar, Uri uri);

    boolean w(c.a aVar, IBinder iBinder, Bundle bundle);

    boolean z(c.a aVar, Uri uri, Bundle bundle);
}
