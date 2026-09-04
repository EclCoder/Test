package c3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.c0;
import java.util.ArrayList;
import java.util.List;
import t1.t;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class n extends i {
    public static final Parcelable.Creator<n> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f9539c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c0 f9540d;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public n createFromParcel(Parcel parcel) {
            return new n(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public n[] newArray(int i10) {
            return new n[i10];
        }
    }

    /* synthetic */ n(Parcel parcel, a aVar) {
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

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // t1.u.b
    public void d(t.b bVar) {
        String str = this.f9526a;
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
            case 2569358:
                if (str.equals("TCON")) {
                    b10 = 12;
                }
                break;
            case 2569891:
                if (str.equals("TDAT")) {
                    b10 = 13;
                }
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    b10 = 14;
                }
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    b10 = 15;
                }
                break;
            case 2571565:
                if (str.equals("TEXT")) {
                    b10 = 16;
                }
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    b10 = 17;
                }
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    b10 = 18;
                }
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    b10 = 19;
                }
                break;
            case 2581514:
                if (str.equals("TPE3")) {
                    b10 = 20;
                }
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    b10 = 21;
                }
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    b10 = 22;
                }
                break;
        }
        try {
            switch (b10) {
                case 0:
                case 10:
                    bVar.O((CharSequence) this.f9540d.get(0));
                    break;
                case 1:
                case 11:
                    bVar.T((CharSequence) this.f9540d.get(0));
                    break;
                case 2:
                case 13:
                    String str2 = (String) this.f9540d.get(0);
                    bVar.g0(Integer.valueOf(Integer.parseInt(str2.substring(2, 4)))).f0(Integer.valueOf(Integer.parseInt(str2.substring(0, 2))));
                    break;
                case 3:
                case 18:
                    bVar.P((CharSequence) this.f9540d.get(0));
                    break;
                case 4:
                case 19:
                    bVar.N((CharSequence) this.f9540d.get(0));
                    break;
                case 5:
                case 20:
                    bVar.U((CharSequence) this.f9540d.get(0));
                    break;
                case 6:
                case 21:
                    String[] strArrU0 = w1.c0.U0((String) this.f9540d.get(0), "/");
                    bVar.q0(Integer.valueOf(Integer.parseInt(strArrU0[0]))).p0(strArrU0.length > 1 ? Integer.valueOf(Integer.parseInt(strArrU0[1])) : null);
                    break;
                case 7:
                case 17:
                    bVar.n0((CharSequence) this.f9540d.get(0));
                    break;
                case 8:
                case 16:
                    bVar.r0((CharSequence) this.f9540d.get(0));
                    break;
                case 9:
                case 22:
                    bVar.h0(Integer.valueOf(Integer.parseInt((String) this.f9540d.get(0))));
                    break;
                case 12:
                    Integer numO = com.google.common.primitives.g.o((String) this.f9540d.get(0));
                    if (numO != null) {
                        String strA = j.a(numO.intValue());
                        if (strA != null) {
                            bVar.b0(strA);
                        }
                    } else {
                        bVar.b0((CharSequence) this.f9540d.get(0));
                    }
                    break;
                case 14:
                    List listA = a((String) this.f9540d.get(0));
                    int size = listA.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                bVar.f0((Integer) listA.get(2));
                            }
                        }
                        bVar.g0((Integer) listA.get(1));
                    }
                    bVar.h0((Integer) listA.get(0));
                    break;
                case 15:
                    List listA2 = a((String) this.f9540d.get(0));
                    int size2 = listA2.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                bVar.i0((Integer) listA2.get(2));
                            }
                        }
                        bVar.j0((Integer) listA2.get(1));
                    }
                    bVar.k0((Integer) listA2.get(0));
                    break;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n.class == obj.getClass()) {
            n nVar = (n) obj;
            if (w1.c0.c(this.f9526a, nVar.f9526a) && w1.c0.c(this.f9538b, nVar.f9538b) && this.f9540d.equals(nVar.f9540d)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (527 + this.f9526a.hashCode()) * 31;
        String str = this.f9538b;
        return ((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.f9540d.hashCode();
    }

    @Override // c3.i
    public String toString() {
        return this.f9526a + ": description=" + this.f9538b + ": values=" + this.f9540d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f9526a);
        parcel.writeString(this.f9538b);
        parcel.writeStringArray((String[]) this.f9540d.toArray(new String[0]));
    }

    public n(String str, String str2, List list) {
        super(str);
        w1.a.a(!list.isEmpty());
        this.f9538b = str2;
        c0 c0VarX = c0.x(list);
        this.f9540d = c0VarX;
        this.f9539c = (String) c0VarX.get(0);
    }

    private n(Parcel parcel) {
        this((String) w1.a.e(parcel.readString()), parcel.readString(), c0.z((String[]) w1.a.e(parcel.createStringArray())));
    }
}
