package com.google.android.gms.internal.measurement;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzabc extends AbstractMap {
    private static final Comparator zza = new zzaaz();
    private final Object[] zzb;
    private final int[] zzc;
    private final Set zzd;
    private Integer zze;
    private String zzf;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.measurement.zzabc, java.util.AbstractMap] */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.internal.measurement.zzabc] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v8 */
    zzabc(zzabc zzabcVar, zzabc zzabcVar2) {
        int i10;
        Object objZza;
        Object[] objArr;
        ?? abstractMap = new AbstractMap();
        abstractMap.zzd = new zzabb(abstractMap, -1);
        abstractMap.zze = null;
        abstractMap.zzf = null;
        int size = zzabcVar.size() + zzabcVar2.size();
        int i11 = zzabcVar.zzc[zzabcVar.size()] + zzabcVar2.zzc[zzabcVar2.size()];
        int i12 = size + 1;
        Object[] objArr2 = new Object[i11];
        int[] iArr = new int[i12];
        int i13 = 0;
        iArr[0] = size;
        Map.Entry entryZzg = zzabcVar.zzg(0);
        Map.Entry entryZzg2 = zzabcVar2.zzg(0);
        int i14 = 0;
        int i15 = 0;
        int iZzd = size;
        Map.Entry entryZzg3 = entryZzg;
        int i16 = 0;
        while (true) {
            int i17 = 1;
            if (entryZzg3 == null && entryZzg2 == null) {
                break;
            }
            i16++;
            if (entryZzg3 != null) {
                if (entryZzg2 != null) {
                    int iCompareTo = ((String) entryZzg3.getKey()).compareTo((String) entryZzg2.getKey());
                    if (iCompareTo == 0) {
                        int i18 = i14 + 1;
                        int i19 = i15 + 1;
                        objArr2[i16] = abstractMap.zzf((String) entryZzg3.getKey(), i16);
                        zzabb zzabbVar = (zzabb) entryZzg3.getValue();
                        zzabb zzabbVar2 = (zzabb) entryZzg2.getValue();
                        int i20 = 0;
                        int i21 = 0;
                        abstractMap = abstractMap;
                        while (true) {
                            if (i20 >= zzabbVar.zzc() - zzabbVar.zzb() && i21 >= zzabbVar2.zzc() - zzabbVar2.zzb()) {
                                break;
                            }
                            int iCompare = i20 == zzabbVar.zzc() - zzabbVar.zzb() ? i17 : i21 == zzabbVar2.zzc() - zzabbVar2.zzb() ? -1 : 0;
                            if (iCompare == 0) {
                                int i22 = zzabe.zza;
                                iCompare = zzabe.zzb.compare(zzabbVar.zza(i20), zzabbVar2.zza(i21));
                            }
                            if (iCompare < 0) {
                                i10 = i20 + 1;
                                objZza = zzabbVar.zza(i20);
                            } else {
                                int i23 = i21 + 1;
                                Object objZza2 = zzabbVar2.zza(i21);
                                i21 = i23;
                                i10 = iCompare == 0 ? i20 + 1 : i20;
                                objZza = objZza2;
                            }
                            objArr2[iZzd] = objZza;
                            i20 = i10;
                            iZzd++;
                            i17 = 1;
                            abstractMap = this;
                        }
                        iArr[i16] = iZzd;
                        entryZzg3 = zzabcVar.zzg(i19);
                        entryZzg2 = zzabcVar2.zzg(i18);
                        i15 = i19;
                        i14 = i18;
                        i13 = 0;
                    } else {
                        if (iCompareTo < 0) {
                        }
                        i13 = 0;
                        abstractMap = this;
                    }
                }
                i15++;
                iZzd = zzd(entryZzg3, i16, iZzd, objArr2, iArr);
                entryZzg3 = zzabcVar.zzg(i15);
                i13 = 0;
                abstractMap = this;
            }
            Map.Entry entry = entryZzg3;
            i14++;
            int iZzd2 = zzd(entryZzg2, i16, iZzd, objArr2, iArr);
            entryZzg2 = zzabcVar2.zzg(i14);
            iZzd = iZzd2;
            entryZzg3 = entry;
            i13 = 0;
            abstractMap = this;
        }
        int i24 = iArr[i13];
        int i25 = i24 - i16;
        if (i25 != 0) {
            for (int i26 = i13; i26 <= i16; i26++) {
                iArr[i26] = iArr[i26] - i25;
            }
            int i27 = iArr[i16];
            int i28 = i27 - i16;
            if (zze(i11, i27)) {
                objArr = new Object[i27];
                System.arraycopy(objArr2, i13, objArr, i13, i16);
            } else {
                objArr = objArr2;
            }
            System.arraycopy(objArr2, i24, objArr, i16, i28);
            objArr2 = objArr;
        }
        abstractMap.zzb = objArr2;
        int i29 = iArr[i13] + 1;
        abstractMap.zzc = zze(i12, i29) ? Arrays.copyOf(iArr, i29) : iArr;
    }

    private final int zzd(Map.Entry entry, int i10, int i11, Object[] objArr, int[] iArr) {
        zzabb zzabbVar = (zzabb) entry.getValue();
        int iZzc = zzabbVar.zzc() - zzabbVar.zzb();
        System.arraycopy(zzabbVar.zzb.zzb, zzabbVar.zzb(), objArr, i11, iZzc);
        objArr[i10] = zzf((String) entry.getKey(), i10);
        int i12 = i11 + iZzc;
        iArr[i10 + 1] = i12;
        return i12;
    }

    private static boolean zze(int i10, int i11) {
        return i10 > 16 && i10 * 9 > i11 * 10;
    }

    private final Map.Entry zzf(String str, int i10) {
        return new AbstractMap.SimpleImmutableEntry(str, new zzabb(this, i10));
    }

    private final Map.Entry zzg(int i10) {
        if (i10 < this.zzc[0]) {
            return (Map.Entry) this.zzb[i10];
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return this.zzd;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        if (this.zze == null) {
            this.zze = Integer.valueOf(super.hashCode());
        }
        return this.zze.intValue();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        if (this.zzf == null) {
            this.zzf = super.toString();
        }
        return this.zzf;
    }

    final /* synthetic */ Object[] zzb() {
        return this.zzb;
    }

    final /* synthetic */ int[] zzc() {
        return this.zzc;
    }

    zzabc(List list) {
        this.zzd = new zzabb(this, -1);
        this.zze = null;
        this.zzf = null;
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            int size = list.size();
            Object[] objArr = new Object[size];
            Iterator it2 = list.iterator();
            if (!it2.hasNext()) {
                int[] iArr = {0};
                this.zzb = zze(size, 0) ? Arrays.copyOf(objArr, 0) : objArr;
                this.zzc = iArr;
                return;
            }
            throw null;
        }
        throw null;
    }
}
