package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import androidx.collection.a;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzahn;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.io.IOException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzad extends zzos {
    private String zza;
    private Set zzb;
    private Map zzc;
    private Long zzd;
    private Long zze;

    zzad(zzpg zzpgVar) {
        super(zzpgVar);
    }

    private final zzy zzc(Integer num) {
        if (this.zzc.containsKey(num)) {
            return (zzy) this.zzc.get(num);
        }
        zzy zzyVar = new zzy(this, this.zza, null);
        this.zzc.put(num, zzyVar);
        return zzyVar;
    }

    private final boolean zzd(int i10, int i11) {
        zzy zzyVar = (zzy) this.zzc.get(Integer.valueOf(i10));
        if (zzyVar == null) {
            return false;
        }
        return zzyVar.zzc().get(i11);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0247  */
    /* JADX WARN: Code duplicated, block: B:105:0x0257  */
    /* JADX WARN: Code duplicated, block: B:107:0x0262  */
    /* JADX WARN: Code duplicated, block: B:111:0x028e A[Catch: all -> 0x02a9, SQLiteException -> 0x02ab, LOOP:11: B:111:0x028e->B:523:?, LOOP_START, TryCatch #5 {all -> 0x02a9, blocks: (B:109:0x0288, B:111:0x028e, B:113:0x029f, B:119:0x02ad, B:122:0x02c2, B:131:0x02d0), top: B:441:0x027e }] */
    /* JADX WARN: Code duplicated, block: B:113:0x029f A[Catch: all -> 0x02a9, SQLiteException -> 0x02ab, TryCatch #5 {all -> 0x02a9, blocks: (B:109:0x0288, B:111:0x028e, B:113:0x029f, B:119:0x02ad, B:122:0x02c2, B:131:0x02d0), top: B:441:0x027e }] */
    /* JADX WARN: Code duplicated, block: B:122:0x02c2 A[Catch: all -> 0x02a9, SQLiteException -> 0x02ab, TRY_ENTER, TRY_LEAVE, TryCatch #5 {all -> 0x02a9, blocks: (B:109:0x0288, B:111:0x028e, B:113:0x029f, B:119:0x02ad, B:122:0x02c2, B:131:0x02d0), top: B:441:0x027e }] */
    /* JADX WARN: Code duplicated, block: B:137:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:140:0x030b  */
    /* JADX WARN: Code duplicated, block: B:142:0x0322  */
    /* JADX WARN: Code duplicated, block: B:166:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:168:0x03f7  */
    /* JADX WARN: Code duplicated, block: B:172:0x0404  */
    /* JADX WARN: Code duplicated, block: B:174:0x0424  */
    /* JADX WARN: Code duplicated, block: B:180:0x043b  */
    /* JADX WARN: Code duplicated, block: B:184:0x0457  */
    /* JADX WARN: Code duplicated, block: B:185:0x0460  */
    /* JADX WARN: Code duplicated, block: B:189:0x046e  */
    /* JADX WARN: Code duplicated, block: B:195:0x0485  */
    /* JADX WARN: Code duplicated, block: B:201:0x04bb  */
    /* JADX WARN: Code duplicated, block: B:204:0x04c4  */
    /* JADX WARN: Code duplicated, block: B:206:0x04ce  */
    /* JADX WARN: Code duplicated, block: B:208:0x04f0  */
    /* JADX WARN: Code duplicated, block: B:209:0x04f4  */
    /* JADX WARN: Code duplicated, block: B:214:0x050d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:239:0x05a4  */
    /* JADX WARN: Code duplicated, block: B:242:0x05b9  */
    /* JADX WARN: Code duplicated, block: B:248:0x05ee  */
    /* JADX WARN: Code duplicated, block: B:254:0x062b  */
    /* JADX WARN: Code duplicated, block: B:261:0x0653  */
    /* JADX WARN: Code duplicated, block: B:267:0x0662  */
    /* JADX WARN: Code duplicated, block: B:278:0x0691 A[LOOP:3: B:255:0x062d->B:278:0x0691, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:279:0x0694  */
    /* JADX WARN: Code duplicated, block: B:296:0x06cb  */
    /* JADX WARN: Code duplicated, block: B:300:0x06d5  */
    /* JADX WARN: Code duplicated, block: B:302:0x06d9  */
    /* JADX WARN: Code duplicated, block: B:306:0x06ed  */
    /* JADX WARN: Code duplicated, block: B:312:0x071e  */
    /* JADX WARN: Code duplicated, block: B:314:0x074b A[LOOP:5: B:310:0x0718->B:314:0x074b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:318:0x0767  */
    /* JADX WARN: Code duplicated, block: B:322:0x077c  */
    /* JADX WARN: Code duplicated, block: B:325:0x0784  */
    /* JADX WARN: Code duplicated, block: B:328:0x0793  */
    /* JADX WARN: Code duplicated, block: B:330:0x07a6  */
    /* JADX WARN: Code duplicated, block: B:334:0x07df A[Catch: all -> 0x0810, SQLiteException -> 0x0820, LOOP:7: B:334:0x07df->B:356:0x0847, LOOP_START, PHI: r4 r8
      0x07df: PHI (r4v39 java.util.Iterator) = (r4v31 java.util.Iterator), (r4v43 java.util.Iterator) binds: [B:333:0x07dd, B:356:0x0847] A[DONT_GENERATE, DONT_INLINE]
      0x07df: PHI (r8v49 java.lang.String) = (r8v46 java.lang.String), (r8v51 java.lang.String) binds: [B:333:0x07dd, B:356:0x0847] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #3 {SQLiteException -> 0x0820, blocks: (B:332:0x07d9, B:334:0x07df, B:335:0x07e4, B:337:0x07f5), top: B:439:0x07d9 }] */
    /* JADX WARN: Code duplicated, block: B:339:0x0805  */
    /* JADX WARN: Code duplicated, block: B:345:0x0816  */
    /* JADX WARN: Code duplicated, block: B:356:0x0847 A[LOOP:7: B:334:0x07df->B:356:0x0847, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:359:0x084e  */
    /* JADX WARN: Code duplicated, block: B:361:0x0854 A[PHI: r0 r13 r36
      0x0854: PHI (r0v120 java.util.Map) = (r0v122 java.util.Map), (r0v128 java.util.Map) binds: [B:370:0x0878, B:360:0x0852] A[DONT_GENERATE, DONT_INLINE]
      0x0854: PHI (r13v4 android.database.Cursor) = (r13v5 android.database.Cursor), (r13v6 android.database.Cursor) binds: [B:370:0x0878, B:360:0x0852] A[DONT_GENERATE, DONT_INLINE]
      0x0854: PHI (r36v4 java.util.Iterator) = (r36v5 java.util.Iterator), (r36v9 java.util.Iterator) binds: [B:370:0x0878, B:360:0x0852] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:376:0x0885  */
    /* JADX WARN: Code duplicated, block: B:380:0x0895  */
    /* JADX WARN: Code duplicated, block: B:384:0x08b8  */
    /* JADX WARN: Code duplicated, block: B:387:0x08c9  */
    /* JADX WARN: Code duplicated, block: B:389:0x08e2  */
    /* JADX WARN: Code duplicated, block: B:391:0x08f0  */
    /* JADX WARN: Code duplicated, block: B:393:0x08fb  */
    /* JADX WARN: Code duplicated, block: B:395:0x0928  */
    /* JADX WARN: Code duplicated, block: B:398:0x0932  */
    /* JADX WARN: Code duplicated, block: B:407:0x097d  */
    /* JADX WARN: Code duplicated, block: B:408:0x0986  */
    /* JADX WARN: Code duplicated, block: B:412:0x0999 A[PHI: r16 r37 r40
      0x0999: PHI (r16v8 java.lang.String) = (r16v9 java.lang.String), (r2v25 java.lang.String) binds: [B:411:0x0997, B:409:0x0987] A[DONT_GENERATE, DONT_INLINE]
      0x0999: PHI (r37v3 java.util.Map) = (r37v4 java.util.Map), (r37v5 java.util.Map) binds: [B:411:0x0997, B:409:0x0987] A[DONT_GENERATE, DONT_INLINE]
      0x0999: PHI (r40v3 androidx.collection.a) = (r40v4 androidx.collection.a), (r3v31 androidx.collection.a) binds: [B:411:0x0997, B:409:0x0987] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:417:0x09c0  */
    /* JADX WARN: Code duplicated, block: B:430:0x0a48  */
    /* JADX WARN: Code duplicated, block: B:490:0x05c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:491:0x05e0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:493:0x05b3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:494:0x05b3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:496:0x068c A[EDGE_INSN: B:496:0x068c->B:277:0x068c BREAK  A[LOOP:3: B:255:0x062d->B:278:0x0691], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:498:0x070d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:499:0x06ff A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:503:0x075f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:504:0x0759 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:508:0x0842 A[EDGE_INSN: B:508:0x0842->B:355:0x0842 BREAK  A[LOOP:7: B:334:0x07df->B:356:0x0847], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:509:0x08a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:511:0x099e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:512:0x0991 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:513:0x0969 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:517:0x0a1a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:519:0x09ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:525:0x056f A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:532:0x0447 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:534:0x0435 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:537:0x0491 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:540:0x047f A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:551:0x0328 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x016d  */
    /* JADX WARN: Code duplicated, block: B:564:0x020d A[EDGE_INSN: B:564:0x020d->B:83:0x020d BREAK  A[LOOP:20: B:70:0x01c1->B:84:0x0212], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x01a2 A[Catch: all -> 0x01b0, SQLiteException -> 0x01b3, TRY_LEAVE, TryCatch #13 {all -> 0x01b0, blocks: (B:59:0x019c, B:61:0x01a2, B:69:0x01bc, B:70:0x01c1, B:71:0x01cb, B:72:0x01db, B:81:0x0207, B:74:0x01ea, B:78:0x01fa, B:80:0x0200, B:98:0x0230), top: B:453:0x019c }] */
    /* JADX WARN: Code duplicated, block: B:69:0x01bc A[Catch: all -> 0x01b0, SQLiteException -> 0x01b3, TRY_ENTER, TryCatch #13 {all -> 0x01b0, blocks: (B:59:0x019c, B:61:0x01a2, B:69:0x01bc, B:70:0x01c1, B:71:0x01cb, B:72:0x01db, B:81:0x0207, B:74:0x01ea, B:78:0x01fa, B:80:0x0200, B:98:0x0230), top: B:453:0x019c }] */
    /* JADX WARN: Code duplicated, block: B:84:0x0212 A[LOOP:20: B:70:0x01c1->B:84:0x0212, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    final List zzb(String str, List list, List list2, Long l10, Long l11, boolean z10) throws Throwable {
        int i10;
        int i11;
        boolean z11;
        Map map;
        Cursor cursor;
        boolean z12;
        String str2;
        Cursor cursorQuery;
        Map map2;
        HashSet hashSet;
        HashSet<Integer> hashSet2;
        Map map3;
        com.google.android.gms.internal.measurement.zzii zziiVar;
        BitSet bitSet;
        BitSet bitSet2;
        a aVar;
        com.google.android.gms.internal.measurement.zzii zziiVar2;
        List list3;
        int i12;
        boolean z13;
        Iterator it;
        com.google.android.gms.internal.measurement.zzik zzikVar;
        Long lValueOf;
        String str3;
        Map aVar2;
        SQLiteDatabase sQLiteDatabaseZze;
        ?? r10;
        Cursor cursorRawQuery;
        a aVar3;
        Iterator it2;
        Integer num;
        com.google.android.gms.internal.measurement.zzii zziiVar3;
        List list4;
        Map map4;
        HashSet hashSet3;
        Iterator it3;
        Integer numValueOf;
        List arrayList;
        String str4;
        String str5;
        String str6;
        ArrayList arrayList2;
        zzaw zzawVarZzj;
        String str7;
        ContentValues contentValues;
        a aVar4;
        Iterator it4;
        String strZzc;
        Map map5;
        Iterator it5;
        Iterator it6;
        boolean zZzd;
        Map map6;
        com.google.android.gms.internal.measurement.zzfn zzfnVar;
        zzic zzicVar;
        Integer numValueOf2;
        zzac zzacVar;
        Integer numValueOf3;
        zzaw zzawVarZzj2;
        String str8;
        a aVar5;
        Cursor cursor2;
        String str9;
        Cursor cursorQuery2;
        Integer numValueOf4;
        List list5;
        List arrayList3;
        zzz zzzVar;
        a aVar6;
        Iterator it7;
        com.google.android.gms.internal.measurement.zzhs zzhsVar;
        com.google.android.gms.internal.measurement.zzhs zzhsVarZza;
        zzpg zzpgVar;
        zzbd zzbdVarZzah;
        long j10;
        String strZzd;
        Map map7;
        zzbd zzbdVar;
        Iterator it8;
        Integer num2;
        int iIntValue;
        Iterator it9;
        boolean zZzd2;
        Map map8;
        Iterator it10;
        long j11;
        zzaa zzaaVar;
        zzaw zzawVarZzj3;
        String str10;
        a aVar7;
        String str11;
        Cursor cursor3;
        Cursor cursorQuery3;
        Cursor cursor4;
        Integer numValueOf5;
        List list6;
        List arrayList4;
        a aVar8;
        int i13;
        Cursor cursorQuery4;
        List arrayList5;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(list);
        Preconditions.checkNotNull(list2);
        this.zza = str;
        this.zzb = new HashSet();
        this.zzc = new a();
        this.zzd = l10;
        this.zze = l11;
        Iterator it11 = list.iterator();
        while (true) {
            i10 = 0;
            i11 = 1;
            if (!it11.hasNext()) {
                z11 = false;
                break;
            }
            if ("_s".equals(((com.google.android.gms.internal.measurement.zzhs) it11.next()).zzd())) {
                z11 = true;
                break;
            }
        }
        zzahn.zza();
        zzic zzicVar2 = this.zzu;
        boolean zZzp = zzicVar2.zzc().zzp(this.zza, zzfy.zzaF);
        zzahn.zza();
        boolean zZzp2 = zzicVar2.zzc().zzp(this.zza, zzfy.zzaE);
        if (z11) {
            zzaw zzawVarZzj4 = this.zzg.zzj();
            String str12 = this.zza;
            zzawVarZzj4.zzay();
            zzawVarZzj4.zzg();
            Preconditions.checkNotEmpty(str12);
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("current_session_count", (Integer) 0);
            try {
                zzawVarZzj4.zze().update("events", contentValues2, "app_id = ?", new String[]{str12});
            } catch (SQLiteException e10) {
                zzawVarZzj4.zzu.zzaW().zzb().zzc("Error resetting session-scoped event counts. appId", zzgu.zzl(str12), e10);
            }
        }
        Map map9 = Collections.EMPTY_MAP;
        String str13 = DataSchemeDataSource.SCHEME_DATA;
        String str14 = "audience_id";
        if (zZzp2 && zZzp) {
            zzaw zzawVarZzj5 = this.zzg.zzj();
            String str15 = this.zza;
            Preconditions.checkNotEmpty(str15);
            a aVar9 = new a();
            try {
                cursorQuery4 = zzawVarZzj5.zze().query("event_filters", new String[]{"audience_id", DataSchemeDataSource.SCHEME_DATA}, "app_id=?", new String[]{str15}, null, null, null);
                try {
                    try {
                        if (cursorQuery4.moveToFirst()) {
                            while (true) {
                                try {
                                    com.google.android.gms.internal.measurement.zzff zzffVar = (com.google.android.gms.internal.measurement.zzff) ((com.google.android.gms.internal.measurement.zzfe) zzpk.zzw(com.google.android.gms.internal.measurement.zzff.zzn(), cursorQuery4.getBlob(i11))).zzbd();
                                    if (zzffVar.zzh()) {
                                        Integer numValueOf6 = Integer.valueOf(cursorQuery4.getInt(i10));
                                        List list7 = (List) aVar9.get(numValueOf6);
                                        if (list7 == null) {
                                            arrayList5 = new ArrayList();
                                            aVar9.put(numValueOf6, arrayList5);
                                        } else {
                                            arrayList5 = list7;
                                        }
                                        arrayList5.add(zzffVar);
                                    }
                                } catch (IOException e11) {
                                    zzawVarZzj5.zzu.zzaW().zzb().zzc("Failed to merge filter. appId", zzgu.zzl(str15), e11);
                                }
                                if (!cursorQuery4.moveToNext()) {
                                    break;
                                }
                                i10 = 0;
                                i11 = 1;
                            }
                            cursorQuery4.close();
                            map = aVar9;
                        } else {
                            cursorQuery4.close();
                            map = map9;
                        }
                    } catch (SQLiteException e12) {
                        e = e12;
                        zzawVarZzj5.zzu.zzaW().zzb().zzc("Database error querying filters. appId", zzgu.zzl(str15), e);
                        map9 = Collections.EMPTY_MAP;
                        if (cursorQuery4 != null) {
                        }
                        map = map9;
                        zzaw zzawVarZzj6 = this.zzg.zzj();
                        String str16 = this.zza;
                        zzawVarZzj6.zzay();
                        zzawVarZzj6.zzg();
                        Preconditions.checkNotEmpty(str16);
                        cursorQuery = zzawVarZzj6.zze().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{str16}, null, null, null);
                        try {
                            try {
                                if (cursorQuery.moveToFirst()) {
                                    aVar8 = new a();
                                    while (true) {
                                        i13 = cursorQuery.getInt(0);
                                        try {
                                            aVar8.put(Integer.valueOf(i13), (com.google.android.gms.internal.measurement.zzii) ((com.google.android.gms.internal.measurement.zzih) zzpk.zzw(com.google.android.gms.internal.measurement.zzii.zzj(), cursorQuery.getBlob(1))).zzbd());
                                            z12 = z11;
                                            str2 = str13;
                                        } catch (IOException e13) {
                                            z12 = z11;
                                            str2 = str13;
                                            try {
                                                zzawVarZzj6.zzu.zzaW().zzb().zzd("Failed to merge filter results. appId, audienceId, error", zzgu.zzl(str16), Integer.valueOf(i13), e13);
                                            } catch (SQLiteException e14) {
                                                e = e14;
                                                str14 = str14;
                                                zzawVarZzj6.zzu.zzaW().zzb().zzc("Database error querying filter results. appId", zzgu.zzl(str16), e);
                                                Map map10 = Collections.EMPTY_MAP;
                                                if (cursorQuery != null) {
                                                    cursorQuery.close();
                                                }
                                                map2 = map10;
                                                if (!map2.isEmpty()) {
                                                    hashSet = new HashSet(map2.keySet());
                                                    if (z12) {
                                                        String str17 = this.zza;
                                                        zzaw zzawVarZzj7 = this.zzg.zzj();
                                                        str3 = this.zza;
                                                        zzawVarZzj7.zzay();
                                                        zzawVarZzj7.zzg();
                                                        Preconditions.checkNotEmpty(str3);
                                                        aVar2 = new a();
                                                        sQLiteDatabaseZze = zzawVarZzj7.zze();
                                                        try {
                                                            try {
                                                                cursorRawQuery = sQLiteDatabaseZze.rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str3, str3});
                                                                try {
                                                                    if (cursorRawQuery.moveToFirst()) {
                                                                        do {
                                                                            numValueOf = Integer.valueOf(cursorRawQuery.getInt(0));
                                                                            arrayList = (List) aVar2.get(numValueOf);
                                                                            if (arrayList == null) {
                                                                                arrayList = new ArrayList();
                                                                                aVar2.put(numValueOf, arrayList);
                                                                            }
                                                                            arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                                                                        } while (cursorRawQuery.moveToNext());
                                                                    } else {
                                                                        aVar2 = Collections.EMPTY_MAP;
                                                                    }
                                                                } catch (SQLiteException e15) {
                                                                    e = e15;
                                                                    zzawVarZzj7.zzu.zzaW().zzb().zzc("Database error querying scoped filters. appId", zzgu.zzl(str3), e);
                                                                    aVar2 = Collections.EMPTY_MAP;
                                                                    if (cursorRawQuery != null) {
                                                                    }
                                                                    Preconditions.checkNotEmpty(str17);
                                                                    Preconditions.checkNotNull(map2);
                                                                    aVar3 = new a();
                                                                    if (!map2.isEmpty()) {
                                                                        it2 = map2.keySet().iterator();
                                                                        while (it2.hasNext()) {
                                                                            num = (Integer) it2.next();
                                                                            num.intValue();
                                                                            zziiVar3 = (com.google.android.gms.internal.measurement.zzii) map2.get(num);
                                                                            list4 = (List) aVar2.get(num);
                                                                            if (list4 != null) {
                                                                            }
                                                                            map4 = aVar2;
                                                                            hashSet3 = hashSet;
                                                                            it3 = it2;
                                                                            aVar3.put(num, zziiVar3);
                                                                            aVar2 = map4;
                                                                            hashSet = hashSet3;
                                                                            it2 = it3;
                                                                        }
                                                                    }
                                                                    hashSet2 = hashSet;
                                                                    map3 = aVar3;
                                                                    for (Integer num3 : hashSet2) {
                                                                        num3.intValue();
                                                                        zziiVar = (com.google.android.gms.internal.measurement.zzii) map3.get(num3);
                                                                        bitSet = new BitSet();
                                                                        bitSet2 = new BitSet();
                                                                        aVar = new a();
                                                                        if (zziiVar != null) {
                                                                            for (com.google.android.gms.internal.measurement.zzhq zzhqVar : zziiVar.zze()) {
                                                                                if (zzhqVar.zza()) {
                                                                                    Map map11 = map3;
                                                                                    Integer numValueOf7 = Integer.valueOf(zzhqVar.zzb());
                                                                                    if (zzhqVar.zzc()) {
                                                                                        lValueOf = Long.valueOf(zzhqVar.zzd());
                                                                                    } else {
                                                                                        lValueOf = null;
                                                                                    }
                                                                                    aVar.put(numValueOf7, lValueOf);
                                                                                    map3 = map11;
                                                                                }
                                                                            }
                                                                        }
                                                                        Map map12 = map3;
                                                                        a aVar10 = new a();
                                                                        if (zziiVar != null) {
                                                                            it = zziiVar.zzh().iterator();
                                                                            while (it.hasNext()) {
                                                                                zzikVar = (com.google.android.gms.internal.measurement.zzik) it.next();
                                                                                if (!zzikVar.zza()) {
                                                                                }
                                                                            }
                                                                        }
                                                                        zziiVar2 = zziiVar;
                                                                        if (zziiVar2 != null) {
                                                                            i12 = 0;
                                                                            while (i12 < zziiVar2.zzb() * 64) {
                                                                                if (zzpk.zzn(zziiVar2.zza(), i12)) {
                                                                                    z13 = zZzp;
                                                                                    this.zzu.zzaW().zzk().zzc("Filter already evaluated. audience ID, filter ID", num3, Integer.valueOf(i12));
                                                                                    bitSet2.set(i12);
                                                                                    if (zzpk.zzn(zziiVar2.zzc(), i12)) {
                                                                                        bitSet.set(i12);
                                                                                    }
                                                                                    i12++;
                                                                                    zZzp = z13;
                                                                                } else {
                                                                                    z13 = zZzp;
                                                                                }
                                                                                aVar.remove(Integer.valueOf(i12));
                                                                                i12++;
                                                                                zZzp = z13;
                                                                            }
                                                                        }
                                                                        boolean z14 = zZzp;
                                                                        com.google.android.gms.internal.measurement.zzii zziiVar4 = (com.google.android.gms.internal.measurement.zzii) map2.get(num3);
                                                                        if (!zZzp2) {
                                                                        }
                                                                        this.zzc.put(num3, new zzy(this, this.zza, zziiVar4, bitSet, bitSet2, aVar, aVar10, null));
                                                                        str2 = str2;
                                                                        map = map;
                                                                        str14 = str14;
                                                                        map2 = map2;
                                                                        zZzp = z14;
                                                                        map3 = map12;
                                                                    }
                                                                    str4 = str2;
                                                                    str5 = str14;
                                                                    str6 = "Skipping failed audience ID";
                                                                    if (!list.isEmpty()) {
                                                                        zzzVar = new zzz(this, null);
                                                                        aVar6 = new a();
                                                                        it7 = list.iterator();
                                                                        while (it7.hasNext()) {
                                                                            zzhsVar = (com.google.android.gms.internal.measurement.zzhs) it7.next();
                                                                            zzhsVarZza = zzzVar.zza(this.zza, zzhsVar);
                                                                            if (zzhsVarZza != null) {
                                                                                zzpgVar = this.zzg;
                                                                                zzbdVarZzah = zzpgVar.zzj().zzah(this.zza, zzhsVar, zzhsVarZza.zzd());
                                                                                zzpgVar.zzj().zzh(zzbdVarZzah);
                                                                                if (z10) {
                                                                                    continue;
                                                                                } else {
                                                                                    j10 = zzbdVarZzah.zzc;
                                                                                    strZzd = zzhsVarZza.zzd();
                                                                                    map7 = (Map) aVar6.get(strZzd);
                                                                                    if (map7 == null) {
                                                                                        zzawVarZzj3 = zzpgVar.zzj();
                                                                                        str10 = this.zza;
                                                                                        zzawVarZzj3.zzay();
                                                                                        zzawVarZzj3.zzg();
                                                                                        Preconditions.checkNotEmpty(str10);
                                                                                        Preconditions.checkNotEmpty(strZzd);
                                                                                        aVar7 = new a();
                                                                                        try {
                                                                                            try {
                                                                                                str11 = str10;
                                                                                                try {
                                                                                                    cursorQuery3 = zzawVarZzj3.zze().query("event_filters", new String[]{str5, str4}, "app_id=? AND event_name=?", new String[]{str10, strZzd}, null, null, null);
                                                                                                    try {
                                                                                                        try {
                                                                                                            if (cursorQuery3.moveToFirst()) {
                                                                                                                zzbdVar = zzbdVarZzah;
                                                                                                                while (true) {
                                                                                                                    try {
                                                                                                                        try {
                                                                                                                            com.google.android.gms.internal.measurement.zzff zzffVar2 = (com.google.android.gms.internal.measurement.zzff) ((com.google.android.gms.internal.measurement.zzfe) zzpk.zzw(com.google.android.gms.internal.measurement.zzff.zzn(), cursorQuery3.getBlob(1))).zzbd();
                                                                                                                            numValueOf5 = Integer.valueOf(cursorQuery3.getInt(0));
                                                                                                                            list6 = (List) aVar7.get(numValueOf5);
                                                                                                                            if (list6 == null) {
                                                                                                                                cursor4 = cursorQuery3;
                                                                                                                                try {
                                                                                                                                    arrayList4 = new ArrayList();
                                                                                                                                    aVar7.put(numValueOf5, arrayList4);
                                                                                                                                } catch (SQLiteException e16) {
                                                                                                                                    e = e16;
                                                                                                                                    cursor3 = cursor4;
                                                                                                                                    try {
                                                                                                                                        zzawVarZzj3.zzu.zzaW().zzb().zzc("Database error querying filters. appId", zzgu.zzl(str11), e);
                                                                                                                                        map7 = Collections.EMPTY_MAP;
                                                                                                                                        if (cursor3 != null) {
                                                                                                                                            cursor3.close();
                                                                                                                                        }
                                                                                                                                    } catch (Throwable th2) {
                                                                                                                                        th = th2;
                                                                                                                                        if (cursor3 != null) {
                                                                                                                                            cursor3.close();
                                                                                                                                        }
                                                                                                                                        throw th;
                                                                                                                                    }
                                                                                                                                } catch (Throwable th3) {
                                                                                                                                    th = th3;
                                                                                                                                    cursor3 = cursor4;
                                                                                                                                    if (cursor3 != null) {
                                                                                                                                        cursor3.close();
                                                                                                                                    }
                                                                                                                                    throw th;
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                cursor4 = cursorQuery3;
                                                                                                                                arrayList4 = list6;
                                                                                                                            }
                                                                                                                            arrayList4.add(zzffVar2);
                                                                                                                        } catch (IOException e17) {
                                                                                                                            cursor4 = cursorQuery3;
                                                                                                                            zzawVarZzj3.zzu.zzaW().zzb().zzc("Failed to merge filter. appId", zzgu.zzl(str11), e17);
                                                                                                                        }
                                                                                                                        if (!cursor4.moveToNext()) {
                                                                                                                            break;
                                                                                                                        }
                                                                                                                        cursorQuery3 = cursor4;
                                                                                                                    } catch (SQLiteException e18) {
                                                                                                                        e = e18;
                                                                                                                        cursor4 = cursorQuery3;
                                                                                                                    }
                                                                                                                }
                                                                                                                cursor4.close();
                                                                                                                map7 = aVar7;
                                                                                                            } else {
                                                                                                                zzbdVar = zzbdVarZzah;
                                                                                                                map7 = Collections.EMPTY_MAP;
                                                                                                                cursorQuery3.close();
                                                                                                            }
                                                                                                        } catch (Throwable th4) {
                                                                                                            th = th4;
                                                                                                            cursor4 = cursorQuery3;
                                                                                                        }
                                                                                                    } catch (SQLiteException e19) {
                                                                                                        e = e19;
                                                                                                        cursor4 = cursorQuery3;
                                                                                                        zzbdVar = zzbdVarZzah;
                                                                                                    }
                                                                                                } catch (SQLiteException e20) {
                                                                                                    e = e20;
                                                                                                    zzbdVar = zzbdVarZzah;
                                                                                                    cursor3 = null;
                                                                                                    zzawVarZzj3.zzu.zzaW().zzb().zzc("Database error querying filters. appId", zzgu.zzl(str11), e);
                                                                                                    map7 = Collections.EMPTY_MAP;
                                                                                                    if (cursor3 != null) {
                                                                                                        cursor3.close();
                                                                                                    }
                                                                                                    aVar6.put(strZzd, map7);
                                                                                                    it8 = map7.keySet().iterator();
                                                                                                    while (it8.hasNext()) {
                                                                                                        num2 = (Integer) it8.next();
                                                                                                        iIntValue = num2.intValue();
                                                                                                        if (this.zzb.contains(num2)) {
                                                                                                            this.zzu.zzaW().zzk().zzb("Skipping failed audience ID", num2);
                                                                                                        } else {
                                                                                                            it9 = ((List) map7.get(num2)).iterator();
                                                                                                            zZzd2 = true;
                                                                                                            while (true) {
                                                                                                                if (!it9.hasNext()) {
                                                                                                                    map8 = map7;
                                                                                                                    it10 = it8;
                                                                                                                    j11 = j10;
                                                                                                                    break;
                                                                                                                }
                                                                                                                com.google.android.gms.internal.measurement.zzff zzffVar3 = (com.google.android.gms.internal.measurement.zzff) it9.next();
                                                                                                                map8 = map7;
                                                                                                                it10 = it8;
                                                                                                                zzaaVar = new zzaa(this, this.zza, iIntValue, zzffVar3);
                                                                                                                j11 = j10;
                                                                                                                zZzd2 = zzaaVar.zzd(this.zzd, this.zze, zzhsVarZza, j11, zzbdVar, zzd(iIntValue, zzffVar3.zzb()));
                                                                                                                if (!zZzd2) {
                                                                                                                    this.zzb.add(num2);
                                                                                                                    break;
                                                                                                                }
                                                                                                                zzc(num2).zza(zzaaVar);
                                                                                                                j10 = j11;
                                                                                                                map7 = map8;
                                                                                                                it8 = it10;
                                                                                                            }
                                                                                                            if (!zZzd2) {
                                                                                                                this.zzb.add(num2);
                                                                                                            }
                                                                                                            j10 = j11;
                                                                                                            map7 = map8;
                                                                                                            it8 = it10;
                                                                                                        }
                                                                                                    }
                                                                                                    it7 = it7;
                                                                                                    zzzVar = zzzVar;
                                                                                                }
                                                                                            } catch (Throwable th5) {
                                                                                                th = th5;
                                                                                                cursor3 = null;
                                                                                            }
                                                                                        } catch (SQLiteException e21) {
                                                                                            e = e21;
                                                                                            str11 = str10;
                                                                                        }
                                                                                        aVar6.put(strZzd, map7);
                                                                                    } else {
                                                                                        zzbdVar = zzbdVarZzah;
                                                                                    }
                                                                                    it8 = map7.keySet().iterator();
                                                                                    while (it8.hasNext()) {
                                                                                        num2 = (Integer) it8.next();
                                                                                        iIntValue = num2.intValue();
                                                                                        if (this.zzb.contains(num2)) {
                                                                                            this.zzu.zzaW().zzk().zzb("Skipping failed audience ID", num2);
                                                                                        } else {
                                                                                            it9 = ((List) map7.get(num2)).iterator();
                                                                                            zZzd2 = true;
                                                                                            while (true) {
                                                                                                if (!it9.hasNext()) {
                                                                                                    map8 = map7;
                                                                                                    it10 = it8;
                                                                                                    j11 = j10;
                                                                                                    break;
                                                                                                }
                                                                                                com.google.android.gms.internal.measurement.zzff zzffVar4 = (com.google.android.gms.internal.measurement.zzff) it9.next();
                                                                                                map8 = map7;
                                                                                                it10 = it8;
                                                                                                zzaaVar = new zzaa(this, this.zza, iIntValue, zzffVar4);
                                                                                                j11 = j10;
                                                                                                zZzd2 = zzaaVar.zzd(this.zzd, this.zze, zzhsVarZza, j11, zzbdVar, zzd(iIntValue, zzffVar4.zzb()));
                                                                                                if (!zZzd2) {
                                                                                                    this.zzb.add(num2);
                                                                                                    break;
                                                                                                }
                                                                                                zzc(num2).zza(zzaaVar);
                                                                                                j10 = j11;
                                                                                                map7 = map8;
                                                                                                it8 = it10;
                                                                                            }
                                                                                            if (!zZzd2) {
                                                                                                this.zzb.add(num2);
                                                                                            }
                                                                                            j10 = j11;
                                                                                            map7 = map8;
                                                                                            it8 = it10;
                                                                                        }
                                                                                    }
                                                                                    it7 = it7;
                                                                                    zzzVar = zzzVar;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    if (!z10) {
                                                                        return new ArrayList();
                                                                    }
                                                                    if (!list2.isEmpty()) {
                                                                        aVar4 = new a();
                                                                        it4 = list2.iterator();
                                                                        while (it4.hasNext()) {
                                                                            com.google.android.gms.internal.measurement.zziu zziuVar = (com.google.android.gms.internal.measurement.zziu) it4.next();
                                                                            strZzc = zziuVar.zzc();
                                                                            map5 = (Map) aVar4.get(strZzc);
                                                                            if (map5 == null) {
                                                                                zzawVarZzj2 = this.zzg.zzj();
                                                                                str8 = this.zza;
                                                                                zzawVarZzj2.zzay();
                                                                                zzawVarZzj2.zzg();
                                                                                Preconditions.checkNotEmpty(str8);
                                                                                Preconditions.checkNotEmpty(strZzc);
                                                                                aVar5 = new a();
                                                                                try {
                                                                                    cursorQuery2 = zzawVarZzj2.zze().query("property_filters", new String[]{str5, str4}, "app_id=? AND property_name=?", new String[]{str8, strZzc}, null, null, null);
                                                                                    try {
                                                                                        try {
                                                                                            if (cursorQuery2.moveToFirst()) {
                                                                                                while (true) {
                                                                                                    try {
                                                                                                        com.google.android.gms.internal.measurement.zzfn zzfnVar2 = (com.google.android.gms.internal.measurement.zzfn) ((com.google.android.gms.internal.measurement.zzfm) zzpk.zzw(com.google.android.gms.internal.measurement.zzfn.zzj(), cursorQuery2.getBlob(1))).zzbd();
                                                                                                        numValueOf4 = Integer.valueOf(cursorQuery2.getInt(0));
                                                                                                        list5 = (List) aVar5.get(numValueOf4);
                                                                                                        if (list5 == null) {
                                                                                                            it5 = it4;
                                                                                                            try {
                                                                                                                arrayList3 = new ArrayList();
                                                                                                                aVar5.put(numValueOf4, arrayList3);
                                                                                                            } catch (SQLiteException e22) {
                                                                                                                e = e22;
                                                                                                                str9 = str8;
                                                                                                                zzawVarZzj2.zzu.zzaW().zzb().zzc("Database error querying filters. appId", zzgu.zzl(str9), e);
                                                                                                                map5 = Collections.EMPTY_MAP;
                                                                                                                if (cursorQuery2 != null) {
                                                                                                                    cursorQuery2.close();
                                                                                                                }
                                                                                                                aVar4.put(strZzc, map5);
                                                                                                                for (Integer num4 : map5.keySet()) {
                                                                                                                    int iIntValue2 = num4.intValue();
                                                                                                                    if (this.zzb.contains(num4)) {
                                                                                                                        this.zzu.zzaW().zzk().zzb(str6, num4);
                                                                                                                        break;
                                                                                                                    }
                                                                                                                    it6 = ((List) map5.get(num4)).iterator();
                                                                                                                    zZzd = true;
                                                                                                                    while (true) {
                                                                                                                        if (it6.hasNext()) {
                                                                                                                            zzfnVar = (com.google.android.gms.internal.measurement.zzfn) it6.next();
                                                                                                                            zzicVar = this.zzu;
                                                                                                                            map6 = map5;
                                                                                                                            if (Log.isLoggable(zzicVar.zzaW().zzn(), 2)) {
                                                                                                                                zzgs zzgsVarZzk = zzicVar.zzaW().zzk();
                                                                                                                                if (zzfnVar.zza()) {
                                                                                                                                    numValueOf3 = Integer.valueOf(zzfnVar.zzb());
                                                                                                                                } else {
                                                                                                                                    numValueOf3 = null;
                                                                                                                                }
                                                                                                                                zzgsVarZzk.zzd("Evaluating filter. audience, filter, property", num4, numValueOf3, zzicVar.zzl().zzc(zzfnVar.zzc()));
                                                                                                                                zzicVar.zzaW().zzk().zzb("Filter definition", this.zzg.zzp().zzk(zzfnVar));
                                                                                                                            }
                                                                                                                            if (zzfnVar.zza()) {
                                                                                                                            }
                                                                                                                            zzgs zzgsVarZze = zzicVar.zzaW().zze();
                                                                                                                            Object objZzl = zzgu.zzl(this.zza);
                                                                                                                            if (zzfnVar.zza()) {
                                                                                                                                numValueOf2 = Integer.valueOf(zzfnVar.zzb());
                                                                                                                            } else {
                                                                                                                                numValueOf2 = null;
                                                                                                                            }
                                                                                                                            zzgsVarZze.zzc("Invalid property filter ID. appId, id", objZzl, String.valueOf(numValueOf2));
                                                                                                                            this.zzb.add(num4);
                                                                                                                            map5 = map6;
                                                                                                                            aVar4 = aVar4;
                                                                                                                            str6 = str6;
                                                                                                                        } else {
                                                                                                                            map6 = map5;
                                                                                                                            str6 = str6;
                                                                                                                            aVar4 = aVar4;
                                                                                                                        }
                                                                                                                        if (!zZzd) {
                                                                                                                            this.zzb.add(num4);
                                                                                                                        }
                                                                                                                        map5 = map6;
                                                                                                                        aVar4 = aVar4;
                                                                                                                        str6 = str6;
                                                                                                                        zzc(num4).zza(zzacVar);
                                                                                                                        map5 = map6;
                                                                                                                        aVar4 = aVar4;
                                                                                                                        str6 = str6;
                                                                                                                    }
                                                                                                                }
                                                                                                                it4 = it5;
                                                                                                            }
                                                                                                        } else {
                                                                                                            it5 = it4;
                                                                                                            arrayList3 = list5;
                                                                                                        }
                                                                                                        arrayList3.add(zzfnVar2);
                                                                                                        str9 = str8;
                                                                                                    } catch (IOException e23) {
                                                                                                        it5 = it4;
                                                                                                        str9 = str8;
                                                                                                        zzawVarZzj2.zzu.zzaW().zzb().zzc("Failed to merge filter", zzgu.zzl(str9), e23);
                                                                                                    }
                                                                                                    try {
                                                                                                        if (!cursorQuery2.moveToNext()) {
                                                                                                            break;
                                                                                                        }
                                                                                                        it4 = it5;
                                                                                                        str8 = str9;
                                                                                                    } catch (SQLiteException e24) {
                                                                                                        e = e24;
                                                                                                        zzawVarZzj2.zzu.zzaW().zzb().zzc("Database error querying filters. appId", zzgu.zzl(str9), e);
                                                                                                        map5 = Collections.EMPTY_MAP;
                                                                                                        if (cursorQuery2 != null) {
                                                                                                            cursorQuery2.close();
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                cursorQuery2.close();
                                                                                                map5 = aVar5;
                                                                                            } else {
                                                                                                it5 = it4;
                                                                                                map5 = Collections.EMPTY_MAP;
                                                                                                cursorQuery2.close();
                                                                                            }
                                                                                        } catch (SQLiteException e25) {
                                                                                            e = e25;
                                                                                            it5 = it4;
                                                                                        }
                                                                                    } catch (Throwable th6) {
                                                                                        th = th6;
                                                                                        cursor2 = cursorQuery2;
                                                                                        if (cursor2 != null) {
                                                                                            cursor2.close();
                                                                                        }
                                                                                        throw th;
                                                                                    }
                                                                                } catch (SQLiteException e26) {
                                                                                    e = e26;
                                                                                    it5 = it4;
                                                                                    str9 = str8;
                                                                                    cursorQuery2 = null;
                                                                                } catch (Throwable th7) {
                                                                                    th = th7;
                                                                                    cursor2 = null;
                                                                                }
                                                                                aVar4.put(strZzc, map5);
                                                                            } else {
                                                                                it5 = it4;
                                                                            }
                                                                            while (r4.hasNext()) {
                                                                                int iIntValue3 = num4.intValue();
                                                                                if (this.zzb.contains(num4)) {
                                                                                    this.zzu.zzaW().zzk().zzb(str6, num4);
                                                                                    break;
                                                                                    break;
                                                                                }
                                                                                it6 = ((List) map5.get(num4)).iterator();
                                                                                zZzd = true;
                                                                                while (true) {
                                                                                    if (it6.hasNext()) {
                                                                                        zzfnVar = (com.google.android.gms.internal.measurement.zzfn) it6.next();
                                                                                        zzicVar = this.zzu;
                                                                                        map6 = map5;
                                                                                        if (Log.isLoggable(zzicVar.zzaW().zzn(), 2)) {
                                                                                            zzgs zzgsVarZzk2 = zzicVar.zzaW().zzk();
                                                                                            if (zzfnVar.zza()) {
                                                                                                numValueOf3 = Integer.valueOf(zzfnVar.zzb());
                                                                                            } else {
                                                                                                numValueOf3 = null;
                                                                                            }
                                                                                            zzgsVarZzk2.zzd("Evaluating filter. audience, filter, property", num4, numValueOf3, zzicVar.zzl().zzc(zzfnVar.zzc()));
                                                                                            zzicVar.zzaW().zzk().zzb("Filter definition", this.zzg.zzp().zzk(zzfnVar));
                                                                                        }
                                                                                        if (zzfnVar.zza()) {
                                                                                        }
                                                                                        zzgs zzgsVarZze2 = zzicVar.zzaW().zze();
                                                                                        Object objZzl2 = zzgu.zzl(this.zza);
                                                                                        if (zzfnVar.zza()) {
                                                                                            numValueOf2 = Integer.valueOf(zzfnVar.zzb());
                                                                                        } else {
                                                                                            numValueOf2 = null;
                                                                                        }
                                                                                        zzgsVarZze2.zzc("Invalid property filter ID. appId, id", objZzl2, String.valueOf(numValueOf2));
                                                                                        this.zzb.add(num4);
                                                                                        map5 = map6;
                                                                                        aVar4 = aVar4;
                                                                                        str6 = str6;
                                                                                    } else {
                                                                                        map6 = map5;
                                                                                        str6 = str6;
                                                                                        aVar4 = aVar4;
                                                                                    }
                                                                                    if (!zZzd) {
                                                                                        this.zzb.add(num4);
                                                                                    }
                                                                                    map5 = map6;
                                                                                    aVar4 = aVar4;
                                                                                    str6 = str6;
                                                                                    zzc(num4).zza(zzacVar);
                                                                                    map5 = map6;
                                                                                    aVar4 = aVar4;
                                                                                    str6 = str6;
                                                                                }
                                                                            }
                                                                            it4 = it5;
                                                                        }
                                                                    }
                                                                    arrayList2 = new ArrayList();
                                                                    Set<Integer> setKeySet = this.zzc.keySet();
                                                                    setKeySet.removeAll(this.zzb);
                                                                    for (Integer num5 : setKeySet) {
                                                                        int iIntValue4 = num5.intValue();
                                                                        zzy zzyVar = (zzy) this.zzc.get(num5);
                                                                        Preconditions.checkNotNull(zzyVar);
                                                                        com.google.android.gms.internal.measurement.zzhg zzhgVarZzb = zzyVar.zzb(iIntValue4);
                                                                        arrayList2.add(zzhgVarZzb);
                                                                        zzawVarZzj = this.zzg.zzj();
                                                                        str7 = this.zza;
                                                                        com.google.android.gms.internal.measurement.zzii zziiVarZzc = zzhgVarZzb.zzc();
                                                                        zzawVarZzj.zzay();
                                                                        zzawVarZzj.zzg();
                                                                        Preconditions.checkNotEmpty(str7);
                                                                        Preconditions.checkNotNull(zziiVarZzc);
                                                                        byte[] bArrZzcd = zziiVarZzc.zzcd();
                                                                        contentValues = new ContentValues();
                                                                        contentValues.put(MBridgeConstans.APP_ID, str7);
                                                                        contentValues.put(str5, num5);
                                                                        contentValues.put("current_results", bArrZzcd);
                                                                        try {
                                                                            try {
                                                                                if (zzawVarZzj.zze().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                                                                    zzawVarZzj.zzu.zzaW().zzb().zzb("Failed to insert filter results (got -1). appId", zzgu.zzl(str7));
                                                                                }
                                                                            } catch (SQLiteException e27) {
                                                                                e = e27;
                                                                                zzawVarZzj.zzu.zzaW().zzb().zzc("Error storing filter results. appId", zzgu.zzl(str7), e);
                                                                            }
                                                                        } catch (SQLiteException e28) {
                                                                            e = e28;
                                                                        }
                                                                    }
                                                                    return arrayList2;
                                                                }
                                                            } catch (Throwable th8) {
                                                                th = th8;
                                                                r10 = sQLiteDatabaseZze;
                                                                if (r10 != 0) {
                                                                    r10.close();
                                                                }
                                                                throw th;
                                                            }
                                                        } catch (SQLiteException e29) {
                                                            e = e29;
                                                            cursorRawQuery = null;
                                                        } catch (Throwable th9) {
                                                            th = th9;
                                                            r10 = 0;
                                                            if (r10 != 0) {
                                                                r10.close();
                                                            }
                                                            throw th;
                                                        }
                                                        cursorRawQuery.close();
                                                        Preconditions.checkNotEmpty(str17);
                                                        Preconditions.checkNotNull(map2);
                                                        aVar3 = new a();
                                                        if (!map2.isEmpty()) {
                                                            it2 = map2.keySet().iterator();
                                                            while (it2.hasNext()) {
                                                                num = (Integer) it2.next();
                                                                num.intValue();
                                                                zziiVar3 = (com.google.android.gms.internal.measurement.zzii) map2.get(num);
                                                                list4 = (List) aVar2.get(num);
                                                                if (list4 != null) {
                                                                }
                                                                map4 = aVar2;
                                                                hashSet3 = hashSet;
                                                                it3 = it2;
                                                                aVar3.put(num, zziiVar3);
                                                                aVar2 = map4;
                                                                hashSet = hashSet3;
                                                                it2 = it3;
                                                            }
                                                        }
                                                        hashSet2 = hashSet;
                                                        map3 = aVar3;
                                                    } else {
                                                        hashSet2 = hashSet;
                                                        map3 = map2;
                                                    }
                                                    while (r16.hasNext()) {
                                                        num3.intValue();
                                                        zziiVar = (com.google.android.gms.internal.measurement.zzii) map3.get(num3);
                                                        bitSet = new BitSet();
                                                        bitSet2 = new BitSet();
                                                        aVar = new a();
                                                        if (zziiVar != null) {
                                                            while (r7.hasNext()) {
                                                                if (zzhqVar.zza()) {
                                                                    Map map13 = map3;
                                                                    Integer numValueOf8 = Integer.valueOf(zzhqVar.zzb());
                                                                    if (zzhqVar.zzc()) {
                                                                        lValueOf = Long.valueOf(zzhqVar.zzd());
                                                                    } else {
                                                                        lValueOf = null;
                                                                    }
                                                                    aVar.put(numValueOf8, lValueOf);
                                                                    map3 = map13;
                                                                }
                                                            }
                                                        }
                                                        Map map14 = map3;
                                                        a aVar11 = new a();
                                                        if (zziiVar != null) {
                                                            it = zziiVar.zzh().iterator();
                                                            while (it.hasNext()) {
                                                                zzikVar = (com.google.android.gms.internal.measurement.zzik) it.next();
                                                                if (!zzikVar.zza()) {
                                                                }
                                                            }
                                                        }
                                                        zziiVar2 = zziiVar;
                                                        if (zziiVar2 != null) {
                                                            i12 = 0;
                                                            while (i12 < zziiVar2.zzb() * 64) {
                                                                if (zzpk.zzn(zziiVar2.zza(), i12)) {
                                                                    z13 = zZzp;
                                                                    this.zzu.zzaW().zzk().zzc("Filter already evaluated. audience ID, filter ID", num3, Integer.valueOf(i12));
                                                                    bitSet2.set(i12);
                                                                    if (zzpk.zzn(zziiVar2.zzc(), i12)) {
                                                                        bitSet.set(i12);
                                                                    }
                                                                    i12++;
                                                                    zZzp = z13;
                                                                } else {
                                                                    z13 = zZzp;
                                                                }
                                                                aVar.remove(Integer.valueOf(i12));
                                                                i12++;
                                                                zZzp = z13;
                                                            }
                                                        }
                                                        boolean z15 = zZzp;
                                                        com.google.android.gms.internal.measurement.zzii zziiVar5 = (com.google.android.gms.internal.measurement.zzii) map2.get(num3);
                                                        if (!zZzp2) {
                                                        }
                                                        this.zzc.put(num3, new zzy(this, this.zza, zziiVar5, bitSet, bitSet2, aVar, aVar11, null));
                                                        str2 = str2;
                                                        map = map;
                                                        str14 = str14;
                                                        map2 = map2;
                                                        zZzp = z15;
                                                        map3 = map14;
                                                    }
                                                }
                                                str4 = str2;
                                                str5 = str14;
                                                str6 = "Skipping failed audience ID";
                                                if (!list.isEmpty()) {
                                                    zzzVar = new zzz(this, null);
                                                    aVar6 = new a();
                                                    it7 = list.iterator();
                                                    while (it7.hasNext()) {
                                                        zzhsVar = (com.google.android.gms.internal.measurement.zzhs) it7.next();
                                                        zzhsVarZza = zzzVar.zza(this.zza, zzhsVar);
                                                        if (zzhsVarZza != null) {
                                                            zzpgVar = this.zzg;
                                                            zzbdVarZzah = zzpgVar.zzj().zzah(this.zza, zzhsVar, zzhsVarZza.zzd());
                                                            zzpgVar.zzj().zzh(zzbdVarZzah);
                                                            if (z10) {
                                                                j10 = zzbdVarZzah.zzc;
                                                                strZzd = zzhsVarZza.zzd();
                                                                map7 = (Map) aVar6.get(strZzd);
                                                                if (map7 == null) {
                                                                    zzawVarZzj3 = zzpgVar.zzj();
                                                                    str10 = this.zza;
                                                                    zzawVarZzj3.zzay();
                                                                    zzawVarZzj3.zzg();
                                                                    Preconditions.checkNotEmpty(str10);
                                                                    Preconditions.checkNotEmpty(strZzd);
                                                                    aVar7 = new a();
                                                                    str11 = str10;
                                                                    cursorQuery3 = zzawVarZzj3.zze().query("event_filters", new String[]{str5, str4}, "app_id=? AND event_name=?", new String[]{str10, strZzd}, null, null, null);
                                                                    if (cursorQuery3.moveToFirst()) {
                                                                        zzbdVar = zzbdVarZzah;
                                                                        while (true) {
                                                                            com.google.android.gms.internal.measurement.zzff zzffVar5 = (com.google.android.gms.internal.measurement.zzff) ((com.google.android.gms.internal.measurement.zzfe) zzpk.zzw(com.google.android.gms.internal.measurement.zzff.zzn(), cursorQuery3.getBlob(1))).zzbd();
                                                                            numValueOf5 = Integer.valueOf(cursorQuery3.getInt(0));
                                                                            list6 = (List) aVar7.get(numValueOf5);
                                                                            if (list6 == null) {
                                                                                cursor4 = cursorQuery3;
                                                                                arrayList4 = new ArrayList();
                                                                                aVar7.put(numValueOf5, arrayList4);
                                                                            } else {
                                                                                cursor4 = cursorQuery3;
                                                                                arrayList4 = list6;
                                                                            }
                                                                            arrayList4.add(zzffVar5);
                                                                            if (!cursor4.moveToNext()) {
                                                                                break;
                                                                                break;
                                                                            }
                                                                            cursorQuery3 = cursor4;
                                                                        }
                                                                        cursor4.close();
                                                                        map7 = aVar7;
                                                                    } else {
                                                                        zzbdVar = zzbdVarZzah;
                                                                        map7 = Collections.EMPTY_MAP;
                                                                        cursorQuery3.close();
                                                                    }
                                                                    aVar6.put(strZzd, map7);
                                                                } else {
                                                                    zzbdVar = zzbdVarZzah;
                                                                }
                                                                it8 = map7.keySet().iterator();
                                                                while (it8.hasNext()) {
                                                                    num2 = (Integer) it8.next();
                                                                    iIntValue = num2.intValue();
                                                                    if (this.zzb.contains(num2)) {
                                                                        this.zzu.zzaW().zzk().zzb("Skipping failed audience ID", num2);
                                                                    } else {
                                                                        it9 = ((List) map7.get(num2)).iterator();
                                                                        zZzd2 = true;
                                                                        while (true) {
                                                                            if (!it9.hasNext()) {
                                                                                map8 = map7;
                                                                                it10 = it8;
                                                                                j11 = j10;
                                                                                break;
                                                                            }
                                                                            com.google.android.gms.internal.measurement.zzff zzffVar6 = (com.google.android.gms.internal.measurement.zzff) it9.next();
                                                                            map8 = map7;
                                                                            it10 = it8;
                                                                            zzaaVar = new zzaa(this, this.zza, iIntValue, zzffVar6);
                                                                            j11 = j10;
                                                                            zZzd2 = zzaaVar.zzd(this.zzd, this.zze, zzhsVarZza, j11, zzbdVar, zzd(iIntValue, zzffVar6.zzb()));
                                                                            if (!zZzd2) {
                                                                                this.zzb.add(num2);
                                                                                break;
                                                                            }
                                                                            zzc(num2).zza(zzaaVar);
                                                                            j10 = j11;
                                                                            map7 = map8;
                                                                            it8 = it10;
                                                                        }
                                                                        if (!zZzd2) {
                                                                            this.zzb.add(num2);
                                                                        }
                                                                        j10 = j11;
                                                                        map7 = map8;
                                                                        it8 = it10;
                                                                    }
                                                                }
                                                                it7 = it7;
                                                                zzzVar = zzzVar;
                                                            } else {
                                                                continue;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (!z10) {
                                                    return new ArrayList();
                                                }
                                                if (!list2.isEmpty()) {
                                                    aVar4 = new a();
                                                    it4 = list2.iterator();
                                                    while (it4.hasNext()) {
                                                        com.google.android.gms.internal.measurement.zziu zziuVar2 = (com.google.android.gms.internal.measurement.zziu) it4.next();
                                                        strZzc = zziuVar2.zzc();
                                                        map5 = (Map) aVar4.get(strZzc);
                                                        if (map5 == null) {
                                                            zzawVarZzj2 = this.zzg.zzj();
                                                            str8 = this.zza;
                                                            zzawVarZzj2.zzay();
                                                            zzawVarZzj2.zzg();
                                                            Preconditions.checkNotEmpty(str8);
                                                            Preconditions.checkNotEmpty(strZzc);
                                                            aVar5 = new a();
                                                            cursorQuery2 = zzawVarZzj2.zze().query("property_filters", new String[]{str5, str4}, "app_id=? AND property_name=?", new String[]{str8, strZzc}, null, null, null);
                                                            if (cursorQuery2.moveToFirst()) {
                                                                while (true) {
                                                                    com.google.android.gms.internal.measurement.zzfn zzfnVar3 = (com.google.android.gms.internal.measurement.zzfn) ((com.google.android.gms.internal.measurement.zzfm) zzpk.zzw(com.google.android.gms.internal.measurement.zzfn.zzj(), cursorQuery2.getBlob(1))).zzbd();
                                                                    numValueOf4 = Integer.valueOf(cursorQuery2.getInt(0));
                                                                    list5 = (List) aVar5.get(numValueOf4);
                                                                    if (list5 == null) {
                                                                        it5 = it4;
                                                                        arrayList3 = new ArrayList();
                                                                        aVar5.put(numValueOf4, arrayList3);
                                                                    } else {
                                                                        it5 = it4;
                                                                        arrayList3 = list5;
                                                                    }
                                                                    arrayList3.add(zzfnVar3);
                                                                    str9 = str8;
                                                                    if (!cursorQuery2.moveToNext()) {
                                                                        break;
                                                                        break;
                                                                    }
                                                                    it4 = it5;
                                                                    str8 = str9;
                                                                }
                                                                cursorQuery2.close();
                                                                map5 = aVar5;
                                                            } else {
                                                                it5 = it4;
                                                                map5 = Collections.EMPTY_MAP;
                                                                cursorQuery2.close();
                                                            }
                                                            aVar4.put(strZzc, map5);
                                                        } else {
                                                            it5 = it4;
                                                        }
                                                        while (r4.hasNext()) {
                                                            int iIntValue5 = num4.intValue();
                                                            if (this.zzb.contains(num4)) {
                                                                this.zzu.zzaW().zzk().zzb(str6, num4);
                                                                break;
                                                                break;
                                                            }
                                                            it6 = ((List) map5.get(num4)).iterator();
                                                            zZzd = true;
                                                            while (true) {
                                                                if (it6.hasNext()) {
                                                                    zzfnVar = (com.google.android.gms.internal.measurement.zzfn) it6.next();
                                                                    zzicVar = this.zzu;
                                                                    map6 = map5;
                                                                    if (Log.isLoggable(zzicVar.zzaW().zzn(), 2)) {
                                                                        zzgs zzgsVarZzk3 = zzicVar.zzaW().zzk();
                                                                        if (zzfnVar.zza()) {
                                                                            numValueOf3 = Integer.valueOf(zzfnVar.zzb());
                                                                        } else {
                                                                            numValueOf3 = null;
                                                                        }
                                                                        zzgsVarZzk3.zzd("Evaluating filter. audience, filter, property", num4, numValueOf3, zzicVar.zzl().zzc(zzfnVar.zzc()));
                                                                        zzicVar.zzaW().zzk().zzb("Filter definition", this.zzg.zzp().zzk(zzfnVar));
                                                                    }
                                                                    if (zzfnVar.zza()) {
                                                                    }
                                                                    zzgs zzgsVarZze3 = zzicVar.zzaW().zze();
                                                                    Object objZzl3 = zzgu.zzl(this.zza);
                                                                    if (zzfnVar.zza()) {
                                                                        numValueOf2 = Integer.valueOf(zzfnVar.zzb());
                                                                    } else {
                                                                        numValueOf2 = null;
                                                                    }
                                                                    zzgsVarZze3.zzc("Invalid property filter ID. appId, id", objZzl3, String.valueOf(numValueOf2));
                                                                    this.zzb.add(num4);
                                                                    map5 = map6;
                                                                    aVar4 = aVar4;
                                                                    str6 = str6;
                                                                } else {
                                                                    map6 = map5;
                                                                    str6 = str6;
                                                                    aVar4 = aVar4;
                                                                }
                                                                if (!zZzd) {
                                                                    this.zzb.add(num4);
                                                                }
                                                                map5 = map6;
                                                                aVar4 = aVar4;
                                                                str6 = str6;
                                                                zzc(num4).zza(zzacVar);
                                                                map5 = map6;
                                                                aVar4 = aVar4;
                                                                str6 = str6;
                                                            }
                                                        }
                                                        it4 = it5;
                                                    }
                                                }
                                                arrayList2 = new ArrayList();
                                                Set<Integer> setKeySet2 = this.zzc.keySet();
                                                setKeySet2.removeAll(this.zzb);
                                                while (r3.hasNext()) {
                                                    int iIntValue6 = num5.intValue();
                                                    zzy zzyVar2 = (zzy) this.zzc.get(num5);
                                                    Preconditions.checkNotNull(zzyVar2);
                                                    com.google.android.gms.internal.measurement.zzhg zzhgVarZzb2 = zzyVar2.zzb(iIntValue6);
                                                    arrayList2.add(zzhgVarZzb2);
                                                    zzawVarZzj = this.zzg.zzj();
                                                    str7 = this.zza;
                                                    com.google.android.gms.internal.measurement.zzii zziiVarZzc2 = zzhgVarZzb2.zzc();
                                                    zzawVarZzj.zzay();
                                                    zzawVarZzj.zzg();
                                                    Preconditions.checkNotEmpty(str7);
                                                    Preconditions.checkNotNull(zziiVarZzc2);
                                                    byte[] bArrZzcd2 = zziiVarZzc2.zzcd();
                                                    contentValues = new ContentValues();
                                                    contentValues.put(MBridgeConstans.APP_ID, str7);
                                                    contentValues.put(str5, num5);
                                                    contentValues.put("current_results", bArrZzcd2);
                                                    if (zzawVarZzj.zze().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                                        zzawVarZzj.zzu.zzaW().zzb().zzb("Failed to insert filter results (got -1). appId", zzgu.zzl(str7));
                                                    }
                                                }
                                                return arrayList2;
                                            }
                                        }
                                        try {
                                            if (!cursorQuery.moveToNext()) {
                                                break;
                                            }
                                            z11 = z12;
                                            str13 = str2;
                                            str14 = str14;
                                        } catch (SQLiteException e30) {
                                            e = e30;
                                            zzawVarZzj6.zzu.zzaW().zzb().zzc("Database error querying filter results. appId", zzgu.zzl(str16), e);
                                            Map map15 = Collections.EMPTY_MAP;
                                            if (cursorQuery != null) {
                                                cursorQuery.close();
                                            }
                                            map2 = map15;
                                        }
                                    }
                                    cursorQuery.close();
                                    map2 = aVar8;
                                } else {
                                    Map map16 = Collections.EMPTY_MAP;
                                    cursorQuery.close();
                                    map2 = map16;
                                    z12 = z11;
                                    str2 = DataSchemeDataSource.SCHEME_DATA;
                                    str14 = "audience_id";
                                }
                            } catch (Throwable th10) {
                                th = th10;
                                cursor = cursorQuery;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                throw th;
                            }
                        } catch (SQLiteException e31) {
                            e = e31;
                            z12 = z11;
                            str2 = DataSchemeDataSource.SCHEME_DATA;
                        }
                        if (!map2.isEmpty()) {
                            hashSet = new HashSet(map2.keySet());
                            if (z12) {
                                String str18 = this.zza;
                                zzaw zzawVarZzj8 = this.zzg.zzj();
                                str3 = this.zza;
                                zzawVarZzj8.zzay();
                                zzawVarZzj8.zzg();
                                Preconditions.checkNotEmpty(str3);
                                aVar2 = new a();
                                sQLiteDatabaseZze = zzawVarZzj8.zze();
                                cursorRawQuery = sQLiteDatabaseZze.rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str3, str3});
                                if (cursorRawQuery.moveToFirst()) {
                                    do {
                                        numValueOf = Integer.valueOf(cursorRawQuery.getInt(0));
                                        arrayList = (List) aVar2.get(numValueOf);
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                            aVar2.put(numValueOf, arrayList);
                                        }
                                        arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                                    } while (cursorRawQuery.moveToNext());
                                } else {
                                    aVar2 = Collections.EMPTY_MAP;
                                }
                                cursorRawQuery.close();
                                Preconditions.checkNotEmpty(str18);
                                Preconditions.checkNotNull(map2);
                                aVar3 = new a();
                                if (!map2.isEmpty()) {
                                    it2 = map2.keySet().iterator();
                                    while (it2.hasNext()) {
                                        num = (Integer) it2.next();
                                        num.intValue();
                                        zziiVar3 = (com.google.android.gms.internal.measurement.zzii) map2.get(num);
                                        list4 = (List) aVar2.get(num);
                                        if (list4 != null) {
                                        }
                                        map4 = aVar2;
                                        hashSet3 = hashSet;
                                        it3 = it2;
                                        aVar3.put(num, zziiVar3);
                                        aVar2 = map4;
                                        hashSet = hashSet3;
                                        it2 = it3;
                                    }
                                }
                                hashSet2 = hashSet;
                                map3 = aVar3;
                            } else {
                                hashSet2 = hashSet;
                                map3 = map2;
                            }
                            while (r16.hasNext()) {
                                num3.intValue();
                                zziiVar = (com.google.android.gms.internal.measurement.zzii) map3.get(num3);
                                bitSet = new BitSet();
                                bitSet2 = new BitSet();
                                aVar = new a();
                                if (zziiVar != null) {
                                    while (r7.hasNext()) {
                                        if (zzhqVar.zza()) {
                                            Map map17 = map3;
                                            Integer numValueOf9 = Integer.valueOf(zzhqVar.zzb());
                                            if (zzhqVar.zzc()) {
                                                lValueOf = Long.valueOf(zzhqVar.zzd());
                                            } else {
                                                lValueOf = null;
                                            }
                                            aVar.put(numValueOf9, lValueOf);
                                            map3 = map17;
                                        }
                                    }
                                }
                                Map map18 = map3;
                                a aVar12 = new a();
                                if (zziiVar != null) {
                                    it = zziiVar.zzh().iterator();
                                    while (it.hasNext()) {
                                        zzikVar = (com.google.android.gms.internal.measurement.zzik) it.next();
                                        if (!zzikVar.zza()) {
                                        }
                                    }
                                }
                                zziiVar2 = zziiVar;
                                if (zziiVar2 != null) {
                                    i12 = 0;
                                    while (i12 < zziiVar2.zzb() * 64) {
                                        if (zzpk.zzn(zziiVar2.zza(), i12)) {
                                            z13 = zZzp;
                                            this.zzu.zzaW().zzk().zzc("Filter already evaluated. audience ID, filter ID", num3, Integer.valueOf(i12));
                                            bitSet2.set(i12);
                                            if (zzpk.zzn(zziiVar2.zzc(), i12)) {
                                                bitSet.set(i12);
                                            }
                                            i12++;
                                            zZzp = z13;
                                        } else {
                                            z13 = zZzp;
                                        }
                                        aVar.remove(Integer.valueOf(i12));
                                        i12++;
                                        zZzp = z13;
                                    }
                                }
                                boolean z16 = zZzp;
                                com.google.android.gms.internal.measurement.zzii zziiVar6 = (com.google.android.gms.internal.measurement.zzii) map2.get(num3);
                                if (!zZzp2) {
                                }
                                this.zzc.put(num3, new zzy(this, this.zza, zziiVar6, bitSet, bitSet2, aVar, aVar12, null));
                                str2 = str2;
                                map = map;
                                str14 = str14;
                                map2 = map2;
                                zZzp = z16;
                                map3 = map18;
                            }
                        }
                        str4 = str2;
                        str5 = str14;
                        str6 = "Skipping failed audience ID";
                        if (!list.isEmpty()) {
                            zzzVar = new zzz(this, null);
                            aVar6 = new a();
                            it7 = list.iterator();
                            while (it7.hasNext()) {
                                zzhsVar = (com.google.android.gms.internal.measurement.zzhs) it7.next();
                                zzhsVarZza = zzzVar.zza(this.zza, zzhsVar);
                                if (zzhsVarZza != null) {
                                    zzpgVar = this.zzg;
                                    zzbdVarZzah = zzpgVar.zzj().zzah(this.zza, zzhsVar, zzhsVarZza.zzd());
                                    zzpgVar.zzj().zzh(zzbdVarZzah);
                                    if (z10) {
                                        j10 = zzbdVarZzah.zzc;
                                        strZzd = zzhsVarZza.zzd();
                                        map7 = (Map) aVar6.get(strZzd);
                                        if (map7 == null) {
                                            zzawVarZzj3 = zzpgVar.zzj();
                                            str10 = this.zza;
                                            zzawVarZzj3.zzay();
                                            zzawVarZzj3.zzg();
                                            Preconditions.checkNotEmpty(str10);
                                            Preconditions.checkNotEmpty(strZzd);
                                            aVar7 = new a();
                                            str11 = str10;
                                            cursorQuery3 = zzawVarZzj3.zze().query("event_filters", new String[]{str5, str4}, "app_id=? AND event_name=?", new String[]{str10, strZzd}, null, null, null);
                                            if (cursorQuery3.moveToFirst()) {
                                                zzbdVar = zzbdVarZzah;
                                                while (true) {
                                                    com.google.android.gms.internal.measurement.zzff zzffVar7 = (com.google.android.gms.internal.measurement.zzff) ((com.google.android.gms.internal.measurement.zzfe) zzpk.zzw(com.google.android.gms.internal.measurement.zzff.zzn(), cursorQuery3.getBlob(1))).zzbd();
                                                    numValueOf5 = Integer.valueOf(cursorQuery3.getInt(0));
                                                    list6 = (List) aVar7.get(numValueOf5);
                                                    if (list6 == null) {
                                                        cursor4 = cursorQuery3;
                                                        arrayList4 = new ArrayList();
                                                        aVar7.put(numValueOf5, arrayList4);
                                                    } else {
                                                        cursor4 = cursorQuery3;
                                                        arrayList4 = list6;
                                                    }
                                                    arrayList4.add(zzffVar7);
                                                    if (!cursor4.moveToNext()) {
                                                        break;
                                                        break;
                                                    }
                                                    cursorQuery3 = cursor4;
                                                }
                                                cursor4.close();
                                                map7 = aVar7;
                                            } else {
                                                zzbdVar = zzbdVarZzah;
                                                map7 = Collections.EMPTY_MAP;
                                                cursorQuery3.close();
                                            }
                                            aVar6.put(strZzd, map7);
                                        } else {
                                            zzbdVar = zzbdVarZzah;
                                        }
                                        it8 = map7.keySet().iterator();
                                        while (it8.hasNext()) {
                                            num2 = (Integer) it8.next();
                                            iIntValue = num2.intValue();
                                            if (this.zzb.contains(num2)) {
                                                this.zzu.zzaW().zzk().zzb("Skipping failed audience ID", num2);
                                            } else {
                                                it9 = ((List) map7.get(num2)).iterator();
                                                zZzd2 = true;
                                                while (true) {
                                                    if (!it9.hasNext()) {
                                                        map8 = map7;
                                                        it10 = it8;
                                                        j11 = j10;
                                                        break;
                                                    }
                                                    com.google.android.gms.internal.measurement.zzff zzffVar8 = (com.google.android.gms.internal.measurement.zzff) it9.next();
                                                    map8 = map7;
                                                    it10 = it8;
                                                    zzaaVar = new zzaa(this, this.zza, iIntValue, zzffVar8);
                                                    j11 = j10;
                                                    zZzd2 = zzaaVar.zzd(this.zzd, this.zze, zzhsVarZza, j11, zzbdVar, zzd(iIntValue, zzffVar8.zzb()));
                                                    if (!zZzd2) {
                                                        this.zzb.add(num2);
                                                        break;
                                                    }
                                                    zzc(num2).zza(zzaaVar);
                                                    j10 = j11;
                                                    map7 = map8;
                                                    it8 = it10;
                                                }
                                                if (!zZzd2) {
                                                    this.zzb.add(num2);
                                                }
                                                j10 = j11;
                                                map7 = map8;
                                                it8 = it10;
                                            }
                                        }
                                        it7 = it7;
                                        zzzVar = zzzVar;
                                    } else {
                                        continue;
                                    }
                                }
                            }
                        }
                        if (!z10) {
                            return new ArrayList();
                        }
                        if (!list2.isEmpty()) {
                            aVar4 = new a();
                            it4 = list2.iterator();
                            while (it4.hasNext()) {
                                com.google.android.gms.internal.measurement.zziu zziuVar3 = (com.google.android.gms.internal.measurement.zziu) it4.next();
                                strZzc = zziuVar3.zzc();
                                map5 = (Map) aVar4.get(strZzc);
                                if (map5 == null) {
                                    zzawVarZzj2 = this.zzg.zzj();
                                    str8 = this.zza;
                                    zzawVarZzj2.zzay();
                                    zzawVarZzj2.zzg();
                                    Preconditions.checkNotEmpty(str8);
                                    Preconditions.checkNotEmpty(strZzc);
                                    aVar5 = new a();
                                    cursorQuery2 = zzawVarZzj2.zze().query("property_filters", new String[]{str5, str4}, "app_id=? AND property_name=?", new String[]{str8, strZzc}, null, null, null);
                                    if (cursorQuery2.moveToFirst()) {
                                        while (true) {
                                            com.google.android.gms.internal.measurement.zzfn zzfnVar4 = (com.google.android.gms.internal.measurement.zzfn) ((com.google.android.gms.internal.measurement.zzfm) zzpk.zzw(com.google.android.gms.internal.measurement.zzfn.zzj(), cursorQuery2.getBlob(1))).zzbd();
                                            numValueOf4 = Integer.valueOf(cursorQuery2.getInt(0));
                                            list5 = (List) aVar5.get(numValueOf4);
                                            if (list5 == null) {
                                                it5 = it4;
                                                arrayList3 = new ArrayList();
                                                aVar5.put(numValueOf4, arrayList3);
                                            } else {
                                                it5 = it4;
                                                arrayList3 = list5;
                                            }
                                            arrayList3.add(zzfnVar4);
                                            str9 = str8;
                                            if (!cursorQuery2.moveToNext()) {
                                                break;
                                                break;
                                            }
                                            it4 = it5;
                                            str8 = str9;
                                        }
                                        cursorQuery2.close();
                                        map5 = aVar5;
                                    } else {
                                        it5 = it4;
                                        map5 = Collections.EMPTY_MAP;
                                        cursorQuery2.close();
                                    }
                                    aVar4.put(strZzc, map5);
                                } else {
                                    it5 = it4;
                                }
                                while (r4.hasNext()) {
                                    int iIntValue7 = num4.intValue();
                                    if (this.zzb.contains(num4)) {
                                        this.zzu.zzaW().zzk().zzb(str6, num4);
                                        break;
                                        break;
                                    }
                                    it6 = ((List) map5.get(num4)).iterator();
                                    zZzd = true;
                                    while (true) {
                                        if (it6.hasNext()) {
                                            zzfnVar = (com.google.android.gms.internal.measurement.zzfn) it6.next();
                                            zzicVar = this.zzu;
                                            map6 = map5;
                                            if (Log.isLoggable(zzicVar.zzaW().zzn(), 2)) {
                                                zzgs zzgsVarZzk4 = zzicVar.zzaW().zzk();
                                                if (zzfnVar.zza()) {
                                                    numValueOf3 = Integer.valueOf(zzfnVar.zzb());
                                                } else {
                                                    numValueOf3 = null;
                                                }
                                                zzgsVarZzk4.zzd("Evaluating filter. audience, filter, property", num4, numValueOf3, zzicVar.zzl().zzc(zzfnVar.zzc()));
                                                zzicVar.zzaW().zzk().zzb("Filter definition", this.zzg.zzp().zzk(zzfnVar));
                                            }
                                            if (zzfnVar.zza()) {
                                            }
                                            zzgs zzgsVarZze4 = zzicVar.zzaW().zze();
                                            Object objZzl4 = zzgu.zzl(this.zza);
                                            if (zzfnVar.zza()) {
                                                numValueOf2 = Integer.valueOf(zzfnVar.zzb());
                                            } else {
                                                numValueOf2 = null;
                                            }
                                            zzgsVarZze4.zzc("Invalid property filter ID. appId, id", objZzl4, String.valueOf(numValueOf2));
                                            this.zzb.add(num4);
                                            map5 = map6;
                                            aVar4 = aVar4;
                                            str6 = str6;
                                        } else {
                                            map6 = map5;
                                            str6 = str6;
                                            aVar4 = aVar4;
                                        }
                                        if (!zZzd) {
                                            this.zzb.add(num4);
                                        }
                                        map5 = map6;
                                        aVar4 = aVar4;
                                        str6 = str6;
                                        zzc(num4).zza(zzacVar);
                                        map5 = map6;
                                        aVar4 = aVar4;
                                        str6 = str6;
                                    }
                                }
                                it4 = it5;
                            }
                        }
                        arrayList2 = new ArrayList();
                        Set<Integer> setKeySet3 = this.zzc.keySet();
                        setKeySet3.removeAll(this.zzb);
                        while (r3.hasNext()) {
                            int iIntValue8 = num5.intValue();
                            zzy zzyVar3 = (zzy) this.zzc.get(num5);
                            Preconditions.checkNotNull(zzyVar3);
                            com.google.android.gms.internal.measurement.zzhg zzhgVarZzb3 = zzyVar3.zzb(iIntValue8);
                            arrayList2.add(zzhgVarZzb3);
                            zzawVarZzj = this.zzg.zzj();
                            str7 = this.zza;
                            com.google.android.gms.internal.measurement.zzii zziiVarZzc3 = zzhgVarZzb3.zzc();
                            zzawVarZzj.zzay();
                            zzawVarZzj.zzg();
                            Preconditions.checkNotEmpty(str7);
                            Preconditions.checkNotNull(zziiVarZzc3);
                            byte[] bArrZzcd3 = zziiVarZzc3.zzcd();
                            contentValues = new ContentValues();
                            contentValues.put(MBridgeConstans.APP_ID, str7);
                            contentValues.put(str5, num5);
                            contentValues.put("current_results", bArrZzcd3);
                            if (zzawVarZzj.zze().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                zzawVarZzj.zzu.zzaW().zzb().zzb("Failed to insert filter results (got -1). appId", zzgu.zzl(str7));
                            }
                        }
                        return arrayList2;
                    }
                } catch (Throwable th11) {
                    th = th11;
                    if (cursorQuery4 != null) {
                        cursorQuery4.close();
                    }
                    throw th;
                }
            } catch (SQLiteException e32) {
                e = e32;
                cursorQuery4 = null;
            } catch (Throwable th12) {
                th = th12;
                cursorQuery4 = null;
                if (cursorQuery4 != null) {
                    cursorQuery4.close();
                }
                throw th;
            }
        } else {
            map = map9;
        }
        zzaw zzawVarZzj9 = this.zzg.zzj();
        String str19 = this.zza;
        zzawVarZzj9.zzay();
        zzawVarZzj9.zzg();
        Preconditions.checkNotEmpty(str19);
        try {
            cursorQuery = zzawVarZzj9.zze().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{str19}, null, null, null);
            if (cursorQuery.moveToFirst()) {
                Map map19 = Collections.EMPTY_MAP;
                cursorQuery.close();
                map2 = map19;
                z12 = z11;
                str2 = DataSchemeDataSource.SCHEME_DATA;
                str14 = "audience_id";
            } else {
                aVar8 = new a();
                while (true) {
                    i13 = cursorQuery.getInt(0);
                    aVar8.put(Integer.valueOf(i13), (com.google.android.gms.internal.measurement.zzii) ((com.google.android.gms.internal.measurement.zzih) zzpk.zzw(com.google.android.gms.internal.measurement.zzii.zzj(), cursorQuery.getBlob(1))).zzbd());
                    z12 = z11;
                    str2 = str13;
                    if (!cursorQuery.moveToNext()) {
                        break;
                        break;
                    }
                    z11 = z12;
                    str13 = str2;
                    str14 = str14;
                }
                cursorQuery.close();
                map2 = aVar8;
            }
        } catch (SQLiteException e33) {
            e = e33;
            z12 = z11;
            str2 = DataSchemeDataSource.SCHEME_DATA;
            str14 = "audience_id";
            cursorQuery = null;
        } catch (Throwable th13) {
            th = th13;
            cursor = null;
        }
        if (!map2.isEmpty()) {
            hashSet = new HashSet(map2.keySet());
            if (z12) {
                String str110 = this.zza;
                zzaw zzawVarZzj10 = this.zzg.zzj();
                str3 = this.zza;
                zzawVarZzj10.zzay();
                zzawVarZzj10.zzg();
                Preconditions.checkNotEmpty(str3);
                aVar2 = new a();
                sQLiteDatabaseZze = zzawVarZzj10.zze();
                cursorRawQuery = sQLiteDatabaseZze.rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str3, str3});
                if (cursorRawQuery.moveToFirst()) {
                    do {
                        numValueOf = Integer.valueOf(cursorRawQuery.getInt(0));
                        arrayList = (List) aVar2.get(numValueOf);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            aVar2.put(numValueOf, arrayList);
                        }
                        arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                    } while (cursorRawQuery.moveToNext());
                } else {
                    aVar2 = Collections.EMPTY_MAP;
                }
                cursorRawQuery.close();
                Preconditions.checkNotEmpty(str110);
                Preconditions.checkNotNull(map2);
                aVar3 = new a();
                if (!map2.isEmpty()) {
                    it2 = map2.keySet().iterator();
                    while (it2.hasNext()) {
                        num = (Integer) it2.next();
                        num.intValue();
                        zziiVar3 = (com.google.android.gms.internal.measurement.zzii) map2.get(num);
                        list4 = (List) aVar2.get(num);
                        if (list4 != null || list4.isEmpty()) {
                            map4 = aVar2;
                            hashSet3 = hashSet;
                            it3 = it2;
                            aVar3.put(num, zziiVar3);
                            aVar2 = map4;
                            hashSet = hashSet3;
                            it2 = it3;
                        } else {
                            zzpg zzpgVar2 = this.zzg;
                            map4 = aVar2;
                            hashSet3 = hashSet;
                            List listZzq = zzpgVar2.zzp().zzq(zziiVar3.zzc(), list4);
                            if (listZzq.isEmpty()) {
                                aVar2 = map4;
                                hashSet = hashSet3;
                            } else {
                                com.google.android.gms.internal.measurement.zzih zzihVar = (com.google.android.gms.internal.measurement.zzih) zziiVar3.zzco();
                                zzihVar.zzd();
                                zzihVar.zzc(listZzq);
                                List listZzq2 = zzpgVar2.zzp().zzq(zziiVar3.zza(), list4);
                                zzihVar.zzb();
                                zzihVar.zza(listZzq2);
                                ArrayList arrayList6 = new ArrayList();
                                Iterator it12 = zziiVar3.zze().iterator();
                                while (it12.hasNext()) {
                                    Iterator it13 = it2;
                                    com.google.android.gms.internal.measurement.zzhq zzhqVar2 = (com.google.android.gms.internal.measurement.zzhq) it12.next();
                                    Iterator it14 = it12;
                                    if (!list4.contains(Integer.valueOf(zzhqVar2.zzb()))) {
                                        arrayList6.add(zzhqVar2);
                                    }
                                    it2 = it13;
                                    it12 = it14;
                                }
                                it3 = it2;
                                zzihVar.zzf();
                                zzihVar.zze(arrayList6);
                                ArrayList arrayList7 = new ArrayList();
                                for (com.google.android.gms.internal.measurement.zzik zzikVar2 : zziiVar3.zzh()) {
                                    if (!list4.contains(Integer.valueOf(zzikVar2.zzb()))) {
                                        arrayList7.add(zzikVar2);
                                    }
                                }
                                zzihVar.zzh();
                                zzihVar.zzg(arrayList7);
                                aVar3.put(num, (com.google.android.gms.internal.measurement.zzii) zzihVar.zzbd());
                                aVar2 = map4;
                                hashSet = hashSet3;
                                it2 = it3;
                            }
                        }
                    }
                }
                hashSet2 = hashSet;
                map3 = aVar3;
            } else {
                hashSet2 = hashSet;
                map3 = map2;
            }
            while (r16.hasNext()) {
                num3.intValue();
                zziiVar = (com.google.android.gms.internal.measurement.zzii) map3.get(num3);
                bitSet = new BitSet();
                bitSet2 = new BitSet();
                aVar = new a();
                if (zziiVar != null && zziiVar.zzf() != 0) {
                    while (r7.hasNext()) {
                        if (zzhqVar.zza()) {
                            Map map110 = map3;
                            Integer numValueOf10 = Integer.valueOf(zzhqVar.zzb());
                            if (zzhqVar.zzc()) {
                                lValueOf = Long.valueOf(zzhqVar.zzd());
                            } else {
                                lValueOf = null;
                            }
                            aVar.put(numValueOf10, lValueOf);
                            map3 = map110;
                        }
                    }
                }
                Map map111 = map3;
                a aVar13 = new a();
                if (zziiVar != null && zziiVar.zzi() != 0) {
                    it = zziiVar.zzh().iterator();
                    while (it.hasNext()) {
                        zzikVar = (com.google.android.gms.internal.measurement.zzik) it.next();
                        if (!zzikVar.zza() && zzikVar.zzd() > 0) {
                            aVar13.put(Integer.valueOf(zzikVar.zzb()), Long.valueOf(zzikVar.zze(zzikVar.zzd() - 1)));
                            it = it;
                            zziiVar = zziiVar;
                        }
                    }
                }
                zziiVar2 = zziiVar;
                if (zziiVar2 != null) {
                    i12 = 0;
                    while (i12 < zziiVar2.zzb() * 64) {
                        if (zzpk.zzn(zziiVar2.zza(), i12)) {
                            z13 = zZzp;
                            this.zzu.zzaW().zzk().zzc("Filter already evaluated. audience ID, filter ID", num3, Integer.valueOf(i12));
                            bitSet2.set(i12);
                            if (zzpk.zzn(zziiVar2.zzc(), i12)) {
                                bitSet.set(i12);
                            }
                            i12++;
                            zZzp = z13;
                        } else {
                            z13 = zZzp;
                        }
                        aVar.remove(Integer.valueOf(i12));
                        i12++;
                        zZzp = z13;
                    }
                }
                boolean z17 = zZzp;
                com.google.android.gms.internal.measurement.zzii zziiVar7 = (com.google.android.gms.internal.measurement.zzii) map2.get(num3);
                if (!zZzp2 && z17 && (list3 = (List) map.get(num3)) != null && this.zze != null && this.zzd != null) {
                    Iterator it15 = list3.iterator();
                    while (it15.hasNext()) {
                        com.google.android.gms.internal.measurement.zzff zzffVar9 = (com.google.android.gms.internal.measurement.zzff) it15.next();
                        int iZzb = zzffVar9.zzb();
                        Iterator it16 = it15;
                        long jLongValue = this.zze.longValue() / 1000;
                        if (zzffVar9.zzk()) {
                            jLongValue = this.zzd.longValue() / 1000;
                        }
                        Integer numValueOf11 = Integer.valueOf(iZzb);
                        if (aVar.containsKey(numValueOf11)) {
                            aVar.put(numValueOf11, Long.valueOf(jLongValue));
                        }
                        if (aVar13.containsKey(numValueOf11)) {
                            aVar13.put(numValueOf11, Long.valueOf(jLongValue));
                        }
                        it15 = it16;
                    }
                }
                this.zzc.put(num3, new zzy(this, this.zza, zziiVar7, bitSet, bitSet2, aVar, aVar13, null));
                str2 = str2;
                map = map;
                str14 = str14;
                map2 = map2;
                zZzp = z17;
                map3 = map111;
            }
        }
        str4 = str2;
        str5 = str14;
        str6 = "Skipping failed audience ID";
        if (!list.isEmpty()) {
            zzzVar = new zzz(this, null);
            aVar6 = new a();
            it7 = list.iterator();
            while (it7.hasNext()) {
                zzhsVar = (com.google.android.gms.internal.measurement.zzhs) it7.next();
                zzhsVarZza = zzzVar.zza(this.zza, zzhsVar);
                if (zzhsVarZza != null) {
                    zzpgVar = this.zzg;
                    zzbdVarZzah = zzpgVar.zzj().zzah(this.zza, zzhsVar, zzhsVarZza.zzd());
                    zzpgVar.zzj().zzh(zzbdVarZzah);
                    if (z10) {
                        j10 = zzbdVarZzah.zzc;
                        strZzd = zzhsVarZza.zzd();
                        map7 = (Map) aVar6.get(strZzd);
                        if (map7 == null) {
                            zzawVarZzj3 = zzpgVar.zzj();
                            str10 = this.zza;
                            zzawVarZzj3.zzay();
                            zzawVarZzj3.zzg();
                            Preconditions.checkNotEmpty(str10);
                            Preconditions.checkNotEmpty(strZzd);
                            aVar7 = new a();
                            str11 = str10;
                            cursorQuery3 = zzawVarZzj3.zze().query("event_filters", new String[]{str5, str4}, "app_id=? AND event_name=?", new String[]{str10, strZzd}, null, null, null);
                            if (cursorQuery3.moveToFirst()) {
                                zzbdVar = zzbdVarZzah;
                                while (true) {
                                    com.google.android.gms.internal.measurement.zzff zzffVar10 = (com.google.android.gms.internal.measurement.zzff) ((com.google.android.gms.internal.measurement.zzfe) zzpk.zzw(com.google.android.gms.internal.measurement.zzff.zzn(), cursorQuery3.getBlob(1))).zzbd();
                                    numValueOf5 = Integer.valueOf(cursorQuery3.getInt(0));
                                    list6 = (List) aVar7.get(numValueOf5);
                                    if (list6 == null) {
                                        cursor4 = cursorQuery3;
                                        arrayList4 = new ArrayList();
                                        aVar7.put(numValueOf5, arrayList4);
                                    } else {
                                        cursor4 = cursorQuery3;
                                        arrayList4 = list6;
                                    }
                                    arrayList4.add(zzffVar10);
                                    if (!cursor4.moveToNext()) {
                                        break;
                                        break;
                                    }
                                    cursorQuery3 = cursor4;
                                }
                                cursor4.close();
                                map7 = aVar7;
                            } else {
                                zzbdVar = zzbdVarZzah;
                                map7 = Collections.EMPTY_MAP;
                                cursorQuery3.close();
                            }
                            aVar6.put(strZzd, map7);
                        } else {
                            zzbdVar = zzbdVarZzah;
                        }
                        it8 = map7.keySet().iterator();
                        while (it8.hasNext()) {
                            num2 = (Integer) it8.next();
                            iIntValue = num2.intValue();
                            if (this.zzb.contains(num2)) {
                                this.zzu.zzaW().zzk().zzb("Skipping failed audience ID", num2);
                            } else {
                                it9 = ((List) map7.get(num2)).iterator();
                                zZzd2 = true;
                                while (true) {
                                    if (!it9.hasNext()) {
                                        map8 = map7;
                                        it10 = it8;
                                        j11 = j10;
                                        break;
                                    }
                                    com.google.android.gms.internal.measurement.zzff zzffVar11 = (com.google.android.gms.internal.measurement.zzff) it9.next();
                                    map8 = map7;
                                    it10 = it8;
                                    zzaaVar = new zzaa(this, this.zza, iIntValue, zzffVar11);
                                    j11 = j10;
                                    zZzd2 = zzaaVar.zzd(this.zzd, this.zze, zzhsVarZza, j11, zzbdVar, zzd(iIntValue, zzffVar11.zzb()));
                                    if (!zZzd2) {
                                        this.zzb.add(num2);
                                        break;
                                    }
                                    zzc(num2).zza(zzaaVar);
                                    j10 = j11;
                                    map7 = map8;
                                    it8 = it10;
                                }
                                if (!zZzd2) {
                                    this.zzb.add(num2);
                                }
                                j10 = j11;
                                map7 = map8;
                                it8 = it10;
                            }
                        }
                        it7 = it7;
                        zzzVar = zzzVar;
                    } else {
                        continue;
                    }
                }
            }
        }
        if (!z10) {
            return new ArrayList();
        }
        if (!list2.isEmpty()) {
            aVar4 = new a();
            it4 = list2.iterator();
            while (it4.hasNext()) {
                com.google.android.gms.internal.measurement.zziu zziuVar4 = (com.google.android.gms.internal.measurement.zziu) it4.next();
                strZzc = zziuVar4.zzc();
                map5 = (Map) aVar4.get(strZzc);
                if (map5 == null) {
                    zzawVarZzj2 = this.zzg.zzj();
                    str8 = this.zza;
                    zzawVarZzj2.zzay();
                    zzawVarZzj2.zzg();
                    Preconditions.checkNotEmpty(str8);
                    Preconditions.checkNotEmpty(strZzc);
                    aVar5 = new a();
                    cursorQuery2 = zzawVarZzj2.zze().query("property_filters", new String[]{str5, str4}, "app_id=? AND property_name=?", new String[]{str8, strZzc}, null, null, null);
                    if (cursorQuery2.moveToFirst()) {
                        while (true) {
                            com.google.android.gms.internal.measurement.zzfn zzfnVar5 = (com.google.android.gms.internal.measurement.zzfn) ((com.google.android.gms.internal.measurement.zzfm) zzpk.zzw(com.google.android.gms.internal.measurement.zzfn.zzj(), cursorQuery2.getBlob(1))).zzbd();
                            numValueOf4 = Integer.valueOf(cursorQuery2.getInt(0));
                            list5 = (List) aVar5.get(numValueOf4);
                            if (list5 == null) {
                                it5 = it4;
                                arrayList3 = new ArrayList();
                                aVar5.put(numValueOf4, arrayList3);
                            } else {
                                it5 = it4;
                                arrayList3 = list5;
                            }
                            arrayList3.add(zzfnVar5);
                            str9 = str8;
                            if (!cursorQuery2.moveToNext()) {
                                break;
                                break;
                            }
                            it4 = it5;
                            str8 = str9;
                        }
                        cursorQuery2.close();
                        map5 = aVar5;
                    } else {
                        it5 = it4;
                        map5 = Collections.EMPTY_MAP;
                        cursorQuery2.close();
                    }
                    aVar4.put(strZzc, map5);
                } else {
                    it5 = it4;
                }
                while (r4.hasNext()) {
                    int iIntValue9 = num4.intValue();
                    if (this.zzb.contains(num4)) {
                        this.zzu.zzaW().zzk().zzb(str6, num4);
                        break;
                        break;
                    }
                    it6 = ((List) map5.get(num4)).iterator();
                    zZzd = true;
                    while (true) {
                        if (it6.hasNext()) {
                            zzfnVar = (com.google.android.gms.internal.measurement.zzfn) it6.next();
                            zzicVar = this.zzu;
                            map6 = map5;
                            if (Log.isLoggable(zzicVar.zzaW().zzn(), 2)) {
                                zzgs zzgsVarZzk5 = zzicVar.zzaW().zzk();
                                if (zzfnVar.zza()) {
                                    numValueOf3 = Integer.valueOf(zzfnVar.zzb());
                                } else {
                                    numValueOf3 = null;
                                }
                                zzgsVarZzk5.zzd("Evaluating filter. audience, filter, property", num4, numValueOf3, zzicVar.zzl().zzc(zzfnVar.zzc()));
                                zzicVar.zzaW().zzk().zzb("Filter definition", this.zzg.zzp().zzk(zzfnVar));
                            }
                            if (zzfnVar.zza() || zzfnVar.zzb() > 256) {
                                zzgs zzgsVarZze5 = zzicVar.zzaW().zze();
                                Object objZzl5 = zzgu.zzl(this.zza);
                                if (zzfnVar.zza()) {
                                    numValueOf2 = Integer.valueOf(zzfnVar.zzb());
                                } else {
                                    numValueOf2 = null;
                                }
                                zzgsVarZze5.zzc("Invalid property filter ID. appId, id", objZzl5, String.valueOf(numValueOf2));
                                this.zzb.add(num4);
                                map5 = map6;
                                aVar4 = aVar4;
                                str6 = str6;
                            } else {
                                zzacVar = new zzac(this, this.zza, iIntValue9, zzfnVar);
                                zZzd = zzacVar.zzd(this.zzd, this.zze, zziuVar4, zzd(iIntValue9, zzfnVar.zzb()));
                                if (zZzd) {
                                    zzc(num4).zza(zzacVar);
                                    map5 = map6;
                                    aVar4 = aVar4;
                                    str6 = str6;
                                } else {
                                    this.zzb.add(num4);
                                }
                            }
                        } else {
                            map6 = map5;
                            str6 = str6;
                            aVar4 = aVar4;
                        }
                        if (!zZzd) {
                            this.zzb.add(num4);
                        }
                        map5 = map6;
                        aVar4 = aVar4;
                        str6 = str6;
                    }
                }
                it4 = it5;
            }
        }
        arrayList2 = new ArrayList();
        Set<Integer> setKeySet4 = this.zzc.keySet();
        setKeySet4.removeAll(this.zzb);
        while (r3.hasNext()) {
            int iIntValue10 = num5.intValue();
            zzy zzyVar4 = (zzy) this.zzc.get(num5);
            Preconditions.checkNotNull(zzyVar4);
            com.google.android.gms.internal.measurement.zzhg zzhgVarZzb4 = zzyVar4.zzb(iIntValue10);
            arrayList2.add(zzhgVarZzb4);
            zzawVarZzj = this.zzg.zzj();
            str7 = this.zza;
            com.google.android.gms.internal.measurement.zzii zziiVarZzc4 = zzhgVarZzb4.zzc();
            zzawVarZzj.zzay();
            zzawVarZzj.zzg();
            Preconditions.checkNotEmpty(str7);
            Preconditions.checkNotNull(zziiVarZzc4);
            byte[] bArrZzcd4 = zziiVarZzc4.zzcd();
            contentValues = new ContentValues();
            contentValues.put(MBridgeConstans.APP_ID, str7);
            contentValues.put(str5, num5);
            contentValues.put("current_results", bArrZzcd4);
            if (zzawVarZzj.zze().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                zzawVarZzj.zzu.zzaW().zzb().zzb("Failed to insert filter results (got -1). appId", zzgu.zzl(str7));
            }
        }
        return arrayList2;
    }

    @Override // com.google.android.gms.measurement.internal.zzos
    protected final boolean zzbc() {
        return false;
    }
}
