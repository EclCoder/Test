package com.google.android.gms.internal.ads;

import com.bytedance.adsdk.ugeno.dkl.Rmg.PvZsvNiPV;
import com.google.ads.mediation.admob.Mvp.IAoPeRfJn;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzamg {
    private static final zzgty zza = zzgty.zza(zzgsx.zzc(':'));
    private static final zzgty zzb = zzgty.zza(zzgsx.zzc('*'));
    private final List zzc = new ArrayList();
    private int zzd = 0;
    private int zze;

    public final void zza() {
        this.zzc.clear();
        this.zzd = 0;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:39:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:42:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x011b A[SYNTHETIC] */
    public final int zzb(zzafz zzafzVar, zzagy zzagyVar, List list) {
        char c10;
        int i10;
        ArrayList arrayList;
        List listZze;
        int i11;
        List listZze2;
        int i12 = this.zzd;
        if (i12 == 0) {
            long jZzo = zzafzVar.zzo();
            zzagyVar.zza = (jZzo == -1 || jZzo < 8) ? 0L : jZzo - 8;
            this.zzd = 1;
            return 1;
        }
        int i13 = 8;
        if (i12 != 1) {
            short s10 = 2820;
            short s11 = 2819;
            short s12 = 2817;
            short s13 = 2816;
            short s14 = 2192;
            if (i12 != 2) {
                long jZzn = zzafzVar.zzn();
                int iZzo = (int) ((zzafzVar.zzo() - zzafzVar.zzn()) - ((long) this.zze));
                zzet zzetVar = new zzet(iZzo);
                zzafzVar.zzc(zzetVar.zzi(), 0, iZzo);
                int i14 = 0;
                while (true) {
                    List list2 = this.zzc;
                    if (i14 < list2.size()) {
                        zzamf zzamfVar = (zzamf) list2.get(i14);
                        zzetVar.zzh((int) (zzamfVar.zza - jZzn));
                        zzetVar.zzk(4);
                        int iZzC = zzetVar.zzC();
                        Charset charset = StandardCharsets.UTF_8;
                        String strZzK = zzetVar.zzK(iZzC, charset);
                        switch (strZzK.hashCode()) {
                            case -1711564334:
                                if (!strZzK.equals("SlowMotion_Data")) {
                                    throw zzat.zzb("Invalid SEF name", null);
                                }
                                c10 = 2192;
                                i10 = zzamfVar.zzb - (iZzC + 8);
                                if (c10 == 2192) {
                                    arrayList = new ArrayList();
                                    listZze = zzb.zze(zzetVar.zzK(i10, charset));
                                    for (i11 = 0; i11 < listZze.size(); i11++) {
                                        listZze2 = zza.zze((CharSequence) listZze.get(i11));
                                        if (listZze2.size() != 3) {
                                            throw zzat.zzb(null, null);
                                        }
                                        try {
                                            arrayList.add(new zzajv(Long.parseLong((String) listZze2.get(0)), Long.parseLong((String) listZze2.get(1)), 1 << (Integer.parseInt((String) listZze2.get(2)) - 1)));
                                        } catch (NumberFormatException e10) {
                                            throw zzat.zzb(null, e10);
                                        }
                                    }
                                    list.add(new zzajw(arrayList));
                                } else if (c10 == 2816 && c10 != 2817 && c10 != 2819 && c10 != 2820) {
                                    throw new IllegalStateException();
                                }
                                i14++;
                                break;
                                break;
                            case -1332107749:
                                if (!strZzK.equals(IAoPeRfJn.WwEeentLHiz)) {
                                    throw zzat.zzb("Invalid SEF name", null);
                                }
                                c10 = 2819;
                                i10 = zzamfVar.zzb - (iZzC + 8);
                                if (c10 == 2192) {
                                    arrayList = new ArrayList();
                                    listZze = zzb.zze(zzetVar.zzK(i10, charset));
                                    while (i11 < listZze.size()) {
                                        listZze2 = zza.zze((CharSequence) listZze.get(i11));
                                        if (listZze2.size() != 3) {
                                            throw zzat.zzb(null, null);
                                        }
                                        arrayList.add(new zzajv(Long.parseLong((String) listZze2.get(0)), Long.parseLong((String) listZze2.get(1)), 1 << (Integer.parseInt((String) listZze2.get(2)) - 1)));
                                    }
                                    list.add(new zzajw(arrayList));
                                } else if (c10 == 2816) {
                                }
                                i14++;
                                break;
                                break;
                            case -1251387154:
                                if (!strZzK.equals("Super_SlowMotion_Data")) {
                                    throw zzat.zzb("Invalid SEF name", null);
                                }
                                c10 = 2816;
                                i10 = zzamfVar.zzb - (iZzC + 8);
                                if (c10 == 2192) {
                                    arrayList = new ArrayList();
                                    listZze = zzb.zze(zzetVar.zzK(i10, charset));
                                    while (i11 < listZze.size()) {
                                        listZze2 = zza.zze((CharSequence) listZze.get(i11));
                                        if (listZze2.size() != 3) {
                                            throw zzat.zzb(null, null);
                                        }
                                        arrayList.add(new zzajv(Long.parseLong((String) listZze2.get(0)), Long.parseLong((String) listZze2.get(1)), 1 << (Integer.parseInt((String) listZze2.get(2)) - 1)));
                                    }
                                    list.add(new zzajw(arrayList));
                                } else if (c10 == 2816) {
                                }
                                i14++;
                                break;
                                break;
                            case -830665521:
                                if (!strZzK.equals("Super_SlowMotion_Deflickering_On")) {
                                    throw zzat.zzb("Invalid SEF name", null);
                                }
                                c10 = 2820;
                                i10 = zzamfVar.zzb - (iZzC + 8);
                                if (c10 == 2192) {
                                    arrayList = new ArrayList();
                                    listZze = zzb.zze(zzetVar.zzK(i10, charset));
                                    while (i11 < listZze.size()) {
                                        listZze2 = zza.zze((CharSequence) listZze.get(i11));
                                        if (listZze2.size() != 3) {
                                            throw zzat.zzb(null, null);
                                        }
                                        arrayList.add(new zzajv(Long.parseLong((String) listZze2.get(0)), Long.parseLong((String) listZze2.get(1)), 1 << (Integer.parseInt((String) listZze2.get(2)) - 1)));
                                    }
                                    list.add(new zzajw(arrayList));
                                } else if (c10 == 2816) {
                                }
                                i14++;
                                break;
                                break;
                            case 1760745220:
                                if (!strZzK.equals(PvZsvNiPV.zBThnY)) {
                                    throw zzat.zzb("Invalid SEF name", null);
                                }
                                c10 = 2817;
                                i10 = zzamfVar.zzb - (iZzC + 8);
                                if (c10 == 2192) {
                                    arrayList = new ArrayList();
                                    listZze = zzb.zze(zzetVar.zzK(i10, charset));
                                    while (i11 < listZze.size()) {
                                        listZze2 = zza.zze((CharSequence) listZze.get(i11));
                                        if (listZze2.size() != 3) {
                                            throw zzat.zzb(null, null);
                                        }
                                        arrayList.add(new zzajv(Long.parseLong((String) listZze2.get(0)), Long.parseLong((String) listZze2.get(1)), 1 << (Integer.parseInt((String) listZze2.get(2)) - 1)));
                                    }
                                    list.add(new zzajw(arrayList));
                                } else if (c10 == 2816) {
                                }
                                i14++;
                                break;
                                break;
                            default:
                                throw zzat.zzb("Invalid SEF name", null);
                        }
                    } else {
                        zzagyVar.zza = 0L;
                    }
                }
            } else {
                long jZzo2 = zzafzVar.zzo();
                int i15 = this.zze - 20;
                zzet zzetVar2 = new zzet(i15);
                zzafzVar.zzc(zzetVar2.zzi(), 0, i15);
                int i16 = 0;
                while (i16 < i15 / 12) {
                    zzetVar2.zzk(2);
                    short sZzw = zzetVar2.zzw();
                    if (sZzw == s14 || sZzw == s13 || sZzw == s12 || sZzw == s11 || sZzw == s10) {
                        this.zzc.add(new zzamf(sZzw, (jZzo2 - ((long) this.zze)) - ((long) zzetVar2.zzC()), zzetVar2.zzC()));
                    } else {
                        zzetVar2.zzk(i13);
                    }
                    i16++;
                    i13 = 8;
                    s10 = 2820;
                    s11 = 2819;
                    s12 = 2817;
                    s13 = 2816;
                    s14 = 2192;
                }
                List list3 = this.zzc;
                if (list3.isEmpty()) {
                    zzagyVar.zza = 0L;
                } else {
                    this.zzd = 3;
                    zzagyVar.zza = ((zzamf) list3.get(0)).zza;
                }
            }
        } else {
            zzet zzetVar3 = new zzet(8);
            zzafzVar.zzc(zzetVar3.zzi(), 0, 8);
            this.zze = zzetVar3.zzC() + 8;
            if (zzetVar3.zzB() != 1397048916) {
                zzagyVar.zza = 0L;
            } else {
                zzagyVar.zza = zzafzVar.zzn() - ((long) (this.zze - 12));
                this.zzd = 2;
            }
        }
        return 1;
    }
}
