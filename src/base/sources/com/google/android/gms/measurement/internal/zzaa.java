package com.google.android.gms.measurement.internal;

import android.util.Log;
import androidx.collection.a;
import com.google.android.gms.internal.measurement.zzahn;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzaa extends zzab {
    final /* synthetic */ zzad zza;
    private final com.google.android.gms.internal.measurement.zzff zzh;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzaa(zzad zzadVar, String str, int i10, com.google.android.gms.internal.measurement.zzff zzffVar) {
        super(str, i10);
        Objects.requireNonNull(zzadVar);
        this.zza = zzadVar;
        this.zzh = zzffVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzab
    final int zza() {
        return this.zzh.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.zzab
    final boolean zzb() {
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.zzab
    final boolean zzc() {
        return this.zzh.zzh();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0285  */
    /* JADX WARN: Code duplicated, block: B:105:0x0293  */
    /* JADX WARN: Code duplicated, block: B:107:0x0299  */
    /* JADX WARN: Code duplicated, block: B:108:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:110:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:112:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:115:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:121:0x030a A[EDGE_INSN: B:121:0x030a->B:124:0x034a BREAK  A[LOOP:0: B:40:0x00f4->B:45:0x0121]] */
    /* JADX WARN: Code duplicated, block: B:122:0x032a A[EDGE_INSN: B:122:0x032a->B:124:0x034a BREAK  A[LOOP:0: B:40:0x00f4->B:45:0x0121]] */
    /* JADX WARN: Code duplicated, block: B:158:0x0129 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:159:0x010a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:160:0x01bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:161:0x014c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:162:0x016a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:163:0x0152 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:164:0x0188 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:165:0x019a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:166:0x0170 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:168:0x0136 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:172:0x0348 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:173:0x01ea A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:174:0x024a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:175:0x020f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:176:0x034a A[EDGE_INSN: B:176:0x034a->B:124:0x034a BREAK  A[LOOP:0: B:40:0x00f4->B:45:0x0121], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:177:0x0246 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:178:0x034a A[EDGE_INSN: B:178:0x034a->B:124:0x034a BREAK  A[LOOP:0: B:40:0x00f4->B:45:0x0121], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:179:0x028b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:180:0x0209 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:181:0x028f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:182:0x0254 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:183:0x024e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:184:0x0308 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:185:0x02ea A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:186:0x02cc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:187:0x034a A[EDGE_INSN: B:187:0x034a->B:124:0x034a BREAK  A[LOOP:0: B:40:0x00f4->B:45:0x0121], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:188:0x02c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:190:0x01c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:191:0x01c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:192:0x01c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:42:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:45:0x0121 A[LOOP:0: B:40:0x00f4->B:45:0x0121, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:49:0x013c  */
    /* JADX WARN: Code duplicated, block: B:55:0x015c  */
    /* JADX WARN: Code duplicated, block: B:56:0x0165  */
    /* JADX WARN: Code duplicated, block: B:62:0x017a  */
    /* JADX WARN: Code duplicated, block: B:63:0x0183  */
    /* JADX WARN: Code duplicated, block: B:67:0x018e  */
    /* JADX WARN: Code duplicated, block: B:72:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:77:0x01df  */
    /* JADX WARN: Code duplicated, block: B:81:0x0201  */
    /* JADX WARN: Code duplicated, block: B:86:0x022e  */
    /* JADX WARN: Code duplicated, block: B:89:0x0240  */
    /* JADX WARN: Code duplicated, block: B:97:0x0273  */
    /* JADX WARN: Multi-variable type inference failed */
    final boolean zzd(Long l10, Long l11, com.google.android.gms.internal.measurement.zzhs zzhsVar, long j10, zzbd zzbdVar, boolean z10) {
        HashSet hashSet;
        Iterator it;
        a aVar;
        Iterator it2;
        Iterator it3;
        com.google.android.gms.internal.measurement.zzfh zzfhVar;
        boolean z11;
        String strZzi;
        Object obj;
        Boolean boolZzg;
        Boolean boolZzh;
        String str;
        Boolean boolZzi;
        com.google.android.gms.internal.measurement.zzhw zzhwVar;
        Long lValueOf;
        Double dValueOf;
        com.google.android.gms.internal.measurement.zzfh zzfhVar2;
        zzahn.zza();
        zzad zzadVar = this.zza;
        zzic zzicVar = zzadVar.zzu;
        zzal zzalVarZzc = zzicVar.zzc();
        String str2 = this.zzb;
        boolean zZzp = zzalVarZzc.zzp(str2, zzfy.zzaF);
        com.google.android.gms.internal.measurement.zzff zzffVar = this.zzh;
        long j11 = zzffVar.zzm() ? zzbdVar.zze : j10;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        Boolean bool = null;
        if (Log.isLoggable(zzicVar.zzaW().zzn(), 2)) {
            zzicVar.zzaW().zzk().zzd("Evaluating filter. audience, filter, event", Integer.valueOf(this.zzc), zzffVar.zza() ? Integer.valueOf(zzffVar.zzb()) : null, zzicVar.zzl().zza(zzffVar.zzc()));
            zzicVar.zzaW().zzk().zzb("Filter definition", zzadVar.zzg.zzp().zzj(zzffVar));
        }
        if (!zzffVar.zza() || zzffVar.zzb() > 256) {
            zzicVar.zzaW().zze().zzc("Invalid event filter ID. appId, id", zzgu.zzl(str2), String.valueOf(zzffVar.zza() ? Integer.valueOf(zzffVar.zzb()) : null));
            return false;
        }
        Object[] objArr = zzffVar.zzj() || zzffVar.zzk() || zzffVar.zzm();
        if (z10 && objArr != true) {
            zzicVar.zzaW().zzk().zzc("Event filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(this.zzc), zzffVar.zza() ? Integer.valueOf(zzffVar.zzb()) : null);
            return true;
        }
        String strZzd = zzhsVar.zzd();
        if (!zzffVar.zzh()) {
            hashSet = new HashSet();
            it = zzffVar.zzd().iterator();
            while (true) {
                if (it.hasNext()) {
                    aVar = new a();
                    it2 = zzhsVar.zza().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            it3 = zzffVar.zzd().iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    bool = Boolean.TRUE;
                                    break;
                                }
                                zzfhVar = (com.google.android.gms.internal.measurement.zzfh) it3.next();
                                if (zzfhVar.zze() || !zzfhVar.zzf()) {
                                    z11 = false;
                                } else {
                                    z11 = true;
                                }
                                strZzi = zzfhVar.zzi();
                                if (strZzi.isEmpty()) {
                                    obj = aVar.get(strZzi);
                                    if (obj instanceof Long) {
                                        if (obj instanceof Double) {
                                            if (obj instanceof String) {
                                                if (obj == null) {
                                                    zzicVar.zzaW().zze().zzc("Unknown param type. event, param", zzicVar.zzl().zza(strZzd), zzicVar.zzl().zzb(strZzi));
                                                    break;
                                                }
                                                zzicVar.zzaW().zzk().zzc("Missing param for filter. event, param", zzicVar.zzl().zza(strZzd), zzicVar.zzl().zzb(strZzi));
                                                bool = Boolean.FALSE;
                                                break;
                                            }
                                            if (zzfhVar.zza()) {
                                                if (zzfhVar.zzc()) {
                                                    zzicVar.zzaW().zze().zzc("No filter for String param. event, param", zzicVar.zzl().zza(strZzd), zzicVar.zzl().zzb(strZzi));
                                                    break;
                                                }
                                                str = (String) obj;
                                                if (zzpk.zzm(str)) {
                                                    zzicVar.zzaW().zze().zzc("Invalid param value for number filter. event, param", zzicVar.zzl().zza(strZzd), zzicVar.zzl().zzb(strZzi));
                                                    break;
                                                }
                                                boolZzi = zzab.zzi(str, zzfhVar.zzd());
                                            } else {
                                                boolZzi = zzab.zzf((String) obj, zzfhVar.zzb(), zzicVar.zzaW());
                                            }
                                            if (boolZzi != null) {
                                                break;
                                            }
                                            if (boolZzi.booleanValue() == z11) {
                                                bool = Boolean.FALSE;
                                                break;
                                            }
                                        } else {
                                            if (zzfhVar.zzc()) {
                                                zzicVar.zzaW().zze().zzc("No number filter for double param. event, param", zzicVar.zzl().zza(strZzd), zzicVar.zzl().zzb(strZzi));
                                                break;
                                            }
                                            boolZzh = zzab.zzh(((Double) obj).doubleValue(), zzfhVar.zzd());
                                            if (boolZzh != null) {
                                                break;
                                            }
                                            if (boolZzh.booleanValue() == z11) {
                                                bool = Boolean.FALSE;
                                                break;
                                            }
                                        }
                                    } else {
                                        if (zzfhVar.zzc()) {
                                            zzicVar.zzaW().zze().zzc("No number filter for long param. event, param", zzicVar.zzl().zza(strZzd), zzicVar.zzl().zzb(strZzi));
                                            break;
                                        }
                                        boolZzg = zzab.zzg(((Long) obj).longValue(), zzfhVar.zzd());
                                        if (boolZzg != null) {
                                            break;
                                        }
                                        if (boolZzg.booleanValue() == z11) {
                                            bool = Boolean.FALSE;
                                            break;
                                        }
                                    }
                                } else {
                                    zzicVar.zzaW().zze().zzb("Event has empty param name. event", zzicVar.zzl().zza(strZzd));
                                    break;
                                }
                            }
                        } else {
                            zzhwVar = (com.google.android.gms.internal.measurement.zzhw) it2.next();
                            if (!hashSet.contains(zzhwVar.zzb())) {
                                if (zzhwVar.zze()) {
                                    if (zzhwVar.zzj()) {
                                        if (zzhwVar.zzc()) {
                                            zzicVar.zzaW().zze().zzc("Unknown value for param. event, param", zzicVar.zzl().zza(strZzd), zzicVar.zzl().zzb(zzhwVar.zzb()));
                                            break;
                                        }
                                        aVar.put(zzhwVar.zzb(), zzhwVar.zzd());
                                    } else {
                                        String strZzb = zzhwVar.zzb();
                                        if (zzhwVar.zzj()) {
                                            dValueOf = Double.valueOf(zzhwVar.zzk());
                                        } else {
                                            dValueOf = null;
                                        }
                                        aVar.put(strZzb, dValueOf);
                                    }
                                } else {
                                    String strZzb2 = zzhwVar.zzb();
                                    if (zzhwVar.zze()) {
                                        lValueOf = Long.valueOf(zzhwVar.zzf());
                                    } else {
                                        lValueOf = null;
                                    }
                                    aVar.put(strZzb2, lValueOf);
                                }
                            }
                        }
                    }
                } else {
                    zzfhVar2 = (com.google.android.gms.internal.measurement.zzfh) it.next();
                    if (zzfhVar2.zzi().isEmpty()) {
                        zzicVar.zzaW().zze().zzb("null or empty param name in filter. event", zzicVar.zzl().zza(strZzd));
                        break;
                    }
                    hashSet.add(zzfhVar2.zzi());
                }
            }
        } else {
            Boolean boolZzg2 = zzab.zzg(j11, zzffVar.zzi());
            if (boolZzg2 != null) {
                if (boolZzg2.booleanValue()) {
                    hashSet = new HashSet();
                    it = zzffVar.zzd().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            aVar = new a();
                            it2 = zzhsVar.zza().iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    it3 = zzffVar.zzd().iterator();
                                    while (true) {
                                        if (it3.hasNext()) {
                                            bool = Boolean.TRUE;
                                            break;
                                        }
                                        zzfhVar = (com.google.android.gms.internal.measurement.zzfh) it3.next();
                                        if (zzfhVar.zze()) {
                                            z11 = false;
                                        } else {
                                            z11 = false;
                                        }
                                        strZzi = zzfhVar.zzi();
                                        if (strZzi.isEmpty()) {
                                            obj = aVar.get(strZzi);
                                            if (obj instanceof Long) {
                                                if (obj instanceof Double) {
                                                    if (obj instanceof String) {
                                                        if (obj == null) {
                                                            zzicVar.zzaW().zze().zzc("Unknown param type. event, param", zzicVar.zzl().zza(strZzd), zzicVar.zzl().zzb(strZzi));
                                                            break;
                                                        }
                                                        zzicVar.zzaW().zzk().zzc("Missing param for filter. event, param", zzicVar.zzl().zza(strZzd), zzicVar.zzl().zzb(strZzi));
                                                        bool = Boolean.FALSE;
                                                        break;
                                                    }
                                                    if (zzfhVar.zza()) {
                                                        if (zzfhVar.zzc()) {
                                                            zzicVar.zzaW().zze().zzc("No filter for String param. event, param", zzicVar.zzl().zza(strZzd), zzicVar.zzl().zzb(strZzi));
                                                            break;
                                                        }
                                                        str = (String) obj;
                                                        if (zzpk.zzm(str)) {
                                                            zzicVar.zzaW().zze().zzc("Invalid param value for number filter. event, param", zzicVar.zzl().zza(strZzd), zzicVar.zzl().zzb(strZzi));
                                                            break;
                                                        }
                                                        boolZzi = zzab.zzi(str, zzfhVar.zzd());
                                                    } else {
                                                        boolZzi = zzab.zzf((String) obj, zzfhVar.zzb(), zzicVar.zzaW());
                                                    }
                                                    if (boolZzi != null) {
                                                        break;
                                                        break;
                                                    }
                                                    if (boolZzi.booleanValue() == z11) {
                                                        bool = Boolean.FALSE;
                                                        break;
                                                    }
                                                } else if (zzfhVar.zzc()) {
                                                    boolZzh = zzab.zzh(((Double) obj).doubleValue(), zzfhVar.zzd());
                                                    if (boolZzh != null) {
                                                        break;
                                                        break;
                                                    }
                                                    if (boolZzh.booleanValue() == z11) {
                                                        bool = Boolean.FALSE;
                                                        break;
                                                    }
                                                } else {
                                                    zzicVar.zzaW().zze().zzc("No number filter for double param. event, param", zzicVar.zzl().zza(strZzd), zzicVar.zzl().zzb(strZzi));
                                                    break;
                                                }
                                            } else if (zzfhVar.zzc()) {
                                                boolZzg = zzab.zzg(((Long) obj).longValue(), zzfhVar.zzd());
                                                if (boolZzg != null) {
                                                    break;
                                                    break;
                                                }
                                                if (boolZzg.booleanValue() == z11) {
                                                    bool = Boolean.FALSE;
                                                    break;
                                                }
                                            } else {
                                                zzicVar.zzaW().zze().zzc("No number filter for long param. event, param", zzicVar.zzl().zza(strZzd), zzicVar.zzl().zzb(strZzi));
                                                break;
                                            }
                                        } else {
                                            zzicVar.zzaW().zze().zzb("Event has empty param name. event", zzicVar.zzl().zza(strZzd));
                                            break;
                                        }
                                    }
                                } else {
                                    zzhwVar = (com.google.android.gms.internal.measurement.zzhw) it2.next();
                                    if (!hashSet.contains(zzhwVar.zzb())) {
                                        if (zzhwVar.zze()) {
                                            if (zzhwVar.zzj()) {
                                                if (zzhwVar.zzc()) {
                                                    zzicVar.zzaW().zze().zzc("Unknown value for param. event, param", zzicVar.zzl().zza(strZzd), zzicVar.zzl().zzb(zzhwVar.zzb()));
                                                    break;
                                                }
                                                aVar.put(zzhwVar.zzb(), zzhwVar.zzd());
                                            } else {
                                                String strZzb3 = zzhwVar.zzb();
                                                if (zzhwVar.zzj()) {
                                                    dValueOf = Double.valueOf(zzhwVar.zzk());
                                                } else {
                                                    dValueOf = null;
                                                }
                                                aVar.put(strZzb3, dValueOf);
                                            }
                                        } else {
                                            String strZzb4 = zzhwVar.zzb();
                                            if (zzhwVar.zze()) {
                                                lValueOf = Long.valueOf(zzhwVar.zzf());
                                            } else {
                                                lValueOf = null;
                                            }
                                            aVar.put(strZzb4, lValueOf);
                                        }
                                    }
                                }
                            }
                        } else {
                            zzfhVar2 = (com.google.android.gms.internal.measurement.zzfh) it.next();
                            if (zzfhVar2.zzi().isEmpty()) {
                                zzicVar.zzaW().zze().zzb("null or empty param name in filter. event", zzicVar.zzl().zza(strZzd));
                                break;
                            }
                            hashSet.add(zzfhVar2.zzi());
                        }
                    }
                } else {
                    bool = Boolean.FALSE;
                }
            }
        }
        zzicVar.zzaW().zzk().zzb("Event filter result", bool == null ? "null" : bool);
        if (bool == null) {
            return false;
        }
        Boolean bool2 = Boolean.TRUE;
        this.zzd = bool2;
        if (!bool.booleanValue()) {
            return true;
        }
        this.zze = bool2;
        if (objArr != false && zzhsVar.zze()) {
            Long lValueOf2 = Long.valueOf(zzhsVar.zzf());
            if (zzffVar.zzk()) {
                if (zZzp && zzffVar.zzh()) {
                    lValueOf2 = l10;
                }
                this.zzg = lValueOf2;
            } else {
                if (zZzp && zzffVar.zzh()) {
                    lValueOf2 = l11;
                }
                this.zzf = lValueOf2;
            }
        }
        return true;
    }
}
