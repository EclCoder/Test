package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
class a extends VersionedParcel {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final SparseIntArray f7582d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Parcel f7583e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f7584f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f7585g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f7586h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f7587i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f7588j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f7589k;

    a(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new androidx.collection.a(), new androidx.collection.a(), new androidx.collection.a());
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void A(byte[] bArr) {
        if (bArr == null) {
            this.f7583e.writeInt(-1);
        } else {
            this.f7583e.writeInt(bArr.length);
            this.f7583e.writeByteArray(bArr);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    protected void C(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f7583e, 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void E(int i10) {
        this.f7583e.writeInt(i10);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void G(Parcelable parcelable) {
        this.f7583e.writeParcelable(parcelable, 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void I(String str) {
        this.f7583e.writeString(str);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void a() {
        int i10 = this.f7587i;
        if (i10 >= 0) {
            int i11 = this.f7582d.get(i10);
            int iDataPosition = this.f7583e.dataPosition();
            this.f7583e.setDataPosition(i11);
            this.f7583e.writeInt(iDataPosition - i11);
            this.f7583e.setDataPosition(iDataPosition);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    protected VersionedParcel b() {
        Parcel parcel = this.f7583e;
        int iDataPosition = parcel.dataPosition();
        int i10 = this.f7588j;
        if (i10 == this.f7584f) {
            i10 = this.f7585g;
        }
        return new a(parcel, iDataPosition, i10, this.f7586h + "  ", this.f7579a, this.f7580b, this.f7581c);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public boolean g() {
        return this.f7583e.readInt() != 0;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public byte[] i() {
        int i10 = this.f7583e.readInt();
        if (i10 < 0) {
            return null;
        }
        byte[] bArr = new byte[i10];
        this.f7583e.readByteArray(bArr);
        return bArr;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    protected CharSequence k() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f7583e);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public boolean m(int i10) {
        while (this.f7588j < this.f7585g) {
            int i11 = this.f7589k;
            if (i11 == i10) {
                return true;
            }
            if (String.valueOf(i11).compareTo(String.valueOf(i10)) > 0) {
                return false;
            }
            this.f7583e.setDataPosition(this.f7588j);
            int i12 = this.f7583e.readInt();
            this.f7589k = this.f7583e.readInt();
            this.f7588j += i12;
        }
        return this.f7589k == i10;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public int o() {
        return this.f7583e.readInt();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public Parcelable q() {
        return this.f7583e.readParcelable(getClass().getClassLoader());
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public String s() {
        return this.f7583e.readString();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void w(int i10) {
        a();
        this.f7587i = i10;
        this.f7582d.put(i10, this.f7583e.dataPosition());
        E(0);
        E(i10);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void y(boolean z10) {
        this.f7583e.writeInt(z10 ? 1 : 0);
    }

    private a(Parcel parcel, int i10, int i11, String str, androidx.collection.a aVar, androidx.collection.a aVar2, androidx.collection.a aVar3) {
        super(aVar, aVar2, aVar3);
        this.f7582d = new SparseIntArray();
        this.f7587i = -1;
        this.f7589k = -1;
        this.f7583e = parcel;
        this.f7584f = i10;
        this.f7585g = i11;
        this.f7588j = i10;
        this.f7586h = str;
    }
}
