package com.google.android.gms.common.data;

import android.content.ContentValues;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class DataBufferSafeParcelable<T extends SafeParcelable> extends AbstractDataBuffer<T> {
    private static final String[] zaa = {DataSchemeDataSource.SCHEME_DATA};
    private final Parcelable.Creator zab;

    public DataBufferSafeParcelable(DataHolder dataHolder, Parcelable.Creator<T> creator) {
        super(dataHolder);
        this.zab = creator;
    }

    public static <T extends SafeParcelable> void addValue(DataHolder.Builder builder, T t10) {
        Parcel parcelObtain = Parcel.obtain();
        t10.writeToParcel(parcelObtain, 0);
        ContentValues contentValues = new ContentValues();
        contentValues.put(DataSchemeDataSource.SCHEME_DATA, parcelObtain.marshall());
        builder.withRow(contentValues);
        parcelObtain.recycle();
    }

    public static DataHolder.Builder buildDataHolder() {
        return DataHolder.builder(zaa);
    }

    @Override // com.google.android.gms.common.data.AbstractDataBuffer, com.google.android.gms.common.data.DataBuffer
    public T get(int i10) {
        DataHolder dataHolder = (DataHolder) Preconditions.checkNotNull(this.mDataHolder);
        byte[] byteArray = dataHolder.getByteArray(DataSchemeDataSource.SCHEME_DATA, i10, dataHolder.getWindowIndex(i10));
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.unmarshall(byteArray, 0, byteArray.length);
        parcelObtain.setDataPosition(0);
        T t10 = (T) this.zab.createFromParcel(parcelObtain);
        parcelObtain.recycle();
        return t10;
    }
}
