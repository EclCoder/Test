package ua;

import android.os.SystemClock;
import android.util.Pair;
import com.google.common.collect.i0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f54338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f54339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f54340c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Random f54341d;

    public b() {
        this(new Random());
    }

    private static void b(Object obj, long j10, Map map) {
        if (map.containsKey(obj)) {
            j10 = Math.max(j10, ((Long) r0.j((Long) map.get(obj))).longValue());
        }
        map.put(obj, Long.valueOf(j10));
    }

    private List c(List list) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        h(jElapsedRealtime, this.f54338a);
        h(jElapsedRealtime, this.f54339b);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            va.b bVar = (va.b) list.get(i10);
            if (!this.f54338a.containsKey(bVar.f55300b) && !this.f54339b.containsKey(Integer.valueOf(bVar.f55301c))) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int d(va.b bVar, va.b bVar2) {
        int iCompare = Integer.compare(bVar.f55301c, bVar2.f55301c);
        return iCompare != 0 ? iCompare : bVar.f55300b.compareTo(bVar2.f55300b);
    }

    public static int f(List list) {
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < list.size(); i10++) {
            hashSet.add(Integer.valueOf(((va.b) list.get(i10)).f55301c));
        }
        return hashSet.size();
    }

    private static void h(long j10, Map map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            if (((Long) entry.getValue()).longValue() <= j10) {
                arrayList.add(entry.getKey());
            }
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            map.remove(arrayList.get(i10));
        }
    }

    private va.b k(List list) {
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            i10 += ((va.b) list.get(i11)).f55302d;
        }
        int iNextInt = this.f54341d.nextInt(i10);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            va.b bVar = (va.b) list.get(i13);
            i12 += bVar.f55302d;
            if (iNextInt < i12) {
                return bVar;
            }
        }
        return (va.b) i0.d(list);
    }

    public void e(va.b bVar, long j10) {
        long jElapsedRealtime = SystemClock.elapsedRealtime() + j10;
        b(bVar.f55300b, jElapsedRealtime, this.f54338a);
        int i10 = bVar.f55301c;
        if (i10 != Integer.MIN_VALUE) {
            b(Integer.valueOf(i10), jElapsedRealtime, this.f54339b);
        }
    }

    public int g(List list) {
        HashSet hashSet = new HashSet();
        List listC = c(list);
        for (int i10 = 0; i10 < listC.size(); i10++) {
            hashSet.add(Integer.valueOf(((va.b) listC.get(i10)).f55301c));
        }
        return hashSet.size();
    }

    public void i() {
        this.f54338a.clear();
        this.f54339b.clear();
        this.f54340c.clear();
    }

    public va.b j(List list) {
        List listC = c(list);
        if (listC.size() < 2) {
            return (va.b) i0.c(listC, null);
        }
        Collections.sort(listC, new Comparator() { // from class: ua.a
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return b.d((va.b) obj, (va.b) obj2);
            }
        });
        ArrayList arrayList = new ArrayList();
        int i10 = ((va.b) listC.get(0)).f55301c;
        for (int i11 = 0; i11 < listC.size(); i11++) {
            va.b bVar = (va.b) listC.get(i11);
            if (i10 != bVar.f55301c) {
                if (arrayList.size() != 1) {
                    break;
                }
                return (va.b) listC.get(0);
            }
            arrayList.add(new Pair(bVar.f55300b, Integer.valueOf(bVar.f55302d)));
        }
        va.b bVar2 = (va.b) this.f54340c.get(arrayList);
        if (bVar2 != null) {
            return bVar2;
        }
        va.b bVarK = k(listC.subList(0, arrayList.size()));
        this.f54340c.put(arrayList, bVarK);
        return bVarK;
    }

    b(Random random) {
        this.f54340c = new HashMap();
        this.f54341d = random;
        this.f54338a = new HashMap();
        this.f54339b = new HashMap();
    }
}
