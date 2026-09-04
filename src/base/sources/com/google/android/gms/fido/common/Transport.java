package com.google.android.gms.fido.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public enum Transport implements ReflectedParcelable {
    BLUETOOTH_CLASSIC("bt"),
    BLUETOOTH_LOW_ENERGY("ble"),
    NFC("nfc"),
    USB("usb"),
    INTERNAL("internal"),
    HYBRID("cable");

    public static final Parcelable.Creator<Transport> CREATOR = new Parcelable.Creator() { // from class: com.google.android.gms.fido.common.zza
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            try {
                return Transport.fromString(parcel.readString());
            } catch (Transport.UnsupportedTransportException e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i10) {
            return new Transport[i10];
        }
    };
    private final String zzb;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class UnsupportedTransportException extends Exception {
        public UnsupportedTransportException(String str) {
            super(str);
        }
    }

    Transport(String str) {
        this.zzb = str;
    }

    public static Transport fromString(String str) throws UnsupportedTransportException {
        for (Transport transport : values()) {
            if (str.equals(transport.zzb)) {
                return transport;
            }
        }
        if (str.equals("hybrid")) {
            return HYBRID;
        }
        throw new UnsupportedTransportException(String.format("Transport %s not supported", str));
    }

    public static List<Transport> parseTransports(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null) {
            return null;
        }
        HashSet hashSet = new HashSet(jSONArray.length());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            String string = jSONArray.getString(i10);
            if (string != null && !string.isEmpty()) {
                try {
                    hashSet.add(fromString(string));
                } catch (UnsupportedTransportException unused) {
                    Log.w("Transport", "Ignoring unrecognized transport ".concat(string));
                }
            }
        }
        return new ArrayList(hashSet);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.zzb;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.zzb);
    }
}
