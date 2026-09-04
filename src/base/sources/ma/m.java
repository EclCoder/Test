package ma;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.z0;
import com.google.common.collect.c0;
import java.util.ArrayList;
import java.util.List;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class m extends i {
    public static final Parcelable.Creator<m> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f45404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f45405c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c0 f45406d;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public m createFromParcel(Parcel parcel) {
            return new m(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public m[] newArray(int i10) {
            return new m[i10];
        }
    }

    /* synthetic */ m(Parcel parcel, a aVar) {
        this(parcel);
    }

    private static List a(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
                return arrayList;
            }
            if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                return arrayList;
            }
            if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m.class == obj.getClass()) {
            m mVar = (m) obj;
            if (r0.c(this.f45393a, mVar.f45393a) && r0.c(this.f45404b, mVar.f45404b) && this.f45406d.equals(mVar.f45406d)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (527 + this.f45393a.hashCode()) * 31;
        String str = this.f45404b;
        return ((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.f45406d.hashCode();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // ha.a.b
    public void r(z0.b bVar) {
        String str = this.f45393a;
        str.getClass();
        byte b10 = -1;
        switch (str.hashCode()) {
            case 82815:
                if (str.equals("TAL")) {
                    b10 = 0;
                }
                break;
            case 82878:
                if (str.equals("TCM")) {
                    b10 = 1;
                }
                break;
            case 82897:
                if (str.equals("TDA")) {
                    b10 = 2;
                }
                break;
            case 83253:
                if (str.equals("TP1")) {
                    b10 = 3;
                }
                break;
            case 83254:
                if (str.equals("TP2")) {
                    b10 = 4;
                }
                break;
            case 83255:
                if (str.equals("TP3")) {
                    b10 = 5;
                }
                break;
            case 83341:
                if (str.equals("TRK")) {
                    b10 = 6;
                }
                break;
            case 83378:
                if (str.equals("TT2")) {
                    b10 = 7;
                }
                break;
            case 83536:
                if (str.equals("TXT")) {
                    b10 = 8;
                }
                break;
            case 83552:
                if (str.equals("TYE")) {
                    b10 = 9;
                }
                break;
            case 2567331:
                if (str.equals("TALB")) {
                    b10 = 10;
                }
                break;
            case 2569357:
                if (str.equals("TCOM")) {
                    b10 = 11;
                }
                break;
            case 2569891:
                if (str.equals("TDAT")) {
                    b10 = 12;
                }
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    b10 = 13;
                }
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    b10 = 14;
                }
                break;
            case 2571565:
                if (str.equals("TEXT")) {
                    b10 = 15;
                }
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    b10 = 16;
                }
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    b10 = 17;
                }
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    b10 = 18;
                }
                break;
            case 2581514:
                if (str.equals("TPE3")) {
                    b10 = 19;
                }
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    b10 = 20;
                }
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    b10 = 21;
                }
                break;
        }
        try {
            switch (b10) {
                case 0:
                case 10:
                    bVar.N((CharSequence) this.f45406d.get(0));
                    break;
                case 1:
                case 11:
                    bVar.S((CharSequence) this.f45406d.get(0));
                    break;
                case 2:
                case 12:
                    String str2 = (String) this.f45406d.get(0);
                    bVar.f0(Integer.valueOf(Integer.parseInt(str2.substring(2, 4)))).e0(Integer.valueOf(Integer.parseInt(str2.substring(0, 2))));
                    break;
                case 3:
                case 17:
                    bVar.O((CharSequence) this.f45406d.get(0));
                    break;
                case 4:
                case 18:
                    bVar.M((CharSequence) this.f45406d.get(0));
                    break;
                case 5:
                case 19:
                    bVar.T((CharSequence) this.f45406d.get(0));
                    break;
                case 6:
                case 20:
                    String[] strArrY0 = r0.Y0((String) this.f45406d.get(0), "/");
                    bVar.p0(Integer.valueOf(Integer.parseInt(strArrY0[0]))).o0(strArrY0.length > 1 ? Integer.valueOf(Integer.parseInt(strArrY0[1])) : null);
                    break;
                case 7:
                case 16:
                    bVar.m0((CharSequence) this.f45406d.get(0));
                    break;
                case 8:
                case 15:
                    bVar.r0((CharSequence) this.f45406d.get(0));
                    break;
                case 9:
                case 21:
                    bVar.g0(Integer.valueOf(Integer.parseInt((String) this.f45406d.get(0))));
                    break;
                case 13:
                    List listA = a((String) this.f45406d.get(0));
                    int size = listA.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                bVar.e0((Integer) listA.get(2));
                            }
                        }
                        bVar.f0((Integer) listA.get(1));
                    }
                    bVar.g0((Integer) listA.get(0));
                    break;
                case 14:
                    List listA2 = a((String) this.f45406d.get(0));
                    int size2 = listA2.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                bVar.h0((Integer) listA2.get(2));
                            }
                        }
                        bVar.i0((Integer) listA2.get(1));
                    }
                    bVar.j0((Integer) listA2.get(0));
                    break;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    @Override // ma.i
    public String toString() {
        return this.f45393a + ": description=" + this.f45404b + ": values=" + this.f45406d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f45393a);
        parcel.writeString(this.f45404b);
        parcel.writeStringArray((String[]) this.f45406d.toArray(new String[0]));
    }

    public m(String str, String str2, List list) {
        super(str);
        ob.a.a(!list.isEmpty());
        this.f45404b = str2;
        c0 c0VarX = c0.x(list);
        this.f45406d = c0VarX;
        this.f45405c = (String) c0VarX.get(0);
    }

    private m(Parcel parcel) {
        this((String) ob.a.e(parcel.readString()), parcel.readString(), c0.z((String[]) ob.a.e(parcel.createStringArray())));
    }
}
