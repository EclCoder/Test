package com.google.android.exoplayer2.drm;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class h implements Comparator, Parcelable {
    public static final Parcelable.Creator<h> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b[] f16854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f16855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f16856c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f16857d;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public h createFromParcel(Parcel parcel) {
            return new h(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public h[] newArray(int i10) {
            return new h[i10];
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f16858a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final UUID f16859b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f16860c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f16861d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final byte[] f16862e;

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

        public b(UUID uuid, String str, byte[] bArr) {
            this(uuid, null, str, bArr);
        }

        public boolean a(b bVar) {
            return c() && !bVar.c() && e(bVar.f16859b);
        }

        public b b(byte[] bArr) {
            return new b(this.f16859b, this.f16860c, this.f16861d, bArr);
        }

        public boolean c() {
            return this.f16862e != null;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean e(UUID uuid) {
            return o9.b.f48262a.equals(this.f16859b) || uuid.equals(this.f16859b);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            b bVar = (b) obj;
            return r0.c(this.f16860c, bVar.f16860c) && r0.c(this.f16861d, bVar.f16861d) && r0.c(this.f16859b, bVar.f16859b) && Arrays.equals(this.f16862e, bVar.f16862e);
        }

        public int hashCode() {
            if (this.f16858a == 0) {
                int iHashCode = this.f16859b.hashCode() * 31;
                String str = this.f16860c;
                this.f16858a = ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f16861d.hashCode()) * 31) + Arrays.hashCode(this.f16862e);
            }
            return this.f16858a;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeLong(this.f16859b.getMostSignificantBits());
            parcel.writeLong(this.f16859b.getLeastSignificantBits());
            parcel.writeString(this.f16860c);
            parcel.writeString(this.f16861d);
            parcel.writeByteArray(this.f16862e);
        }

        public b(UUID uuid, String str, String str2, byte[] bArr) {
            this.f16859b = (UUID) ob.a.e(uuid);
            this.f16860c = str;
            this.f16861d = (String) ob.a.e(str2);
            this.f16862e = bArr;
        }

        b(Parcel parcel) {
            this.f16859b = new UUID(parcel.readLong(), parcel.readLong());
            this.f16860c = parcel.readString();
            this.f16861d = (String) r0.j(parcel.readString());
            this.f16862e = parcel.createByteArray();
        }
    }

    public h(List list) {
        this(null, false, (b[]) list.toArray(new b[0]));
    }

    private static boolean b(ArrayList arrayList, int i10, UUID uuid) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (((b) arrayList.get(i11)).f16859b.equals(uuid)) {
                return true;
            }
        }
        return false;
    }

    public static h e(h hVar, h hVar2) {
        String str;
        ArrayList arrayList = new ArrayList();
        if (hVar != null) {
            str = hVar.f16856c;
            for (b bVar : hVar.f16854a) {
                if (bVar.c()) {
                    arrayList.add(bVar);
                }
            }
        } else {
            str = null;
        }
        if (hVar2 != null) {
            if (str == null) {
                str = hVar2.f16856c;
            }
            int size = arrayList.size();
            for (b bVar2 : hVar2.f16854a) {
                if (bVar2.c() && !b(arrayList, size, bVar2.f16859b)) {
                    arrayList.add(bVar2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new h(str, arrayList);
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(b bVar, b bVar2) {
        UUID uuid = o9.b.f48262a;
        if (uuid.equals(bVar.f16859b)) {
            return uuid.equals(bVar2.f16859b) ? 0 : 1;
        }
        return bVar.f16859b.compareTo(bVar2.f16859b);
    }

    public h c(String str) {
        return r0.c(this.f16856c, str) ? this : new h(str, false, this.f16854a);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && h.class == obj.getClass()) {
            h hVar = (h) obj;
            if (r0.c(this.f16856c, hVar.f16856c) && Arrays.equals(this.f16854a, hVar.f16854a)) {
                return true;
            }
        }
        return false;
    }

    public b f(int i10) {
        return this.f16854a[i10];
    }

    public h g(h hVar) {
        String str;
        String str2 = this.f16856c;
        ob.a.g(str2 == null || (str = hVar.f16856c) == null || TextUtils.equals(str2, str));
        String str3 = this.f16856c;
        if (str3 == null) {
            str3 = hVar.f16856c;
        }
        return new h(str3, (b[]) r0.L0(this.f16854a, hVar.f16854a));
    }

    public int hashCode() {
        if (this.f16855b == 0) {
            String str = this.f16856c;
            this.f16855b = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f16854a);
        }
        return this.f16855b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f16856c);
        parcel.writeTypedArray(this.f16854a, 0);
    }

    public h(String str, List list) {
        this(str, false, (b[]) list.toArray(new b[0]));
    }

    public h(b... bVarArr) {
        this((String) null, bVarArr);
    }

    public h(String str, b... bVarArr) {
        this(str, true, bVarArr);
    }

    private h(String str, boolean z10, b... bVarArr) {
        this.f16856c = str;
        bVarArr = z10 ? (b[]) bVarArr.clone() : bVarArr;
        this.f16854a = bVarArr;
        this.f16857d = bVarArr.length;
        Arrays.sort(bVarArr, this);
    }

    h(Parcel parcel) {
        this.f16856c = parcel.readString();
        b[] bVarArr = (b[]) r0.j((b[]) parcel.createTypedArray(b.CREATOR));
        this.f16854a = bVarArr;
        this.f16857d = bVarArr.length;
    }
}
