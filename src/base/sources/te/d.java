package te;

import com.inmobi.media.core.config.models.AdConfig;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final String[] f53320b = {"UPPER", "LOWER", "DIGIT", "MIXED", "PUNCT"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final int[][] f53321c = {new int[]{0, 327708, 327710, 327709, 656318}, new int[]{590318, 0, 327710, 327709, 656318}, new int[]{262158, 590300, 0, 590301, 932798}, new int[]{327709, 327708, 656318, 0, 327710}, new int[]{327711, 656380, 656382, 656381, 0}};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[][] f53322d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final int[][] f53323e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f53324a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(f fVar, f fVar2) {
            return fVar.d() - fVar2.d();
        }
    }

    static {
        Class cls = Integer.TYPE;
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) cls, 5, 256);
        f53322d = iArr;
        iArr[0][32] = 1;
        for (int i10 = 65; i10 <= 90; i10++) {
            f53322d[0][i10] = i10 - 63;
        }
        f53322d[1][32] = 1;
        for (int i11 = 97; i11 <= 122; i11++) {
            f53322d[1][i11] = i11 - 95;
        }
        f53322d[2][32] = 1;
        for (int i12 = 48; i12 <= 57; i12++) {
            f53322d[2][i12] = i12 - 46;
        }
        int[] iArr2 = f53322d[2];
        iArr2[44] = 12;
        iArr2[46] = 13;
        int[] iArr3 = {0, 32, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 27, 28, 29, 30, 31, 64, 92, 94, 95, 96, Sdk$SDKError.b.INVALID_LOG_ERROR_ENDPOINT_VALUE, Sdk$SDKError.b.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, Sdk$SDKError.b.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE};
        for (int i13 = 0; i13 < 28; i13++) {
            f53322d[3][iArr3[i13]] = i13;
        }
        int[] iArr4 = {0, 13, 0, 0, 0, 0, 33, 39, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 58, 59, 60, 61, 62, 63, 91, 93, Sdk$SDKError.b.INVALID_RI_ENDPOINT_VALUE, Sdk$SDKError.b.INVALID_METRICS_ENDPOINT_VALUE};
        for (int i14 = 0; i14 < 31; i14++) {
            int i15 = iArr4[i14];
            if (i15 > 0) {
                f53322d[4][i15] = i14;
            }
        }
        int[][] iArr5 = (int[][]) Array.newInstance((Class<?>) cls, 6, 6);
        f53323e = iArr5;
        for (int[] iArr6 : iArr5) {
            Arrays.fill(iArr6, -1);
        }
        int[][] iArr7 = f53323e;
        iArr7[0][4] = 0;
        int[] iArr8 = iArr7[1];
        iArr8[4] = 0;
        iArr8[0] = 28;
        iArr7[3][4] = 0;
        int[] iArr9 = iArr7[2];
        iArr9[4] = 0;
        iArr9[0] = 15;
    }

    public d(byte[] bArr) {
        this.f53324a = bArr;
    }

    private static Collection b(Iterable iterable) {
        LinkedList linkedList = new LinkedList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            f fVar = (f) it.next();
            Iterator it2 = linkedList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    linkedList.add(fVar);
                    break;
                }
                f fVar2 = (f) it2.next();
                if (fVar2.f(fVar)) {
                    break;
                }
                if (fVar.f(fVar2)) {
                    it2.remove();
                }
            }
        }
        return linkedList;
    }

    private void c(f fVar, int i10, Collection collection) {
        char c10 = (char) (this.f53324a[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
        boolean z10 = f53322d[fVar.e()][c10] > 0;
        f fVarB = null;
        for (int i11 = 0; i11 <= 4; i11++) {
            int i12 = f53322d[i11][c10];
            if (i12 > 0) {
                if (fVarB == null) {
                    fVarB = fVar.b(i10);
                }
                if (!z10 || i11 == fVar.e() || i11 == 2) {
                    collection.add(fVarB.g(i11, i12));
                }
                if (!z10 && f53323e[fVar.e()][i11] >= 0) {
                    collection.add(fVarB.h(i11, i12));
                }
            }
        }
        if (fVar.c() > 0 || f53322d[fVar.e()][c10] == 0) {
            collection.add(fVar.a(i10));
        }
    }

    private static void d(f fVar, int i10, int i11, Collection collection) {
        f fVarB = fVar.b(i10);
        collection.add(fVarB.g(4, i11));
        if (fVar.e() != 4) {
            collection.add(fVarB.h(4, i11));
        }
        if (i11 == 3 || i11 == 4) {
            collection.add(fVarB.g(2, 16 - i11).g(2, 1));
        }
        if (fVar.c() > 0) {
            collection.add(fVar.a(i10).a(i10 + 1));
        }
    }

    private Collection e(Iterable iterable, int i10) {
        LinkedList linkedList = new LinkedList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            c((f) it.next(), i10, linkedList);
        }
        return b(linkedList);
    }

    private static Collection f(Iterable iterable, int i10, int i11) {
        LinkedList linkedList = new LinkedList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            d((f) it.next(), i10, i11, linkedList);
        }
        return b(linkedList);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x002a  */
    public ue.a a() {
        int i10;
        Collection collectionSingletonList = Collections.singletonList(f.f53328e);
        int i11 = 0;
        while (true) {
            byte[] bArr = this.f53324a;
            if (i11 >= bArr.length) {
                return ((f) Collections.min(collectionSingletonList, new a())).i(this.f53324a);
            }
            int i12 = i11 + 1;
            byte b10 = i12 < bArr.length ? bArr[i12] : (byte) 0;
            byte b11 = bArr[i11];
            if (b11 != 13) {
                if (b11 != 44) {
                    if (b11 != 46) {
                        if (b11 == 58 && b10 == 32) {
                            i10 = 5;
                        } else {
                            i10 = 0;
                        }
                    } else if (b10 == 32) {
                        i10 = 3;
                    } else {
                        i10 = 0;
                    }
                } else if (b10 == 32) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
            } else if (b10 == 10) {
                i10 = 2;
            } else {
                i10 = 0;
            }
            if (i10 > 0) {
                collectionSingletonList = f(collectionSingletonList, i11, i10);
                i11 = i12;
            } else {
                collectionSingletonList = e(collectionSingletonList, i11);
            }
            i11++;
        }
    }
}
