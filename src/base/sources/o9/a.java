package o9;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.List;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends Binder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f48260b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.common.collect.c0 f48261a;

    static {
        f48260b = r0.f48425a >= 30 ? IBinder.getSuggestedMaxIpcSizeBytes() : C.DEFAULT_BUFFER_SEGMENT_SIZE;
    }

    public a(List list) {
        this.f48261a = com.google.common.collect.c0.x(list);
    }

    public static com.google.common.collect.c0 a(IBinder iBinder) {
        int i10;
        com.google.common.collect.c0.a aVarR = com.google.common.collect.c0.r();
        int i11 = 0;
        int i12 = 1;
        while (i12 != 0) {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInt(i11);
                try {
                    iBinder.transact(1, parcelObtain, parcelObtain2, 0);
                    while (true) {
                        i10 = parcelObtain2.readInt();
                        if (i10 == 1) {
                            aVarR.a((Bundle) ob.a.e(parcelObtain2.readBundle()));
                            i11++;
                        }
                    }
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    i12 = i10;
                } catch (RemoteException e10) {
                    throw new RuntimeException(e10);
                }
            } catch (Throwable th2) {
                parcelObtain2.recycle();
                parcelObtain.recycle();
                throw th2;
            }
        }
        return aVarR.m();
    }

    @Override // android.os.Binder
    protected boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return super.onTransact(i10, parcel, parcel2, i11);
        }
        if (parcel2 == null) {
            return false;
        }
        int size = this.f48261a.size();
        int i12 = parcel.readInt();
        while (i12 < size && parcel2.dataSize() < f48260b) {
            parcel2.writeInt(1);
            parcel2.writeBundle((Bundle) this.f48261a.get(i12));
            i12++;
        }
        parcel2.writeInt(i12 < size ? 2 : 0);
        return true;
    }
}
