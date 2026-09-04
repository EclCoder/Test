package c;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public interface c extends IInterface {

    /* JADX INFO: renamed from: s2, reason: collision with root package name */
    public static final String f9247s2 = "android$support$customtabs$IEngagementSignalsCallback".replace('$', '.');

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class b {
        /* JADX INFO: Access modifiers changed from: private */
        public static Object b(Parcel parcel, Parcelable.Creator creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }
    }

    void onGreatestScrollPercentageIncreased(int i10, Bundle bundle);

    void onSessionEnded(boolean z10, Bundle bundle);

    void onVerticalScrollEvent(boolean z10, Bundle bundle);

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static abstract class a extends Binder implements c {
        public a() {
            attachInterface(this, c.f9247s2);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            String str = c.f9247s2;
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i10 == 2) {
                onVerticalScrollEvent(parcel.readInt() != 0, (Bundle) b.b(parcel, Bundle.CREATOR));
            } else if (i10 == 3) {
                onGreatestScrollPercentageIncreased(parcel.readInt(), (Bundle) b.b(parcel, Bundle.CREATOR));
            } else {
                if (i10 != 4) {
                    return super.onTransact(i10, parcel, parcel2, i11);
                }
                onSessionEnded(parcel.readInt() != 0, (Bundle) b.b(parcel, Bundle.CREATOR));
            }
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
