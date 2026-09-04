package r3;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f51019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f51020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f51021c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f51022d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f51023e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g f51024f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String[] f51025g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f51026h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f51027i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final c f51028j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final HashMap f51029k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final HashMap f51030l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private List f51031m;

    private c(String str, String str2, long j10, long j11, g gVar, String[] strArr, String str3, String str4, c cVar) {
        this.f51019a = str;
        this.f51020b = str2;
        this.f51027i = str4;
        this.f51024f = gVar;
        this.f51025g = strArr;
        this.f51021c = str2 != null;
        this.f51022d = j10;
        this.f51023e = j11;
        this.f51026h = (String) w1.a.e(str3);
        this.f51028j = cVar;
        this.f51029k = new HashMap();
        this.f51030l = new HashMap();
    }

    private void b(Map map, v1.a.b bVar, int i10, int i11, int i12) {
        g gVarF = f.f(this.f51024f, this.f51025g, map);
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) bVar.e();
        if (spannableStringBuilder == null) {
            spannableStringBuilder = new SpannableStringBuilder();
            bVar.o(spannableStringBuilder);
        }
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        if (gVarF != null) {
            f.a(spannableStringBuilder2, i10, i11, gVarF, this.f51028j, map, i12);
            if (TtmlNode.TAG_P.equals(this.f51019a)) {
                if (gVarF.k() != Float.MAX_VALUE) {
                    bVar.m((gVarF.k() * (-90.0f)) / 100.0f);
                }
                if (gVarF.m() != null) {
                    bVar.p(gVarF.m());
                }
                if (gVarF.h() != null) {
                    bVar.j(gVarF.h());
                }
            }
        }
    }

    public static c c(String str, long j10, long j11, g gVar, String[] strArr, String str2, String str3, c cVar) {
        return new c(str, null, j10, j11, gVar, strArr, str2, str3, cVar);
    }

    public static c d(String str) {
        return new c(null, f.b(str), C.TIME_UNSET, C.TIME_UNSET, null, null, "", null, null);
    }

    private static void e(SpannableStringBuilder spannableStringBuilder) {
        for (a aVar : (a[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), a.class)) {
            spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(aVar), spannableStringBuilder.getSpanEnd(aVar), "");
        }
        for (int i10 = 0; i10 < spannableStringBuilder.length(); i10++) {
            if (spannableStringBuilder.charAt(i10) == ' ') {
                int i11 = i10 + 1;
                int i12 = i11;
                while (i12 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i12) == ' ') {
                    i12++;
                }
                int i13 = i12 - i11;
                if (i13 > 0) {
                    spannableStringBuilder.delete(i10, i13 + i10);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
            spannableStringBuilder.delete(0, 1);
        }
        for (int i14 = 0; i14 < spannableStringBuilder.length() - 1; i14++) {
            if (spannableStringBuilder.charAt(i14) == '\n') {
                int i15 = i14 + 1;
                if (spannableStringBuilder.charAt(i15) == ' ') {
                    spannableStringBuilder.delete(i15, i14 + 2);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
            spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
        }
        for (int i16 = 0; i16 < spannableStringBuilder.length() - 1; i16++) {
            if (spannableStringBuilder.charAt(i16) == ' ') {
                int i17 = i16 + 1;
                if (spannableStringBuilder.charAt(i17) == '\n') {
                    spannableStringBuilder.delete(i16, i17);
                }
            }
        }
        if (spannableStringBuilder.length() <= 0 || spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != '\n') {
            return;
        }
        spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
    }

    private void i(TreeSet treeSet, boolean z10) {
        boolean zEquals = TtmlNode.TAG_P.equals(this.f51019a);
        boolean zEquals2 = TtmlNode.TAG_DIV.equals(this.f51019a);
        if (z10 || zEquals || (zEquals2 && this.f51027i != null)) {
            long j10 = this.f51022d;
            if (j10 != C.TIME_UNSET) {
                treeSet.add(Long.valueOf(j10));
            }
            long j11 = this.f51023e;
            if (j11 != C.TIME_UNSET) {
                treeSet.add(Long.valueOf(j11));
            }
        }
        if (this.f51031m == null) {
            return;
        }
        for (int i10 = 0; i10 < this.f51031m.size(); i10++) {
            ((c) this.f51031m.get(i10)).i(treeSet, z10 || zEquals);
        }
    }

    private static SpannableStringBuilder k(String str, Map map) {
        if (!map.containsKey(str)) {
            v1.a.b bVar = new v1.a.b();
            bVar.o(new SpannableStringBuilder());
            map.put(str, bVar);
        }
        return (SpannableStringBuilder) w1.a.e(((v1.a.b) map.get(str)).e());
    }

    private void n(long j10, String str, List list) {
        if (!"".equals(this.f51026h)) {
            str = this.f51026h;
        }
        if (m(j10) && TtmlNode.TAG_DIV.equals(this.f51019a) && this.f51027i != null) {
            list.add(new Pair(str, this.f51027i));
            return;
        }
        for (int i10 = 0; i10 < g(); i10++) {
            f(i10).n(j10, str, list);
        }
    }

    private void o(long j10, Map map, Map map2, String str, Map map3) {
        if (m(j10)) {
            String str2 = "".equals(this.f51026h) ? str : this.f51026h;
            Iterator it = this.f51030l.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str3 = (String) entry.getKey();
                int iIntValue = this.f51029k.containsKey(str3) ? ((Integer) this.f51029k.get(str3)).intValue() : 0;
                int iIntValue2 = ((Integer) entry.getValue()).intValue();
                if (iIntValue != iIntValue2) {
                    b(map, (v1.a.b) w1.a.e((v1.a.b) map3.get(str3)), iIntValue, iIntValue2, ((e) w1.a.e((e) map2.get(str2))).f51055j);
                }
            }
            for (int i10 = 0; i10 < g(); i10++) {
                f(i10).o(j10, map, map2, str2, map3);
            }
        }
    }

    private void p(long j10, boolean z10, String str, Map map) {
        this.f51029k.clear();
        this.f51030l.clear();
        if (TtmlNode.TAG_METADATA.equals(this.f51019a)) {
            return;
        }
        if (!"".equals(this.f51026h)) {
            str = this.f51026h;
        }
        String str2 = str;
        if (this.f51021c && z10) {
            k(str2, map).append((CharSequence) w1.a.e(this.f51020b));
            return;
        }
        if (TtmlNode.TAG_BR.equals(this.f51019a) && z10) {
            k(str2, map).append('\n');
            return;
        }
        if (m(j10)) {
            for (Map.Entry entry : map.entrySet()) {
                this.f51029k.put((String) entry.getKey(), Integer.valueOf(((CharSequence) w1.a.e(((v1.a.b) entry.getValue()).e())).length()));
            }
            boolean zEquals = TtmlNode.TAG_P.equals(this.f51019a);
            int i10 = 0;
            while (i10 < g()) {
                f(i10).p(j10, z10 || zEquals, str2, map);
                i10++;
                j10 = j10;
                map = map;
            }
            Map map2 = map;
            if (zEquals) {
                f.c(k(str2, map2));
            }
            for (Map.Entry entry2 : map2.entrySet()) {
                this.f51030l.put((String) entry2.getKey(), Integer.valueOf(((CharSequence) w1.a.e(((v1.a.b) entry2.getValue()).e())).length()));
            }
        }
    }

    public void a(c cVar) {
        if (this.f51031m == null) {
            this.f51031m = new ArrayList();
        }
        this.f51031m.add(cVar);
    }

    public c f(int i10) {
        List list = this.f51031m;
        if (list != null) {
            return (c) list.get(i10);
        }
        throw new IndexOutOfBoundsException();
    }

    public int g() {
        List list = this.f51031m;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public List h(long j10, Map map, Map map2, Map map3) {
        ArrayList arrayList = new ArrayList();
        n(j10, this.f51026h, arrayList);
        TreeMap treeMap = new TreeMap();
        p(j10, false, this.f51026h, treeMap);
        o(j10, map, map2, this.f51026h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Pair pair = (Pair) obj;
            String str = (String) map3.get(pair.second);
            if (str != null) {
                byte[] bArrDecode = Base64.decode(str, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                e eVar = (e) w1.a.e((e) map2.get(pair.first));
                arrayList2.add(new v1.a.b().f(bitmapDecodeByteArray).k(eVar.f51047b).l(0).h(eVar.f51048c, 0).i(eVar.f51050e).n(eVar.f51051f).g(eVar.f51052g).r(eVar.f51055j).a());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            e eVar2 = (e) w1.a.e((e) map2.get(entry.getKey()));
            v1.a.b bVar = (v1.a.b) entry.getValue();
            e((SpannableStringBuilder) w1.a.e(bVar.e()));
            bVar.h(eVar2.f51048c, eVar2.f51049d);
            bVar.i(eVar2.f51050e);
            bVar.k(eVar2.f51047b);
            bVar.n(eVar2.f51051f);
            bVar.q(eVar2.f51054i, eVar2.f51053h);
            bVar.r(eVar2.f51055j);
            arrayList2.add(bVar.a());
        }
        return arrayList2;
    }

    public long[] j() {
        TreeSet treeSet = new TreeSet();
        int i10 = 0;
        i(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i10] = ((Long) it.next()).longValue();
            i10++;
        }
        return jArr;
    }

    public String[] l() {
        return this.f51025g;
    }

    public boolean m(long j10) {
        long j11 = this.f51022d;
        if (j11 == C.TIME_UNSET && this.f51023e == C.TIME_UNSET) {
            return true;
        }
        if (j11 <= j10 && this.f51023e == C.TIME_UNSET) {
            return true;
        }
        if (j11 != C.TIME_UNSET || j10 >= this.f51023e) {
            return j11 <= j10 && j10 < this.f51023e;
        }
        return true;
    }
}
