package xn;

import com.inmobi.media.core.config.models.AdConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class f0 extends gl.d implements RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f56907d = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h[] f56908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int[] f56909c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void a(long j10, e eVar, int i10, List list, int i11, int i12, List list2) {
            int i13;
            int i14;
            int i15;
            long j11;
            int i16 = i10;
            if (i11 >= i12) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            for (int i17 = i11; i17 < i12; i17++) {
                if (((h) list.get(i17)).D() < i16) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
            }
            h hVar = (h) list.get(i11);
            h hVar2 = (h) list.get(i12 - 1);
            if (i16 == hVar.D()) {
                int iIntValue = ((Number) list2.get(i11)).intValue();
                int i18 = i11 + 1;
                h hVar3 = (h) list.get(i18);
                i13 = i18;
                i14 = iIntValue;
                hVar = hVar3;
            } else {
                i13 = i11;
                i14 = -1;
            }
            if (hVar.j(i16) == hVar2.j(i16)) {
                int iMin = Math.min(hVar.D(), hVar2.D());
                int i19 = 0;
                for (int i20 = i16; i20 < iMin && hVar.j(i20) == hVar2.j(i20); i20++) {
                    i19++;
                }
                long jC = j10 + c(eVar) + ((long) 2) + ((long) i19) + 1;
                eVar.writeInt(-i19);
                eVar.writeInt(i14);
                int i21 = i16 + i19;
                while (i16 < i21) {
                    eVar.writeInt(hVar.j(i16) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                    i16++;
                }
                if (i13 + 1 == i12) {
                    if (i21 != ((h) list.get(i13)).D()) {
                        throw new IllegalStateException("Check failed.");
                    }
                    eVar.writeInt(((Number) list2.get(i13)).intValue());
                    return;
                } else {
                    e eVar2 = new e();
                    eVar.writeInt(((int) (c(eVar2) + jC)) * (-1));
                    a(jC, eVar2, i21, list, i13, i12, list2);
                    eVar.C0(eVar2);
                    return;
                }
            }
            int i22 = 1;
            for (int i23 = i13 + 1; i23 < i12; i23++) {
                if (((h) list.get(i23 - 1)).j(i16) != ((h) list.get(i23)).j(i16)) {
                    i22++;
                }
            }
            long jC2 = j10 + c(eVar) + ((long) 2) + ((long) (i22 * 2));
            eVar.writeInt(i22);
            eVar.writeInt(i14);
            for (int i24 = i13; i24 < i12; i24++) {
                byte bJ = ((h) list.get(i24)).j(i16);
                if (i24 == i13 || bJ != ((h) list.get(i24 - 1)).j(i16)) {
                    eVar.writeInt(bJ & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                }
            }
            e eVar3 = new e();
            while (i13 < i12) {
                byte bJ2 = ((h) list.get(i13)).j(i16);
                int i25 = i13 + 1;
                int i26 = i25;
                while (true) {
                    if (i26 >= i12) {
                        i15 = i12;
                        break;
                    } else {
                        if (bJ2 != ((h) list.get(i26)).j(i16)) {
                            i15 = i26;
                            break;
                        }
                        i26++;
                    }
                }
                if (i25 == i15 && i16 + 1 == ((h) list.get(i13)).D()) {
                    eVar.writeInt(((Number) list2.get(i13)).intValue());
                    j11 = jC2;
                } else {
                    eVar.writeInt(((int) (c(eVar3) + jC2)) * (-1));
                    j11 = jC2;
                    a(j11, eVar3, i16 + 1, list, i13, i15, list2);
                }
                jC2 = j11;
                i13 = i15;
            }
            eVar.C0(eVar3);
        }

        static /* synthetic */ void b(a aVar, long j10, e eVar, int i10, List list, int i11, int i12, List list2, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                j10 = 0;
            }
            aVar.a(j10, eVar, (i13 & 4) != 0 ? 0 : i10, list, (i13 & 16) != 0 ? 0 : i11, (i13 & 32) != 0 ? list.size() : i12, list2);
        }

        private final long c(e eVar) {
            return eVar.size() / ((long) 4);
        }

        public final f0 d(h... byteStrings) {
            kotlin.jvm.internal.s.h(byteStrings, "byteStrings");
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (byteStrings.length == 0) {
                return new f0(new h[0], new int[]{0, -1}, defaultConstructorMarker);
            }
            List listC0 = gl.j.C0(byteStrings);
            gl.r.x(listC0);
            int size = listC0.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(-1);
            }
            int length = byteStrings.length;
            int i11 = 0;
            int i12 = 0;
            while (i11 < length) {
                arrayList.set(gl.r.k(listC0, byteStrings[i11], 0, 0, 6, null), Integer.valueOf(i12));
                i11++;
                i12++;
            }
            if (((h) listC0.get(0)).D() <= 0) {
                throw new IllegalArgumentException("the empty byte string is not a supported option");
            }
            int i13 = 0;
            while (i13 < listC0.size()) {
                h hVar = (h) listC0.get(i13);
                int i14 = i13 + 1;
                int i15 = i14;
                while (i15 < listC0.size()) {
                    h hVar2 = (h) listC0.get(i15);
                    if (!hVar2.E(hVar)) {
                        break;
                    }
                    if (hVar2.D() == hVar.D()) {
                        throw new IllegalArgumentException(("duplicate option: " + hVar2).toString());
                    }
                    if (((Number) arrayList.get(i15)).intValue() > ((Number) arrayList.get(i13)).intValue()) {
                        listC0.remove(i15);
                        ((Number) arrayList.remove(i15)).intValue();
                    } else {
                        i15++;
                    }
                }
                i13 = i14;
            }
            e eVar = new e();
            b(this, 0L, eVar, 0, listC0, 0, 0, arrayList, 53, null);
            int iC = (int) c(eVar);
            int[] iArr = new int[iC];
            for (int i16 = 0; i16 < iC; i16++) {
                iArr[i16] = eVar.readInt();
            }
            Object[] objArrCopyOf = Arrays.copyOf(byteStrings, byteStrings.length);
            kotlin.jvm.internal.s.g(objArrCopyOf, "copyOf(...)");
            return new f0((h[]) objArrCopyOf, iArr, defaultConstructorMarker);
        }

        private a() {
        }
    }

    public /* synthetic */ f0(h[] hVarArr, int[] iArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(hVarArr, iArr);
    }

    public static final f0 r(h... hVarArr) {
        return f56907d.d(hVarArr);
    }

    @Override // gl.b, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof h) {
            return h((h) obj);
        }
        return false;
    }

    @Override // gl.b
    public int d() {
        return this.f56908b.length;
    }

    public /* bridge */ boolean h(h hVar) {
        return super.contains(hVar);
    }

    @Override // gl.d, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof h) {
            return o((h) obj);
        }
        return -1;
    }

    @Override // gl.d, java.util.List
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public h get(int i10) {
        return this.f56908b[i10];
    }

    @Override // gl.d, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof h) {
            return p((h) obj);
        }
        return -1;
    }

    public final h[] m() {
        return this.f56908b;
    }

    public final int[] n() {
        return this.f56909c;
    }

    public /* bridge */ int o(h hVar) {
        return super.indexOf(hVar);
    }

    public /* bridge */ int p(h hVar) {
        return super.lastIndexOf(hVar);
    }

    private f0(h[] hVarArr, int[] iArr) {
        this.f56908b = hVarArr;
        this.f56909c = iArr;
    }
}
