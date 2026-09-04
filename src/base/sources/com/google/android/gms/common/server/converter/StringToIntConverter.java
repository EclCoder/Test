package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class StringToIntConverter extends AbstractSafeParcelable implements FastJsonResponse.FieldConverter<String, Integer> {
    public static final Parcelable.Creator<StringToIntConverter> CREATOR = new zad();
    final int zaa;
    private final HashMap zab;
    private final SparseArray zac;

    public StringToIntConverter() {
        this.zaa = 1;
        this.zab = new HashMap();
        this.zac = new SparseArray();
    }

    public StringToIntConverter add(String str, int i10) {
        this.zab.put(str, Integer.valueOf(i10));
        this.zac.put(i10, str);
        return this;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.zaa;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i11);
        ArrayList arrayList = new ArrayList();
        for (String str : this.zab.keySet()) {
            arrayList.add(new zac(str, ((Integer) this.zab.get(str)).intValue()));
        }
        SafeParcelWriter.writeTypedList(parcel, 2, arrayList, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse.FieldConverter
    public final int zaa() {
        return 7;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse.FieldConverter
    public final int zab() {
        return 0;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse.FieldConverter
    public final /* bridge */ /* synthetic */ Object zac(Object obj) {
        Integer num = (Integer) this.zab.get((String) obj);
        return num == null ? (Integer) this.zab.get("gms_unknown") : num;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse.FieldConverter
    public final /* bridge */ /* synthetic */ Object zad(Object obj) {
        String str = (String) this.zac.get(((Integer) obj).intValue());
        return (str == null && this.zab.containsKey("gms_unknown")) ? "gms_unknown" : str;
    }

    StringToIntConverter(int i10, ArrayList arrayList) {
        this.zaa = i10;
        this.zab = new HashMap();
        this.zac = new SparseArray();
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            zac zacVar = (zac) arrayList.get(i11);
            add(zacVar.zab, zacVar.zac);
        }
    }
}
